package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vs40 implements zs40 {
    public final lv90 a;

    public vs40(lv90 lv90Var) {
        this.a = lv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs40) && jl40.l(this.a, ((vs40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSummaryPaymentMethods(payment=" + this.a + Extension.C_BRAKE;
    }
}
