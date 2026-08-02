package defpackage;

/* loaded from: classes.dex */
public final class gma {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gma(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            sme.a("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            sme.a("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            sme.a("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        sme.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gma)) {
            return false;
        }
        gma gmaVar = (gma) obj;
        return cma.a(this.a, gmaVar.a) && cma.a(this.b, gmaVar.b) && cma.a(this.c, gmaVar.c) && cma.a(this.d, gmaVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        vz1.z(this.a, ", top=", sb);
        vz1.z(this.b, ", end=", sb);
        vz1.z(this.c, ", bottom=", sb);
        sb.append((Object) cma.b(this.d));
        sb.append(", isLayoutDirectionAware=true)");
        return sb.toString();
    }
}
