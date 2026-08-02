package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xg90 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;
    public final nbm h;
    public final int i;

    public xg90(float f, float f2, float f3, float f4, int i, float f5, float f6, nbm nbmVar, int i2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = f5;
        this.g = f6;
        this.h = nbmVar;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg90)) {
            return false;
        }
        xg90 xg90Var = (xg90) obj;
        return Float.compare(this.a, xg90Var.a) == 0 && Float.compare(this.b, xg90Var.b) == 0 && Float.compare(this.c, xg90Var.c) == 0 && Float.compare(this.d, xg90Var.d) == 0 && this.e == xg90Var.e && Float.compare(this.f, xg90Var.f) == 0 && Float.compare(this.g, xg90Var.g) == 0 && jl40.l(this.h, xg90Var.h) && this.i == xg90Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.a.hashCode() + g8e.c(this.g, g8e.c(this.f, oyr.b(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("Particle(x=", this.a, ", y=", this.b, ", width=");
        vfc.x(k, this.c, ", height=", this.d, ", color=");
        k.append(this.e);
        k.append(", rotation=");
        k.append(this.f);
        k.append(", scaleX=");
        k.append(this.g);
        k.append(", shape=");
        k.append(this.h);
        k.append(", alpha=");
        return oyr.m(this.i, Extension.C_BRAKE, k);
    }
}
