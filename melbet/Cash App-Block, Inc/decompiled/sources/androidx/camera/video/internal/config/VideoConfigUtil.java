package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public abstract class VideoConfigUtil {
    public static final LinkedHashMap MIME_TO_DATA_SPACE_MAP;

    static {
        AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace = AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        Pair pair = new Pair(1, autoValue_VideoEncoderDataSpace);
        AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace2 = AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG;
        Pair pair2 = new Pair(2, autoValue_VideoEncoderDataSpace2);
        AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace3 = AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ;
        Pair pair3 = new Pair(4096, autoValue_VideoEncoderDataSpace3);
        Integer valueOf = Integer.valueOf(PKIFailureInfo.certRevoked);
        MIME_TO_DATA_SPACE_MAP = MapsKt__MapsKt.mutableMapOf(new Pair("video/hevc", MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair(valueOf, autoValue_VideoEncoderDataSpace3))), new Pair("video/av01", MapsKt__MapsKt.mapOf(new Pair(1, autoValue_VideoEncoderDataSpace), new Pair(2, autoValue_VideoEncoderDataSpace2), new Pair(4096, autoValue_VideoEncoderDataSpace3), new Pair(valueOf, autoValue_VideoEncoderDataSpace3))), new Pair("video/x-vnd.on2.vp9", MapsKt__MapsKt.mapOf(new Pair(1, autoValue_VideoEncoderDataSpace), new Pair(4, autoValue_VideoEncoderDataSpace2), new Pair(4096, autoValue_VideoEncoderDataSpace3), new Pair(16384, autoValue_VideoEncoderDataSpace3), new Pair(2, autoValue_VideoEncoderDataSpace), new Pair(8, autoValue_VideoEncoderDataSpace2), new Pair(valueOf, autoValue_VideoEncoderDataSpace3), new Pair(32768, autoValue_VideoEncoderDataSpace3))), new Pair("video/dolby-vision", MapsKt__MapsKt.mapOf(new Pair(256, autoValue_VideoEncoderDataSpace2), new Pair(512, AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709))));
    }

    public static AutoValue_VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace(int i, String str) {
        AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace;
        str.getClass();
        Map map = (Map) MIME_TO_DATA_SPACE_MAP.get(str);
        if (map != null && (autoValue_VideoEncoderDataSpace = (AutoValue_VideoEncoderDataSpace) map.get(Integer.valueOf(i))) != null) {
            return autoValue_VideoEncoderDataSpace;
        }
        StringUtilsKt.w("VideoConfigUtil", Recorder$$ExternalSyntheticOutline1.m("Unsupported mime type ", i, str, " or profile level ", ". Data space is unspecified."));
        return AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
    }

    public static CaptureEncodeRates resolveFrameRates$camera_video(VideoSpec videoSpec, Range range) {
        int intValue;
        videoSpec.getClass();
        range.getClass();
        Range range2 = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        if (range.equals(range2)) {
            intValue = 30;
        } else {
            Object upper = range.getUpper();
            upper.getClass();
            intValue = ((Number) upper).intValue();
        }
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(intValue, intValue, "Resolved capture/encode frame rate ", "fps/", "fps, [Expected operating range: ");
        m107m.append(range.equals(range2) ? "<UNSPECIFIED>" : String.valueOf(range));
        m107m.append(']');
        StringUtilsKt.d("VideoConfigUtil", m107m.toString());
        return new CaptureEncodeRates(intValue, intValue);
    }

    public static final VideoMimeInfo resolveVideoMimeInfo(DynamicRange dynamicRange, MediaSpec mediaSpec, AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy) {
        String str;
        mediaSpec.getClass();
        dynamicRange.getClass();
        boolean isFullySpecified = dynamicRange.isFullySpecified();
        int i = dynamicRange.mEncoding;
        if (!isFullySpecified) {
            ZslControlImpl$$ExternalSyntheticLambda1.m("Dynamic range must be a fully specified dynamic range [provided dynamic range: ", 93, dynamicRange);
            return null;
        }
        int i2 = mediaSpec.outputFormat;
        String str2 = i2 == 1 ? "video/x-vnd.on2.vp8" : "video/avc";
        if (autoValue_VideoValidatedEncoderProfilesProxy != null) {
            Set set = (Set) DynamicRangeUtil.DR_TO_VP_FORMAT_MAP.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            set.getClass();
            Set set2 = (Set) DynamicRangeUtil.DR_TO_VP_BIT_DEPTH_MAP.get(Integer.valueOf(dynamicRange.mBitDepth));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            set2.getClass();
            for (AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy : autoValue_VideoValidatedEncoderProfilesProxy.videoProfiles) {
                str = null;
                if (set.contains(Integer.valueOf(autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat)) && set2.contains(Integer.valueOf(autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth))) {
                    String str3 = autoValue_EncoderProfilesProxy_VideoProfileProxy.mediaType;
                    str3.getClass();
                    if (str2.equals(str3)) {
                        StringUtilsKt.d("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + ']');
                    } else if (i2 == -1) {
                        StringUtilsKt.d("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + dynamicRange + ']');
                    }
                    str2 = str3;
                    break;
                }
            }
        }
        str = null;
        autoValue_EncoderProfilesProxy_VideoProfileProxy = null;
        if (autoValue_EncoderProfilesProxy_VideoProfileProxy == null) {
            if (i2 == -1) {
                String str4 = i != 1 ? (i == 3 || i == 4 || i == 5) ? "video/hevc" : i != 6 ? str : "video/dolby-vision" : "video/avc";
                if (str4 == null) {
                    throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
                }
                str2 = str4;
            }
            if (autoValue_VideoValidatedEncoderProfilesProxy == null) {
                StringUtilsKt.d("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + ']');
            } else {
                StringUtilsKt.d("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + ']');
            }
        }
        return new VideoMimeInfo(str2, autoValue_EncoderProfilesProxy_VideoProfileProxy);
    }

    public static final int scaleBitrate(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        String str;
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        int doubleValue = (int) (new Rational(i8, i9).doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        if (StringUtilsKt.isLogLevelEnabled(3, "VideoConfigUtil")) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Base Bitrate(", "bps) * Bit Depth Ratio (", " / ");
            Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, ") * Frame Rate Ratio(", " / ", m107m);
            Recorder$$ExternalSyntheticOutline1.m105m(i5, i6, ") * Width Ratio(", " / ", m107m);
            Recorder$$ExternalSyntheticOutline1.m105m(i7, i8, ") * Height Ratio(", " / ", m107m);
            str = Recorder$$ExternalSyntheticOutline2.m(i9, doubleValue, ") = ", m107m);
        } else {
            str = "";
        }
        StringUtilsKt.d("VideoConfigUtil", str);
        return doubleValue;
    }
}
