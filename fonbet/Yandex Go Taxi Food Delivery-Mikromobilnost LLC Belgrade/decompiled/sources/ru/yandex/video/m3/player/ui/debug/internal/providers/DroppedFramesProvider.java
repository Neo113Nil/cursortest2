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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "", "count", "Lzy11;", "onVideoFramesDropped", "(I)V", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DroppedFramesProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onVideoFramesDropped(int count);

    void release();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(DroppedFramesProvider droppedFramesProvider, AdMetadata adMetadata) {
            DroppedFramesProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(DroppedFramesProvider droppedFramesProvider, long j) {
            DroppedFramesProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(DroppedFramesProvider droppedFramesProvider, DecoderCounter decoderCounter) {
            DroppedFramesProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(DroppedFramesProvider droppedFramesProvider, String str) {
            DroppedFramesProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(DroppedFramesProvider droppedFramesProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            DroppedFramesProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(DroppedFramesProvider droppedFramesProvider, long j) {
            DroppedFramesProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(DroppedFramesProvider droppedFramesProvider, int i, long j, long j2) {
            DroppedFramesProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(DroppedFramesProvider droppedFramesProvider, long j, TrackType trackType) {
            DroppedFramesProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(DroppedFramesProvider droppedFramesProvider, long j, long j2) {
            DroppedFramesProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(DroppedFramesProvider droppedFramesProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            DroppedFramesProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(DroppedFramesProvider droppedFramesProvider, DrmType drmType) {
            DroppedFramesProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(DroppedFramesProvider droppedFramesProvider, FullscreenDataBundle fullscreenDataBundle) {
            DroppedFramesProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(DroppedFramesProvider droppedFramesProvider, Map<String, Long> map) {
            DroppedFramesProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(DroppedFramesProvider droppedFramesProvider, LoadCanceled loadCanceled) {
            DroppedFramesProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(DroppedFramesProvider droppedFramesProvider, LoadError loadError) {
            DroppedFramesProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(DroppedFramesProvider droppedFramesProvider, String str) {
            DroppedFramesProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(DroppedFramesProvider droppedFramesProvider, ExtendedStalledReason extendedStalledReason) {
            DroppedFramesProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(DroppedFramesProvider droppedFramesProvider, String str) {
            DroppedFramesProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(DroppedFramesProvider droppedFramesProvider, String str, boolean z) {
            DroppedFramesProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(DroppedFramesProvider droppedFramesProvider, TrackType trackType, String str) {
            DroppedFramesProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DroppedFramesProvider droppedFramesProvider, PlaybackException playbackException) {
            DroppedFramesProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(DroppedFramesProvider droppedFramesProvider) {
            DroppedFramesProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(DroppedFramesProvider droppedFramesProvider) {
            DroppedFramesProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(DroppedFramesProvider droppedFramesProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            DroppedFramesProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(DroppedFramesProvider droppedFramesProvider, PreparingParams preparingParams) {
            DroppedFramesProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(DroppedFramesProvider droppedFramesProvider, FirstPlaybackInfo firstPlaybackInfo) {
            DroppedFramesProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(DroppedFramesProvider droppedFramesProvider, List<PlayerSkip> list) {
            DroppedFramesProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(DroppedFramesProvider droppedFramesProvider, StartFromCacheInfo startFromCacheInfo) {
            DroppedFramesProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(DroppedFramesProvider droppedFramesProvider) {
            DroppedFramesProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(DroppedFramesProvider droppedFramesProvider, boolean z) {
            DroppedFramesProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(DroppedFramesProvider droppedFramesProvider, Size size) {
            DroppedFramesProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(DroppedFramesProvider droppedFramesProvider, Size size) {
            DroppedFramesProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(DroppedFramesProvider droppedFramesProvider, Integer num) {
            DroppedFramesProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(DroppedFramesProvider droppedFramesProvider, VideoType videoType, StreamType streamType) {
            DroppedFramesProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(DroppedFramesProvider droppedFramesProvider, int i) {
            DroppedFramesProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(DroppedFramesProvider droppedFramesProvider, DecoderCounter decoderCounter) {
            DroppedFramesProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(DroppedFramesProvider droppedFramesProvider, String str, long j, long j2) {
            DroppedFramesProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(DroppedFramesProvider droppedFramesProvider, String str) {
            DroppedFramesProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(DroppedFramesProvider droppedFramesProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            DroppedFramesProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(DroppedFramesProvider droppedFramesProvider, TrackType trackType, Integer num) {
            DroppedFramesProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(DroppedFramesProvider droppedFramesProvider, StalledReason stalledReason) {
            DroppedFramesProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DroppedFramesProvider droppedFramesProvider, PlaybackException playbackException, String str) {
            DroppedFramesProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
