package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z021 {
    public static final z021 e = new z021(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public z021(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z021)) {
            return false;
        }
        z021 z021Var = (z021) obj;
        return this.a == z021Var.a && this.b == z021Var.b && this.c == z021Var.c && this.d == z021Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", footerTop=", Extension.C_BRAKE, b64.s(this.a, this.b, "UniversalQrScannerScreenConfig(width=", ", height=", ", headerBottom="));
    }
}
