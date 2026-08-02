package defpackage;

/* loaded from: classes.dex */
public final class kk7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public kk7(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk7.class != obj.getClass()) {
            return false;
        }
        kk7 kk7Var = (kk7) obj;
        return d85.c(this.a, kk7Var.a) && d85.c(this.b, kk7Var.b) && d85.c(this.c, kk7Var.c) && d85.c(this.d, kk7Var.d);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
