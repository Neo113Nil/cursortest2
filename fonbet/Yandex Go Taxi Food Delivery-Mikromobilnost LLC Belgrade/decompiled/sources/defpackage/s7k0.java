package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s7k0 {
    public final m1a0 a;
    public final z0a0 b;

    public s7k0(m1a0 m1a0Var, z0a0 z0a0Var) {
        this.a = m1a0Var;
        this.b = z0a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7k0)) {
            return false;
        }
        s7k0 s7k0Var = (s7k0) obj;
        return jl40.l(this.a, s7k0Var.a) && this.b.equals(s7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentButtonUiState(paymentInfo=" + this.a + ", paymentIconLoader=" + this.b + Extension.C_BRAKE;
    }
}
