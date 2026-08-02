package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xl21 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;

    public xl21(String str, long j, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl21)) {
            return false;
        }
        xl21 xl21Var = (xl21) obj;
        return jl40.l(this.a, xl21Var.a) && this.b == xl21Var.b && jl40.l(this.c, xl21Var.c) && jl40.l(this.d, xl21Var.d) && jl40.l(this.e, xl21Var.e) && this.f == xl21Var.f && this.g == xl21Var.g && jl40.l(this.h, xl21Var.h) && jl40.l(this.i, xl21Var.i);
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int e = unr0.e(unr0.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.g);
        String str4 = this.h;
        int hashCode3 = (e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = x4e.l("UserEmployeeEntity(userId=", this.a, ", organizationId=", this.b);
        g8e.D(l, ", organizationName=", this.c, ", departmentName=", this.d);
        uw51.x(", position=", this.e, ", isGuest=", l, this.f);
        l.append(", deleted=");
        l.append(this.g);
        l.append(", guestOrganizationName=");
        l.append(this.h);
        return unr0.r(l, ", displayName=", this.i, Extension.C_BRAKE);
    }
}
