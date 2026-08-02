package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.eno;
import defpackage.j0v;
import defpackage.pd;
import defpackage.x0q;
import defpackage.xdr;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class u implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.usecase.ui.t a;

    public u(com.yandex.passport.internal.usecase.ui.t tVar) {
        tVar.getClass();
        this.a = tVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 6), xdrVar, new j0v(this, (Continuation) null, 13));
    }
}
