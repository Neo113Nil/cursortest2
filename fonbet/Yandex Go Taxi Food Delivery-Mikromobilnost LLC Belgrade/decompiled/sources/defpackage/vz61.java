package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vz61 {
    public final int a;
    public final boolean b;

    public vz61(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz61)) {
            return false;
        }
        vz61 vz61Var = (vz61) obj;
        return this.a == vz61Var.a && this.b == vz61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.a + ", disabled=" + this.b + Extension.C_BRAKE;
    }
}
