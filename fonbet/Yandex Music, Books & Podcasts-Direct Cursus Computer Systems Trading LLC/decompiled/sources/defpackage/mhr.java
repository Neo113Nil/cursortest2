package defpackage;

/* loaded from: classes3.dex */
public final class mhr implements qhr {
    public final long a;
    public final long b;
    public final ohr c;

    public mhr(long j, long j2, ohr ohrVar) {
        ohrVar.getClass();
        this.a = j;
        this.b = j2;
        this.c = ohrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhr)) {
            return false;
        }
        mhr mhrVar = (mhr) obj;
        return this.a == mhrVar.a && this.b == mhrVar.b && this.c == mhrVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder l = tlm.l(this.a, "Exceeded(limitBytes=", ", availableBytes=");
        l.append(this.b);
        l.append(", trigger=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
