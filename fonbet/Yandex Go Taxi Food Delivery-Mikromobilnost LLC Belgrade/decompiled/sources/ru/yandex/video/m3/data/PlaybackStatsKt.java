package ru.yandex.video.m3.data;

import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.video.m3.data.PlaybackStats;

@Metadata(d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "bufferedPosition", "liveOffset", "targetLiveOffset", "liveEdgePosition", "", "isInLive", "isPlaying", "playbackPosition", "Lru/yandex/video/m3/data/VideoType;", "videoType", "willPlayWhenReady", "windowDuration", "maxTargetBufferMs", "Lru/yandex/video/m3/data/DrmType;", "drmType", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/PlaybackStats$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/PlaybackStats;", "PlaybackStats", "(JJJJLjava/lang/Boolean;ZJLru/yandex/video/m3/data/VideoType;ZJJLru/yandex/video/m3/data/DrmType;Ltls;)Lru/yandex/video/m3/data/PlaybackStats;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackStatsKt {
    public static final /* synthetic */ PlaybackStats PlaybackStats(long j, long j2, long j3, long j4, Boolean bool, boolean z, long j5, VideoType videoType, boolean z2, long j6, long j7, DrmType drmType, tls tlsVar) {
        PlaybackStats.Builder builder = new PlaybackStats.Builder(j, j2, j3, j4, bool, z, j5, videoType, z2, j6, j7, drmType);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
