package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.eno;
import defpackage.pd;
import defpackage.v42;
import defpackage.x0q;
import defpackage.xdr;

/* loaded from: classes4.dex */
public final class t0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.properties.x a;
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.flags.i c;

    public t0(com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.flags.i iVar) {
        xVar.getClass();
        eVar.getClass();
        iVar.getClass();
        this.a = xVar;
        this.b = eVar;
        this.c = iVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 13), xdrVar, new v42(this, null, 18));
    }
}
