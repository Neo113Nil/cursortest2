package ru.yandex.video.m3.player.ui.debug.internal.providers;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.tracks.Track;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "Lzy11;", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TracksProvider extends PlayerObserver<Object> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(TracksProvider tracksProvider, AdConfig adConfig) {
            TracksProvider.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(TracksProvider tracksProvider) {
            TracksProvider.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(TracksProvider tracksProvider, AdException adException) {
            TracksProvider.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(TracksProvider tracksProvider, List<Ad> list) {
            TracksProvider.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdPodEnd(TracksProvider tracksProvider) {
            TracksProvider.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(TracksProvider tracksProvider, Ad ad, int i) {
            TracksProvider.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(TracksProvider tracksProvider, Ad ad) {
            TracksProvider.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(TracksProvider tracksProvider) {
            TracksProvider.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(TracksProvider tracksProvider, Ad ad) {
            TracksProvider.super.onAdStart(ad);
        }

        @Deprecated
        public static void onBufferSizeChanged(TracksProvider tracksProvider, long j) {
            TracksProvider.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onContentDurationChanged(TracksProvider tracksProvider, long j) {
            TracksProvider.super.onContentDurationChanged(j);
        }

        @Deprecated
        public static void onDrmKeysLoaded(TracksProvider tracksProvider) {
            TracksProvider.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onEngineBufferingEnd(TracksProvider tracksProvider) {
            TracksProvider.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static void onEngineBufferingStart(TracksProvider tracksProvider) {
            TracksProvider.super.onEngineBufferingStart();
        }

        @Deprecated
        public static void onEnginePrepared(TracksProvider tracksProvider, VideoData videoData) {
            TracksProvider.super.onEnginePrepared(videoData);
        }

        @Deprecated
        public static void onFirstFrame(TracksProvider tracksProvider) {
            TracksProvider.super.onFirstFrame();
        }

        @Deprecated
        public static void onHidedPlayerReady(TracksProvider tracksProvider, Object obj) {
            TracksProvider.super.onHidedPlayerReady(obj);
        }

        @Deprecated
        public static void onLoadingFinished(TracksProvider tracksProvider) {
            TracksProvider.super.onLoadingFinished();
        }

        @Deprecated
        public static void onLoadingStart(TracksProvider tracksProvider) {
            TracksProvider.super.onLoadingStart();
        }

        @Deprecated
        public static void onPausePlayback(TracksProvider tracksProvider) {
            TracksProvider.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(TracksProvider tracksProvider) {
            TracksProvider.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackError(TracksProvider tracksProvider, PlaybackException playbackException) {
            TracksProvider.super.onPlaybackError(playbackException);
        }

        @Deprecated
        public static void onPlaybackProgress(TracksProvider tracksProvider, long j) {
            TracksProvider.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(TracksProvider tracksProvider, float f, boolean z) {
            TracksProvider.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPlayerReleased(TracksProvider tracksProvider) {
            TracksProvider.super.onPlayerReleased();
        }

        @Deprecated
        public static void onPreparingWithAdConfig(TracksProvider tracksProvider, AdConfig adConfig) {
            TracksProvider.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(TracksProvider tracksProvider) {
            TracksProvider.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static void onRepeat(TracksProvider tracksProvider) {
            TracksProvider.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(TracksProvider tracksProvider, RepeatMode repeatMode) {
            TracksProvider.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(TracksProvider tracksProvider) {
            TracksProvider.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(TracksProvider tracksProvider, long j, long j2) {
            TracksProvider.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onStopPlayback(TracksProvider tracksProvider) {
            TracksProvider.super.onStopPlayback();
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(TracksProvider tracksProvider, long j) {
            TracksProvider.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onVideoDataPrepared(TracksProvider tracksProvider, VideoData videoData) {
            TracksProvider.super.onVideoDataPrepared(videoData);
        }

        @Deprecated
        public static void onVideoSizeChanged(TracksProvider tracksProvider, int i, int i2) {
            TracksProvider.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(TracksProvider tracksProvider, boolean z) {
            TracksProvider.super.onWillPlayWhenReadyChanged(z);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack);
}
