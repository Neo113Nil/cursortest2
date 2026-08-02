package ru.yandex.video.m3.debug.model;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.ui.debug.EngineHolder;
import ru.yandex.video.m3.ui.debug.Item;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;
import ru.yandex.video.m3.ui.debug.StartBitrateDataHolder;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b*\b\u0080\b\u0018\u00002\u00020\u0001BÓ\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\t\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\t\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\t\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\t\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\t\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001f\u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010$0\t¢\u0006\u0002\u0010%J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003HÆ\u0003J\u0015\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\tHÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\tHÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\tHÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\tHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020 0\u001fHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0\u001fHÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010$0\tHÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\u0015\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J×\u0002\u0010I\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\t2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\t2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\t2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\t2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010$0\tHÆ\u0001J\u0013\u0010J\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\fHÖ\u0001J\t\u0010M\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010'R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010'R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010$0\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+¨\u0006N"}, d2 = {"Lru/yandex/video/m3/debug/model/ListSdkDebugData;", "", "mediaData", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "visibleMediaData", "currentItems", "Lru/yandex/video/m3/ui/debug/Item;", "preloadData", "", "Lru/yandex/video/m3/ui/debug/PreloadState;", "attachedListPlayerIndex", "", "attachedEnginesData", "Lru/yandex/video/m3/ui/debug/EngineHolder;", "decoderData", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "fatalErrorData", "", "startVideoBitrateData", "Lru/yandex/video/m3/ui/debug/StartBitrateDataHolder;", "speedTelemetry", "Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "isStartFromCache", "", "isOnDemand", "videoTrackData", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "currentBufferSize", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "listBandwidthHistory", "", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "loadedChunksHistory", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "playDelta", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;)V", "getAttachedEnginesData", "()Ljava/util/Map;", "getAttachedListPlayerIndex", "getCurrentBufferSize", "getCurrentItems", "()Ljava/util/List;", "getDecoderData", "getFatalErrorData", "getListBandwidthHistory", "()Ljava/util/Set;", "getLoadedChunksHistory", "getMediaData", "getPlayDelta", "getPreloadData", "getSpeedTelemetry", "getStartVideoBitrateData", "getVideoTrackData", "getVisibleMediaData", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ListSdkDebugData {
    public static final int $stable = 8;
    private final Map<MediaData, EngineHolder> attachedEnginesData;
    private final Map<MediaData, Integer> attachedListPlayerIndex;
    private final Map<MediaData, BufferSize> currentBufferSize;
    private final List<Item> currentItems;
    private final Map<Integer, DecoderEventData> decoderData;
    private final Map<String, Integer> fatalErrorData;
    private final Map<MediaData, Boolean> isOnDemand;
    private final Map<MediaData, Boolean> isStartFromCache;
    private final Set<BandwidthEstimation> listBandwidthHistory;
    private final Set<LoadedChunk> loadedChunksHistory;
    private final List<MediaData> mediaData;
    private final Map<MediaData, Long> playDelta;
    private final Map<MediaData, PreloadState> preloadData;
    private final List<SpeedTelemetry> speedTelemetry;
    private final List<StartBitrateDataHolder> startVideoBitrateData;
    private final Map<MediaData, VideoTrackData> videoTrackData;
    private final List<MediaData> visibleMediaData;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ListSdkDebugData(List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, Map map5, List list4, List list5, Map map6, Map map7, Map map8, Map map9, Set set, Set set2, Map map10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r2, r11, r12, r13, r14, r15 != 0 ? r16 : set, (i & 32768) == 0 ? set2 : r16, (i & 65536) != 0 ? b.f() : map10);
        int i2 = i & 1;
        List list6 = EmptyList.a;
        List list7 = i2 != 0 ? list6 : list;
        List list8 = (i & 2) != 0 ? list6 : list2;
        List list9 = (i & 4) != 0 ? list6 : list3;
        Map f = (i & 8) != 0 ? b.f() : map;
        Map f2 = (i & 16) != 0 ? b.f() : map2;
        Map f3 = (i & 32) != 0 ? b.f() : map3;
        Map f4 = (i & 64) != 0 ? b.f() : map4;
        Map f5 = (i & 128) != 0 ? b.f() : map5;
        List list10 = (i & 256) != 0 ? list6 : list4;
        list6 = (i & 512) == 0 ? list5 : list6;
        Map f6 = (i & 1024) != 0 ? b.f() : map6;
        Map f7 = (i & 2048) != 0 ? b.f() : map7;
        Map f8 = (i & 4096) != 0 ? b.f() : map8;
        Map f9 = (i & 8192) != 0 ? b.f() : map9;
        int i3 = i & 16384;
        Set set3 = EmptySet.a;
    }

    public static /* synthetic */ ListSdkDebugData copy$default(ListSdkDebugData listSdkDebugData, List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, Map map5, List list4, List list5, Map map6, Map map7, Map map8, Map map9, Set set, Set set2, Map map10, int i, Object obj) {
        Map map11;
        Set set3;
        List list6;
        ListSdkDebugData listSdkDebugData2;
        Set set4;
        List list7;
        List list8;
        Map map12;
        Map map13;
        Map map14;
        Map map15;
        Map map16;
        List list9;
        List list10;
        Map map17;
        Map map18;
        Map map19;
        Map map20;
        List list11 = (i & 1) != 0 ? listSdkDebugData.mediaData : list;
        List list12 = (i & 2) != 0 ? listSdkDebugData.visibleMediaData : list2;
        List list13 = (i & 4) != 0 ? listSdkDebugData.currentItems : list3;
        Map map21 = (i & 8) != 0 ? listSdkDebugData.preloadData : map;
        Map map22 = (i & 16) != 0 ? listSdkDebugData.attachedListPlayerIndex : map2;
        Map map23 = (i & 32) != 0 ? listSdkDebugData.attachedEnginesData : map3;
        Map map24 = (i & 64) != 0 ? listSdkDebugData.decoderData : map4;
        Map map25 = (i & 128) != 0 ? listSdkDebugData.fatalErrorData : map5;
        List list14 = (i & 256) != 0 ? listSdkDebugData.startVideoBitrateData : list4;
        List list15 = (i & 512) != 0 ? listSdkDebugData.speedTelemetry : list5;
        Map map26 = (i & 1024) != 0 ? listSdkDebugData.isStartFromCache : map6;
        Map map27 = (i & 2048) != 0 ? listSdkDebugData.isOnDemand : map7;
        Map map28 = (i & 4096) != 0 ? listSdkDebugData.videoTrackData : map8;
        Map map29 = (i & 8192) != 0 ? listSdkDebugData.currentBufferSize : map9;
        List list16 = list11;
        Set set5 = (i & 16384) != 0 ? listSdkDebugData.listBandwidthHistory : set;
        Set set6 = (i & 32768) != 0 ? listSdkDebugData.loadedChunksHistory : set2;
        if ((i & 65536) != 0) {
            set3 = set6;
            map11 = listSdkDebugData.playDelta;
            set4 = set5;
            list7 = list12;
            list8 = list13;
            map12 = map21;
            map13 = map22;
            map14 = map23;
            map15 = map24;
            map16 = map25;
            list9 = list14;
            list10 = list15;
            map17 = map26;
            map18 = map27;
            map19 = map28;
            map20 = map29;
            list6 = list16;
            listSdkDebugData2 = listSdkDebugData;
        } else {
            map11 = map10;
            set3 = set6;
            list6 = list16;
            listSdkDebugData2 = listSdkDebugData;
            set4 = set5;
            list7 = list12;
            list8 = list13;
            map12 = map21;
            map13 = map22;
            map14 = map23;
            map15 = map24;
            map16 = map25;
            list9 = list14;
            list10 = list15;
            map17 = map26;
            map18 = map27;
            map19 = map28;
            map20 = map29;
        }
        return listSdkDebugData2.copy(list6, list7, list8, map12, map13, map14, map15, map16, list9, list10, map17, map18, map19, map20, set4, set3, map11);
    }

    public final List<MediaData> component1() {
        return this.mediaData;
    }

    public final List<SpeedTelemetry> component10() {
        return this.speedTelemetry;
    }

    public final Map<MediaData, Boolean> component11() {
        return this.isStartFromCache;
    }

    public final Map<MediaData, Boolean> component12() {
        return this.isOnDemand;
    }

    public final Map<MediaData, VideoTrackData> component13() {
        return this.videoTrackData;
    }

    public final Map<MediaData, BufferSize> component14() {
        return this.currentBufferSize;
    }

    public final Set<BandwidthEstimation> component15() {
        return this.listBandwidthHistory;
    }

    public final Set<LoadedChunk> component16() {
        return this.loadedChunksHistory;
    }

    public final Map<MediaData, Long> component17() {
        return this.playDelta;
    }

    public final List<MediaData> component2() {
        return this.visibleMediaData;
    }

    public final List<Item> component3() {
        return this.currentItems;
    }

    public final Map<MediaData, PreloadState> component4() {
        return this.preloadData;
    }

    public final Map<MediaData, Integer> component5() {
        return this.attachedListPlayerIndex;
    }

    public final Map<MediaData, EngineHolder> component6() {
        return this.attachedEnginesData;
    }

    public final Map<Integer, DecoderEventData> component7() {
        return this.decoderData;
    }

    public final Map<String, Integer> component8() {
        return this.fatalErrorData;
    }

    public final List<StartBitrateDataHolder> component9() {
        return this.startVideoBitrateData;
    }

    public final ListSdkDebugData copy(List<MediaData> mediaData, List<MediaData> visibleMediaData, List<Item> currentItems, Map<MediaData, ? extends PreloadState> preloadData, Map<MediaData, Integer> attachedListPlayerIndex, Map<MediaData, EngineHolder> attachedEnginesData, Map<Integer, DecoderEventData> decoderData, Map<String, Integer> fatalErrorData, List<StartBitrateDataHolder> startVideoBitrateData, List<SpeedTelemetry> speedTelemetry, Map<MediaData, Boolean> isStartFromCache, Map<MediaData, Boolean> isOnDemand, Map<MediaData, VideoTrackData> videoTrackData, Map<MediaData, BufferSize> currentBufferSize, Set<BandwidthEstimation> listBandwidthHistory, Set<LoadedChunk> loadedChunksHistory, Map<MediaData, Long> playDelta) {
        return new ListSdkDebugData(mediaData, visibleMediaData, currentItems, preloadData, attachedListPlayerIndex, attachedEnginesData, decoderData, fatalErrorData, startVideoBitrateData, speedTelemetry, isStartFromCache, isOnDemand, videoTrackData, currentBufferSize, listBandwidthHistory, loadedChunksHistory, playDelta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListSdkDebugData)) {
            return false;
        }
        ListSdkDebugData listSdkDebugData = (ListSdkDebugData) other;
        return jl40.l(this.mediaData, listSdkDebugData.mediaData) && jl40.l(this.visibleMediaData, listSdkDebugData.visibleMediaData) && jl40.l(this.currentItems, listSdkDebugData.currentItems) && jl40.l(this.preloadData, listSdkDebugData.preloadData) && jl40.l(this.attachedListPlayerIndex, listSdkDebugData.attachedListPlayerIndex) && jl40.l(this.attachedEnginesData, listSdkDebugData.attachedEnginesData) && jl40.l(this.decoderData, listSdkDebugData.decoderData) && jl40.l(this.fatalErrorData, listSdkDebugData.fatalErrorData) && jl40.l(this.startVideoBitrateData, listSdkDebugData.startVideoBitrateData) && jl40.l(this.speedTelemetry, listSdkDebugData.speedTelemetry) && jl40.l(this.isStartFromCache, listSdkDebugData.isStartFromCache) && jl40.l(this.isOnDemand, listSdkDebugData.isOnDemand) && jl40.l(this.videoTrackData, listSdkDebugData.videoTrackData) && jl40.l(this.currentBufferSize, listSdkDebugData.currentBufferSize) && jl40.l(this.listBandwidthHistory, listSdkDebugData.listBandwidthHistory) && jl40.l(this.loadedChunksHistory, listSdkDebugData.loadedChunksHistory) && jl40.l(this.playDelta, listSdkDebugData.playDelta);
    }

    public final Map<MediaData, EngineHolder> getAttachedEnginesData() {
        return this.attachedEnginesData;
    }

    public final Map<MediaData, Integer> getAttachedListPlayerIndex() {
        return this.attachedListPlayerIndex;
    }

    public final Map<MediaData, BufferSize> getCurrentBufferSize() {
        return this.currentBufferSize;
    }

    public final List<Item> getCurrentItems() {
        return this.currentItems;
    }

    public final Map<Integer, DecoderEventData> getDecoderData() {
        return this.decoderData;
    }

    public final Map<String, Integer> getFatalErrorData() {
        return this.fatalErrorData;
    }

    public final Set<BandwidthEstimation> getListBandwidthHistory() {
        return this.listBandwidthHistory;
    }

    public final Set<LoadedChunk> getLoadedChunksHistory() {
        return this.loadedChunksHistory;
    }

    public final List<MediaData> getMediaData() {
        return this.mediaData;
    }

    public final Map<MediaData, Long> getPlayDelta() {
        return this.playDelta;
    }

    public final Map<MediaData, PreloadState> getPreloadData() {
        return this.preloadData;
    }

    public final List<SpeedTelemetry> getSpeedTelemetry() {
        return this.speedTelemetry;
    }

    public final List<StartBitrateDataHolder> getStartVideoBitrateData() {
        return this.startVideoBitrateData;
    }

    public final Map<MediaData, VideoTrackData> getVideoTrackData() {
        return this.videoTrackData;
    }

    public final List<MediaData> getVisibleMediaData() {
        return this.visibleMediaData;
    }

    public int hashCode() {
        return this.playDelta.hashCode() + g8e.e(this.loadedChunksHistory, g8e.e(this.listBandwidthHistory, unr0.d(unr0.d(unr0.d(unr0.d(unr0.c(unr0.c(unr0.d(unr0.d(unr0.d(unr0.d(unr0.d(unr0.c(unr0.c(this.mediaData.hashCode() * 31, 31, this.visibleMediaData), 31, this.currentItems), 31, this.preloadData), 31, this.attachedListPlayerIndex), 31, this.attachedEnginesData), 31, this.decoderData), 31, this.fatalErrorData), 31, this.startVideoBitrateData), 31, this.speedTelemetry), 31, this.isStartFromCache), 31, this.isOnDemand), 31, this.videoTrackData), 31, this.currentBufferSize), 31), 31);
    }

    public final Map<MediaData, Boolean> isOnDemand() {
        return this.isOnDemand;
    }

    public final Map<MediaData, Boolean> isStartFromCache() {
        return this.isStartFromCache;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListSdkDebugData(mediaData=");
        sb.append(this.mediaData);
        sb.append(", visibleMediaData=");
        sb.append(this.visibleMediaData);
        sb.append(", currentItems=");
        sb.append(this.currentItems);
        sb.append(", preloadData=");
        sb.append(this.preloadData);
        sb.append(", attachedListPlayerIndex=");
        sb.append(this.attachedListPlayerIndex);
        sb.append(", attachedEnginesData=");
        sb.append(this.attachedEnginesData);
        sb.append(", decoderData=");
        sb.append(this.decoderData);
        sb.append(", fatalErrorData=");
        sb.append(this.fatalErrorData);
        sb.append(", startVideoBitrateData=");
        sb.append(this.startVideoBitrateData);
        sb.append(", speedTelemetry=");
        sb.append(this.speedTelemetry);
        sb.append(", isStartFromCache=");
        sb.append(this.isStartFromCache);
        sb.append(", isOnDemand=");
        sb.append(this.isOnDemand);
        sb.append(", videoTrackData=");
        sb.append(this.videoTrackData);
        sb.append(", currentBufferSize=");
        sb.append(this.currentBufferSize);
        sb.append(", listBandwidthHistory=");
        sb.append(this.listBandwidthHistory);
        sb.append(", loadedChunksHistory=");
        sb.append(this.loadedChunksHistory);
        sb.append(", playDelta=");
        return smw0.n(sb, this.playDelta, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListSdkDebugData(List<MediaData> list, List<MediaData> list2, List<Item> list3, Map<MediaData, ? extends PreloadState> map, Map<MediaData, Integer> map2, Map<MediaData, EngineHolder> map3, Map<Integer, DecoderEventData> map4, Map<String, Integer> map5, List<StartBitrateDataHolder> list4, List<SpeedTelemetry> list5, Map<MediaData, Boolean> map6, Map<MediaData, Boolean> map7, Map<MediaData, VideoTrackData> map8, Map<MediaData, BufferSize> map9, Set<BandwidthEstimation> set, Set<LoadedChunk> set2, Map<MediaData, Long> map10) {
        this.mediaData = list;
        this.visibleMediaData = list2;
        this.currentItems = list3;
        this.preloadData = map;
        this.attachedListPlayerIndex = map2;
        this.attachedEnginesData = map3;
        this.decoderData = map4;
        this.fatalErrorData = map5;
        this.startVideoBitrateData = list4;
        this.speedTelemetry = list5;
        this.isStartFromCache = map6;
        this.isOnDemand = map7;
        this.videoTrackData = map8;
        this.currentBufferSize = map9;
        this.listBandwidthHistory = set;
        this.loadedChunksHistory = set2;
        this.playDelta = map10;
    }

    public ListSdkDebugData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
