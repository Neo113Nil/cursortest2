package ru.yandex.video.m3.player.impl.preload;

import defpackage.h42;
import defpackage.w820;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/preload/PreloadPriorityController;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "Lzy11;", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PreloadPriorityController extends PlayerDelegate.Observer {
    void release();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(PreloadPriorityController preloadPriorityController, AdConfig adConfig) {
            PreloadPriorityController.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(PreloadPriorityController preloadPriorityController, AdException adException) {
            PreloadPriorityController.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(PreloadPriorityController preloadPriorityController, List<Ad> list) {
            PreloadPriorityController.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdMetadata(PreloadPriorityController preloadPriorityController, AdMetadata adMetadata) {
            PreloadPriorityController.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAdPodEnd(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(PreloadPriorityController preloadPriorityController, Ad ad, int i) {
            PreloadPriorityController.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(PreloadPriorityController preloadPriorityController, Ad ad) {
            PreloadPriorityController.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(PreloadPriorityController preloadPriorityController, Ad ad) {
            PreloadPriorityController.super.onAdStart(ad);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(PreloadPriorityController preloadPriorityController, DecoderCounter decoderCounter) {
            PreloadPriorityController.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(PreloadPriorityController preloadPriorityController, String str) {
            PreloadPriorityController.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(PreloadPriorityController preloadPriorityController, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            PreloadPriorityController.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(PreloadPriorityController preloadPriorityController, long j) {
            PreloadPriorityController.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(PreloadPriorityController preloadPriorityController, int i, long j, long j2) {
            PreloadPriorityController.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBufferSizeChanged(PreloadPriorityController preloadPriorityController, long j) {
            PreloadPriorityController.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onBufferingEnd(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onBufferingEnd();
        }

        @Deprecated
        public static void onBufferingStart(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onBufferingStart();
        }

        @Deprecated
        public static void onBytesLoaded(PreloadPriorityController preloadPriorityController, long j, TrackType trackType) {
            PreloadPriorityController.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(PreloadPriorityController preloadPriorityController, long j, long j2) {
            PreloadPriorityController.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(PreloadPriorityController preloadPriorityController, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            PreloadPriorityController.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmKeysLoaded(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onDrmSessionAcquired(PreloadPriorityController preloadPriorityController, DrmType drmType) {
            PreloadPriorityController.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onDurationChanged(PreloadPriorityController preloadPriorityController, long j) {
            PreloadPriorityController.super.onDurationChanged(j);
        }

        @Deprecated
        public static void onError(PreloadPriorityController preloadPriorityController, PlaybackException playbackException) {
            PreloadPriorityController.super.onError(playbackException);
        }

        @Deprecated
        public static void onFirstFrame(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onFirstFrame();
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(PreloadPriorityController preloadPriorityController, Map<String, Long> map) {
            PreloadPriorityController.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(PreloadPriorityController preloadPriorityController, LoadCanceled loadCanceled) {
            PreloadPriorityController.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(PreloadPriorityController preloadPriorityController, LoadError loadError) {
            PreloadPriorityController.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onMetadata(PreloadPriorityController preloadPriorityController, h42 h42Var, w820 w820Var) {
            PreloadPriorityController.super.onMetadata(h42Var, w820Var);
        }

        @Deprecated
        public static void onNetPerfStatus(PreloadPriorityController preloadPriorityController, boolean z, String str) {
            PreloadPriorityController.super.onNetPerfStatus(z, str);
        }

        @Deprecated
        public static void onNewMediaItem(PreloadPriorityController preloadPriorityController, String str, boolean z) {
            PreloadPriorityController.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(PreloadPriorityController preloadPriorityController, TrackType trackType, String str) {
            PreloadPriorityController.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalError(PreloadPriorityController preloadPriorityController, PlaybackException playbackException) {
            PreloadPriorityController.super.onNonFatalError(playbackException);
        }

        @Deprecated
        public static void onPausePlayback(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackProgress(PreloadPriorityController preloadPriorityController, long j) {
            PreloadPriorityController.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(PreloadPriorityController preloadPriorityController, float f, boolean z) {
            PreloadPriorityController.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPreparingWithAdConfig(PreloadPriorityController preloadPriorityController, AdConfig adConfig) {
            PreloadPriorityController.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onRepeat(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(PreloadPriorityController preloadPriorityController, RepeatMode repeatMode) {
            PreloadPriorityController.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(PreloadPriorityController preloadPriorityController, long j, long j2) {
            PreloadPriorityController.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(PreloadPriorityController preloadPriorityController, StartFromCacheInfo startFromCacheInfo) {
            PreloadPriorityController.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStop(PreloadPriorityController preloadPriorityController, boolean z) {
            PreloadPriorityController.super.onStop(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(PreloadPriorityController preloadPriorityController, int i, int i2) {
            PreloadPriorityController.super.onSurfaceSizeChanged(i, i2);
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(PreloadPriorityController preloadPriorityController, long j) {
            PreloadPriorityController.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onTracksChanged(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onTracksChanged();
        }

        @Deprecated
        public static void onTracksSelected(PreloadPriorityController preloadPriorityController) {
            PreloadPriorityController.super.onTracksSelected();
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(PreloadPriorityController preloadPriorityController, VideoType videoType, StreamType streamType) {
            PreloadPriorityController.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(PreloadPriorityController preloadPriorityController, int i) {
            PreloadPriorityController.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(PreloadPriorityController preloadPriorityController, DecoderCounter decoderCounter) {
            PreloadPriorityController.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(PreloadPriorityController preloadPriorityController, String str, long j, long j2) {
            PreloadPriorityController.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(PreloadPriorityController preloadPriorityController, String str) {
            PreloadPriorityController.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(PreloadPriorityController preloadPriorityController, int i) {
            PreloadPriorityController.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(PreloadPriorityController preloadPriorityController, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            PreloadPriorityController.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onVideoSizeChanged(PreloadPriorityController preloadPriorityController, int i, int i2) {
            PreloadPriorityController.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(PreloadPriorityController preloadPriorityController, boolean z) {
            PreloadPriorityController.super.onWillPlayWhenReadyChanged(z);
        }

        @Deprecated
        public static void onLoadCanceled(PreloadPriorityController preloadPriorityController, TrackType trackType, Integer num) {
            PreloadPriorityController.super.onLoadCanceled(trackType, num);
        }
    }
}
