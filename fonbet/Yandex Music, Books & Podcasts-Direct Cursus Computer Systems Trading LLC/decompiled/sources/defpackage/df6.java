package defpackage;

/* loaded from: classes.dex */
public final class df6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public df6(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof df6)) {
            return false;
        }
        df6 df6Var = (df6) obj;
        return d85.c(this.a, df6Var.a) && d85.c(this.b, df6Var.b) && d85.c(this.c, df6Var.c) && d85.c(this.d, df6Var.d) && d85.c(this.e, df6Var.e);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.e) + tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        dfi.q(this.a, ", textColor=", sb);
        dfi.q(this.b, ", iconColor=", sb);
        dfi.q(this.c, ", disabledTextColor=", sb);
        dfi.q(this.d, ", disabledIconColor=", sb);
        sb.append((Object) d85.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
