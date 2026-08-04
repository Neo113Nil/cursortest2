package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends h1 {
    public final Object A;
    public final l1 w;
    public final k1 y;
    public final l z;

    public j1(l1 l1Var, k1 k1Var, l lVar, Object obj) {
        this.w = l1Var;
        this.y = k1Var;
        this.z = lVar;
        this.A = obj;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final boolean k() {
        return false;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final void l(Throwable th) {
        l lVar = this.z;
        l lVarZ = l1.Z(lVar);
        l1 l1Var = this.w;
        k1 k1Var = this.y;
        Object obj = this.A;
        if (lVarZ == null || !l1Var.i0(k1Var, lVarZ, obj)) {
            k1Var.d.e(new com.gamericefishpro.space.ui.h(2), 2);
            l lVarZ2 = l1.Z(lVar);
            if (lVarZ2 == null || !l1Var.i0(k1Var, lVarZ2, obj)) {
                l1Var.m(l1Var.G(k1Var, obj));
            }
        }
    }
}
