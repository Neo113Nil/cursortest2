package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yr40 extends zr40 {
    public final m1a0 a;
    public final lv90 b;

    public yr40(m1a0 m1a0Var, lv90 lv90Var) {
        this.a = m1a0Var;
        this.b = lv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr40)) {
            return false;
        }
        yr40 yr40Var = (yr40) obj;
        return jl40.l(this.a, yr40Var.a) && jl40.l(this.b, yr40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TaxiPaymentInfo(paymentInfo=" + this.a + ", paymentDto=" + this.b + Extension.C_BRAKE;
    }
}
