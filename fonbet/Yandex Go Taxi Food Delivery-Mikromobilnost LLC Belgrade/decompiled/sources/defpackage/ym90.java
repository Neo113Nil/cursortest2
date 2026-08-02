package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ym90 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public ym90(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = z2;
        this.j = z3;
    }

    public final String a() {
        return this.h;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.g;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym90)) {
            return false;
        }
        ym90 ym90Var = (ym90) obj;
        return this.a == ym90Var.a && jl40.l(this.b, ym90Var.b) && jl40.l(this.c, ym90Var.c) && jl40.l(this.d, ym90Var.d) && jl40.l(this.e, ym90Var.e) && jl40.l(this.f, ym90Var.f) && this.g == ym90Var.g && jl40.l(this.h, ym90Var.h) && this.i == ym90Var.i && this.j == ym90Var.j;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final long h() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode3 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int e = unr0.e((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.g);
        String str5 = this.h;
        return Boolean.hashCode(this.j) + unr0.e((e + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.i);
    }

    public final boolean i() {
        return this.j;
    }

    public final String toString() {
        StringBuilder k = x4e.k("PassportAccountInfo(uid=", this.a, ", lastName=", this.b);
        g8e.D(k, ", firstName=", this.c, ", primaryDisplayName=", this.d);
        g8e.D(k, ", secondaryDisplayName=", this.e, ", email=", this.f);
        k.append(", hasPlus=");
        k.append(this.g);
        k.append(", avatarUrl=");
        k.append(this.h);
        n.z(", isYandexoid=", ", isAuthorized=", k, this.i, this.j);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
