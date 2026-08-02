package com.knotapi.knot.utilities;

import android.webkit.CookieManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.knotapi.knot.interfaces.CookieBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class WebViewCookieCollector {
    private final CookieBuilder cookieBuilder;

    public WebViewCookieCollector(CookieBuilder cookieBuilder) {
        this.cookieBuilder = cookieBuilder;
    }

    public Map<String, String> collectAllCookies(WebView webView, String str) {
        String cookie;
        String cookie2;
        HashMap hashMap = new HashMap();
        CookieManager cookieManager = CookieManager.getInstance();
        if (str != null && (cookie2 = cookieManager.getCookie(str)) != null) {
            hashMap.put(str, cookie2);
        }
        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
        for (int i = 0; i < copyBackForwardList.getSize(); i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            String url = itemAtIndex.getUrl();
            String cookie3 = cookieManager.getCookie(url);
            if (cookie3 != null) {
                hashMap.put(url, cookie3);
            }
            String originalUrl = itemAtIndex.getOriginalUrl();
            if (originalUrl != null && !originalUrl.equals(url) && (cookie = cookieManager.getCookie(originalUrl)) != null) {
                hashMap.put(originalUrl, cookie);
            }
        }
        return hashMap;
    }

    public List<Cookie> getAllCookiesAsList(WebView webView, String str) {
        Map<String, String> collectAllCookies = collectAllCookies(webView, str);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : collectAllCookies.entrySet()) {
            String key = entry.getKey();
            for (String str2 : entry.getValue().split(";")) {
                Cookie buildCookie = this.cookieBuilder.buildCookie(str2, key);
                if (buildCookie != null) {
                    arrayList.add(buildCookie);
                }
            }
        }
        return Cookie.mergeAll(new ArrayList(), arrayList);
    }
}
