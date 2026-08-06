package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0756t1;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0756t1 f7294a;

    public AppMetricaJsInterface(C0756t1 c0756t1) {
        this.f7294a = c0756t1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f7294a.d(str, str2);
    }
}
