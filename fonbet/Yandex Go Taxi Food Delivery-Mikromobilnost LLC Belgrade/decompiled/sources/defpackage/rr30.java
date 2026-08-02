package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class rr30 {
    public final int a;
    public final int b;

    public rr30(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr30)) {
            return false;
        }
        rr30 rr30Var = (rr30) obj;
        return this.a == rr30Var.a && this.b == rr30Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "MtPaymentIconBackgroundColor(light=", ", dark=", Extension.C_BRAKE);
    }
}
