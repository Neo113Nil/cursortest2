package defpackage;

/* loaded from: classes6.dex */
public final class h95 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public h95(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h95)) {
            return false;
        }
        h95 h95Var = (h95) obj;
        return d85.c(this.a, h95Var.a) && d85.c(this.b, h95Var.b) && d85.c(this.c, h95Var.c) && d85.c(this.d, h95Var.d) && d85.c(this.e, h95Var.e) && d85.c(this.f, h95Var.f) && d85.c(this.g, h95Var.g);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.g) + tlm.c(this.f, tlm.c(this.e, tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(labelPrimary=");
        dfi.q(this.a, ", labelHighlightedPrimary=", sb);
        dfi.q(this.b, ", backPrimary=", sb);
        dfi.q(this.c, ", backSecondary=", sb);
        dfi.q(this.d, ", graphPrimary=", sb);
        dfi.q(this.e, ", graphSuccess=", sb);
        dfi.q(this.f, ", graphError=", sb);
        sb.append((Object) d85.i(this.g));
        sb.append(')');
        return sb.toString();
    }
}
