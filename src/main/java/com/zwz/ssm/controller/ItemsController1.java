package com.zwz.ssm.controller;
import com.zwz.ssm.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class ItemsController1  implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //调用service查找数据库，查询商品列表，这里使用静态数据模拟
        List<Items> itemsList = new ArrayList<Items>();
        //向list中填充静态数据
        Items items1_1 = new Items();
        items1_1.setName("联想笔记本");
        items1_1.setPrice(6000f);
        items1_1.setDetail("ThinkPad T340 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items1_1);
        itemsList.add(items_2);
        //返回ModeAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute，在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList",itemsList);
        //指定视图
        modelAndView.setViewName("WEB-INF/jsp/items/itemsList.jsp");


        return modelAndView;
    }
}
