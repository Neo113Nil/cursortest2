package defpackage;

/* loaded from: classes4.dex */
public final class d24 {
    public final long a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final float l;

    public d24(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, int i, float f7, float f8, float f9) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = i;
        this.j = f7;
        this.k = f8;
        this.l = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d24)) {
            return false;
        }
        d24 d24Var = (d24) obj;
        return fma.a(this.a, d24Var.a) && fma.a(this.b, d24Var.b) && Float.compare(this.c, d24Var.c) == 0 && Float.compare(this.d, d24Var.d) == 0 && Float.compare(this.e, d24Var.e) == 0 && Float.compare(this.f, d24Var.f) == 0 && Float.compare(this.g, d24Var.g) == 0 && Float.compare(this.h, d24Var.h) == 0 && Float.compare(0.85f, 0.85f) == 0 && Float.compare(1.2f, 1.2f) == 0 && this.i == d24Var.i && Float.compare(this.j, d24Var.j) == 0 && Float.compare(this.k, d24Var.k) == 0 && Float.compare(this.l, d24Var.l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.l) + eta.a(eta.a(f1d.a(this.i, eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(tlm.c(this.b, Long.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 0.85f, 31), 1.2f, 31), 31), this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CarouselGeometry(effectiveOvalSize=", fma.d(this.a), ", boundingBoxSizeDp=", fma.d(this.b), ", layoutWidthPx=");
        m.append(this.c);
        m.append(", layoutHeightPx=");
        m.append(this.d);
        m.append(", gapPx=");
        m.append(this.e);
        m.append(", screenSizePx=");
        m.append(this.f);
        m.append(", screenCenterPx=");
        m.append(this.g);
        m.append(", secondaryCenterPx=");
        m.append(this.h);
        m.append(", minWaveFactor=0.85, maxWaveFactor=1.2, halfVisibleCount=");
        m.append(this.i);
        m.append(", layoutPrimaryPx=");
        m.append(this.j);
        m.append(", waveWidthPx=");
        m.append(this.k);
        m.append(", apexPrimaryOffsetPx=");
        m.append(this.l);
        m.append(")");
        return m.toString();
    }
}
