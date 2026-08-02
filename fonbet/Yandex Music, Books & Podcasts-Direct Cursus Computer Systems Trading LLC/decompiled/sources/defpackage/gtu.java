package defpackage;

/* loaded from: classes4.dex */
public final class gtu {
    public static final gtu p;
    public static final gtu q;
    public static final gtu r;
    public static final gtu s;
    public static final gtu t;
    public static final gtu u;
    public final float a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final long o;

    static {
        float f = 64;
        float f2 = 12;
        float f3 = 16;
        float f4 = 56;
        float f5 = 200;
        float f6 = 48;
        float f7 = 4;
        float f8 = 36;
        p = new gtu(f, v7g.z(64), 96, 0.85f, f2, f3, f3, 1.0f, 1.0f, f4, f5, f6, f7, f8, v7g.z(16));
        float f9 = 8;
        float f10 = 32;
        q = new gtu(f, v7g.z(64), f, 0.85f, f9, f9, f9, 1.0f, 1.0f, f6, f5, f6, f7, f10, v7g.z(12));
        r = new gtu(f6, v7g.z(48), 80, 0.7f, f2, f3, f3, 1.0f, 1.0f, f4, f5, f6, f7, f8, v7g.z(12));
        float f11 = 44;
        float f12 = 40;
        s = new gtu(f10, v7g.z(32), f6, 0.85f, f7, f7, f7, 1.0f, 1.0f, f11, 160, f12, 2, 28, v7g.z(11));
        t = new gtu(f, v7g.z(64), 104, 0.7f, f2, f3, f3, 1.3f, 2.0f, 72, 360, f, f9, f11, v7g.z(20));
        u = new gtu(f4, v7g.z(56), 88, 0.85f, f2, f3, f3, 1.2f, 1.0f, f, 320, f4, 6, f12, v7g.z(16));
    }

    public gtu(float f, long j, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, long j2) {
        this.a = f;
        this.b = j;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = f13;
        this.o = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtu)) {
            return false;
        }
        gtu gtuVar = (gtu) obj;
        return cma.a(this.a, gtuVar.a) && kes.a(this.b, gtuVar.b) && cma.a(this.c, gtuVar.c) && Float.compare(this.d, gtuVar.d) == 0 && cma.a(this.e, gtuVar.e) && cma.a(this.f, gtuVar.f) && cma.a(this.g, gtuVar.g) && Float.compare(0.31f, 0.31f) == 0 && Float.compare(0.33333334f, 0.33333334f) == 0 && Float.compare(this.h, gtuVar.h) == 0 && Float.compare(this.i, gtuVar.i) == 0 && cma.a(this.j, gtuVar.j) && cma.a(this.k, gtuVar.k) && cma.a(this.l, gtuVar.l) && cma.a(this.m, gtuVar.m) && cma.a(this.n, gtuVar.n) && kes.a(this.o, gtuVar.o);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        les[] lesVarArr = kes.b;
        return Long.hashCode(this.o) + eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(tlm.c(this.b, hashCode, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 0.31f, 31), 0.33333334f, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31), this.m, 31), this.n, 31);
    }

    public final String toString() {
        String b = cma.b(this.a);
        String d = kes.d(this.b);
        String b2 = cma.b(this.c);
        String b3 = cma.b(this.e);
        String b4 = cma.b(this.f);
        String b5 = cma.b(this.g);
        String b6 = cma.b(this.j);
        String b7 = cma.b(this.k);
        String b8 = cma.b(this.l);
        String b9 = cma.b(this.m);
        String b10 = cma.b(this.n);
        String d2 = kes.d(this.o);
        StringBuilder m = f1d.m("WaveLandingLayoutConfig(artistTitleHeight=", b, ", artistTitleMaxFontSize=", d, ", fgImageHeight=");
        m.append(b2);
        m.append(", fgImagePauseScale=");
        m.append(this.d);
        m.append(", spaceBetweenCarouselAndPlayer=");
        su4.v(m, b3, ", spaceBetweenPlayerAndWordsInWave=", b4, ", spaceBetweenWordsInWaveAndInceptions=");
        m.append(b5);
        m.append(", inceptionsScreenWeight=0.31, inceptionsScreenLandscapeWeight=0.33333334, inceptionMaxFitScale=");
        m.append(this.h);
        m.append(", inceptionsSizeScale=");
        m.append(this.i);
        m.append(", playerHeight=");
        m.append(b6);
        m.append(", playerMinWidth=");
        su4.v(m, b7, ", playerTextHorizontalPadding=", b8, ", playerButtonSpacing=");
        su4.v(m, b9, ", playerCornerRadius=", b10, ", progressBarTitleFontSize=");
        return su4.o(m, d2, ")");
    }
}
