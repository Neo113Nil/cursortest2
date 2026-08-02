package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class z7b0 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;

    public z7b0(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = str7;
        z83.i();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7b0)) {
            return false;
        }
        z7b0 z7b0Var = (z7b0) obj;
        return this.a == z7b0Var.a && jl40.l(this.b, z7b0Var.b) && this.c == z7b0Var.c && jl40.l(this.d, z7b0Var.d) && jl40.l(this.e, z7b0Var.e) && jl40.l(this.f, z7b0Var.f) && jl40.l(this.g, z7b0Var.g) && jl40.l(this.h, z7b0Var.h) && this.i == z7b0Var.i && this.j == z7b0Var.j && this.k == z7b0Var.k && this.l == z7b0Var.l && jl40.l(this.m, z7b0Var.m);
    }

    public final int hashCode() {
        int c = qv10.c(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int b = unr0.b((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.b((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        String str4 = this.m;
        return e + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("PersonalUserInfoEntity(rowId=", this.a, ", userId=", this.b);
        x4e.A(this.c, ", version=", ", avatarUrl=", k);
        g8e.D(k, this.d, ", displayName=", this.e, ", nickname=");
        g8e.D(k, this.f, ", phone=", this.g, ", registrationStatus=");
        tse0.y(this.h, ", isEmpty=", ", isCorporate=", k, this.i);
        nnm.v(", isOnboarded=", ", needsMigrationOnboarding=", k, this.j, this.k);
        return n.m(", accountType=", this.m, Extension.C_BRAKE, k, this.l);
    }
}
