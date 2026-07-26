package android.content.Context;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterDialogFragmentAuroraOmega2719 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ long FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterDialogFragmentAuroraOmega2719(Object obj, Object obj2, long j, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
        this.FrostHunterKeyframeGammaGamma1197 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        long j = this.FrostHunterKeyframeGammaGamma1197;
        Object obj = this.FrostHunterAlertDialogAuroraDelta3200;
        Object obj2 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) obj2).lambda$processDeeplink$13((AdjustDeeplink) obj, j);
                break;
            case 1:
                ((ActivityHandler) obj2).lambda$processDeeplink$12((AdjustDeeplink) obj, j);
                break;
            case 2:
                ((ActivityHandler) obj2).lambda$processAndResolveDeeplink$14((AdjustDeeplink) obj, j);
                break;
            case 3:
                ((ActivityHandler) obj2).lambda$processAndResolveDeeplink$15((AdjustDeeplink) obj, j);
                break;
            default:
                FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 frostHunterProcessCameraProviderQuantumNovaXHyperion4894 = ((FrostHunterStorageDeltaInferno9007) obj2).FrostHunterConstraintSetCloneMasterUltraRogue2633;
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = frostHunterProcessCameraProviderQuantumNovaXHyperion4894.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419 = frostHunterThreadSpectraShadowGamma2307.FrostHunterCameraXTurboCelestialHero5430;
                FrostHunterWorkManagerQuantumForceCosmos2019 FrostHunterTranslateAnimationCyberSolarUltra7101 = frostHunterDispatchersBetaNova8419.FrostHunterTranslateAnimationCyberSolarUltra7101();
                frostHunterDispatchersBetaNova8419.FrostHunterStateCelestialNovaPixel8414(FrostHunterTranslateAnimationCyberSolarUltra7101, 26, new FrostHunterMotionEventSparkNovaStorm4129(FrostHunterTranslateAnimationCyberSolarUltra7101, obj, j));
                if (frostHunterThreadSpectraShadowGamma2307.FrostHunterPagingSourceEclipseDelta8255 == obj) {
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterFragmentBetaMegaVortex6025.FrostHunterLifecycleBlazeGammaElite2889(26, new FrostHunterVibratorSpectraBetaNovaX4683(3));
                    break;
                }
                break;
        }
    }
}
