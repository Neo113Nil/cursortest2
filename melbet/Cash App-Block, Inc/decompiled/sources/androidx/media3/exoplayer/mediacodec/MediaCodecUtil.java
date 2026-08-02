package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.mkv.Sniffer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class MediaCodecUtil {
    public static final HashMap decoderInfosCache = new HashMap();

    public final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z, boolean z2) {
            this.mimeType = str;
            this.secure = z;
            this.tunneling = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((JsonLogicResult$Success$$ExternalSyntheticOutline0.m(31, 31, this.mimeType) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }
    }

    public final class DecoderQueryException extends Exception {
    }

    public interface ScoreProvider {
        int getScore(Object obj);
    }

    public static void applyWorkarounds(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda6(new LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0(), 5));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((MediaCodecInfo) arrayList.get(0)).name)) {
            return;
        }
        arrayList.add((MediaCodecInfo) arrayList.remove(0));
    }

    public static MediaCodecInfo.CodecProfileLevel createCodecProfileLevel(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String getAlternativeCodecMimeType(Format format2) {
        Pair codecProfileAndLevel;
        String str = format2.sampleMimeType;
        String str2 = format2.sampleMimeType;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2)) != null) {
            int intValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                ColorInfo colorInfo = format2.colorInfo;
                if (colorInfo != null && colorInfo.colorTransfer == 6 && colorInfo.colorRange == 1) {
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

    public static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
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

    public static synchronized List getDecoderInfos(String str, boolean z, boolean z2) {
        synchronized (MediaCodecUtil.class) {
            try {
                CodecKey codecKey = new CodecKey(str, z, z2);
                HashMap hashMap = decoderInfosCache;
                List list = (List) hashMap.get(codecKey);
                if (list != null) {
                    return list;
                }
                ArrayList decoderInfosInternal = getDecoderInfosInternal(codecKey, new Sniffer(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    decoderInfosInternal.isEmpty();
                }
                applyWorkarounds(str, decoderInfosInternal);
                ImmutableList copyOf = ImmutableList.copyOf((Collection) decoderInfosInternal);
                hashMap.put(codecKey, copyOf);
                return copyOf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList getDecoderInfosInternal(CodecKey codecKey, Sniffer sniffer) {
        String codecMimeType;
        String str;
        Sniffer sniffer2 = sniffer;
        int i = sniffer2.peekLength;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = codecKey.mimeType;
            boolean z = codecKey.secure;
            if (((android.media.MediaCodecInfo[]) sniffer2.scratch) == null) {
                sniffer2.scratch = new MediaCodecList(i).getCodecInfos();
            }
            int length = ((android.media.MediaCodecInfo[]) sniffer2.scratch).length;
            int i2 = 0;
            while (i2 < length) {
                if (((android.media.MediaCodecInfo[]) sniffer2.scratch) == null) {
                    sniffer2.scratch = new MediaCodecList(i).getCodecInfos();
                }
                android.media.MediaCodecInfo mediaCodecInfo = ((android.media.MediaCodecInfo[]) sniffer2.scratch)[i2];
                if (!mediaCodecInfo.isAlias()) {
                    String name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder() && (codecMimeType = getCodecMimeType(mediaCodecInfo, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(codecMimeType);
                            boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean isFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = codecKey.tunneling;
                            if ((z2 || !isFeatureRequired) && (!z2 || isFeatureSupported)) {
                                boolean isFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean isFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !isFeatureRequired2) && (!z || isFeatureSupported2)) {
                                    str = name;
                                    try {
                                        boolean isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                        boolean isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                                        boolean isVendor = mediaCodecInfo.isVendor();
                                        if (z == isFeatureSupported2) {
                                            arrayList.add(MediaCodecInfo.newInstance(str, str2, codecMimeType, capabilitiesForType, isHardwareAccelerated, isSoftwareOnly, isVendor));
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        Log.e("MediaCodecUtil", "Failed to query codec " + str + " (" + codecMimeType + ")");
                                        throw e;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = name;
                        }
                    }
                }
                i2++;
                sniffer2 = sniffer;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new DecoderQueryException("Failed to query underlying media codecs", e3);
        }
    }

    public static RegularImmutableList getDecoderInfosSoftMatch(LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0, Format format2, boolean z, boolean z2) {
        List decoderInfos = loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0.getDecoderInfos(format2.sampleMimeType, z, z2);
        String alternativeCodecMimeType = getAlternativeCodecMimeType(format2);
        List decoderInfos2 = alternativeCodecMimeType == null ? RegularImmutableList.EMPTY : loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0.getDecoderInfos(alternativeCodecMimeType, z, z2);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(decoderInfos);
        builder.addAll(decoderInfos2);
        return builder.build();
    }
}
