package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes3.dex */
public final class StepCurve extends Easing {
    public MonotonicCurveFit mCurveFit;

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double get(double d) {
        return this.mCurveFit.getPos(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public final double getDiff(double d) {
        return this.mCurveFit.getSlope(d);
    }
}
