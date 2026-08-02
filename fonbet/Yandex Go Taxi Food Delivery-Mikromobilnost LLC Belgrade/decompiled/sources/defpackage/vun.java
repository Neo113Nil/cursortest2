package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vun {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public vun(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z && z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vun)) {
            return false;
        }
        vun vunVar = (vun) obj;
        return this.a == vunVar.a && jl40.l(this.b, vunVar.b) && jl40.l(this.c, vunVar.c) && jl40.l(this.d, vunVar.d) && jl40.l(this.e, vunVar.e) && jl40.l(this.f, vunVar.f) && jl40.l(this.g, vunVar.g) && jl40.l(this.h, vunVar.h) && jl40.l(this.i, vunVar.i) && this.j == vunVar.j && this.k == vunVar.k && this.l == vunVar.l;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return Boolean.hashCode(this.l) + unr0.e(unr0.e((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder k = x4e.k("EmployeeInfo(organizationId=", this.a, ", department=", this.b);
        g8e.D(k, ", position=", this.c, ", email=", this.d);
        g8e.D(k, ", phone=", this.e, ", workPhone=", this.f);
        g8e.D(k, ", nickname=", this.g, ", organizationName=", this.h);
        uw51.x(", guestOrganizationName=", this.i, ", isGuest=", k, this.j);
        n.z(", deleted=", ", isLegal=", k, this.k, this.l);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
