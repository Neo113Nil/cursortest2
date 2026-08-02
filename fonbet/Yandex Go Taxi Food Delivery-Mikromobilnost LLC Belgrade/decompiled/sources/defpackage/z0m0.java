package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z0m0 {
    public final double a;
    public final double b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;

    public z0m0(double d, double d2, String str, List list, String str2, String str3) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = str3;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f;
    }

    public final double d() {
        return this.a;
    }

    public final double e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0m0)) {
            return false;
        }
        z0m0 z0m0Var = (z0m0) obj;
        return Double.compare(this.a, z0m0Var.a) == 0 && Double.compare(this.b, z0m0Var.b) == 0 && this.c.equals(z0m0Var.c) && this.d.equals(z0m0Var.d) && jl40.l(this.e, z0m0Var.e) && jl40.l(this.f, z0m0Var.f);
    }

    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "SaveToFavoritesDeeplink(lat=", ", lon=");
        u.append(this.b);
        u.append(", fullText=");
        u.append(this.c);
        u.append(", availableTypes=");
        u.append(this.d);
        u.append(", source=");
        u.append(this.e);
        return unr0.r(u, ", keySet=", this.f, Extension.C_BRAKE);
    }
}
