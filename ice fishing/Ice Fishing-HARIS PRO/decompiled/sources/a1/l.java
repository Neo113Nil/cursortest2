package a1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f1709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1711c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1712d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1713f;

    public l(int i, String str, String str2, String str3, String str4, String str5) {
        this.f1709a = i;
        this.f1710b = str;
        this.f1711c = str2;
        this.f1712d = str3;
        this.e = str4;
        this.f1713f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1709a == lVar.f1709a && this.f1710b.equals(lVar.f1710b) && this.f1711c.equals(lVar.f1711c) && this.f1712d.equals(lVar.f1712d) && this.e.equals(lVar.e) && this.f1713f.equals(lVar.f1713f);
    }

    public final int hashCode() {
        return this.f1713f.hashCode() + D1.h.b(this.e, D1.h.b(this.f1712d, D1.h.b(this.f1711c, D1.h.b(this.f1710b, Integer.hashCode(this.f1709a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mistake(id=");
        sb.append(this.f1709a);
        sb.append(", title=");
        sb.append(this.f1710b);
        sb.append(", description=");
        sb.append(this.f1711c);
        sb.append(", consequences=");
        sb.append(this.f1712d);
        sb.append(", howToFix=");
        sb.append(this.e);
        sb.append(", tips=");
        return D1.h.h(sb, this.f1713f, ")");
    }
}
