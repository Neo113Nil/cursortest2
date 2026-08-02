package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class we01 {
    public final rr51 a;
    public final rr51 b;
    public final ve01 c;

    public we01(rr51 rr51Var, rr51 rr51Var2, ve01 ve01Var) {
        this.a = rr51Var;
        this.b = rr51Var2;
        this.c = ve01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we01)) {
            return false;
        }
        we01 we01Var = (we01) obj;
        return jl40.l(this.a, we01Var.a) && jl40.l(this.b, we01Var.b) && jl40.l(this.c, we01Var.c);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int hashCode = (rr51Var == null ? 0 : rr51Var.hashCode()) * 31;
        rr51 rr51Var2 = this.b;
        int hashCode2 = (hashCode + (rr51Var2 == null ? 0 : rr51Var2.hashCode())) * 31;
        ve01 ve01Var = this.c;
        return hashCode2 + (ve01Var != null ? ve01Var.hashCode() : 0);
    }

    public final String toString() {
        return "TransactionsFeedFiltersEntity(headerDivData=" + this.a + ", filtersDivData=" + this.b + ", toolbarData=" + this.c + Extension.C_BRAKE;
    }
}
