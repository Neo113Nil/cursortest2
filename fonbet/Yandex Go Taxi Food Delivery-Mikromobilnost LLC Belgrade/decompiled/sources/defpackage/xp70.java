package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xp70 implements fq70 {
    public final o2y0 a;
    public final boolean b;

    public xp70(o2y0 o2y0Var, boolean z) {
        this.a = o2y0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp70)) {
            return false;
        }
        xp70 xp70Var = (xp70) obj;
        return jl40.l(this.a, xp70Var.a) && this.b == xp70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReturnToSummary(orderHolder=" + this.a + ", showPayments=" + this.b + Extension.C_BRAKE;
    }
}
