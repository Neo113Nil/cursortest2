package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xo01 {
    public final int a;
    public final int b;

    public xo01(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo01)) {
            return false;
        }
        xo01 xo01Var = (xo01) obj;
        return this.a == xo01Var.a && this.b == xo01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "SelectedTime(hour=", ", minute=", Extension.C_BRAKE);
    }
}
