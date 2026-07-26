package android.content.Context;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import androidx.activity.ComponentActivity;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterDialogQuantumTurbo8340 implements Runnable {
    public final /* synthetic */ Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterDialogQuantumTurbo8340(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.media3.exoplayer.audio.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754;
        FrostHunterMaterialCardViewShadowBlazeBlaze3823 frostHunterMaterialCardViewShadowBlazeBlaze3823;
        int i;
        long j;
        boolean z;
        int i2 = 1;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 1:
                ((ActivityHandler) this.FrostHunterFlowMaxDragonHero5809).lambda$new$2((AdjustConfig) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 2:
                FrostHunterBindingAdapterSpeedNeo6677.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223((FrostHunterFontFamilyInfernoCyberBeta1746) this.FrostHunterFlowMaxDragonHero5809, (LongSparseArray) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 3:
                FrostHunterMeteringPointDeltaPrimeSolar9676 frostHunterMeteringPointDeltaPrimeSolar9676 = (FrostHunterMeteringPointDeltaPrimeSolar9676) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterDialogQuantumTurbo8340 frostHunterDialogQuantumTurbo8340 = (FrostHunterDialogQuantumTurbo8340) this.FrostHunterAlertDialogAuroraDelta3200;
                ((FrostHunterMotionLayoutTransitionEliteSolarMax1226) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterFragmentBetaMegaVortex6025).FrostHunterFragmentBetaMegaVortex6025();
                FrostHunterAssetManagerCelestialShadowInferno9902 frostHunterAssetManagerCelestialShadowInferno9902 = (FrostHunterAssetManagerCelestialShadowInferno9902) frostHunterMeteringPointDeltaPrimeSolar9676.FrostHunterKeyframeGammaGamma1197;
                synchronized (frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterAlphaAnimationNeoCosmos5761) {
                    frostHunterAssetManagerCelestialShadowInferno9902.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    frostHunterDialogQuantumTurbo8340.run();
                }
                return;
            case 4:
                Context context = (Context) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665 = (FrostHunterSensorManagerMegaEclipse5665) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterAlphaAnimationNeoCosmos5761 = (AudioManager) context.getSystemService("audio");
                frostHunterSensorManagerMegaEclipse5665.FrostHunterBundlePulseFusionHero2475();
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = (FrostHunterStorageDeltaInferno9007) this.FrostHunterFlowMaxDragonHero5809;
                synchronized (((FrostHunterWindowManagerMasterOmegaGamma7106) this.FrostHunterAlertDialogAuroraDelta3200)) {
                }
                FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 frostHunterProcessCameraProviderQuantumNovaXHyperion4894 = frostHunterStorageDeltaInferno9007.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419 = frostHunterProcessCameraProviderQuantumNovaXHyperion4894.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXTurboCelestialHero5430;
                frostHunterDispatchersBetaNova8419.FrostHunterStateCelestialNovaPixel8414(frostHunterDispatchersBetaNova8419.FrostHunterMeteringPointMegaCyber7955((FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) frostHunterDispatchersBetaNova8419.FrostHunterServiceEliteCelestialThunder1757.FrostHunterLevelListDrawableFusionDragonHero2232), 1013, new FrostHunterInputMethodManagerOmegaNovaX6073(2));
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno90072 = (FrostHunterStorageDeltaInferno9007) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta2867 = (FrostHunterSoundPoolNeoEclipseDelta2867) this.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 frostHunterProcessCameraProviderQuantumNovaXHyperion48942 = frostHunterStorageDeltaInferno90072.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterIntentForceSpeed4935.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterProcessCameraProviderQuantumNovaXHyperion48942.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterViewPhantomNeo1634, frostHunterSoundPoolNeoEclipseDelta2867);
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) this.FrostHunterFlowMaxDragonHero5809;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.FrostHunterAlertDialogAuroraDelta3200).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterKeyframeGammaGamma1197).post(new FrostHunterDialogQuantumTurbo8340(8, frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849, routedDevice));
                    return;
                }
                return;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum88492 = (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) this.FrostHunterFlowMaxDragonHero5809;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.FrostHunterAlertDialogAuroraDelta3200;
                if (((FrostHunterGradlePluginMegaShadow1674) frostHunterOnAttachStateChangeListenerVortexNeoQuantum88492.FrostHunterFragmentBetaMegaVortex6025) == null || (frostHunterTransitionManagerOmegaNeoMaster3754 = ((FrostHunterPlaceholderSolarPixelElite2112) ((FrostHunterLayoutInflaterTurboHyperion3832) frostHunterOnAttachStateChangeListenerVortexNeoQuantum88492.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809).FrostHunterFlowMaxDragonHero5809) == null || audioDeviceInfo.equals(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809)) {
                    return;
                }
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterFlowMaxDragonHero5809 = audioDeviceInfo;
                Context context2 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlertDialogAuroraDelta3200;
                List FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205 = FrostHunterBindingAdapterOmegaAurora9082.FrostHunterLifecycleBlazeGammaElite2889;
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBindingAdapterOmegaAurora9082.FrostHunterConstraintSetCloneMasterUltraRogue2633(context2, context2.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), frostHunterRemoteConfigEpicUltraDragon2411, audioDeviceInfo, FrostHunterAlphaAnimationNeoCosmos5761));
                return;
            case 9:
                FrostHunterEventShadowStrike2576 frostHunterEventShadowStrike2576 = (FrostHunterEventShadowStrike2576) this.FrostHunterFlowMaxDragonHero5809;
                Object apply = ((FrostHunterDatabaseFusionPhoenixHero4552) this.FrostHunterAlertDialogAuroraDelta3200).apply(frostHunterEventShadowStrike2576.FrostHunterLevelListDrawableFusionDragonHero2232);
                frostHunterEventShadowStrike2576.FrostHunterLevelListDrawableFusionDragonHero2232 = apply;
                FrostHunterSnackbarSpeedHeroMega4357 frostHunterSnackbarSpeedHeroMega4357 = new FrostHunterSnackbarSpeedHeroMega4357(frostHunterEventShadowStrike2576, apply, i2);
                FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = (FrostHunterRotateDrawableMaxPrime8918) frostHunterEventShadowStrike2576.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.getLooper().getThread().isAlive()) {
                    frostHunterRotateDrawableMaxPrime8918.FrostHunterServiceEliteCelestialThunder1757(frostHunterSnackbarSpeedHeroMega4357);
                    return;
                }
                return;
            case 10:
                ComponentActivity componentActivity = (ComponentActivity) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterNavigationSolarCosmos2919 frostHunterNavigationSolarCosmos2919 = (FrostHunterNavigationSolarCosmos2919) this.FrostHunterAlertDialogAuroraDelta3200;
                int i3 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                componentActivity.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterFirebaseModelDownloadConditionsEliteMaxEpic6718(frostHunterNavigationSolarCosmos2919, componentActivity));
                return;
            case 11:
                FrostHunterDiffUtilTitanDragon6411 frostHunterDiffUtilTitanDragon6411 = (FrostHunterDiffUtilTitanDragon6411) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterAdapterDelegateForceForce1151 frostHunterAdapterDelegateForceForce1151 = (FrostHunterAdapterDelegateForceForce1151) this.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterDiffUtilTitanDragon6411.FrostHunterConstraintSetCloneMasterUltraRogue2633 != FrostHunterDiffUtilTitanDragon6411.FrostHunterServiceEliteCelestialThunder1757) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("provide() can be called only once.");
                    return;
                }
                synchronized (frostHunterDiffUtilTitanDragon6411) {
                    frostHunterMaterialCardViewShadowBlazeBlaze3823 = frostHunterDiffUtilTitanDragon6411.FrostHunterAlphaAnimationNeoCosmos5761;
                    frostHunterDiffUtilTitanDragon6411.FrostHunterAlphaAnimationNeoCosmos5761 = null;
                    frostHunterDiffUtilTitanDragon6411.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAdapterDelegateForceForce1151;
                }
                frostHunterMaterialCardViewShadowBlazeBlaze3823.getClass();
                return;
            case 12:
                FrostHunterKaptAlphaCosmos8575 frostHunterKaptAlphaCosmos8575 = (FrostHunterKaptAlphaCosmos8575) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterAdapterDelegateForceForce1151 frostHunterAdapterDelegateForceForce11512 = (FrostHunterAdapterDelegateForceForce1151) this.FrostHunterAlertDialogAuroraDelta3200;
                synchronized (frostHunterKaptAlphaCosmos8575) {
                    try {
                        if (frostHunterKaptAlphaCosmos8575.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                            frostHunterKaptAlphaCosmos8575.FrostHunterAlphaAnimationNeoCosmos5761.add(frostHunterAdapterDelegateForceForce11512);
                        } else {
                            frostHunterKaptAlphaCosmos8575.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(frostHunterAdapterDelegateForceForce11512.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 13:
                FrostHunterLayoutPhantomBlaze1579 frostHunterLayoutPhantomBlaze1579 = (FrostHunterLayoutPhantomBlaze1579) this.FrostHunterFlowMaxDragonHero5809;
                Runnable runnable = (Runnable) this.FrostHunterAlertDialogAuroraDelta3200;
                Process.setThreadPriority(frostHunterLayoutPhantomBlaze1579.FrostHunterBundlePulseFusionHero2475);
                StrictMode.ThreadPolicy threadPolicy = frostHunterLayoutPhantomBlaze1579.FrostHunterServiceEliteCelestialThunder1757;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 14:
                ((FrostHunterDisplayMetricsSolarBlaze4032) ((FrostHunterIntentForceSpeed4935) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761((FrostHunterCoroutineSolarPixel5536) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 15:
                Callable callable = (Callable) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = (FrostHunterSQLiteMasterUltra9956) this.FrostHunterAlertDialogAuroraDelta3200;
                try {
                    Object call = callable.call();
                    FrostHunterValueAnimatorCosmosSparkPixel9160 frostHunterValueAnimatorCosmosSparkPixel9160 = (FrostHunterValueAnimatorCosmosSparkPixel9160) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
                    if (call == null) {
                        call = FrostHunterChipQuantumVision8640.FrostHunterLightSensorForceFusion4241;
                    }
                    if (FrostHunterChipQuantumVision8640.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFlowMaxDragonHero5809(frostHunterValueAnimatorCosmosSparkPixel9160, null, call)) {
                        FrostHunterChipQuantumVision8640.FrostHunterBundlePulseFusionHero2475(frostHunterValueAnimatorCosmosSparkPixel9160);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    frostHunterSQLiteMasterUltra9956.FrostHunterCardViewSpectraCyber7714(e);
                    return;
                }
            case 16:
                FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = (FrostHunterThreadSpectraShadowGamma2307) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterLinearLayoutRoguePrime1122 frostHunterLinearLayoutRoguePrime1122 = (FrostHunterLinearLayoutRoguePrime1122) this.FrostHunterAlertDialogAuroraDelta3200;
                int i4 = frostHunterThreadSpectraShadowGamma2307.FrostHunterMediaPlayerCelestialBetaTitan3868 - frostHunterLinearLayoutRoguePrime1122.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterThreadSpectraShadowGamma2307.FrostHunterMediaPlayerCelestialBetaTitan3868 = i4;
                if (frostHunterLinearLayoutRoguePrime1122.FrostHunterBundlePulseFusionHero2475) {
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterTranslateAnimationCyberSolarUltra7101 = frostHunterLinearLayoutRoguePrime1122.FrostHunterServiceEliteCelestialThunder1757;
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterStateCelestialNovaPixel8414 = true;
                }
                if (i4 == 0) {
                    FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889).FrostHunterAlphaAnimationNeoCosmos5761;
                    int i5 = -1;
                    if (!frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                        frostHunterThreadSpectraShadowGamma2307.FrostHunterSoundPoolNovaTitanTitan5784 = -1;
                        frostHunterThreadSpectraShadowGamma2307.FrostHunterNestedScrollViewThunderNovaX6772 = 0L;
                    }
                    if (!frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                        List asList = Arrays.asList(((FrostHunterImageAnalysisPrimeSpectraNova7921) frostHunterStrictModeNebulaEliteHyper7105).FrostHunterCameraXPixelTurboCosmos9814);
                        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(asList.size() == frostHunterThreadSpectraShadowGamma2307.FrostHunterScaleAnimationStrikeSpark5059.size());
                        for (int i6 = 0; i6 < asList.size(); i6++) {
                            ((FrostHunterKotlinVortexSolarShadow3219) frostHunterThreadSpectraShadowGamma2307.FrostHunterScaleAnimationStrikeSpark5059.get(i6)).FrostHunterConstraintSetCloneMasterUltraRogue2633 = (FrostHunterStrictModeNebulaEliteHyper7105) asList.get(i6);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (frostHunterThreadSpectraShadowGamma2307.FrostHunterStateCelestialNovaPixel8414) {
                        boolean z2 = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
                        boolean equals = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889).FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        boolean z3 = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889).FrostHunterServiceEliteCelestialThunder1757 == frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterResourcesTitanHyperVision5823;
                        if (z2 || (equals && z3)) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            i5 = frostHunterThreadSpectraShadowGamma2307.FrostHunterLevelListDrawableFusionDragonHero2232();
                            if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() || ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                                j2 = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889).FrostHunterServiceEliteCelestialThunder1757;
                            } else {
                                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = (FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                long j3 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceEliteCelestialThunder1757;
                                Object obj = frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761;
                                FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = frostHunterThreadSpectraShadowGamma2307.FrostHunterLightSensorForceFusion4241;
                                frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361);
                                j2 = j3 + frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterLifecycleBlazeGammaElite2889;
                            }
                        }
                        i = i5;
                        j = j2;
                        z = i2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterStateCelestialNovaPixel8414 = false;
                    frostHunterThreadSpectraShadowGamma2307.FrostHunterServiceInfoHyperionSparkMax9966((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889, 1, z, frostHunterThreadSpectraShadowGamma2307.FrostHunterTranslateAnimationCyberSolarUltra7101, j, i);
                    return;
                }
                return;
            case 17:
                ((FrostHunterInputMethodManagerAlphaCosmosBeta3028) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761((Intent) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 18:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite8730 = (FrostHunterIntentBetaElite8730) this.FrostHunterAlertDialogAuroraDelta3200;
                try {
                    frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761(firebaseMessaging.FrostHunterAlphaAnimationNeoCosmos5761());
                    return;
                } catch (Exception e2) {
                    frostHunterIntentBetaElite8730.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200(e2);
                    return;
                }
            case 19:
                ((FrostHunterSQLiteUltraElite7894) this.FrostHunterFlowMaxDragonHero5809).FrostHunterCardViewSpectraCyber7714((FrostHunterCountDownTimerCyberVisionTitanium9970) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 20:
                FrostHunterRewardedAdStormUltra7947 frostHunterRewardedAdStormUltra7947 = (FrostHunterRewardedAdStormUltra7947) this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterIntentBetaElite8730 frostHunterIntentBetaElite87302 = (FrostHunterIntentBetaElite8730) this.FrostHunterAlertDialogAuroraDelta3200;
                try {
                    frostHunterIntentBetaElite87302.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterRewardedAdStormUltra7947.FrostHunterAlphaAnimationNeoCosmos5761());
                    return;
                } catch (Exception e3) {
                    frostHunterIntentBetaElite87302.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200(e3);
                    return;
                }
            case 21:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.FrostHunterFlowMaxDragonHero5809;
                JobParameters jobParameters = (JobParameters) this.FrostHunterAlertDialogAuroraDelta3200;
                int i7 = JobInfoSchedulerService.FrostHunterCameraXPixelTurboCosmos9814;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 22:
                FrostHunterVibratorBetaMax2177 frostHunterVibratorBetaMax2177 = (FrostHunterVibratorBetaMax2177) this.FrostHunterFlowMaxDragonHero5809;
                frostHunterVibratorBetaMax2177.FrostHunterMagnetometerFusionTitanium8202.set(frostHunterVibratorBetaMax2177.FrostHunterLooperHyperionForce4133((FrostHunterIntentForceSpeed4935) this.FrostHunterAlertDialogAuroraDelta3200, frostHunterVibratorBetaMax2177.FrostHunterViewPhantomNeo1634, 0));
                return;
            case 23:
                ((FrostHunterTextRecognitionMaxHeroHyper6407) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757.reportTrackChangeEvent((TrackChangeEvent) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 24:
                ((FrostHunterTextRecognitionMaxHeroHyper6407) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757.reportNetworkEvent((NetworkEvent) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 25:
                ((FrostHunterTextRecognitionMaxHeroHyper6407) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757.reportPlaybackErrorEvent((PlaybackErrorEvent) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 26:
                ((FrostHunterTextRecognitionMaxHeroHyper6407) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757.reportPlaybackMetrics((PlaybackMetrics) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 27:
                ((FrostHunterTextRecognitionMaxHeroHyper6407) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceEliteCelestialThunder1757.reportPlaybackStateEvent((PlaybackStateEvent) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            case 28:
                ((FrostHunterLayoutInflaterNebulaVision6522) this.FrostHunterFlowMaxDragonHero5809).accept((FrostHunterLayoutPrimeDeltaSpark7642) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
            default:
                ((FrostHunterBundleCelestialNovaXRogue4240) this.FrostHunterFlowMaxDragonHero5809).FrostHunterServiceInfoHyperionSparkMax9966((FrostHunterGeocoderHyperionTitan2118) this.FrostHunterAlertDialogAuroraDelta3200);
                return;
        }
    }
}
