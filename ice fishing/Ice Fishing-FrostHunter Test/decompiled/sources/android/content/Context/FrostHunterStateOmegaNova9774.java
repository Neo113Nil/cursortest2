package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterStateOmegaNova9774 implements FrostHunterTransformForceCelestial8458 {
    public final /* synthetic */ Runnable FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterContentResolverPulsePixel6161 FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ long FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ long FrostHunterKeyframeGammaGamma1197;
    public final /* synthetic */ TimeUnit FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public /* synthetic */ FrostHunterStateOmegaNova9774(FrostHunterContentResolverPulsePixel6161 frostHunterContentResolverPulsePixel6161, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterContentResolverPulsePixel6161;
        this.FrostHunterAlertDialogAuroraDelta3200 = runnable;
        this.FrostHunterKeyframeGammaGamma1197 = j;
        this.FrostHunterFragmentBetaMegaVortex6025 = j2;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = timeUnit;
    }

    @Override // android.content.Context.FrostHunterTransformForceCelestial8458
    public final ScheduledFuture FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Runnable runnable = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterContentResolverPulsePixel6161 frostHunterContentResolverPulsePixel6161 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return frostHunterContentResolverPulsePixel6161.FrostHunterFlowMaxDragonHero5809.scheduleAtFixedRate(new FrostHunterBarcodeScannerMasterUltraEpic9895(frostHunterContentResolverPulsePixel6161, runnable, frostHunterSQLiteMasterUltra9956, 0), this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
            default:
                return frostHunterContentResolverPulsePixel6161.FrostHunterFlowMaxDragonHero5809.scheduleWithFixedDelay(new FrostHunterBarcodeScannerMasterUltraEpic9895(frostHunterContentResolverPulsePixel6161, runnable, frostHunterSQLiteMasterUltra9956, 2), this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        }
    }
}
