package com.yandex.passport.internal.warm;

import android.app.Application;
import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yandex.passport.internal.report.qd;
import com.yandex.passport.internal.report.reporters.m1;
import defpackage.xqn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends WebChromeClient {
    public final /* synthetic */ WarmUpWebViewActivity a;
    public final /* synthetic */ Handler b;
    public final /* synthetic */ c c;
    public final /* synthetic */ xqn d;

    public d(WarmUpWebViewActivity warmUpWebViewActivity, Handler handler, c cVar, xqn xqnVar) {
        this.a = warmUpWebViewActivity;
        this.b = handler;
        this.c = cVar;
        this.d = xqnVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        webView.getClass();
        super.onProgressChanged(webView, i);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onProgress load url: " + i, 8);
        }
        if (i == 100) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "WebView onDestroy", 8);
            }
            WarmUpWebViewActivity warmUpWebViewActivity = this.a;
            m1 m1Var = warmUpWebViewActivity.a;
            if (m1Var == null) {
                Intrinsics.j("reporter");
                throw null;
            }
            m1Var.p(qd.d);
            webView.destroy();
            this.b.removeCallbacks(this.c);
            warmUpWebViewActivity.getApplication().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.d.a);
        }
    }
}
