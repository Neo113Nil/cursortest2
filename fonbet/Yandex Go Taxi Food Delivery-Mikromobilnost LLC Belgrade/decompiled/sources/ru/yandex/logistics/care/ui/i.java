package ru.yandex.logistics.care.ui;

import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.bm41;
import defpackage.bt8;
import defpackage.cn41;
import defpackage.cvu0;
import defpackage.ds31;
import defpackage.er8;
import defpackage.et8;
import defpackage.geh;
import defpackage.gr8;
import defpackage.or8;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tq8;
import defpackage.w511;
import defpackage.xt8;
import defpackage.yt8;
import defpackage.zt8;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes4.dex */
public final class i implements bm41 {
    public final /* synthetic */ l a;
    public final /* synthetic */ or8 b;
    public final /* synthetic */ ru.yandex.taxi.logistics.care.impl.router.e c;

    public i(or8 or8Var, l lVar, ru.yandex.taxi.logistics.care.impl.router.e eVar) {
        this.a = lVar;
        this.b = or8Var;
        this.c = eVar;
    }

    @Override // defpackage.bm41
    public final void b(boolean z) {
        geh.a(this.a.A, "WebView Http Error received");
    }

    @Override // defpackage.bm41
    public final void e(String str) {
        l lVar = this.a;
        if (cvu0.x(((bt8) lVar.C.getValue()).a, str, false)) {
            long currentTimeMillis = System.currentTimeMillis();
            xt8 a = xt8.a(lVar.D, 0L, currentTimeMillis, 0L, 11);
            lVar.D = a;
            this.b.k(new tq8(currentTimeMillis - a.a));
        }
    }

    @Override // defpackage.bm41
    public final void f() {
        l lVar = this.a;
        lVar.E = c.a(lVar.E, CareWebViewViewModelImpl$SdkCloseType.NATIVE_BUTTON);
        this.c.a();
    }

    @Override // defpackage.bm41
    public final void g(cn41 cn41Var) {
        l lVar = this.a;
        r0 r0Var = lVar.J;
        lVar.I = 0;
        pzt0 pzt0Var = lVar.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = lVar.G;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        if (r0Var.getValue() instanceof yt8) {
            tje.N(ds31.a(lVar), null, null, new CareWebViewViewModelImpl$createWebViewCallback$1$onReload$1(null, lVar), 3);
        } else {
            lVar.G = tje.N(ds31.a(lVar), null, null, new CareWebViewViewModelImpl$createWebViewCallback$1$onReload$2(cn41Var, lVar, this, null), 3);
        }
        zt8 zt8Var = new zt8(WebViewState.LOADING);
        r0Var.getClass();
        r0Var.m(null, zt8Var);
        lVar.D = new xt8(System.currentTimeMillis(), 14);
    }

    @Override // defpackage.bm41
    public final void i(PermissionRequest permissionRequest) {
        this.c.b(permissionRequest);
    }

    @Override // defpackage.bm41
    public final void j(String str, boolean z) {
        if (z) {
            this.b.k(new gr8("Network", str));
        }
    }

    @Override // defpackage.bm41
    public final void l(boolean z) {
        l lVar = this.a;
        if (z) {
            l.c0(lVar);
        } else {
            geh.a(lVar.A, "WebView Unauthorized Http Error received for non main frame");
        }
    }

    @Override // defpackage.bm41
    public final void m(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.c.c(webView, valueCallback, fileChooserParams);
    }

    @Override // defpackage.bm41
    public final void onFinish() {
    }

    @Override // defpackage.bm41
    public final void onStart() {
        l lVar = this.a;
        r0 r0Var = lVar.Q;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        r0 r0Var2 = lVar.J;
        zt8 zt8Var = new zt8(WebViewState.LOADING);
        r0Var2.getClass();
        r0Var2.m(null, zt8Var);
        et8 et8Var = lVar.c.a.a;
        if (et8Var == null) {
            w511.b();
            return;
        }
        er8 er8Var = new er8(et8Var.a);
        or8 or8Var = this.b;
        or8Var.k(er8Var);
        pzt0 pzt0Var = lVar.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        lVar.F = tje.N(ds31.a(lVar), null, null, new CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1(lVar, "Loading timeout exceeded", or8Var, null), 3);
    }
}
