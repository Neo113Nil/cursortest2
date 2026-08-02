package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.J1;

/* loaded from: classes4.dex */
public class AppMetricaInitializerJsInterface {
    private final J1 a;

    public AppMetricaInitializerJsInterface(J1 j1) {
        this.a = j1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.a.c(str);
    }
}
