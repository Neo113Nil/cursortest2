package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ttt0 {
    public final stt0 a;
    public final rtt0 b;

    public ttt0(stt0 stt0Var, rtt0 rtt0Var) {
        this.a = stt0Var;
        this.b = rtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttt0)) {
            return false;
        }
        ttt0 ttt0Var = (ttt0) obj;
        return this.a.equals(ttt0Var.a) && jl40.l(this.b, ttt0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rtt0 rtt0Var = this.b;
        return hashCode + (rtt0Var == null ? 0 : rtt0Var.hashCode());
    }

    public final String toString() {
        return "SplitDepositPageData(paymentStatusScreen=" + this.a + ", autoTopupData=" + this.b + Extension.C_BRAKE;
    }
}
