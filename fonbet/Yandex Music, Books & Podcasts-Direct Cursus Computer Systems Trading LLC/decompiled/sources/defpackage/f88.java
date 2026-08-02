package defpackage;

/* loaded from: classes3.dex */
public final class f88 {
    public final long a;
    public final long b;

    public f88(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f88)) {
            return false;
        }
        f88 f88Var = (f88) obj;
        return this.a == f88Var.a && this.b == f88Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.m(this.b, ")", tlm.l(this.a, "DiskSpaceInfo(allBytes=", ", availableBytes="));
    }
}
