package ru.yandex.video.m3.player.impl.tracking;

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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/DecoderUsageObserver;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "decoderName", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "Lzy11;", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "onVideoDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "onAudioDecoderEnabled", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "", "foreground", "onForegroundModeSet", "(Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DecoderUsageObserver extends PlayerAnalyticsObserver {
    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onAudioDecoderEnabled(DecoderCounter decoderCounter);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog);

    void onForegroundModeSet(boolean foreground);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onVideoDecoderEnabled(DecoderCounter decoderCounter);

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(DecoderUsageObserver decoderUsageObserver, AdMetadata adMetadata) {
            DecoderUsageObserver.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(DecoderUsageObserver decoderUsageObserver, long j) {
            DecoderUsageObserver.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderReleased(DecoderUsageObserver decoderUsageObserver, String str) {
            DecoderUsageObserver.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onBandwidthEstimation(DecoderUsageObserver decoderUsageObserver, long j) {
            DecoderUsageObserver.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(DecoderUsageObserver decoderUsageObserver, int i, long j, long j2) {
            DecoderUsageObserver.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(DecoderUsageObserver decoderUsageObserver, long j, TrackType trackType) {
            DecoderUsageObserver.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(DecoderUsageObserver decoderUsageObserver, long j, long j2) {
            DecoderUsageObserver.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDrmSessionAcquired(DecoderUsageObserver decoderUsageObserver, DrmType drmType) {
            DecoderUsageObserver.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(DecoderUsageObserver decoderUsageObserver, FullscreenDataBundle fullscreenDataBundle) {
            DecoderUsageObserver.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(DecoderUsageObserver decoderUsageObserver, Map<String, Long> map) {
            DecoderUsageObserver.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(DecoderUsageObserver decoderUsageObserver, LoadCanceled loadCanceled) {
            DecoderUsageObserver.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(DecoderUsageObserver decoderUsageObserver, LoadError loadError) {
            DecoderUsageObserver.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(DecoderUsageObserver decoderUsageObserver, String str) {
            DecoderUsageObserver.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(DecoderUsageObserver decoderUsageObserver, ExtendedStalledReason extendedStalledReason) {
            DecoderUsageObserver.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(DecoderUsageObserver decoderUsageObserver, String str) {
            DecoderUsageObserver.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(DecoderUsageObserver decoderUsageObserver, String str, boolean z) {
            DecoderUsageObserver.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(DecoderUsageObserver decoderUsageObserver, TrackType trackType, String str) {
            DecoderUsageObserver.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DecoderUsageObserver decoderUsageObserver, PlaybackException playbackException) {
            DecoderUsageObserver.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(DecoderUsageObserver decoderUsageObserver) {
            DecoderUsageObserver.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(DecoderUsageObserver decoderUsageObserver) {
            DecoderUsageObserver.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(DecoderUsageObserver decoderUsageObserver, PlaybackException playbackException, RecoverDetails recoverDetails) {
            DecoderUsageObserver.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(DecoderUsageObserver decoderUsageObserver, PreparingParams preparingParams) {
            DecoderUsageObserver.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(DecoderUsageObserver decoderUsageObserver, FirstPlaybackInfo firstPlaybackInfo) {
            DecoderUsageObserver.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(DecoderUsageObserver decoderUsageObserver, List<PlayerSkip> list) {
            DecoderUsageObserver.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(DecoderUsageObserver decoderUsageObserver, StartFromCacheInfo startFromCacheInfo) {
            DecoderUsageObserver.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(DecoderUsageObserver decoderUsageObserver) {
            DecoderUsageObserver.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(DecoderUsageObserver decoderUsageObserver, boolean z) {
            DecoderUsageObserver.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(DecoderUsageObserver decoderUsageObserver, Size size) {
            DecoderUsageObserver.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(DecoderUsageObserver decoderUsageObserver, Size size) {
            DecoderUsageObserver.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(DecoderUsageObserver decoderUsageObserver, Integer num) {
            DecoderUsageObserver.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(DecoderUsageObserver decoderUsageObserver, VideoType videoType, StreamType streamType) {
            DecoderUsageObserver.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(DecoderUsageObserver decoderUsageObserver, int i) {
            DecoderUsageObserver.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(DecoderUsageObserver decoderUsageObserver, String str, long j, long j2) {
            DecoderUsageObserver.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(DecoderUsageObserver decoderUsageObserver, String str) {
            DecoderUsageObserver.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(DecoderUsageObserver decoderUsageObserver, int i) {
            DecoderUsageObserver.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onLoadCanceled(DecoderUsageObserver decoderUsageObserver, TrackType trackType, Integer num) {
            DecoderUsageObserver.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(DecoderUsageObserver decoderUsageObserver, StalledReason stalledReason) {
            DecoderUsageObserver.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(DecoderUsageObserver decoderUsageObserver, PlaybackException playbackException, String str) {
            DecoderUsageObserver.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
