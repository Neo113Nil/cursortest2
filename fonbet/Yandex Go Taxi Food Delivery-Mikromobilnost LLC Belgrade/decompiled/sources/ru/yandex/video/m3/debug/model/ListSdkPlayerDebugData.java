package ru.yandex.video.m3.debug.model;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.ui.debug.EngineHolder;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0006\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0006\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0006HÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0006HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0012HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u00103J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010F\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010H\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0094\u0002\u0010I\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u00062\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00122\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\tHÖ\u0001J\t\u0010N\u001a\u00020OHÖ\u0001R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u001d\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0013\u0010)R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0011\u0010)R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$¨\u0006P"}, d2 = {"Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "", "mediaData", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "preloadData", "", "Lru/yandex/video/m3/ui/debug/PreloadState;", "attachedListPlayerIndex", "", "attachedEnginesData", "Lru/yandex/video/m3/ui/debug/EngineHolder;", "decoderData", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "numOfFatals", "speedTelemetry", "Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "isStartFromCache", "", "isOnDemand", "videoTrackData", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "currentBufferSize", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "listBandwidthHistory", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "loadedChunksHistory", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "activeMediaData", "isCompactView", "playDelta", "", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Lru/yandex/video/m3/ui/debug/SpeedTelemetry;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lru/yandex/video/m3/list_player_manager/model/MediaData;ZLjava/lang/Long;)V", "getActiveMediaData", "()Lru/yandex/video/m3/list_player_manager/model/MediaData;", "getAttachedEnginesData", "()Ljava/util/Map;", "getAttachedListPlayerIndex", "getCurrentBufferSize", "getDecoderData", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getListBandwidthHistory", "()Ljava/util/List;", "getLoadedChunksHistory", "getMediaData", "getNumOfFatals", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlayDelta", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPreloadData", "getSpeedTelemetry", "()Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "getVideoTrackData", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Lru/yandex/video/m3/ui/debug/SpeedTelemetry;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lru/yandex/video/m3/list_player_manager/model/MediaData;ZLjava/lang/Long;)Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "equals", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ListSdkPlayerDebugData {
    public static final int $stable = 0;
    private final MediaData activeMediaData;
    private final Map<MediaData, EngineHolder> attachedEnginesData;
    private final Map<MediaData, Integer> attachedListPlayerIndex;
    private final Map<MediaData, BufferSize> currentBufferSize;
    private final Map<Integer, DecoderEventData> decoderData;
    private final boolean isCompactView;
    private final Boolean isOnDemand;
    private final Boolean isStartFromCache;
    private final List<BandwidthEstimation> listBandwidthHistory;
    private final List<LoadedChunk> loadedChunksHistory;
    private final List<MediaData> mediaData;
    private final Integer numOfFatals;
    private final Long playDelta;
    private final Map<MediaData, PreloadState> preloadData;
    private final SpeedTelemetry speedTelemetry;
    private final Map<MediaData, VideoTrackData> videoTrackData;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ListSdkPlayerDebugData(List list, Map map, Map map2, Map map3, Map map4, Integer num, SpeedTelemetry speedTelemetry, Boolean bool, Boolean bool2, Map map5, Map map6, List list2, List list3, MediaData mediaData, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1 != 0 ? r2 : list, (i & 2) != 0 ? b.f() : map, (i & 4) != 0 ? b.f() : map2, (i & 8) != 0 ? b.f() : map3, (i & 16) != 0 ? b.f() : map4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : speedTelemetry, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? b.f() : map5, (i & 1024) != 0 ? b.f() : map6, (i & 2048) != 0 ? r2 : list2, (i & 4096) == 0 ? list3 : r2, (i & 8192) != 0 ? null : mediaData, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? null : l);
        int i2 = i & 1;
        List list4 = EmptyList.a;
    }

    public final List<MediaData> component1() {
        return this.mediaData;
    }

    public final Map<MediaData, VideoTrackData> component10() {
        return this.videoTrackData;
    }

    public final Map<MediaData, BufferSize> component11() {
        return this.currentBufferSize;
    }

    public final List<BandwidthEstimation> component12() {
        return this.listBandwidthHistory;
    }

    public final List<LoadedChunk> component13() {
        return this.loadedChunksHistory;
    }

    /* renamed from: component14, reason: from getter */
    public final MediaData getActiveMediaData() {
        return this.activeMediaData;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsCompactView() {
        return this.isCompactView;
    }

    /* renamed from: component16, reason: from getter */
    public final Long getPlayDelta() {
        return this.playDelta;
    }

    public final Map<MediaData, PreloadState> component2() {
        return this.preloadData;
    }

    public final Map<MediaData, Integer> component3() {
        return this.attachedListPlayerIndex;
    }

    public final Map<MediaData, EngineHolder> component4() {
        return this.attachedEnginesData;
    }

    public final Map<Integer, DecoderEventData> component5() {
        return this.decoderData;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getNumOfFatals() {
        return this.numOfFatals;
    }

    /* renamed from: component7, reason: from getter */
    public final SpeedTelemetry getSpeedTelemetry() {
        return this.speedTelemetry;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsStartFromCache() {
        return this.isStartFromCache;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsOnDemand() {
        return this.isOnDemand;
    }

    public final ListSdkPlayerDebugData copy(List<MediaData> mediaData, Map<MediaData, ? extends PreloadState> preloadData, Map<MediaData, Integer> attachedListPlayerIndex, Map<MediaData, EngineHolder> attachedEnginesData, Map<Integer, DecoderEventData> decoderData, Integer numOfFatals, SpeedTelemetry speedTelemetry, Boolean isStartFromCache, Boolean isOnDemand, Map<MediaData, VideoTrackData> videoTrackData, Map<MediaData, BufferSize> currentBufferSize, List<BandwidthEstimation> listBandwidthHistory, List<LoadedChunk> loadedChunksHistory, MediaData activeMediaData, boolean isCompactView, Long playDelta) {
        return new ListSdkPlayerDebugData(mediaData, preloadData, attachedListPlayerIndex, attachedEnginesData, decoderData, numOfFatals, speedTelemetry, isStartFromCache, isOnDemand, videoTrackData, currentBufferSize, listBandwidthHistory, loadedChunksHistory, activeMediaData, isCompactView, playDelta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListSdkPlayerDebugData)) {
            return false;
        }
        ListSdkPlayerDebugData listSdkPlayerDebugData = (ListSdkPlayerDebugData) other;
        return jl40.l(this.mediaData, listSdkPlayerDebugData.mediaData) && jl40.l(this.preloadData, listSdkPlayerDebugData.preloadData) && jl40.l(this.attachedListPlayerIndex, listSdkPlayerDebugData.attachedListPlayerIndex) && jl40.l(this.attachedEnginesData, listSdkPlayerDebugData.attachedEnginesData) && jl40.l(this.decoderData, listSdkPlayerDebugData.decoderData) && jl40.l(this.numOfFatals, listSdkPlayerDebugData.numOfFatals) && jl40.l(this.speedTelemetry, listSdkPlayerDebugData.speedTelemetry) && jl40.l(this.isStartFromCache, listSdkPlayerDebugData.isStartFromCache) && jl40.l(this.isOnDemand, listSdkPlayerDebugData.isOnDemand) && jl40.l(this.videoTrackData, listSdkPlayerDebugData.videoTrackData) && jl40.l(this.currentBufferSize, listSdkPlayerDebugData.currentBufferSize) && jl40.l(this.listBandwidthHistory, listSdkPlayerDebugData.listBandwidthHistory) && jl40.l(this.loadedChunksHistory, listSdkPlayerDebugData.loadedChunksHistory) && jl40.l(this.activeMediaData, listSdkPlayerDebugData.activeMediaData) && this.isCompactView == listSdkPlayerDebugData.isCompactView && jl40.l(this.playDelta, listSdkPlayerDebugData.playDelta);
    }

    public final MediaData getActiveMediaData() {
        return this.activeMediaData;
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

    public final Map<Integer, DecoderEventData> getDecoderData() {
        return this.decoderData;
    }

    public final List<BandwidthEstimation> getListBandwidthHistory() {
        return this.listBandwidthHistory;
    }

    public final List<LoadedChunk> getLoadedChunksHistory() {
        return this.loadedChunksHistory;
    }

    public final List<MediaData> getMediaData() {
        return this.mediaData;
    }

    public final Integer getNumOfFatals() {
        return this.numOfFatals;
    }

    public final Long getPlayDelta() {
        return this.playDelta;
    }

    public final Map<MediaData, PreloadState> getPreloadData() {
        return this.preloadData;
    }

    public final SpeedTelemetry getSpeedTelemetry() {
        return this.speedTelemetry;
    }

    public final Map<MediaData, VideoTrackData> getVideoTrackData() {
        return this.videoTrackData;
    }

    public int hashCode() {
        int d = unr0.d(unr0.d(unr0.d(unr0.d(this.mediaData.hashCode() * 31, 31, this.preloadData), 31, this.attachedListPlayerIndex), 31, this.attachedEnginesData), 31, this.decoderData);
        Integer num = this.numOfFatals;
        int hashCode = (d + (num == null ? 0 : num.hashCode())) * 31;
        SpeedTelemetry speedTelemetry = this.speedTelemetry;
        int hashCode2 = (hashCode + (speedTelemetry == null ? 0 : speedTelemetry.hashCode())) * 31;
        Boolean bool = this.isStartFromCache;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOnDemand;
        int c = unr0.c(unr0.c(unr0.d(unr0.d((hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.videoTrackData), 31, this.currentBufferSize), 31, this.listBandwidthHistory), 31, this.loadedChunksHistory);
        MediaData mediaData = this.activeMediaData;
        int e = unr0.e((c + (mediaData == null ? 0 : mediaData.hashCode())) * 31, 31, this.isCompactView);
        Long l = this.playDelta;
        return e + (l != null ? l.hashCode() : 0);
    }

    public final boolean isCompactView() {
        return this.isCompactView;
    }

    public final Boolean isOnDemand() {
        return this.isOnDemand;
    }

    public final Boolean isStartFromCache() {
        return this.isStartFromCache;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListSdkPlayerDebugData(mediaData=");
        sb.append(this.mediaData);
        sb.append(", preloadData=");
        sb.append(this.preloadData);
        sb.append(", attachedListPlayerIndex=");
        sb.append(this.attachedListPlayerIndex);
        sb.append(", attachedEnginesData=");
        sb.append(this.attachedEnginesData);
        sb.append(", decoderData=");
        sb.append(this.decoderData);
        sb.append(", numOfFatals=");
        sb.append(this.numOfFatals);
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
        sb.append(", activeMediaData=");
        sb.append(this.activeMediaData);
        sb.append(", isCompactView=");
        sb.append(this.isCompactView);
        sb.append(", playDelta=");
        return qv10.q(sb, this.playDelta, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListSdkPlayerDebugData(List<MediaData> list, Map<MediaData, ? extends PreloadState> map, Map<MediaData, Integer> map2, Map<MediaData, EngineHolder> map3, Map<Integer, DecoderEventData> map4, Integer num, SpeedTelemetry speedTelemetry, Boolean bool, Boolean bool2, Map<MediaData, VideoTrackData> map5, Map<MediaData, BufferSize> map6, List<BandwidthEstimation> list2, List<LoadedChunk> list3, MediaData mediaData, boolean z, Long l) {
        this.mediaData = list;
        this.preloadData = map;
        this.attachedListPlayerIndex = map2;
        this.attachedEnginesData = map3;
        this.decoderData = map4;
        this.numOfFatals = num;
        this.speedTelemetry = speedTelemetry;
        this.isStartFromCache = bool;
        this.isOnDemand = bool2;
        this.videoTrackData = map5;
        this.currentBufferSize = map6;
        this.listBandwidthHistory = list2;
        this.loadedChunksHistory = list3;
        this.activeMediaData = mediaData;
        this.isCompactView = z;
        this.playDelta = l;
    }

    public ListSdkPlayerDebugData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 65535, null);
    }
}
