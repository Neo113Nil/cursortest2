package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vh71 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public vh71(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i3 * i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh71)) {
            return false;
        }
        vh71 vh71Var = (vh71) obj;
        return this.a == vh71Var.a && this.b == vh71Var.b && this.c == vh71Var.c && this.d == vh71Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fia1.b(this.c, fia1.b(this.b, Integer.hashCode(this.a) * 31));
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", height=", Extension.C_BRAKE, b64.s(this.a, this.b, "SmartCenter(x=", ", y=", ", width="));
    }
}
