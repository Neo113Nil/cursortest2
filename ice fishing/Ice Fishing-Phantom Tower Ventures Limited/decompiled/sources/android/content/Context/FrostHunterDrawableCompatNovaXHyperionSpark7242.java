package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterDrawableCompatNovaXHyperionSpark7242 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterKeyframeGammaGamma1197;

    public FrostHunterDrawableCompatNovaXHyperionSpark7242() {
        if (FrostHunterAuthPixelSolar5465.FrostHunterCameraXPixelTurboCosmos9814 == null) {
            FrostHunterAuthPixelSolar5465.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterAuthPixelSolar5465();
        }
    }

    public int FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (i < this.FrostHunterAlertDialogAuroraDelta3200) {
            return ((ByteBuffer) this.FrostHunterKeyframeGammaGamma1197).getShort(this.FrostHunterFlowMaxDragonHero5809 + i);
        }
        return 0;
    }

    public void FrostHunterBundlePulseFusionHero2475() {
        while (true) {
            int i = this.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = (FrostHunterViewTurboHyperion7821) this.FrostHunterKeyframeGammaGamma1197;
            if (i >= frostHunterViewTurboHyperion7821.FrostHunterServiceConnectionTurboPhoenixOmega6719 || frostHunterViewTurboHyperion7821.FrostHunterAlertDialogAuroraDelta3200[i] >= 0) {
                return;
            } else {
                this.FrostHunterCameraXPixelTurboCosmos9814 = i + 1;
            }
        }
    }

    public void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (((FrostHunterViewTurboHyperion7821) this.FrostHunterKeyframeGammaGamma1197).FrostHunterScaleAnimationStrikeSpark5059 == this.FrostHunterAlertDialogAuroraDelta3200) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    public boolean hasNext() {
        return this.FrostHunterCameraXPixelTurboCosmos9814 < ((FrostHunterViewTurboHyperion7821) this.FrostHunterKeyframeGammaGamma1197).FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    public void remove() {
        FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = (FrostHunterViewTurboHyperion7821) this.FrostHunterKeyframeGammaGamma1197;
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (this.FrostHunterFlowMaxDragonHero5809 == -1) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Call next() before removing element from the iterator.");
            return;
        }
        frostHunterViewTurboHyperion7821.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        frostHunterViewTurboHyperion7821.FrostHunterAlertDialogAuroraDelta3200(this.FrostHunterFlowMaxDragonHero5809);
        this.FrostHunterFlowMaxDragonHero5809 = -1;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterViewTurboHyperion7821.FrostHunterScaleAnimationStrikeSpark5059;
    }
}
