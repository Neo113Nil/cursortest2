package android.content.Context;

import android.os.SystemClock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomHeroStormStrike4713 implements FrostHunterThemeOverlaySparkInfernoAurora4808 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public long FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
    public long FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;

    public long FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        long j2 = j + this.FrostHunterFlowMaxDragonHero5809;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        long j4 = j2 / j3;
        return j4 % 2 == 0 ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public long FrostHunterBundlePulseFusionHero2475(FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        return Long.MAX_VALUE;
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return true;
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.FrostHunterAlertDialogAuroraDelta3200) == null) {
            this.FrostHunterAlertDialogAuroraDelta3200 = exc;
        }
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == -9223372036854775807L && FrostHunterCoordinatorLayoutAuroraAlpha8847.FrostHunterLiveDataBetaLegend3442.get() <= 0) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 200 + elapsedRealtime;
        }
        long j = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.FrostHunterFlowMaxDragonHero5809 = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.FrostHunterAlertDialogAuroraDelta3200;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterAlertDialogAuroraDelta3200 = null;
        this.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
        this.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
        throw exc3;
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        return ((FrostHunterObjectAnimatorOlympianSpectra1864) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterResourcesTitanHyperVision5823(FrostHunterAlphaAnimationNeoCosmos5761(j), frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24832, FrostHunterServiceEliteCelestialThunder1757(j, frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24833, frostHunterMaterialCardViewEliteRogue24832));
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterScaleAnimationStrikeSpark5059(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        return ((FrostHunterObjectAnimatorOlympianSpectra1864) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterScaleAnimationStrikeSpark5059(FrostHunterAlphaAnimationNeoCosmos5761(j), frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24832, FrostHunterServiceEliteCelestialThunder1757(j, frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24833, frostHunterMaterialCardViewEliteRogue24832));
    }

    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterServiceEliteCelestialThunder1757(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        long j2 = this.FrostHunterFlowMaxDragonHero5809;
        long j3 = j + j2;
        long j4 = this.FrostHunterCameraXPixelTurboCosmos9814;
        return j3 > j4 ? ((FrostHunterObjectAnimatorOlympianSpectra1864) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterScaleAnimationStrikeSpark5059(j4 - j2, frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24833, frostHunterMaterialCardViewEliteRogue24832) : frostHunterMaterialCardViewEliteRogue24832;
    }
}
