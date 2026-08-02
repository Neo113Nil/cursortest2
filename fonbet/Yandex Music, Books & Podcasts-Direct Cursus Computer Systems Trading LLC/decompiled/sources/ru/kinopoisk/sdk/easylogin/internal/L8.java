package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.un4;
import defpackage.v7o;
import defpackage.veb;
import defpackage.xdr;
import ru.kinopoisk.sdk.easylogin.internal.K8;

/* loaded from: classes5.dex */
public final class L8 implements v7o {
    public final /* synthetic */ K8 a;

    public L8(K8 k8) {
        this.a = k8;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        F0 f0;
        vebVar.getClass();
        f0 = this.a.c;
        F8.a(f0, "SmartViewConnector", "disconnect", vebVar.a + ": " + vebVar.c, null, new Object[0], 8);
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        ((un4) obj).getClass();
        ((xdr) this.a.d).l(K8.d.c.a);
    }
}
