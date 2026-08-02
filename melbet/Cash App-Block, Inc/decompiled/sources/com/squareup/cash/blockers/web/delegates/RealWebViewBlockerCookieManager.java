package com.squareup.cash.blockers.web.delegates;

import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.webview.android.AndroidCookieManager;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class RealWebViewBlockerCookieManager implements WebViewBlockerCookieManager {
    public final AndroidClock clock;
    public final ConcurrentHashMap cookieExpiryTimes = new ConcurrentHashMap();
    public final AndroidCookieManager cookieManager;

    public RealWebViewBlockerCookieManager(AndroidCookieManager androidCookieManager, AndroidClock androidClock) {
        this.cookieManager = androidCookieManager;
        this.clock = androidClock;
    }
}
