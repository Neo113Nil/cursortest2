package t0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5038a {

    /* renamed from: a, reason: collision with root package name */
    public int f40667a;

    /* renamed from: b, reason: collision with root package name */
    public int f40668b;

    /* renamed from: c, reason: collision with root package name */
    public int f40669c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C5038a.class != obj.getClass()) {
                return false;
            }
            C5038a c5038a = (C5038a) obj;
            int i = this.f40667a;
            if (i != c5038a.f40667a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f40669c - this.f40668b) != 1 || this.f40669c != c5038a.f40668b || this.f40668b != c5038a.f40669c) {
                return this.f40669c == c5038a.f40669c && this.f40668b == c5038a.f40668b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f40667a * 31) + this.f40668b) * 31) + this.f40669c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f40667a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : com.anythink.expressad.f.a.b.ay);
        sb.append(",s:");
        sb.append(this.f40668b);
        sb.append("c:");
        return AbstractC5051n.e(this.f40669c, ",p:null]", sb);
    }
}
