package androidx.media3.common;

import android.text.TextUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Viewport;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class MimeTypes {
    public static final ArrayList customMimeTypes = new ArrayList();
    public static final Pattern MP4A_RFC_6381_CODEC_PATTERN = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean allSamplesAreSyncSamples(String str, String str2) {
        Viewport objectTypeFromMp4aRFC6381CodecString;
        int encoding2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(str2)) != null && (encoding2 = objectTypeFromMp4aRFC6381CodecString.getEncoding()) != 0 && encoding2 != 16) {
                }
                break;
        }
        return false;
    }

    public static int getEncoding(String str, String str2) {
        Viewport objectTypeFromMp4aRFC6381CodecString;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(str2)) == null) {
                    return 0;
                }
                return objectTypeFromMp4aRFC6381CodecString.getEncoding();
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

    public static String getMediaMimeType(String str) {
        Viewport objectTypeFromMp4aRFC6381CodecString;
        String str2 = null;
        if (str != null) {
            String lowerCase = Ascii.toLowerCase(str.trim());
            if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
                return "video/avc";
            }
            if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (lowerCase.startsWith("vvc1") || lowerCase.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1") || lowerCase.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (lowerCase.startsWith("av01")) {
                return "video/av01";
            }
            if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (lowerCase.startsWith("mp4a")) {
                if (lowerCase.startsWith("mp4a.") && (objectTypeFromMp4aRFC6381CodecString = getObjectTypeFromMp4aRFC6381CodecString(lowerCase)) != null) {
                    str2 = getMimeTypeFromMp4ObjectType(objectTypeFromMp4aRFC6381CodecString.width);
                }
                return str2 == null ? "audio/mp4a-latm" : str2;
            }
            if (lowerCase.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (lowerCase.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (lowerCase.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (lowerCase.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (lowerCase.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (lowerCase.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (lowerCase.startsWith("opus")) {
                return "audio/opus";
            }
            if (lowerCase.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (lowerCase.startsWith("flac")) {
                return "audio/flac";
            }
            if (lowerCase.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (lowerCase.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (lowerCase.contains("cea708")) {
                return "application/cea-708";
            }
            if (lowerCase.contains("eia608") || lowerCase.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = customMimeTypes;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
        }
        return null;
    }

    public static String getMimeTypeFromMp4ObjectType(int i) {
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
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return "audio/vnd.dts";
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return "audio/vnd.dts.hd";
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return "audio/opus";
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static Viewport getObjectTypeFromMp4aRFC6381CodecString(String str) {
        Matcher matcher = MP4A_RFC_6381_CODEC_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new Viewport(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String getTopLevelType(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int getTrackType(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (isText(str)) {
            return 3;
        }
        if (isImage(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = customMimeTypes;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        a$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public static boolean isAudio(String str) {
        return "audio".equals(getTopLevelType(str));
    }

    public static boolean isImage(String str) {
        return "image".equals(getTopLevelType(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean isText(String str) {
        return "text".equals(getTopLevelType(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean isVideo(String str) {
        return "video".equals(getTopLevelType(str));
    }

    public static String normalizeMimeType(String str) {
        String lowerCase;
        if (str == null) {
            return null;
        }
        lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
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
                return lowerCase;
        }
    }
}
