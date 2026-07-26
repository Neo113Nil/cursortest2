package android.content.Context;

import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterActivityAuroraTitanCyber2504 extends FrostHunterSurfaceViewShadowTurbo8060 {
    public final boolean FrostHunterAlertDialogAuroraDelta3200;
    public final long FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterKeyframeGammaGamma1197;

    public FrostHunterActivityAuroraTitanCyber2504(FrostHunterFontFamilySolarSpeedCelestial8941 frostHunterFontFamilySolarSpeedCelestial8941, long j, boolean z) {
        super(frostHunterFontFamilySolarSpeedCelestial8941);
        this.FrostHunterFlowMaxDragonHero5809 = j;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
    }

    @Override // android.content.Context.FrostHunterSurfaceViewShadowTurbo8060, android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        long j2 = this.FrostHunterKeyframeGammaGamma1197;
        long j3 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 > j3) {
            j = 0;
        } else if (this.FrostHunterAlertDialogAuroraDelta3200) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long FrostHunterResourcesTitanHyperVision5823 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterResourcesTitanHyperVision5823(j, frostHunterMergeSpeedHyperionBlaze4246);
        if (FrostHunterResourcesTitanHyperVision5823 != -1) {
            this.FrostHunterKeyframeGammaGamma1197 += FrostHunterResourcesTitanHyperVision5823;
        }
        long j5 = this.FrostHunterKeyframeGammaGamma1197;
        if ((j5 >= j3 || FrostHunterResourcesTitanHyperVision5823 != -1) && j5 <= j3) {
            return FrostHunterResourcesTitanHyperVision5823;
        }
        if (FrostHunterResourcesTitanHyperVision5823 > 0 && j5 > j3) {
            long j6 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 - (j5 - j3);
            FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze42462 = new FrostHunterMergeSpeedHyperionBlaze4246();
            frostHunterMergeSpeedHyperionBlaze42462.FrostHunterMediaPlayerCelestialBetaTitan3868(frostHunterMergeSpeedHyperionBlaze4246);
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterServiceConnectionTurboPhoenixOmega6719(j6, frostHunterMergeSpeedHyperionBlaze42462);
            frostHunterMergeSpeedHyperionBlaze42462.FrostHunterAlphaAnimationNeoCosmos5761();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.FrostHunterKeyframeGammaGamma1197);
    }
}
