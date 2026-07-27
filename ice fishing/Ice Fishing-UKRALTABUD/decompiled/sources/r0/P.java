package r0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final String f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final N f2873b;

    public P(String str, N n2) {
        this.f2872a = str;
        this.f2873b = n2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(P.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        P p2 = (P) obj;
        return o.g.k(this.f2872a, p2.f2872a) && o.g.k(this.f2873b, p2.f2873b);
    }

    public final int hashCode() {
        return o.g.l(this.f2873b) + ((o.g.l(this.f2872a) + (P.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f2872a + ", type=" + this.f2873b + ")";
    }
}
