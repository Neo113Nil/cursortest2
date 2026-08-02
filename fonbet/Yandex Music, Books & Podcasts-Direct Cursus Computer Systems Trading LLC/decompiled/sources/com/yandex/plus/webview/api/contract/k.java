package com.yandex.plus.webview.api.contract;

import defpackage.bqi;
import defpackage.btf;
import defpackage.jyr;
import defpackage.vdr;
import defpackage.xdr;

/* loaded from: classes5.dex */
public final class k implements j {
    public final jyr a = btf.b(new com.yandex.plus.paymentsdk.api.d(7));

    public final bqi b() {
        return (bqi) this.a.getValue();
    }

    public final void c() {
        bqi b = b();
        Boolean bool = Boolean.TRUE;
        xdr xdrVar = (xdr) b;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return b();
    }
}
