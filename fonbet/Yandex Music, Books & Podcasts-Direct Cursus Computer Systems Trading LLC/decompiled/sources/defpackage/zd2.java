package defpackage;

/* loaded from: classes3.dex */
public final class zd2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final pt0 f;

    public zd2(String str, String str2, String str3, String str4, int i, pt0 pt0Var) {
        if (str == null) {
            jj4.j("Null appIdentifier");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            jj4.j("Null versionCode");
            throw null;
        }
        this.b = str2;
        if (str3 == null) {
            jj4.j("Null versionName");
            throw null;
        }
        this.c = str3;
        if (str4 == null) {
            jj4.j("Null installUuid");
            throw null;
        }
        this.d = str4;
        this.e = i;
        this.f = pt0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zd2)) {
            return false;
        }
        zd2 zd2Var = (zd2) obj;
        return this.a.equals(zd2Var.a) && this.b.equals(zd2Var.b) && this.c.equals(zd2Var.c) && this.d.equals(zd2Var.d) && this.e == zd2Var.e && this.f.equals(zd2Var.f);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
