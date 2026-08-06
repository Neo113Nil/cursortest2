package defpackage;

/* loaded from: classes.dex */
public final class un1 extends defpackage.vn1 {
    public final android.view.WindowInsetsAnimation adDC3e2L;

    public un1(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.adDC3e2L = windowInsetsAnimation;
    }

    @Override // defpackage.vn1
    public final int F7NU4MC0GW() {
        int typeMask;
        typeMask = this.adDC3e2L.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.vn1
    public final float IHQe1A4L2xu() {
        float alpha;
        alpha = this.adDC3e2L.getAlpha();
        return alpha;
    }

    @Override // defpackage.vn1
    public final void adDC3e2L(float f) {
        this.adDC3e2L.setFraction(f);
    }

    @Override // defpackage.vn1
    public final long oh6vYeIP() {
        long durationMillis;
        durationMillis = this.adDC3e2L.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.vn1
    public final float r1MBDhnF() {
        float interpolatedFraction;
        interpolatedFraction = this.adDC3e2L.getInterpolatedFraction();
        return interpolatedFraction;
    }
}
