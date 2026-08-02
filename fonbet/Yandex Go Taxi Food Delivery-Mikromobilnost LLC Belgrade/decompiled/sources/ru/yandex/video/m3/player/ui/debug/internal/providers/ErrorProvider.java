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

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/ErrorProvider;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lzy11;", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ErrorProvider extends PlayerObserver<Object> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(ErrorProvider errorProvider, AdConfig adConfig) {
            ErrorProvider.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(ErrorProvider errorProvider) {
            ErrorProvider.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(ErrorProvider errorProvider, AdException adException) {
            ErrorProvider.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(ErrorProvider errorProvider, List<Ad> list) {
            ErrorProvider.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdPodEnd(ErrorProvider errorProvider) {
            ErrorProvider.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(ErrorProvider errorProvider, Ad ad, int i) {
            ErrorProvider.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(ErrorProvider errorProvider, Ad ad) {
            ErrorProvider.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(ErrorProvider errorProvider) {
            ErrorProvider.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(ErrorProvider errorProvider, Ad ad) {
            ErrorProvider.super.onAdStart(ad);
        }

        @Deprecated
        public static void onBufferSizeChanged(ErrorProvider errorProvider, long j) {
            ErrorProvider.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onContentDurationChanged(ErrorProvider errorProvider, long j) {
            ErrorProvider.super.onContentDurationChanged(j);
        }

        @Deprecated
        public static void onDrmKeysLoaded(ErrorProvider errorProvider) {
            ErrorProvider.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onEngineBufferingEnd(ErrorProvider errorProvider) {
            ErrorProvider.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static void onEngineBufferingStart(ErrorProvider errorProvider) {
            ErrorProvider.super.onEngineBufferingStart();
        }

        @Deprecated
        public static void onEnginePrepared(ErrorProvider errorProvider, VideoData videoData) {
            ErrorProvider.super.onEnginePrepared(videoData);
        }

        @Deprecated
        public static void onFirstFrame(ErrorProvider errorProvider) {
            ErrorProvider.super.onFirstFrame();
        }

        @Deprecated
        public static void onHidedPlayerReady(ErrorProvider errorProvider, Object obj) {
            ErrorProvider.super.onHidedPlayerReady(obj);
        }

        @Deprecated
        public static void onLoadingFinished(ErrorProvider errorProvider) {
            ErrorProvider.super.onLoadingFinished();
        }

        @Deprecated
        public static void onLoadingStart(ErrorProvider errorProvider) {
            ErrorProvider.super.onLoadingStart();
        }

        @Deprecated
        public static void onPausePlayback(ErrorProvider errorProvider) {
            ErrorProvider.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(ErrorProvider errorProvider) {
            ErrorProvider.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackProgress(ErrorProvider errorProvider, long j) {
            ErrorProvider.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(ErrorProvider errorProvider, float f, boolean z) {
            ErrorProvider.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPlayerReleased(ErrorProvider errorProvider) {
            ErrorProvider.super.onPlayerReleased();
        }

        @Deprecated
        public static void onPreparingWithAdConfig(ErrorProvider errorProvider, AdConfig adConfig) {
            ErrorProvider.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(ErrorProvider errorProvider) {
            ErrorProvider.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static void onRepeat(ErrorProvider errorProvider) {
            ErrorProvider.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(ErrorProvider errorProvider, RepeatMode repeatMode) {
            ErrorProvider.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(ErrorProvider errorProvider) {
            ErrorProvider.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(ErrorProvider errorProvider, long j, long j2) {
            ErrorProvider.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onStopPlayback(ErrorProvider errorProvider) {
            ErrorProvider.super.onStopPlayback();
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(ErrorProvider errorProvider, long j) {
            ErrorProvider.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onTracksChanged(ErrorProvider errorProvider, Track track, Track track2, Track track3) {
            ErrorProvider.super.onTracksChanged(track, track2, track3);
        }

        @Deprecated
        public static void onVideoDataPrepared(ErrorProvider errorProvider, VideoData videoData) {
            ErrorProvider.super.onVideoDataPrepared(videoData);
        }

        @Deprecated
        public static void onVideoSizeChanged(ErrorProvider errorProvider, int i, int i2) {
            ErrorProvider.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(ErrorProvider errorProvider, boolean z) {
            ErrorProvider.super.onWillPlayWhenReadyChanged(z);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onPlaybackError(PlaybackException playbackException);
}
