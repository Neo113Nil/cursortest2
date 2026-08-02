package com.yandex.plus.bdui.plus.webview;

import android.webkit.JavascriptInterface;
import defpackage.bqi;
import defpackage.vdr;
import defpackage.xdr;

/* loaded from: classes4.dex */
public final class o extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.api.contract.j, com.yandex.plus.webview.core.javascript.a {
    public final /* synthetic */ com.yandex.plus.webview.api.contract.k b;
    public final com.yandex.plus.log.api.b c;
    public final String d;

    public o(com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.b = new com.yandex.plus.webview.api.contract.k();
        this.c = bVar;
        this.d = "readyManager";
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return this.d;
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void h() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "OnReadyContract", "onLoadStart(); reset ready state");
        }
        bqi b = this.b.b();
        Boolean bool = Boolean.FALSE;
        xdr xdrVar = (xdr) b;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @JavascriptInterface
    public final void onReady() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "OnReadyContract", "onReady(); set ready state");
        }
        this.b.c();
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return this.b.b();
    }
}
