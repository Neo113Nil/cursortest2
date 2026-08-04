package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.h2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public final int a;
    public final int b;

    public j0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var);

    public com.gamericefishpro.space.t0.a b(com.gamericefishpro.space.d4.z zVar) {
        return null;
    }

    public final String toString() {
        String strC = com.gamericefishpro.space.ei.b0.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ j0(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
