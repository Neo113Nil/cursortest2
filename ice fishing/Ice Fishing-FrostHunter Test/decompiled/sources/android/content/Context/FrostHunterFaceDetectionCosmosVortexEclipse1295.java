package android.content.Context;

import android.view.Choreographer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFaceDetectionCosmosVortexEclipse1295 extends FrostHunterOnItemLongClickListenerOlympianCyberMaster1447 implements Choreographer.FrameCallback {
    @Override // android.content.Context.FrostHunterOnItemLongClickListenerOlympianCyberMaster1447
    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        long j;
        this.FrostHunterFlowMaxDragonHero5809.registerDisplayListener(this, FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(null));
        this.FrostHunterCameraXPixelTurboCosmos9814.postFrameCallback(this);
        if (this.FrostHunterFlowMaxDragonHero5809.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.FrostHunterKeyframeGammaGamma1197 = j;
    }

    @Override // android.content.Context.FrostHunterOnItemLongClickListenerOlympianCyberMaster1447
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        this.FrostHunterFlowMaxDragonHero5809.unregisterDisplayListener(this);
        this.FrostHunterCameraXPixelTurboCosmos9814.removeFrameCallback(this);
        this.FrostHunterAlertDialogAuroraDelta3200 = -9223372036854775807L;
        this.FrostHunterKeyframeGammaGamma1197 = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.FrostHunterAlertDialogAuroraDelta3200 = j;
        this.FrostHunterCameraXPixelTurboCosmos9814.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814.postFrameCallback(this);
            if (this.FrostHunterFlowMaxDragonHero5809.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.FrostHunterKeyframeGammaGamma1197 = j;
        }
    }
}
