package ru.yandex.video.m3.player.ui.debug.internal.providers;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/SessionColorProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/data/StalledReason;", "stalledReason", "Lzy11;", "onLoadingStart", "(Lru/yandex/video/m3/data/StalledReason;)V", "onLoadingFinished", "()V", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "onSurfaceSizeChanged", "(Lru/yandex/video/m3/data/Size;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "getCurrentSessionColor", "()Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SessionColorProvider extends PlayerAnalyticsObserver, PlayerObserver<Object> {
    SessionColor getCurrentSessionColor();

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onLoadingFinished();

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onLoadingStart(StalledReason stalledReason);

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onPlaybackError(PlaybackException playbackException);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onSurfaceSizeChanged(Size surfaceSize);

    @Override // ru.yandex.video.m3.player.PlayerObserver
    void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(SessionColorProvider sessionColorProvider, AdConfig adConfig) {
            SessionColorProvider.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(SessionColorProvider sessionColorProvider, AdException adException) {
            SessionColorProvider.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(SessionColorProvider sessionColorProvider, List<Ad> list) {
            SessionColorProvider.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdMetadata(SessionColorProvider sessionColorProvider, AdMetadata adMetadata) {
            SessionColorProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAdPodEnd(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(SessionColorProvider sessionColorProvider, Ad ad, int i) {
            SessionColorProvider.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(SessionColorProvider sessionColorProvider, Ad ad) {
            SessionColorProvider.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(SessionColorProvider sessionColorProvider, Ad ad) {
            SessionColorProvider.super.onAdStart(ad);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(SessionColorProvider sessionColorProvider, long j) {
            SessionColorProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(SessionColorProvider sessionColorProvider, DecoderCounter decoderCounter) {
            SessionColorProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(SessionColorProvider sessionColorProvider, String str) {
            SessionColorProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(SessionColorProvider sessionColorProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            SessionColorProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(SessionColorProvider sessionColorProvider, long j) {
            SessionColorProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(SessionColorProvider sessionColorProvider, int i, long j, long j2) {
            SessionColorProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBufferSizeChanged(SessionColorProvider sessionColorProvider, long j) {
            SessionColorProvider.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onBytesLoaded(SessionColorProvider sessionColorProvider, long j, TrackType trackType) {
            SessionColorProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onContentDurationChanged(SessionColorProvider sessionColorProvider, long j) {
            SessionColorProvider.super.onContentDurationChanged(j);
        }

        @Deprecated
        public static void onDataLoaded(SessionColorProvider sessionColorProvider, long j, long j2) {
            SessionColorProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(SessionColorProvider sessionColorProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            SessionColorProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmKeysLoaded(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onDrmSessionAcquired(SessionColorProvider sessionColorProvider, DrmType drmType) {
            SessionColorProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onEngineBufferingEnd(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static void onEngineBufferingStart(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onEngineBufferingStart();
        }

        @Deprecated
        public static void onEnginePrepared(SessionColorProvider sessionColorProvider, VideoData videoData) {
            SessionColorProvider.super.onEnginePrepared(videoData);
        }

        @Deprecated
        public static void onFirstFrame(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onFirstFrame();
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(SessionColorProvider sessionColorProvider, FullscreenDataBundle fullscreenDataBundle) {
            SessionColorProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onHidedPlayerReady(SessionColorProvider sessionColorProvider, Object obj) {
            SessionColorProvider.super.onHidedPlayerReady(obj);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(SessionColorProvider sessionColorProvider, Map<String, Long> map) {
            SessionColorProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(SessionColorProvider sessionColorProvider, LoadCanceled loadCanceled) {
            SessionColorProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(SessionColorProvider sessionColorProvider, LoadError loadError) {
            SessionColorProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(SessionColorProvider sessionColorProvider, String str) {
            SessionColorProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onLoadingStart();
        }

        @Deprecated
        public static void onNetPerfDisabled(SessionColorProvider sessionColorProvider, String str) {
            SessionColorProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(SessionColorProvider sessionColorProvider, String str, boolean z) {
            SessionColorProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(SessionColorProvider sessionColorProvider, TrackType trackType, String str) {
            SessionColorProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(SessionColorProvider sessionColorProvider, PlaybackException playbackException) {
            SessionColorProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPausePlayback(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlayCommand(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlaybackEnded(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackProgress(SessionColorProvider sessionColorProvider, long j) {
            SessionColorProvider.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(SessionColorProvider sessionColorProvider, float f, boolean z) {
            SessionColorProvider.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPlayerReleased(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onPlayerReleased();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(SessionColorProvider sessionColorProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            SessionColorProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(SessionColorProvider sessionColorProvider, PreparingParams preparingParams) {
            SessionColorProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onPreparingWithAdConfig(SessionColorProvider sessionColorProvider, AdConfig adConfig) {
            SessionColorProvider.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static void onRepeat(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(SessionColorProvider sessionColorProvider, RepeatMode repeatMode) {
            SessionColorProvider.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(SessionColorProvider sessionColorProvider, long j, long j2) {
            SessionColorProvider.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onSkipsUpdated(SessionColorProvider sessionColorProvider, List<PlayerSkip> list) {
            SessionColorProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(SessionColorProvider sessionColorProvider, StartFromCacheInfo startFromCacheInfo) {
            SessionColorProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(SessionColorProvider sessionColorProvider) {
            SessionColorProvider.super.onStopPlayback();
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(SessionColorProvider sessionColorProvider, Size size) {
            SessionColorProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(SessionColorProvider sessionColorProvider, long j) {
            SessionColorProvider.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(SessionColorProvider sessionColorProvider, Integer num) {
            SessionColorProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(SessionColorProvider sessionColorProvider, VideoType videoType, StreamType streamType) {
            SessionColorProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(SessionColorProvider sessionColorProvider, int i) {
            SessionColorProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDataPrepared(SessionColorProvider sessionColorProvider, VideoData videoData) {
            SessionColorProvider.super.onVideoDataPrepared(videoData);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(SessionColorProvider sessionColorProvider, DecoderCounter decoderCounter) {
            SessionColorProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(SessionColorProvider sessionColorProvider, String str, long j, long j2) {
            SessionColorProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(SessionColorProvider sessionColorProvider, String str) {
            SessionColorProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(SessionColorProvider sessionColorProvider, int i) {
            SessionColorProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(SessionColorProvider sessionColorProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            SessionColorProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onVideoSizeChanged(SessionColorProvider sessionColorProvider, int i, int i2) {
            SessionColorProvider.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(SessionColorProvider sessionColorProvider, boolean z) {
            SessionColorProvider.super.onWillPlayWhenReadyChanged(z);
        }

        @Deprecated
        public static void onLoadCanceled(SessionColorProvider sessionColorProvider, TrackType trackType, Integer num) {
            SessionColorProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(SessionColorProvider sessionColorProvider, ExtendedStalledReason extendedStalledReason) {
            SessionColorProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(SessionColorProvider sessionColorProvider, PlaybackException playbackException, String str) {
            SessionColorProvider.super.onNonFatalPlaybackException(playbackException, str);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(SessionColorProvider sessionColorProvider, FirstPlaybackInfo firstPlaybackInfo) {
            SessionColorProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onStopPlayback(SessionColorProvider sessionColorProvider, boolean z) {
            SessionColorProvider.super.onStopPlayback(z);
        }
    }
}
