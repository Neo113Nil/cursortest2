package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tdt0 implements vdt0 {
    public final int a;
    public final int b;

    public tdt0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdt0)) {
            return false;
        }
        tdt0 tdt0Var = (tdt0) obj;
        return this.a == tdt0Var.a && this.b == tdt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "Padding(horizontalPadding=", ", verticalPadding=", Extension.C_BRAKE);
    }
}
