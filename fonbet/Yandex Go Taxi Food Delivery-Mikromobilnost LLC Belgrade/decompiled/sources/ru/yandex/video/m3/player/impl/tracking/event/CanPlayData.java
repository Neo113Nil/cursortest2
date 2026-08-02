package ru.yandex.video.m3.player.impl.tracking.event;

import kotlin.Metadata;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.data.dto.PlaybackOptions;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ#\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0010\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/CanPlayData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "videoTrackSelectionType", "Lru/yandex/video/m3/data/TrackSelectionType;", "playbackOptions", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "startFromCacheInfo", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "(Lru/yandex/video/m3/data/TrackSelectionType;Lru/yandex/video/m3/data/dto/PlaybackOptions;Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "audioCachePositionMs", "", "getAudioCachePositionMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "bufferFromCacheMs", "getBufferFromCacheMs", "isManifestFromCache", "", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "preloaderVsid", "", "getPreloaderVsid", "()Ljava/lang/String;", "startPosition", "getStartPosition", "()J", "videoCachePositionMs", "getVideoCachePositionMs", "getVideoTrackSelectionType", "()Lru/yandex/video/m3/data/TrackSelectionType;", "nullableMin", "a", "b", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CanPlayData extends DefaultEventData {
    public static final int $stable = 0;
    private final Long audioCachePositionMs;
    private final Long bufferFromCacheMs;
    private final Boolean isManifestFromCache;
    private final String preloaderVsid;
    private final long startPosition;
    private final Long videoCachePositionMs;
    private final TrackSelectionType videoTrackSelectionType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanPlayData(TrackSelectionType trackSelectionType, PlaybackOptions playbackOptions, StartFromCacheInfo startFromCacheInfo) {
        super(null, 1, null);
        Long nullableMin;
        Long startPosition;
        Long l = null;
        this.videoTrackSelectionType = trackSelectionType;
        long longValue = (playbackOptions == null || (startPosition = playbackOptions.getStartPosition()) == null) ? 0L : startPosition.longValue();
        this.startPosition = longValue;
        this.preloaderVsid = startFromCacheInfo != null ? startFromCacheInfo.getPreloaderVsid() : null;
        this.isManifestFromCache = startFromCacheInfo != null ? startFromCacheInfo.getIsManifestFromCache() : null;
        this.videoCachePositionMs = startFromCacheInfo != null ? startFromCacheInfo.getVideoCachePositionMs() : null;
        this.audioCachePositionMs = startFromCacheInfo != null ? startFromCacheInfo.getAudioCachePositionMs() : null;
        if (startFromCacheInfo != null && (nullableMin = nullableMin(startFromCacheInfo.getVideoCachePositionMs(), startFromCacheInfo.getAudioCachePositionMs())) != null) {
            l = Long.valueOf(nullableMin.longValue() - longValue);
        }
        this.bufferFromCacheMs = l;
    }

    private final Long nullableMin(Long a, Long b) {
        return a == null ? b : (b != null && a.longValue() >= b.longValue()) ? b : a;
    }

    public final Long getAudioCachePositionMs() {
        return this.audioCachePositionMs;
    }

    public final Long getBufferFromCacheMs() {
        return this.bufferFromCacheMs;
    }

    public final String getPreloaderVsid() {
        return this.preloaderVsid;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    public final Long getVideoCachePositionMs() {
        return this.videoCachePositionMs;
    }

    public final TrackSelectionType getVideoTrackSelectionType() {
        return this.videoTrackSelectionType;
    }

    /* renamed from: isManifestFromCache, reason: from getter */
    public final Boolean getIsManifestFromCache() {
        return this.isManifestFromCache;
    }
}
