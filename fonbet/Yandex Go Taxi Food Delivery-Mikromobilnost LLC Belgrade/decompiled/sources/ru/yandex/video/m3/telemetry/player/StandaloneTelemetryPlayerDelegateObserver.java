package ru.yandex.video.m3.telemetry.player;

import defpackage.fe10;
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
import ru.yandex.video.m3.data.PlaybackParameters;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryPlayerDelegateObserver;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "Lfe10;", "mediaItem", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Lzy11;", "onSetMediaSource", "(Lfe10;Lru/yandex/video/m3/data/PlaybackParameters;)V", "", "url", "onLoadSource", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StandaloneTelemetryPlayerDelegateObserver extends PlayerDelegate.Observer {
    void onLoadSource(String url);

    void onSetMediaSource(fe10 mediaItem, PlaybackParameters playbackParameters);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, AdConfig adConfig) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, AdException adException) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, List<Ad> list) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdMetadata(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, AdMetadata adMetadata) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAdPodEnd(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, Ad ad, int i) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, Ad ad) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, Ad ad) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAdStart(ad);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, DecoderCounter decoderCounter) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, String str) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            StandaloneTelemetryPlayerDelegateObserver.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j) {
            StandaloneTelemetryPlayerDelegateObserver.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, int i, long j, long j2) {
            StandaloneTelemetryPlayerDelegateObserver.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBufferSizeChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j) {
            StandaloneTelemetryPlayerDelegateObserver.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onBufferingEnd(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onBufferingEnd();
        }

        @Deprecated
        public static void onBufferingStart(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onBufferingStart();
        }

        @Deprecated
        public static void onBytesLoaded(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j, TrackType trackType) {
            StandaloneTelemetryPlayerDelegateObserver.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j, long j2) {
            StandaloneTelemetryPlayerDelegateObserver.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            StandaloneTelemetryPlayerDelegateObserver.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmKeysLoaded(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onDrmKeysLoaded();
        }

        @Deprecated
        public static void onDrmSessionAcquired(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, DrmType drmType) {
            StandaloneTelemetryPlayerDelegateObserver.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onDurationChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j) {
            StandaloneTelemetryPlayerDelegateObserver.super.onDurationChanged(j);
        }

        @Deprecated
        public static void onError(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, PlaybackException playbackException) {
            StandaloneTelemetryPlayerDelegateObserver.super.onError(playbackException);
        }

        @Deprecated
        public static void onFirstFrame(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onFirstFrame();
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, Map<String, Long> map) {
            StandaloneTelemetryPlayerDelegateObserver.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, LoadCanceled loadCanceled) {
            StandaloneTelemetryPlayerDelegateObserver.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadError(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, LoadError loadError) {
            StandaloneTelemetryPlayerDelegateObserver.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onMetadata(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, h42 h42Var, w820 w820Var) {
            StandaloneTelemetryPlayerDelegateObserver.super.onMetadata(h42Var, w820Var);
        }

        @Deprecated
        public static void onNetPerfStatus(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, boolean z, String str) {
            StandaloneTelemetryPlayerDelegateObserver.super.onNetPerfStatus(z, str);
        }

        @Deprecated
        public static void onNewMediaItem(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, String str, boolean z) {
            StandaloneTelemetryPlayerDelegateObserver.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, TrackType trackType, String str) {
            StandaloneTelemetryPlayerDelegateObserver.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalError(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, PlaybackException playbackException) {
            StandaloneTelemetryPlayerDelegateObserver.super.onNonFatalError(playbackException);
        }

        @Deprecated
        public static void onPausePlayback(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackProgress(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j) {
            StandaloneTelemetryPlayerDelegateObserver.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPlaybackSpeedChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, float f, boolean z) {
            StandaloneTelemetryPlayerDelegateObserver.super.onPlaybackSpeedChanged(f, z);
        }

        @Deprecated
        public static void onPreparingWithAdConfig(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, AdConfig adConfig) {
            StandaloneTelemetryPlayerDelegateObserver.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onRepeat(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onRepeat();
        }

        @Deprecated
        public static void onRepeatModeChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, RepeatMode repeatMode) {
            StandaloneTelemetryPlayerDelegateObserver.super.onRepeatModeChanged(repeatMode);
        }

        @Deprecated
        public static void onResumePlayback(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onResumePlayback();
        }

        @Deprecated
        public static void onSeek(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j, long j2) {
            StandaloneTelemetryPlayerDelegateObserver.super.onSeek(j, j2);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, StartFromCacheInfo startFromCacheInfo) {
            StandaloneTelemetryPlayerDelegateObserver.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStop(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, boolean z) {
            StandaloneTelemetryPlayerDelegateObserver.super.onStop(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, int i, int i2) {
            StandaloneTelemetryPlayerDelegateObserver.super.onSurfaceSizeChanged(i, i2);
        }

        @Deprecated
        public static void onTimelineLeftEdgeChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, long j) {
            StandaloneTelemetryPlayerDelegateObserver.super.onTimelineLeftEdgeChanged(j);
        }

        @Deprecated
        public static void onTracksChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onTracksChanged();
        }

        @Deprecated
        public static void onTracksSelected(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver) {
            StandaloneTelemetryPlayerDelegateObserver.super.onTracksSelected();
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, VideoType videoType, StreamType streamType) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, int i) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, DecoderCounter decoderCounter) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, String str, long j, long j2) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, String str) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, int i) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onVideoSizeChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, int i, int i2) {
            StandaloneTelemetryPlayerDelegateObserver.super.onVideoSizeChanged(i, i2);
        }

        @Deprecated
        public static void onWillPlayWhenReadyChanged(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, boolean z) {
            StandaloneTelemetryPlayerDelegateObserver.super.onWillPlayWhenReadyChanged(z);
        }

        @Deprecated
        public static void onLoadCanceled(StandaloneTelemetryPlayerDelegateObserver standaloneTelemetryPlayerDelegateObserver, TrackType trackType, Integer num) {
            StandaloneTelemetryPlayerDelegateObserver.super.onLoadCanceled(trackType, num);
        }
    }
}
