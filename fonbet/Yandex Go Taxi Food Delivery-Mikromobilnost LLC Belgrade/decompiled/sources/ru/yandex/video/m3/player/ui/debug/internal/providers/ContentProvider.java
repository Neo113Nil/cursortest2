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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/PreparingParams;", "params", "Lzy11;", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ContentProvider extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onPreparingStarted(PreparingParams params);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(ContentProvider contentProvider, AdMetadata adMetadata) {
            ContentProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(ContentProvider contentProvider, long j) {
            ContentProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(ContentProvider contentProvider, DecoderCounter decoderCounter) {
            ContentProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(ContentProvider contentProvider, String str) {
            ContentProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(ContentProvider contentProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            ContentProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(ContentProvider contentProvider, long j) {
            ContentProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(ContentProvider contentProvider, int i, long j, long j2) {
            ContentProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(ContentProvider contentProvider, long j, TrackType trackType) {
            ContentProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(ContentProvider contentProvider, long j, long j2) {
            ContentProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(ContentProvider contentProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            ContentProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(ContentProvider contentProvider, DrmType drmType) {
            ContentProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(ContentProvider contentProvider, FullscreenDataBundle fullscreenDataBundle) {
            ContentProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(ContentProvider contentProvider, Map<String, Long> map) {
            ContentProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(ContentProvider contentProvider, LoadCanceled loadCanceled) {
            ContentProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(ContentProvider contentProvider, LoadError loadError) {
            ContentProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(ContentProvider contentProvider, String str) {
            ContentProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(ContentProvider contentProvider, ExtendedStalledReason extendedStalledReason) {
            ContentProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(ContentProvider contentProvider, String str) {
            ContentProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(ContentProvider contentProvider, String str, boolean z) {
            ContentProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(ContentProvider contentProvider, TrackType trackType, String str) {
            ContentProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(ContentProvider contentProvider, PlaybackException playbackException) {
            ContentProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(ContentProvider contentProvider) {
            ContentProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(ContentProvider contentProvider) {
            ContentProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(ContentProvider contentProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            ContentProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(ContentProvider contentProvider, FirstPlaybackInfo firstPlaybackInfo) {
            ContentProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(ContentProvider contentProvider, List<PlayerSkip> list) {
            ContentProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(ContentProvider contentProvider, StartFromCacheInfo startFromCacheInfo) {
            ContentProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(ContentProvider contentProvider) {
            ContentProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(ContentProvider contentProvider, boolean z) {
            ContentProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(ContentProvider contentProvider, Size size) {
            ContentProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(ContentProvider contentProvider, Size size) {
            ContentProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(ContentProvider contentProvider, Integer num) {
            ContentProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoChunkLoaded(ContentProvider contentProvider, int i) {
            ContentProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(ContentProvider contentProvider, DecoderCounter decoderCounter) {
            ContentProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(ContentProvider contentProvider, String str, long j, long j2) {
            ContentProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(ContentProvider contentProvider, String str) {
            ContentProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(ContentProvider contentProvider, int i) {
            ContentProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(ContentProvider contentProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            ContentProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(ContentProvider contentProvider, TrackType trackType, Integer num) {
            ContentProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(ContentProvider contentProvider, StalledReason stalledReason) {
            ContentProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(ContentProvider contentProvider, PlaybackException playbackException, String str) {
            ContentProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
