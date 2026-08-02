package defpackage;

/* loaded from: classes3.dex */
public final class njs {
    public static final njs c = new njs(0, 0);
    public final long a;
    public final long b;

    public njs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njs)) {
            return false;
        }
        njs njsVar = (njs) obj;
        return this.a == njsVar.a && this.b == njsVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.m(this.b, ")", tlm.l(this.a, "Timestamp(clockMillis=", ", bootMillis="));
    }
}
