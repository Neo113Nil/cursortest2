package android.content.Context;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStorageNovaXEliteAurora3066 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterBundlePulseFusionHero2475;
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final boolean FrostHunterFlowMaxDragonHero5809;
    public float FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;
    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public final boolean FrostHunterLifecycleBlazeGammaElite2889;
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public final MediaCodecInfo.CodecCapabilities FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterStorageNovaXEliteAurora3066(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str2;
        this.FrostHunterBundlePulseFusionHero2475 = str3;
        this.FrostHunterServiceEliteCelestialThunder1757 = codecCapabilities;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = z;
        this.FrostHunterLifecycleBlazeGammaElite2889 = z4;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = z5;
        this.FrostHunterCameraXPixelTurboCosmos9814 = z6;
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterAlertDialogAuroraDelta3200(str2);
        this.FrostHunterFragmentBetaMegaVortex6025 = -3.4028235E38f;
        this.FrostHunterAlertDialogAuroraDelta3200 = -1;
        this.FrostHunterKeyframeGammaGamma1197 = -1;
    }

    public static boolean FrostHunterAlphaAnimationNeoCosmos5761(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(i, widthAlignment) * widthAlignment, FrostHunterGyroscopeHeroAlpha1995.FrostHunterLifecycleBlazeGammaElite2889(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static FrostHunterStorageNovaXEliteAurora3066 FrostHunterFlowMaxDragonHero5809(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z5;
        boolean z6;
        boolean z7;
        String str6;
        boolean z8 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z9 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z4 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z5 = z;
                z6 = z2;
                z7 = z3;
                str4 = str2;
                return new FrostHunterStorageNovaXEliteAurora3066(str6, str4, str5, codecCapabilities2, z5, z6, z7, z8, z9, z4);
            }
        }
        z4 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z5 = z;
        z6 = z2;
        z7 = z3;
        str6 = str;
        return new FrostHunterStorageNovaXEliteAurora3066(str6, str4, str5, codecCapabilities2, z5, z6, z7, z8, z9, z4);
    }

    public final boolean FrostHunterBundlePulseFusionHero2475(Context context, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818);
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        String str2 = this.FrostHunterBundlePulseFusionHero2475;
        if (str != null && str.equals("video/mv-hevc")) {
            String FrostHunterKeyframeGammaGamma1197 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197(str2);
            if (!FrostHunterKeyframeGammaGamma1197.equals("video/mv-hevc")) {
                if (FrostHunterKeyframeGammaGamma1197.equals("video/hevc")) {
                    HashMap hashMap = FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterAlphaAnimationNeoCosmos5761;
                    String FrostHunterEditTextPulseHyperion1262 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterEditTextPulseHyperion1262(frostHunterFirebaseOlympianMax4818.FrostHunterCameraXTurboCelestialHero5430);
                    if (FrostHunterEditTextPulseHyperion1262 == null) {
                        FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
                    } else {
                        String trim = FrostHunterEditTextPulseHyperion1262.trim();
                        String str3 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterBundlePulseFusionHero2475(FrostHunterEditTextPulseHyperion1262, trim.split("\\.", -1), frostHunterFirebaseOlympianMax4818.FrostHunterViewPhantomNeo1634);
                    }
                }
            }
            return true;
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
            int intValue = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).intValue();
            int intValue2 = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.second).intValue();
            boolean equals = "video/dolby-vision".equals(str);
            String str4 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (equals) {
                str4.getClass();
                switch (str4) {
                    case "video/av01":
                    case "video/hevc":
                        intValue = 2;
                        break;
                    case "video/avc":
                        intValue = 8;
                        break;
                }
                intValue2 = 0;
            }
            if (this.FrostHunterFlowMaxDragonHero5809 || str4.equals("audio/ac4") || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.FrostHunterServiceEliteCelestialThunder1757;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    int i = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                    codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterConstraintSetCloneMasterUltraRogue2633(1026, i)} : new MediaCodecInfo.CodecProfileLevel[]{FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterConstraintSetCloneMasterUltraRogue2633(257, i), FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterConstraintSetCloneMasterUltraRogue2633(513, i), FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterConstraintSetCloneMasterUltraRogue2633(514, i), FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterConstraintSetCloneMasterUltraRogue2633(1026, i), FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterConstraintSetCloneMasterUltraRogue2633(1028, i)};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                        if ("video/hevc".equals(str4) && 2 == intValue) {
                            String str5 = Build.DEVICE;
                            if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                            }
                        }
                    }
                }
                FrostHunterCameraXPixelTurboCosmos9814("codec.profileLevel, " + frostHunterFirebaseOlympianMax4818.FrostHunterKeyframeGammaGamma1197 + ", " + str2);
                return false;
            }
        }
        return true;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(String str) {
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointBetaCyber9571("NoSupport [" + str + "] [" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", " + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + "] [" + FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761 + "]");
    }

    public final FrostHunterMagnetometerMasterMasterRogue3873 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48182) {
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48183;
        FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax48184;
        int i;
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843 = frostHunterFirebaseOlympianMax4818.FrostHunterViewPhantomNeo1634;
        String str2 = frostHunterFirebaseOlympianMax48182.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion98432 = frostHunterFirebaseOlympianMax48182.FrostHunterViewPhantomNeo1634;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.FrostHunterFlowMaxDragonHero5809) {
            if (frostHunterFirebaseOlympianMax4818.FrostHunterServiceInfoHyperionSparkMax9966 != frostHunterFirebaseOlympianMax48182.FrostHunterServiceInfoHyperionSparkMax9966) {
                i2 |= 1024;
            }
            boolean z = (frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271 == frostHunterFirebaseOlympianMax48182.FrostHunterMotionSceneAuroraMega2271 && frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743 == frostHunterFirebaseOlympianMax48182.FrostHunterBitmapTurboDeltaNebula8743) ? false : true;
            if (!this.FrostHunterLifecycleBlazeGammaElite2889 && z) {
                i2 |= 512;
            }
            if ((!FrostHunterAnimationHeroPixelHyperion9843.FrostHunterLifecycleBlazeGammaElite2889(frostHunterAnimationHeroPixelHyperion9843) || !FrostHunterAnimationHeroPixelHyperion9843.FrostHunterLifecycleBlazeGammaElite2889(frostHunterAnimationHeroPixelHyperion98432)) && !Objects.equals(frostHunterAnimationHeroPixelHyperion9843, frostHunterAnimationHeroPixelHyperion98432)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.FrostHunterAlphaAnimationNeoCosmos5761) && !frostHunterFirebaseOlympianMax4818.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48182)) {
                i2 |= 2;
            }
            int i3 = frostHunterFirebaseOlympianMax4818.FrostHunterDialogFragmentTurboPhoenixDragon7627;
            if (i3 != -1 && (i = frostHunterFirebaseOlympianMax4818.FrostHunterLooperHyperionForce4133) != -1 && i3 == frostHunterFirebaseOlympianMax48182.FrostHunterDialogFragmentTurboPhoenixDragon7627 && i == frostHunterFirebaseOlympianMax48182.FrostHunterLooperHyperionForce4133 && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(frostHunterFirebaseOlympianMax48182.FrostHunterScaleAnimationStrikeSpark5059, "video/dolby-vision")) {
                Pair FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818);
                Pair FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48182);
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633 == null || FrostHunterConstraintSetCloneMasterUltraRogue26332 == null || !((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).equals(FrostHunterConstraintSetCloneMasterUltraRogue26332.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new FrostHunterMagnetometerMasterMasterRogue3873(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax4818, frostHunterFirebaseOlympianMax48182, frostHunterFirebaseOlympianMax4818.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48182) ? 3 : 2, 0);
            }
            frostHunterFirebaseOlympianMax48183 = frostHunterFirebaseOlympianMax4818;
            frostHunterFirebaseOlympianMax48184 = frostHunterFirebaseOlympianMax48182;
        } else {
            frostHunterFirebaseOlympianMax48183 = frostHunterFirebaseOlympianMax4818;
            frostHunterFirebaseOlympianMax48184 = frostHunterFirebaseOlympianMax48182;
            if (frostHunterFirebaseOlympianMax48183.FrostHunterBillingClientFusionVortex9008 != frostHunterFirebaseOlympianMax48184.FrostHunterBillingClientFusionVortex9008) {
                i2 |= 4096;
            }
            if (frostHunterFirebaseOlympianMax48183.FrostHunterMediaPlayerCelestialBetaTitan3868 != frostHunterFirebaseOlympianMax48184.FrostHunterMediaPlayerCelestialBetaTitan3868) {
                i2 |= 8192;
            }
            if (frostHunterFirebaseOlympianMax48183.FrostHunterTranslateAnimationCyberSolarUltra7101 != frostHunterFirebaseOlympianMax48184.FrostHunterTranslateAnimationCyberSolarUltra7101) {
                i2 |= 16384;
            }
            String str3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48183);
                Pair FrostHunterConstraintSetCloneMasterUltraRogue26334 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48184);
                if (FrostHunterConstraintSetCloneMasterUltraRogue26333 != null && FrostHunterConstraintSetCloneMasterUltraRogue26334 != null) {
                    int intValue = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue26333.first).intValue();
                    int intValue2 = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue26334.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new FrostHunterMagnetometerMasterMasterRogue3873(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax48184, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && FrostHunterConstraintSetCloneMasterUltraRogue26333.equals(FrostHunterConstraintSetCloneMasterUltraRogue26334)) {
                        return new FrostHunterMagnetometerMasterMasterRogue3873(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax48184, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new FrostHunterMagnetometerMasterMasterRogue3873(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax48184, 3, 0);
            }
            if (!frostHunterFirebaseOlympianMax48183.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax48184)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new FrostHunterMagnetometerMasterMasterRogue3873(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax48184, 1, 0);
            }
        }
        return new FrostHunterMagnetometerMasterMasterRogue3873(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterFirebaseOlympianMax48183, frostHunterFirebaseOlympianMax48184, 0, i2);
    }

    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        if (this.FrostHunterFlowMaxDragonHero5809) {
            return this.FrostHunterLifecycleBlazeGammaElite2889;
        }
        Pair FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818);
        return FrostHunterConstraintSetCloneMasterUltraRogue2633 != null && ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).intValue() == 42;
    }

    public final boolean FrostHunterLifecycleBlazeGammaElite2889(Context context, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        int i;
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        String str2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if ((!str2.equals(str) && !str2.equals(FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818))) || !FrostHunterBundlePulseFusionHero2475(context, frostHunterFirebaseOlympianMax4818, true) || !FrostHunterServiceEliteCelestialThunder1757(frostHunterFirebaseOlympianMax4818)) {
            return false;
        }
        if (this.FrostHunterFlowMaxDragonHero5809) {
            int i2 = frostHunterFirebaseOlympianMax4818.FrostHunterMotionSceneAuroraMega2271;
            if (i2 > 0 && (i = frostHunterFirebaseOlympianMax4818.FrostHunterBitmapTurboDeltaNebula8743) > 0) {
                return FrostHunterRemoteConfigSpeedSpeed8566(i2, i, frostHunterFirebaseOlympianMax4818.FrostHunterMeteringPointBetaCyber9571);
            }
        } else {
            int i3 = frostHunterFirebaseOlympianMax4818.FrostHunterMediaPlayerCelestialBetaTitan3868;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.FrostHunterServiceEliteCelestialThunder1757;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    FrostHunterCameraXPixelTurboCosmos9814("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    FrostHunterCameraXPixelTurboCosmos9814("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    FrostHunterCameraXPixelTurboCosmos9814("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = frostHunterFirebaseOlympianMax4818.FrostHunterBillingClientFusionVortex9008;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    FrostHunterCameraXPixelTurboCosmos9814("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    FrostHunterCameraXPixelTurboCosmos9814("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("AssumedMaxChannelAdjustment: " + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", [" + maxInputChannelCount + " to " + i5 + "]");
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    FrostHunterCameraXPixelTurboCosmos9814("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r3 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r2 == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566(int i, int i2, double d) {
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.FrostHunterServiceEliteCelestialThunder1757;
        if (codecCapabilities == null) {
            FrostHunterCameraXPixelTurboCosmos9814("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            FrostHunterCameraXPixelTurboCosmos9814("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (i3 >= 29 && (((bool = FrostHunterVectorDrawableForceMax1351.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                FrostHunterTabLayoutGammaPixelForce9969.FrostHunterAlertDialogAuroraDelta3200();
                MediaCodecInfo.VideoCapabilities.PerformancePoint FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterTabLayoutGammaPixelForce9969.FrostHunterLevelListDrawableFusionDragonHero2232(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    covers = FrostHunterTabLayoutGammaPixelForce9969.FrostHunterRemoteConfigSpeedSpeed8566(supportedPerformancePoints.get(i4)).covers(FrostHunterLevelListDrawableFusionDragonHero2232);
                    if (covers) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && FrostHunterVectorDrawableForceMax1351.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 == null) {
                    if (i3 < 37) {
                        int FrostHunterBitmapTurboDeltaNebula8743 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBitmapTurboDeltaNebula8743(true);
                        if (i3 < 35 ? FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBitmapTurboDeltaNebula8743(false) != 2 || FrostHunterBitmapTurboDeltaNebula8743 == 1 : FrostHunterBitmapTurboDeltaNebula8743 == 1) {
                            z = true;
                            FrostHunterVectorDrawableForceMax1351.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    FrostHunterVectorDrawableForceMax1351.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = Boolean.valueOf(z);
                }
                if (c != 2) {
                    if (c == 1) {
                        FrostHunterCameraXPixelTurboCosmos9814("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                        return false;
                    }
                }
                return true;
            }
            c = 0;
            if (c != 2) {
            }
            return true;
        }
        if (!FrostHunterAlphaAnimationNeoCosmos5761(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && FrostHunterAlphaAnimationNeoCosmos5761(videoCapabilities, i2, i, d)) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMeteringPointBetaCyber9571("AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + str + ", " + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + "] [" + FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761 + "]");
                    return true;
                }
            }
            FrostHunterCameraXPixelTurboCosmos9814("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
            return false;
        }
        return true;
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        return (Objects.equals(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059, "audio/flac") && frostHunterFirebaseOlympianMax4818.FrostHunterTranslateAnimationCyberSolarUltra7101 == 22 && Build.VERSION.SDK_INT < 34 && this.FrostHunterAlphaAnimationNeoCosmos5761.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final String toString() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }
}
