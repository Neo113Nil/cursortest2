package defpackage;

/* loaded from: classes10.dex */
public final class yb30 implements s820 {
    public final long a;
    public final long b;
    public final long c;

    public yb30(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb30)) {
            return false;
        }
        yb30 yb30Var = (yb30) obj;
        return this.a == yb30Var.a && this.b == yb30Var.b && this.c == yb30Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(qv10.c(527, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
