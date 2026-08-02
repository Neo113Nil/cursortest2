package defpackage;

/* loaded from: classes4.dex */
public final class xow extends zow {
    public final qmw a;
    public final long b;

    public xow(qmw qmwVar, long j) {
        this.a = qmwVar;
        this.b = j;
    }

    @Override // defpackage.zow
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xow)) {
            return false;
        }
        xow xowVar = (xow) obj;
        return this.a.equals(xowVar.a) && this.b == xowVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        qmw qmwVar = this.a;
        return hrg.m(qmwVar.b, ")", tlm.l(qmwVar.a, "Seek(", "/"));
    }
}
