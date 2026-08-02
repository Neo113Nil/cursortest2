package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class wgi {
    public final boolean a;
    public final boolean b;

    public wgi(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgi)) {
            return false;
        }
        wgi wgiVar = (wgi) obj;
        return this.a == wgiVar.a && this.b == wgiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("DeliveryPaidInsuranceExperimentData(forceUseSavedState=", ", enabledByDefault=", Extension.C_BRAKE, this.a, this.b);
    }
}
