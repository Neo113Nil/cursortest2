package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class sgx0 {
    public final String a;
    public final is60 b;

    public sgx0(String str, is60 is60Var) {
        this.a = str;
        this.b = is60Var;
    }

    public final boolean a(pex0 pex0Var) {
        return jl40.l(this.a, pex0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgx0)) {
            return false;
        }
        sgx0 sgx0Var = (sgx0) obj;
        return jl40.l(this.a, sgx0Var.a) && jl40.l(this.b, sgx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffOffer(tariffClass=" + this.a + ", offer=" + this.b + Extension.C_BRAKE;
    }
}
