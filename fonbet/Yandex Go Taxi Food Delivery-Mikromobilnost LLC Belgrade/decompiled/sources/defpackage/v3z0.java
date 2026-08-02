package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v3z0 extends w3z0 {
    public final u2z0 a;
    public final String b;
    public final String c;
    public final String d;
    public final wp2 e;
    public final boolean f;
    public final boolean g;

    public v3z0(u2z0 u2z0Var, String str, String str2, String str3, wp2 wp2Var, boolean z, boolean z2) {
        this.a = u2z0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = wp2Var;
        this.f = z;
        this.g = z2;
    }

    public static v3z0 a(v3z0 v3z0Var, u2z0 u2z0Var, String str, boolean z, boolean z2) {
        String str2 = v3z0Var.c;
        String str3 = v3z0Var.d;
        wp2 wp2Var = v3z0Var.e;
        v3z0Var.getClass();
        return new v3z0(u2z0Var, str, str2, str3, wp2Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3z0)) {
            return false;
        }
        v3z0 v3z0Var = (v3z0) obj;
        return this.a.equals(v3z0Var.a) && jl40.l(this.b, v3z0Var.b) && jl40.l(this.c, v3z0Var.c) && jl40.l(this.d, v3z0Var.d) && jl40.l(this.e, v3z0Var.e) && this.f == v3z0Var.f && this.g == v3z0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + unr0.e(n.b(this.e, unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveBenefit(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", coupon=");
        g8e.D(sb, this.c, ", activatedText=", this.d, ", color=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isEnabled=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
