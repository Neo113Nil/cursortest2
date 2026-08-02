package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.eno;
import defpackage.pd;
import defpackage.ukc;
import defpackage.x0q;
import defpackage.xdr;

/* loaded from: classes4.dex */
public final class v1 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.flags.i a;
    public final com.yandex.passport.internal.network.d b;
    public final com.yandex.passport.internal.account.a c;
    public final com.yandex.passport.internal.filter.l d;

    public v1(com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.network.d dVar, com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.filter.l lVar) {
        iVar.getClass();
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        this.a = iVar;
        this.b = dVar;
        this.c = aVar;
        this.d = lVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 22), xdrVar, new ukc(this, null));
    }
}
