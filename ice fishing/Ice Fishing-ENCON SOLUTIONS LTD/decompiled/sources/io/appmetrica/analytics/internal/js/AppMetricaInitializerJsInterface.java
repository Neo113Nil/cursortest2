package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0756t1;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0756t1 f7293a;

    public AppMetricaInitializerJsInterface(C0756t1 c0756t1) {
        this.f7293a = c0756t1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f7293a.c(str);
    }
}
