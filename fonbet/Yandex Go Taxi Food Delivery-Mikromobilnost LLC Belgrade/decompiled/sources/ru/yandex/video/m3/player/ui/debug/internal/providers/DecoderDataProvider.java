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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "decoderName", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "Lzy11;", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DecoderDataProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog);

    void release();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(DecoderDataProvider decoderDataProvider, AdMetadata adMetadata) {
            DecoderDataProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(DecoderDataProvider decoderDataProvider, long j) {
            DecoderDataProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(DecoderDataProvider decoderDataProvider, DecoderCounter decoderCounter) {
            DecoderDataProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(DecoderDataProvider decoderDataProvider, String str) {
            DecoderDataProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onBandwidthEstimation(DecoderDataProvider decoderDataProvider, long j) {
            DecoderDataProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(DecoderDataProvider decoderDataProvider, int i, long j, long j2) {
            DecoderDataProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(DecoderDataProvider decoderDataProvider, long j, TrackType trackType) {
            DecoderDataProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(DecoderDataProvider decoderDataProvider, long j, long j2) {
            DecoderDataProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDrmSessionAcquired(DecoderDataProvider decoderDataProvider, DrmType drmType) {
            DecoderDataProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(DecoderDataProvider decoderDataProvider, FullscreenDataBundle fullscreenDataBundle) {
            DecoderDataProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(DecoderDataProvider decoderDataProvider, Map<String, Long> map) {
            DecoderDataProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(DecoderDataProvider decoderDataProvider, LoadCanceled loadCanceled) {
            DecoderDataProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(DecoderDataProvider decoderDataProvider, LoadError loadError) {
            DecoderDataProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(DecoderDataProvider decoderDataProvider, String str) {
            DecoderDataProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(DecoderDataProvider decoderDataProvider, ExtendedStalledReason extendedStalledReason) {
            DecoderDataProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(DecoderDataProvider decoderDataProvider, String str) {
            DecoderDataProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(DecoderDataProvider decoderDataProvider, String str, boolean z) {
            DecoderDataProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(DecoderDataProvider decoderDataProvider, TrackType trackType, String str) {
            DecoderDataProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DecoderDataProvider decoderDataProvider, PlaybackException playbackException) {
            DecoderDataProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(DecoderDataProvider decoderDataProvider) {
            DecoderDataProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(DecoderDataProvider decoderDataProvider) {
            DecoderDataProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(DecoderDataProvider decoderDataProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            DecoderDataProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(DecoderDataProvider decoderDataProvider, PreparingParams preparingParams) {
            DecoderDataProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(DecoderDataProvider decoderDataProvider, FirstPlaybackInfo firstPlaybackInfo) {
            DecoderDataProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(DecoderDataProvider decoderDataProvider, List<PlayerSkip> list) {
            DecoderDataProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(DecoderDataProvider decoderDataProvider, StartFromCacheInfo startFromCacheInfo) {
            DecoderDataProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(DecoderDataProvider decoderDataProvider) {
            DecoderDataProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(DecoderDataProvider decoderDataProvider, boolean z) {
            DecoderDataProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(DecoderDataProvider decoderDataProvider, Size size) {
            DecoderDataProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(DecoderDataProvider decoderDataProvider, Size size) {
            DecoderDataProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(DecoderDataProvider decoderDataProvider, Integer num) {
            DecoderDataProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(DecoderDataProvider decoderDataProvider, VideoType videoType, StreamType streamType) {
            DecoderDataProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(DecoderDataProvider decoderDataProvider, int i) {
            DecoderDataProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(DecoderDataProvider decoderDataProvider, DecoderCounter decoderCounter) {
            DecoderDataProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(DecoderDataProvider decoderDataProvider, String str, long j, long j2) {
            DecoderDataProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(DecoderDataProvider decoderDataProvider, String str) {
            DecoderDataProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(DecoderDataProvider decoderDataProvider, int i) {
            DecoderDataProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onLoadCanceled(DecoderDataProvider decoderDataProvider, TrackType trackType, Integer num) {
            DecoderDataProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(DecoderDataProvider decoderDataProvider, StalledReason stalledReason) {
            DecoderDataProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DecoderDataProvider decoderDataProvider, PlaybackException playbackException, String str) {
            DecoderDataProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
