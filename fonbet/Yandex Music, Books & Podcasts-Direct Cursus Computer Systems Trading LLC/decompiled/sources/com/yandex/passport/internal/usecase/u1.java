package com.yandex.passport.internal.usecase;

import defpackage.rhw;

/* loaded from: classes4.dex */
public final class u1 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.core.accounts.f b;
    public final com.yandex.passport.internal.database.d c;
    public final com.yandex.passport.internal.report.reporters.f1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.f fVar, com.yandex.passport.internal.database.d dVar, com.yandex.passport.internal.report.reporters.f1 f1Var) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        fVar.getClass();
        dVar.getClass();
        f1Var.getClass();
        this.b = fVar;
        this.c = dVar;
        this.d = f1Var;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        t1 t1Var = (t1) obj;
        com.yandex.passport.common.core.b bVar = t1Var.a;
        com.yandex.passport.internal.network.response.c cVar = t1Var.b;
        com.yandex.passport.common.account.a aVar = cVar.a;
        com.yandex.passport.common.core.g gVar = cVar.b;
        com.yandex.passport.internal.l b = this.b.b(com.yandex.passport.internal.m.e(bVar, aVar, gVar, null), t1Var.c.d(), true);
        com.yandex.passport.common.core.f fVar = b.b;
        long j = fVar.b;
        com.yandex.passport.common.core.f fVar2 = b.c;
        this.d.w(j, fVar2 != null ? new Long(fVar2.b) : null, b.e.Z, t1Var.c, gVar.K);
        com.yandex.passport.internal.entities.e eVar = cVar.c;
        if (eVar != null) {
            this.c.z(fVar, eVar);
        }
        return b;
    }
}
