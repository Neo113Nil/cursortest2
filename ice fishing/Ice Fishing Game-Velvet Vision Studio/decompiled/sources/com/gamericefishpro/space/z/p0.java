package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final long a;
    public final long b;
    public final boolean c;

    public p0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final p0 a(p0 p0Var) {
        return new p0(com.gamericefishpro.space.n1.b.e(this.a, p0Var.a), Math.max(this.b, p0Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return com.gamericefishpro.space.n1.b.b(this.a, p0Var.a) && this.b == p0Var.b && this.c == p0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + com.gamericefishpro.space.t0.y0.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) com.gamericefishpro.space.n1.b.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
