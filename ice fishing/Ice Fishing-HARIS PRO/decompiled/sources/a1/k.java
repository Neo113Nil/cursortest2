package a1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1706b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1707c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1708d;
    public final String e;

    public k(int i, String str, String str2, String str3, String str4) {
        this.f1705a = i;
        this.f1706b = str;
        this.f1707c = str2;
        this.f1708d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f1705a == kVar.f1705a && this.f1706b.equals(kVar.f1706b) && this.f1707c.equals(kVar.f1707c) && this.f1708d.equals(kVar.f1708d) && this.e.equals(kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + D1.h.b(this.f1708d, D1.h.b(this.f1707c, D1.h.b(this.f1706b, Integer.hashCode(this.f1705a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HrTemplate(id=");
        sb.append(this.f1705a);
        sb.append(", title=");
        sb.append(this.f1706b);
        sb.append(", category=");
        sb.append(this.f1707c);
        sb.append(", content=");
        sb.append(this.f1708d);
        sb.append(", tips=");
        return D1.h.h(sb, this.e, ")");
    }
}
