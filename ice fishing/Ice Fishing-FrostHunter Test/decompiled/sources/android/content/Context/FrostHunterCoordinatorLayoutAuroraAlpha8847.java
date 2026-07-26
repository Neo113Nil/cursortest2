package android.content.Context;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GlassNewActivity;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCoordinatorLayoutAuroraAlpha8847 {
    public static final AtomicInteger FrostHunterLiveDataBetaLegend3442 = new AtomicInteger();
    public FrostHunterApplicationInfoPhoenixSparkHyperion8666 FrostHunterAlertDialogAuroraDelta3200;
    public final Context FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterAnnotationProcessorSparkEclipse8710;
    public long FrostHunterBillingClientFusionVortex9008;
    public FrostHunterPagingSourceCosmosFusion5047 FrostHunterBitmapTurboDeltaNebula8743;
    public final FrostHunterIntentPhoenixHyperEclipse8770 FrostHunterBundlePulseFusionHero2475;
    public final ArrayDeque FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterPlaceholderSolarPixelElite2112 FrostHunterCameraXTurboCelestialHero5430;
    public int FrostHunterCardViewSpectraCyber7714;
    public Handler FrostHunterColorDrawableLegendPhoenixVision7927;
    public long FrostHunterColorStateListInflaterNovaQuantum4229;
    public final FrostHunterTraceHyperionAuroraNebula9947 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterConstraintSetCloneOmegaHyperion9304;
    public long FrostHunterDatabaseEliteShadowUltra2452;
    public FrostHunterCameraThunderEpicBeta3381 FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public long FrostHunterEditTextPulseHyperion1262;
    public boolean FrostHunterFCMDeltaQuantumHero8364;
    public FrostHunterConfigurationAlphaDragonQuantum8557 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public int FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterRoomHeroStormStrike4713 FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterRoomHeroStormStrike4713 FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterMotionEventNeoGammaElite3606 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final FrostHunterContentResolverEliteHero2274 FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterSQLiteMasterUltra9956 FrostHunterLightSensorForceFusion4241;
    public FrostHunterLightSensorMaxEpicPrime9984 FrostHunterLintTitanVortexQuantum9911;
    public boolean FrostHunterLooperHyperionForce4133;
    public FrostHunterRemoteConfigEpicUltraDragon2411 FrostHunterLooperThreadBetaHyperionMax1000;
    public ByteBuffer FrostHunterMagnetometerFusionTitanium8202;
    public float FrostHunterMediaPlayerCelestialBetaTitan3868;
    public long FrostHunterMeteringPointBetaCyber9571;
    public boolean FrostHunterMeteringPointMegaCyber7955;
    public FrostHunterPagingSourceCosmosFusion5047 FrostHunterMotionSceneAuroraMega2271;
    public boolean FrostHunterNavigationMasterMegaMax2752;
    public boolean FrostHunterPagingDataTurboTitanium7332;
    public int FrostHunterPagingSourceEclipseDelta8255;
    public boolean FrostHunterPermissionInfoAlphaDelta6279;
    public boolean FrostHunterPreviewBlazeAurora1020;
    public boolean FrostHunterPushNotificationStormTitanGamma8999;
    public boolean FrostHunterR8MasterNebulaSpark7247;
    public final FrostHunterBitmapNeoCosmos7205 FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterRemoteConfigThunderShadow4435;
    public FrostHunterTransformPixelMega2523 FrostHunterResourcesTitanHyperVision5823;
    public boolean FrostHunterRewardedAdMasterStrike9463;
    public AudioDeviceInfo FrostHunterRewardedAdSpectraElite8288;
    public long FrostHunterRunnableCosmosCelestial4235;
    public FrostHunterConfigurationAlphaDragonQuantum8557 FrostHunterScaleAnimationStrikeSpark5059;
    public FrostHunterToolbarPixelHyperion1536 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final FrostHunterAlphaAnimationSolarHyperionCyber6976 FrostHunterServiceEliteCelestialThunder1757;
    public long FrostHunterServiceInfoHyperionSparkMax9966;
    public int FrostHunterStateCelestialNovaPixel8414;
    public FrostHunterFirestoreVortexBeta2433 FrostHunterTextViewDragonStormMega4297;
    public FrostHunterMeteringPointPhoenixMax5176 FrostHunterTransitionListenerPulseVortexCosmos7949;
    public ByteBuffer FrostHunterTranslateAnimationCyberSolarUltra7101;
    public boolean FrostHunterViewPhantomNeo1634;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0080, code lost:
    
        r9 = r0.getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterCoordinatorLayoutAuroraAlpha8847(FrostHunterBottomSheetEpicStrikeStrike8477 frostHunterBottomSheetEpicStrikeStrike8477) {
        int deviceId;
        GlassNewActivity glassNewActivity = (GlassNewActivity) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = glassNewActivity.getApplicationContext();
        this.FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterRemoteConfigEpicUltraDragon2411.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = (FrostHunterTraceHyperionAuroraNebula9947) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterFlowMaxDragonHero5809 = 0;
        this.FrostHunterCameraXTurboCelestialHero5430 = (FrostHunterPlaceholderSolarPixelElite2112) frostHunterBottomSheetEpicStrikeStrike8477.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterIntentPhoenixHyperEclipse8770 frostHunterIntentPhoenixHyperEclipse8770 = new FrostHunterIntentPhoenixHyperEclipse8770();
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterIntentPhoenixHyperEclipse8770;
        FrostHunterAlphaAnimationSolarHyperionCyber6976 frostHunterAlphaAnimationSolarHyperionCyber6976 = new FrostHunterAlphaAnimationSolarHyperionCyber6976();
        frostHunterAlphaAnimationSolarHyperionCyber6976.FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterAlphaAnimationSolarHyperionCyber6976;
        this.FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterContentResolverEliteHero2274();
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterMotionEventNeoGammaElite3606();
        this.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterAlphaAnimationSolarHyperionCyber6976, frostHunterIntentPhoenixHyperEclipse8770);
        this.FrostHunterMediaPlayerCelestialBetaTitan3868 = 1.0f;
        this.FrostHunterPagingSourceEclipseDelta8255 = 0;
        this.FrostHunterTransitionListenerPulseVortexCosmos7949 = new FrostHunterMeteringPointPhoenixMax5176();
        FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381 = FrostHunterCameraThunderEpicBeta3381.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterBitmapTurboDeltaNebula8743 = new FrostHunterPagingSourceCosmosFusion5047(frostHunterCameraThunderEpicBeta3381, 0L, 0L);
        this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterCameraThunderEpicBeta3381;
        this.FrostHunterLooperHyperionForce4133 = false;
        this.FrostHunterCameraXPixelTurboCosmos9814 = new ArrayDeque();
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterRoomHeroStormStrike4713();
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterRoomHeroStormStrike4713();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && deviceId != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.FrostHunterRemoteConfigThunderShadow4435 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int FrostHunterFlowMaxDragonHero5809(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((FrostHunterCanvasInfernoVortex4700.FrostHunterR8MasterNebulaSpark7247(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                            return 0;
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterMeteringPointMegaCyber7955(new FrostHunterCountDownTimerStormPulseFusion5949(bArr, 16)).FrostHunterBundlePulseFusionHero2475;
                        case 18:
                            break;
                        default:
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Unexpected audio encoding: ", i));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return FrostHunterVectorDrawableForceMax1351.FrostHunterAlphaAnimationNeoCosmos5761[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b5 = byteBuffer.get(position4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b2 = byteBuffer.get(position4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b2 = byteBuffer.get(position4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b = byteBuffer.get(position4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final long FrostHunterAlertDialogAuroraDelta3200() {
        if (!FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
            return this.FrostHunterDatabaseEliteShadowUltra2452;
        }
        long j = this.FrostHunterEditTextPulseHyperion1262;
        long j2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterServiceEliteCelestialThunder1757;
        return ((j + j2) - 1) / j2;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381;
        boolean FrostHunterMotionSceneAuroraMega2271 = FrostHunterMotionSceneAuroraMega2271();
        boolean z = false;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (FrostHunterMotionSceneAuroraMega2271) {
            frostHunterCameraThunderEpicBeta3381 = FrostHunterCameraThunderEpicBeta3381.FrostHunterServiceEliteCelestialThunder1757;
        } else {
            if (this.FrostHunterPushNotificationStormTitanGamma8999 || !FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                frostHunterCameraThunderEpicBeta3381 = FrostHunterCameraThunderEpicBeta3381.FrostHunterServiceEliteCelestialThunder1757;
            } else {
                int i = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterTranslateAnimationCyberSolarUltra7101;
                frostHunterCameraThunderEpicBeta3381 = this.FrostHunterDialogFragmentTurboPhoenixDragon7627;
                FrostHunterPermissionInfoCyberStorm3295 frostHunterPermissionInfoCyberStorm3295 = (FrostHunterPermissionInfoCyberStorm3295) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197;
                float f = frostHunterCameraThunderEpicBeta3381.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterPermissionInfoCyberStorm3295.getClass();
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f > 0.0f);
                if (frostHunterPermissionInfoCyberStorm3295.FrostHunterBundlePulseFusionHero2475 != f) {
                    frostHunterPermissionInfoCyberStorm3295.FrostHunterBundlePulseFusionHero2475 = f;
                    frostHunterPermissionInfoCyberStorm3295.FrostHunterFlowMaxDragonHero5809 = true;
                }
                float f2 = frostHunterCameraThunderEpicBeta3381.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f2 > 0.0f);
                if (frostHunterPermissionInfoCyberStorm3295.FrostHunterServiceEliteCelestialThunder1757 != f2) {
                    frostHunterPermissionInfoCyberStorm3295.FrostHunterServiceEliteCelestialThunder1757 = f2;
                    frostHunterPermissionInfoCyberStorm3295.FrostHunterFlowMaxDragonHero5809 = true;
                }
            }
            this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterCameraThunderEpicBeta3381;
        }
        FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta33812 = frostHunterCameraThunderEpicBeta3381;
        if (!this.FrostHunterPushNotificationStormTitanGamma8999 && FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
            int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterTranslateAnimationCyberSolarUltra7101;
            z = this.FrostHunterLooperHyperionForce4133;
            ((FrostHunterProximitySensorHyperionNovaXPixel7745) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200).FrostHunterScaleAnimationStrikeSpark5059 = z;
        }
        this.FrostHunterLooperHyperionForce4133 = z;
        this.FrostHunterCameraXPixelTurboCosmos9814.add(new FrostHunterPagingSourceCosmosFusion5047(frostHunterCameraThunderEpicBeta33812, Math.max(0L, j), FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterAlertDialogAuroraDelta3200())));
        FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime9984 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLevelListDrawableFusionDragonHero2232;
        this.FrostHunterLintTitanVortexQuantum9911 = frostHunterLightSensorMaxEpicPrime9984;
        frostHunterLightSensorMaxEpicPrime9984.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterLightSensorForceFusion4241;
        if (frostHunterSQLiteMasterUltra9956 != null) {
            boolean z2 = this.FrostHunterLooperHyperionForce4133;
            FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = ((FrostHunterViewModelScopeStormSpeedQuantum8589) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809).FrostHunterScrollViewCyberPixel8279;
            Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
            if (handler != null) {
                handler.post(new FrostHunterJobIntentServiceUltraOlympianNeo1582(frostHunterStorageDeltaInferno9007, z2, 9));
            }
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, int[] iArr) {
        FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime9984;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182;
        int i;
        int i2;
        if (this.FrostHunterResourcesTitanHyperVision5823 == null && this.FrostHunterAlphaAnimationNeoCosmos5761 != null) {
            FrostHunterTransformPixelMega2523 frostHunterTransformPixelMega2523 = new FrostHunterTransformPixelMega2523(this);
            this.FrostHunterResourcesTitanHyperVision5823 = frostHunterTransformPixelMega2523;
            FrostHunterPlaceholderSolarPixelElite2112 frostHunterPlaceholderSolarPixelElite2112 = this.FrostHunterCameraXTurboCelestialHero5430;
            frostHunterPlaceholderSolarPixelElite2112.FrostHunterLevelListDrawableFusionDragonHero2232();
            if (frostHunterPlaceholderSolarPixelElite2112.FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
                frostHunterPlaceholderSolarPixelElite2112.FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterAlertDialogEliteMasterCosmos7701(Thread.currentThread());
            }
            frostHunterPlaceholderSolarPixelElite2112.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTransformPixelMega2523);
        }
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        int i3 = frostHunterFirebaseOlympianMax4818.FrostHunterBillingClientFusionVortex9008;
        int i4 = frostHunterFirebaseOlympianMax4818.FrostHunterTranslateAnimationCyberSolarUltra7101;
        if ("audio/raw".equals(str)) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(i4));
            int FrostHunterLightSensorForceFusion4241 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLightSensorForceFusion4241(i4) * i3;
            FrostHunterTextureViewBlazePhantomDragon5593 frostHunterTextureViewBlazePhantomDragon5593 = new FrostHunterTextureViewBlazePhantomDragon5593(4);
            frostHunterTextureViewBlazePhantomDragon5593.FrostHunterBundlePulseFusionHero2475(this.FrostHunterRemoteConfigSpeedSpeed8566);
            frostHunterTextureViewBlazePhantomDragon5593.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterLifecycleBlazeGammaElite2889);
            FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336[] frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr = (FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336[]) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809;
            int length = frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr.length;
            FrostHunterCanvasInfernoVortex4700.FrostHunterLooperHyperionForce4133(length, frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr);
            frostHunterTextureViewBlazePhantomDragon5593.FrostHunterServiceEliteCelestialThunder1757(length);
            System.arraycopy(frostHunterPaintFlagsDrawFilterSparkSpectraMega2336Arr, 0, frostHunterTextureViewBlazePhantomDragon5593.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterTextureViewBlazePhantomDragon5593.FrostHunterConstraintSetCloneMasterUltraRogue2633, length);
            frostHunterTextureViewBlazePhantomDragon5593.FrostHunterConstraintSetCloneMasterUltraRogue2633 += length;
            frostHunterLightSensorMaxEpicPrime9984 = new FrostHunterLightSensorMaxEpicPrime9984(frostHunterTextureViewBlazePhantomDragon5593.FrostHunterLevelListDrawableFusionDragonHero2232());
            if (frostHunterLightSensorMaxEpicPrime9984.equals(this.FrostHunterLintTitanVortexQuantum9911)) {
                frostHunterLightSensorMaxEpicPrime9984 = this.FrostHunterLintTitanVortexQuantum9911;
            }
            int i5 = frostHunterFirebaseOlympianMax4818.FrostHunterStateCelestialNovaPixel8414;
            int i6 = frostHunterFirebaseOlympianMax4818.FrostHunterMagnetometerFusionTitanium8202;
            FrostHunterAlphaAnimationSolarHyperionCyber6976 frostHunterAlphaAnimationSolarHyperionCyber6976 = this.FrostHunterServiceEliteCelestialThunder1757;
            frostHunterAlphaAnimationSolarHyperionCyber6976.FrostHunterFlowMaxDragonHero5809 = i5;
            frostHunterAlphaAnimationSolarHyperionCyber6976.FrostHunterAlertDialogAuroraDelta3200 = i6;
            this.FrostHunterBundlePulseFusionHero2475.FrostHunterFlowMaxDragonHero5809 = iArr;
            FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218 = new FrostHunterConstraintSetHeroOlympian6218(frostHunterFirebaseOlympianMax4818.FrostHunterMediaPlayerCelestialBetaTitan3868, i3, i4);
            try {
                FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = frostHunterLightSensorMaxEpicPrime9984.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterConstraintSetHeroOlympian6218.equals(FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889)) {
                    throw new FrostHunterVideoCaptureEclipseMasterBlaze3228(frostHunterConstraintSetHeroOlympian6218);
                }
                for (int i7 = 0; i7 < frostHunterAlarmManagerHeroTitaniumFusion5758.size(); i7++) {
                    FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336 frostHunterPaintFlagsDrawFilterSparkSpectraMega2336 = (FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) frostHunterAlarmManagerHeroTitaniumFusion5758.get(i7);
                    FrostHunterConstraintSetHeroOlympian6218 FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterConstraintSetHeroOlympian6218);
                    if (frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761()) {
                        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!FrostHunterRemoteConfigSpeedSpeed8566.equals(FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889));
                        frostHunterConstraintSetHeroOlympian6218 = FrostHunterRemoteConfigSpeedSpeed8566;
                    }
                }
                int i8 = frostHunterConstraintSetHeroOlympian6218.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int i9 = frostHunterConstraintSetHeroOlympian6218.FrostHunterBundlePulseFusionHero2475;
                FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax4818.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMediaPlayerCelestialBetaTitan3868 = i9;
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBillingClientFusionVortex9008 = frostHunterConstraintSetHeroOlympian6218.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMeteringPointMegaCyber7955 = i8;
                frostHunterFirebaseOlympianMax48182 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
                i = FrostHunterLightSensorForceFusion4241;
                i2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLightSensorForceFusion4241(i9) * i8;
            } catch (FrostHunterVideoCaptureEclipseMasterBlaze3228 e) {
                throw new FrostHunterOnLongClickListenerTitanTitanium7847(e, frostHunterFirebaseOlympianMax4818);
            }
        } else {
            frostHunterLightSensorMaxEpicPrime9984 = new FrostHunterLightSensorMaxEpicPrime9984(FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
            frostHunterFirebaseOlympianMax48182 = frostHunterFirebaseOlympianMax4818;
            i = -1;
            i2 = -1;
        }
        FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime99842 = frostHunterLightSensorMaxEpicPrime9984;
        FrostHunterFCMEpicEpic9637 FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterRemoteConfigSpeedSpeed8566(frostHunterFirebaseOlympianMax48182);
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48183 = FrostHunterRemoteConfigSpeedSpeed85662.FrostHunterAlphaAnimationNeoCosmos5761;
        try {
            FrostHunterFilterTurboPixel9595 FrostHunterBundlePulseFusionHero2475 = this.FrostHunterCameraXTurboCelestialHero5430.FrostHunterBundlePulseFusionHero2475(FrostHunterRemoteConfigSpeedSpeed85662);
            boolean z = FrostHunterBundlePulseFusionHero2475.FrostHunterLifecycleBlazeGammaElite2889;
            if (FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
                throw new FrostHunterOnLongClickListenerTitanTitanium7847("Invalid output encoding (isOffload=" + z + ")", frostHunterFirebaseOlympianMax48183);
            }
            if (FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475 == 0) {
                throw new FrostHunterOnLongClickListenerTitanTitanium7847("Invalid output channel config (isOffload=" + z + ")", frostHunterFirebaseOlympianMax48183);
            }
            this.FrostHunterAnnotationProcessorSparkEclipse8710 = false;
            FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = new FrostHunterConfigurationAlphaDragonQuantum8557(frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax48182, i, i2, FrostHunterBundlePulseFusionHero2475, frostHunterLightSensorMaxEpicPrime99842);
            if (FrostHunterLightSensorForceFusion4241()) {
                this.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterConfigurationAlphaDragonQuantum8557;
            } else {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterConfigurationAlphaDragonQuantum8557;
            }
        } catch (FrostHunterScrollViewShadowOlympianStrike8701 e2) {
            throw new FrostHunterOnLongClickListenerTitanTitanium7847(e2, frostHunterFirebaseOlympianMax4818);
        }
    }

    public final int FrostHunterCameraXPixelTurboCosmos9814(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        boolean z;
        if (!FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(frostHunterFirebaseOlympianMax4818.FrostHunterTranslateAnimationCyberSolarUltra7101) || frostHunterFirebaseOlympianMax4818.FrostHunterTranslateAnimationCyberSolarUltra7101 == 2) {
            z = false;
        } else {
            FrostHunterCamera2EpicNovaX6250 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax4818.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMediaPlayerCelestialBetaTitan3868 = 2;
            frostHunterFirebaseOlympianMax4818 = new FrostHunterFirebaseOlympianMax4818(FrostHunterAlphaAnimationNeoCosmos5761);
            z = true;
        }
        int i = this.FrostHunterCameraXTurboCelestialHero5430.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterRemoteConfigSpeedSpeed8566(frostHunterFirebaseOlympianMax4818)).FrostHunterServiceEliteCelestialThunder1757;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final void FrostHunterCameraXTurboCelestialHero5430() {
        if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null) {
            FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = this.FrostHunterScaleAnimationStrikeSpark5059;
            if (frostHunterConfigurationAlphaDragonQuantum8557 != null) {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterConfigurationAlphaDragonQuantum8557;
                this.FrostHunterScaleAnimationStrikeSpark5059 = null;
            }
            try {
                FrostHunterFilterTurboPixel9595 FrostHunterBundlePulseFusionHero2475 = this.FrostHunterCameraXTurboCelestialHero5430.FrostHunterBundlePulseFusionHero2475(FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633));
                FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum85572 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterConfigurationAlphaDragonQuantum8557(frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterBundlePulseFusionHero2475, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterServiceEliteCelestialThunder1757, FrostHunterBundlePulseFusionHero2475, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterLevelListDrawableFusionDragonHero2232);
            } catch (FrostHunterScrollViewShadowOlympianStrike8701 e) {
                throw new IllegalStateException(new FrostHunterOnLongClickListenerTitanTitanium7847(e, this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761));
            }
        }
        FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    public final FrostHunterFirestoreVortexBeta2433 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFilterTurboPixel9595 frostHunterFilterTurboPixel9595) {
        try {
            return this.FrostHunterCameraXTurboCelestialHero5430.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFilterTurboPixel9595);
        } catch (FrostHunterWithContextTurboDelta8933 e) {
            FrostHunterGuidelineStormCosmosTitan7688 frostHunterGuidelineStormCosmosTitan7688 = new FrostHunterGuidelineStormCosmosTitan7688(frostHunterFilterTurboPixel9595.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterFilterTurboPixel9595.FrostHunterBundlePulseFusionHero2475, frostHunterFilterTurboPixel9595.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFilterTurboPixel9595.FrostHunterLevelListDrawableFusionDragonHero2232, this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFilterTurboPixel9595.FrostHunterLifecycleBlazeGammaElite2889, e);
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterLightSensorForceFusion4241;
            if (frostHunterSQLiteMasterUltra9956 == null) {
                throw frostHunterGuidelineStormCosmosTitan7688;
            }
            frostHunterSQLiteMasterUltra9956.FrostHunterLooperHyperionForce4133(frostHunterGuidelineStormCosmosTitan7688);
            throw frostHunterGuidelineStormCosmosTitan7688;
        }
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        if (this.FrostHunterR8MasterNebulaSpark7247) {
            return;
        }
        this.FrostHunterR8MasterNebulaSpark7247 = true;
        if (this.FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475()) {
            this.FrostHunterFCMDeltaQuantumHero8364 = false;
        }
        FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
        if (frostHunterFirestoreVortexBeta2433.FrostHunterKeyframeGammaGamma1197) {
            return;
        }
        frostHunterFirestoreVortexBeta2433.FrostHunterKeyframeGammaGamma1197 = true;
        FrostHunterAssetManagerLegendGamma4159 frostHunterAssetManagerLegendGamma4159 = frostHunterFirestoreVortexBeta2433.FrostHunterLevelListDrawableFusionDragonHero2232;
        long FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterFirestoreVortexBeta2433.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        frostHunterAssetManagerLegendGamma4159.FrostHunterBitmapTurboDeltaNebula8743 = frostHunterAssetManagerLegendGamma4159.FrostHunterAlphaAnimationNeoCosmos5761();
        frostHunterAssetManagerLegendGamma4159.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
        frostHunterAssetManagerLegendGamma4159.FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(SystemClock.elapsedRealtime());
        frostHunterAssetManagerLegendGamma4159.FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761.stop();
        frostHunterFirestoreVortexBeta2433.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 0;
    }

    public final boolean FrostHunterFragmentBetaMegaVortex6025() {
        if (!FrostHunterLightSensorForceFusion4241()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475() && this.FrostHunterFCMDeltaQuantumHero8364) {
            return false;
        }
        long FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200();
        long FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
        frostHunterFirestoreVortexBeta2433.getClass();
        return FrostHunterAlertDialogAuroraDelta3200 > FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterAlphaAnimationNeoCosmos5761, (long) frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00aa, code lost:
    
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
    
        if (r5 == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterKeyframeGammaGamma1197(int i, long j, ByteBuffer byteBuffer) {
        long j2;
        long j3;
        long j4;
        ByteBuffer byteBuffer2 = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.FrostHunterScaleAnimationStrikeSpark5059 != null) {
            if (FrostHunterLifecycleBlazeGammaElite2889()) {
                if (this.FrostHunterTextViewDragonStormMega4297 != null) {
                    FrostHunterFilterTurboPixel9595 frostHunterFilterTurboPixel9595 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889;
                    FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    if (!this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLifecycleBlazeGammaElite2889.equals(frostHunterFilterTurboPixel9595)) {
                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
                        if (!FrostHunterFragmentBetaMegaVortex6025()) {
                            FrostHunterLevelListDrawableFusionDragonHero2232();
                            FrostHunterAlphaAnimationNeoCosmos5761(j);
                        }
                    }
                }
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = this.FrostHunterScaleAnimationStrikeSpark5059;
                this.FrostHunterScaleAnimationStrikeSpark5059 = null;
                FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
                if (frostHunterFirestoreVortexBeta2433 != null && frostHunterFirestoreVortexBeta2433.FrostHunterBundlePulseFusionHero2475() && this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterKeyframeGammaGamma1197) {
                    FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta24332 = this.FrostHunterTextViewDragonStormMega4297;
                    AudioTrack audioTrack = frostHunterFirestoreVortexBeta24332.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 29 && audioTrack.getPlayState() == 3) {
                        audioTrack.setOffloadEndOfStream();
                        FrostHunterAssetManagerLegendGamma4159 frostHunterAssetManagerLegendGamma4159 = frostHunterFirestoreVortexBeta24332.FrostHunterLevelListDrawableFusionDragonHero2232;
                        frostHunterAssetManagerLegendGamma4159.FrostHunterServiceInfoHyperionSparkMax9966 = true;
                        frostHunterAssetManagerLegendGamma4159.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232 = true;
                    }
                    FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta24333 = this.FrostHunterTextViewDragonStormMega4297;
                    FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i3 = frostHunterFirebaseOlympianMax4818.FrostHunterStateCelestialNovaPixel8414;
                    int i4 = frostHunterFirebaseOlympianMax4818.FrostHunterMagnetometerFusionTitanium8202;
                    if (i2 < 29) {
                        frostHunterFirestoreVortexBeta24333.getClass();
                    } else {
                        frostHunterFirestoreVortexBeta24333.FrostHunterAlphaAnimationNeoCosmos5761.setOffloadDelayPadding(i3, i4);
                    }
                    this.FrostHunterPreviewBlazeAurora1020 = true;
                }
                FrostHunterAlphaAnimationNeoCosmos5761(j);
            }
            return false;
        }
        boolean FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241();
        FrostHunterRoomHeroStormStrike4713 frostHunterRoomHeroStormStrike4713 = this.FrostHunterKeyframeGammaGamma1197;
        if (!FrostHunterLightSensorForceFusion4241) {
            try {
            } catch (FrostHunterGuidelineStormCosmosTitan7688 e) {
                if (e.FrostHunterCameraXPixelTurboCosmos9814) {
                    throw e;
                }
                frostHunterRoomHeroStormStrike4713.FrostHunterLifecycleBlazeGammaElite2889(e);
                return false;
            }
        }
        frostHunterRoomHeroStormStrike4713.FrostHunterAlertDialogAuroraDelta3200 = null;
        frostHunterRoomHeroStormStrike4713.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
        frostHunterRoomHeroStormStrike4713.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
        if (this.FrostHunterMeteringPointMegaCyber7955) {
            this.FrostHunterBillingClientFusionVortex9008 = Math.max(0L, j);
            this.FrostHunterViewPhantomNeo1634 = false;
            this.FrostHunterMeteringPointMegaCyber7955 = false;
            if (FrostHunterMotionSceneAuroraMega2271()) {
                FrostHunterTextViewDragonStormMega4297();
            }
            FrostHunterAlphaAnimationNeoCosmos5761(j);
            if (this.FrostHunterRewardedAdMasterStrike9463) {
                FrostHunterScaleAnimationStrikeSpark5059();
            }
        }
        if (this.FrostHunterTranslateAnimationCyberSolarUltra7101 == null) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) && this.FrostHunterCardViewSpectraCyber7714 == 0) {
                    int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761, byteBuffer);
                    this.FrostHunterCardViewSpectraCyber7714 = FrostHunterFlowMaxDragonHero5809;
                }
                if (this.FrostHunterMotionSceneAuroraMega2271 != null) {
                    if (FrostHunterLifecycleBlazeGammaElite2889()) {
                        FrostHunterAlphaAnimationNeoCosmos5761(j);
                        this.FrostHunterMotionSceneAuroraMega2271 = null;
                    }
                    return false;
                }
                long j5 = this.FrostHunterBillingClientFusionVortex9008;
                FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                if (FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterConfigurationAlphaDragonQuantum8557)) {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.FrostHunterMeteringPointBetaCyber9571 / this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    j4 = this.FrostHunterServiceInfoHyperionSparkMax9966;
                }
                long FrostHunterBillingClientFusionVortex9008 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMediaPlayerCelestialBetaTitan3868, j4 - this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterScaleAnimationStrikeSpark5059) + j5;
                if (!this.FrostHunterViewPhantomNeo1634 && Math.abs(FrostHunterBillingClientFusionVortex9008 - j) > 200000) {
                    FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterLightSensorForceFusion4241;
                    if (frostHunterSQLiteMasterUltra9956 != null) {
                        frostHunterSQLiteMasterUltra9956.FrostHunterLooperHyperionForce4133(new FrostHunterRotateAnimationSpectraPhoenixPhantom3899("Unexpected audio track timestamp discontinuity: expected " + FrostHunterBillingClientFusionVortex9008 + ", got " + j));
                    }
                    this.FrostHunterViewPhantomNeo1634 = true;
                }
                if (this.FrostHunterViewPhantomNeo1634) {
                    if (FrostHunterLifecycleBlazeGammaElite2889()) {
                        long j6 = j - FrostHunterBillingClientFusionVortex9008;
                        this.FrostHunterBillingClientFusionVortex9008 += j6;
                        this.FrostHunterViewPhantomNeo1634 = false;
                        FrostHunterAlphaAnimationNeoCosmos5761(j);
                        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterLightSensorForceFusion4241;
                        if (frostHunterSQLiteMasterUltra99562 != null && j6 != j3) {
                            ((FrostHunterViewModelScopeStormSpeedQuantum8589) frostHunterSQLiteMasterUltra99562.FrostHunterFlowMaxDragonHero5809).FrostHunterOnClickListenerAuroraForce2274 = true;
                        }
                    }
                    return false;
                }
                if (FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                    this.FrostHunterMeteringPointBetaCyber9571 += byteBuffer.remaining();
                } else {
                    this.FrostHunterServiceInfoHyperionSparkMax9966 = (this.FrostHunterCardViewSpectraCyber7714 * i) + this.FrostHunterServiceInfoHyperionSparkMax9966;
                }
                this.FrostHunterTranslateAnimationCyberSolarUltra7101 = byteBuffer;
                this.FrostHunterStateCelestialNovaPixel8414 = i;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        j3 = 0;
        FrostHunterLintTitanVortexQuantum9911(j);
        if (!this.FrostHunterTranslateAnimationCyberSolarUltra7101.hasRemaining()) {
            this.FrostHunterTranslateAnimationCyberSolarUltra7101 = null;
            this.FrostHunterStateCelestialNovaPixel8414 = 0;
            return true;
        }
        FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta24334 = this.FrostHunterTextViewDragonStormMega4297;
        FrostHunterAssetManagerLegendGamma4159 frostHunterAssetManagerLegendGamma41592 = frostHunterFirestoreVortexBeta24334.FrostHunterLevelListDrawableFusionDragonHero2232;
        long FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterFirestoreVortexBeta24334.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (frostHunterAssetManagerLegendGamma41592.FrostHunterMotionSceneAuroraMega2271 != j2 && FrostHunterConstraintSetCloneMasterUltraRogue2633 > j3) {
            frostHunterAssetManagerLegendGamma41592.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            if (SystemClock.elapsedRealtime() - frostHunterAssetManagerLegendGamma41592.FrostHunterMotionSceneAuroraMega2271 >= 200) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Resetting stalled audio output");
                FrostHunterLevelListDrawableFusionDragonHero2232();
                return true;
            }
        }
        return false;
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232() {
        if (FrostHunterLightSensorForceFusion4241()) {
            this.FrostHunterMeteringPointBetaCyber9571 = 0L;
            this.FrostHunterServiceInfoHyperionSparkMax9966 = 0L;
            this.FrostHunterEditTextPulseHyperion1262 = 0L;
            this.FrostHunterDatabaseEliteShadowUltra2452 = 0L;
            int i = 0;
            this.FrostHunterPreviewBlazeAurora1020 = false;
            this.FrostHunterCardViewSpectraCyber7714 = 0;
            this.FrostHunterBitmapTurboDeltaNebula8743 = new FrostHunterPagingSourceCosmosFusion5047(this.FrostHunterDialogFragmentTurboPhoenixDragon7627, 0L, 0L);
            this.FrostHunterBillingClientFusionVortex9008 = 0L;
            this.FrostHunterMotionSceneAuroraMega2271 = null;
            this.FrostHunterCameraXPixelTurboCosmos9814.clear();
            this.FrostHunterTranslateAnimationCyberSolarUltra7101 = null;
            this.FrostHunterStateCelestialNovaPixel8414 = 0;
            this.FrostHunterMagnetometerFusionTitanium8202 = null;
            this.FrostHunterR8MasterNebulaSpark7247 = false;
            this.FrostHunterPagingDataTurboTitanium7332 = false;
            this.FrostHunterFCMDeltaQuantumHero8364 = false;
            this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterScaleAnimationStrikeSpark5059 = 0L;
            FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime9984 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLevelListDrawableFusionDragonHero2232;
            this.FrostHunterLintTitanVortexQuantum9911 = frostHunterLightSensorMaxEpicPrime9984;
            frostHunterLightSensorMaxEpicPrime9984.FrostHunterAlphaAnimationNeoCosmos5761();
            this.FrostHunterAlertDialogAuroraDelta3200 = null;
            FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = this.FrostHunterScaleAnimationStrikeSpark5059;
            if (frostHunterConfigurationAlphaDragonQuantum8557 != null) {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterConfigurationAlphaDragonQuantum8557;
                this.FrostHunterScaleAnimationStrikeSpark5059 = null;
            }
            FrostHunterLiveDataBetaLegend3442.incrementAndGet();
            FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
            if (frostHunterFirestoreVortexBeta2433.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterServiceEliteCelestialThunder1757.getPlayState() == 3) {
                frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && frostHunterFirestoreVortexBeta2433.FrostHunterBundlePulseFusionHero2475()) {
                FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = frostHunterFirestoreVortexBeta2433.FrostHunterFlowMaxDragonHero5809;
                frostHunterTraceHyperionAuroraNebula9947.getClass();
                ((FrostHunterFirestoreVortexBeta2433) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197).FrostHunterAlphaAnimationNeoCosmos5761.unregisterStreamEventCallback((FrostHunterProcessCameraProviderAuroraForce2188) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200);
                ((Handler) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809).removeCallbacksAndMessages(null);
            }
            FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = frostHunterFirestoreVortexBeta2433.FrostHunterLifecycleBlazeGammaElite2889;
            if (frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 != null) {
                AudioTrack audioTrack = (AudioTrack) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFlowMaxDragonHero5809;
                FrostHunterGradlePluginMegaShadow1674 frostHunterGradlePluginMegaShadow1674 = (FrostHunterGradlePluginMegaShadow1674) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025;
                frostHunterGradlePluginMegaShadow1674.getClass();
                audioTrack.removeOnRoutingChangedListener(frostHunterGradlePluginMegaShadow1674);
                frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterFragmentBetaMegaVortex6025 = null;
                frostHunterFirestoreVortexBeta2433.FrostHunterLifecycleBlazeGammaElite2889 = null;
            }
            AudioTrack audioTrack2 = frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = frostHunterFirestoreVortexBeta2433.FrostHunterAlertDialogAuroraDelta3200;
            Handler FrostHunterKeyframeGammaGamma1197 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterKeyframeGammaGamma1197(null);
            synchronized (FrostHunterFirestoreVortexBeta2433.FrostHunterResourcesTitanHyperVision5823) {
                try {
                    if (FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297 == null) {
                        FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297 = Executors.newSingleThreadScheduledExecutor(new FrostHunterOnItemLongClickListenerTurboStormPrime6483());
                    }
                    FrostHunterFirestoreVortexBeta2433.FrostHunterLooperThreadBetaHyperionMax1000++;
                    FrostHunterFirestoreVortexBeta2433.FrostHunterTextViewDragonStormMega4297.schedule(new FrostHunterMagnetometerStrikeSolar7622(audioTrack2, FrostHunterKeyframeGammaGamma1197, frostHunterAlertDialogEliteMasterCosmos7701, i), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.FrostHunterTextViewDragonStormMega4297 = null;
        }
        FrostHunterRoomHeroStormStrike4713 frostHunterRoomHeroStormStrike4713 = this.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterRoomHeroStormStrike4713.FrostHunterAlertDialogAuroraDelta3200 = null;
        frostHunterRoomHeroStormStrike4713.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
        frostHunterRoomHeroStormStrike4713.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
        FrostHunterRoomHeroStormStrike4713 frostHunterRoomHeroStormStrike47132 = this.FrostHunterKeyframeGammaGamma1197;
        frostHunterRoomHeroStormStrike47132.FrostHunterAlertDialogAuroraDelta3200 = null;
        frostHunterRoomHeroStormStrike47132.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
        frostHunterRoomHeroStormStrike47132.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
        this.FrostHunterRunnableCosmosCelestial4235 = 0L;
        this.FrostHunterColorStateListInflaterNovaQuantum4229 = 0L;
        Handler handler = this.FrostHunterColorDrawableLegendPhoenixVision7927;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterLifecycleBlazeGammaElite2889() {
        ByteBuffer byteBuffer;
        if (!this.FrostHunterLintTitanVortexQuantum9911.FrostHunterServiceEliteCelestialThunder1757()) {
            FrostHunterServiceEliteCelestialThunder1757(Long.MIN_VALUE);
            return this.FrostHunterMagnetometerFusionTitanium8202 == null;
        }
        FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime9984 = this.FrostHunterLintTitanVortexQuantum9911;
        if (frostHunterLightSensorMaxEpicPrime9984.FrostHunterServiceEliteCelestialThunder1757() && !frostHunterLightSensorMaxEpicPrime9984.FrostHunterServiceEliteCelestialThunder1757) {
            frostHunterLightSensorMaxEpicPrime9984.FrostHunterServiceEliteCelestialThunder1757 = true;
            ((FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) frostHunterLightSensorMaxEpicPrime9984.FrostHunterConstraintSetCloneMasterUltraRogue2633.get(0)).FrostHunterServiceEliteCelestialThunder1757();
        }
        FrostHunterLintTitanVortexQuantum9911(Long.MIN_VALUE);
        if (!this.FrostHunterLintTitanVortexQuantum9911.FrostHunterBundlePulseFusionHero2475() || ((byteBuffer = this.FrostHunterMagnetometerFusionTitanium8202) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final boolean FrostHunterLightSensorForceFusion4241() {
        return this.FrostHunterTextViewDragonStormMega4297 != null;
    }

    public final void FrostHunterLintTitanVortexQuantum9911(long j) {
        ByteBuffer byteBuffer;
        FrostHunterServiceEliteCelestialThunder1757(j);
        if (this.FrostHunterMagnetometerFusionTitanium8202 != null) {
            return;
        }
        if (!this.FrostHunterLintTitanVortexQuantum9911.FrostHunterServiceEliteCelestialThunder1757()) {
            ByteBuffer byteBuffer2 = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
            if (byteBuffer2 != null) {
                FrostHunterLooperThreadBetaHyperionMax1000(byteBuffer2);
                FrostHunterServiceEliteCelestialThunder1757(j);
                return;
            }
            return;
        }
        while (!this.FrostHunterLintTitanVortexQuantum9911.FrostHunterBundlePulseFusionHero2475()) {
            do {
                FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime9984 = this.FrostHunterLintTitanVortexQuantum9911;
                if (frostHunterLightSensorMaxEpicPrime9984.FrostHunterServiceEliteCelestialThunder1757()) {
                    ByteBuffer byteBuffer3 = frostHunterLightSensorMaxEpicPrime9984.FrostHunterBundlePulseFusionHero2475[frostHunterLightSensorMaxEpicPrime9984.FrostHunterConstraintSetCloneMasterUltraRogue2633()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        frostHunterLightSensorMaxEpicPrime9984.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761);
                        byteBuffer = frostHunterLightSensorMaxEpicPrime9984.FrostHunterBundlePulseFusionHero2475[frostHunterLightSensorMaxEpicPrime9984.FrostHunterConstraintSetCloneMasterUltraRogue2633()];
                    }
                } else {
                    byteBuffer = FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterAlphaAnimationNeoCosmos5761;
                }
                if (byteBuffer.hasRemaining()) {
                    FrostHunterLooperThreadBetaHyperionMax1000(byteBuffer);
                    FrostHunterServiceEliteCelestialThunder1757(j);
                } else {
                    ByteBuffer byteBuffer4 = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime99842 = this.FrostHunterLintTitanVortexQuantum9911;
                    ByteBuffer byteBuffer5 = this.FrostHunterTranslateAnimationCyberSolarUltra7101;
                    if (frostHunterLightSensorMaxEpicPrime99842.FrostHunterServiceEliteCelestialThunder1757() && !frostHunterLightSensorMaxEpicPrime99842.FrostHunterServiceEliteCelestialThunder1757) {
                        frostHunterLightSensorMaxEpicPrime99842.FrostHunterLifecycleBlazeGammaElite2889(byteBuffer5);
                    }
                }
            } while (this.FrostHunterMagnetometerFusionTitanium8202 == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterLooperThreadBetaHyperionMax1000(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterMagnetometerFusionTitanium8202 == null);
        if (byteBuffer.hasRemaining()) {
            if (FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                int FrostHunterTranslateAnimationCyberSolarUltra7101 = (int) FrostHunterGyroscopeHeroAlpha1995.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(20L), this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterConstraintSetCloneMasterUltraRogue2633, 1000000L, RoundingMode.UP);
                long FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200();
                long j = FrostHunterTranslateAnimationCyberSolarUltra7101;
                if (FrostHunterAlertDialogAuroraDelta3200 < j) {
                    FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    int i4 = frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761;
                    int i5 = frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterServiceEliteCelestialThunder1757;
                    int i6 = (int) FrostHunterAlertDialogAuroraDelta3200;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < FrostHunterTranslateAnimationCyberSolarUltra7101) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i4 == 4) {
                                float FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (FrostHunterLevelListDrawableFusionDragonHero2232 < 0.0f ? (-FrostHunterLevelListDrawableFusionDragonHero2232) * (-2.1474836E9f) : FrostHunterLevelListDrawableFusionDragonHero2232 * 2.1474836E9f);
                            } else if (i4 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i4 != 22) {
                                if (i4 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i4 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i4 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else if (i4 != 1879048192) {
                                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                                    return;
                                } else {
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else if (i4 == 1610612736) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                } else if (i4 != 1879048192) {
                                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                                    return;
                                } else if (i7 < 0) {
                                    byteBuffer2.putDouble((-i7) / (-2.147483648E9d));
                                } else {
                                    byteBuffer2.putDouble(i7 / 2.147483647E9d);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.FrostHunterMagnetometerFusionTitanium8202 = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.FrostHunterMagnetometerFusionTitanium8202 = byteBuffer2;
        }
    }

    public final boolean FrostHunterMotionSceneAuroraMega2271() {
        FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        return frostHunterConfigurationAlphaDragonQuantum8557 != null && frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlertDialogAuroraDelta3200;
    }

    public final FrostHunterFCMEpicEpic9637 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        FrostHunterFCMEpicEpic9637 frostHunterFCMEpicEpic9637 = new FrostHunterFCMEpicEpic9637(frostHunterFirebaseOlympianMax4818);
        frostHunterFCMEpicEpic9637.FrostHunterConstraintSetCloneMasterUltraRogue2633 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        frostHunterFCMEpicEpic9637.FrostHunterServiceEliteCelestialThunder1757 = this.FrostHunterFlowMaxDragonHero5809 != 0;
        frostHunterFCMEpicEpic9637.FrostHunterBundlePulseFusionHero2475 = this.FrostHunterRewardedAdSpectraElite8288;
        frostHunterFCMEpicEpic9637.FrostHunterLifecycleBlazeGammaElite2889 = this.FrostHunterPagingSourceEclipseDelta8255;
        frostHunterFCMEpicEpic9637.FrostHunterRemoteConfigSpeedSpeed8566 = this.FrostHunterPushNotificationStormTitanGamma8999;
        frostHunterFCMEpicEpic9637.FrostHunterCameraXPixelTurboCosmos9814 = -1;
        frostHunterFCMEpicEpic9637.FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterRemoteConfigThunderShadow4435;
        return new FrostHunterFCMEpicEpic9637(frostHunterFCMEpicEpic9637);
    }

    public final void FrostHunterResourcesTitanHyperVision5823() {
        FrostHunterLevelListDrawableFusionDragonHero2232();
        FrostHunterAnimatorOlympianPhantomElite2405 listIterator = this.FrostHunterRemoteConfigSpeedSpeed8566.listIterator(0);
        while (listIterator.hasNext()) {
            ((FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) listIterator.next()).reset();
        }
        this.FrostHunterLifecycleBlazeGammaElite2889.reset();
        this.FrostHunterLevelListDrawableFusionDragonHero2232.reset();
        FrostHunterLightSensorMaxEpicPrime9984 frostHunterLightSensorMaxEpicPrime9984 = this.FrostHunterLintTitanVortexQuantum9911;
        if (frostHunterLightSensorMaxEpicPrime9984 != null) {
            FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = frostHunterLightSensorMaxEpicPrime9984.FrostHunterAlphaAnimationNeoCosmos5761;
            for (int i = 0; i < frostHunterAlarmManagerHeroTitaniumFusion5758.size(); i++) {
                FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336 frostHunterPaintFlagsDrawFilterSparkSpectraMega2336 = (FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336) frostHunterAlarmManagerHeroTitaniumFusion5758.get(i);
                frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRotateAnimationLegendTitanium3412.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                frostHunterPaintFlagsDrawFilterSparkSpectraMega2336.reset();
            }
            frostHunterLightSensorMaxEpicPrime9984.FrostHunterConstraintSetCloneMasterUltraRogue2633.clear();
            frostHunterLightSensorMaxEpicPrime9984.FrostHunterBundlePulseFusionHero2475 = new ByteBuffer[0];
            FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218 = FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889;
            frostHunterLightSensorMaxEpicPrime9984.FrostHunterServiceEliteCelestialThunder1757 = false;
        }
        this.FrostHunterRewardedAdMasterStrike9463 = false;
        this.FrostHunterAnnotationProcessorSparkEclipse8710 = false;
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059() {
        this.FrostHunterRewardedAdMasterStrike9463 = true;
        if (FrostHunterLightSensorForceFusion4241()) {
            FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
            FrostHunterAssetManagerLegendGamma4159 frostHunterAssetManagerLegendGamma4159 = frostHunterFirestoreVortexBeta2433.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterAssetManagerLegendGamma4159.FrostHunterLooperThreadBetaHyperionMax1000 != -9223372036854775807L) {
                frostHunterAssetManagerLegendGamma4159.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                frostHunterAssetManagerLegendGamma4159.FrostHunterLooperThreadBetaHyperionMax1000 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(SystemClock.elapsedRealtime());
            }
            frostHunterAssetManagerLegendGamma4159.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(frostHunterAssetManagerLegendGamma4159.FrostHunterLifecycleBlazeGammaElite2889, frostHunterAssetManagerLegendGamma4159.FrostHunterAlphaAnimationNeoCosmos5761());
            frostHunterAssetManagerLegendGamma4159.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761(0);
            if (!frostHunterFirestoreVortexBeta2433.FrostHunterKeyframeGammaGamma1197 || frostHunterFirestoreVortexBeta2433.FrostHunterBundlePulseFusionHero2475()) {
                frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761.play();
            }
        }
    }

    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        FrostHunterFirestoreVortexBeta2433 FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947;
        boolean equals;
        LogSessionId unused;
        FrostHunterRoomHeroStormStrike4713 frostHunterRoomHeroStormStrike4713 = this.FrostHunterKeyframeGammaGamma1197;
        if (((Exception) frostHunterRoomHeroStormStrike4713.FrostHunterAlertDialogAuroraDelta3200) != null && (FrostHunterLiveDataBetaLegend3442.get() > 0 || SystemClock.elapsedRealtime() < frostHunterRoomHeroStormStrike4713.FrostHunterFlowMaxDragonHero5809)) {
            return false;
        }
        int i = 1;
        try {
            FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889);
        } catch (FrostHunterGuidelineStormCosmosTitan7688 e) {
            int i2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterLevelListDrawableFusionDragonHero2232;
            while (true) {
                FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum8557 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                if (i2 <= 1000000) {
                    if (!frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterLifecycleBlazeGammaElite2889) {
                        throw e;
                    }
                    this.FrostHunterAnnotationProcessorSparkEclipse8710 = true;
                    throw e;
                }
                int i3 = i2 / 2;
                int i4 = frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterServiceEliteCelestialThunder1757;
                if (i4 == -1) {
                    i4 = 1;
                }
                int i5 = i3 % i4;
                int i6 = i5 != 0 ? (i4 - i5) + i3 : i3;
                FrostHunterDrawableCompatOlympianVortexGamma4702 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterConfigurationAlphaDragonQuantum8557.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232 = i6;
                FrostHunterFilterTurboPixel9595 frostHunterFilterTurboPixel9595 = new FrostHunterFilterTurboPixel9595(FrostHunterAlphaAnimationNeoCosmos5761);
                try {
                    FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFilterTurboPixel9595);
                    FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum85572 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterConfigurationAlphaDragonQuantum8557(frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterBundlePulseFusionHero2475, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterServiceEliteCelestialThunder1757, frostHunterFilterTurboPixel9595, frostHunterConfigurationAlphaDragonQuantum85572.FrostHunterLevelListDrawableFusionDragonHero2232);
                    break;
                } catch (FrostHunterGuidelineStormCosmosTitan7688 e2) {
                    e.addSuppressed(e2);
                    i2 = i6;
                }
            }
        }
        this.FrostHunterTextViewDragonStormMega4297 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterApplicationInfoPhoenixSparkHyperion8666 frostHunterApplicationInfoPhoenixSparkHyperion8666 = new FrostHunterApplicationInfoPhoenixSparkHyperion8666(this, this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889);
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterApplicationInfoPhoenixSparkHyperion8666;
        FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterApplicationInfoPhoenixSparkHyperion8666);
        if (this.FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475()) {
            FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum85573 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            if (frostHunterConfigurationAlphaDragonQuantum85573.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterKeyframeGammaGamma1197) {
                FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
                FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = frostHunterConfigurationAlphaDragonQuantum85573.FrostHunterAlphaAnimationNeoCosmos5761;
                int i7 = frostHunterFirebaseOlympianMax4818.FrostHunterStateCelestialNovaPixel8414;
                int i8 = frostHunterFirebaseOlympianMax4818.FrostHunterMagnetometerFusionTitanium8202;
                if (Build.VERSION.SDK_INT < 29) {
                    frostHunterFirestoreVortexBeta2433.getClass();
                } else {
                    frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761.setOffloadDelayPadding(i7, i8);
                }
            }
        }
        FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterToolbarPixelHyperion1536 != null) {
            FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta24332 = this.FrostHunterTextViewDragonStormMega4297;
            frostHunterFirestoreVortexBeta24332.getClass();
            if (Build.VERSION.SDK_INT >= 31) {
                LogSessionId FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterToolbarPixelHyperion1536.FrostHunterAlphaAnimationNeoCosmos5761();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = FrostHunterAlphaAnimationNeoCosmos57612.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (!equals) {
                    frostHunterFirestoreVortexBeta24332.FrostHunterAlphaAnimationNeoCosmos5761.setLogSessionId(FrostHunterAlphaAnimationNeoCosmos57612);
                }
            }
        }
        if (FrostHunterLightSensorForceFusion4241()) {
            this.FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761.setVolume(this.FrostHunterMediaPlayerCelestialBetaTitan3868);
        }
        this.FrostHunterTransitionListenerPulseVortexCosmos7949.getClass();
        AudioDeviceInfo audioDeviceInfo = this.FrostHunterRewardedAdSpectraElite8288;
        if (audioDeviceInfo != null) {
            this.FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761.setPreferredDevice(audioDeviceInfo);
        }
        this.FrostHunterMeteringPointMegaCyber7955 = true;
        int audioSessionId = this.FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761.getAudioSessionId();
        boolean z = audioSessionId != this.FrostHunterPagingSourceEclipseDelta8255;
        this.FrostHunterPagingSourceEclipseDelta8255 = audioSessionId;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterLightSensorForceFusion4241;
        if (frostHunterSQLiteMasterUltra9956 != null) {
            int i9 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = new FrostHunterRippleDrawableBlazeBetaStorm6320(23);
            FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno9007 = ((FrostHunterViewModelScopeStormSpeedQuantum8589) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809).FrostHunterScrollViewCyberPixel8279;
            Handler handler = frostHunterStorageDeltaInferno9007.FrostHunterAlphaAnimationNeoCosmos5761;
            if (handler != null) {
                handler.post(new FrostHunterBroadcastSparkMegaHyper6224(frostHunterStorageDeltaInferno9007, frostHunterRippleDrawableBlazeBetaStorm6320, 7));
            }
            if (z) {
                this.FrostHunterNavigationMasterMegaMax2752 = true;
                FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum85574 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                FrostHunterDrawableCompatOlympianVortexGamma4702 FrostHunterAlphaAnimationNeoCosmos57613 = frostHunterConfigurationAlphaDragonQuantum85574.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterCameraXPixelTurboCosmos9814 = this.FrostHunterPagingSourceEclipseDelta8255;
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterConfigurationAlphaDragonQuantum8557(frostHunterConfigurationAlphaDragonQuantum85574.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConfigurationAlphaDragonQuantum85574.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterConfigurationAlphaDragonQuantum85574.FrostHunterBundlePulseFusionHero2475, frostHunterConfigurationAlphaDragonQuantum85574.FrostHunterServiceEliteCelestialThunder1757, new FrostHunterFilterTurboPixel9595(FrostHunterAlphaAnimationNeoCosmos57613), frostHunterConfigurationAlphaDragonQuantum85574.FrostHunterLevelListDrawableFusionDragonHero2232);
                FrostHunterConfigurationAlphaDragonQuantum8557 frostHunterConfigurationAlphaDragonQuantum85575 = this.FrostHunterScaleAnimationStrikeSpark5059;
                if (frostHunterConfigurationAlphaDragonQuantum85575 != null) {
                    FrostHunterDrawableCompatOlympianVortexGamma4702 FrostHunterAlphaAnimationNeoCosmos57614 = frostHunterConfigurationAlphaDragonQuantum85575.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterAlphaAnimationNeoCosmos57614.FrostHunterCameraXPixelTurboCosmos9814 = this.FrostHunterPagingSourceEclipseDelta8255;
                    this.FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterConfigurationAlphaDragonQuantum8557(frostHunterConfigurationAlphaDragonQuantum85575.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterConfigurationAlphaDragonQuantum85575.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterConfigurationAlphaDragonQuantum85575.FrostHunterBundlePulseFusionHero2475, frostHunterConfigurationAlphaDragonQuantum85575.FrostHunterServiceEliteCelestialThunder1757, new FrostHunterFilterTurboPixel9595(FrostHunterAlphaAnimationNeoCosmos57614), frostHunterConfigurationAlphaDragonQuantum85575.FrostHunterLevelListDrawableFusionDragonHero2232);
                }
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterLightSensorForceFusion4241;
                int i10 = this.FrostHunterPagingSourceEclipseDelta8255;
                FrostHunterViewModelScopeStormSpeedQuantum8589 frostHunterViewModelScopeStormSpeedQuantum8589 = (FrostHunterViewModelScopeStormSpeedQuantum8589) frostHunterSQLiteMasterUltra99562.FrostHunterFlowMaxDragonHero5809;
                if (Build.VERSION.SDK_INT >= 35 && (frostHunterTraceHyperionAuroraNebula9947 = frostHunterViewModelScopeStormSpeedQuantum8589.FrostHunterActionBarPulseSpectraSolar7310) != null) {
                    frostHunterTraceHyperionAuroraNebula9947.FrostHunterDialogFragmentTurboPhoenixDragon7627(i10);
                }
                FrostHunterStorageDeltaInferno9007 frostHunterStorageDeltaInferno90072 = frostHunterViewModelScopeStormSpeedQuantum8589.FrostHunterScrollViewCyberPixel8279;
                Handler handler2 = frostHunterStorageDeltaInferno90072.FrostHunterAlphaAnimationNeoCosmos5761;
                if (handler2 != null) {
                    handler2.post(new FrostHunterMergeQuantumMega4504(i10, i, frostHunterStorageDeltaInferno90072));
                }
            }
        }
        return true;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(long j) {
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956;
        FrostHunterAnimatorSetEclipseHeroHyperion7191 frostHunterAnimatorSetEclipseHeroHyperion7191;
        if (this.FrostHunterMagnetometerFusionTitanium8202 == null) {
            return;
        }
        FrostHunterRoomHeroStormStrike4713 frostHunterRoomHeroStormStrike4713 = this.FrostHunterFragmentBetaMegaVortex6025;
        if (((Exception) frostHunterRoomHeroStormStrike4713.FrostHunterAlertDialogAuroraDelta3200) != null && (FrostHunterLiveDataBetaLegend3442.get() > 0 || SystemClock.elapsedRealtime() < frostHunterRoomHeroStormStrike4713.FrostHunterFlowMaxDragonHero5809)) {
            return;
        }
        int remaining = this.FrostHunterMagnetometerFusionTitanium8202.remaining();
        try {
            boolean FrostHunterServiceEliteCelestialThunder1757 = this.FrostHunterTextViewDragonStormMega4297.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterStateCelestialNovaPixel8414, j, this.FrostHunterMagnetometerFusionTitanium8202);
            this.FrostHunterConstraintSetCloneOmegaHyperion9304 = SystemClock.elapsedRealtime();
            frostHunterRoomHeroStormStrike4713.FrostHunterAlertDialogAuroraDelta3200 = null;
            frostHunterRoomHeroStormStrike4713.FrostHunterCameraXPixelTurboCosmos9814 = -9223372036854775807L;
            frostHunterRoomHeroStormStrike4713.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
            if (this.FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475()) {
                if (this.FrostHunterDatabaseEliteShadowUltra2452 > 0) {
                    this.FrostHunterPreviewBlazeAurora1020 = false;
                }
                if (this.FrostHunterRewardedAdMasterStrike9463 && (frostHunterSQLiteMasterUltra9956 = this.FrostHunterLightSensorForceFusion4241) != null && !FrostHunterServiceEliteCelestialThunder1757 && !this.FrostHunterPreviewBlazeAurora1020 && (frostHunterAnimatorSetEclipseHeroHyperion7191 = ((FrostHunterViewModelScopeStormSpeedQuantum8589) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809).FrostHunterPermissionInfoAlphaDelta6279) != null) {
                    frostHunterAnimatorSetEclipseHeroHyperion7191.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRunnableCosmosCelestial4235 = true;
                }
            }
            if (FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                this.FrostHunterEditTextPulseHyperion1262 += remaining - this.FrostHunterMagnetometerFusionTitanium8202.remaining();
            }
            if (FrostHunterServiceEliteCelestialThunder1757) {
                if (!FrostHunterConfigurationAlphaDragonQuantum8557.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(this.FrostHunterMagnetometerFusionTitanium8202 == this.FrostHunterTranslateAnimationCyberSolarUltra7101);
                    this.FrostHunterDatabaseEliteShadowUltra2452 = (this.FrostHunterCardViewSpectraCyber7714 * this.FrostHunterStateCelestialNovaPixel8414) + this.FrostHunterDatabaseEliteShadowUltra2452;
                }
                this.FrostHunterMagnetometerFusionTitanium8202 = null;
            }
        } catch (FrostHunterAnalyticsStormPhantom7198 e) {
            boolean z = e.FrostHunterFlowMaxDragonHero5809;
            if (z) {
                if (FrostHunterAlertDialogAuroraDelta3200() <= 0) {
                    if (this.FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475()) {
                        if (this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterLifecycleBlazeGammaElite2889) {
                            this.FrostHunterAnnotationProcessorSparkEclipse8710 = true;
                        }
                    }
                }
                r4 = true;
            }
            FrostHunterWorkManagerHeroNovaXDragon2658 frostHunterWorkManagerHeroNovaXDragon2658 = new FrostHunterWorkManagerHeroNovaXDragon2658(e.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761, r4);
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = this.FrostHunterLightSensorForceFusion4241;
            if (frostHunterSQLiteMasterUltra99562 != null) {
                frostHunterSQLiteMasterUltra99562.FrostHunterLooperHyperionForce4133(frostHunterWorkManagerHeroNovaXDragon2658);
            }
            if (z) {
                throw frostHunterWorkManagerHeroNovaXDragon2658;
            }
            frostHunterRoomHeroStormStrike4713.FrostHunterLifecycleBlazeGammaElite2889(frostHunterWorkManagerHeroNovaXDragon2658);
        }
    }

    public final void FrostHunterTextViewDragonStormMega4297() {
        if (FrostHunterLightSensorForceFusion4241()) {
            FrostHunterFirestoreVortexBeta2433 frostHunterFirestoreVortexBeta2433 = this.FrostHunterTextViewDragonStormMega4297;
            FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381 = this.FrostHunterDialogFragmentTurboPhoenixDragon7627;
            AudioTrack audioTrack = frostHunterFirestoreVortexBeta2433.FrostHunterAlphaAnimationNeoCosmos5761;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCameraThunderEpicBeta3381.FrostHunterAlphaAnimationNeoCosmos5761, 0.1f, frostHunterFirestoreVortexBeta2433.FrostHunterBundlePulseFusionHero2475)).setPitch(FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCameraThunderEpicBeta3381.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to set playback params", e);
            }
            FrostHunterAssetManagerLegendGamma4159 frostHunterAssetManagerLegendGamma4159 = frostHunterFirestoreVortexBeta2433.FrostHunterLevelListDrawableFusionDragonHero2232;
            frostHunterAssetManagerLegendGamma4159.FrostHunterFlowMaxDragonHero5809 = audioTrack.getPlaybackParams().getSpeed();
            frostHunterAssetManagerLegendGamma4159.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761(0);
            frostHunterAssetManagerLegendGamma4159.FrostHunterKeyframeGammaGamma1197 = 0L;
            frostHunterAssetManagerLegendGamma4159.FrostHunterTextViewDragonStormMega4297 = 0;
            frostHunterAssetManagerLegendGamma4159.FrostHunterResourcesTitanHyperVision5823 = 0;
            frostHunterAssetManagerLegendGamma4159.FrostHunterFragmentBetaMegaVortex6025 = 0L;
            frostHunterAssetManagerLegendGamma4159.FrostHunterLooperHyperionForce4133 = -9223372036854775807L;
            frostHunterAssetManagerLegendGamma4159.FrostHunterMeteringPointBetaCyber9571 = -9223372036854775807L;
            PlaybackParams playbackParams = this.FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761.getPlaybackParams();
            this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = new FrostHunterCameraThunderEpicBeta3381(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }
}
