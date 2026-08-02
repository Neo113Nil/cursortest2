package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w5k0 {
    public final int a;
    public final int b;

    public w5k0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5k0)) {
            return false;
        }
        w5k0 w5k0Var = (w5k0) obj;
        return this.a == w5k0Var.a && this.b == w5k0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "HeaderGradient(topColor=", ", bottomColor=", Extension.C_BRAKE);
    }
}
