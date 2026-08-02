package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uo31 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;

    public uo31(float f, float f2, float f3, float f4, float f5, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo31)) {
            return false;
        }
        uo31 uo31Var = (uo31) obj;
        return Float.compare(this.a, uo31Var.a) == 0 && Float.compare(this.b, uo31Var.b) == 0 && Float.compare(this.c, uo31Var.c) == 0 && Float.compare(this.d, uo31Var.d) == 0 && Float.compare(this.e, uo31Var.e) == 0 && this.f == uo31Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("ViewAnimationState(alpha=", this.a, ", scaleX=", this.b, ", scaleY=");
        vfc.x(k, this.c, ", translationX=", this.d, ", translationY=");
        k.append(this.e);
        k.append(", bottomPadding=");
        k.append(this.f);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }

    public uo31() {
        this(1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0);
    }
}
