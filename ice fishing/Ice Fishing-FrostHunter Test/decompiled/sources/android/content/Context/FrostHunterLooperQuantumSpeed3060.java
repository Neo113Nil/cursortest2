package android.content.Context;

import java.io.FileOutputStream;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLooperQuantumSpeed3060 implements FrostHunterProfilerPhantomLegendPhoenix6109 {
    public final FileOutputStream FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterLooperQuantumSpeed3060(FileOutputStream fileOutputStream, FrostHunterAdMobBlazeEclipseGamma6684 frostHunterAdMobBlazeEclipseGamma6684) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = fileOutputStream;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterAdMobBlazeEclipseGamma6684;
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        FrostHunterTransitionGammaTitanSpeed7178.FrostHunterKeyframeGammaGamma1197(frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809, 0L, j);
        while (j > 0) {
            this.FrostHunterFlowMaxDragonHero5809.FrostHunterLevelListDrawableFusionDragonHero2232();
            FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterMaterialCardViewTitanMax3245.getClass();
            int min = (int) Math.min(j, frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            this.FrostHunterCameraXPixelTurboCosmos9814.write(frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633, min);
            int i = frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 + min;
            frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
            long j2 = min;
            j -= j2;
            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 -= j2;
            if (i == frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475) {
                frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax3245.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax3245);
            }
        }
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.FrostHunterCameraXPixelTurboCosmos9814.close();
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Flushable
    public final void flush() {
        this.FrostHunterCameraXPixelTurboCosmos9814.flush();
    }

    public final String toString() {
        return "sink(" + this.FrostHunterCameraXPixelTurboCosmos9814 + ')';
    }
}
