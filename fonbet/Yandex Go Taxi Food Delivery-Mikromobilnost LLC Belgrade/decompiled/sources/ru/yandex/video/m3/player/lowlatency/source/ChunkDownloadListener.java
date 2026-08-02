package ru.yandex.video.m3.player.lowlatency.source;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\tJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/source/ChunkDownloadListener;", "", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "chunkDownloadBytes", "chunkDownloadTime", "Lzy11;", "flushChunk", "(Lru/yandex/video/m3/player/tracks/TrackType;JJ)V", "segmentBytesDownloaded", "segmentDownloadTime", "flushSegment", "sampleBytes", "sampleTime", "currentTimeMs", "submitPendingSample", "(Lru/yandex/video/m3/player/tracks/TrackType;JJJ)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ChunkDownloadListener {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void flushChunk(ChunkDownloadListener chunkDownloadListener, TrackType trackType, long j, long j2) {
            ChunkDownloadListener.super.flushChunk(trackType, j, j2);
        }

        @Deprecated
        public static void flushSegment(ChunkDownloadListener chunkDownloadListener, TrackType trackType, long j, long j2) {
            ChunkDownloadListener.super.flushSegment(trackType, j, j2);
        }

        @Deprecated
        public static void submitPendingSample(ChunkDownloadListener chunkDownloadListener, TrackType trackType, long j, long j2, long j3) {
            ChunkDownloadListener.super.submitPendingSample(trackType, j, j2, j3);
        }
    }

    default void flushChunk(TrackType trackType, long chunkDownloadBytes, long chunkDownloadTime) {
    }

    default void flushSegment(TrackType trackType, long segmentBytesDownloaded, long segmentDownloadTime) {
    }

    default void submitPendingSample(TrackType trackType, long sampleBytes, long sampleTime, long currentTimeMs) {
    }
}
