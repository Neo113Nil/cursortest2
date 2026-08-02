package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vo4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public vo4(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo4)) {
            return false;
        }
        vo4 vo4Var = (vo4) obj;
        return Float.compare(this.a, vo4Var.a) == 0 && Float.compare(this.b, vo4Var.b) == 0 && Float.compare(this.c, vo4Var.c) == 0 && Float.compare(this.d, vo4Var.d) == 0 && Float.compare(this.e, vo4Var.e) == 0 && Float.compare(this.f, vo4Var.f) == 0 && Float.compare(this.g, vo4Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + g8e.c(this.f, g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("BalloonParams(sizeCornerLeg=", this.a, ", sizeCornerLegInnerPart=", this.b, ", widthCenterLeg=");
        vfc.x(k, this.c, ", heightCenterLeg=", this.d, ", legOffset=");
        vfc.x(k, this.e, ", cornerRadius=", this.f, ", legTipThickness=");
        return uw51.i(k, this.g, Extension.C_BRAKE);
    }
}
