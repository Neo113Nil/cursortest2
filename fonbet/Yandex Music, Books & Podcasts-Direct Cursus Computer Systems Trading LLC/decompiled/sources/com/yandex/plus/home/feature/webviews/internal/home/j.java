package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import defpackage.xdr;

/* loaded from: classes5.dex */
public final class j implements com.yandex.plus.home.feature.webviews.internal.webview.h {
    public final /* synthetic */ k a;

    public /* synthetic */ j(k kVar) {
        this.a = kVar;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void c() {
        this.a.a.j0();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void d(o3 o3Var) {
        o3Var.getClass();
        this.a.a.i0(o3Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void e(x2 x2Var) {
        com.yandex.plus.home.feature.webviews.internal.home.contract.c webViewController;
        x2Var.getClass();
        k kVar = this.a;
        g gVar = kVar.a;
        webViewController = kVar.getWebViewController();
        com.yandex.plus.core.debug.panel.internal.presentation.controller.a aVar = new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, webViewController, com.yandex.plus.home.feature.webviews.internal.home.contract.c.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 19);
        gVar.getClass();
        gVar.F0.f(x2Var, aVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void f(String str) {
        str.getClass();
        g gVar = this.a.a;
        gVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.container.d dVar = gVar.o;
        dVar.getClass();
        dVar.a.a(new com.yandex.plus.home.api.state.b(str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void i(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        g gVar = this.a.a;
        gVar.z.b(gVar.C, bVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void j(String str, String str2, boolean z) {
        g gVar = this.a.a;
        gVar.getClass();
        if (gVar.y == com.yandex.plus.core.config.a.a && z) {
            ((a) gVar.e).q();
        }
        gVar.k0(str, str2);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void l(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        g gVar = this.a.a;
        gVar.z.c(gVar.C, bVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void m() {
        g gVar = this.a.a;
        ((a) gVar.e).s();
        ((com.yandex.plus.home.feature.webviews.internal.purchase.pay.a) gVar.I0.getValue()).getClass();
        gVar.B0 = true;
        gVar.C0.l();
        xdr xdrVar = gVar.h0().g;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void o() {
        this.a.dismiss();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void p(String str) {
        this.a.h(str);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void q(int i) {
        this.a.f(i);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void r(String str) {
        this.a.c(str);
    }
}
