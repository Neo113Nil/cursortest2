package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xps0 {
    public final float a;
    public final float b;

    public xps0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xps0)) {
            return false;
        }
        xps0 xps0Var = (xps0) obj;
        return Float.compare(this.a, xps0Var.a) == 0 && Float.compare(this.b, xps0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Content(xOffset=", this.a, ", yOffset=", this.b, Extension.C_BRAKE);
    }
}
