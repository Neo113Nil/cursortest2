package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.ui.challenge.c0;
import defpackage.cs1;
import defpackage.fft;
import defpackage.jw;
import defpackage.ldg;
import defpackage.t13;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class g extends t13 {
    public final j l;
    public final Activity m;
    public final f n;
    public final o0 o;
    public final d p;

    public g(j jVar, Activity activity, f fVar, o0 o0Var, d dVar) {
        jVar.getClass();
        activity.getClass();
        fVar.getClass();
        o0Var.getClass();
        dVar.getClass();
        this.l = jVar;
        this.m = activity;
        this.n = fVar;
        this.o = o0Var;
        this.p = dVar;
    }

    @Override // defpackage.orq, defpackage.srq
    public final void a() {
        this.l.g.onPause();
        super.a();
    }

    @Override // defpackage.orq
    public final void i(Bundle bundle) {
        if (bundle != null) {
            this.l.g.restoreState(bundle);
            j jVar = this.n.a;
            jVar.h.setVisibility(8);
            jVar.e.setVisibility(8);
            WebView webView = jVar.g;
            webView.setVisibility(0);
            webView.requestFocus();
        }
    }

    @Override // defpackage.orq
    public final void k() {
        j jVar = this.l;
        ConstraintLayout e = jVar.e();
        WebView webView = jVar.g;
        e.removeView(webView);
        webView.destroy();
        super.k();
    }

    @Override // defpackage.orq
    public final void l(Bundle bundle) {
        this.l.g.saveState(bundle);
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    @Override // defpackage.orq, defpackage.srq
    public final void onResume() {
        super.onResume();
        this.l.g.onResume();
    }

    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        c0 c0Var = (c0) obj;
        e eVar = new e(this.m, c0Var, this.n, this.o, this.p);
        j jVar = this.l;
        WebView webView = jVar.g;
        webView.setWebViewClient(eVar);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString(settings.getUserAgentString() + ' ' + com.yandex.passport.common.web.b.b);
        settings.setDomStorageEnabled(true);
        webView.setLayerType(1, null);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        View findViewById = jVar.h.findViewById(R.id.button_retry);
        findViewById.getClass();
        ldg.B((Button) findViewById, new jw(eVar, this, jVar, null, 5));
        String str = c0Var.c;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Open url: " + ((Object) com.yandex.passport.common.url.b.m(str)), 8);
        }
        jVar.g.loadUrl(str);
        return Unit.a;
    }
}
