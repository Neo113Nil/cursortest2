package com.gamericefishpro.space.w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements p1 {
    public final p1 d;
    public final long e;

    public x0(p1 p1Var, long j) {
        this.d = p1Var;
        this.e = j;
    }

    @Override // com.gamericefishpro.space.w.p1
    public final boolean a() {
        return this.d.a();
    }

    @Override // com.gamericefishpro.space.w.p1
    public final long b(o oVar, o oVar2, o oVar3) {
        return this.d.b(oVar, oVar2, oVar3) + this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return x0Var.e == this.e && Intrinsics.a(x0Var.d, this.d);
    }

    @Override // com.gamericefishpro.space.w.p1
    public final o f(long j, o oVar, o oVar2, o oVar3) {
        long j2 = this.e;
        return j < j2 ? oVar3 : this.d.f(j - j2, oVar, oVar2, oVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    @Override // com.gamericefishpro.space.w.p1
    public final o r(long j, o oVar, o oVar2, o oVar3) {
        long j2 = this.e;
        return j < j2 ? oVar : this.d.r(j - j2, oVar, oVar2, oVar3);
    }
}
