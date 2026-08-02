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

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/BufferSizeProvider;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "", "bufferSizeMs", "Lzy11;", "onBufferSizeChanged", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BufferSizeProvider extends PlayerObserver<Object> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(BufferSizeProvider bufferSizeProvider, AdConfig adConfig) {
            BufferSizeProvider.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(BufferSizeProvider bufferSizeProvider, AdException adException) {
            BufferSizeProvider.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(BufferSizeProvider bufferSizeProvider, List<Ad> list) {
            BufferSizeProvider.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdPodEnd(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(BufferSizeProvider bufferSizeProvider, Ad ad, int i) {
            BufferSizeProvider.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(BufferSizeProvider bufferSizeProvider, Ad ad) {
            BufferSizeProvider.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(BufferSizeProvider bufferSizeProvider, Ad ad) {
            BufferSizeProvider.super.onAdStart(ad);
        }

        @Deprecated
        public static void onContentDurationChanged(BufferSizeProvider bufferSizeProvider, long j) {
            BufferSizeProvider.super.onContentDurationChanged(j);
        }

        @Deprecated
        public static void onDrmKeysLoaded(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onEngineBufferingEnd(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static void onEngineBufferingStart(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onEngineBufferingStart();
        }

        @Deprecated
        public static void onEnginePrepared(BufferSizeProvider bufferSizeProvider, VideoData videoData) {
            BufferSizeProvider.super.onEnginePrepared(videoData);
        }

        @Deprecated
        public static void onFirstFrame(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onFirstFrame();
        }

        @Deprecated
        public static void onHidedPlayerReady(BufferSizeProvider bufferSizeProvider, Object obj) {
            BufferSizeProvider.super.onHidedPlayerReady(obj);
        }

        @Deprecated
        public static void onLoadingFinished(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onLoadingFinished();
        }

        @Deprecated
        public static void onLoadingStart(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onLoadingStart();
        }

        @Deprecated
        public static void onPausePlayback(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackError(BufferSizeProvider bufferSizeProvider, PlaybackException playbackException) {
            BufferSizeProvider.super.onPlaybackError(playbackException);
        }

        @Deprecated
        public static void onPlaybackProgress(BufferSizeProvider bufferSizeProvider, long j) {
            BufferSizeProvider.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(BufferSizeProvider bufferSizeProvider, float f, boolean z) {
            BufferSizeProvider.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPlayerReleased(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onPlayerReleased();
        }

        @Deprecated
        public static void onPreparingWithAdConfig(BufferSizeProvider bufferSizeProvider, AdConfig adConfig) {
            BufferSizeProvider.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static void onRepeat(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(BufferSizeProvider bufferSizeProvider, RepeatMode repeatMode) {
            BufferSizeProvider.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(BufferSizeProvider bufferSizeProvider, long j, long j2) {
            BufferSizeProvider.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onStopPlayback(BufferSizeProvider bufferSizeProvider) {
            BufferSizeProvider.super.onStopPlayback();
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(BufferSizeProvider bufferSizeProvider, long j) {
            BufferSizeProvider.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onTracksChanged(BufferSizeProvider bufferSizeProvider, Track track, Track track2, Track track3) {
            BufferSizeProvider.super.onTracksChanged(track, track2, track3);
        }

        @Deprecated
        public static void onVideoDataPrepared(BufferSizeProvider bufferSizeProvider, VideoData videoData) {
            BufferSizeProvider.super.onVideoDataPrepared(videoData);
        }

        @Deprecated
        public static void onVideoSizeChanged(BufferSizeProvider bufferSizeProvider, int i, int i2) {
            BufferSizeProvider.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(BufferSizeProvider bufferSizeProvider, boolean z) {
            BufferSizeProvider.super.onWillPlayWhenReadyChanged(z);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onBufferSizeChanged(long bufferSizeMs);
}
