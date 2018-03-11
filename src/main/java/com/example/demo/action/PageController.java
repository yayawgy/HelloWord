package com.example.demo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/3/11.
 */

@RestController
@RequestMapping("/demo")
public class PageController {

    @RequestMapping("/hello")
    public String actionTest(){
        return "hello word !!!";
    }

}
