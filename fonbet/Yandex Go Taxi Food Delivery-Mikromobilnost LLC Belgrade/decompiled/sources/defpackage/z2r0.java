package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class z2r0 implements gr00 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public z2r0(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2r0)) {
            return false;
        }
        z2r0 z2r0Var = (z2r0) obj;
        return Float.compare(this.a, z2r0Var.a) == 0 && Float.compare(this.b, z2r0Var.b) == 0 && Float.compare(this.c, z2r0Var.c) == 0 && Float.compare(this.d, z2r0Var.d) == 0 && this.e == z2r0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("SetFocus(left=", this.a, ", top=", this.b, ", right=");
        vfc.x(k, this.c, ", bottom=", this.d, ", animate=");
        return x4e.i(k, this.e, Extension.C_BRAKE);
    }
}
