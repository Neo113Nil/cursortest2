package ru.yandex.video.m3.player.impl.tracking;

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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/TrackChangesObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "Lzy11;", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackChangesObserver extends PlayerObserver<Object> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(TrackChangesObserver trackChangesObserver, AdConfig adConfig) {
            TrackChangesObserver.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(TrackChangesObserver trackChangesObserver, AdException adException) {
            TrackChangesObserver.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(TrackChangesObserver trackChangesObserver, List<Ad> list) {
            TrackChangesObserver.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdPodEnd(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(TrackChangesObserver trackChangesObserver, Ad ad, int i) {
            TrackChangesObserver.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(TrackChangesObserver trackChangesObserver, Ad ad) {
            TrackChangesObserver.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(TrackChangesObserver trackChangesObserver, Ad ad) {
            TrackChangesObserver.super.onAdStart(ad);
        }

        @Deprecated
        public static void onBufferSizeChanged(TrackChangesObserver trackChangesObserver, long j) {
            TrackChangesObserver.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onContentDurationChanged(TrackChangesObserver trackChangesObserver, long j) {
            TrackChangesObserver.super.onContentDurationChanged(j);
        }

        @Deprecated
        public static void onDrmKeysLoaded(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onEngineBufferingEnd(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static void onEngineBufferingStart(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onEngineBufferingStart();
        }

        @Deprecated
        public static void onEnginePrepared(TrackChangesObserver trackChangesObserver, VideoData videoData) {
            TrackChangesObserver.super.onEnginePrepared(videoData);
        }

        @Deprecated
        public static void onFirstFrame(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onFirstFrame();
        }

        @Deprecated
        public static void onHidedPlayerReady(TrackChangesObserver trackChangesObserver, Object obj) {
            TrackChangesObserver.super.onHidedPlayerReady(obj);
        }

        @Deprecated
        public static void onLoadingFinished(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onLoadingFinished();
        }

        @Deprecated
        public static void onLoadingStart(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onLoadingStart();
        }

        @Deprecated
        public static void onPausePlayback(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackError(TrackChangesObserver trackChangesObserver, PlaybackException playbackException) {
            TrackChangesObserver.super.onPlaybackError(playbackException);
        }

        @Deprecated
        public static void onPlaybackProgress(TrackChangesObserver trackChangesObserver, long j) {
            TrackChangesObserver.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(TrackChangesObserver trackChangesObserver, float f, boolean z) {
            TrackChangesObserver.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPlayerReleased(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onPlayerReleased();
        }

        @Deprecated
        public static void onPreparingWithAdConfig(TrackChangesObserver trackChangesObserver, AdConfig adConfig) {
            TrackChangesObserver.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static void onRepeat(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(TrackChangesObserver trackChangesObserver, RepeatMode repeatMode) {
            TrackChangesObserver.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(TrackChangesObserver trackChangesObserver, long j, long j2) {
            TrackChangesObserver.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onStopPlayback(TrackChangesObserver trackChangesObserver) {
            TrackChangesObserver.super.onStopPlayback();
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(TrackChangesObserver trackChangesObserver, long j) {
            TrackChangesObserver.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onVideoDataPrepared(TrackChangesObserver trackChangesObserver, VideoData videoData) {
            TrackChangesObserver.super.onVideoDataPrepared(videoData);
        }

        @Deprecated
        public static void onVideoSizeChanged(TrackChangesObserver trackChangesObserver, int i, int i2) {
            TrackChangesObserver.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(TrackChangesObserver trackChangesObserver, boolean z) {
            TrackChangesObserver.super.onWillPlayWhenReadyChanged(z);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack);
}
