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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/DrmModeProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/data/DrmType;", "drmType", "Lzy11;", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DrmModeProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onDrmSessionAcquired(DrmType drmType);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(DrmModeProvider drmModeProvider, AdMetadata adMetadata) {
            DrmModeProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(DrmModeProvider drmModeProvider, long j) {
            DrmModeProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(DrmModeProvider drmModeProvider, DecoderCounter decoderCounter) {
            DrmModeProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(DrmModeProvider drmModeProvider, String str) {
            DrmModeProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(DrmModeProvider drmModeProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            DrmModeProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(DrmModeProvider drmModeProvider, long j) {
            DrmModeProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(DrmModeProvider drmModeProvider, int i, long j, long j2) {
            DrmModeProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(DrmModeProvider drmModeProvider, long j, TrackType trackType) {
            DrmModeProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(DrmModeProvider drmModeProvider, long j, long j2) {
            DrmModeProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(DrmModeProvider drmModeProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            DrmModeProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(DrmModeProvider drmModeProvider, FullscreenDataBundle fullscreenDataBundle) {
            DrmModeProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(DrmModeProvider drmModeProvider, Map<String, Long> map) {
            DrmModeProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(DrmModeProvider drmModeProvider, LoadCanceled loadCanceled) {
            DrmModeProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(DrmModeProvider drmModeProvider, LoadError loadError) {
            DrmModeProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(DrmModeProvider drmModeProvider, String str) {
            DrmModeProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(DrmModeProvider drmModeProvider, ExtendedStalledReason extendedStalledReason) {
            DrmModeProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(DrmModeProvider drmModeProvider, String str) {
            DrmModeProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(DrmModeProvider drmModeProvider, String str, boolean z) {
            DrmModeProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(DrmModeProvider drmModeProvider, TrackType trackType, String str) {
            DrmModeProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DrmModeProvider drmModeProvider, PlaybackException playbackException) {
            DrmModeProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(DrmModeProvider drmModeProvider) {
            DrmModeProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(DrmModeProvider drmModeProvider) {
            DrmModeProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(DrmModeProvider drmModeProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            DrmModeProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(DrmModeProvider drmModeProvider, PreparingParams preparingParams) {
            DrmModeProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(DrmModeProvider drmModeProvider, FirstPlaybackInfo firstPlaybackInfo) {
            DrmModeProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(DrmModeProvider drmModeProvider, List<PlayerSkip> list) {
            DrmModeProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(DrmModeProvider drmModeProvider, StartFromCacheInfo startFromCacheInfo) {
            DrmModeProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(DrmModeProvider drmModeProvider) {
            DrmModeProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(DrmModeProvider drmModeProvider, boolean z) {
            DrmModeProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(DrmModeProvider drmModeProvider, Size size) {
            DrmModeProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(DrmModeProvider drmModeProvider, Size size) {
            DrmModeProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(DrmModeProvider drmModeProvider, Integer num) {
            DrmModeProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(DrmModeProvider drmModeProvider, VideoType videoType, StreamType streamType) {
            DrmModeProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(DrmModeProvider drmModeProvider, int i) {
            DrmModeProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(DrmModeProvider drmModeProvider, DecoderCounter decoderCounter) {
            DrmModeProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(DrmModeProvider drmModeProvider, String str, long j, long j2) {
            DrmModeProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(DrmModeProvider drmModeProvider, String str) {
            DrmModeProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(DrmModeProvider drmModeProvider, int i) {
            DrmModeProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(DrmModeProvider drmModeProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            DrmModeProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(DrmModeProvider drmModeProvider, TrackType trackType, Integer num) {
            DrmModeProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(DrmModeProvider drmModeProvider, StalledReason stalledReason) {
            DrmModeProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DrmModeProvider drmModeProvider, PlaybackException playbackException, String str) {
            DrmModeProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
