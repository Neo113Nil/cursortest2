package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rtt0 {
    public final ptt0 a;
    public final ott0 b;
    public final String c;
    public final String d;
    public final qtt0 e;
    public final ntt0 f;

    public rtt0(ptt0 ptt0Var, ott0 ott0Var, String str, String str2, qtt0 qtt0Var, ntt0 ntt0Var) {
        this.a = ptt0Var;
        this.b = ott0Var;
        this.c = str;
        this.d = str2;
        this.e = qtt0Var;
        this.f = ntt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtt0)) {
            return false;
        }
        rtt0 rtt0Var = (rtt0) obj;
        return this.a.equals(rtt0Var.a) && this.b.equals(rtt0Var.b) && jl40.l(this.c, rtt0Var.c) && jl40.l(this.d, rtt0Var.d) && this.e.equals(rtt0Var.e) && this.f.equals(rtt0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupData(statusScreen=");
        sb.append(this.a);
        sb.append(", paymentMethodsBottomSheet=");
        sb.append(this.b);
        sb.append(", targetAgreementId=");
        g8e.D(sb, this.c, ", externalMemberConfirmationDeeplink=", this.d, ", walletPaymentMethodData=");
        sb.append(this.e);
        sb.append(", autoTopupSettings=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
