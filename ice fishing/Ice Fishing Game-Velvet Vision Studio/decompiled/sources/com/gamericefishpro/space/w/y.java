package com.gamericefishpro.space.w;

import com.gamericefishpro.space.n9.v3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements i {
    public final o1 a;
    public final j0 b;
    public final long c;

    public y(o1 o1Var, j0 j0Var, long j) {
        this.a = o1Var;
        this.b = j0Var;
        this.c = j;
    }

    @Override // com.gamericefishpro.space.w.i
    public final p1 a(com.gamericefishpro.space.u6.l lVar) {
        o1 o1Var = this.a;
        return new v3(new com.gamericefishpro.space.n3.g(o1Var.a, o1Var.b, o1Var.c), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return yVar.a.equals(this.a) && yVar.b == this.b && yVar.c == this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
