package ru.yandex.video.m3.playback.features;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import defpackage.h5z0;
import defpackage.i3y;
import defpackage.sls;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a;
import kotlin.collections.b;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0014*\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!R/\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\tR/\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\t¨\u0006*"}, d2 = {"Lru/yandex/video/m3/playback/features/CodecsHelper;", "", "<init>", "()V", "", "", "", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "getVideoCodecInfoInternal", "()Ljava/util/Map;", "Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "getAudioCodecInfoInternal", "Landroid/media/MediaCodecInfo;", "getDecoders", "()Ljava/util/List;", "Landroid/media/MediaCodecInfo$VideoCapabilities;", "Landroid/graphics/Point;", "createPoint", "(Landroid/media/MediaCodecInfo$VideoCapabilities;)Landroid/graphics/Point;", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "", "isSecure", "(Landroid/media/MediaCodecInfo$CodecCapabilities;)Z", "isTunneled", "isHardwareAcceleratedCompat", "(Landroid/media/MediaCodecInfo;)Z", "isSoftwareOnlyCompat", "", "getSupportedInstances", "(Landroid/media/MediaCodecInfo$CodecCapabilities;)I", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "logAvailableCodecs$video_player_internalRelease", "(Lru/yandex/video/m3/player/utils/JsonConverter;)Ljava/lang/String;", "logAvailableCodecs", "videoCodecInfos$delegate", "Li3y;", "getVideoCodecInfos$video_player_internalRelease", "videoCodecInfos", "audioCodecInfos$delegate", "getAudioCodecInfos$video_player_internalRelease", "audioCodecInfos", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecsHelper {
    public static final CodecsHelper INSTANCE = new CodecsHelper();

    /* renamed from: videoCodecInfos$delegate, reason: from kotlin metadata */
    private static final i3y videoCodecInfos = a.a(new sls() { // from class: ru.yandex.video.m3.playback.features.CodecsHelper$videoCodecInfos$2
        @Override // defpackage.sls
        public final Map<String, List<VideoCodecInfo>> invoke() {
            Map<String, List<VideoCodecInfo>> videoCodecInfoInternal;
            videoCodecInfoInternal = CodecsHelper.INSTANCE.getVideoCodecInfoInternal();
            return videoCodecInfoInternal;
        }
    });

    /* renamed from: audioCodecInfos$delegate, reason: from kotlin metadata */
    private static final i3y audioCodecInfos = a.a(new sls() { // from class: ru.yandex.video.m3.playback.features.CodecsHelper$audioCodecInfos$2
        @Override // defpackage.sls
        public final Map<String, List<AudioCodecInfo>> invoke() {
            Map<String, List<AudioCodecInfo>> audioCodecInfoInternal;
            audioCodecInfoInternal = CodecsHelper.INSTANCE.getAudioCodecInfoInternal();
            return audioCodecInfoInternal;
        }
    });
    public static final int $stable = 8;

    private CodecsHelper() {
    }

    private final Point createPoint(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        Integer upper;
        int intValue = videoCapabilities.getSupportedWidths().getUpper().intValue();
        Range<Integer> supportedHeightsFor = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().getUpper().intValue());
        if (supportedHeightsFor == null || (upper = supportedHeightsFor.getUpper()) == null) {
            upper = videoCapabilities.getSupportedHeights().getUpper();
        }
        return new Point(intValue, upper.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<AudioCodecInfo>> getAudioCodecInfoInternal() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<MediaCodecInfo> decoders = getDecoders();
        if (decoders != null) {
            for (MediaCodecInfo mediaCodecInfo : decoders) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && capabilitiesForType.getAudioCapabilities() != null) {
                        List list = (List) linkedHashMap.get(str);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String name = mediaCodecInfo.getName();
                        CodecsHelper codecsHelper = INSTANCE;
                        list.add(AudioCodecInfoKt.AudioCodecInfo$default(name, codecsHelper.isTunneled(capabilitiesForType), codecsHelper.isSecure(capabilitiesForType), codecsHelper.isHardwareAcceleratedCompat(mediaCodecInfo), codecsHelper.getSupportedInstances(capabilitiesForType), null, 32, null));
                        linkedHashMap.put(str, list);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    private final List<MediaCodecInfo> getDecoders() {
        Object failure;
        MediaCodecInfo[] codecInfos;
        try {
            failure = new MediaCodecList(1);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        ArrayList arrayList = null;
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        MediaCodecList mediaCodecList = (MediaCodecList) failure;
        if (mediaCodecList != null && (codecInfos = mediaCodecList.getCodecInfos()) != null) {
            arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder()) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return arrayList;
    }

    private final int getSupportedInstances(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<VideoCodecInfo>> getVideoCodecInfoInternal() {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<MediaCodecInfo> decoders = getDecoders();
        if (decoders != null) {
            for (MediaCodecInfo mediaCodecInfo : decoders) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                        List list = (List) linkedHashMap.get(str);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String name = mediaCodecInfo.getName();
                        CodecsHelper codecsHelper = INSTANCE;
                        list.add(VideoCodecInfoKt.VideoCodecInfo$default(name, codecsHelper.createPoint(videoCapabilities), codecsHelper.isTunneled(capabilitiesForType), codecsHelper.isSecure(capabilitiesForType), codecsHelper.isHardwareAcceleratedCompat(mediaCodecInfo), codecsHelper.getSupportedInstances(capabilitiesForType), null, 64, null));
                        linkedHashMap.put(str, list);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    private final boolean isHardwareAcceleratedCompat(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private final boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final boolean isSoftwareOnlyCompat(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private final boolean isTunneled(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public final Map<String, List<AudioCodecInfo>> getAudioCodecInfos$video_player_internalRelease() {
        return (Map) audioCodecInfos.getValue();
    }

    public final Map<String, List<VideoCodecInfo>> getVideoCodecInfos$video_player_internalRelease() {
        return (Map) videoCodecInfos.getValue();
    }

    public final String logAvailableCodecs$video_player_internalRelease(JsonConverter jsonConverter) {
        Map<String, List<VideoCodecInfo>> videoCodecInfos$video_player_internalRelease = getVideoCodecInfos$video_player_internalRelease();
        if (videoCodecInfos$video_player_internalRelease == null) {
            videoCodecInfos$video_player_internalRelease = b.f();
        }
        Map<String, List<AudioCodecInfo>> audioCodecInfos$video_player_internalRelease = getAudioCodecInfos$video_player_internalRelease();
        if (audioCodecInfos$video_player_internalRelease == null) {
            audioCodecInfos$video_player_internalRelease = b.f();
        }
        try {
            return jsonConverter.to(CodecsInfoKt.CodecsInfo$default(videoCodecInfos$video_player_internalRelease, audioCodecInfos$video_player_internalRelease, null, 4, null));
        } catch (Exception e) {
            h5z0.a.e(e);
            return "{\"serializationFailed\": true}";
        }
    }
}
