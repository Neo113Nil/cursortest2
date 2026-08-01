package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f1714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1715b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1716c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1717d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1718f;

    /* renamed from: g, reason: collision with root package name */
    public final List f1719g;

    public m(int i, String str, String str2, String str3, String str4, String str5, List list) {
        this.f1714a = i;
        this.f1715b = str;
        this.f1716c = str2;
        this.f1717d = str3;
        this.e = str4;
        this.f1718f = str5;
        this.f1719g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1714a == mVar.f1714a && this.f1715b.equals(mVar.f1715b) && this.f1716c.equals(mVar.f1716c) && this.f1717d.equals(mVar.f1717d) && this.e.equals(mVar.e) && this.f1718f.equals(mVar.f1718f) && this.f1719g.equals(mVar.f1719g);
    }

    public final int hashCode() {
        return this.f1719g.hashCode() + D1.h.b(this.f1718f, D1.h.b(this.e, D1.h.b(this.f1717d, D1.h.b(this.f1716c, D1.h.b(this.f1715b, Integer.hashCode(this.f1714a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "OrgStructure(id=" + this.f1714a + ", title=" + this.f1715b + ", description=" + this.f1716c + ", pros=" + this.f1717d + ", cons=" + this.e + ", whenToUse=" + this.f1718f + ", levels=" + this.f1719g + ")";
    }
}
