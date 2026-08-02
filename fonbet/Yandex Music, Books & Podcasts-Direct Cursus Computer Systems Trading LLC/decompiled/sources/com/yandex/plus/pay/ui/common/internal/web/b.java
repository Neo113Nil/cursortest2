package com.yandex.plus.pay.ui.common.internal.web;

import defpackage.gdk;

/* loaded from: classes5.dex */
public final class b implements com.yandex.plus.webview.api.security.b {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public b(com.yandex.plus.pay.ui.core.mobile.domain.a aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    @Override // com.yandex.plus.webview.api.security.b
    public final void o(com.yandex.plus.webview.core.resource.a aVar) {
        switch (this.a) {
            case 0:
                com.yandex.plus.pay.ui.core.mobile.domain.a aVar2 = (com.yandex.plus.pay.ui.core.mobile.domain.a) this.b;
                String uri = aVar.a.toString();
                uri.getClass();
                aVar2.getClass();
                gdk.b(aVar2.a, uri, "3ds");
                break;
            default:
                com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar3 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.b;
                String uri2 = aVar.a.toString();
                uri2.getClass();
                gdk.b(aVar3.b, uri2, aVar3.a);
                break;
        }
    }

    public b(com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar) {
        this.b = aVar;
    }
}
