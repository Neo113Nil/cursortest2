package defpackage;

/* loaded from: classes4.dex */
public final class hhv {
    public final float a;
    public final float b;
    public final float c;

    public hhv(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhv)) {
            return false;
        }
        hhv hhvVar = (hhv) obj;
        return cma.a(this.a, hhvVar.a) && cma.a(this.b, hhvVar.b) && Float.compare(this.c, hhvVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return su4.m(this.c, ")", f1d.m("WheelCarouselConfig(ovalWidth=", cma.b(this.a), ", ovalHeight=", cma.b(this.b), ", rotationZAngle="));
    }
}
