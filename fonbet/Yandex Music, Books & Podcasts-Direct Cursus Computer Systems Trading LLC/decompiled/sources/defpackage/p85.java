package defpackage;

/* loaded from: classes4.dex */
public final class p85 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public p85(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static p85 a(p85 p85Var, float f, float f2, int i) {
        float f3 = p85Var.a;
        if ((i & 2) != 0) {
            f = p85Var.b;
        }
        if ((i & 4) != 0) {
            f2 = p85Var.c;
        }
        float f4 = (i & 8) != 0 ? p85Var.d : 1.0f;
        p85Var.getClass();
        return new p85(f3, f, f2, f4);
    }

    public final long b() {
        int i = d85.o;
        return mvt.z(this.a, this.b, this.c, this.d, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p85)) {
            return false;
        }
        p85 p85Var = (p85) obj;
        return Float.compare(this.a, p85Var.a) == 0 && Float.compare(this.b, p85Var.b) == 0 && Float.compare(this.c, p85Var.c) == 0 && Float.compare(this.d, p85Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "ColorHSL(hue=" + this.a + ", saturation=" + this.b + ", lightness=" + this.c + ", alpha=" + this.d + ")";
    }

    public /* synthetic */ p85(float f, float f2) {
        this(16.0f, f, f2, 1.0f);
    }
}
