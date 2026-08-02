package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zbj0 {
    public final xu0 a;
    public final xu0 b;
    public final String c;
    public final nbj0 d;

    public zbj0(xu0 xu0Var, xu0 xu0Var2, String str, nbj0 nbj0Var) {
        this.a = xu0Var;
        this.b = xu0Var2;
        this.c = str;
        this.d = nbj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbj0)) {
            return false;
        }
        zbj0 zbj0Var = (zbj0) obj;
        return this.a.equals(zbj0Var.a) && jl40.l(this.b, zbj0Var.b) && this.c.equals(zbj0Var.c) && jl40.l(this.d, zbj0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xu0 xu0Var = this.b;
        int b = unr0.b((hashCode + (xu0Var == null ? 0 : xu0Var.hashCode())) * 31, 31, this.c);
        nbj0 nbj0Var = this.d;
        return b + (nbj0Var != null ? nbj0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequirementAddressFormInfo(sourceAddress=" + this.a + ", destinationAddress=" + this.b + ", comment=" + this.c + ", contact=" + this.d + Extension.C_BRAKE;
    }
}
