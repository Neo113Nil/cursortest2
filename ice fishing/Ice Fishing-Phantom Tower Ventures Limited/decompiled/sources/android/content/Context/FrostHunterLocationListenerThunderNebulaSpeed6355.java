package android.content.Context;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLocationListenerThunderNebulaSpeed6355 {
    public static final HashMap FrostHunterAlphaAnimationNeoCosmos5761 = new HashMap();

    public static void FrostHunterAlphaAnimationNeoCosmos5761(String str, ArrayList arrayList) {
        int i = 1;
        if ("audio/raw".equals(str)) {
            int i2 = 26;
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((FrostHunterStorageNovaXEliteAurora3066) arrayList.get(0)).FrostHunterAlphaAnimationNeoCosmos5761.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(FrostHunterStorageNovaXEliteAurora3066.FrostHunterFlowMaxDragonHero5809("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false));
            }
            Collections.sort(arrayList, new FrostHunterGradleAlphaMasterEclipse2453(i, new FrostHunterVibratorSpectraBetaNovaX4683(i2)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((FrostHunterStorageNovaXEliteAurora3066) arrayList.get(0)).FrostHunterAlphaAnimationNeoCosmos5761)) {
            return;
        }
        arrayList.add((FrostHunterStorageNovaXEliteAurora3066) arrayList.remove(0));
    }

    public static String FrostHunterBundlePulseFusionHero2475(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        Pair FrostHunterConstraintSetCloneMasterUltraRogue2633;
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        String str2 = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTraceVisionNova3975.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818)) != null) {
            int intValue = ((Integer) FrostHunterConstraintSetCloneMasterUltraRogue2633.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843 = frostHunterFirebaseOlympianMax4818.FrostHunterViewPhantomNeo1634;
                if (frostHunterAnimationHeroPixelHyperion9843 != null && frostHunterAnimationHeroPixelHyperion9843.FrostHunterBundlePulseFusionHero2475 == 6 && frostHunterAnimationHeroPixelHyperion9843.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static boolean FrostHunterCameraXPixelTurboCosmos9814(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterRemoteConfigSpeedSpeed8566(str)) {
            return true;
        }
        String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(mediaCodecInfo.getName());
        if (FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("arc.")) {
            return false;
        }
        if (FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("omx.google.") || FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("omx.sec.") && FrostHunterConstraintSetCloneOmegaHyperion9304.contains(".sw.")) || FrostHunterConstraintSetCloneOmegaHyperion9304.equals("omx.qcom.video.decoder.hevcswvdec") || FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("c2.android.") || FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("c2.google.")) {
            return true;
        }
        return (FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("omx.") || FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("c2.")) ? false : true;
    }

    public static MediaCodecInfo.CodecProfileLevel FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static ArrayList FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterHandlerEclipseThunderOmega4230 frostHunterHandlerEclipseThunderOmega4230, FrostHunterNestedScrollViewMaxEpicEpic6844 frostHunterNestedScrollViewMaxEpicEpic6844) {
        String FrostHunterServiceEliteCelestialThunder1757;
        String str;
        int i;
        boolean isAlias;
        FrostHunterHandlerEclipseThunderOmega4230 frostHunterHandlerEclipseThunderOmega42302 = frostHunterHandlerEclipseThunderOmega4230;
        int i2 = frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterFlowMaxDragonHero5809;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = frostHunterHandlerEclipseThunderOmega42302.FrostHunterAlphaAnimationNeoCosmos5761;
            boolean z = frostHunterHandlerEclipseThunderOmega42302.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (((MediaCodecInfo[]) frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200) == null) {
                frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200 = new MediaCodecList(i2).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200).length;
            int i3 = 0;
            while (i3 < length) {
                if (((MediaCodecInfo[]) frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200) == null) {
                    frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200 = new MediaCodecList(i2).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) frostHunterNestedScrollViewMaxEpicEpic6844.FrostHunterAlertDialogAuroraDelta3200)[i3];
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                        i = i3;
                        i3 = i + 1;
                        frostHunterHandlerEclipseThunderOmega42302 = frostHunterHandlerEclipseThunderOmega4230;
                    }
                }
                int i5 = i3;
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder() && (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(mediaCodecInfo, name, str2)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(FrostHunterServiceEliteCelestialThunder1757);
                        boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                        boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                        boolean z2 = frostHunterHandlerEclipseThunderOmega42302.FrostHunterBundlePulseFusionHero2475;
                        if ((z2 || !isFeatureRequired) && (!z2 || isFeatureSupported)) {
                            boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                            boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                            if ((z || !isFeatureRequired2) && (!z || isFeatureSupported2)) {
                                boolean z3 = true;
                                boolean isHardwareAccelerated = i4 >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !FrostHunterCameraXPixelTurboCosmos9814(mediaCodecInfo, str2);
                                i = i5;
                                boolean FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(mediaCodecInfo, str2);
                                boolean z4 = isHardwareAccelerated;
                                if (i4 >= 29) {
                                    z3 = mediaCodecInfo.isVendor();
                                } else {
                                    String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(mediaCodecInfo.getName());
                                    if (FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("omx.google.") || FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("c2.android.") || FrostHunterConstraintSetCloneOmegaHyperion9304.startsWith("c2.google.")) {
                                        z3 = false;
                                    }
                                }
                                if (z != isFeatureSupported2) {
                                    continue;
                                } else {
                                    str = FrostHunterServiceEliteCelestialThunder1757;
                                    try {
                                        arrayList.add(FrostHunterStorageNovaXEliteAurora3066.FrostHunterFlowMaxDragonHero5809(name, str2, str, capabilitiesForType, z4, FrostHunterCameraXPixelTurboCosmos9814, z3));
                                    } catch (Exception e) {
                                        e = e;
                                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterEditTextPulseHyperion1262("Failed to query codec " + name + " (" + str + ")");
                                        throw e;
                                    }
                                }
                                i3 = i + 1;
                                frostHunterHandlerEclipseThunderOmega42302 = frostHunterHandlerEclipseThunderOmega4230;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = FrostHunterServiceEliteCelestialThunder1757;
                    }
                }
                i = i5;
                i3 = i + 1;
                frostHunterHandlerEclipseThunderOmega42302 = frostHunterHandlerEclipseThunderOmega4230;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new FrostHunterStateTitaniumHyperTitanium4233("Failed to query underlying media codecs", e3);
        }
    }

    public static synchronized List FrostHunterLifecycleBlazeGammaElite2889(String str, boolean z, boolean z2) {
        synchronized (FrostHunterLocationListenerThunderNebulaSpeed6355.class) {
            try {
                FrostHunterHandlerEclipseThunderOmega4230 frostHunterHandlerEclipseThunderOmega4230 = new FrostHunterHandlerEclipseThunderOmega4230(str, z, z2);
                HashMap hashMap = FrostHunterAlphaAnimationNeoCosmos5761;
                List list = (List) hashMap.get(frostHunterHandlerEclipseThunderOmega4230);
                if (list != null) {
                    return list;
                }
                ArrayList FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterHandlerEclipseThunderOmega4230, new FrostHunterNestedScrollViewMaxEpicEpic6844(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    FrostHunterLevelListDrawableFusionDragonHero2232.isEmpty();
                }
                FrostHunterAlphaAnimationNeoCosmos5761(str, FrostHunterLevelListDrawableFusionDragonHero2232);
                FrostHunterAlarmManagerHeroTitaniumFusion5758 FrostHunterKeyframeGammaGamma1197 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(FrostHunterLevelListDrawableFusionDragonHero2232);
                hashMap.put(frostHunterHandlerEclipseThunderOmega4230, FrostHunterKeyframeGammaGamma1197);
                return FrostHunterKeyframeGammaGamma1197;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FrostHunterBitmapNeoCosmos7205 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowHyperionVortexDelta5013 frostHunterFlowHyperionVortexDelta5013, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, boolean z, boolean z2) {
        List FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterFlowHyperionVortexDelta5013.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059, z, z2);
        String FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818);
        List FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterBundlePulseFusionHero2475 == null ? FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025 : frostHunterFlowHyperionVortexDelta5013.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero2475, z, z2);
        FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterAlertDialogAuroraDelta3200.FrostHunterBundlePulseFusionHero2475(FrostHunterConstraintSetCloneMasterUltraRogue2633);
        FrostHunterAlertDialogAuroraDelta3200.FrostHunterBundlePulseFusionHero2475(FrostHunterConstraintSetCloneMasterUltraRogue26332);
        return FrostHunterAlertDialogAuroraDelta3200.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    public static String FrostHunterServiceEliteCelestialThunder1757(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }
}
