package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2633c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2634d;

    public c(Object obj, int i10, int i11, String str) {
        this.f2631a = obj;
        this.f2632b = i10;
        this.f2633c = i11;
        this.f2634d = str;
        if (i10 <= i11) {
            return;
        }
        m2.a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return pc.j.a(this.f2631a, cVar.f2631a) && this.f2632b == cVar.f2632b && this.f2633c == cVar.f2633c && pc.j.a(this.f2634d, cVar.f2634d);
    }

    public final int hashCode() {
        Object obj = this.f2631a;
        return this.f2634d.hashCode() + v.f.b(this.f2633c, v.f.b(this.f2632b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f2631a + ", start=" + this.f2632b + ", end=" + this.f2633c + ", tag=" + this.f2634d + ')';
    }

    public c(int i10, int i11, Object obj) {
        this(obj, i10, i11, "");
    }
}
