package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xr0 {
    public final bgq0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xr0(bgq0 bgq0Var, String str, String str2, String str3, String str4, String str5) {
        this.a = bgq0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0)) {
            return false;
        }
        xr0 xr0Var = (xr0) obj;
        return jl40.l(this.a, xr0Var.a) && jl40.l(this.b, xr0Var.b) && jl40.l(this.c, xr0Var.c) && jl40.l(this.d, xr0Var.d) && jl40.l(this.e, xr0Var.e) && jl40.l(this.f, xr0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressCorrection(contact=");
        sb.append(this.a);
        sb.append(", floor=");
        sb.append(this.b);
        sb.append(", apartment=");
        g8e.D(sb, this.c, ", doorPhone=", this.d, ", porch=");
        return g8e.r(sb, this.e, ", commentCourier=", this.f, Extension.C_BRAKE);
    }
}
