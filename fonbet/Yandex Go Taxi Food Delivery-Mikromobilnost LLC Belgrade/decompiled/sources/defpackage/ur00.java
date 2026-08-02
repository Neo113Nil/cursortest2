package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ur00 implements vr00 {
    public final z4y0 a;

    public ur00(z4y0 z4y0Var) {
        this.a = z4y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur00) && this.a.equals(((ur00) obj).a);
    }

    @Override // defpackage.vr00
    public final w201 getModel() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TaxiOrderRideCardCompact(model=" + this.a + Extension.C_BRAKE;
    }
}
