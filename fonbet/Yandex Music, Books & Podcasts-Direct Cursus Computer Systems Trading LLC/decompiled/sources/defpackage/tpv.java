package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class tpv extends upv {
    public final WindowInsetsAnimation e;

    public tpv(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static zne f(WindowInsetsAnimation.Bounds bounds) {
        return zne.d(bounds.getUpperBound());
    }

    public static zne g(WindowInsetsAnimation.Bounds bounds) {
        return zne.d(bounds.getLowerBound());
    }

    public static void h(View view, rr4 rr4Var) {
        view.setWindowInsetsAnimationCallback(rr4Var != null ? new spv(rr4Var) : null);
    }

    @Override // defpackage.upv
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.upv
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.upv
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.upv
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.upv
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
