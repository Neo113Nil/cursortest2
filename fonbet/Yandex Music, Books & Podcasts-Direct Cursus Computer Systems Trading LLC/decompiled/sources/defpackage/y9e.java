package defpackage;

/* loaded from: classes.dex */
public final class y9e {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public y9e(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y9e)) {
            return false;
        }
        y9e y9eVar = (y9e) obj;
        return d85.c(this.a, y9eVar.a) && d85.c(this.b, y9eVar.b) && d85.c(this.c, y9eVar.c) && d85.c(this.d, y9eVar.d);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
