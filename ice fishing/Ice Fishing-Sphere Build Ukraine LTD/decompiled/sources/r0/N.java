package r0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f2874a;

    /* renamed from: b, reason: collision with root package name */
    public final L f2875b;

    public N(String str, L l2) {
        this.f2874a = str;
        this.f2875b = l2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        N n2 = (N) obj;
        return o.g.k(u0.e.B(this.f2874a, this.f2875b), u0.e.B(n2.f2874a, n2.f2875b));
    }

    public final int hashCode() {
        return u0.e.B(this.f2874a, this.f2875b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f2874a + ", type=" + this.f2875b + ")";
    }
}
