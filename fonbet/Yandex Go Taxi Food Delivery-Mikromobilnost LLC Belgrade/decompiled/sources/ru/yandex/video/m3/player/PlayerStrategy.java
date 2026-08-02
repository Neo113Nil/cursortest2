package ru.yandex.video.m3.player;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00028\u0000H'¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H&¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H&¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0017H&¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u0017H&¢\u0006\u0004\b%\u0010\u0019J#\u0010'\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H&¢\u0006\u0004\b-\u0010\u0019J\u001f\u00100\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)2\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0017H&¢\u0006\u0004\b2\u0010\u0019J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u000203H&¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\tH&¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\tH&¢\u0006\u0004\b<\u0010=¨\u0006>À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "T", "", "", "contentId", "Ljava/util/concurrent/Future;", "prepareVideoData", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "", "reloadVideoData", "()Z", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "videoData", "Lru/yandex/video/m3/player/tracks/Track;", "prepareTrack", "(Lru/yandex/video/m3/player/PlayerDelegate;Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/data/dto/VideoData;)Lru/yandex/video/m3/player/tracks/Track;", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/data/dto/VideoData;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "Lzy11;", "onResumePlayback", "()V", "onPausePlayback", "", "position", "onPlaybackProgress", "(J)V", "onSeek", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "onBufferingStart", "onBufferingEnd", "userAskedStartPosition", "getStartPosition", "(Ljava/lang/Long;Lru/yandex/video/m3/data/dto/VideoData;)Ljava/lang/Long;", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "url", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "isFullscreen", "onFullscreenInfoUpdated", "(Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerStrategy<T extends VideoData> {
    Long getStartPosition(Long userAskedStartPosition, T videoData);

    void onAdEnd();

    void onAdError(AdException exception);

    void onAdPodEnd();

    void onAdPodStart(Ad ad, int index);

    void onAdStart(Ad ad);

    void onBufferingEnd();

    void onBufferingStart();

    void onFullscreenInfoUpdated(boolean isFullscreen);

    void onNewMediaItem(String url, boolean autoplay);

    void onPausePlayback();

    boolean onPlaybackError(PlaybackException playbackException);

    void onPlaybackProgress(long position);

    void onResumePlayback();

    void onSeek();

    PrepareDrm prepareDrm(T videoData);

    Track prepareTrack(PlayerDelegate<?> playerDelegate, TrackType trackType, T videoData);

    Future<T> prepareVideoData(String contentId);

    boolean reloadVideoData();
}
