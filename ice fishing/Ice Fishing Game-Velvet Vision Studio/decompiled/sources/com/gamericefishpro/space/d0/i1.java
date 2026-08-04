package com.gamericefishpro.space.d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements k1 {
    public final k1 a;
    public final k1 b;

    public i1(k1 k1Var, k1 k1Var2) {
        this.a = k1Var;
        this.b = k1Var2;
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int a(com.gamericefishpro.space.c3.c cVar) {
        return Math.max(this.a.a(cVar), this.b.a(cVar));
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int b(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar) {
        return Math.max(this.a.b(cVar, lVar), this.b.b(cVar, lVar));
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int c(com.gamericefishpro.space.c3.c cVar) {
        return Math.max(this.a.c(cVar), this.b.c(cVar));
    }

    @Override // com.gamericefishpro.space.d0.k1
    public final int d(com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.c3.l lVar) {
        return Math.max(this.a.d(cVar, lVar), this.b.d(cVar, lVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.a(i1Var.a, this.a) && Intrinsics.a(i1Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
