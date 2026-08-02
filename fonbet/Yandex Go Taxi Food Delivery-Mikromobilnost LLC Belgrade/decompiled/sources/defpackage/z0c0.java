package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class z0c0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public z0c0(int i, int i2, int i3, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0c0)) {
            return false;
        }
        z0c0 z0c0Var = (z0c0) obj;
        return this.a == z0c0Var.a && this.b == z0c0Var.b && this.c == z0c0Var.c && this.d == z0c0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", contentColor=", Extension.C_BRAKE, xvz.p("PinV1Style(isSource=", this.b, ", circleColor=", ", columnColor=", this.a));
    }
}
