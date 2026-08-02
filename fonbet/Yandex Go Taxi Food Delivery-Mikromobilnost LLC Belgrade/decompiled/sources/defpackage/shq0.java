package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class shq0 {
    public final lea0 a;
    public final lea0 b;

    public shq0(lea0 lea0Var, lea0 lea0Var2) {
        this.a = lea0Var;
        this.b = lea0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shq0)) {
            return false;
        }
        shq0 shq0Var = (shq0) obj;
        return jl40.l(this.a, shq0Var.a) && jl40.l(this.b, shq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lea0 lea0Var = this.b;
        return hashCode + (lea0Var == null ? 0 : lea0Var.hashCode());
    }

    public final String toString() {
        return "SelectedPaymentMethod(mainPaymentMethod=" + this.a + ", complementPaymentMethod=" + this.b + Extension.C_BRAKE;
    }
}
