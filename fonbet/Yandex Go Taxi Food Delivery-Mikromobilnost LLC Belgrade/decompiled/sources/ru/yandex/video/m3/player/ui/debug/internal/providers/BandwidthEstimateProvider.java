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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/BandwidthEstimateProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "", "bandwidthEstimation", "Lzy11;", "onBandwidthEstimation", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BandwidthEstimateProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onBandwidthEstimation(long bandwidthEstimation);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(BandwidthEstimateProvider bandwidthEstimateProvider, AdMetadata adMetadata) {
            BandwidthEstimateProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(BandwidthEstimateProvider bandwidthEstimateProvider, long j) {
            BandwidthEstimateProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(BandwidthEstimateProvider bandwidthEstimateProvider, DecoderCounter decoderCounter) {
            BandwidthEstimateProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(BandwidthEstimateProvider bandwidthEstimateProvider, String str) {
            BandwidthEstimateProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(BandwidthEstimateProvider bandwidthEstimateProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            BandwidthEstimateProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthSample(BandwidthEstimateProvider bandwidthEstimateProvider, int i, long j, long j2) {
            BandwidthEstimateProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(BandwidthEstimateProvider bandwidthEstimateProvider, long j, TrackType trackType) {
            BandwidthEstimateProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(BandwidthEstimateProvider bandwidthEstimateProvider, long j, long j2) {
            BandwidthEstimateProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(BandwidthEstimateProvider bandwidthEstimateProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            BandwidthEstimateProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(BandwidthEstimateProvider bandwidthEstimateProvider, DrmType drmType) {
            BandwidthEstimateProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(BandwidthEstimateProvider bandwidthEstimateProvider, FullscreenDataBundle fullscreenDataBundle) {
            BandwidthEstimateProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(BandwidthEstimateProvider bandwidthEstimateProvider, Map<String, Long> map) {
            BandwidthEstimateProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(BandwidthEstimateProvider bandwidthEstimateProvider, LoadCanceled loadCanceled) {
            BandwidthEstimateProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(BandwidthEstimateProvider bandwidthEstimateProvider, LoadError loadError) {
            BandwidthEstimateProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(BandwidthEstimateProvider bandwidthEstimateProvider, String str) {
            BandwidthEstimateProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(BandwidthEstimateProvider bandwidthEstimateProvider, ExtendedStalledReason extendedStalledReason) {
            BandwidthEstimateProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(BandwidthEstimateProvider bandwidthEstimateProvider, String str) {
            BandwidthEstimateProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(BandwidthEstimateProvider bandwidthEstimateProvider, String str, boolean z) {
            BandwidthEstimateProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(BandwidthEstimateProvider bandwidthEstimateProvider, TrackType trackType, String str) {
            BandwidthEstimateProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(BandwidthEstimateProvider bandwidthEstimateProvider, PlaybackException playbackException) {
            BandwidthEstimateProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(BandwidthEstimateProvider bandwidthEstimateProvider) {
            BandwidthEstimateProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(BandwidthEstimateProvider bandwidthEstimateProvider) {
            BandwidthEstimateProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(BandwidthEstimateProvider bandwidthEstimateProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            BandwidthEstimateProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(BandwidthEstimateProvider bandwidthEstimateProvider, PreparingParams preparingParams) {
            BandwidthEstimateProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(BandwidthEstimateProvider bandwidthEstimateProvider, FirstPlaybackInfo firstPlaybackInfo) {
            BandwidthEstimateProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(BandwidthEstimateProvider bandwidthEstimateProvider, List<PlayerSkip> list) {
            BandwidthEstimateProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(BandwidthEstimateProvider bandwidthEstimateProvider, StartFromCacheInfo startFromCacheInfo) {
            BandwidthEstimateProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(BandwidthEstimateProvider bandwidthEstimateProvider) {
            BandwidthEstimateProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(BandwidthEstimateProvider bandwidthEstimateProvider, boolean z) {
            BandwidthEstimateProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(BandwidthEstimateProvider bandwidthEstimateProvider, Size size) {
            BandwidthEstimateProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(BandwidthEstimateProvider bandwidthEstimateProvider, Size size) {
            BandwidthEstimateProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(BandwidthEstimateProvider bandwidthEstimateProvider, Integer num) {
            BandwidthEstimateProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(BandwidthEstimateProvider bandwidthEstimateProvider, VideoType videoType, StreamType streamType) {
            BandwidthEstimateProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(BandwidthEstimateProvider bandwidthEstimateProvider, int i) {
            BandwidthEstimateProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(BandwidthEstimateProvider bandwidthEstimateProvider, DecoderCounter decoderCounter) {
            BandwidthEstimateProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(BandwidthEstimateProvider bandwidthEstimateProvider, String str, long j, long j2) {
            BandwidthEstimateProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(BandwidthEstimateProvider bandwidthEstimateProvider, String str) {
            BandwidthEstimateProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(BandwidthEstimateProvider bandwidthEstimateProvider, int i) {
            BandwidthEstimateProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(BandwidthEstimateProvider bandwidthEstimateProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            BandwidthEstimateProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(BandwidthEstimateProvider bandwidthEstimateProvider, TrackType trackType, Integer num) {
            BandwidthEstimateProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(BandwidthEstimateProvider bandwidthEstimateProvider, StalledReason stalledReason) {
            BandwidthEstimateProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(BandwidthEstimateProvider bandwidthEstimateProvider, PlaybackException playbackException, String str) {
            BandwidthEstimateProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
