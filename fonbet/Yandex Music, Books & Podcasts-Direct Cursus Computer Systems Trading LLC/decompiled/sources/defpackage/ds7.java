package defpackage;

/* loaded from: classes.dex */
public final class ds7 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public ds7(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ds7.class != obj.getClass()) {
            return false;
        }
        ds7 ds7Var = (ds7) obj;
        return d85.c(this.a, ds7Var.a) && d85.c(this.b, ds7Var.b) && d85.c(this.c, ds7Var.c) && d85.c(this.d, ds7Var.d) && d85.c(this.e, ds7Var.e) && d85.c(this.f, ds7Var.f) && d85.c(this.g, ds7Var.g) && d85.c(this.h, ds7Var.h);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.h) + tlm.c(this.g, tlm.c(this.f, tlm.c(this.e, tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
