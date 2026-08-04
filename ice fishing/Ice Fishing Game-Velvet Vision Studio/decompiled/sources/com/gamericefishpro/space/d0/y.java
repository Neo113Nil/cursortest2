package com.gamericefishpro.space.d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final com.gamericefishpro.space.c3.c a;
    public final long b;

    public y(com.gamericefishpro.space.f2.h1 h1Var, long j) {
        this.a = h1Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.a(this.a, yVar.a) && com.gamericefishpro.space.c3.a.b(this.b, yVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) com.gamericefishpro.space.c3.a.k(this.b)) + ')';
    }
}
