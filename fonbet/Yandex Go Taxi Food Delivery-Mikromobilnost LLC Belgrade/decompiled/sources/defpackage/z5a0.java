package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class z5a0 implements c6a0 {
    public final lea0 a;

    public z5a0(lea0 lea0Var) {
        this.a = lea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5a0) && jl40.l(this.a, ((z5a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectPayment(paymentModel=" + this.a + Extension.C_BRAKE;
    }
}
