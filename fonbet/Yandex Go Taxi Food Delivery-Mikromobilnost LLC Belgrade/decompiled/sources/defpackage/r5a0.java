package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class r5a0 implements c6a0 {
    public final vi0 a;

    public r5a0(vi0 vi0Var) {
        this.a = vi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5a0) && jl40.l(this.a, ((r5a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddPayment(addPaymentModel=" + this.a + Extension.C_BRAKE;
    }
}
