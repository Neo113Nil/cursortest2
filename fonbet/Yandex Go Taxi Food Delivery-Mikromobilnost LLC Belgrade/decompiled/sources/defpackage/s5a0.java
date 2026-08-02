package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class s5a0 implements c6a0 {
    public final lea0 a;

    public s5a0(lea0 lea0Var) {
        this.a = lea0Var;
    }

    public final lea0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5a0) && jl40.l(this.a, ((s5a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeletePayment(paymentModel=" + this.a + Extension.C_BRAKE;
    }
}
