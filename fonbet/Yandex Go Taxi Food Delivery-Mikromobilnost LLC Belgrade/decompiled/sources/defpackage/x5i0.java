package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class x5i0 {
    public final float a;
    public final int b;

    public x5i0(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5i0)) {
            return false;
        }
        x5i0 x5i0Var = (x5i0) obj;
        return Float.compare(this.a, x5i0Var.a) == 0 && this.b == x5i0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RadialGradientColor(position=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
