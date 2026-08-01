package k0;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187a {

    /* renamed from: a, reason: collision with root package name */
    public int f3433a;

    /* renamed from: b, reason: collision with root package name */
    public int f3434b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3435c;

    /* renamed from: d, reason: collision with root package name */
    public int f3436d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0187a)) {
            return false;
        }
        C0187a c0187a = (C0187a) obj;
        int i = this.f3433a;
        if (i != c0187a.f3433a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f3436d - this.f3434b) == 1 && this.f3436d == c0187a.f3434b && this.f3434b == c0187a.f3436d) {
            return true;
        }
        if (this.f3436d != c0187a.f3436d || this.f3434b != c0187a.f3434b) {
            return false;
        }
        Object obj2 = this.f3435c;
        if (obj2 != null) {
            if (!obj2.equals(c0187a.f3435c)) {
                return false;
            }
        } else if (c0187a.f3435c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f3433a * 31) + this.f3434b) * 31) + this.f3436d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f3433a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f3434b);
        sb.append("c:");
        sb.append(this.f3436d);
        sb.append(",p:");
        sb.append(this.f3435c);
        sb.append("]");
        return sb.toString();
    }
}
