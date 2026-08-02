package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vwa0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public vwa0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwa0)) {
            return false;
        }
        vwa0 vwa0Var = (vwa0) obj;
        return jl40.l(this.a, vwa0Var.a) && jl40.l(this.b, vwa0Var.b) && jl40.l(this.c, vwa0Var.c) && jl40.l(this.d, vwa0Var.d) && jl40.l(this.e, vwa0Var.e) && jl40.l(this.f, vwa0Var.f) && jl40.l(this.g, vwa0Var.g) && jl40.l(this.h, vwa0Var.h);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return this.h.hashCode() + unr0.b((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("Performer(name=", this.a, ", shortName=", this.b, ", vehicleModel=");
        g8e.D(v, this.c, ", vehicleNumber=", this.d, ", rating=");
        g8e.D(v, this.e, ", photoUrl=", this.f, ", imageTagDefault=");
        return g8e.r(v, this.g, ", phone=", this.h, Extension.C_BRAKE);
    }
}
