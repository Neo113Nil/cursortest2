package com.gamericefishpro.space.f3;

import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.h0.h0;
import com.gamericefishpro.space.h2.j1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends com.gamericefishpro.space.h2.j implements j1, com.gamericefishpro.space.h2.h {
    public final com.gamericefishpro.space.m1.u J;
    public h0 K;

    public w() {
        com.gamericefishpro.space.m1.u uVar = new com.gamericefishpro.space.m1.u(0, new v(2, this, w.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 9);
        A0(uVar);
        this.J = uVar;
    }

    @Override // com.gamericefishpro.space.h2.j1
    public final void E() {
        a0 a0Var = new a0();
        com.gamericefishpro.space.h2.k.p(this, new com.gamericefishpro.space.b2.b(1, a0Var, this));
        h0 h0Var = (h0) a0Var.d;
        if (this.J.F0().a()) {
            h0 h0Var2 = this.K;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.K = h0Var;
        }
    }
}
