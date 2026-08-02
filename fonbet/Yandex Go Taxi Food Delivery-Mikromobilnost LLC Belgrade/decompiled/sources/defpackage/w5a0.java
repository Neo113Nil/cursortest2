package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w5a0 implements c6a0 {
    public final lea0 a;
    public final bw90 b;

    public w5a0(lea0 lea0Var, bw90 bw90Var) {
        this.a = lea0Var;
        this.b = bw90Var;
    }

    public final bw90 a() {
        return this.b;
    }

    public final lea0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5a0)) {
            return false;
        }
        w5a0 w5a0Var = (w5a0) obj;
        return jl40.l(this.a, w5a0Var.a) && jl40.l(this.b, w5a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPaymentDetails(paymentModel=" + this.a + ", paymentAvailability=" + this.b + Extension.C_BRAKE;
    }
}
