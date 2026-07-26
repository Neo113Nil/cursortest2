package android.content.Context;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterOrientationSensorDeltaSolarMaster8286 {
    public static final ArrayList FrostHunterAlphaAnimationNeoCosmos5761 = new ArrayList();
    public static final Pattern FrostHunterConstraintSetCloneMasterUltraRogue2633 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean FrostHunterAlertDialogAuroraDelta3200(String str) {
        return "video".equals(FrostHunterLifecycleBlazeGammaElite2889(str));
    }

    public static boolean FrostHunterAlphaAnimationNeoCosmos5761(String str, String str2) {
        FrostHunterOnPreDrawListenerSpeedVision8868 FrostHunterServiceEliteCelestialThunder1757;
        int FrostHunterAlphaAnimationNeoCosmos57612;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(str2)) != null && (FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761()) != 0 && FrostHunterAlphaAnimationNeoCosmos57612 != 16) {
                }
                break;
        }
        return false;
    }

    public static String FrostHunterBundlePulseFusionHero2475(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean FrostHunterCameraXPixelTurboCosmos9814(String str) {
        return "image".equals(FrostHunterLifecycleBlazeGammaElite2889(str)) || "application/x-image-uri".equals(str);
    }

    public static int FrostHunterConstraintSetCloneMasterUltraRogue2633(String str, String str2) {
        FrostHunterOnPreDrawListenerSpeedVision8868 FrostHunterServiceEliteCelestialThunder1757;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(str2)) == null) {
                    return 0;
                }
                return FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static boolean FrostHunterFlowMaxDragonHero5809(String str) {
        return "text".equals(FrostHunterLifecycleBlazeGammaElite2889(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static String FrostHunterKeyframeGammaGamma1197(String str) {
        String FrostHunterConstraintSetCloneOmegaHyperion9304;
        if (str == null) {
            return null;
        }
        FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(str);
        FrostHunterConstraintSetCloneOmegaHyperion9304.getClass();
        switch (FrostHunterConstraintSetCloneOmegaHyperion9304) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return FrostHunterConstraintSetCloneOmegaHyperion9304;
        }
    }

    public static int FrostHunterLevelListDrawableFusionDragonHero2232(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566(str)) {
            return 1;
        }
        if (FrostHunterAlertDialogAuroraDelta3200(str)) {
            return 2;
        }
        if (FrostHunterFlowMaxDragonHero5809(str)) {
            return 3;
        }
        if (FrostHunterCameraXPixelTurboCosmos9814(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = FrostHunterAlphaAnimationNeoCosmos5761;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
        return 0;
    }

    public static String FrostHunterLifecycleBlazeGammaElite2889(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static boolean FrostHunterRemoteConfigSpeedSpeed8566(String str) {
        return "audio".equals(FrostHunterLifecycleBlazeGammaElite2889(str));
    }

    public static FrostHunterOnPreDrawListenerSpeedVision8868 FrostHunterServiceEliteCelestialThunder1757(String str) {
        Matcher matcher = FrostHunterConstraintSetCloneMasterUltraRogue2633.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            Integer.parseInt(group, 16);
            return new FrostHunterOnPreDrawListenerSpeedVision8868(group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
