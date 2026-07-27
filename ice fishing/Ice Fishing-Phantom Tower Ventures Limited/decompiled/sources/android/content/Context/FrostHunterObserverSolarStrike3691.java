package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObserverSolarStrike3691 implements FrostHunterFlingGestureEpicPhantom3524 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public Object FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;

    @Override // android.content.Context.FrostHunterFlingGestureEpicPhantom3524
    public int FrostHunterAlphaAnimationNeoCosmos5761() {
        return -1;
    }

    public long FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i == 0) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
            return 0L;
        }
        long[] jArr = (long[]) this.FrostHunterFragmentBetaMegaVortex6025;
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        long j = jArr[i2];
        this.FrostHunterCameraXPixelTurboCosmos9814 = this.FrostHunterKeyframeGammaGamma1197 & (i2 + 1);
        this.FrostHunterAlertDialogAuroraDelta3200 = i - 1;
        return j;
    }

    @Override // android.content.Context.FrostHunterFlingGestureEpicPhantom3524
    public int FrostHunterFlowMaxDragonHero5809() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterFlingGestureEpicPhantom3524
    public int FrostHunterLintTitanVortexQuantum9911() {
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = (FrostHunterLicensingSpectraPulse8868) this.FrostHunterFragmentBetaMegaVortex6025;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        if (i == 8) {
            return frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        }
        if (i == 16) {
            return frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
        }
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.FrostHunterKeyframeGammaGamma1197 & 15;
        }
        int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
        this.FrostHunterKeyframeGammaGamma1197 = FrostHunterMeteringPointBetaCyber9571;
        return (FrostHunterMeteringPointBetaCyber9571 & 240) >> 4;
    }
}
