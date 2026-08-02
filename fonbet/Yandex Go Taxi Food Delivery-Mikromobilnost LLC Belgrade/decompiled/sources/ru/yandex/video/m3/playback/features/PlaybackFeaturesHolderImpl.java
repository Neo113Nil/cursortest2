package ru.yandex.video.m3.playback.features;

import android.content.Context;
import android.graphics.Point;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.y60;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\f¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/playback/features/PlaybackFeaturesHolderImpl;", "Lru/yandex/video/m3/playback/features/PlaybackFeaturesHolder;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "context", "", "calcVideoFormats", "(Landroid/content/Context;)Ljava/lang/String;", "calcHdrModes", "calcVideoCodecs", "()Ljava/lang/String;", "calcAudioCodecs", "", "merge", "(Ljava/util/Collection;)Ljava/lang/String;", "videoFormats$delegate", "Li3y;", "getVideoFormats", "videoFormats", "hdrModes$delegate", "getHdrModes", "hdrModes", "videoCodecs$delegate", "getVideoCodecs", "videoCodecs", "audioCodecs$delegate", "getAudioCodecs", "audioCodecs", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackFeaturesHolderImpl implements PlaybackFeaturesHolder {
    private static final List<String> AUDIO_CODEC_AAC_KEYWORDS;
    private static final String AUDIO_CODEC_AAC_NAME = "AAC";
    private static final List<String> AUDIO_CODEC_AC3_KEYWORDS;
    private static final String AUDIO_CODEC_AC3_NAME = "AC3";
    private static final List<String> AUDIO_CODEC_EAC3_KEYWORDS;
    private static final String AUDIO_CODEC_EAC3_NAME = "EAC3";
    private static final String HDR_MODE_DOLBY_VISION_NAME = "DV";
    private static final String HDR_MODE_HDR10PLUS_NAME = "HDR10Plus";
    private static final String HDR_MODE_HDR10_NAME = "HDR10";
    private static final List<Pair<String, List<String>>> KNOWN_AUDIO_CODECS;
    private static final List<Pair<String, List<String>>> KNOWN_VIDEO_CODECS;
    private static final String SEPARATOR = ",";
    private static final Comparator<Point> SIZE_COMPARATOR;
    private static final String UHD_VIDEO_FORMAT_NAME = "UHD";
    private static final Point UHD_VIDEO_FORMAT_SIZE;
    private static final List<String> VIDEO_CODEC_AVC_KEYWORDS;
    private static final String VIDEO_CODEC_AVC_NAME = "AVC";
    private static final List<String> VIDEO_CODEC_HEVC_KEYWORDS;
    private static final String VIDEO_CODEC_HEVC_NAME = "HEVC";
    private static final List<String> VIDEO_CODEC_VP9_KEYWORDS;
    private static final String VIDEO_CODEC_VP9_NAME = "VP9";
    private static final List<Pair<String, Point>> VIDEO_FORMATS;

    /* renamed from: hdrModes$delegate, reason: from kotlin metadata */
    private final i3y hdrModes;

    /* renamed from: videoFormats$delegate, reason: from kotlin metadata */
    private final i3y videoFormats;
    public static final int $stable = 8;

    /* renamed from: videoCodecs$delegate, reason: from kotlin metadata */
    private final i3y videoCodecs = a.a(new sls() { // from class: ru.yandex.video.m3.playback.features.PlaybackFeaturesHolderImpl$videoCodecs$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final String invoke() {
            String calcVideoCodecs;
            calcVideoCodecs = PlaybackFeaturesHolderImpl.this.calcVideoCodecs();
            return calcVideoCodecs;
        }
    });

    /* renamed from: audioCodecs$delegate, reason: from kotlin metadata */
    private final i3y audioCodecs = a.a(new sls() { // from class: ru.yandex.video.m3.playback.features.PlaybackFeaturesHolderImpl$audioCodecs$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final String invoke() {
            String calcAudioCodecs;
            calcAudioCodecs = PlaybackFeaturesHolderImpl.this.calcAudioCodecs();
            return calcAudioCodecs;
        }
    });

    static {
        Point point = new Point(3840, 2160);
        UHD_VIDEO_FORMAT_SIZE = point;
        VIDEO_FORMATS = Collections.singletonList(new Pair(UHD_VIDEO_FORMAT_NAME, point));
        List<String> g = scc.g("h264", "h.264", "avc");
        VIDEO_CODEC_AVC_KEYWORDS = g;
        List<String> g2 = scc.g("h265", "h.265", "hevc");
        VIDEO_CODEC_HEVC_KEYWORDS = g2;
        List<String> singletonList = Collections.singletonList("vp9");
        VIDEO_CODEC_VP9_KEYWORDS = singletonList;
        KNOWN_VIDEO_CODECS = scc.g(new Pair(VIDEO_CODEC_AVC_NAME, g), new Pair(VIDEO_CODEC_HEVC_NAME, g2), new Pair(VIDEO_CODEC_VP9_NAME, singletonList));
        List<String> g3 = scc.g("aac", "mp4a");
        AUDIO_CODEC_AAC_KEYWORDS = g3;
        List<String> singletonList2 = Collections.singletonList("/ac3");
        AUDIO_CODEC_AC3_KEYWORDS = singletonList2;
        List<String> singletonList3 = Collections.singletonList("eac3");
        AUDIO_CODEC_EAC3_KEYWORDS = singletonList3;
        KNOWN_AUDIO_CODECS = scc.g(new Pair(AUDIO_CODEC_AAC_NAME, g3), new Pair(AUDIO_CODEC_AC3_NAME, singletonList2), new Pair(AUDIO_CODEC_EAC3_NAME, singletonList3));
        SIZE_COMPARATOR = new y60(23);
    }

    public PlaybackFeaturesHolderImpl(final Context context) {
        this.videoFormats = a.a(new sls() { // from class: ru.yandex.video.m3.playback.features.PlaybackFeaturesHolderImpl$videoFormats$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                String calcVideoFormats;
                calcVideoFormats = PlaybackFeaturesHolderImpl.this.calcVideoFormats(context);
                return calcVideoFormats;
            }
        });
        this.hdrModes = a.a(new sls() { // from class: ru.yandex.video.m3.playback.features.PlaybackFeaturesHolderImpl$hdrModes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                String calcHdrModes;
                calcHdrModes = PlaybackFeaturesHolderImpl.this.calcHdrModes(context);
                return calcHdrModes;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SIZE_COMPARATOR$lambda$26(Point point, Point point2) {
        int i = point.x;
        int i2 = point2.x;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = point.y;
        int i4 = point2.y;
        if (i3 > i4) {
            return 1;
        }
        return i3 < i4 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calcAudioCodecs() {
        Object obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, List<AudioCodecInfo>> audioCodecInfos$video_player_internalRelease = CodecsHelper.INSTANCE.getAudioCodecInfos$video_player_internalRelease();
        if (audioCodecInfos$video_player_internalRelease != null) {
            Iterator<Map.Entry<String, List<AudioCodecInfo>>> it = audioCodecInfos$video_player_internalRelease.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                Iterator<T> it2 = KNOWN_AUDIO_CODECS.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    List list = (List) ((Pair) obj).getSecond();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (evu0.y(key, (String) it3.next(), false)) {
                                break;
                            }
                        }
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    linkedHashSet.add((String) pair.getFirst());
                }
            }
        }
        return merge(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calcHdrModes(Context context) {
        Set<Integer> hdrTypes = PlaybackFeaturesKt.getHdrTypes(context);
        if (hdrTypes == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = hdrTypes.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 4 ? null : HDR_MODE_HDR10PLUS_NAME : HDR_MODE_HDR10_NAME : HDR_MODE_DOLBY_VISION_NAME;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return merge(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calcVideoCodecs() {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, List<VideoCodecInfo>> videoCodecInfos$video_player_internalRelease = CodecsHelper.INSTANCE.getVideoCodecInfos$video_player_internalRelease();
        if (videoCodecInfos$video_player_internalRelease != null) {
            for (Map.Entry<String, List<VideoCodecInfo>> entry : videoCodecInfos$video_player_internalRelease.entrySet()) {
                String key = entry.getKey();
                List<VideoCodecInfo> value = entry.getValue();
                Iterator<T> it = KNOWN_VIDEO_CODECS.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    List list = (List) ((Pair) obj).getSecond();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (evu0.y(key, (String) it2.next(), false)) {
                                break;
                            }
                        }
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    String str = (String) pair.getFirst();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : value) {
                        if (((VideoCodecInfo) obj2).getIsSecure()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((VideoCodecInfo) it3.next()).getSize());
                        }
                        Point point = (Point) kotlin.collections.a.f0(arrayList2, SIZE_COMPARATOR);
                        if (point != null) {
                            linkedHashMap.put(str, point);
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it4 = linkedHashMap.entrySet().iterator();
        while (it4.hasNext()) {
            arrayList3.add((Point) ((Map.Entry) it4.next()).getValue());
        }
        Point point2 = (Point) kotlin.collections.a.f0(arrayList3, SIZE_COMPARATOR);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Point point3 = (Point) entry2.getValue();
            if (!jl40.l(point3, point2)) {
                int i = point3.x;
                Point point4 = UHD_VIDEO_FORMAT_SIZE;
                if (i >= point4.x && point3.y >= point4.y) {
                }
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList4.add((String) ((Map.Entry) it5.next()).getKey());
        }
        return kotlin.collections.a.X(arrayList4, ",", null, null, null, 62);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calcVideoFormats(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<DisplayInfo> displayInfos = PlaybackFeaturesKt.getDisplayInfos(context);
        if (displayInfos != null) {
            for (DisplayInfo displayInfo : displayInfos) {
                List<Pair<String, Point>> list = VIDEO_FORMATS;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Point point = (Point) ((Pair) obj).getSecond();
                    if (displayInfo.getSize().x >= point.x && displayInfo.getSize().y >= point.y) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((String) ((Pair) it.next()).getFirst());
                    }
                    linkedHashSet.addAll(arrayList2);
                }
            }
        }
        return merge(linkedHashSet);
    }

    private final String merge(Collection<String> collection) {
        if (collection.isEmpty()) {
            collection = null;
        }
        if (collection != null) {
            return kotlin.collections.a.X(collection, ",", null, null, null, 62);
        }
        return null;
    }

    @Override // ru.yandex.video.m3.playback.features.PlaybackFeaturesHolder
    public String getAudioCodecs() {
        return (String) this.audioCodecs.getValue();
    }

    @Override // ru.yandex.video.m3.playback.features.PlaybackFeaturesHolder
    public String getHdrModes() {
        return (String) this.hdrModes.getValue();
    }

    @Override // ru.yandex.video.m3.playback.features.PlaybackFeaturesHolder
    public String getVideoCodecs() {
        return (String) this.videoCodecs.getValue();
    }

    @Override // ru.yandex.video.m3.playback.features.PlaybackFeaturesHolder
    public String getVideoFormats() {
        return (String) this.videoFormats.getValue();
    }
}
