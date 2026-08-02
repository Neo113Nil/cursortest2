package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vm21 {
    public final double a;
    public final int b;

    public vm21(double d, int i) {
        this.a = d;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm21)) {
            return false;
        }
        vm21 vm21Var = (vm21) obj;
        return Double.compare(this.a, vm21Var.a) == 0 && this.b == vm21Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FingerprintMagnetometerSnapshot(field=" + this.a + ", accuracy=" + this.b + Extension.C_BRAKE;
    }
}
