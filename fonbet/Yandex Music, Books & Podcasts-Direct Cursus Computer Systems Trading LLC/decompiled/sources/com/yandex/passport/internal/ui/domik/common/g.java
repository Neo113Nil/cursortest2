package com.yandex.passport.internal.ui.domik.common;

import com.yandex.passport.data.network.cb;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.util.q;
import com.yandex.passport.internal.usecase.ui.r0;

/* loaded from: classes4.dex */
public abstract class g extends com.yandex.passport.internal.ui.domik.base.b {
    public final r0 r;
    public final q s;
    public final com.yandex.passport.internal.interaction.a t;

    public g(com.yandex.passport.internal.network.mappers.b bVar, cb cbVar, r0 r0Var, u0 u0Var, l lVar) {
        bVar.getClass();
        cbVar.getClass();
        r0Var.getClass();
        u0Var.getClass();
        lVar.getClass();
        this.r = r0Var;
        this.s = new q();
        o oVar = this.q;
        oVar.getClass();
        com.yandex.passport.internal.interaction.a aVar = new com.yandex.passport.internal.interaction.a(bVar, cbVar, oVar, new com.yandex.passport.internal.ui.challenge.vpn.c(1, this, g.class, "onPhoneConfirmed", "onPhoneConfirmed(Lcom/yandex/passport/internal/ui/domik/BaseTrack;)V", 0, 2));
        K(aVar);
        this.t = aVar;
    }

    public abstract void L(com.yandex.passport.internal.ui.domik.e eVar);
}
