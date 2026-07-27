package android.content.Context;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdHyperStrike1151 implements FrostHunterStateMasterInfernoGamma9701, FrostHunterServiceConnectionPrimeTurboPhoenix8976, FrostHunterAnalyticsNeoDragon2723, FrostHunterLaunchTitaniumPulse1914, FrostHunterViewMegaStrike3894, FrostHunterPreviewNeoEclipse6127, FrostHunterAnimatedVectorDrawablePrimeSpark2364, FrostHunterPagingGammaVortex4292, FrostHunterFirebaseModelDownloadConditionsMasterLegend3658 {
    public static FrostHunterRewardedAdHyperStrike1151 FrostHunterFlowMaxDragonHero5809;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterScaleAnimationOmegaTitan6238(-1.0f, -1.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterKeyframeGammaGamma1197 = new FrostHunterScaleAnimationOmegaTitan6238(0.0f, -1.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterScaleAnimationOmegaTitan6238(1.0f, -1.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterScaleAnimationOmegaTitan6238(-1.0f, 0.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterLightSensorForceFusion4241 = new FrostHunterScaleAnimationOmegaTitan6238(0.0f, 0.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterScaleAnimationOmegaTitan6238(1.0f, 0.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterScaleAnimationOmegaTitan6238(-1.0f, 1.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterLintTitanVortexQuantum9911 = new FrostHunterScaleAnimationOmegaTitan6238(0.0f, 1.0f);
    public static final FrostHunterScaleAnimationOmegaTitan6238 FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterScaleAnimationOmegaTitan6238(1.0f, 1.0f);
    public static final FrostHunterViewPagerPhoenixPhoenixPhantom4543 FrostHunterResourcesTitanHyperVision5823 = new FrostHunterViewPagerPhoenixPhoenixPhantom4543(-1.0f);
    public static final FrostHunterViewPagerPhoenixPhoenixPhantom4543 FrostHunterTextViewDragonStormMega4297 = new FrostHunterViewPagerPhoenixPhoenixPhantom4543(0.0f);
    public static final FrostHunterBitmapStrikeOmegaPixel8415 FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterBitmapStrikeOmegaPixel8415(-1.0f);
    public static final FrostHunterBitmapStrikeOmegaPixel8415 FrostHunterMotionSceneAuroraMega2271 = new FrostHunterBitmapStrikeOmegaPixel8415(0.0f);
    public static final FrostHunterPoseDetectionSolarTurboPhoenix3644 FrostHunterBitmapTurboDeltaNebula8743 = new FrostHunterPoseDetectionSolarTurboPhoenix3644();
    public static final /* synthetic */ FrostHunterRewardedAdHyperStrike1151 FrostHunterDialogFragmentTurboPhoenixDragon7627 = new FrostHunterRewardedAdHyperStrike1151(3);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterLooperHyperionForce4133 = new FrostHunterRewardedAdHyperStrike1151(4);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterMeteringPointBetaCyber9571 = new FrostHunterRewardedAdHyperStrike1151(5);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterServiceInfoHyperionSparkMax9966 = new FrostHunterRewardedAdHyperStrike1151(6);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterEditTextPulseHyperion1262 = new FrostHunterRewardedAdHyperStrike1151(7);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterDatabaseEliteShadowUltra2452 = new FrostHunterRewardedAdHyperStrike1151(8);
    public static final /* synthetic */ FrostHunterRewardedAdHyperStrike1151 FrostHunterCardViewSpectraCyber7714 = new FrostHunterRewardedAdHyperStrike1151(9);
    public static final /* synthetic */ FrostHunterRewardedAdHyperStrike1151 FrostHunterViewPhantomNeo1634 = new FrostHunterRewardedAdHyperStrike1151(10);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterMeteringPointMegaCyber7955 = new FrostHunterRewardedAdHyperStrike1151(11);
    public static final /* synthetic */ FrostHunterRewardedAdHyperStrike1151 FrostHunterBillingClientFusionVortex9008 = new FrostHunterRewardedAdHyperStrike1151(12);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterMediaPlayerCelestialBetaTitan3868 = new FrostHunterRewardedAdHyperStrike1151(13);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterTranslateAnimationCyberSolarUltra7101 = new FrostHunterRewardedAdHyperStrike1151(14);
    public static final FrostHunterRewardedAdHyperStrike1151 FrostHunterStateCelestialNovaPixel8414 = new FrostHunterRewardedAdHyperStrike1151(15);
    public static final /* synthetic */ FrostHunterRewardedAdHyperStrike1151 FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterRewardedAdHyperStrike1151(16);

    public FrostHunterRewardedAdHyperStrike1151(FrostHunterActivityInfoTitaniumAlphaElite4329 frostHunterActivityInfoTitaniumAlphaElite4329) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 28;
    }

    public static final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterTextInputEditTextCosmosInferno2158 frostHunterTextInputEditTextCosmosInferno2158) {
        FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844 = FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterCameraXPixelTurboCosmos9814;
        if (FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterFlowMaxDragonHero5809 == null) {
            FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterFlowMaxDragonHero5809 = new FrostHunterTextInputEditTextCosmosInferno2158();
            FrostHunterScrollViewDragonAurora6038 frostHunterScrollViewDragonAurora6038 = new FrostHunterScrollViewDragonAurora6038("Okio Watchdog");
            frostHunterScrollViewDragonAurora6038.setDaemon(true);
            frostHunterScrollViewDragonAurora6038.start();
        }
        long nanoTime = System.nanoTime();
        long j = frostHunterTextInputEditTextCosmosInferno2158.FrostHunterBundlePulseFusionHero2475;
        boolean z = frostHunterTextInputEditTextCosmosInferno2158.FrostHunterAlphaAnimationNeoCosmos5761;
        if (j != 0 && z) {
            frostHunterTextInputEditTextCosmosInferno2158.FrostHunterRemoteConfigSpeedSpeed8566 = Math.min(j, frostHunterTextInputEditTextCosmosInferno2158.FrostHunterBundlePulseFusionHero2475() - nanoTime) + nanoTime;
        } else if (j != 0) {
            frostHunterTextInputEditTextCosmosInferno2158.FrostHunterRemoteConfigSpeedSpeed8566 = nanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            frostHunterTextInputEditTextCosmosInferno2158.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterTextInputEditTextCosmosInferno2158.FrostHunterBundlePulseFusionHero2475();
        }
        FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic68442 = FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterCameraXPixelTurboCosmos9814;
        int i = frostHunterNestedScrollViewMaxEpicEpic68442.FrostHunterFlowMaxDragonHero5809 + 1;
        frostHunterNestedScrollViewMaxEpicEpic68442.FrostHunterFlowMaxDragonHero5809 = i;
        FrostHunterTextInputEditTextCosmosInferno2158[] frostHunterTextInputEditTextCosmosInferno2158Arr = (FrostHunterTextInputEditTextCosmosInferno2158[]) frostHunterNestedScrollViewMaxEpicEpic68442.FrostHunterAlertDialogAuroraDelta3200;
        if (i == frostHunterTextInputEditTextCosmosInferno2158Arr.length) {
            FrostHunterTextInputEditTextCosmosInferno2158[] frostHunterTextInputEditTextCosmosInferno2158Arr2 = new FrostHunterTextInputEditTextCosmosInferno2158[i * 2];
            FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(0, 0, 14, frostHunterTextInputEditTextCosmosInferno2158Arr, frostHunterTextInputEditTextCosmosInferno2158Arr2);
            frostHunterNestedScrollViewMaxEpicEpic68442.FrostHunterAlertDialogAuroraDelta3200 = frostHunterTextInputEditTextCosmosInferno2158Arr2;
        }
        frostHunterNestedScrollViewMaxEpicEpic68442.FrostHunterConstraintSetCloneMasterUltraRogue2633(i, frostHunterTextInputEditTextCosmosInferno2158);
        if (frostHunterTextInputEditTextCosmosInferno2158.FrostHunterLevelListDrawableFusionDragonHero2232 == 1) {
            FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterKeyframeGammaGamma1197.signal();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? FrostHunterScaleAnimationStrikeSpark5059(packageInfo2, FrostHunterFirebaseModelDownloadConditionsLegendOlympianStrike6876.FrostHunterAlphaAnimationNeoCosmos5761) : FrostHunterScaleAnimationStrikeSpark5059(packageInfo2, FrostHunterFirebaseModelDownloadConditionsLegendOlympianStrike6876.FrostHunterAlphaAnimationNeoCosmos5761[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z = true;
        if (packageInfo != null) {
            if ((!z ? FrostHunterScaleAnimationStrikeSpark5059(packageInfo2, FrostHunterFirebaseModelDownloadConditionsLegendOlympianStrike6876.FrostHunterAlphaAnimationNeoCosmos5761) : FrostHunterScaleAnimationStrikeSpark5059(packageInfo2, FrostHunterFirebaseModelDownloadConditionsLegendOlympianStrike6876.FrostHunterAlphaAnimationNeoCosmos5761[0])) == null) {
            }
        }
        return false;
    }

    public static FrostHunterVideoCaptureEclipseGamma2116 FrostHunterFragmentBetaMegaVortex6025(List list) {
        return new FrostHunterVideoCaptureEclipseGamma2116((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), list);
    }

    public static FrostHunterTextInputEditTextCosmosInferno2158 FrostHunterKeyframeGammaGamma1197() {
        FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844 = FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterTextInputEditTextCosmosInferno2158 frostHunterTextInputEditTextCosmosInferno2158 = ((FrostHunterTextInputEditTextCosmosInferno2158[]) frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200)[1];
        if (frostHunterTextInputEditTextCosmosInferno2158 == null) {
            long nanoTime = System.nanoTime();
            FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterKeyframeGammaGamma1197.await(FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterFragmentBetaMegaVortex6025, TimeUnit.MILLISECONDS);
            if (((FrostHunterTextInputEditTextCosmosInferno2158[]) frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200)[1] != null || System.nanoTime() - nanoTime < FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                return null;
            }
            return FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterFlowMaxDragonHero5809;
        }
        long nanoTime2 = frostHunterTextInputEditTextCosmosInferno2158.FrostHunterRemoteConfigSpeedSpeed8566 - System.nanoTime();
        if (nanoTime2 > 0) {
            FrostHunterTextInputEditTextCosmosInferno2158.FrostHunterKeyframeGammaGamma1197.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterLifecycleBlazeGammaElite2889(frostHunterTextInputEditTextCosmosInferno2158);
        frostHunterTextInputEditTextCosmosInferno2158.FrostHunterLifecycleBlazeGammaElite2889 = 2;
        return frostHunterTextInputEditTextCosmosInferno2158;
    }

    public static FrostHunterVideoCaptureEclipseGamma2116 FrostHunterLightSensorForceFusion4241(List list) {
        return new FrostHunterVideoCaptureEclipseGamma2116((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L), list);
    }

    public static final FrostHunterDelayAlphaShadow5397 FrostHunterScaleAnimationStrikeSpark5059(PackageInfo packageInfo, FrostHunterDelayAlphaShadow5397... frostHunterDelayAlphaShadow5397Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        FrostHunterGradientDrawableTitanAuroraSolar5069 frostHunterGradientDrawableTitanAuroraSolar5069 = new FrostHunterGradientDrawableTitanAuroraSolar5069(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < frostHunterDelayAlphaShadow5397Arr.length; i++) {
            if (frostHunterDelayAlphaShadow5397Arr[i].equals(frostHunterGradientDrawableTitanAuroraSolar5069)) {
                return frostHunterDelayAlphaShadow5397Arr[i];
            }
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterLaunchTitaniumPulse1914
    public float FrostHunterAlphaAnimationNeoCosmos5761() {
        return Float.NaN;
    }

    @Override // android.content.Context.FrostHunterPagingGammaVortex4292
    public byte[] FrostHunterBundlePulseFusionHero2475(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // android.content.Context.FrostHunterLaunchTitaniumPulse1914
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int i = FrostHunterViewModelScopeLegendAurora8732.FrostHunterCameraXPixelTurboCosmos9814;
        return FrostHunterViewModelScopeLegendAurora8732.FrostHunterRemoteConfigSpeedSpeed8566;
    }

    @Override // android.content.Context.FrostHunterViewMegaStrike3894
    public Object FrostHunterFlowMaxDragonHero5809(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        if (frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterCameraXPixelTurboCosmos9814()) {
            return (Bundle) frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLevelListDrawableFusionDragonHero2232();
        }
        if (Log.isLoggable("Rpc", 3)) {
            "Error making request: ".concat(String.valueOf(frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLifecycleBlazeGammaElite2889()));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLifecycleBlazeGammaElite2889());
    }

    @Override // android.content.Context.FrostHunterServiceConnectionPrimeTurboPhoenix8976
    public Object FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                Object FrostHunterKeyframeGammaGamma11972 = frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterKeyframeGammaGamma1197(new FrostHunterObserverVisionSpeed8931(FrostHunterTransitionTurboTurbo4252.class, Executor.class));
                FrostHunterKeyframeGammaGamma11972.getClass();
                return new FrostHunterNavigationSparkNeoTitan8957((Executor) FrostHunterKeyframeGammaGamma11972);
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                Object FrostHunterKeyframeGammaGamma11973 = frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterKeyframeGammaGamma1197(new FrostHunterObserverVisionSpeed8931(FrostHunterRemoteModelManagerShadowTitanium7242.class, Executor.class));
                FrostHunterKeyframeGammaGamma11973.getClass();
                return new FrostHunterNavigationSparkNeoTitan8957((Executor) FrostHunterKeyframeGammaGamma11973);
            default:
                Object FrostHunterKeyframeGammaGamma11974 = frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterKeyframeGammaGamma1197(new FrostHunterObserverVisionSpeed8931(FrostHunterMaterialButtonEpicMasterHero2360.class, Executor.class));
                FrostHunterKeyframeGammaGamma11974.getClass();
                return new FrostHunterNavigationSparkNeoTitan8957((Executor) FrostHunterKeyframeGammaGamma11974);
        }
    }

    @Override // android.content.Context.FrostHunterFirebaseModelDownloadConditionsMasterLegend3658
    public long FrostHunterLifecycleBlazeGammaElite2889(long j, long j2) {
        float FrostHunterBundlePulseFusionHero2475 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterBundlePulseFusionHero2475(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(FrostHunterBundlePulseFusionHero2475) << 32) | (Float.floatToRawIntBits(FrostHunterBundlePulseFusionHero2475) & 4294967295L);
        int i = FrostHunterClipDrawableMegaMaxDragon5006.FrostHunterAlphaAnimationNeoCosmos5761;
        return floatToRawIntBits;
    }

    @Override // android.content.Context.FrostHunterLaunchTitaniumPulse1914
    public FrostHunterCardViewHyperionAurora3829 FrostHunterRemoteConfigSpeedSpeed8566() {
        return null;
    }

    public List FrostHunterServiceConnectionTurboPhoenixOmega6719(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (FrostHunterAnimatorStormAurora6710 frostHunterAnimatorStormAurora6710 : componentRegistrar.getComponents()) {
            String str = frostHunterAnimatorStormAurora6710.FrostHunterAlphaAnimationNeoCosmos5761;
            if (str != null) {
                frostHunterAnimatorStormAurora6710 = new FrostHunterAnimatorStormAurora6710(str, frostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatorStormAurora6710.FrostHunterBundlePulseFusionHero2475, frostHunterAnimatorStormAurora6710.FrostHunterServiceEliteCelestialThunder1757, frostHunterAnimatorStormAurora6710.FrostHunterLifecycleBlazeGammaElite2889, new FrostHunterAccelerometerNovaXEliteOmega1915(0, str, frostHunterAnimatorStormAurora6710), frostHunterAnimatorStormAurora6710.FrostHunterRemoteConfigSpeedSpeed8566);
            }
            arrayList.add(frostHunterAnimatorStormAurora6710);
        }
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterAnalyticsNeoDragon2723
    public boolean FrostHunterServiceEliteCelestialThunder1757(Object obj, Object obj2) {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case 11:
                break;
            default:
                if (obj == obj2) {
                }
                break;
        }
        return false;
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return "{}";
            case 11:
                return "NeverEqualPolicy";
            case 13:
                return "ReferentialEqualityPolicy";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterRewardedAdHyperStrike1151(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }
}
