package a1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f1734a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1735b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1736c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1737d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1738f;

    public r(int i, String str, String str2, String str3, String str4, String str5) {
        this.f1734a = i;
        this.f1735b = str;
        this.f1736c = str2;
        this.f1737d = str3;
        this.e = str4;
        this.f1738f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1734a == rVar.f1734a && this.f1735b.equals(rVar.f1735b) && this.f1736c.equals(rVar.f1736c) && this.f1737d.equals(rVar.f1737d) && this.e.equals(rVar.e) && this.f1738f.equals(rVar.f1738f);
    }

    public final int hashCode() {
        return this.f1738f.hashCode() + D1.h.b(this.e, D1.h.b(this.f1737d, D1.h.b(this.f1736c, D1.h.b(this.f1735b, Integer.hashCode(this.f1734a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Term(id=");
        sb.append(this.f1734a);
        sb.append(", title=");
        sb.append(this.f1735b);
        sb.append(", shortDescription=");
        sb.append(this.f1736c);
        sb.append(", fullDescription=");
        sb.append(this.f1737d);
        sb.append(", example=");
        sb.append(this.e);
        sb.append(", tips=");
        return D1.h.h(sb, this.f1738f, ")");
    }
}
