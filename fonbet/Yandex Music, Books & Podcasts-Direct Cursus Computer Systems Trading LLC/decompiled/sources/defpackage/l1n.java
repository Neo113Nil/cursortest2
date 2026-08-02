package defpackage;

/* loaded from: classes4.dex */
public final class l1n {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public l1n(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1n)) {
            return false;
        }
        l1n l1nVar = (l1n) obj;
        return this.a.equals(l1nVar.a) && this.b.equals(l1nVar.b) && this.c.equals(l1nVar.c) && this.d.equals(l1nVar.d) && this.e.equals(l1nVar.e) && this.f == l1nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PultBannerData(id=", this.a, ", title=", this.b, ", subtitle=");
        su4.v(m, this.c, ", button=", this.d, ", buttonUrl=");
        m.append(this.e);
        m.append(", viewBro=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
