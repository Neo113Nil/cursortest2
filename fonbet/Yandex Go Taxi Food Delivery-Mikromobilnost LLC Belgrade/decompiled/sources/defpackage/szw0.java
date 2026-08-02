package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class szw0 {
    public static final szw0 d = new szw0(52.0f, 32.0f, 29.0f);
    public final float a;
    public final float b;
    public final float c;

    public szw0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szw0)) {
            return false;
        }
        szw0 szw0Var = (szw0) obj;
        return y7m.b(this.a, szw0Var.a) && y7m.b(this.b, szw0Var.b) && y7m.b(this.c, szw0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String c = y7m.c(this.a);
        String c2 = y7m.c(this.b);
        return oyr.t(b64.v("SwitchSize(width=", c, ", height=", c2, ", circleSize="), y7m.c(this.c), Extension.C_BRAKE);
    }
}
