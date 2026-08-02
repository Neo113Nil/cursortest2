package com.yandex.passport.internal.ui.domik.call;

import com.yandex.passport.data.network.cb;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.helper.g;
import com.yandex.passport.internal.interaction.e;
import com.yandex.passport.internal.ui.bouncer.p;
import com.yandex.passport.internal.ui.challenge.vpn.c;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.ui.domik.y;
import com.yandex.passport.internal.ui.util.q;
import com.yandex.passport.internal.usecase.ui.n1;

/* loaded from: classes4.dex */
public final class a extends b {
    public final n0 r;
    public final e s;

    public a(g gVar, cb cbVar, v vVar, com.yandex.passport.internal.network.mappers.b bVar, y yVar, n0 n0Var, n1 n1Var) {
        gVar.getClass();
        cbVar.getClass();
        vVar.getClass();
        bVar.getClass();
        yVar.getClass();
        n0Var.getClass();
        n1Var.getClass();
        this.r = n0Var;
        new q();
        o oVar = this.q;
        oVar.getClass();
        e eVar = new e(gVar, oVar, new p(8, this, vVar));
        K(eVar);
        this.s = eVar;
        o oVar2 = this.q;
        oVar2.getClass();
        K(new com.yandex.passport.internal.interaction.a(bVar, cbVar, oVar2, new c(1, this, a.class, "processSuccessSms", "processSuccessSms(Lcom/yandex/passport/internal/ui/domik/RegTrack;)V", 0, 1)));
    }
}
