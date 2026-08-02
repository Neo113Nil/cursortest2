package ru.yandex.video.m3.player.ui.debug.internal.providers;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
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
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.FirstPlaybackInfo;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/ViewportSizeProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "Lzy11;", "onSurfaceSizeChanged", "(Lru/yandex/video/m3/data/Size;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ViewportSizeProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onSurfaceSizeChanged(Size surfaceSize);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(ViewportSizeProvider viewportSizeProvider, AdMetadata adMetadata) {
            ViewportSizeProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(ViewportSizeProvider viewportSizeProvider, long j) {
            ViewportSizeProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(ViewportSizeProvider viewportSizeProvider, DecoderCounter decoderCounter) {
            ViewportSizeProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(ViewportSizeProvider viewportSizeProvider, String str) {
            ViewportSizeProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(ViewportSizeProvider viewportSizeProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            ViewportSizeProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(ViewportSizeProvider viewportSizeProvider, long j) {
            ViewportSizeProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(ViewportSizeProvider viewportSizeProvider, int i, long j, long j2) {
            ViewportSizeProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(ViewportSizeProvider viewportSizeProvider, long j, TrackType trackType) {
            ViewportSizeProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(ViewportSizeProvider viewportSizeProvider, long j, long j2) {
            ViewportSizeProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(ViewportSizeProvider viewportSizeProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            ViewportSizeProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(ViewportSizeProvider viewportSizeProvider, DrmType drmType) {
            ViewportSizeProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(ViewportSizeProvider viewportSizeProvider, FullscreenDataBundle fullscreenDataBundle) {
            ViewportSizeProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(ViewportSizeProvider viewportSizeProvider, Map<String, Long> map) {
            ViewportSizeProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(ViewportSizeProvider viewportSizeProvider, LoadCanceled loadCanceled) {
            ViewportSizeProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(ViewportSizeProvider viewportSizeProvider, LoadError loadError) {
            ViewportSizeProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(ViewportSizeProvider viewportSizeProvider, String str) {
            ViewportSizeProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(ViewportSizeProvider viewportSizeProvider, ExtendedStalledReason extendedStalledReason) {
            ViewportSizeProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(ViewportSizeProvider viewportSizeProvider, String str) {
            ViewportSizeProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(ViewportSizeProvider viewportSizeProvider, String str, boolean z) {
            ViewportSizeProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(ViewportSizeProvider viewportSizeProvider, TrackType trackType, String str) {
            ViewportSizeProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(ViewportSizeProvider viewportSizeProvider, PlaybackException playbackException) {
            ViewportSizeProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(ViewportSizeProvider viewportSizeProvider) {
            ViewportSizeProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(ViewportSizeProvider viewportSizeProvider) {
            ViewportSizeProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(ViewportSizeProvider viewportSizeProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            ViewportSizeProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(ViewportSizeProvider viewportSizeProvider, PreparingParams preparingParams) {
            ViewportSizeProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(ViewportSizeProvider viewportSizeProvider, FirstPlaybackInfo firstPlaybackInfo) {
            ViewportSizeProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(ViewportSizeProvider viewportSizeProvider, List<PlayerSkip> list) {
            ViewportSizeProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(ViewportSizeProvider viewportSizeProvider, StartFromCacheInfo startFromCacheInfo) {
            ViewportSizeProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(ViewportSizeProvider viewportSizeProvider) {
            ViewportSizeProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(ViewportSizeProvider viewportSizeProvider, boolean z) {
            ViewportSizeProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(ViewportSizeProvider viewportSizeProvider, Size size) {
            ViewportSizeProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(ViewportSizeProvider viewportSizeProvider, Integer num) {
            ViewportSizeProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(ViewportSizeProvider viewportSizeProvider, VideoType videoType, StreamType streamType) {
            ViewportSizeProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(ViewportSizeProvider viewportSizeProvider, int i) {
            ViewportSizeProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(ViewportSizeProvider viewportSizeProvider, DecoderCounter decoderCounter) {
            ViewportSizeProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(ViewportSizeProvider viewportSizeProvider, String str, long j, long j2) {
            ViewportSizeProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(ViewportSizeProvider viewportSizeProvider, String str) {
            ViewportSizeProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(ViewportSizeProvider viewportSizeProvider, int i) {
            ViewportSizeProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(ViewportSizeProvider viewportSizeProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            ViewportSizeProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(ViewportSizeProvider viewportSizeProvider, TrackType trackType, Integer num) {
            ViewportSizeProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(ViewportSizeProvider viewportSizeProvider, StalledReason stalledReason) {
            ViewportSizeProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(ViewportSizeProvider viewportSizeProvider, PlaybackException playbackException, String str) {
            ViewportSizeProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
