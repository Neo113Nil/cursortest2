package com.yandex.passport.internal.warm;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebViewClient;
import com.yandex.passport.api.b2;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.n;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.network.h;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.m1;
import com.yandex.passport.internal.report.sd;
import com.yandex.passport.internal.report.td;
import defpackage.dfi;
import defpackage.hq0;
import defpackage.xqn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class WarmUpWebViewActivity extends hq0 {
    public static final /* synthetic */ int b = 0;
    public m1 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.yandex.passport.internal.warm.c, java.lang.Object, java.lang.Runnable] */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("environment_integer_key", 1);
        com.yandex.passport.common.core.b.b.getClass();
        com.yandex.passport.common.core.b b2 = com.yandex.passport.common.core.a.b(intExtra);
        Intent intent = getIntent();
        intent.getClass();
        long longExtra = intent.getLongExtra("time_out_for_closing_web_view", 30000L);
        final long j = (1000 > longExtra || longExtra >= 120001) ? 30000L : longExtra;
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.a = a.getWarmUpWebViewReporter();
        h hVar = (h) a.getUrlDispatcher();
        hVar.getClass();
        String i = hVar.i(b2, b2.c, n.b);
        if (i == null) {
            i = h.n(b2, null, "/auth");
        }
        final b aVar = ((Boolean) a.getFlagRepository().b(o.a0)).booleanValue() ? new a(this) : new g(this);
        setContentView(aVar.getTheRootView());
        Handler handler = new Handler(getMainLooper());
        final xqn xqnVar = new xqn();
        xqn xqnVar2 = new xqn();
        e eVar = new e(this, aVar, xqnVar2, xqnVar, handler);
        getApplication().registerActivityLifecycleCallbacks(eVar);
        xqnVar.a = eVar;
        ?? r5 = new Runnable() { // from class: com.yandex.passport.internal.warm.c
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = WarmUpWebViewActivity.b;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, dfi.e(j, "WebView onDestroy after loading ", " ms"), 8);
                }
                WarmUpWebViewActivity warmUpWebViewActivity = WarmUpWebViewActivity.this;
                m1 m1Var = warmUpWebViewActivity.a;
                if (m1Var == null) {
                    Intrinsics.j("reporter");
                    throw null;
                }
                m1Var.p(sd.d);
                aVar.getWarmWebView().destroy();
                warmUpWebViewActivity.getApplication().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) xqnVar.a);
            }
        };
        xqnVar2.a = r5;
        aVar.getWarmWebView().setWebViewClient(new WebViewClient());
        aVar.getWarmWebView().setWebChromeClient(new d(this, handler, r5, xqnVar));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "WebView load url ".concat(i), 8);
        }
        aVar.getWarmWebView().loadUrl(i);
        m1 m1Var = this.a;
        if (m1Var == null) {
            Intrinsics.j("reporter");
            throw null;
        }
        m1Var.p(td.d);
        handler.postDelayed(r5, j);
        finish();
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m1 m1Var = this.a;
        if (m1Var != null) {
            m1Var.p(pd.d);
        } else {
            Intrinsics.j("reporter");
            throw null;
        }
    }
}
