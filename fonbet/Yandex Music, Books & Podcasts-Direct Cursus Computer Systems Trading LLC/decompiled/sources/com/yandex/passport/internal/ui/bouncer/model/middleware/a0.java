package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.eno;
import defpackage.gv6;
import defpackage.pd;
import defpackage.x0q;
import defpackage.xdr;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.upgrader.m a;
    public final com.yandex.passport.internal.report.reporters.e b;

    public a0(com.yandex.passport.internal.upgrader.m mVar, com.yandex.passport.internal.report.reporters.e eVar) {
        mVar.getClass();
        eVar.getClass();
        this.a = mVar;
        this.b = eVar;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 8), xdrVar, new gv6(this, (Continuation) null, 18));
    }
}
