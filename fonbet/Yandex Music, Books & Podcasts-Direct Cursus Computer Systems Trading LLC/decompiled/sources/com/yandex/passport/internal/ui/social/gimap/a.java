package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.internal.analytics.o0;
import defpackage.xy0;

/* loaded from: classes4.dex */
public abstract class a extends com.yandex.passport.internal.ui.base.h {
    public final q q;
    public final o0 r;
    public final com.yandex.passport.internal.interaction.d s;

    public a(q qVar, o0 o0Var) {
        this.q = qVar;
        this.r = o0Var;
        com.yandex.passport.internal.interaction.d dVar = new com.yandex.passport.internal.interaction.d(new com.yandex.passport.common.network.n(this, qVar));
        K(dVar);
        this.s = dVar;
    }

    public abstract com.yandex.passport.internal.l L(p pVar);

    public void M(f fVar) {
        o0 o0Var = this.r;
        o0Var.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("error", fVar.a);
        o0Var.a.b(com.yandex.passport.internal.analytics.f.g, xy0Var);
    }
}
