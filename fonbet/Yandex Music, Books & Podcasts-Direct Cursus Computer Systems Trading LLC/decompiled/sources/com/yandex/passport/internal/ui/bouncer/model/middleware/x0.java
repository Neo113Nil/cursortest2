package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.eno;
import defpackage.pd;
import defpackage.v42;
import defpackage.x0q;
import defpackage.xdr;

/* loaded from: classes4.dex */
public final class x0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.account.a a;

    public x0(com.yandex.passport.internal.account.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 15), xdrVar, new v42(this, null, 19));
    }
}
