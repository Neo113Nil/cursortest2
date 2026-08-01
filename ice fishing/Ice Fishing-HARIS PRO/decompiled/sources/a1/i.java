package a1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1698b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1699c;

    public i(int i, String str, String str2) {
        this.f1697a = i;
        this.f1698b = str;
        this.f1699c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1697a == iVar.f1697a && this.f1698b.equals(iVar.f1698b) && this.f1699c.equals(iVar.f1699c);
    }

    public final int hashCode() {
        return this.f1699c.hashCode() + D1.h.b(this.f1698b, Integer.hashCode(this.f1697a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaqItem(id=");
        sb.append(this.f1697a);
        sb.append(", question=");
        sb.append(this.f1698b);
        sb.append(", answer=");
        return D1.h.h(sb, this.f1699c, ")");
    }
}
