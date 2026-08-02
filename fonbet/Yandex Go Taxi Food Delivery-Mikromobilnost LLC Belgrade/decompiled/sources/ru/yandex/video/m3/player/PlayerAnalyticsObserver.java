package ru.yandex.video.m3.player;

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
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\u00052\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\u0015J\u0017\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010A\u001a\u00020\u00052\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bA\u0010EJ\u001f\u0010I\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\u00052\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u00052\u0006\u0010S\u001a\u00020GH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00052\u0006\u0010V\u001a\u000203H\u0016¢\u0006\u0004\bW\u0010XJ\u001f\u0010W\u001a\u00020\u00052\u0006\u0010V\u001a\u0002032\u0006\u0010Y\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010ZJ#\u0010\\\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010[\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010\\\u001a\u00020\u00052\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b\\\u0010`J\u0017\u0010c\u001a\u00020\u00052\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u00052\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00052\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bi\u0010hJ\u000f\u0010j\u001a\u00020\u0005H\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0005H\u0016¢\u0006\u0004\bl\u0010kJ\u000f\u0010m\u001a\u00020\u0005H\u0016¢\u0006\u0004\bm\u0010kJ\u0019\u0010n\u001a\u00020\u00052\b\u0010[\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u00052\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010w\u001a\u00020\u00052\f\u0010v\u001a\b\u0012\u0004\u0012\u00020u0tH\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00052\u0006\u0010y\u001a\u00020\u0002H\u0016¢\u0006\u0004\bz\u0010(J\u0017\u0010|\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\nH\u0016¢\u0006\u0004\b|\u0010\u0015J\u0018\u0010\u007f\u001a\u00020\u00052\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001c\u0010\u0083\u0001\u001a\u00020\u00052\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001b\u0010\u0086\u0001\u001a\u00020\u00052\u0007\u0010\u0085\u0001\u001a\u00020)H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J*\u0010\u008c\u0001\u001a\u00020\u00052\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J%\u0010\u008f\u0001\u001a\u00020\u00052\u0007\u0010\u008e\u0001\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0092\u0001\u001a\u00020\u00052\u0007\u0010\u0091\u0001\u001a\u00020)H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001¨\u0006\u0093\u0001À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "", "", "chunkLengthMs", "loadTimeMs", "Lzy11;", "onDataLoaded", "(JJ)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "decoderName", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Ljava/lang/String;JJ)V", "onVideoDecoderReleased", "(Ljava/lang/String;)V", "onAudioDecoderReleased", "logMessage", "onNoSupportedTracksForRenderer", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;)V", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "onVideoDecoderEnabled", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "onAudioDecoderEnabled", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "bandwidthEstimation", "onBandwidthEstimation", "(J)V", "", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "", "estimates", "onInitialBandwidthEstimatesAcquired", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lru/yandex/video/m3/data/RecoverDetails;", "recoverDetails", "onPlayerWillTryRecoverAfterError", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/data/RecoverDetails;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "expandedManifestUrl", "onLoadSource", "Lru/yandex/video/m3/data/StalledReason;", "stalledReason", "onLoadingStart", "(Lru/yandex/video/m3/data/StalledReason;)V", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "extendedStalledReason", "(Lru/yandex/video/m3/data/ExtendedStalledReason;)V", "url", "", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/data/StartFromCacheInfo;)V", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "firstPlaybackInfo", "onReadyForFirstPlayback", "(Lru/yandex/video/m3/player/FirstPlaybackInfo;)V", "keepDecoders", "onStopPlayback", "(Z)V", "nonFatalPlaybackException", "onNonFatalPlaybackException", "(Lru/yandex/video/m3/player/PlaybackException;)V", "ignoreReason", "(Lru/yandex/video/m3/player/PlaybackException;Ljava/lang/String;)V", "quality", "onLoadCanceled", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "loadCanceled", "(Lru/yandex/video/m3/player/tracking/LoadCanceled;)V", "Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;", "fullscreenDataBundle", "onFullscreenInfoUpdated", "(Lru/yandex/video/m3/player/tracking/FullscreenDataBundle;)V", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "onSurfaceSizeChanged", "(Lru/yandex/video/m3/data/Size;)V", "onSurfaceSizeChangedInternal", "onPlayCommand", "()V", "onPauseCommand", "onStopCommand", "onUserManuallySelectedQuality", "(Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "skips", "onSkipsUpdated", "(Ljava/util/List;)V", "positionMs", "onAnalyticsPlaybackProgress", "className", "onNetPerfDisabled", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "Lru/yandex/video/m3/data/DrmType;", "drmType", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "count", "onVideoFramesDropped", "(I)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "bytes", "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "bitrate", "onVideoChunkLoaded", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerAnalyticsObserver {
    default void onAdMetadata(AdMetadata adMetadata) {
    }

    default void onAnalyticsPlaybackProgress(long positionMs) {
    }

    default void onAudioDecoderEnabled(DecoderCounter decoderCounter) {
    }

    default void onAudioDecoderReleased(String decoderName) {
    }

    default void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
    }

    default void onBandwidthEstimation(long bandwidthEstimation) {
    }

    default void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
    }

    default void onBytesLoaded(long bytes, TrackType trackType) {
    }

    default void onDataLoaded(long chunkLengthMs, long loadTimeMs) {
    }

    default void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
    }

    default void onDrmSessionAcquired(DrmType drmType) {
    }

    default void onFullscreenInfoUpdated(FullscreenDataBundle fullscreenDataBundle) {
    }

    default void onInitialBandwidthEstimatesAcquired(Map<String, Long> estimates) {
    }

    default void onLoadCanceled(LoadCanceled loadCanceled) {
    }

    default void onLoadCanceled(TrackType trackType, Integer quality) {
    }

    default void onLoadError(LoadError loadError) {
    }

    default void onLoadSource(String expandedManifestUrl) {
    }

    default void onLoadingStart(ExtendedStalledReason extendedStalledReason) {
    }

    default void onLoadingStart(StalledReason stalledReason) {
    }

    default void onNetPerfDisabled(String className) {
    }

    default void onNewMediaItem(String url, boolean autoplay) {
    }

    default void onNoSupportedTracksForRenderer(TrackType trackType, String logMessage) {
    }

    default void onNonFatalPlaybackException(PlaybackException nonFatalPlaybackException) {
    }

    default void onNonFatalPlaybackException(PlaybackException nonFatalPlaybackException, String ignoreReason) {
    }

    default void onPauseCommand() {
    }

    default void onPlayCommand() {
    }

    default void onPlayerWillTryRecoverAfterError(PlaybackException playbackException, RecoverDetails recoverDetails) {
    }

    default void onPreparingStarted(PreparingParams params) {
    }

    default void onReadyForFirstPlayback(FirstPlaybackInfo firstPlaybackInfo) {
    }

    default void onSkipsUpdated(List<PlayerSkip> skips) {
    }

    default void onStartFromCacheInfoReady(StartFromCacheInfo startFromCacheInfo) {
    }

    default void onStopCommand() {
    }

    default void onStopPlayback(boolean keepDecoders) {
    }

    default void onSurfaceSizeChanged(Size surfaceSize) {
    }

    default void onSurfaceSizeChangedInternal(Size surfaceSize) {
    }

    default void onUserManuallySelectedQuality(Integer quality) {
    }

    default void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
    }

    default void onVideoChunkLoaded(int bitrate) {
    }

    default void onVideoDecoderEnabled(DecoderCounter decoderCounter) {
    }

    default void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
    }

    default void onVideoDecoderReleased(String decoderName) {
    }

    default void onVideoFramesDropped(int count) {
    }

    default void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdMetadata(PlayerAnalyticsObserver playerAnalyticsObserver, AdMetadata adMetadata) {
            PlayerAnalyticsObserver.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAnalyticsPlaybackProgress(PlayerAnalyticsObserver playerAnalyticsObserver, long j) {
            PlayerAnalyticsObserver.super.onAnalyticsPlaybackProgress(j);
        }

        @Deprecated
        public static void onAudioDecoderEnabled(PlayerAnalyticsObserver playerAnalyticsObserver, DecoderCounter decoderCounter) {
            PlayerAnalyticsObserver.super.onAudioDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onAudioDecoderReleased(PlayerAnalyticsObserver playerAnalyticsObserver, String str) {
            PlayerAnalyticsObserver.super.onAudioDecoderReleased(str);
        }

        @Deprecated
        public static void onAudioInputFormatChanged(PlayerAnalyticsObserver playerAnalyticsObserver, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            PlayerAnalyticsObserver.super.onAudioInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onBandwidthEstimation(PlayerAnalyticsObserver playerAnalyticsObserver, long j) {
            PlayerAnalyticsObserver.super.onBandwidthEstimation(j);
        }

        @Deprecated
        public static void onBandwidthSample(PlayerAnalyticsObserver playerAnalyticsObserver, int i, long j, long j2) {
            PlayerAnalyticsObserver.super.onBandwidthSample(i, j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(PlayerAnalyticsObserver playerAnalyticsObserver, long j, TrackType trackType) {
            PlayerAnalyticsObserver.super.onBytesLoaded(j, trackType);
        }

        @Deprecated
        public static void onDataLoaded(PlayerAnalyticsObserver playerAnalyticsObserver, long j, long j2) {
            PlayerAnalyticsObserver.super.onDataLoaded(j, j2);
        }

        @Deprecated
        public static void onDecoderInitialized(PlayerAnalyticsObserver playerAnalyticsObserver, TrackType trackType, String str, MediaCodecSelectorLog mediaCodecSelectorLog) {
            PlayerAnalyticsObserver.super.onDecoderInitialized(trackType, str, mediaCodecSelectorLog);
        }

        @Deprecated
        public static void onDrmSessionAcquired(PlayerAnalyticsObserver playerAnalyticsObserver, DrmType drmType) {
            PlayerAnalyticsObserver.super.onDrmSessionAcquired(drmType);
        }

        @Deprecated
        public static void onFullscreenInfoUpdated(PlayerAnalyticsObserver playerAnalyticsObserver, FullscreenDataBundle fullscreenDataBundle) {
            PlayerAnalyticsObserver.super.onFullscreenInfoUpdated(fullscreenDataBundle);
        }

        @Deprecated
        public static void onInitialBandwidthEstimatesAcquired(PlayerAnalyticsObserver playerAnalyticsObserver, Map<String, Long> map) {
            PlayerAnalyticsObserver.super.onInitialBandwidthEstimatesAcquired(map);
        }

        @Deprecated
        public static void onLoadCanceled(PlayerAnalyticsObserver playerAnalyticsObserver, TrackType trackType, Integer num) {
            PlayerAnalyticsObserver.super.onLoadCanceled(trackType, num);
        }

        @Deprecated
        public static void onLoadError(PlayerAnalyticsObserver playerAnalyticsObserver, LoadError loadError) {
            PlayerAnalyticsObserver.super.onLoadError(loadError);
        }

        @Deprecated
        public static void onLoadSource(PlayerAnalyticsObserver playerAnalyticsObserver, String str) {
            PlayerAnalyticsObserver.super.onLoadSource(str);
        }

        @Deprecated
        public static void onLoadingStart(PlayerAnalyticsObserver playerAnalyticsObserver, StalledReason stalledReason) {
            PlayerAnalyticsObserver.super.onLoadingStart(stalledReason);
        }

        @Deprecated
        public static void onNetPerfDisabled(PlayerAnalyticsObserver playerAnalyticsObserver, String str) {
            PlayerAnalyticsObserver.super.onNetPerfDisabled(str);
        }

        @Deprecated
        public static void onNewMediaItem(PlayerAnalyticsObserver playerAnalyticsObserver, String str, boolean z) {
            PlayerAnalyticsObserver.super.onNewMediaItem(str, z);
        }

        @Deprecated
        public static void onNoSupportedTracksForRenderer(PlayerAnalyticsObserver playerAnalyticsObserver, TrackType trackType, String str) {
            PlayerAnalyticsObserver.super.onNoSupportedTracksForRenderer(trackType, str);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(PlayerAnalyticsObserver playerAnalyticsObserver, PlaybackException playbackException) {
            PlayerAnalyticsObserver.super.onNonFatalPlaybackException(playbackException);
        }

        @Deprecated
        public static void onPauseCommand(PlayerAnalyticsObserver playerAnalyticsObserver) {
            PlayerAnalyticsObserver.super.onPauseCommand();
        }

        @Deprecated
        public static void onPlayCommand(PlayerAnalyticsObserver playerAnalyticsObserver) {
            PlayerAnalyticsObserver.super.onPlayCommand();
        }

        @Deprecated
        public static void onPlayerWillTryRecoverAfterError(PlayerAnalyticsObserver playerAnalyticsObserver, PlaybackException playbackException, RecoverDetails recoverDetails) {
            PlayerAnalyticsObserver.super.onPlayerWillTryRecoverAfterError(playbackException, recoverDetails);
        }

        @Deprecated
        public static void onPreparingStarted(PlayerAnalyticsObserver playerAnalyticsObserver, PreparingParams preparingParams) {
            PlayerAnalyticsObserver.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(PlayerAnalyticsObserver playerAnalyticsObserver, FirstPlaybackInfo firstPlaybackInfo) {
            PlayerAnalyticsObserver.super.onReadyForFirstPlayback(firstPlaybackInfo);
        }

        @Deprecated
        public static void onSkipsUpdated(PlayerAnalyticsObserver playerAnalyticsObserver, List<PlayerSkip> list) {
            PlayerAnalyticsObserver.super.onSkipsUpdated(list);
        }

        @Deprecated
        public static void onStartFromCacheInfoReady(PlayerAnalyticsObserver playerAnalyticsObserver, StartFromCacheInfo startFromCacheInfo) {
            PlayerAnalyticsObserver.super.onStartFromCacheInfoReady(startFromCacheInfo);
        }

        @Deprecated
        public static void onStopCommand(PlayerAnalyticsObserver playerAnalyticsObserver) {
            PlayerAnalyticsObserver.super.onStopCommand();
        }

        @Deprecated
        public static void onStopPlayback(PlayerAnalyticsObserver playerAnalyticsObserver, boolean z) {
            PlayerAnalyticsObserver.super.onStopPlayback(z);
        }

        @Deprecated
        public static void onSurfaceSizeChanged(PlayerAnalyticsObserver playerAnalyticsObserver, Size size) {
            PlayerAnalyticsObserver.super.onSurfaceSizeChanged(size);
        }

        @Deprecated
        public static void onSurfaceSizeChangedInternal(PlayerAnalyticsObserver playerAnalyticsObserver, Size size) {
            PlayerAnalyticsObserver.super.onSurfaceSizeChangedInternal(size);
        }

        @Deprecated
        public static void onUserManuallySelectedQuality(PlayerAnalyticsObserver playerAnalyticsObserver, Integer num) {
            PlayerAnalyticsObserver.super.onUserManuallySelectedQuality(num);
        }

        @Deprecated
        public static void onVideoAndStreamTypeChanged(PlayerAnalyticsObserver playerAnalyticsObserver, VideoType videoType, StreamType streamType) {
            PlayerAnalyticsObserver.super.onVideoAndStreamTypeChanged(videoType, streamType);
        }

        @Deprecated
        public static void onVideoChunkLoaded(PlayerAnalyticsObserver playerAnalyticsObserver, int i) {
            PlayerAnalyticsObserver.super.onVideoChunkLoaded(i);
        }

        @Deprecated
        public static void onVideoDecoderEnabled(PlayerAnalyticsObserver playerAnalyticsObserver, DecoderCounter decoderCounter) {
            PlayerAnalyticsObserver.super.onVideoDecoderEnabled(decoderCounter);
        }

        @Deprecated
        public static void onVideoDecoderInitialized(PlayerAnalyticsObserver playerAnalyticsObserver, String str, long j, long j2) {
            PlayerAnalyticsObserver.super.onVideoDecoderInitialized(str, j, j2);
        }

        @Deprecated
        public static void onVideoDecoderReleased(PlayerAnalyticsObserver playerAnalyticsObserver, String str) {
            PlayerAnalyticsObserver.super.onVideoDecoderReleased(str);
        }

        @Deprecated
        public static void onVideoFramesDropped(PlayerAnalyticsObserver playerAnalyticsObserver, int i) {
            PlayerAnalyticsObserver.super.onVideoFramesDropped(i);
        }

        @Deprecated
        public static void onVideoInputFormatChanged(PlayerAnalyticsObserver playerAnalyticsObserver, TrackFormat trackFormat, MediaCodecReuseLog mediaCodecReuseLog) {
            PlayerAnalyticsObserver.super.onVideoInputFormatChanged(trackFormat, mediaCodecReuseLog);
        }

        @Deprecated
        public static void onLoadCanceled(PlayerAnalyticsObserver playerAnalyticsObserver, LoadCanceled loadCanceled) {
            PlayerAnalyticsObserver.super.onLoadCanceled(loadCanceled);
        }

        @Deprecated
        public static void onLoadingStart(PlayerAnalyticsObserver playerAnalyticsObserver, ExtendedStalledReason extendedStalledReason) {
            PlayerAnalyticsObserver.super.onLoadingStart(extendedStalledReason);
        }

        @Deprecated
        public static void onNonFatalPlaybackException(PlayerAnalyticsObserver playerAnalyticsObserver, PlaybackException playbackException, String str) {
            PlayerAnalyticsObserver.super.onNonFatalPlaybackException(playbackException, str);
        }
    }
}
