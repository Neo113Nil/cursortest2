package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u33 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public u33(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u33)) {
            return false;
        }
        u33 u33Var = (u33) obj;
        return this.a == u33Var.a && this.b == u33Var.b && this.c == u33Var.c && this.d == u33Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", depthCm=", Extension.C_BRAKE, b64.s(this.a, this.b, "ArSmartCameraBoxSize(id=", ", heightCm=", ", widthCm="));
    }
}
