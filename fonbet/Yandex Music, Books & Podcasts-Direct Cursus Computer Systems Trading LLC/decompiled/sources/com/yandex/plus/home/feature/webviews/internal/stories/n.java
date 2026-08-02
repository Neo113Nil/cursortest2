package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;

/* loaded from: classes5.dex */
public final class n implements com.yandex.plus.home.feature.webviews.internal.webview.h {
    public final /* synthetic */ p a;

    public /* synthetic */ n(p pVar) {
        this.a = pVar;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void c() {
        k kVar = this.a.a;
        kVar.i0("loading timeout", kVar.B0.g);
        kVar.p.d(kVar.Y.a, kVar.h.c.c);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void d(o3 o3Var) {
        o3Var.getClass();
        this.a.a.j0(o3Var);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void e(x2 x2Var) {
        com.yandex.plus.home.feature.webviews.internal.stories.contract.c webViewController;
        x2Var.getClass();
        p pVar = this.a;
        k kVar = pVar.a;
        webViewController = pVar.getWebViewController();
        com.yandex.plus.home.feature.webviews.internal.simple.d dVar = new com.yandex.plus.home.feature.webviews.internal.simple.d(1, webViewController, com.yandex.plus.home.feature.webviews.internal.stories.contract.c.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0, 18);
        kVar.getClass();
        kVar.B0.f(x2Var, dVar);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void f(String str) {
        str.getClass();
        k kVar = this.a.a;
        kVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.container.d dVar = kVar.w;
        dVar.getClass();
        dVar.a.a(new com.yandex.plus.home.api.state.b(str));
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void i(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        k kVar = this.a.a;
        j jVar = kVar.G0;
        String str = kVar.y;
        jVar.getClass();
        str.getClass();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void j(String str, String str2, boolean z) {
        k kVar = this.a.a;
        kVar.getClass();
        kVar.i0(str, str2);
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void l(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        k kVar = this.a.a;
        j jVar = kVar.G0;
        String str = kVar.y;
        jVar.getClass();
        str.getClass();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void m() {
        this.a.a.k0();
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.webview.h
    public void o() {
        this.a.n(true);
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
