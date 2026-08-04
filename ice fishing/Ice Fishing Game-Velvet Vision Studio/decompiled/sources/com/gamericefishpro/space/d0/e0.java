package com.gamericefishpro.space.d0;

import com.gamericefishpro.space.h2.c2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends com.gamericefishpro.space.h1.l implements c2 {
    public k1 H;
    public k1 I;
    public Function1 J;

    @Override // com.gamericefishpro.space.h2.c2
    public final Object i() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        com.gamericefishpro.space.h2.k.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(this, 1));
        k1 k1Var = this.H;
        this.J.invoke(k1Var);
        this.I = k1Var;
        com.gamericefishpro.space.h2.k.w(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(this, 0));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        this.I = this.H;
        com.gamericefishpro.space.h2.k.w(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new k0(this, 0));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void u0() {
        this.H = j.a;
    }
}
