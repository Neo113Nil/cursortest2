package com.yandex.passport.internal.ui.domik.sms;

import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.f;
import com.yandex.passport.data.network.cb;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.core.accounts.e;
import com.yandex.passport.internal.interaction.c;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.report.ba;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.report.z9;
import com.yandex.passport.internal.ui.base.m;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.common.g;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.ui.domik.y;
import com.yandex.passport.internal.usecase.ui.r0;
import defpackage.fb7;
import defpackage.kws;

/* loaded from: classes4.dex */
public final class b extends g {
    public final n0 u;
    public final y v;
    public final u0 w;
    public final l x;
    public final e y;
    public final com.yandex.passport.internal.interaction.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.internal.helper.g gVar, o0 o0Var, v vVar, cb cbVar, com.yandex.passport.internal.network.mappers.b bVar, n0 n0Var, r0 r0Var, y yVar, u0 u0Var, l lVar, e eVar) {
        super(bVar, cbVar, r0Var, u0Var, lVar);
        gVar.getClass();
        o0Var.getClass();
        vVar.getClass();
        cbVar.getClass();
        bVar.getClass();
        n0Var.getClass();
        r0Var.getClass();
        yVar.getClass();
        u0Var.getClass();
        lVar.getClass();
        eVar.getClass();
        this.u = n0Var;
        this.v = yVar;
        this.w = u0Var;
        this.x = lVar;
        this.y = eVar;
        o oVar = this.q;
        oVar.getClass();
        com.yandex.passport.internal.interaction.e eVar2 = new com.yandex.passport.internal.interaction.e(gVar, oVar, new kws(25, o0Var, this, vVar));
        K(eVar2);
        this.z = eVar2;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.g
    public final void L(com.yandex.passport.internal.ui.domik.e eVar) {
        a0 a0Var = (a0) eVar;
        a0Var.getClass();
        if (!a0Var.a.y) {
            com.yandex.passport.internal.interaction.e eVar2 = this.z;
            eVar2.getClass();
            eVar2.c.m(Boolean.TRUE);
            eVar2.a.a(z5.d(new c(1, eVar2, a0Var)));
            return;
        }
        z1 z1Var = this.x.g;
        com.yandex.passport.internal.l e = z1Var != null ? this.y.a().e(com.yandex.plus.pay.ui.core.b.L(z1Var)) : null;
        u0 u0Var = this.w;
        if (e == null) {
            if (z1Var != null) {
                com.yandex.passport.api.exception.b bVar = new com.yandex.passport.api.exception.b(z1Var);
                f L = com.yandex.plus.pay.ui.core.b.L(z1Var);
                u0Var.getClass();
                u0Var.n(z9.d, new ff(L), new ff(bVar));
            }
            this.k.m(new com.yandex.passport.internal.ui.f("unknown error"));
            return;
        }
        f fVar = e.b;
        u0Var.getClass();
        fVar.getClass();
        u0Var.n(ba.d, new ff(fVar));
        y yVar = this.v;
        yVar.getClass();
        yVar.a.q.m(new m(new fb7(13, a0Var, e), com.yandex.passport.internal.ui.domik.username.a.y, false, 1));
    }
}
