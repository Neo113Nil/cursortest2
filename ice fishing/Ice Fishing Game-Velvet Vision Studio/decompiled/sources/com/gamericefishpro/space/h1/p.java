package com.gamericefishpro.space.h1;

import com.gamericefishpro.space.b2.t;
import com.gamericefishpro.space.f2.k0;
import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.f2.n0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.h2.v;
import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends l implements v {
    public float H;

    @Override // com.gamericefishpro.space.h2.v
    public final m0 F(n0 n0Var, k0 k0Var, long j) {
        u0 u0VarE = k0Var.e(j);
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new t(2, u0VarE, this));
    }

    public final String toString() {
        return y0.h(new StringBuilder("ZIndexModifier(zIndex="), this.H, ')');
    }
}
