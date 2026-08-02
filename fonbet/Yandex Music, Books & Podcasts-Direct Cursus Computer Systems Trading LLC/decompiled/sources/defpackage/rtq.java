package defpackage;

/* loaded from: classes3.dex */
public final class rtq {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public rtq(float f, float f2, float f3, float f4, float f5, int i) {
        f = (i & 1) != 0 ? 4 : f;
        f2 = (i & 4) != 0 ? 10 : f2;
        float f6 = 0;
        f3 = (i & 16) != 0 ? 24 : f3;
        f4 = (i & 32) != 0 ? 1 : f4;
        f5 = (i & 64) != 0 ? 6 : f5;
        this.a = f;
        this.b = f;
        this.c = f2;
        this.d = f6;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtq)) {
            return false;
        }
        rtq rtqVar = (rtq) obj;
        return cma.a(this.a, rtqVar.a) && cma.a(this.b, rtqVar.b) && cma.a(this.c, rtqVar.c) && cma.a(this.d, rtqVar.d) && cma.a(this.e, rtqVar.e) && cma.a(this.f, rtqVar.f) && cma.a(this.g, rtqVar.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + eta.a(eta.a(eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String b2 = cma.b(this.b);
        String b3 = cma.b(this.c);
        String b4 = cma.b(this.d);
        String b5 = cma.b(this.e);
        String b6 = cma.b(this.f);
        String b7 = cma.b(this.g);
        StringBuilder m = f1d.m("SliderDimens(trackHeight=", b, ", activeTrackHeight=", b2, ", thumbRadius=");
        su4.v(m, b3, ", thumbBorder=", b4, ", thumbRippleRadius=");
        su4.v(m, b5, ", thumbDefaultElevation=", b6, ", thumbPressedElevation=");
        return su4.o(m, b7, ")");
    }
}
