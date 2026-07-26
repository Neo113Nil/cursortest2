package android.content.Context;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBitmapHyperLegend9603 implements FrostHunterFontFamilySolarSpeedCelestial8941 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterJobSchedulerEpicAuroraNebula9616 FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterBitmapHyperLegend9603(FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616) {
        frostHunterJobSchedulerEpicAuroraNebula9616.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterJobSchedulerEpicAuroraNebula9616;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475();
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        int i;
        int readInt;
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        do {
            int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
            FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i2 == 0) {
                frostHunterJobSchedulerEpicAuroraNebula9616.skip(this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 0;
                if ((this.FrostHunterAlertDialogAuroraDelta3200 & 4) == 0) {
                    i = this.FrostHunterKeyframeGammaGamma1197;
                    int FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterFragmentBetaMegaVortex6025(frostHunterJobSchedulerEpicAuroraNebula9616);
                    this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025;
                    this.FrostHunterFlowMaxDragonHero5809 = FrostHunterFragmentBetaMegaVortex6025;
                    int readByte = frostHunterJobSchedulerEpicAuroraNebula9616.readByte() & 255;
                    this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterJobSchedulerEpicAuroraNebula9616.readByte() & 255;
                    Logger logger = FrostHunterAnimatorAuroraShadow7198.FrostHunterKeyframeGammaGamma1197;
                    if (logger.isLoggable(Level.FINE)) {
                        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterKeyframeGammaGamma2319.FrostHunterAlphaAnimationNeoCosmos5761;
                        logger.fine(FrostHunterKeyframeGammaGamma2319.FrostHunterConstraintSetCloneMasterUltraRogue2633(true, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFlowMaxDragonHero5809, readByte, this.FrostHunterAlertDialogAuroraDelta3200));
                    }
                    readInt = frostHunterJobSchedulerEpicAuroraNebula9616.readInt() & Integer.MAX_VALUE;
                    this.FrostHunterKeyframeGammaGamma1197 = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long FrostHunterResourcesTitanHyperVision5823 = frostHunterJobSchedulerEpicAuroraNebula9616.FrostHunterResourcesTitanHyperVision5823(Math.min(j, i2), frostHunterMergeSpeedHyperionBlaze4246);
                if (FrostHunterResourcesTitanHyperVision5823 != -1) {
                    this.FrostHunterFragmentBetaMegaVortex6025 -= (int) FrostHunterResourcesTitanHyperVision5823;
                    return FrostHunterResourcesTitanHyperVision5823;
                }
            }
            return -1L;
        } while (readInt == i);
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
