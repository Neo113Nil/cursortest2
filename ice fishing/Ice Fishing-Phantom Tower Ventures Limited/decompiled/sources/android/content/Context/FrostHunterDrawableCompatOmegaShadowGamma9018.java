package android.content.Context;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableCompatOmegaShadowGamma9018 extends FrostHunterOnItemLongClickListenerOlympianCyberMaster1447 implements Choreographer$VsyncCallback {
    public final Handler FrostHunterFragmentBetaMegaVortex6025;

    public FrostHunterDrawableCompatOmegaShadowGamma9018(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(null);
    }

    @Override // android.content.Context.FrostHunterOnItemLongClickListenerOlympianCyberMaster1447
    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        this.FrostHunterFlowMaxDragonHero5809.registerDisplayListener(this, FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(null));
        this.FrostHunterCameraXPixelTurboCosmos9814.postVsyncCallback(this);
    }

    @Override // android.content.Context.FrostHunterOnItemLongClickListenerOlympianCyberMaster1447
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        this.FrostHunterFlowMaxDragonHero5809.unregisterDisplayListener(this);
        this.FrostHunterFragmentBetaMegaVortex6025.removeCallbacksAndMessages(null);
        this.FrostHunterCameraXPixelTurboCosmos9814.removeVsyncCallback(this);
        this.FrostHunterAlertDialogAuroraDelta3200 = -9223372036854775807L;
        this.FrostHunterKeyframeGammaGamma1197 = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.FrostHunterAlertDialogAuroraDelta3200 = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            this.FrostHunterKeyframeGammaGamma1197 = j != 0 ? j : -9223372036854775807L;
        } else {
            this.FrostHunterKeyframeGammaGamma1197 = -9223372036854775807L;
        }
        this.FrostHunterFragmentBetaMegaVortex6025.postDelayed(new FrostHunterFilterAlphaSparkSpeed9857(25, this), 500L);
    }
}
