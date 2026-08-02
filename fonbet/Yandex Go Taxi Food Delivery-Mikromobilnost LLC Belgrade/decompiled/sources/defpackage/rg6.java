package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rg6 implements ug6 {
    public final h5a0 a;

    public rg6(h5a0 h5a0Var) {
        this.a = h5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg6) && jl40.l(this.a, ((rg6) obj).a);
    }

    public final int hashCode() {
        h5a0 h5a0Var = this.a;
        if (h5a0Var == null) {
            return 0;
        }
        return h5a0Var.hashCode();
    }

    public final String toString() {
        return "PaymentMethodSelection(selectedPaymentMethod=" + this.a + Extension.C_BRAKE;
    }

    public rg6() {
        this(null);
    }
}
