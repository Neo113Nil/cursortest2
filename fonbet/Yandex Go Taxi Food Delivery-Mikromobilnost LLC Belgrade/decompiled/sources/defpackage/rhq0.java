package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class rhq0 {
    public final edi0 a;
    public final edi0 b;

    public rhq0(edi0 edi0Var, edi0 edi0Var2) {
        this.a = edi0Var;
        this.b = edi0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhq0)) {
            return false;
        }
        rhq0 rhq0Var = (rhq0) obj;
        return jl40.l(this.a, rhq0Var.a) && jl40.l(this.b, rhq0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        edi0 edi0Var = this.b;
        return hashCode + (edi0Var == null ? 0 : edi0Var.hashCode());
    }

    public final String toString() {
        return "SelectedPaymentForPmlScreen(mainSelectedPayment=" + this.a + ", complementSelectedPayment=" + this.b + Extension.C_BRAKE;
    }
}
