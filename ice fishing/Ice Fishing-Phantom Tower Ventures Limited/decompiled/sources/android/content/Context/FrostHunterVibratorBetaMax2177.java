package android.content.Context;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterVibratorBetaMax2177 extends FrostHunterFaceDetectionPixelFusionBlaze5291 {
    public static final byte[] FrostHunterScaleAnimationHeroStormNeo5898 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int FrostHunterAlphaAnimationNovaGamma6326;
    public boolean FrostHunterAnimatorSetEliteQuantum4520;
    public boolean FrostHunterAnnotationProcessorSolarSpeedNebula4443;
    public boolean FrostHunterAnnotationProcessorSparkEclipse8710;
    public boolean FrostHunterBannerAdNebulaMasterBeta4389;
    public final FrostHunterFontFamilyHyperPulseBlaze7157 FrostHunterBillingClientFusionVortex9008;
    public int FrostHunterBindingAdapterInfernoFusionForce2284;
    public int FrostHunterCamera2NeoMax8666;
    public boolean FrostHunterCameraXPrimeTitanGamma7495;
    public final FrostHunterAsyncTaskPrimeGammaTitan9007 FrostHunterCardViewSpectraCyber7714;
    public FrostHunterStorageNovaXEliteAurora3066 FrostHunterColorDrawableLegendPhoenixVision7927;
    public FrostHunterPagingSourceOlympianMega1078 FrostHunterColorStateListInflaterNovaQuantum4229;
    public boolean FrostHunterColorStateListMegaBetaFusion7423;
    public MediaFormat FrostHunterConstraintSetCloneOmegaHyperion9304;
    public long FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
    public int FrostHunterCoordinatorLayoutGammaTurboSpark2420;
    public final float FrostHunterDatabaseEliteShadowUltra2452;
    public boolean FrostHunterDrawableCompatHeroMasterSpectra7412;
    public final FrostHunterFlowHyperionVortexDelta5013 FrostHunterEditTextPulseHyperion1262;
    public boolean FrostHunterExecutorNeoDragonMax5687;
    public FrostHunterSQLiteMasterUltra9956 FrostHunterFCMDeltaQuantumHero8364;
    public boolean FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402;
    public FrostHunterWindowManagerMasterOmegaGamma7106 FrostHunterFlipAnimationPrimeOlympian7620;
    public boolean FrostHunterGradleOmegaVisionSpectra5961;
    public boolean FrostHunterGyroscopeOmegaEclipseOlympian7225;
    public long FrostHunterImageAnalysisGammaOlympian2400;
    public long FrostHunterImageAnalysisPixelForceOlympian4333;
    public boolean FrostHunterInAppPurchaseLegendEpicDragon4579;
    public boolean FrostHunterItemDecorationPhoenixAlphaVortex8006;
    public FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 FrostHunterItemDecorationPixelShadow2695;
    public FrostHunterSoundPoolNeoEclipseDelta2867 FrostHunterLayerEpicHyperQuantum7656;
    public long FrostHunterLayoutLegendDelta7410;
    public int FrostHunterLiveDataBetaLegend3442;
    public final AtomicInteger FrostHunterMagnetometerFusionTitanium8202;
    public final MediaCodec.BufferInfo FrostHunterMediaPlayerCelestialBetaTitan3868;
    public final Context FrostHunterMeteringPointBetaCyber9571;
    public final FrostHunterAsyncTaskPrimeGammaTitan9007 FrostHunterMeteringPointMegaCyber7955;
    public boolean FrostHunterMotionSceneHeroShadow5987;
    public final long FrostHunterNavigationMasterMegaMax2752;
    public ByteBuffer FrostHunterNavigationViewMasterVortexBeta1295;
    public boolean FrostHunterNestedScrollViewPixelPhantom8605;
    public boolean FrostHunterNestedScrollViewThunderNovaX6772;
    public boolean FrostHunterObjectAnimatorPhoenixSpectraThunder6218;
    public FrostHunterSoundPoolNeoEclipseDelta2867 FrostHunterObjectDetectionDeltaHyperEpic7162;
    public FrostHunterFirebaseOlympianMax4818 FrostHunterPagingDataTurboTitanium7332;
    public MediaCrypto FrostHunterPagingSourceEclipseDelta8255;
    public FrostHunterAnimatorSetEclipseHeroHyperion7191 FrostHunterPermissionInfoAlphaDelta6279;
    public int FrostHunterPlaceholderLegendForceNebula9869;
    public float FrostHunterPreviewBlazeAurora1020;
    public FrostHunterFirebaseOlympianMax4818 FrostHunterPushNotificationStormTitanGamma8999;
    public FrostHunterFirebaseOlympianMax4818 FrostHunterR8MasterNebulaSpark7247;
    public FrostHunterLightSensorUltraBlazeNovaX9540 FrostHunterRecyclerViewBetaNovaX7224;
    public FrostHunterIntentSpeedCyber8582 FrostHunterRemoteConfigThunderShadow4435;
    public FrostHunterSQLiteMasterUltra9956 FrostHunterRewardedAdMasterStrike9463;
    public float FrostHunterRewardedAdSpectraElite8288;
    public ArrayDeque FrostHunterRunnableCosmosCelestial4235;
    public final FrostHunterKeyframeRogueStorm7563 FrostHunterServiceInfoHyperionSparkMax9966;
    public FrostHunterDialogVortexMega8716 FrostHunterShapeDrawableSolarOlympian7689;
    public boolean FrostHunterSharedElementPixelTitan2806;
    public boolean FrostHunterSoundPoolNovaTitanTitan5784;
    public final FrostHunterGradlePulseOlympianTurbo1196 FrostHunterStateCelestialNovaPixel8414;
    public boolean FrostHunterTransformNovaBetaNovaX5251;
    public float FrostHunterTransitionListenerPulseVortexCosmos7949;
    public final ArrayDeque FrostHunterTranslateAnimationCyberSolarUltra7101;
    public boolean FrostHunterViewModelScopeTitanRogue1970;
    public long FrostHunterViewPager2StrikePulse8790;
    public final FrostHunterAsyncTaskPrimeGammaTitan9007 FrostHunterViewPhantomNeo1634;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterVibratorBetaMax2177(Context context, int i, FrostHunterKeyframeRogueStorm7563 frostHunterKeyframeRogueStorm7563, float f) {
        super(i);
        FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013 = FrostHunterFlowHyperionVortexDelta5013.FrostHunterFragmentBetaMegaVortex6025;
        this.FrostHunterMeteringPointBetaCyber9571 = context.getApplicationContext();
        this.FrostHunterServiceInfoHyperionSparkMax9966 = frostHunterKeyframeRogueStorm7563;
        this.FrostHunterEditTextPulseHyperion1262 = frostHunterFlowHyperionVortexDelta5013;
        this.FrostHunterDatabaseEliteShadowUltra2452 = f;
        this.FrostHunterMagnetometerFusionTitanium8202 = new AtomicInteger();
        this.FrostHunterCardViewSpectraCyber7714 = new FrostHunterAsyncTaskPrimeGammaTitan9007(0);
        this.FrostHunterViewPhantomNeo1634 = new FrostHunterAsyncTaskPrimeGammaTitan9007(0);
        this.FrostHunterMeteringPointMegaCyber7955 = new FrostHunterAsyncTaskPrimeGammaTitan9007(2);
        FrostHunterFontFamilyHyperPulseBlaze7157 frostHunterFontFamilyHyperPulseBlaze7157 = new FrostHunterFontFamilyHyperPulseBlaze7157(2);
        frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterResourcesTitanHyperVision5823 = 32;
        this.FrostHunterBillingClientFusionVortex9008 = frostHunterFontFamilyHyperPulseBlaze7157;
        this.FrostHunterMediaPlayerCelestialBetaTitan3868 = new MediaCodec.BufferInfo();
        this.FrostHunterTransitionListenerPulseVortexCosmos7949 = 1.0f;
        this.FrostHunterRewardedAdSpectraElite8288 = 1.0f;
        this.FrostHunterNavigationMasterMegaMax2752 = -9223372036854775807L;
        this.FrostHunterTranslateAnimationCyberSolarUltra7101 = new ArrayDeque();
        this.FrostHunterRecyclerViewBetaNovaX7224 = FrostHunterLightSensorUltraBlazeNovaX9540.FrostHunterRemoteConfigSpeedSpeed8566;
        frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterRemoteConfigSpeedSpeed8566(0);
        frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterFragmentBetaMegaVortex6025.order(ByteOrder.nativeOrder());
        FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo1196 = new FrostHunterGradlePulseOlympianTurbo1196();
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterFlowMaxDragonHero5809 = 0;
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterStateCelestialNovaPixel8414 = frostHunterGradlePulseOlympianTurbo1196;
        this.FrostHunterPreviewBlazeAurora1020 = -1.0f;
        this.FrostHunterLiveDataBetaLegend3442 = 0;
        this.FrostHunterBindingAdapterInfernoFusionForce2284 = 0;
        this.FrostHunterPlaceholderLegendForceNebula9869 = -1;
        this.FrostHunterAlphaAnimationNovaGamma6326 = -1;
        this.FrostHunterViewPager2StrikePulse8790 = -9223372036854775807L;
        this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 = -9223372036854775807L;
        this.FrostHunterImageAnalysisPixelForceOlympian4333 = -9223372036854775807L;
        this.FrostHunterImageAnalysisGammaOlympian2400 = -9223372036854775807L;
        this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 0;
        this.FrostHunterCamera2NeoMax8666 = 0;
        this.FrostHunterFlipAnimationPrimeOlympian7620 = new FrostHunterWindowManagerMasterOmegaGamma7106();
        this.FrostHunterCameraXPrimeTitanGamma7495 = false;
        this.FrostHunterLayoutLegendDelta7410 = 0L;
        int i2 = FrostHunterDialogVortexMega8716.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterShapeDrawableSolarOlympian7689 = FrostHunterViewMegaOmega8556.FrostHunterLintTitanVortexQuantum9911;
        FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta2867 = FrostHunterSoundPoolNeoEclipseDelta2867.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterLayerEpicHyperQuantum7656 = frostHunterSoundPoolNeoEclipseDelta2867;
        this.FrostHunterObjectDetectionDeltaHyperEpic7162 = frostHunterSoundPoolNeoEclipseDelta2867;
    }

    public final void FrostHunterAlphaAnimationNovaGamma6326() {
        int i = this.FrostHunterCamera2NeoMax8666;
        if (i == 1) {
            FrostHunterFCMDeltaQuantumHero8364();
            return;
        }
        if (i == 2) {
            FrostHunterFCMDeltaQuantumHero8364();
            FrostHunterExecutorNeoDragonMax5687();
        } else if (i != 3) {
            this.FrostHunterObjectAnimatorPhoenixSpectraThunder6218 = true;
            FrostHunterAnnotationProcessorSolarSpeedNebula4443();
        } else {
            FrostHunterAnimatorSetEliteQuantum4520();
            FrostHunterPreviewBlazeAurora1020();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FrostHunterAnimatorSetEliteQuantum4520() {
        try {
            FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
            if (frostHunterIntentSpeedCyber8582 != null) {
                frostHunterIntentSpeedCyber8582.FrostHunterAlphaAnimationNeoCosmos5761();
                this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterConstraintSetCloneMasterUltraRogue2633++;
                FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
                frostHunterStorageNovaXEliteAurora3066.getClass();
                FrostHunterNestedScrollViewThunderNovaX6772(frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761);
            }
            this.FrostHunterRemoteConfigThunderShadow4435 = null;
            try {
                MediaCrypto mediaCrypto = this.FrostHunterPagingSourceEclipseDelta8255;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.FrostHunterRemoteConfigThunderShadow4435 = null;
            try {
                MediaCrypto mediaCrypto2 = this.FrostHunterPagingSourceEclipseDelta8255;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void FrostHunterAnnotationProcessorSolarSpeedNebula4443();

    public final boolean FrostHunterAnnotationProcessorSparkEclipse8710(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterR8MasterNebulaSpark7247;
        return frostHunterFirebaseOlympianMax4818 == null || !Objects.equals(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059, "audio/opus") || j - j2 > 80000;
    }

    public final boolean FrostHunterBannerAdNebulaMasterBeta4389(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        if (this.FrostHunterRemoteConfigThunderShadow4435 != null && this.FrostHunterCamera2NeoMax8666 != 3 && this.FrostHunterScaleAnimationStrikeSpark5059 != 0) {
            float f = this.FrostHunterRewardedAdSpectraElite8288;
            frostHunterFirebaseOlympianMax4818.getClass();
            FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr = this.FrostHunterLintTitanVortexQuantum9911;
            frostHunterFirebaseOlympianMax4818Arr.getClass();
            float FrostHunterPagingSourceEclipseDelta8255 = FrostHunterPagingSourceEclipseDelta8255(f, frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax4818Arr);
            float f2 = this.FrostHunterPreviewBlazeAurora1020;
            if (f2 != FrostHunterPagingSourceEclipseDelta8255) {
                if (FrostHunterPagingSourceEclipseDelta8255 == -1.0f) {
                    if (this.FrostHunterItemDecorationPhoenixAlphaVortex8006) {
                        this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 1;
                        this.FrostHunterCamera2NeoMax8666 = 3;
                        return false;
                    }
                    FrostHunterAnimatorSetEliteQuantum4520();
                    FrostHunterPreviewBlazeAurora1020();
                    return false;
                }
                if (f2 != -1.0f || FrostHunterPagingSourceEclipseDelta8255 > this.FrostHunterDatabaseEliteShadowUltra2452) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", FrostHunterPagingSourceEclipseDelta8255);
                    FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
                    frostHunterIntentSpeedCyber8582.getClass();
                    frostHunterIntentSpeedCyber8582.FrostHunterServiceEliteCelestialThunder1757(bundle);
                    this.FrostHunterPreviewBlazeAurora1020 = FrostHunterPagingSourceEclipseDelta8255;
                }
            }
        }
        return true;
    }

    public final void FrostHunterBillingClientFusionVortex9008(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.FrostHunterLayerEpicHyperQuantum7656.FrostHunterAlphaAnimationNeoCosmos5761.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    public final void FrostHunterBindingAdapterInfernoFusionForce2284() {
        FrostHunterViewModelScopeTitanRogue1970();
        this.FrostHunterItemDecorationPixelShadow2695 = null;
        this.FrostHunterRunnableCosmosCelestial4235 = null;
        this.FrostHunterColorDrawableLegendPhoenixVision7927 = null;
        this.FrostHunterPushNotificationStormTitanGamma8999 = null;
        this.FrostHunterConstraintSetCloneOmegaHyperion9304 = null;
        this.FrostHunterAnnotationProcessorSparkEclipse8710 = false;
        this.FrostHunterGyroscopeOmegaEclipseOlympian7225 = false;
        this.FrostHunterPreviewBlazeAurora1020 = -1.0f;
        this.FrostHunterLiveDataBetaLegend3442 = 0;
        this.FrostHunterSoundPoolNovaTitanTitan5784 = false;
        this.FrostHunterNestedScrollViewPixelPhantom8605 = false;
        this.FrostHunterInAppPurchaseLegendEpicDragon4579 = false;
        this.FrostHunterViewModelScopeTitanRogue1970 = false;
        this.FrostHunterBindingAdapterInfernoFusionForce2284 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterBitmapTurboDeltaNebula8743(FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr, long j, long j2, FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960) {
        if (this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterBundlePulseFusionHero2475 == -9223372036854775807L) {
            FrostHunterCamera2NeoMax8666(new FrostHunterLightSensorUltraBlazeNovaX9540(-9223372036854775807L, j, j2));
            if (this.FrostHunterMotionSceneHeroShadow5987) {
                FrostHunterViewPager2StrikePulse8790();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
        if (arrayDeque.isEmpty()) {
            long j3 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
            if (j3 != -9223372036854775807L) {
                long j4 = this.FrostHunterImageAnalysisPixelForceOlympian4333;
                if (j4 != -9223372036854775807L) {
                }
            }
            FrostHunterCamera2NeoMax8666(new FrostHunterLightSensorUltraBlazeNovaX9540(-9223372036854775807L, j, j2));
            if (this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
                FrostHunterViewPager2StrikePulse8790();
                return;
            }
            return;
        }
        arrayDeque.add(new FrostHunterLightSensorUltraBlazeNovaX9540(this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277, j, j2));
    }

    public final void FrostHunterCamera2NeoMax8666(FrostHunterLightSensorUltraBlazeNovaX9540 frostHunterLightSensorUltraBlazeNovaX9540) {
        this.FrostHunterRecyclerViewBetaNovaX7224 = frostHunterLightSensorUltraBlazeNovaX9540;
        if (frostHunterLightSensorUltraBlazeNovaX9540.FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
            this.FrostHunterGradleOmegaVisionSpectra5961 = true;
            FrostHunterImageAnalysisGammaOlympian2400();
        }
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public void FrostHunterCameraXTurboCelestialHero5430(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
        if (!arrayDeque.isEmpty()) {
            this.FrostHunterRecyclerViewBetaNovaX7224 = (FrostHunterLightSensorUltraBlazeNovaX9540) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402 = false;
            this.FrostHunterObjectAnimatorPhoenixSpectraThunder6218 = false;
            this.FrostHunterExecutorNeoDragonMax5687 = false;
            if (this.FrostHunterAnimatorSetEliteQuantum4520) {
                FrostHunterTransformNovaBetaNovaX5251();
            } else if (this.FrostHunterRemoteConfigThunderShadow4435 != null) {
                if (FrostHunterCoordinatorLayoutDragonHyperionSolar9277()) {
                    FrostHunterAnimatorSetEliteQuantum4520();
                    FrostHunterPreviewBlazeAurora1020();
                } else if (FrostHunterDrawableCompatHeroMasterSpectra7412()) {
                    FrostHunterFCMDeltaQuantumHero8364();
                } else {
                    this.FrostHunterCameraXPrimeTitanGamma7495 = true;
                }
            }
            if (this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterServiceEliteCelestialThunder1757.FrostHunterLevelListDrawableFusionDragonHero2232() > 0) {
                this.FrostHunterBannerAdNebulaMasterBeta4389 = true;
            }
            FrostHunterInstrumentationThunderEpicPixel7003 frostHunterInstrumentationThunderEpicPixel7003 = this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterServiceEliteCelestialThunder1757;
            synchronized (frostHunterInstrumentationThunderEpicPixel7003) {
                frostHunterInstrumentationThunderEpicPixel7003.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
                frostHunterInstrumentationThunderEpicPixel7003.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
                Arrays.fill((Object[]) frostHunterInstrumentationThunderEpicPixel7003.FrostHunterServiceEliteCelestialThunder1757, (Object) null);
            }
            this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterLifecycleBlazeGammaElite2889 = false;
        }
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final int FrostHunterCardViewSpectraCyber7714(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        try {
            return FrostHunterObjectAnimatorPhoenixSpectraThunder6218(this.FrostHunterEditTextPulseHyperion1262, frostHunterFirebaseOlympianMax4818);
        } catch (FrostHunterStateTitaniumHyperTitanium4233 e) {
            throw this.FrostHunterRemoteConfigSpeedSpeed8566(e, frostHunterFirebaseOlympianMax4818, false, 4002);
        }
    }

    public abstract void FrostHunterColorDrawableLegendPhoenixVision7927(Exception exc);

    public boolean FrostHunterColorStateListInflaterNovaQuantum4229(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (java.util.Objects.equals(r2, "video/av01") == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterColorStateListMegaBetaFusion7423(FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818;
        int i;
        Pair FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String str;
        boolean z = true;
        this.FrostHunterBannerAdNebulaMasterBeta4389 = true;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = (FrostHunterFirebaseOlympianMax4818) frostHunterIntentForceSpeed4935.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterFirebaseOlympianMax48182.getClass();
        String str2 = frostHunterFirebaseOlympianMax48182.FrostHunterScaleAnimationStrikeSpark5059;
        if (str2 == null) {
            throw FrostHunterRemoteConfigSpeedSpeed8566(new IllegalArgumentException("Sample MIME type is null."), frostHunterFirebaseOlympianMax48182, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = FrostHunterTraceVisionNova3975.FrostHunterAlphaAnimationNeoCosmos5761;
                if (str2.equals("video/dolby-vision") && (FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48182)) != null) {
                    int intValue = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).intValue();
                    if (intValue == 16 || intValue == 32 || intValue == 256) {
                        str = "video/hevc";
                    } else if (intValue == 512) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = null;
            }
            frostHunterFirebaseOlympianMax4818 = frostHunterFirebaseOlympianMax48182;
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = (FrostHunterSQLiteMasterUltra9956) frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809;
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterRewardedAdMasterStrike9463;
            this.FrostHunterRewardedAdMasterStrike9463 = frostHunterSQLiteMasterUltra9956;
            this.FrostHunterPagingDataTurboTitanium7332 = frostHunterFirebaseOlympianMax4818;
            if (this.FrostHunterAnimatorSetEliteQuantum4520) {
                this.FrostHunterTransformNovaBetaNovaX5251 = true;
                return null;
            }
            FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
            if (frostHunterIntentSpeedCyber8582 == null) {
                this.FrostHunterRunnableCosmosCelestial4235 = null;
                FrostHunterPreviewBlazeAurora1020();
                return null;
            }
            FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = this.FrostHunterColorDrawableLegendPhoenixVision7927;
            frostHunterStorageNovaXEliteAurora3066.getClass();
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48183 = this.FrostHunterPushNotificationStormTitanGamma8999;
            frostHunterFirebaseOlympianMax48183.getClass();
            if (this.FrostHunterFCMDeltaQuantumHero8364 != this.FrostHunterRewardedAdMasterStrike9463) {
                if (this.FrostHunterItemDecorationPhoenixAlphaVortex8006) {
                    this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 1;
                    this.FrostHunterCamera2NeoMax8666 = 3;
                } else {
                    FrostHunterAnimatorSetEliteQuantum4520();
                    FrostHunterPreviewBlazeAurora1020();
                }
                return new FrostHunterMagnetometerMasterMasterRogue3873(frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax4818, 0, 128);
            }
            boolean z2 = this.FrostHunterRewardedAdMasterStrike9463 != this.FrostHunterFCMDeltaQuantumHero8364;
            FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterTranslateAnimationCyberSolarUltra7101 = FrostHunterTranslateAnimationCyberSolarUltra7101(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax4818, FrostHunterRewardedAdSpectraElite8288().FrostHunterLifecycleBlazeGammaElite2889);
            int i2 = FrostHunterTranslateAnimationCyberSolarUltra7101.FrostHunterServiceEliteCelestialThunder1757;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (FrostHunterBannerAdNebulaMasterBeta4389(frostHunterFirebaseOlympianMax4818)) {
                        this.FrostHunterPushNotificationStormTitanGamma8999 = frostHunterFirebaseOlympianMax4818;
                        if (z2) {
                            FrostHunterMagnetometerFusionTitanium8202();
                        } else if (this.FrostHunterItemDecorationPhoenixAlphaVortex8006) {
                            this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 1;
                            this.FrostHunterCamera2NeoMax8666 = 1;
                        }
                    }
                    i = 16;
                } else if (i2 == 2) {
                    if (FrostHunterBannerAdNebulaMasterBeta4389(frostHunterFirebaseOlympianMax4818)) {
                        this.FrostHunterViewModelScopeTitanRogue1970 = true;
                        this.FrostHunterBindingAdapterInfernoFusionForce2284 = 1;
                        int i3 = this.FrostHunterLiveDataBetaLegend3442;
                        if (i3 != 2 && (i3 != 1 || frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271 != frostHunterFirebaseOlympianMax48183.FrostHunterMotionSceneAuroraMega2271 || frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743 != frostHunterFirebaseOlympianMax48183.FrostHunterBitmapTurboDeltaNebula8743)) {
                            z = false;
                        }
                        this.FrostHunterNestedScrollViewThunderNovaX6772 = z;
                        this.FrostHunterPushNotificationStormTitanGamma8999 = frostHunterFirebaseOlympianMax4818;
                        if (z2) {
                            FrostHunterMagnetometerFusionTitanium8202();
                        }
                    }
                    i = 16;
                } else {
                    if (i2 != 3) {
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                        return null;
                    }
                    if (FrostHunterBannerAdNebulaMasterBeta4389(frostHunterFirebaseOlympianMax4818)) {
                        this.FrostHunterPushNotificationStormTitanGamma8999 = frostHunterFirebaseOlympianMax4818;
                        if (z2) {
                            FrostHunterMagnetometerFusionTitanium8202();
                        }
                    }
                    i = 16;
                }
                return (i2 != 0 || (this.FrostHunterRemoteConfigThunderShadow4435 == frostHunterIntentSpeedCyber8582 && this.FrostHunterCamera2NeoMax8666 != 3)) ? FrostHunterTranslateAnimationCyberSolarUltra7101 : new FrostHunterMagnetometerMasterMasterRogue3873(frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax4818, 0, i);
            }
            if (this.FrostHunterItemDecorationPhoenixAlphaVortex8006) {
                this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 1;
                this.FrostHunterCamera2NeoMax8666 = 3;
            } else {
                FrostHunterAnimatorSetEliteQuantum4520();
                FrostHunterPreviewBlazeAurora1020();
            }
            i = 0;
            if (i2 != 0) {
            }
        }
        if (!frostHunterFirebaseOlympianMax48182.FrostHunterCameraXTurboCelestialHero5430.isEmpty()) {
            FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax48182.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLintTitanVortexQuantum9911 = null;
            frostHunterFirebaseOlympianMax4818 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99563 = (FrostHunterSQLiteMasterUltra9956) frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809;
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra995622 = this.FrostHunterRewardedAdMasterStrike9463;
            this.FrostHunterRewardedAdMasterStrike9463 = frostHunterSQLiteMasterUltra99563;
            this.FrostHunterPagingDataTurboTitanium7332 = frostHunterFirebaseOlympianMax4818;
            if (this.FrostHunterAnimatorSetEliteQuantum4520) {
            }
        }
        frostHunterFirebaseOlympianMax4818 = frostHunterFirebaseOlympianMax48182;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra995632 = (FrostHunterSQLiteMasterUltra9956) frostHunterIntentForceSpeed4935.FrostHunterFlowMaxDragonHero5809;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956222 = this.FrostHunterRewardedAdMasterStrike9463;
        this.FrostHunterRewardedAdMasterStrike9463 = frostHunterSQLiteMasterUltra995632;
        this.FrostHunterPagingDataTurboTitanium7332 = frostHunterFirebaseOlympianMax4818;
        if (this.FrostHunterAnimatorSetEliteQuantum4520) {
        }
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291, android.content.Context.FrostHunterRoomDaoNovaXNovaX9504
    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, Object obj) {
        int i2;
        if (i == 11) {
            FrostHunterAnimatorSetEclipseHeroHyperion7191 frostHunterAnimatorSetEclipseHeroHyperion7191 = (FrostHunterAnimatorSetEclipseHeroHyperion7191) obj;
            frostHunterAnimatorSetEclipseHeroHyperion7191.getClass();
            this.FrostHunterPermissionInfoAlphaDelta6279 = frostHunterAnimatorSetEclipseHeroHyperion7191;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                FrostHunterDialogVortexMega8716 frostHunterDialogVortexMega8716 = (FrostHunterDialogVortexMega8716) obj;
                if (this.FrostHunterShapeDrawableSolarOlympian7689.equals(frostHunterDialogVortexMega8716)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(frostHunterDialogVortexMega8716);
                    HashSet hashSet2 = new HashSet();
                    FrostHunterMaterialButtonShadowStrikeOlympian8282 it = this.FrostHunterShapeDrawableSolarOlympian7689.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
                    if (frostHunterIntentSpeedCyber8582 != null) {
                        if (!hashSet2.isEmpty()) {
                            frostHunterIntentSpeedCyber8582.FrostHunterLooperHyperionForce4133(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            frostHunterIntentSpeedCyber8582.FrostHunterBitmapTurboDeltaNebula8743(new ArrayList(hashSet));
                        }
                    }
                }
                this.FrostHunterShapeDrawableSolarOlympian7689 = frostHunterDialogVortexMega8716;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta2867 = (FrostHunterSoundPoolNeoEclipseDelta2867) obj;
            this.FrostHunterLayerEpicHyperQuantum7656 = frostHunterSoundPoolNeoEclipseDelta2867;
            FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber85822 = this.FrostHunterRemoteConfigThunderShadow4435;
            if (frostHunterIntentSpeedCyber85822 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : frostHunterSoundPoolNeoEclipseDelta2867.FrostHunterAlphaAnimationNeoCosmos5761.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                frostHunterIntentSpeedCyber85822.FrostHunterServiceEliteCelestialThunder1757(bundle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, MediaCrypto mediaCrypto) {
        int i;
        boolean equals;
        String stringId;
        LogSessionId unused;
        this.FrostHunterColorDrawableLegendPhoenixVision7927 = frostHunterStorageNovaXEliteAurora3066;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterPagingDataTurboTitanium7332;
        frostHunterFirebaseOlympianMax4818.getClass();
        String str = frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761;
        float f = this.FrostHunterRewardedAdSpectraElite8288;
        FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr = this.FrostHunterLintTitanVortexQuantum9911;
        frostHunterFirebaseOlympianMax4818Arr.getClass();
        float FrostHunterPagingSourceEclipseDelta8255 = FrostHunterPagingSourceEclipseDelta8255(f, frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax4818Arr);
        if (FrostHunterPagingSourceEclipseDelta8255 <= this.FrostHunterDatabaseEliteShadowUltra2452) {
            FrostHunterPagingSourceEclipseDelta8255 = -1.0f;
        }
        this.FrostHunterLightSensorForceFusion4241.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        FrostHunterCoroutineScopeSpeedSparkAlpha3670 FrostHunterRemoteConfigThunderShadow4435 = FrostHunterRemoteConfigThunderShadow4435(frostHunterStorageNovaXEliteAurora3066, frostHunterFirebaseOlympianMax4818, mediaCrypto, FrostHunterPagingSourceEclipseDelta8255);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            frostHunterToolbarPixelHyperion1536.getClass();
            LogSessionId FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterToolbarPixelHyperion1536.FrostHunterAlphaAnimationNeoCosmos5761();
            unused = LogSessionId.LOG_SESSION_ID_NONE;
            equals = FrostHunterAlphaAnimationNeoCosmos5761.equals(LogSessionId.LOG_SESSION_ID_NONE);
            if (!equals) {
                MediaFormat mediaFormat = (MediaFormat) FrostHunterRemoteConfigThunderShadow4435.FrostHunterBundlePulseFusionHero2475;
                stringId = FrostHunterAlphaAnimationNeoCosmos5761.getStringId();
                mediaFormat.setString("log-session-id", stringId);
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            FrostHunterIntentSpeedCyber8582 FrostHunterAlphaAnimationNeoCosmos57612 = this.FrostHunterServiceInfoHyperionSparkMax9966.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterRemoteConfigThunderShadow4435);
            this.FrostHunterRemoteConfigThunderShadow4435 = FrostHunterAlphaAnimationNeoCosmos57612;
            this.FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterResourcesTitanHyperVision5823(new FrostHunterSQLiteMasterUltra9956(19, this));
            Trace.endSection();
            this.FrostHunterLightSensorForceFusion4241.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!frostHunterStorageNovaXEliteAurora3066.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterMeteringPointBetaCyber9571, frostHunterFirebaseOlympianMax4818)) {
                String FrostHunterBundlePulseFusionHero2475 = FrostHunterFirebaseOlympianMax4818.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818);
                Locale locale = Locale.US;
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Format exceeds selected codec's capabilities [" + FrostHunterBundlePulseFusionHero2475 + ", " + str + "]");
            }
            this.FrostHunterPreviewBlazeAurora1020 = FrostHunterPagingSourceEclipseDelta8255;
            this.FrostHunterPushNotificationStormTitanGamma8999 = frostHunterFirebaseOlympianMax4818;
            boolean z = false;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                    this.FrostHunterLiveDataBetaLegend3442 = i;
                    this.FrostHunterSoundPoolNovaTitanTitan5784 = i2 != 29 && "c2.android.aac.decoder".equals(str);
                    String str3 = frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761;
                    if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3) || "OMX.bcm.vdec.avc.tunnel".equals(str3) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str3) || "OMX.bcm.vdec.hevc.tunnel".equals(str3) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str3))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && frostHunterStorageNovaXEliteAurora3066.FrostHunterLevelListDrawableFusionDragonHero2232))) {
                        z = true;
                    }
                    this.FrostHunterNestedScrollViewPixelPhantom8605 = z;
                    this.FrostHunterRemoteConfigThunderShadow4435.getClass();
                    if (this.FrostHunterScaleAnimationStrikeSpark5059 == 2) {
                        this.FrostHunterLightSensorForceFusion4241.getClass();
                        this.FrostHunterViewPager2StrikePulse8790 = SystemClock.elapsedRealtime() + 1000;
                    }
                    this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterAlphaAnimationNeoCosmos5761++;
                    long j = elapsedRealtime2 - elapsedRealtime;
                    if (i2 >= 31 && !this.FrostHunterShapeDrawableSolarOlympian7689.isEmpty()) {
                        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
                        frostHunterIntentSpeedCyber8582.getClass();
                        frostHunterIntentSpeedCyber8582.FrostHunterBitmapTurboDeltaNebula8743(new ArrayList(this.FrostHunterShapeDrawableSolarOlympian7689));
                    }
                    FrostHunterLiveDataBetaLegend3442(str, elapsedRealtime2, j);
                }
            }
            i = 0;
            this.FrostHunterLiveDataBetaLegend3442 = i;
            this.FrostHunterSoundPoolNovaTitanTitan5784 = i2 != 29 && "c2.android.aac.decoder".equals(str);
            String str32 = frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i2 <= 25) {
                z = true;
                this.FrostHunterNestedScrollViewPixelPhantom8605 = z;
                this.FrostHunterRemoteConfigThunderShadow4435.getClass();
                if (this.FrostHunterScaleAnimationStrikeSpark5059 == 2) {
                }
                this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterAlphaAnimationNeoCosmos5761++;
                long j2 = elapsedRealtime2 - elapsedRealtime;
                if (i2 >= 31) {
                    FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber85822 = this.FrostHunterRemoteConfigThunderShadow4435;
                    frostHunterIntentSpeedCyber85822.getClass();
                    frostHunterIntentSpeedCyber85822.FrostHunterBitmapTurboDeltaNebula8743(new ArrayList(this.FrostHunterShapeDrawableSolarOlympian7689));
                }
                FrostHunterLiveDataBetaLegend3442(str, elapsedRealtime2, j2);
            }
            z = true;
            this.FrostHunterNestedScrollViewPixelPhantom8605 = z;
            this.FrostHunterRemoteConfigThunderShadow4435.getClass();
            if (this.FrostHunterScaleAnimationStrikeSpark5059 == 2) {
            }
            this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterAlphaAnimationNeoCosmos5761++;
            long j22 = elapsedRealtime2 - elapsedRealtime;
            if (i2 >= 31) {
            }
            FrostHunterLiveDataBetaLegend3442(str, elapsedRealtime2, j22);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public boolean FrostHunterCoordinatorLayoutDragonHyperionSolar9277() {
        int i = this.FrostHunterCamera2NeoMax8666;
        if (i == 3 || (this.FrostHunterSoundPoolNovaTitanTitan5784 && !this.FrostHunterGyroscopeOmegaEclipseOlympian7225)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            FrostHunterExecutorNeoDragonMax5687();
            return false;
        } catch (FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 e) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public final void FrostHunterCoordinatorLayoutGammaTurboSpark2420(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterFCMDeltaQuantumHero8364;
        this.FrostHunterFCMDeltaQuantumHero8364 = frostHunterSQLiteMasterUltra9956;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public void FrostHunterDatabaseEliteShadowUltra2452(float f, float f2) {
        this.FrostHunterTransitionListenerPulseVortexCosmos7949 = f;
        this.FrostHunterRewardedAdSpectraElite8288 = f2;
        FrostHunterBannerAdNebulaMasterBeta4389(this.FrostHunterPushNotificationStormTitanGamma8999);
    }

    public boolean FrostHunterDrawableCompatHeroMasterSpectra7412() {
        return true;
    }

    public final void FrostHunterExecutorNeoDragonMax5687() {
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterRewardedAdMasterStrike9463;
        frostHunterSQLiteMasterUltra9956.getClass();
        frostHunterSQLiteMasterUltra9956.FrostHunterKeyframeGammaGamma1197();
        FrostHunterCoordinatorLayoutGammaTurboSpark2420(this.FrostHunterRewardedAdMasterStrike9463);
        this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 0;
        this.FrostHunterCamera2NeoMax8666 = 0;
    }

    public final void FrostHunterFCMDeltaQuantumHero8364() {
        try {
            FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
            frostHunterIntentSpeedCyber8582.getClass();
            frostHunterIntentSpeedCyber8582.flush();
        } finally {
            FrostHunterViewModelScopeTitanRogue1970();
        }
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        this.FrostHunterPagingDataTurboTitanium7332 = null;
        FrostHunterCamera2NeoMax8666(FrostHunterLightSensorUltraBlazeNovaX9540.FrostHunterRemoteConfigSpeedSpeed8566);
        this.FrostHunterTranslateAnimationCyberSolarUltra7101.clear();
        if (this.FrostHunterAnimatorSetEliteQuantum4520) {
            this.FrostHunterAnimatorSetEliteQuantum4520 = false;
            FrostHunterTransformNovaBetaNovaX5251();
        } else {
            if (this.FrostHunterRemoteConfigThunderShadow4435 == null) {
                return;
            }
            if (FrostHunterCoordinatorLayoutDragonHyperionSolar9277()) {
                FrostHunterAnimatorSetEliteQuantum4520();
            } else if (FrostHunterDrawableCompatHeroMasterSpectra7412()) {
                FrostHunterFCMDeltaQuantumHero8364();
            } else {
                this.FrostHunterCameraXPrimeTitanGamma7495 = true;
            }
        }
    }

    public boolean FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        return false;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final long FrostHunterFlowMaxDragonHero5809(long j, long j2) {
        return FrostHunterTransitionListenerPulseVortexCosmos7949(j, j2, this.FrostHunterInAppPurchaseLegendEpicDragon4579);
    }

    public boolean FrostHunterGyroscopeOmegaEclipseOlympian7225(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        return true;
    }

    public void FrostHunterInAppPurchaseLegendEpicDragon4579(long j) {
        this.FrostHunterImageAnalysisPixelForceOlympian4333 = j;
        while (true) {
            ArrayDeque arrayDeque = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
            if (arrayDeque.isEmpty() || j < ((FrostHunterLightSensorUltraBlazeNovaX9540) arrayDeque.peek()).FrostHunterAlphaAnimationNeoCosmos5761) {
                return;
            }
            FrostHunterLightSensorUltraBlazeNovaX9540 frostHunterLightSensorUltraBlazeNovaX9540 = (FrostHunterLightSensorUltraBlazeNovaX9540) arrayDeque.poll();
            frostHunterLightSensorUltraBlazeNovaX9540.getClass();
            FrostHunterCamera2NeoMax8666(frostHunterLightSensorUltraBlazeNovaX9540);
            FrostHunterViewPager2StrikePulse8790();
        }
    }

    public boolean FrostHunterItemDecorationPhoenixAlphaVortex8006(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        return false;
    }

    public final void FrostHunterItemDecorationPixelShadow2695(long j) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = (FrostHunterFirebaseOlympianMax4818) this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterServiceEliteCelestialThunder1757.FrostHunterServiceEliteCelestialThunder1757(j);
        if (frostHunterFirebaseOlympianMax4818 == null && this.FrostHunterGradleOmegaVisionSpectra5961 && this.FrostHunterConstraintSetCloneOmegaHyperion9304 != null) {
            frostHunterFirebaseOlympianMax4818 = (FrostHunterFirebaseOlympianMax4818) this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBundlePulseFusionHero2475();
        }
        if (frostHunterFirebaseOlympianMax4818 != null) {
            this.FrostHunterR8MasterNebulaSpark7247 = frostHunterFirebaseOlympianMax4818;
        } else if (!this.FrostHunterAnnotationProcessorSparkEclipse8710 || this.FrostHunterR8MasterNebulaSpark7247 == null) {
            return;
        }
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = this.FrostHunterR8MasterNebulaSpark7247;
        frostHunterFirebaseOlympianMax48182.getClass();
        FrostHunterNestedScrollViewPixelPhantom8605(frostHunterFirebaseOlympianMax48182, this.FrostHunterConstraintSetCloneOmegaHyperion9304);
        this.FrostHunterAnnotationProcessorSparkEclipse8710 = false;
        this.FrostHunterGradleOmegaVisionSpectra5961 = false;
    }

    public abstract void FrostHunterLiveDataBetaLegend3442(String str, long j, long j2);

    public final boolean FrostHunterMagnetometerFusionTitanium8202() {
        if (!this.FrostHunterItemDecorationPhoenixAlphaVortex8006) {
            FrostHunterExecutorNeoDragonMax5687();
            return true;
        }
        this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 1;
        this.FrostHunterCamera2NeoMax8666 = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterMediaPlayerCelestialBetaTitan3868(long j, long j2) {
        FrostHunterFontFamilyHyperPulseBlaze7157 frostHunterFontFamilyHyperPulseBlaze7157;
        FrostHunterFontFamilyHyperPulseBlaze7157 frostHunterFontFamilyHyperPulseBlaze71572;
        int i;
        ByteBuffer byteBuffer;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!this.FrostHunterObjectAnimatorPhoenixSpectraThunder6218);
        FrostHunterFontFamilyHyperPulseBlaze7157 frostHunterFontFamilyHyperPulseBlaze71573 = this.FrostHunterBillingClientFusionVortex9008;
        if (frostHunterFontFamilyHyperPulseBlaze71573.FrostHunterKeyframeGammaGamma1197()) {
            ByteBuffer byteBuffer2 = frostHunterFontFamilyHyperPulseBlaze71573.FrostHunterFragmentBetaMegaVortex6025;
            int i2 = this.FrostHunterAlphaAnimationNovaGamma6326;
            int i3 = frostHunterFontFamilyHyperPulseBlaze71573.FrostHunterCameraXTurboCelestialHero5430;
            long j3 = frostHunterFontFamilyHyperPulseBlaze71573.FrostHunterLightSensorForceFusion4241;
            boolean FrostHunterAnnotationProcessorSparkEclipse8710 = FrostHunterAnnotationProcessorSparkEclipse8710(this.FrostHunterResourcesTitanHyperVision5823, frostHunterFontFamilyHyperPulseBlaze71573.FrostHunterLintTitanVortexQuantum9911);
            boolean FrostHunterServiceEliteCelestialThunder1757 = frostHunterFontFamilyHyperPulseBlaze71573.FrostHunterServiceEliteCelestialThunder1757(4);
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterR8MasterNebulaSpark7247;
            frostHunterFirebaseOlympianMax4818.getClass();
            frostHunterFontFamilyHyperPulseBlaze7157 = frostHunterFontFamilyHyperPulseBlaze71573;
            if (!FrostHunterNavigationViewMasterVortexBeta1295(j, j2, null, byteBuffer2, i2, 0, i3, j3, FrostHunterAnnotationProcessorSparkEclipse8710, FrostHunterServiceEliteCelestialThunder1757, frostHunterFirebaseOlympianMax4818)) {
                return false;
            }
            FrostHunterInAppPurchaseLegendEpicDragon4579(frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterLintTitanVortexQuantum9911);
            frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterLifecycleBlazeGammaElite2889();
        } else {
            frostHunterFontFamilyHyperPulseBlaze7157 = frostHunterFontFamilyHyperPulseBlaze71573;
        }
        if (this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402) {
            this.FrostHunterObjectAnimatorPhoenixSpectraThunder6218 = true;
            return false;
        }
        boolean z = this.FrostHunterAnnotationProcessorSolarSpeedNebula4443;
        FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007 = this.FrostHunterMeteringPointMegaCyber7955;
        if (z) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterAlertDialogAuroraDelta3200(frostHunterAsyncTaskPrimeGammaTitan9007));
            this.FrostHunterAnnotationProcessorSolarSpeedNebula4443 = false;
        }
        if (this.FrostHunterTransformNovaBetaNovaX5251) {
            if (frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterKeyframeGammaGamma1197()) {
                return true;
            }
            this.FrostHunterAnimatorSetEliteQuantum4520 = false;
            FrostHunterTransformNovaBetaNovaX5251();
            this.FrostHunterTransformNovaBetaNovaX5251 = false;
            FrostHunterPreviewBlazeAurora1020();
            if (!this.FrostHunterAnimatorSetEliteQuantum4520) {
                return false;
            }
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402);
        FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = this.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterIntentForceSpeed4935.FrostHunterKeyframeGammaGamma1197();
        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
        do {
            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
            int FrostHunterLooperHyperionForce4133 = FrostHunterLooperHyperionForce4133(frostHunterIntentForceSpeed4935, frostHunterAsyncTaskPrimeGammaTitan9007, 0);
            if (FrostHunterLooperHyperionForce4133 == -5) {
                FrostHunterColorStateListMegaBetaFusion7423(frostHunterIntentForceSpeed4935);
                break;
            }
            if (FrostHunterLooperHyperionForce4133 != -4) {
                if (FrostHunterLooperHyperionForce4133 != -3) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                    return false;
                }
                if (FrostHunterFragmentBetaMegaVortex6025()) {
                    FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                }
            } else {
                if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(4)) {
                    this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402 = true;
                    FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                    break;
                }
                this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 = Math.max(this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277, frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241);
                if (FrostHunterFragmentBetaMegaVortex6025() || this.FrostHunterViewPhantomNeo1634.FrostHunterServiceEliteCelestialThunder1757(536870912)) {
                    FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                }
                byte[] bArr = null;
                if (this.FrostHunterBannerAdNebulaMasterBeta4389) {
                    FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = this.FrostHunterPagingDataTurboTitanium7332;
                    frostHunterFirebaseOlympianMax48182.getClass();
                    this.FrostHunterR8MasterNebulaSpark7247 = frostHunterFirebaseOlympianMax48182;
                    if (Objects.equals(frostHunterFirebaseOlympianMax48182.FrostHunterScaleAnimationStrikeSpark5059, "audio/opus") && !this.FrostHunterR8MasterNebulaSpark7247.FrostHunterCameraXTurboCelestialHero5430.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.FrostHunterR8MasterNebulaSpark7247.FrostHunterCameraXTurboCelestialHero5430.get(0);
                        int i4 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterR8MasterNebulaSpark7247.FrostHunterAlphaAnimationNeoCosmos5761();
                        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterTranslateAnimationCyberSolarUltra7101 = i4;
                        this.FrostHunterR8MasterNebulaSpark7247 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
                    }
                    FrostHunterNestedScrollViewPixelPhantom8605(this.FrostHunterR8MasterNebulaSpark7247, null);
                    this.FrostHunterBannerAdNebulaMasterBeta4389 = false;
                }
                frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterCameraXPixelTurboCosmos9814();
                FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48183 = this.FrostHunterR8MasterNebulaSpark7247;
                if (frostHunterFirebaseOlympianMax48183 != null && Objects.equals(frostHunterFirebaseOlympianMax48183.FrostHunterScaleAnimationStrikeSpark5059, "audio/opus")) {
                    if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(268435456)) {
                        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterR8MasterNebulaSpark7247;
                        FrostHunterPushNotificationStormTitanGamma8999(frostHunterAsyncTaskPrimeGammaTitan9007);
                    }
                    if (this.FrostHunterResourcesTitanHyperVision5823 - frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241 <= 80000) {
                        List list = this.FrostHunterR8MasterNebulaSpark7247.FrostHunterCameraXTurboCelestialHero5430;
                        FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo1196 = this.FrostHunterStateCelestialNovaPixel8414;
                        frostHunterGradlePulseOlympianTurbo1196.getClass();
                        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025.getClass();
                        if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025.limit() - frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025.position() != 0) {
                            if (frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814 == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = (byte[]) list.get(0);
                            }
                            ByteBuffer byteBuffer3 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
                            int position = byteBuffer3.position();
                            int limit = byteBuffer3.limit();
                            int i5 = limit - position;
                            int i6 = (i5 + 255) / 255;
                            int i7 = i6 + 27 + i5;
                            if (frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814 == 2) {
                                i = bArr != null ? bArr.length + 28 : 47;
                                i7 = i + 44 + i7;
                            } else {
                                i = 0;
                            }
                            if (((ByteBuffer) frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200).capacity() < i7) {
                                frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200 = ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                ((ByteBuffer) frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200).clear();
                            }
                            ByteBuffer byteBuffer4 = (ByteBuffer) frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200;
                            if (frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814 == 2) {
                                if (bArr != null) {
                                    FrostHunterGradlePulseOlympianTurbo1196.FrostHunterBitmapTurboDeltaNebula8743(byteBuffer4, 0L, 0, 1, true);
                                    byteBuffer = byteBuffer4;
                                    frostHunterFontFamilyHyperPulseBlaze71572 = frostHunterFontFamilyHyperPulseBlaze7157;
                                    byteBuffer.put(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlphaAnimationNeoCosmos5761(bArr.length));
                                    byteBuffer.put(bArr);
                                    byteBuffer.putInt(22, FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlertDialogAuroraDelta3200(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
                                    byteBuffer.position(bArr.length + 28);
                                } else {
                                    frostHunterFontFamilyHyperPulseBlaze71572 = frostHunterFontFamilyHyperPulseBlaze7157;
                                    byteBuffer = byteBuffer4;
                                    byteBuffer.put(FrostHunterGradlePulseOlympianTurbo1196.FrostHunterKeyframeGammaGamma1197);
                                }
                                byteBuffer.put(FrostHunterGradlePulseOlympianTurbo1196.FrostHunterFragmentBetaMegaVortex6025);
                            } else {
                                frostHunterFontFamilyHyperPulseBlaze71572 = frostHunterFontFamilyHyperPulseBlaze7157;
                                byteBuffer = byteBuffer4;
                            }
                            int FrostHunterR8MasterNebulaSpark7247 = frostHunterGradlePulseOlympianTurbo1196.FrostHunterFlowMaxDragonHero5809 + ((int) ((FrostHunterCanvasInfernoVortex4700.FrostHunterR8MasterNebulaSpark7247(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                            frostHunterGradlePulseOlympianTurbo1196.FrostHunterFlowMaxDragonHero5809 = FrostHunterR8MasterNebulaSpark7247;
                            FrostHunterGradlePulseOlympianTurbo1196.FrostHunterBitmapTurboDeltaNebula8743(byteBuffer, FrostHunterR8MasterNebulaSpark7247, frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814, i6, false);
                            for (int i8 = 0; i8 < i6; i8++) {
                                if (i5 >= 255) {
                                    byteBuffer.put((byte) -1);
                                    i5 -= 255;
                                } else {
                                    byteBuffer.put((byte) i5);
                                    i5 = 0;
                                }
                            }
                            while (position < limit) {
                                byteBuffer.put(byteBuffer3.get(position));
                                position++;
                            }
                            byteBuffer3.position(byteBuffer3.limit());
                            byteBuffer.flip();
                            if (frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814 == 2) {
                                byteBuffer.putInt(i + 66, FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlertDialogAuroraDelta3200(byteBuffer.arrayOffset() + i + 44, byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            } else {
                                byteBuffer.putInt(22, FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlertDialogAuroraDelta3200(byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0, byteBuffer.array()));
                            }
                            frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814++;
                            frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200 = byteBuffer;
                            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterRemoteConfigSpeedSpeed8566(((ByteBuffer) frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200).remaining());
                            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025.put((ByteBuffer) frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200);
                            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterCameraXPixelTurboCosmos9814();
                            if (!frostHunterFontFamilyHyperPulseBlaze71572.FrostHunterKeyframeGammaGamma1197()) {
                                long j4 = this.FrostHunterResourcesTitanHyperVision5823;
                                frostHunterFontFamilyHyperPulseBlaze7157 = frostHunterFontFamilyHyperPulseBlaze71572;
                                if (FrostHunterAnnotationProcessorSparkEclipse8710(j4, frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterLintTitanVortexQuantum9911) != FrostHunterAnnotationProcessorSparkEclipse8710(j4, frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241)) {
                                    break;
                                }
                            } else {
                                frostHunterFontFamilyHyperPulseBlaze7157 = frostHunterFontFamilyHyperPulseBlaze71572;
                            }
                        }
                    }
                }
                frostHunterFontFamilyHyperPulseBlaze71572 = frostHunterFontFamilyHyperPulseBlaze7157;
                if (!frostHunterFontFamilyHyperPulseBlaze71572.FrostHunterKeyframeGammaGamma1197()) {
                }
            }
        } while (frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterAlertDialogAuroraDelta3200(frostHunterAsyncTaskPrimeGammaTitan9007));
        this.FrostHunterAnnotationProcessorSolarSpeedNebula4443 = true;
        if (frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterKeyframeGammaGamma1197()) {
            frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterCameraXPixelTurboCosmos9814();
        }
        return frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterKeyframeGammaGamma1197() || this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402 || this.FrostHunterTransformNovaBetaNovaX5251;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[LOOP:1: B:33:0x0053->B:42:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EDGE_INSN: B:43:0x0079->B:44:? BREAK  A[LOOP:1: B:33:0x0053->B:42:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[LOOP:2: B:45:0x0079->B:54:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[EDGE_INSN: B:55:0x009a->B:56:0x009a BREAK  A[LOOP:2: B:45:0x0079->B:54:0x0099], SYNTHETIC] */
    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterMeteringPointBetaCyber9571(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.FrostHunterExecutorNeoDragonMax5687) {
            this.FrostHunterExecutorNeoDragonMax5687 = false;
            FrostHunterAlphaAnimationNovaGamma6326();
        }
        FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 = this.FrostHunterItemDecorationPixelShadow2695;
        if (frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 != null) {
            this.FrostHunterItemDecorationPixelShadow2695 = null;
            throw frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868;
        }
        try {
            if (this.FrostHunterObjectAnimatorPhoenixSpectraThunder6218) {
                FrostHunterAnnotationProcessorSolarSpeedNebula4443();
                return;
            }
            if (this.FrostHunterPagingDataTurboTitanium7332 != null || FrostHunterSharedElementPixelTitan2806(2)) {
                FrostHunterPreviewBlazeAurora1020();
                if (this.FrostHunterAnimatorSetEliteQuantum4520) {
                    Trace.beginSection("bypassRender");
                    while (FrostHunterMediaPlayerCelestialBetaTitan3868(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.FrostHunterRemoteConfigThunderShadow4435 != null) {
                    this.FrostHunterLightSensorForceFusion4241.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (FrostHunterPagingDataTurboTitanium7332(j, j2)) {
                        long j3 = this.FrostHunterNavigationMasterMegaMax2752;
                        if (j3 != -9223372036854775807L) {
                            this.FrostHunterLightSensorForceFusion4241.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j3) {
                                z2 = false;
                                if (z2) {
                                    break;
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    while (FrostHunterR8MasterNebulaSpark7247()) {
                        long j4 = this.FrostHunterNavigationMasterMegaMax2752;
                        if (j4 != -9223372036854775807L) {
                            this.FrostHunterLightSensorForceFusion4241.getClass();
                            if (SystemClock.elapsedRealtime() - elapsedRealtime >= j4) {
                                z = false;
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    }
                    Trace.endSection();
                } else {
                    FrostHunterWindowManagerMasterOmegaGamma7106 frostHunterWindowManagerMasterOmegaGamma7106 = this.FrostHunterFlipAnimationPrimeOlympian7620;
                    int i = frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterServiceEliteCelestialThunder1757;
                    FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    frostHunterOnItemLongClickListenerNovaXTitan1242.getClass();
                    frostHunterWindowManagerMasterOmegaGamma7106.FrostHunterServiceEliteCelestialThunder1757 = i + frostHunterOnItemLongClickListenerNovaXTitan1242.FrostHunterRemoteConfigSpeedSpeed8566(j - this.FrostHunterCameraXTurboCelestialHero5430);
                    FrostHunterSharedElementPixelTitan2806(1);
                }
                synchronized (this.FrostHunterFlipAnimationPrimeOlympian7620) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw FrostHunterRemoteConfigSpeedSpeed8566(e, this.FrostHunterPagingDataTurboTitanium7332, false, FrostHunterGyroscopeHeroAlpha1995.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            FrostHunterColorDrawableLegendPhoenixVision7927(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                FrostHunterAnimatorSetEliteQuantum4520();
            }
            FrostHunterLevelListDrawableNeoTitan3480 FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414(e2, this.FrostHunterColorDrawableLegendPhoenixVision7927);
            throw FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterStateCelestialNovaPixel8414, this.FrostHunterPagingDataTurboTitanium7332, z3, FrostHunterStateCelestialNovaPixel8414.FrostHunterCameraXPixelTurboCosmos9814 == 1101 ? 4006 : 4003);
        }
    }

    public abstract ArrayList FrostHunterNavigationMasterMegaMax2752(FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, boolean z);

    public abstract boolean FrostHunterNavigationViewMasterVortexBeta1295(long j, long j2, FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818);

    public abstract void FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, MediaFormat mediaFormat);

    public abstract void FrostHunterNestedScrollViewThunderNovaX6772(String str);

    public abstract int FrostHunterObjectAnimatorPhoenixSpectraThunder6218(FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818);

    public final boolean FrostHunterPagingDataTurboTitanium7332(long j, long j2) {
        int valueTypeForKey;
        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
        frostHunterIntentSpeedCyber8582.getClass();
        int i = this.FrostHunterAlphaAnimationNovaGamma6326;
        MediaCodec.BufferInfo bufferInfo = this.FrostHunterMediaPlayerCelestialBetaTitan3868;
        if (i < 0) {
            int FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterIntentSpeedCyber8582.FrostHunterRemoteConfigSpeedSpeed8566(bufferInfo);
            if (FrostHunterRemoteConfigSpeedSpeed8566 < 0) {
                if (FrostHunterRemoteConfigSpeedSpeed8566 != -2) {
                    if (this.FrostHunterNestedScrollViewPixelPhantom8605 && (this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402 || this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 == 2)) {
                        FrostHunterAlphaAnimationNovaGamma6326();
                    }
                    long j3 = this.FrostHunterImageAnalysisGammaOlympian2400;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.FrostHunterLightSensorForceFusion4241.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            FrostHunterAlphaAnimationNovaGamma6326();
                            return false;
                        }
                    }
                    return false;
                }
                this.FrostHunterGyroscopeOmegaEclipseOlympian7225 = true;
                FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber85822 = this.FrostHunterRemoteConfigThunderShadow4435;
                frostHunterIntentSpeedCyber85822.getClass();
                MediaFormat FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterIntentSpeedCyber85822.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                if (this.FrostHunterLiveDataBetaLegend3442 != 0 && FrostHunterServiceConnectionTurboPhoenixOmega6719.getInteger("width") == 32 && FrostHunterServiceConnectionTurboPhoenixOmega6719.getInteger("height") == 32) {
                    this.FrostHunterColorStateListMegaBetaFusion7423 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.FrostHunterShapeDrawableSolarOlympian7689.isEmpty()) {
                    FrostHunterDialogVortexMega8716<String> frostHunterDialogVortexMega8716 = this.FrostHunterShapeDrawableSolarOlympian7689;
                    FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta2867 = FrostHunterSoundPoolNeoEclipseDelta2867.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    HashMap hashMap = new HashMap();
                    for (String str : frostHunterDialogVortexMega8716) {
                        if (FrostHunterServiceConnectionTurboPhoenixOmega6719.containsKey(str)) {
                            valueTypeForKey = FrostHunterServiceConnectionTurboPhoenixOmega6719.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                hashMap.put(str, Integer.valueOf(FrostHunterServiceConnectionTurboPhoenixOmega6719.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                hashMap.put(str, Long.valueOf(FrostHunterServiceConnectionTurboPhoenixOmega6719.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                hashMap.put(str, Float.valueOf(FrostHunterServiceConnectionTurboPhoenixOmega6719.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                hashMap.put(str, FrostHunterServiceConnectionTurboPhoenixOmega6719.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = FrostHunterServiceConnectionTurboPhoenixOmega6719.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    hashMap.put(str, null);
                                } else {
                                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    allocate.put(byteBuffer.duplicate());
                                    allocate.flip();
                                    hashMap.put(str, allocate);
                                }
                            }
                        }
                    }
                    FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta28672 = new FrostHunterSoundPoolNeoEclipseDelta2867(hashMap);
                    if (!frostHunterSoundPoolNeoEclipseDelta28672.equals(this.FrostHunterObjectDetectionDeltaHyperEpic7162)) {
                        this.FrostHunterObjectDetectionDeltaHyperEpic7162 = frostHunterSoundPoolNeoEclipseDelta28672;
                        FrostHunterSoundPoolNovaTitanTitan5784(frostHunterSoundPoolNeoEclipseDelta28672);
                    }
                }
                this.FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterServiceConnectionTurboPhoenixOmega6719;
                this.FrostHunterAnnotationProcessorSparkEclipse8710 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.FrostHunterLayoutLegendDelta7410;
            if (this.FrostHunterColorStateListMegaBetaFusion7423) {
                this.FrostHunterColorStateListMegaBetaFusion7423 = false;
                frostHunterIntentSpeedCyber8582.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                FrostHunterAlphaAnimationNovaGamma6326();
                return false;
            }
            this.FrostHunterAlphaAnimationNovaGamma6326 = FrostHunterRemoteConfigSpeedSpeed8566;
            ByteBuffer FrostHunterCameraXTurboCelestialHero5430 = frostHunterIntentSpeedCyber8582.FrostHunterCameraXTurboCelestialHero5430(FrostHunterRemoteConfigSpeedSpeed8566);
            this.FrostHunterNavigationViewMasterVortexBeta1295 = FrostHunterCameraXTurboCelestialHero5430;
            if (FrostHunterCameraXTurboCelestialHero5430 != null) {
                FrostHunterCameraXTurboCelestialHero5430.position(bufferInfo.offset);
                this.FrostHunterNavigationViewMasterVortexBeta1295.limit(bufferInfo.offset + bufferInfo.size);
            }
            FrostHunterItemDecorationPixelShadow2695(bufferInfo.presentationTimeUs);
        }
        boolean z = this.FrostHunterCameraXPrimeTitanGamma7495 || bufferInfo.presentationTimeUs < this.FrostHunterResourcesTitanHyperVision5823;
        long j5 = this.FrostHunterRecyclerViewBetaNovaX7224.FrostHunterLevelListDrawableFusionDragonHero2232;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.FrostHunterSharedElementPixelTitan2806 = z2;
        ByteBuffer byteBuffer2 = this.FrostHunterNavigationViewMasterVortexBeta1295;
        int i2 = this.FrostHunterAlphaAnimationNovaGamma6326;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterR8MasterNebulaSpark7247;
        frostHunterFirebaseOlympianMax4818.getClass();
        if (!FrostHunterNavigationViewMasterVortexBeta1295(j, j2, frostHunterIntentSpeedCyber8582, byteBuffer2, i2, i3, 1, j6, z, z2, frostHunterFirebaseOlympianMax4818)) {
            return false;
        }
        FrostHunterInAppPurchaseLegendEpicDragon4579(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.FrostHunterDrawableCompatHeroMasterSpectra7412 && this.FrostHunterSharedElementPixelTitan2806) {
            this.FrostHunterLightSensorForceFusion4241.getClass();
            this.FrostHunterImageAnalysisGammaOlympian2400 = System.currentTimeMillis();
        }
        this.FrostHunterAlphaAnimationNovaGamma6326 = -1;
        this.FrostHunterNavigationViewMasterVortexBeta1295 = null;
        if (!z3) {
            return true;
        }
        FrostHunterAlphaAnimationNovaGamma6326();
        return false;
    }

    public abstract float FrostHunterPagingSourceEclipseDelta8255(float f, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr);

    public int FrostHunterPermissionInfoAlphaDelta6279(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r2.FrostHunterServiceConnectionTurboPhoenixOmega6719() != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterPreviewBlazeAurora1020() {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818;
        if (this.FrostHunterRemoteConfigThunderShadow4435 != null || this.FrostHunterAnimatorSetEliteQuantum4520 || (frostHunterFirebaseOlympianMax4818 = this.FrostHunterPagingDataTurboTitanium7332) == null) {
            return;
        }
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        if (this.FrostHunterRewardedAdMasterStrike9463 == null && FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402(frostHunterFirebaseOlympianMax4818)) {
            this.FrostHunterAnimatorSetEliteQuantum4520 = false;
            FrostHunterTransformNovaBetaNovaX5251();
            boolean equals = "audio/mp4a-latm".equals(str);
            FrostHunterFontFamilyHyperPulseBlaze7157 frostHunterFontFamilyHyperPulseBlaze7157 = this.FrostHunterBillingClientFusionVortex9008;
            if (equals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                frostHunterFontFamilyHyperPulseBlaze7157.getClass();
                frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterResourcesTitanHyperVision5823 = 32;
            } else {
                frostHunterFontFamilyHyperPulseBlaze7157.getClass();
                frostHunterFontFamilyHyperPulseBlaze7157.FrostHunterResourcesTitanHyperVision5823 = 1;
            }
            this.FrostHunterAnimatorSetEliteQuantum4520 = true;
            return;
        }
        FrostHunterCoordinatorLayoutGammaTurboSpark2420(this.FrostHunterRewardedAdMasterStrike9463);
        if (this.FrostHunterFCMDeltaQuantumHero8364 != null) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterPagingSourceEclipseDelta8255 == null);
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterFCMDeltaQuantumHero8364;
            frostHunterSQLiteMasterUltra9956.getClass();
            boolean z = FrostHunterRotateDrawableDragonTitanium2198.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        try {
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterFCMDeltaQuantumHero8364;
            if (frostHunterSQLiteMasterUltra99562 != null) {
                if (frostHunterSQLiteMasterUltra99562.FrostHunterResourcesTitanHyperVision5823() != 3) {
                    if (this.FrostHunterFCMDeltaQuantumHero8364.FrostHunterResourcesTitanHyperVision5823() == 4) {
                    }
                }
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99563 = this.FrostHunterFCMDeltaQuantumHero8364;
                str.getClass();
                frostHunterSQLiteMasterUltra99563.getClass();
            }
            FrostHunterRunnableCosmosCelestial4235(this.FrostHunterPagingSourceEclipseDelta8255, false);
            MediaCrypto mediaCrypto = this.FrostHunterPagingSourceEclipseDelta8255;
            if (mediaCrypto == null || this.FrostHunterRemoteConfigThunderShadow4435 != null) {
                return;
            }
            mediaCrypto.release();
            this.FrostHunterPagingSourceEclipseDelta8255 = null;
        } catch (FrostHunterPagingSourceOlympianMega1078 e) {
            throw FrostHunterRemoteConfigSpeedSpeed8566(e, frostHunterFirebaseOlympianMax4818, false, 4001);
        }
    }

    public abstract void FrostHunterPushNotificationStormTitanGamma8999(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007);

    public final boolean FrostHunterR8MasterNebulaSpark7247() {
        FrostHunterIntentSpeedCyber8582 frostHunterIntentSpeedCyber8582 = this.FrostHunterRemoteConfigThunderShadow4435;
        if (frostHunterIntentSpeedCyber8582 != null && this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 != 2 && !this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402) {
            int i = this.FrostHunterPlaceholderLegendForceNebula9869;
            FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007 = this.FrostHunterViewPhantomNeo1634;
            if (i < 0) {
                int FrostHunterMotionSceneAuroraMega2271 = frostHunterIntentSpeedCyber8582.FrostHunterMotionSceneAuroraMega2271();
                this.FrostHunterPlaceholderLegendForceNebula9869 = FrostHunterMotionSceneAuroraMega2271;
                if (FrostHunterMotionSceneAuroraMega2271 >= 0) {
                    frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025 = frostHunterIntentSpeedCyber8582.FrostHunterScaleAnimationStrikeSpark5059(FrostHunterMotionSceneAuroraMega2271);
                    frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                }
            }
            if (this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 == 1) {
                if (!this.FrostHunterNestedScrollViewPixelPhantom8605) {
                    this.FrostHunterDrawableCompatHeroMasterSpectra7412 = true;
                    frostHunterIntentSpeedCyber8582.FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterPlaceholderLegendForceNebula9869, 0, 0L, 4);
                    this.FrostHunterPlaceholderLegendForceNebula9869 = -1;
                    frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025 = null;
                }
                this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 2;
                return false;
            }
            if (this.FrostHunterNestedScrollViewThunderNovaX6772) {
                this.FrostHunterNestedScrollViewThunderNovaX6772 = false;
                ByteBuffer byteBuffer = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
                byteBuffer.getClass();
                byteBuffer.put(FrostHunterScaleAnimationHeroStormNeo5898);
                frostHunterIntentSpeedCyber8582.FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterPlaceholderLegendForceNebula9869, 38, 0L, 0);
                this.FrostHunterPlaceholderLegendForceNebula9869 = -1;
                frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025 = null;
                this.FrostHunterItemDecorationPhoenixAlphaVortex8006 = true;
                return true;
            }
            if (this.FrostHunterBindingAdapterInfernoFusionForce2284 == 1) {
                int i2 = 0;
                while (true) {
                    FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterPushNotificationStormTitanGamma8999;
                    frostHunterFirebaseOlympianMax4818.getClass();
                    if (i2 >= frostHunterFirebaseOlympianMax4818.FrostHunterCameraXTurboCelestialHero5430.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.FrostHunterPushNotificationStormTitanGamma8999.FrostHunterCameraXTurboCelestialHero5430.get(i2);
                    ByteBuffer byteBuffer2 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i2++;
                }
                this.FrostHunterBindingAdapterInfernoFusionForce2284 = 2;
            }
            ByteBuffer byteBuffer3 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = this.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterIntentForceSpeed4935.FrostHunterKeyframeGammaGamma1197();
            try {
                frostHunterIntentSpeedCyber8582.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterDialogQuantumTurbo8340(22, this, frostHunterIntentForceSpeed4935));
                int i3 = this.FrostHunterMagnetometerFusionTitanium8202.get();
                if (i3 == -3) {
                    if (FrostHunterFragmentBetaMegaVortex6025()) {
                        FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                        return false;
                    }
                } else {
                    if (i3 == -5) {
                        if (this.FrostHunterBindingAdapterInfernoFusionForce2284 == 2) {
                            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                            this.FrostHunterBindingAdapterInfernoFusionForce2284 = 1;
                        }
                        FrostHunterColorStateListMegaBetaFusion7423(frostHunterIntentForceSpeed4935);
                        return true;
                    }
                    if (!frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(4)) {
                        if (this.FrostHunterItemDecorationPhoenixAlphaVortex8006 || frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(1)) {
                            long j = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLightSensorForceFusion4241;
                            if (!FrostHunterItemDecorationPhoenixAlphaVortex8006(frostHunterAsyncTaskPrimeGammaTitan9007)) {
                                boolean FrostHunterServiceEliteCelestialThunder1757 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(1073741824);
                                if (FrostHunterServiceEliteCelestialThunder1757) {
                                    FrostHunterObjectDetectionDeltaQuantumHyperion3304 frostHunterObjectDetectionDeltaQuantumHyperion3304 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterKeyframeGammaGamma1197;
                                    if (position == 0) {
                                        frostHunterObjectDetectionDeltaQuantumHyperion3304.getClass();
                                    } else {
                                        if (frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterServiceEliteCelestialThunder1757 == null) {
                                            int[] iArr = new int[1];
                                            frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterServiceEliteCelestialThunder1757 = iArr;
                                            frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterFlowMaxDragonHero5809.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterServiceEliteCelestialThunder1757;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.FrostHunterBannerAdNebulaMasterBeta4389) {
                                    FrostHunterLightSensorUltraBlazeNovaX9540 FrostHunterRewardedAdSpectraElite8288 = FrostHunterRewardedAdSpectraElite8288();
                                    FrostHunterInstrumentationThunderEpicPixel7003 frostHunterInstrumentationThunderEpicPixel7003 = FrostHunterRewardedAdSpectraElite8288.FrostHunterServiceEliteCelestialThunder1757;
                                    FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182 = this.FrostHunterPagingDataTurboTitanium7332;
                                    frostHunterFirebaseOlympianMax48182.getClass();
                                    frostHunterInstrumentationThunderEpicPixel7003.FrostHunterAlphaAnimationNeoCosmos5761(j, frostHunterFirebaseOlympianMax48182);
                                    FrostHunterRewardedAdSpectraElite8288.FrostHunterLifecycleBlazeGammaElite2889 = true;
                                    this.FrostHunterBannerAdNebulaMasterBeta4389 = false;
                                }
                                this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 = Math.max(this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277, j);
                                if (FrostHunterFragmentBetaMegaVortex6025() || frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(536870912)) {
                                    FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                                }
                                frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterCameraXPixelTurboCosmos9814();
                                if (frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(268435456)) {
                                    FrostHunterPushNotificationStormTitanGamma8999(frostHunterAsyncTaskPrimeGammaTitan9007);
                                }
                                if (this.FrostHunterCameraXPrimeTitanGamma7495) {
                                    long j2 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                                    if (j <= j2) {
                                        this.FrostHunterLayoutLegendDelta7410 = (j2 - j) + 1 + this.FrostHunterLayoutLegendDelta7410;
                                    }
                                    this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 = j;
                                    this.FrostHunterCameraXPrimeTitanGamma7495 = false;
                                }
                                FrostHunterPlaceholderLegendForceNebula9869(frostHunterAsyncTaskPrimeGammaTitan9007);
                                int FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterPermissionInfoAlphaDelta6279(frostHunterAsyncTaskPrimeGammaTitan9007);
                                long j3 = j + this.FrostHunterLayoutLegendDelta7410;
                                int i4 = this.FrostHunterPlaceholderLegendForceNebula9869;
                                if (FrostHunterServiceEliteCelestialThunder1757) {
                                    frostHunterIntentSpeedCyber8582.FrostHunterLifecycleBlazeGammaElite2889(i4, frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterKeyframeGammaGamma1197, j3, FrostHunterPermissionInfoAlphaDelta6279);
                                } else {
                                    ByteBuffer byteBuffer4 = frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025;
                                    byteBuffer4.getClass();
                                    frostHunterIntentSpeedCyber8582.FrostHunterLevelListDrawableFusionDragonHero2232(i4, byteBuffer4.limit(), j3, FrostHunterPermissionInfoAlphaDelta6279);
                                }
                                this.FrostHunterPlaceholderLegendForceNebula9869 = -1;
                                frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025 = null;
                                this.FrostHunterItemDecorationPhoenixAlphaVortex8006 = true;
                                this.FrostHunterBindingAdapterInfernoFusionForce2284 = 0;
                                this.FrostHunterFlipAnimationPrimeOlympian7620.FrostHunterBundlePulseFusionHero2475++;
                                return true;
                            }
                        } else {
                            frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                            if (this.FrostHunterBindingAdapterInfernoFusionForce2284 == 2) {
                                this.FrostHunterBindingAdapterInfernoFusionForce2284 = 1;
                                return true;
                            }
                        }
                        return true;
                    }
                    FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277;
                    if (this.FrostHunterBindingAdapterInfernoFusionForce2284 == 2) {
                        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
                        this.FrostHunterBindingAdapterInfernoFusionForce2284 = 1;
                    }
                    this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402 = true;
                    if (!this.FrostHunterItemDecorationPhoenixAlphaVortex8006) {
                        FrostHunterAlphaAnimationNovaGamma6326();
                        return false;
                    }
                    if (!this.FrostHunterNestedScrollViewPixelPhantom8605) {
                        this.FrostHunterDrawableCompatHeroMasterSpectra7412 = true;
                        frostHunterIntentSpeedCyber8582.FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterPlaceholderLegendForceNebula9869, 0, 0L, 4);
                        this.FrostHunterPlaceholderLegendForceNebula9869 = -1;
                        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterFragmentBetaMegaVortex6025 = null;
                        return false;
                    }
                }
            } catch (FrostHunterImageViewTitaniumTitanium1518 e) {
                FrostHunterColorDrawableLegendPhoenixVision7927(e);
                FrostHunterSharedElementPixelTitan2806(0);
                FrostHunterFCMDeltaQuantumHero8364();
                return true;
            }
        }
        return false;
    }

    public abstract FrostHunterCoroutineScopeSpeedSparkAlpha3670 FrostHunterRemoteConfigThunderShadow4435(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, MediaCrypto mediaCrypto, float f);

    public final List FrostHunterRewardedAdMasterStrike9463(boolean z) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterPagingDataTurboTitanium7332;
        frostHunterFirebaseOlympianMax4818.getClass();
        FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013 = this.FrostHunterEditTextPulseHyperion1262;
        ArrayList FrostHunterNavigationMasterMegaMax2752 = FrostHunterNavigationMasterMegaMax2752(frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, z);
        if (!FrostHunterNavigationMasterMegaMax2752.isEmpty() || !z) {
            return FrostHunterNavigationMasterMegaMax2752;
        }
        ArrayList FrostHunterNavigationMasterMegaMax27522 = FrostHunterNavigationMasterMegaMax2752(frostHunterFlowHyperionVortexDelta5013, frostHunterFirebaseOlympianMax4818, false);
        if (!FrostHunterNavigationMasterMegaMax27522.isEmpty()) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Drm session requires secure decoder for " + frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059 + ", but no secure decoder available. Trying to proceed with " + FrostHunterNavigationMasterMegaMax27522 + ".");
        }
        return FrostHunterNavigationMasterMegaMax27522;
    }

    public final FrostHunterLightSensorUltraBlazeNovaX9540 FrostHunterRewardedAdSpectraElite8288() {
        ArrayDeque arrayDeque = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
        return !arrayDeque.isEmpty() ? (FrostHunterLightSensorUltraBlazeNovaX9540) arrayDeque.getLast() : this.FrostHunterRecyclerViewBetaNovaX7224;
    }

    public final void FrostHunterRunnableCosmosCelestial4235(MediaCrypto mediaCrypto, boolean z) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterPagingDataTurboTitanium7332;
        frostHunterFirebaseOlympianMax4818.getClass();
        if (this.FrostHunterRunnableCosmosCelestial4235 == null) {
            try {
                List FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463(z);
                this.FrostHunterRunnableCosmosCelestial4235 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) FrostHunterRewardedAdMasterStrike9463;
                if (!arrayList.isEmpty()) {
                    this.FrostHunterRunnableCosmosCelestial4235.add((FrostHunterStorageNovaXEliteAurora3066) arrayList.get(0));
                }
                this.FrostHunterColorStateListInflaterNovaQuantum4229 = null;
            } catch (FrostHunterStateTitaniumHyperTitanium4233 e) {
                throw new FrostHunterPagingSourceOlympianMega1078(frostHunterFirebaseOlympianMax4818, e, z, -49998);
            }
        }
        if (this.FrostHunterRunnableCosmosCelestial4235.isEmpty()) {
            throw new FrostHunterPagingSourceOlympianMega1078(frostHunterFirebaseOlympianMax4818, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.FrostHunterRunnableCosmosCelestial4235;
        arrayDeque.getClass();
        while (this.FrostHunterRemoteConfigThunderShadow4435 == null) {
            FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066 = (FrostHunterStorageNovaXEliteAurora3066) arrayDeque.peekFirst();
            frostHunterStorageNovaXEliteAurora3066.getClass();
            if (!FrostHunterColorStateListInflaterNovaQuantum4229(frostHunterFirebaseOlympianMax4818) || !FrostHunterGyroscopeOmegaEclipseOlympian7225(frostHunterStorageNovaXEliteAurora3066)) {
                return;
            }
            try {
                FrostHunterConstraintSetCloneOmegaHyperion9304(frostHunterStorageNovaXEliteAurora3066, mediaCrypto);
            } catch (Exception e2) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to initialize decoder: " + frostHunterStorageNovaXEliteAurora3066, e2);
                arrayDeque.removeFirst();
                FrostHunterPagingSourceOlympianMega1078 frostHunterPagingSourceOlympianMega1078 = new FrostHunterPagingSourceOlympianMega1078("Decoder init failed: " + frostHunterStorageNovaXEliteAurora3066.FrostHunterAlphaAnimationNeoCosmos5761 + ", " + frostHunterFirebaseOlympianMax4818, e2, frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059, z, frostHunterStorageNovaXEliteAurora3066, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                FrostHunterColorDrawableLegendPhoenixVision7927(frostHunterPagingSourceOlympianMega1078);
                FrostHunterPagingSourceOlympianMega1078 frostHunterPagingSourceOlympianMega10782 = this.FrostHunterColorStateListInflaterNovaQuantum4229;
                if (frostHunterPagingSourceOlympianMega10782 == null) {
                    this.FrostHunterColorStateListInflaterNovaQuantum4229 = frostHunterPagingSourceOlympianMega1078;
                } else {
                    this.FrostHunterColorStateListInflaterNovaQuantum4229 = new FrostHunterPagingSourceOlympianMega1078(frostHunterPagingSourceOlympianMega10782.getMessage(), frostHunterPagingSourceOlympianMega10782.getCause(), frostHunterPagingSourceOlympianMega10782.FrostHunterCameraXPixelTurboCosmos9814, frostHunterPagingSourceOlympianMega10782.FrostHunterFlowMaxDragonHero5809, frostHunterPagingSourceOlympianMega10782.FrostHunterAlertDialogAuroraDelta3200, frostHunterPagingSourceOlympianMega10782.FrostHunterKeyframeGammaGamma1197);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.FrostHunterColorStateListInflaterNovaQuantum4229;
                }
            }
        }
        this.FrostHunterRunnableCosmosCelestial4235 = null;
    }

    public final boolean FrostHunterSharedElementPixelTitan2806(int i) {
        FrostHunterIntentForceSpeed4935 frostHunterIntentForceSpeed4935 = this.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterIntentForceSpeed4935.FrostHunterKeyframeGammaGamma1197();
        FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007 = this.FrostHunterCardViewSpectraCyber7714;
        frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterLifecycleBlazeGammaElite2889();
        int FrostHunterLooperHyperionForce4133 = FrostHunterLooperHyperionForce4133(frostHunterIntentForceSpeed4935, frostHunterAsyncTaskPrimeGammaTitan9007, i | 4);
        if (FrostHunterLooperHyperionForce4133 == -5) {
            FrostHunterColorStateListMegaBetaFusion7423(frostHunterIntentForceSpeed4935);
            return true;
        }
        if (FrostHunterLooperHyperionForce4133 != -4 || !frostHunterAsyncTaskPrimeGammaTitan9007.FrostHunterServiceEliteCelestialThunder1757(4)) {
            return false;
        }
        this.FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402 = true;
        FrostHunterAlphaAnimationNovaGamma6326();
        return false;
    }

    public abstract void FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterSoundPoolNeoEclipseDelta2867 frostHunterSoundPoolNeoEclipseDelta2867);

    public FrostHunterLevelListDrawableNeoTitan3480 FrostHunterStateCelestialNovaPixel8414(IllegalStateException illegalStateException, FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066) {
        return new FrostHunterLevelListDrawableNeoTitan3480(illegalStateException, frostHunterStorageNovaXEliteAurora3066);
    }

    public final void FrostHunterTransformNovaBetaNovaX5251() {
        this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 = -9223372036854775807L;
        FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = -9223372036854775807L;
        this.FrostHunterImageAnalysisPixelForceOlympian4333 = -9223372036854775807L;
        this.FrostHunterTransformNovaBetaNovaX5251 = false;
        this.FrostHunterBillingClientFusionVortex9008.FrostHunterLifecycleBlazeGammaElite2889();
        this.FrostHunterMeteringPointMegaCyber7955.FrostHunterLifecycleBlazeGammaElite2889();
        this.FrostHunterAnnotationProcessorSolarSpeedNebula4443 = false;
        FrostHunterGradlePulseOlympianTurbo1196 frostHunterGradlePulseOlympianTurbo1196 = this.FrostHunterStateCelestialNovaPixel8414;
        frostHunterGradlePulseOlympianTurbo1196.getClass();
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterFlowMaxDragonHero5809 = 0;
        frostHunterGradlePulseOlympianTurbo1196.FrostHunterCameraXPixelTurboCosmos9814 = 2;
    }

    public long FrostHunterTransitionListenerPulseVortexCosmos7949(long j, long j2, boolean z) {
        return super.FrostHunterFlowMaxDragonHero5809(j, j2);
    }

    public abstract FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterStorageNovaXEliteAurora3066 frostHunterStorageNovaXEliteAurora3066, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182, boolean z);

    public void FrostHunterViewModelScopeTitanRogue1970() {
        this.FrostHunterPlaceholderLegendForceNebula9869 = -1;
        this.FrostHunterViewPhantomNeo1634.FrostHunterFragmentBetaMegaVortex6025 = null;
        this.FrostHunterAlphaAnimationNovaGamma6326 = -1;
        this.FrostHunterNavigationViewMasterVortexBeta1295 = null;
        this.FrostHunterCoordinatorLayoutDragonHyperionSolar9277 = -9223372036854775807L;
        FrostHunterRewardedAdSpectraElite8288().FrostHunterLevelListDrawableFusionDragonHero2232 = -9223372036854775807L;
        this.FrostHunterImageAnalysisPixelForceOlympian4333 = -9223372036854775807L;
        this.FrostHunterViewPager2StrikePulse8790 = -9223372036854775807L;
        this.FrostHunterDrawableCompatHeroMasterSpectra7412 = false;
        this.FrostHunterImageAnalysisGammaOlympian2400 = -9223372036854775807L;
        this.FrostHunterItemDecorationPhoenixAlphaVortex8006 = false;
        this.FrostHunterNestedScrollViewThunderNovaX6772 = false;
        this.FrostHunterColorStateListMegaBetaFusion7423 = false;
        this.FrostHunterSharedElementPixelTitan2806 = false;
        this.FrostHunterCoordinatorLayoutGammaTurboSpark2420 = 0;
        this.FrostHunterCamera2NeoMax8666 = 0;
        this.FrostHunterBindingAdapterInfernoFusionForce2284 = this.FrostHunterViewModelScopeTitanRogue1970 ? 1 : 0;
        this.FrostHunterCameraXPrimeTitanGamma7495 = false;
        this.FrostHunterLayoutLegendDelta7410 = 0L;
    }

    public abstract void FrostHunterViewPager2StrikePulse8790();

    @Override // android.content.Context.FrostHunterFaceDetectionPixelFusionBlaze5291
    public final int FrostHunterViewPhantomNeo1634() {
        return 8;
    }

    public void FrostHunterImageAnalysisGammaOlympian2400() {
    }

    public void FrostHunterPlaceholderLegendForceNebula9869(FrostHunterAsyncTaskPrimeGammaTitan9007 frostHunterAsyncTaskPrimeGammaTitan9007) {
    }
}
