package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.data.network.t4;
import com.yandex.passport.data.network.u4;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.x3;
import defpackage.ocu;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a0 implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.core.accounts.i b;
    public final u4 c;
    public final com.yandex.passport.internal.properties.x d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final com.yandex.passport.data.network.token.i f;

    public a0(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.core.accounts.i iVar, u4 u4Var, com.yandex.passport.internal.properties.x xVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.data.network.token.i iVar2) {
        eVar.getClass();
        iVar.getClass();
        u4Var.getClass();
        xVar.getClass();
        bVar.getClass();
        this.a = eVar;
        this.b = iVar;
        this.c = u4Var;
        this.d = xVar;
        this.e = bVar;
        this.f = iVar2;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        x3 x3Var = (x3) v5Var;
        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) x3Var.c.c);
        com.yandex.passport.common.core.b bVar = L.a;
        com.yandex.passport.internal.credentials.e eVar = (com.yandex.passport.internal.credentials.e) x3Var.d.c;
        com.yandex.passport.internal.l e = this.a.a().e(L);
        if (e == null) {
            r7o r7oVar = z7o.b;
            return new t7o(new com.yandex.passport.api.exception.b(L));
        }
        Object A = com.yandex.passport.internal.ui.a.A(new ocu(eVar, this, bVar, e, (Continuation) null, 20));
        com.yandex.passport.internal.report.reporters.t tVar = com.yandex.passport.internal.report.reporters.t.f;
        com.yandex.passport.internal.core.accounts.i iVar = this.b;
        iVar.getClass();
        tVar.getClass();
        Throwable a = z7o.a(A);
        if (a != null && (a instanceof com.yandex.passport.common.exception.a)) {
            iVar.e(e, tVar);
        }
        if (!(A instanceof t7o)) {
            t4 t4Var = (t4) A;
            A = new com.yandex.passport.internal.entities.f(t4Var.c, com.yandex.plus.core.network.api.utils.a.P(bVar), t4Var.b);
        }
        Throwable a2 = z7o.a(A);
        if (a2 == null) {
            return A;
        }
        try {
            throw com.yandex.passport.data.network.token.i.j(this.f, a2, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
