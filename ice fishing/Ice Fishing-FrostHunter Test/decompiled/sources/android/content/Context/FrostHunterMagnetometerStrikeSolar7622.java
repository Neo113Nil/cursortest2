package android.content.Context;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterMagnetometerStrikeSolar7622 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ Object FrostHunterKeyframeGammaGamma1197;

    public /* synthetic */ FrostHunterMagnetometerStrikeSolar7622(FrostHunterMaterialButtonGammaNova8333 frostHunterMaterialButtonGammaNova8333, FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, FrostHunterMaterialCardViewShadowBlazeBlaze3823 frostHunterMaterialCardViewShadowBlazeBlaze3823, FrostHunterLocationManagerPhantomPhoenixFusion8067 frostHunterLocationManagerPhantomPhoenixFusion8067) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMaterialButtonGammaNova8333;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLocationManagerPhantomPhoenixFusion8067;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AudioTrack audioTrack = (AudioTrack) this.FrostHunterFlowMaxDragonHero5809;
                Handler handler = (Handler) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = (FrostHunterAlertDialogEliteMasterCosmos7701) this.FrostHunterKeyframeGammaGamma1197;
                int i2 = 6;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new FrostHunterFilterAlphaSparkSpeed9857(i2, frostHunterAlertDialogEliteMasterCosmos7701));
                    }
                    synchronized (FrostHunterFirestoreVortexBeta2433.FrostHunterResourcesTitanHyperVision5823) {
                        try {
                            int i3 = FrostHunterFirestoreVortexBeta2433.FrostHunterLooperThreadBetaHyperionMax1000 - 1;
                            FrostHunterFirestoreVortexBeta2433.FrostHunterLooperThreadBetaHyperionMax1000 = i3;
                            if (i3 == 0) {
                                ScheduledExecutorService scheduledExecutorService = FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new FrostHunterFilterAlphaSparkSpeed9857(i2, frostHunterAlertDialogEliteMasterCosmos7701));
                    }
                    synchronized (FrostHunterFirestoreVortexBeta2433.FrostHunterResourcesTitanHyperVision5823) {
                        try {
                            int i4 = FrostHunterFirestoreVortexBeta2433.FrostHunterLooperThreadBetaHyperionMax1000 - 1;
                            FrostHunterFirestoreVortexBeta2433.FrostHunterLooperThreadBetaHyperionMax1000 = i4;
                            if (i4 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 1:
                FrostHunterMaterialButtonGammaNova8333 frostHunterMaterialButtonGammaNova8333 = (FrostHunterMaterialButtonGammaNova8333) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350 = (FrostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350) this.FrostHunterAlertDialogAuroraDelta3200;
                String str = frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterLocationManagerPhantomPhoenixFusion8067 frostHunterLocationManagerPhantomPhoenixFusion8067 = (FrostHunterLocationManagerPhantomPhoenixFusion8067) this.FrostHunterKeyframeGammaGamma1197;
                frostHunterMaterialButtonGammaNova8333.getClass();
                Logger logger = FrostHunterMaterialButtonGammaNova8333.FrostHunterLevelListDrawableFusionDragonHero2232;
                try {
                    FrostHunterInputFilterSolarFusionCelestial5018 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterMaterialButtonGammaNova8333.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761(str);
                    if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        frostHunterMaterialButtonGammaNova8333.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterZoomStateAlphaGamma5769(frostHunterMaterialButtonGammaNova8333, frostHunterPaintFlagsDrawFilterOmegaUltraSpectra4350, ((FrostHunterBroadcastReceiverHeroPixel3373) FrostHunterAlphaAnimationNeoCosmos5761).FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLocationManagerPhantomPhoenixFusion8067), i));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 2:
                FrostHunterConfigurationCosmosEclipseQuantum1114 frostHunterConfigurationCosmosEclipseQuantum1114 = (FrostHunterConfigurationCosmosEclipseQuantum1114) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterCardViewHyperionAurora3829 frostHunterCardViewHyperionAurora3829 = (FrostHunterCardViewHyperionAurora3829) this.FrostHunterAlertDialogAuroraDelta3200;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.FrostHunterKeyframeGammaGamma1197;
                try {
                    FrostHunterDrawableCosmosSpeedSolar8235 FrostHunterTextViewDragonStormMega4297 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterTextViewDragonStormMega4297(frostHunterConfigurationCosmosEclipseQuantum1114.FrostHunterAlphaAnimationNeoCosmos5761);
                    if (FrostHunterTextViewDragonStormMega4297 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    FrostHunterProGuardPhantomHyperSpeed8214 frostHunterProGuardPhantomHyperSpeed8214 = (FrostHunterProGuardPhantomHyperSpeed8214) FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761;
                    synchronized (frostHunterProGuardPhantomHyperSpeed8214.FrostHunterServiceEliteCelestialThunder1757) {
                        frostHunterProGuardPhantomHyperSpeed8214.FrostHunterLevelListDrawableFusionDragonHero2232 = threadPoolExecutor;
                    }
                    FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterStateFlowVortexGammaStrike1086(frostHunterCardViewHyperionAurora3829, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    frostHunterCardViewHyperionAurora3829.FrostHunterNavigationMasterMegaMax2752(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.FrostHunterFlowMaxDragonHero5809;
                Intent intent = (Intent) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = (FrostHunterIntentBetaElite8730) this.FrostHunterKeyframeGammaGamma1197;
                int i5 = EnhancedIntentService.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                try {
                    enhancedIntentService.FrostHunterBundlePulseFusionHero2475(intent);
                    return;
                } finally {
                    frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761(null);
                }
            case 4:
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = (FrostHunterLooperThreadOlympianAurora4719) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterTextureViewBlazePhantomDragon5593 frostHunterTextureViewBlazePhantomDragon5593 = (FrostHunterTextureViewBlazePhantomDragon5593) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = (FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) this.FrostHunterKeyframeGammaGamma1197;
                FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419 = frostHunterLooperThreadOlympianAurora4719.FrostHunterBundlePulseFusionHero2475;
                FrostHunterBitmapNeoCosmos7205 FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterTextureViewBlazePhantomDragon5593.FrostHunterLevelListDrawableFusionDragonHero2232();
                FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670 = frostHunterDispatchersBetaNova8419.FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = frostHunterDispatchersBetaNova8419.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterThreadSpectraShadowGamma2307.getClass();
                frostHunterCoroutineScopeSpeedSparkAlpha3670.getClass();
                frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterBundlePulseFusionHero2475 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(FrostHunterLevelListDrawableFusionDragonHero2232);
                if (!FrostHunterLevelListDrawableFusionDragonHero2232.isEmpty()) {
                    frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLevelListDrawableFusionDragonHero2232 = (FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) FrostHunterLevelListDrawableFusionDragonHero2232.get(0);
                    frostHunterAnimatedVectorDrawableMasterHeroHyper6960.getClass();
                    frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                }
                if (((FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLifecycleBlazeGammaElite2889) == null) {
                    frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlertDialogAuroraDelta3200(frostHunterThreadSpectraShadowGamma2307, (FrostHunterAlarmManagerHeroTitaniumFusion5758) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterBundlePulseFusionHero2475, (FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLevelListDrawableFusionDragonHero2232, (FrostHunterRoomEntityFusionQuantumFusion6361) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                }
                frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200());
                return;
            default:
                FrostHunterDialogStormSpeedMega9154 frostHunterDialogStormSpeedMega9154 = (FrostHunterDialogStormSpeedMega9154) this.FrostHunterFlowMaxDragonHero5809;
                Pair pair = (Pair) this.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterDialogStormSpeedMega9154.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceInfoHyperionSparkMax9966(((Integer) pair.first).intValue(), (FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) pair.second, (FrostHunterThemeOverlayTitaniumOmegaBeta4062) this.FrostHunterKeyframeGammaGamma1197);
                return;
        }
    }

    public /* synthetic */ FrostHunterMagnetometerStrikeSolar7622(Object obj, Object obj2, Object obj3, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
        this.FrostHunterKeyframeGammaGamma1197 = obj3;
    }
}
