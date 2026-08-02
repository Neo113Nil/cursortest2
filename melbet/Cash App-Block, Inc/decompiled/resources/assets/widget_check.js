//This snippet of code is used to check if the widget either cart scraper or mobile widget was previously injected.
//This was introduced as a result of sj.se injecting the cart scraper multiple times and since we weren't clearing the mutation listeners; it was causing the page to behave incorrectly.
//(https://trello.com/c/uG2XrwrA/1553-klarnasvtop23-cart-scraper-doesnt-work-on-sjse-consistently)
//For implementation details see -> com.fillr.browsersdk.model.FillrWidget
(function injectFillrWidget(widgetType){
    var injectWidget = false;
    if((typeof PopWidgetInterface =='undefined' && widgetType == 'MOBILE') || (typeof FillrCartInformationExtractionInterface =='undefined' && widgetType == 'CART_SCRAPER')) {
        injectWidget = false;
    } else {
        injectWidget = true;
    }
    if (typeof FillrAndroidWidget != 'undefined' && widgetType == 'MOBILE'){
        FillrAndroidWidget.injectFillrAndroidWidget(injectWidget);
    }
    if (typeof FillrAndroidWidgetCS != 'undefined' && widgetType == 'CART_SCRAPER'){
        FillrAndroidWidgetCS.injectFillrAndroidCartScraper(injectWidget);
    }
})('you need to pass the widget type');