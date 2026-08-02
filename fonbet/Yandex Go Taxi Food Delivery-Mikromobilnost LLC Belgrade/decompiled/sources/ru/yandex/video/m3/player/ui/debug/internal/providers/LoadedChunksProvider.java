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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "", "chunkLengthMs", "loadTimeMs", "Lzy11;", "onDataLoaded", "(JJ)V", "bytes", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LoadedChunksProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onBytesLoaded(long bytes, TrackType trackType);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onDataLoaded(long chunkLengthMs, long loadTimeMs);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onLoadError(LoadError loadError);

    void release();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(LoadedChunksProvider loadedChunksProvider, AdMetadata adMetadata) {
            LoadedChunksProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(LoadedChunksProvider loadedChunksProvider, long j) {
            LoadedChunksProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(LoadedChunksProvider loadedChunksProvider, DecoderCounter decoderCounter) {
            LoadedChunksProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(LoadedChunksProvider loadedChunksProvider, String str) {
            LoadedChunksProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(LoadedChunksProvider loadedChunksProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            LoadedChunksProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(LoadedChunksProvider loadedChunksProvider, long j) {
            LoadedChunksProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onDecoderInitialized(LoadedChunksProvider loadedChunksProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            LoadedChunksProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(LoadedChunksProvider loadedChunksProvider, DrmType drmType) {
            LoadedChunksProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(LoadedChunksProvider loadedChunksProvider, FullscreenDataBundle fullscreenDataBundle) {
            LoadedChunksProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(LoadedChunksProvider loadedChunksProvider, Map<String, Long> map) {
            LoadedChunksProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(LoadedChunksProvider loadedChunksProvider, LoadCanceled loadCanceled) {
            LoadedChunksProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadSource(LoadedChunksProvider loadedChunksProvider, String str) {
            LoadedChunksProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(LoadedChunksProvider loadedChunksProvider, ExtendedStalledReason extendedStalledReason) {
            LoadedChunksProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(LoadedChunksProvider loadedChunksProvider, String str) {
            LoadedChunksProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(LoadedChunksProvider loadedChunksProvider, String str, boolean z) {
            LoadedChunksProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(LoadedChunksProvider loadedChunksProvider, TrackType trackType, String str) {
            LoadedChunksProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(LoadedChunksProvider loadedChunksProvider, PlaybackException playbackException) {
            LoadedChunksProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(LoadedChunksProvider loadedChunksProvider) {
            LoadedChunksProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(LoadedChunksProvider loadedChunksProvider) {
            LoadedChunksProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(LoadedChunksProvider loadedChunksProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            LoadedChunksProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(LoadedChunksProvider loadedChunksProvider, PreparingParams preparingParams) {
            LoadedChunksProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(LoadedChunksProvider loadedChunksProvider, FirstPlaybackInfo firstPlaybackInfo) {
            LoadedChunksProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(LoadedChunksProvider loadedChunksProvider, List<PlayerSkip> list) {
            LoadedChunksProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(LoadedChunksProvider loadedChunksProvider, StartFromCacheInfo startFromCacheInfo) {
            LoadedChunksProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(LoadedChunksProvider loadedChunksProvider) {
            LoadedChunksProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(LoadedChunksProvider loadedChunksProvider, boolean z) {
            LoadedChunksProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(LoadedChunksProvider loadedChunksProvider, Size size) {
            LoadedChunksProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(LoadedChunksProvider loadedChunksProvider, Size size) {
            LoadedChunksProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(LoadedChunksProvider loadedChunksProvider, Integer num) {
            LoadedChunksProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(LoadedChunksProvider loadedChunksProvider, VideoType videoType, StreamType streamType) {
            LoadedChunksProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(LoadedChunksProvider loadedChunksProvider, int i) {
            LoadedChunksProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(LoadedChunksProvider loadedChunksProvider, DecoderCounter decoderCounter) {
            LoadedChunksProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(LoadedChunksProvider loadedChunksProvider, String str, long j, long j2) {
            LoadedChunksProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(LoadedChunksProvider loadedChunksProvider, String str) {
            LoadedChunksProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(LoadedChunksProvider loadedChunksProvider, int i) {
            LoadedChunksProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(LoadedChunksProvider loadedChunksProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            LoadedChunksProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(LoadedChunksProvider loadedChunksProvider, TrackType trackType, Integer num) {
            LoadedChunksProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(LoadedChunksProvider loadedChunksProvider, StalledReason stalledReason) {
            LoadedChunksProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(LoadedChunksProvider loadedChunksProvider, PlaybackException playbackException, String str) {
            LoadedChunksProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
