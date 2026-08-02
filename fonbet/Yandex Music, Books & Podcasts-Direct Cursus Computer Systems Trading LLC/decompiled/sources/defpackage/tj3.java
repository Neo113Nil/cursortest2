package defpackage;

/* loaded from: classes.dex */
public final class tj3 implements in0 {
    public final long a;
    public final long b;

    public tj3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tj3)) {
            return false;
        }
        Object obj2 = wvo.b;
        tj3 tj3Var = (tj3) obj;
        if (!obj2.equals(obj2) || !kes.a(this.a, tj3Var.a) || !kes.a(this.b, tj3Var.b)) {
            return false;
        }
        Object obj3 = dbc.a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        int hashCode = wvo.b.hashCode() * 31;
        les[] lesVarArr = kes.b;
        return dbc.a.hashCode() + eta.a(tlm.c(this.b, tlm.c(this.a, hashCode, 31), 961), 1.0f, 31);
    }

    public final String toString() {
        return "Bullet(shape=" + wvo.b + ", size=" + ((Object) kes.d(this.a)) + ", padding=" + ((Object) kes.d(this.b)) + ", brush=null, alpha=1.0, drawStyle=" + dbc.a + ')';
    }
}
