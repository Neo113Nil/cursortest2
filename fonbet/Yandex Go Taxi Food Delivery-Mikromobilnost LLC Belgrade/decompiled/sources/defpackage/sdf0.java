package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sdf0 extends tdf0 {
    public final String a;
    public final rdf0 b;
    public final w4v c;
    public final String d;
    public final hhg e;
    public final boolean f;
    public final ifa0 g;

    public sdf0(String str, rdf0 rdf0Var, w4v w4vVar, String str2, hhg hhgVar, boolean z, ifa0 ifa0Var) {
        this.a = str;
        this.b = rdf0Var;
        this.c = w4vVar;
        this.d = str2;
        this.e = hhgVar;
        this.f = z;
        this.g = ifa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdf0)) {
            return false;
        }
        sdf0 sdf0Var = (sdf0) obj;
        return jl40.l(this.a, sdf0Var.a) && jl40.l(this.b, sdf0Var.b) && jl40.l(this.c, sdf0Var.c) && jl40.l(this.d, sdf0Var.d) && jl40.l(this.e, sdf0Var.e) && this.f == sdf0Var.f && jl40.l(this.g, sdf0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rdf0 rdf0Var = this.b;
        int hashCode2 = (hashCode + (rdf0Var == null ? 0 : rdf0Var.hashCode())) * 31;
        w4v w4vVar = this.c;
        int hashCode3 = (hashCode2 + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31;
        String str = this.d;
        int e = unr0.e((this.e.hashCode() + ((hashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
        ifa0 ifa0Var = this.g;
        return e + (ifa0Var != null ? ifa0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ExistingProfileModel(title=" + this.a + ", description=" + this.b + ", iconModel=" + this.c + ", corpClientId=" + this.d + ", actionModel=" + this.e + ", isEnabled=" + this.f + ", paymentOptions=" + this.g + Extension.C_BRAKE;
    }
}
