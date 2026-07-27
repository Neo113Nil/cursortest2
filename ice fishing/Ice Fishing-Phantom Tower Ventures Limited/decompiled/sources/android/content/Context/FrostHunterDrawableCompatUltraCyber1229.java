package android.content.Context;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableCompatUltraCyber1229 implements Drawable.Callback {
    public final /* synthetic */ FrostHunterTransitionManagerEliteVortexPixel2771 FrostHunterCameraXPixelTurboCosmos9814;

    public FrostHunterDrawableCompatUltraCyber1229(FrostHunterTransitionManagerEliteVortexPixel2771 frostHunterTransitionManagerEliteVortexPixel2771) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterTransitionManagerEliteVortexPixel2771;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long j;
        drawable.getClass();
        FrostHunterTransitionManagerEliteVortexPixel2771 frostHunterTransitionManagerEliteVortexPixel2771 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterCountDownTimerLegendOlympian4078 frostHunterCountDownTimerLegendOlympian4078 = frostHunterTransitionManagerEliteVortexPixel2771.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        frostHunterCountDownTimerLegendOlympian4078.setValue(Integer.valueOf(((Number) frostHunterCountDownTimerLegendOlympian4078.getValue()).intValue() + 1));
        Drawable drawable2 = frostHunterTransitionManagerEliteVortexPixel2771.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterMergePhoenixEpic5883 frostHunterMergePhoenixEpic5883 = FrostHunterMagnetometerQuantumLegend2667.FrostHunterAlphaAnimationNeoCosmos5761;
        if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
            j = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable2.getIntrinsicWidth();
            float intrinsicHeight = drawable2.getIntrinsicHeight();
            j = (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
        }
        frostHunterTransitionManagerEliteVortexPixel2771.FrostHunterLightSensorForceFusion4241.setValue(new FrostHunterMotionLayoutBlazePhoenix5062(j));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) FrostHunterMagnetometerQuantumLegend2667.FrostHunterAlphaAnimationNeoCosmos5761.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) FrostHunterMagnetometerQuantumLegend2667.FrostHunterAlphaAnimationNeoCosmos5761.getValue()).removeCallbacks(runnable);
    }
}
