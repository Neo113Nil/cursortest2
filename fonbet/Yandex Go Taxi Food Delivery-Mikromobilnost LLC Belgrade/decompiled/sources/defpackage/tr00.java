package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tr00 implements vr00 {
    public final q6y0 a;

    public tr00(q6y0 q6y0Var) {
        this.a = q6y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr00) && this.a.equals(((tr00) obj).a);
    }

    @Override // defpackage.vr00
    public final w201 getModel() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TaxiOrder(model=" + this.a + Extension.C_BRAKE;
    }
}
