package ru.yandex.video.m3.player;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.tracks.Track;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J'\u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0003H\u0016¢\u0006\u0004\b:\u0010\u0005J\u001f\u0010<\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\u0006\u0010;\u001a\u00020$H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0003H\u0016¢\u0006\u0004\b>\u0010\u0005J\u001d\u0010A\u001a\u00020\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u0002060?H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bG\u0010FJ\u0017\u0010J\u001a\u00020\u00032\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0003H\u0016¢\u0006\u0004\bL\u0010\u0005J\u0017\u0010M\u001a\u00020\u00032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0003H\u0016¢\u0006\u0004\bN\u0010\u0005J\u0017\u0010Q\u001a\u00020\u00032\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0003H\u0016¢\u0006\u0004\bS\u0010\u0005J\u0017\u0010V\u001a\u00020\u00032\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00032\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bX\u0010WJ\u000f\u0010Y\u001a\u00020\u0003H\u0016¢\u0006\u0004\bY\u0010\u0005J\u000f\u0010Z\u001a\u00020\u0003H\u0016¢\u0006\u0004\bZ\u0010\u0005J\u000f\u0010[\u001a\u00020\u0003H\u0016¢\u0006\u0004\b[\u0010\u0005¨\u0006\\À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerObserver;", "", CA20Status.STATUS_CERTIFICATE_H, "Lzy11;", "onLoadingStart", "()V", "onLoadingFinished", "hidedPlayer", "onHidedPlayerReady", "(Ljava/lang/Object;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onFirstFrame", "onReadyForFirstPlayback", "onResumePlayback", "onPausePlayback", "onStopPlayback", "onPlaybackEnded", "", "positionMs", "onPlaybackProgress", "(J)V", "bufferSizeMs", "onBufferSizeChanged", "durationMs", "onContentDurationChanged", "timelineLeftEdgeMs", "onTimelineLeftEdgeChanged", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "", "width", "height", "onVideoSizeChanged", "(II)V", "newPositionMs", "oldPositionMs", "onSeek", "(JJ)V", "", "speed", "", "isUserAction", "onPlaybackSpeedChanged", "(FZ)V", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "(Z)V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "", "adList", "onAdListChanged", "(Ljava/util/List;)V", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdSkipped", "onAdSkipAvailable", "onPlayerReleased", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "onRepeatModeChanged", "(Lru/yandex/video/m3/player/RepeatMode;)V", "onRepeat", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onVideoDataPrepared", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "onEnginePrepared", "onEngineBufferingStart", "onEngineBufferingEnd", "onDrmKeysLoaded", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerObserver<H> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <H> void onAdConfigSet(PlayerObserver<? super H> playerObserver, AdConfig adConfig) {
            PlayerObserver.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static <H> void onAdEnd(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onAdEnd();
        }

        @Deprecated
        public static <H> void onAdError(PlayerObserver<? super H> playerObserver, AdException adException) {
            PlayerObserver.super.onAdError(adException);
        }

        @Deprecated
        public static <H> void onAdListChanged(PlayerObserver<? super H> playerObserver, List<Ad> list) {
            PlayerObserver.super.onAdListChanged(list);
        }

        @Deprecated
        public static <H> void onAdPodEnd(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onAdPodEnd();
        }

        @Deprecated
        public static <H> void onAdPodStart(PlayerObserver<? super H> playerObserver, Ad ad, int i) {
            PlayerObserver.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static <H> void onAdSkipAvailable(PlayerObserver<? super H> playerObserver, Ad ad) {
            PlayerObserver.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static <H> void onAdSkipped(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onAdSkipped();
        }

        @Deprecated
        public static <H> void onAdStart(PlayerObserver<? super H> playerObserver, Ad ad) {
            PlayerObserver.super.onAdStart(ad);
        }

        @Deprecated
        public static <H> void onBufferSizeChanged(PlayerObserver<? super H> playerObserver, long j) {
            PlayerObserver.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static <H> void onContentDurationChanged(PlayerObserver<? super H> playerObserver, long j) {
            PlayerObserver.super.onContentDurationChanged(j);
        }

        @Deprecated
        public static <H> void onDrmKeysLoaded(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static <H> void onEngineBufferingEnd(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static <H> void onEngineBufferingStart(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onEngineBufferingStart();
        }

        @Deprecated
        public static <H> void onEnginePrepared(PlayerObserver<? super H> playerObserver, VideoData videoData) {
            PlayerObserver.super.onEnginePrepared(videoData);
        }

        @Deprecated
        public static <H> void onFirstFrame(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onFirstFrame();
        }

        @Deprecated
        public static <H> void onHidedPlayerReady(PlayerObserver<? super H> playerObserver, H h) {
            PlayerObserver.super.onHidedPlayerReady(h);
        }

        @Deprecated
        public static <H> void onLoadingFinished(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onLoadingFinished();
        }

        @Deprecated
        public static <H> void onLoadingStart(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onLoadingStart();
        }

        @Deprecated
        public static <H> void onPausePlayback(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onPausePlayback();
        }

        @Deprecated
        public static <H> void onPlaybackEnded(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onPlaybackEnded();
        }

        @Deprecated
        public static <H> void onPlaybackError(PlayerObserver<? super H> playerObserver, PlaybackException playbackException) {
            PlayerObserver.super.onPlaybackError(playbackException);
        }

        @Deprecated
        public static <H> void onPlaybackProgress(PlayerObserver<? super H> playerObserver, long j) {
            PlayerObserver.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static <H> void onPlaybackSpeedChanged(PlayerObserver<? super H> playerObserver, float f, boolean z) {
            PlayerObserver.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static <H> void onPlayerReleased(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onPlayerReleased();
        }

        @Deprecated
        public static <H> void onPreparingWithAdConfig(PlayerObserver<? super H> playerObserver, AdConfig adConfig) {
            PlayerObserver.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static <H> void onReadyForFirstPlayback(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static <H> void onRepeat(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onRepeat();
        }

        @Deprecated
        public static <H> void onRepeatModeChanged(PlayerObserver<? super H> playerObserver, RepeatMode repeatMode) {
            PlayerObserver.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static <H> void onResumePlayback(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onResumePlayback();
        }

        @Deprecated
        public static <H> void onSeek(PlayerObserver<? super H> playerObserver, long j, long j2) {
            PlayerObserver.super.onSeek(j, j2);
        }

        @Deprecated
        public static <H> void onStopPlayback(PlayerObserver<? super H> playerObserver) {
            PlayerObserver.super.onStopPlayback();
        }

        @Deprecated
        public static <H> void onTimelineLeftEdgeChanged(PlayerObserver<? super H> playerObserver, long j) {
            PlayerObserver.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static <H> void onTracksChanged(PlayerObserver<? super H> playerObserver, Track track, Track track2, Track track3) {
            PlayerObserver.super.onTracksChanged(track, track2, track3);
        }

        @Deprecated
        public static <H> void onVideoDataPrepared(PlayerObserver<? super H> playerObserver, VideoData videoData) {
            PlayerObserver.super.onVideoDataPrepared(videoData);
        }

        @Deprecated
        public static <H> void onVideoSizeChanged(PlayerObserver<? super H> playerObserver, int i, int i2) {
            PlayerObserver.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static <H> void onWillPlayWhenReadyChanged(PlayerObserver<? super H> playerObserver, boolean z) {
            PlayerObserver.super.onWillPlayWhenReadyChanged(z);
        }
    }

    default void onAdConfigSet(AdConfig adConfig) {
    }

    default void onAdEnd() {
    }

    default void onAdError(AdException exception) {
    }

    default void onAdListChanged(List<Ad> adList) {
    }

    default void onAdPodEnd() {
    }

    default void onAdPodStart(Ad ad, int index) {
    }

    default void onAdSkipAvailable(Ad ad) {
    }

    default void onAdSkipped() {
    }

    default void onAdStart(Ad ad) {
    }

    default void onBufferSizeChanged(long bufferSizeMs) {
    }

    default void onContentDurationChanged(long durationMs) {
    }

    default void onDrmKeysLoaded() {
    }

    default void onEngineBufferingEnd() {
    }

    default void onEngineBufferingStart() {
    }

    default void onEnginePrepared(VideoData videoData) {
    }

    default void onFirstFrame() {
    }

    default void onHidedPlayerReady(H hidedPlayer) {
    }

    default void onLoadingFinished() {
    }

    default void onLoadingStart() {
    }

    default void onPausePlayback() {
    }

    default void onPlaybackEnded() {
    }

    default void onPlaybackError(PlaybackException playbackException) {
    }

    default void onPlaybackProgress(long positionMs) {
    }

    default void onPlaybackSpeedChanged(float speed, boolean isUserAction) {
    }

    default void onPlayerReleased() {
    }

    default void onPreparingWithAdConfig(AdConfig adConfig) {
    }

    default void onReadyForFirstPlayback() {
    }

    default void onRepeat() {
    }

    default void onRepeatModeChanged(RepeatMode repeatMode) {
    }

    default void onResumePlayback() {
    }

    default void onSeek(long newPositionMs, long oldPositionMs) {
    }

    default void onStopPlayback() {
    }

    default void onTimelineLeftEdgeChanged(long timelineLeftEdgeMs) {
    }

    default void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
    }

    default void onVideoDataPrepared(VideoData videoData) {
    }

    default void onVideoSizeChanged(int width, int height) {
    }

    default void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
    }
}
