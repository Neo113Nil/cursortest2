package com.yandex.passport.internal.ui.domik.smsauth;

import com.yandex.passport.data.network.cb;
import com.yandex.passport.internal.analytics.e0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.passport.internal.ui.domik.common.g;
import com.yandex.passport.internal.ui.domik.d;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.usecase.ui.r0;
import defpackage.w4i;
import defpackage.xlr;

/* loaded from: classes4.dex */
public final class b extends g {
    public final v u;
    public final n0 v;
    public final com.yandex.passport.internal.interaction.a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.internal.network.mappers.b bVar, cb cbVar, com.yandex.passport.internal.helper.g gVar, v vVar, n0 n0Var, r0 r0Var, u0 u0Var, l lVar) {
        super(bVar, cbVar, r0Var, u0Var, lVar);
        bVar.getClass();
        cbVar.getClass();
        gVar.getClass();
        vVar.getClass();
        n0Var.getClass();
        r0Var.getClass();
        u0Var.getClass();
        lVar.getClass();
        this.u = vVar;
        this.v = n0Var;
        o oVar = this.q;
        oVar.getClass();
        com.yandex.passport.internal.interaction.a aVar = new com.yandex.passport.internal.interaction.a(gVar, oVar, new w4i(2, this, b.class, "onSuccessAuth", "onSuccessAuth(Lcom/yandex/passport/internal/ui/domik/AuthTrack;Lcom/yandex/passport/internal/ui/domik/DomikResult;)V", 0, 29), new k(7, this));
        K(aVar);
        this.w = aVar;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.g
    public final void L(e eVar) {
        d dVar = (d) eVar;
        dVar.getClass();
        this.v.e(e0.a);
        com.yandex.passport.internal.interaction.a aVar = this.w;
        aVar.getClass();
        aVar.c.m(Boolean.TRUE);
        aVar.a.a(z5.d(new xlr(29, aVar, dVar)));
    }
}
