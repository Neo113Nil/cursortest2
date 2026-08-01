package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1695d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1696f;

    public h(String str, String str2, String str3, String str4, List list, List list2) {
        this.f1692a = str;
        this.f1693b = str2;
        this.f1694c = str3;
        this.f1695d = str4;
        this.e = list;
        this.f1696f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return D1.i.a(this.f1692a, hVar.f1692a) && D1.i.a(this.f1693b, hVar.f1693b) && D1.i.a(this.f1694c, hVar.f1694c) && D1.i.a(this.f1695d, hVar.f1695d) && D1.i.a(this.e, hVar.e) && D1.i.a(this.f1696f, hVar.f1696f);
    }

    public final int hashCode() {
        return this.f1696f.hashCode() + ((this.e.hashCode() + D1.h.b(this.f1695d, D1.h.b(this.f1694c, D1.h.b(this.f1693b, this.f1692a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "DiagnosticResult(level=" + this.f1692a + ", emoji=" + this.f1693b + ", colorRes=" + this.f1694c + ", description=" + this.f1695d + ", recommendations=" + this.e + ", improvements=" + this.f1696f + ")";
    }
}
