package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.api.x1;
import com.yandex.passport.internal.analytics.o0;
import defpackage.qgg;
import defpackage.xg;

/* loaded from: classes4.dex */
public final class k extends a {
    public final com.yandex.passport.internal.ui.util.q t;
    public final com.yandex.passport.internal.account.d u;

    public k(q qVar, o0 o0Var, com.yandex.passport.internal.account.d dVar) {
        super(qVar, o0Var);
        this.t = new com.yandex.passport.internal.ui.util.q();
        this.u = dVar;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.a
    public final com.yandex.passport.internal.l L(p pVar) {
        com.yandex.passport.common.core.b bVar = pVar.e;
        String str = pVar.a;
        str.getClass();
        String str2 = pVar.b;
        str2.getClass();
        x1 x1Var = x1.OTHER;
        com.yandex.passport.internal.analytics.a aVar = com.yandex.passport.internal.analytics.a.s;
        com.yandex.passport.internal.account.d dVar = this.u;
        dVar.getClass();
        bVar.getClass();
        aVar.getClass();
        Object A = com.yandex.passport.internal.ui.a.A(new xg(dVar, bVar, str, str2, x1Var, aVar, null, 25));
        qgg.h0(A);
        return (com.yandex.passport.internal.l) A;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.a
    public final void M(f fVar) {
        super.M(fVar);
        this.t.m(i.c);
    }
}
