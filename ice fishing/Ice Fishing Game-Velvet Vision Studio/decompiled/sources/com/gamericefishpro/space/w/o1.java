package com.gamericefishpro.space.w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements u {
    public final int a;
    public final int b;
    public final s c;

    public o1(int i, int i2, s sVar) {
        this.a = i;
        this.b = i2;
        this.c = sVar;
    }

    @Override // com.gamericefishpro.space.w.i
    public final p1 a(com.gamericefishpro.space.u6.l lVar) {
        return new com.gamericefishpro.space.n3.g(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            if (o1Var.a == this.a && o1Var.b == this.b && Intrinsics.a(o1Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }
}
