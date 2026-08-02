package ru.yandex.video.m3.player.tracking;

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
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "getFullscreenInfo", "()Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoListener;", "fullscreenInfoListener", "Lzy11;", "addListener", "(Lru/yandex/video/m3/player/tracking/FullscreenInfoListener;)V", "removeListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FullscreenInfoProvider extends PlayerAnalyticsObserver {
    void addListener(FullscreenInfoListener fullscreenInfoListener);

    FullscreenInfo getFullscreenInfo();

    void removeListener(FullscreenInfoListener fullscreenInfoListener);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(FullscreenInfoProvider fullscreenInfoProvider, AdMetadata adMetadata) {
            FullscreenInfoProvider.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(FullscreenInfoProvider fullscreenInfoProvider, long j) {
            FullscreenInfoProvider.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(FullscreenInfoProvider fullscreenInfoProvider, DecoderCounter decoderCounter) {
            FullscreenInfoProvider.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(FullscreenInfoProvider fullscreenInfoProvider, String str) {
            FullscreenInfoProvider.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(FullscreenInfoProvider fullscreenInfoProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            FullscreenInfoProvider.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(FullscreenInfoProvider fullscreenInfoProvider, long j) {
            FullscreenInfoProvider.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(FullscreenInfoProvider fullscreenInfoProvider, int i, long j, long j2) {
            FullscreenInfoProvider.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(FullscreenInfoProvider fullscreenInfoProvider, long j, TrackType trackType) {
            FullscreenInfoProvider.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(FullscreenInfoProvider fullscreenInfoProvider, long j, long j2) {
            FullscreenInfoProvider.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(FullscreenInfoProvider fullscreenInfoProvider, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            FullscreenInfoProvider.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(FullscreenInfoProvider fullscreenInfoProvider, DrmType drmType) {
            FullscreenInfoProvider.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(FullscreenInfoProvider fullscreenInfoProvider, FullscreenDataBundle fullscreenDataBundle) {
            FullscreenInfoProvider.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(FullscreenInfoProvider fullscreenInfoProvider, Map<String, Long> map) {
            FullscreenInfoProvider.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(FullscreenInfoProvider fullscreenInfoProvider, LoadCanceled loadCanceled) {
            FullscreenInfoProvider.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(FullscreenInfoProvider fullscreenInfoProvider, LoadError loadError) {
            FullscreenInfoProvider.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(FullscreenInfoProvider fullscreenInfoProvider, String str) {
            FullscreenInfoProvider.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(FullscreenInfoProvider fullscreenInfoProvider, ExtendedStalledReason extendedStalledReason) {
            FullscreenInfoProvider.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(FullscreenInfoProvider fullscreenInfoProvider, String str) {
            FullscreenInfoProvider.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(FullscreenInfoProvider fullscreenInfoProvider, String str, boolean z) {
            FullscreenInfoProvider.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(FullscreenInfoProvider fullscreenInfoProvider, TrackType trackType, String str) {
            FullscreenInfoProvider.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(FullscreenInfoProvider fullscreenInfoProvider, PlaybackException playbackException) {
            FullscreenInfoProvider.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(FullscreenInfoProvider fullscreenInfoProvider) {
            FullscreenInfoProvider.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(FullscreenInfoProvider fullscreenInfoProvider) {
            FullscreenInfoProvider.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(FullscreenInfoProvider fullscreenInfoProvider, PlaybackException playbackException, RecoverDetails recoverDetails) {
            FullscreenInfoProvider.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(FullscreenInfoProvider fullscreenInfoProvider, PreparingParams preparingParams) {
            FullscreenInfoProvider.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(FullscreenInfoProvider fullscreenInfoProvider, FirstPlaybackInfo firstPlaybackInfo) {
            FullscreenInfoProvider.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(FullscreenInfoProvider fullscreenInfoProvider, List<PlayerSkip> list) {
            FullscreenInfoProvider.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(FullscreenInfoProvider fullscreenInfoProvider, StartFromCacheInfo startFromCacheInfo) {
            FullscreenInfoProvider.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(FullscreenInfoProvider fullscreenInfoProvider) {
            FullscreenInfoProvider.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(FullscreenInfoProvider fullscreenInfoProvider, boolean z) {
            FullscreenInfoProvider.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(FullscreenInfoProvider fullscreenInfoProvider, Size size) {
            FullscreenInfoProvider.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(FullscreenInfoProvider fullscreenInfoProvider, Size size) {
            FullscreenInfoProvider.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(FullscreenInfoProvider fullscreenInfoProvider, Integer num) {
            FullscreenInfoProvider.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(FullscreenInfoProvider fullscreenInfoProvider, VideoType videoType, StreamType streamType) {
            FullscreenInfoProvider.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(FullscreenInfoProvider fullscreenInfoProvider, int i) {
            FullscreenInfoProvider.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(FullscreenInfoProvider fullscreenInfoProvider, DecoderCounter decoderCounter) {
            FullscreenInfoProvider.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(FullscreenInfoProvider fullscreenInfoProvider, String str, long j, long j2) {
            FullscreenInfoProvider.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(FullscreenInfoProvider fullscreenInfoProvider, String str) {
            FullscreenInfoProvider.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(FullscreenInfoProvider fullscreenInfoProvider, int i) {
            FullscreenInfoProvider.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(FullscreenInfoProvider fullscreenInfoProvider, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            FullscreenInfoProvider.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(FullscreenInfoProvider fullscreenInfoProvider, TrackType trackType, Integer num) {
            FullscreenInfoProvider.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadingStart(FullscreenInfoProvider fullscreenInfoProvider, StalledReason stalledReason) {
            FullscreenInfoProvider.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(FullscreenInfoProvider fullscreenInfoProvider, PlaybackException playbackException, String str) {
            FullscreenInfoProvider.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
