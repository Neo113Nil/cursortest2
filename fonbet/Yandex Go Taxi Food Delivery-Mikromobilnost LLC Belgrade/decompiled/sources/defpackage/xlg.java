package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xlg {
    public final boolean a;
    public final boolean b;

    public xlg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlg)) {
            return false;
        }
        xlg xlgVar = (xlg) obj;
        return this.a == xlgVar.a && this.b == xlgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("DashboardV1DivKitSkeletonsConfig(isEnabledOnCreditScreen=", ", isEnabledOnCreditAccountScreen=", Extension.C_BRAKE, this.a, this.b);
    }
}
