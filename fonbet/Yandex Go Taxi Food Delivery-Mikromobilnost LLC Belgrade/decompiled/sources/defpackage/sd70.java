package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sd70 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sd70(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd70)) {
            return false;
        }
        sd70 sd70Var = (sd70) obj;
        return Float.compare(this.a, sd70Var.a) == 0 && Float.compare(this.b, sd70Var.b) == 0 && Float.compare(this.c, sd70Var.c) == 0 && Float.compare(this.d, sd70Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("Offset(pinX=", this.a, ", pinY=", this.b, ", smallPinX="), this.c, ", smallPinY=", this.d, Extension.C_BRAKE);
    }
}
