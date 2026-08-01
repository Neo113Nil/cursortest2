package t0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5006a {

    /* renamed from: a, reason: collision with root package name */
    public int f40641a;

    /* renamed from: b, reason: collision with root package name */
    public int f40642b;

    /* renamed from: c, reason: collision with root package name */
    public int f40643c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C5006a.class != obj.getClass()) {
                return false;
            }
            C5006a c5006a = (C5006a) obj;
            int i = this.f40641a;
            if (i != c5006a.f40641a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f40643c - this.f40642b) != 1 || this.f40643c != c5006a.f40642b || this.f40642b != c5006a.f40643c) {
                return this.f40643c == c5006a.f40643c && this.f40642b == c5006a.f40642b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f40641a * 31) + this.f40642b) * 31) + this.f40643c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f40641a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : com.anythink.expressad.f.a.b.ay);
        sb.append(",s:");
        sb.append(this.f40642b);
        sb.append("c:");
        return u1.h.e(this.f40643c, ",p:null]", sb);
    }
}
