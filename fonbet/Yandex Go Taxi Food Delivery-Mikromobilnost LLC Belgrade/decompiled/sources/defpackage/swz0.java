package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class swz0 {
    public final BigDecimal a;
    public final String b;

    public swz0(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swz0)) {
            return false;
        }
        swz0 swz0Var = (swz0) obj;
        return jl40.l(this.a, swz0Var.a) && jl40.l(this.b, swz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopUpCardDeposit(amount=" + this.a + ", currency=" + this.b + Extension.C_BRAKE;
    }

    public swz0() {
        this(BigDecimal.ZERO, "");
    }
}
