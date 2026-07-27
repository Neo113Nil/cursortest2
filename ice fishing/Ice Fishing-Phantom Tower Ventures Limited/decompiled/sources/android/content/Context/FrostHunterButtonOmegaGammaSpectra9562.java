package android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterButtonOmegaGammaSpectra9562 implements FrostHunterFontFamilySolarSpeedCelestial8941 {
    public final InputStream FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterButtonOmegaGammaSpectra9562(InputStream inputStream, FrostHunterAdMobBlazeEclipseGamma6684 frostHunterAdMobBlazeEclipseGamma6684) {
        inputStream.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = inputStream;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterAdMobBlazeEclipseGamma6684;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("byteCount < 0: ", j));
            return 0L;
        }
        try {
            this.FrostHunterFlowMaxDragonHero5809.FrostHunterLevelListDrawableFusionDragonHero2232();
            FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterViewPhantomNeo1634(1);
            int read = this.FrostHunterCameraXPixelTurboCosmos9814.read(FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475, (int) Math.min(j, 8192 - FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475));
            if (read != -1) {
                FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 += read;
                long j2 = read;
                frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 += j2;
                return j2;
            }
            if (FrostHunterViewPhantomNeo1634.FrostHunterConstraintSetCloneMasterUltraRogue2633 != FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475) {
                return -1L;
            }
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterViewPhantomNeo1634);
            return -1L;
        } catch (AssertionError e) {
            if (FrostHunterContextBetaOlympianForce4049.FrostHunterAlphaAnimationNeoCosmos5761(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.FrostHunterCameraXPixelTurboCosmos9814.close();
    }

    public final String toString() {
        return "source(" + this.FrostHunterCameraXPixelTurboCosmos9814 + ')';
    }
}
