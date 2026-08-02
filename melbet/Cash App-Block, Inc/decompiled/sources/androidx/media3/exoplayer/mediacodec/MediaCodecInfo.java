package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil$H265ProfileTierLevel;
import androidx.media3.container.OpusUtil;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.extractor.wav.WavFormat;
import androidx.paging.PagingConfig;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MediaCodecInfo {
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    public final boolean isVideo;
    public float maxFrameRate;
    public int maxFrameRateHeight;
    public int maxFrameRateWidth;
    public final String mimeType;
    public final String name;
    public final boolean secure;

    public MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.name = str;
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z;
        this.adaptive = z4;
        this.secure = z5;
        this.detachedSurfaceSupported = z6;
        this.isVideo = MimeTypes.isVideo(str2);
        this.maxFrameRate = -3.4028235E38f;
        this.maxFrameRateWidth = -1;
        this.maxFrameRateHeight = -1;
    }

    public static boolean areSizeAndRateSupported(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Util.ceilDivide(i, widthAlignment) * widthAlignment, Util.ceilDivide(i2, heightAlignment) * heightAlignment);
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

    public static MediaCodecInfo newInstance(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean isFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
        codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean isFeatureSupported2 = codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str4 = Build.MANUFACTURER;
            if (!str4.equals("Xiaomi") && !str4.equals("OPPO") && !str4.equals("realme") && !str4.equals("motorola") && !str4.equals("LENOVO")) {
                z4 = true;
                return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, isFeatureSupported, isFeatureSupported2, z4);
            }
        }
        z4 = false;
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, isFeatureSupported, isFeatureSupported2, z4);
    }

    public final DecoderReuseEvaluation canReuseCodec(Format format2, Format format3) {
        Format format4;
        Format format5;
        int i;
        String str = format2.sampleMimeType;
        ColorInfo colorInfo = format2.colorInfo;
        String str2 = format3.sampleMimeType;
        ColorInfo colorInfo2 = format3.colorInfo;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.isVideo) {
            if (format2.rotationDegrees != format3.rotationDegrees) {
                i2 |= 1024;
            }
            boolean z = (format2.width == format3.width && format2.height == format3.height) ? false : true;
            if (!this.adaptive && z) {
                i2 |= 512;
            }
            if ((!ColorInfo.isEquivalentToAssumedSdrDefault(colorInfo) || !ColorInfo.isEquivalentToAssumedSdrDefault(colorInfo2)) && !Objects.equals(colorInfo, colorInfo2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.name) && !format2.initializationDataEquals(format3)) {
                i2 |= 2;
            }
            int i3 = format2.decodedWidth;
            if (i3 != -1 && (i = format2.decodedHeight) != -1 && i3 == format3.decodedWidth && i == format3.decodedHeight && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(format3.sampleMimeType, "video/dolby-vision")) {
                Pair codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
                Pair codecProfileAndLevel2 = CodecSpecificDataUtil.getCodecProfileAndLevel(format3);
                if (codecProfileAndLevel == null || codecProfileAndLevel2 == null || !((Integer) codecProfileAndLevel.first).equals(codecProfileAndLevel2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.name, format2, format3, format2.initializationDataEquals(format3) ? 3 : 2, 0);
            }
            format4 = format2;
            format5 = format3;
        } else {
            format4 = format2;
            format5 = format3;
            if (format4.channelCount != format5.channelCount) {
                i2 |= 4096;
            }
            if (format4.sampleRate != format5.sampleRate) {
                i2 |= PKIFailureInfo.certRevoked;
            }
            if (format4.pcmEncoding != format5.pcmEncoding) {
                i2 |= 16384;
            }
            String str3 = this.mimeType;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair codecProfileAndLevel3 = CodecSpecificDataUtil.getCodecProfileAndLevel(format4);
                Pair codecProfileAndLevel4 = CodecSpecificDataUtil.getCodecProfileAndLevel(format5);
                if (codecProfileAndLevel3 != null && codecProfileAndLevel4 != null) {
                    int intValue = ((Integer) codecProfileAndLevel3.first).intValue();
                    int intValue2 = ((Integer) codecProfileAndLevel4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format4, format5, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && codecProfileAndLevel3.equals(codecProfileAndLevel4)) {
                        return new DecoderReuseEvaluation(this.name, format4, format5, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new DecoderReuseEvaluation(this.name, format4, format5, 3, 0);
            }
            if (!format4.initializationDataEquals(format5)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.name, format4, format5, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format4, format5, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isCodecProfileAndLevelSupported(Context context, Format format2, boolean z) {
        Pair pair;
        String str;
        Pair codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
        String str2 = format2.sampleMimeType;
        String str3 = this.codecMimeType;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String normalizeMimeType = MimeTypes.normalizeMimeType(str3);
            if (normalizeMimeType.equals("video/mv-hevc")) {
                return true;
            }
            if (normalizeMimeType.equals("video/hevc")) {
                HashMap hashMap = MediaCodecUtil.decoderInfosCache;
                List list = format2.initializationData;
                int i = 0;
                loop0: while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        ImmutableList.Builder builder = ImmutableList.builder();
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            int findNalUnit = OpusUtil.findNalUnit(bArr, i2, bArr.length, zArr);
                            if (findNalUnit != bArr.length) {
                                builder.m2032add((Object) Integer.valueOf(findNalUnit));
                            }
                            i2 = findNalUnit + 3;
                        }
                        RegularImmutableList build = builder.build();
                        for (int i3 = 0; i3 < build.size; i3++) {
                            if (((Integer) build.get(i3)).intValue() + 3 < length) {
                                WavFormat wavFormat = new WavFormat(bArr, ((Integer) build.get(i3)).intValue() + 3, length);
                                PagingConfig parseH265NalHeader = OpusUtil.parseH265NalHeader(wavFormat);
                                if (parseH265NalHeader.pageSize == 33 && parseH265NalHeader.prefetchDistance == 0) {
                                    wavFormat.skipBits(4);
                                    int readBits = wavFormat.readBits(3);
                                    wavFormat.skipBit();
                                    pair = null;
                                    NalUnitUtil$H265ProfileTierLevel parseH265ProfileTierLevel = OpusUtil.parseH265ProfileTierLevel(wavFormat, true, readBits, null);
                                    str = CodecSpecificDataUtil.buildHevcCodecString(parseH265ProfileTierLevel.generalProfileSpace, parseH265ProfileTierLevel.generalProfileIdc, parseH265ProfileTierLevel.generalProfileCompatibilityFlags, parseH265ProfileTierLevel.constraintBytes, parseH265ProfileTierLevel.generalTierFlag, parseH265ProfileTierLevel.generalLevelIdc);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (str != null) {
                    String trim = str.trim();
                    String str4 = Util.DEVICE_DEBUG_INFO;
                    codecProfileAndLevel = CodecSpecificDataUtil.getHevcProfileAndLevel(str, trim.split("\\.", -1), format2.colorInfo);
                    if (codecProfileAndLevel != null) {
                        return true;
                    }
                    int intValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int intValue2 = ((Integer) codecProfileAndLevel.second).intValue();
                    boolean equals = "video/dolby-vision".equals(str2);
                    String str5 = this.mimeType;
                    if (equals) {
                        str5.getClass();
                        switch (str5) {
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
                    if (!this.isVideo && !str5.equals("audio/ac4") && intValue != 42) {
                        return true;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
                    if (codecProfileLevelArr == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str5.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                        int i4 = (audioCapabilities != null ? audioCapabilities.getMaxInputChannelCount() : 2) > 18 ? 16 : 8;
                        codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO, i4)} : new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, i4), MediaCodecUtil.createCodecProfileLevel(513, i4), MediaCodecUtil.createCodecProfileLevel(514, i4), MediaCodecUtil.createCodecProfileLevel(IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO, i4), MediaCodecUtil.createCodecProfileLevel(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, i4)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                            if (!"video/hevc".equals(str5) || 2 != intValue) {
                                return true;
                            }
                            String str6 = Build.DEVICE;
                            if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                                return true;
                            }
                        }
                    }
                    logNoSupport("codec.profileLevel, " + format2.codecs + ", " + str3);
                    return false;
                }
                codecProfileAndLevel = pair;
            }
        }
        if (codecProfileAndLevel != null) {
        }
    }

    public final boolean isCompressedAudioBitDepthSupported(Format format2) {
        return (Objects.equals(format2.sampleMimeType, "audio/flac") && format2.pcmEncoding == 22 && Build.VERSION.SDK_INT < 34 && this.name.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean isFormatSupported(Context context, Format format2) {
        int i;
        String str = format2.sampleMimeType;
        String str2 = this.mimeType;
        if ((!str2.equals(str) && !str2.equals(MediaCodecUtil.getAlternativeCodecMimeType(format2))) || !isCodecProfileAndLevelSupported(context, format2, true) || !isCompressedAudioBitDepthSupported(format2)) {
            return false;
        }
        if (this.isVideo) {
            int i2 = format2.width;
            if (i2 > 0 && (i = format2.height) > 0) {
                return isVideoSizeAndRateSupportedV21(format2.frameRate, i2, i);
            }
        } else {
            int i3 = format2.sampleRate;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
            if (i3 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    logNoSupport("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    logNoSupport("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = format2.channelCount;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    logNoSupport("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("AssumedMaxChannelAdjustment: ", maxInputChannelCount, this.name, ", [", " to ");
                    m.append(i5);
                    m.append("]");
                    Log.w("MediaCodecInfo", m.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    logNoSupport("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isSeamlessAdaptationSupported(Format format2) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0073, code lost:
    
        if (r5 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isVideoSizeAndRateSupportedV21(double d, int i, int i2) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        char c;
        boolean z;
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.capabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        Boolean bool = zzpd.shouldIgnorePerformancePoints;
        if ((bool == null || !bool.booleanValue()) && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i3 = 0;
            while (true) {
                if (i3 >= supportedPerformancePoints.size()) {
                    c = 1;
                    break;
                }
                if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                    c = 2;
                    break;
                }
                i3++;
            }
            if (c == 1 && zzpd.shouldIgnorePerformancePoints == null) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 37) {
                    int evaluateH264RequiredSupport = zzpc.evaluateH264RequiredSupport(true);
                    if (i4 < 35 ? zzpc.evaluateH264RequiredSupport(false) != 2 || evaluateH264RequiredSupport == 1 : evaluateH264RequiredSupport == 1) {
                        z = true;
                        zzpd.shouldIgnorePerformancePoints = Boolean.valueOf(z);
                    }
                }
                z = false;
                zzpd.shouldIgnorePerformancePoints = Boolean.valueOf(z);
            }
            if (c != 2) {
                if (c == 1) {
                    StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "sizeAndRate.cover, ", "x", "@");
                    m107m.append(d);
                    logNoSupport(m107m.toString());
                    return false;
                }
                if (!areSizeAndRateSupported(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        String str = this.name;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && areSizeAndRateSupported(videoCapabilities, i2, i, d)) {
                            StringBuilder m107m2 = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "sizeAndRate.rotated, ", "x", "@");
                            m107m2.append(d);
                            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssumedSupport [", m107m2.toString(), "] [", str, ", ");
                            m.append(this.mimeType);
                            m.append("] [");
                            m.append(Util.DEVICE_DEBUG_INFO);
                            m.append("]");
                            Log.d("MediaCodecInfo", m.toString());
                            return true;
                        }
                    }
                    StringBuilder m107m3 = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "sizeAndRate.support, ", "x", "@");
                    m107m3.append(d);
                    logNoSupport(m107m3.toString());
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

    public final void logNoSupport(String str) {
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("NoSupport [", str, "] [");
        m3m.append(this.name);
        m3m.append(", ");
        m3m.append(this.mimeType);
        m3m.append("] [");
        m3m.append(Util.DEVICE_DEBUG_INFO);
        m3m.append("]");
        Log.d("MediaCodecInfo", m3m.toString());
    }

    public final String toString() {
        return this.name;
    }
}
