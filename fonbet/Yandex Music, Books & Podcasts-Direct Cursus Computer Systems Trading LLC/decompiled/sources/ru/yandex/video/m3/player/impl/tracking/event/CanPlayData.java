package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.n0l;
import kotlin.Metadata;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.TrackSelectionType;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010%\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/CanPlayData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "Lru/yandex/video/m3/data/TrackSelectionType;", "videoTrackSelectionType", "Ln0l;", "playbackOptions", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "<init>", "(Lru/yandex/video/m3/data/TrackSelectionType;Ln0l;Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "", "a", "b", "nullableMin", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "Lru/yandex/video/m3/data/TrackSelectionType;", "getVideoTrackSelectionType", "()Lru/yandex/video/m3/data/TrackSelectionType;", "startPosition", "J", "getStartPosition", "()J", "", "preloaderVsid", "Ljava/lang/String;", "getPreloaderVsid", "()Ljava/lang/String;", "", "isManifestFromCache", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "videoCachePositionMs", "Ljava/lang/Long;", "getVideoCachePositionMs", "()Ljava/lang/Long;", "audioCachePositionMs", "getAudioCachePositionMs", "bufferFromCacheMs", "getBufferFromCacheMs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
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
    public CanPlayData(TrackSelectionType trackSelectionType, n0l n0lVar, StartFromCacheInfo startFromCacheInfo) {
        super(null, 1, null);
        Long nullableMin;
        Long g;
        Long l = null;
        this.videoTrackSelectionType = trackSelectionType;
        long longValue = (n0lVar == null || (g = n0lVar.g()) == null) ? 0L : g.longValue();
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
