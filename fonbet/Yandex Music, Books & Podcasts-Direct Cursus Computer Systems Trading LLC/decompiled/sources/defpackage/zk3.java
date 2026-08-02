package defpackage;

/* loaded from: classes.dex */
public final class zk3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public zk3(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        return d85.c(this.a, zk3Var.a) && d85.c(this.b, zk3Var.b) && d85.c(this.c, zk3Var.c) && d85.c(this.d, zk3Var.d);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
