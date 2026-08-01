package a1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1687a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1688b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1689c;

    public f(int i, String str, String str2) {
        this.f1687a = i;
        this.f1688b = str;
        this.f1689c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1687a == fVar.f1687a && this.f1688b.equals(fVar.f1688b) && this.f1689c.equals(fVar.f1689c);
    }

    public final int hashCode() {
        return this.f1689c.hashCode() + D1.h.b(this.f1688b, Integer.hashCode(this.f1687a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompanySection(id=");
        sb.append(this.f1687a);
        sb.append(", title=");
        sb.append(this.f1688b);
        sb.append(", content=");
        return D1.h.h(sb, this.f1689c, ")");
    }
}
