package defpackage;

/* loaded from: classes3.dex */
public final class prj {
    public final float a;
    public final float b;
    public final q0k c;
    public final float d;

    public prj(float f, float f2, q0k q0kVar, float f3) {
        this.a = f;
        this.b = f2;
        this.c = q0kVar;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prj)) {
            return false;
        }
        prj prjVar = (prj) obj;
        return cma.a(this.a, prjVar.a) && Float.compare(this.b, prjVar.b) == 0 && this.c.equals(prjVar.c) && cma.a(this.d, prjVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + eta.a(Float.hashCode(this.a) * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "OnboardingUiConfig(phoneImageHeight=" + cma.b(this.a) + ", gradientBgHeightFraction=" + this.b + ", textPaddings=" + this.c + ", buttonStartPadding=" + cma.b(this.d) + ")";
    }
}
