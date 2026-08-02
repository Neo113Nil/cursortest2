package defpackage;

/* loaded from: classes6.dex */
public final class rn3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ rn3() {
        this(0L, 0L, 0L, 0L);
    }

    public static rn3 a(rn3 rn3Var, long j, long j2, long j3, long j4, int i) {
        if ((i & 1) != 0) {
            j = rn3Var.a;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = rn3Var.b;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = rn3Var.c;
        }
        long j7 = j3;
        long j8 = (i & 8) != 0 ? rn3Var.d : j4;
        rn3Var.getClass();
        return new rn3(j5, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn3)) {
            return false;
        }
        rn3 rn3Var = (rn3) obj;
        return this.a == rn3Var.a && this.b == rn3Var.b && this.c == rn3Var.c && this.d == rn3Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BytesLoaded(total=");
        sb.append(this.a);
        sb.append(", video=");
        sb.append(this.b);
        sb.append(", audio=");
        sb.append(this.c);
        sb.append(", subtitles=");
        return eta.g(sb, this.d, ')');
    }

    public rn3(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
