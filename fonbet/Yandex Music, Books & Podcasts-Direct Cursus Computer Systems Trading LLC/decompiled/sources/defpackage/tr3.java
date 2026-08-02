package defpackage;

/* loaded from: classes4.dex */
public final class tr3 {
    public final long a;
    public final long b;
    public final boolean c;

    public tr3(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j2 > 0 && j2 == j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr3)) {
            return false;
        }
        tr3 tr3Var = (tr3) obj;
        return this.a == tr3Var.a && this.b == tr3Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.m(this.b, ")", tlm.l(this.a, "CacheState(bytesCached=", ", requestLength="));
    }
}
