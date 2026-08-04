package com.gamericefishpro.space.d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements k1 {
    public final k1 a;
    public final k1 b;

    public g0(k1 k1Var, k1 k1Var2) {
        this.a = k1Var;
        this.b = k1Var2;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int a(com.gamericefishpro.space.c3.c cVar) {
        int iA = this.a.a(cVar) - this.b.a(cVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int b(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar) {
        int iB = this.a.b(cVar, lVar) - this.b.b(cVar, lVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int c(com.gamericefishpro.space.c3.c cVar) {
        int iC = this.a.c(cVar) - this.b.c(cVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int d(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar) {
        int iD = this.a.d(cVar, lVar) - this.b.d(cVar, lVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.a(g0Var.a, this.a) && Intrinsics.a(g0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
