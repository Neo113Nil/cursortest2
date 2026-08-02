package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ru3 implements su3 {
    public final thq0 a;

    public ru3(thq0 thq0Var) {
        this.a = thq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru3) && jl40.l(this.a, ((ru3) obj).a);
    }

    public final int hashCode() {
        thq0 thq0Var = this.a;
        if (thq0Var == null) {
            return 0;
        }
        return thq0Var.hashCode();
    }

    public final String toString() {
        return "SelectPaymentOption(newSelectedMethod=" + this.a + Extension.C_BRAKE;
    }

    public ru3() {
        this(null);
    }
}
