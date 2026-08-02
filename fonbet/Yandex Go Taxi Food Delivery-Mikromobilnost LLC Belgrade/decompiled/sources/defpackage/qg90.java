package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qg90 {
    public final at0 a;
    public final g8l0 b;

    public qg90(at0 at0Var, g8l0 g8l0Var) {
        this.a = at0Var;
        this.b = g8l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg90)) {
            return false;
        }
        qg90 qg90Var = (qg90) obj;
        return this.a.equals(qg90Var.a) && this.b.equals(qg90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartialAddressDetailsLayout(layout=" + this.a + ", interval=" + this.b + Extension.C_BRAKE;
    }
}
