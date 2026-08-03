package h3;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2780e;

    public g0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2780e = windowInsetsAnimation;
    }

    @Override // h3.h0
    public final float a() {
        float alpha;
        alpha = this.f2780e.getAlpha();
        return alpha;
    }

    @Override // h3.h0
    public final long b() {
        long durationMillis;
        durationMillis = this.f2780e.getDurationMillis();
        return durationMillis;
    }

    @Override // h3.h0
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f2780e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // h3.h0
    public final int d() {
        int typeMask;
        typeMask = this.f2780e.getTypeMask();
        return typeMask;
    }

    @Override // h3.h0
    public final void e(float f10) {
        this.f2780e.setFraction(f10);
    }
}
