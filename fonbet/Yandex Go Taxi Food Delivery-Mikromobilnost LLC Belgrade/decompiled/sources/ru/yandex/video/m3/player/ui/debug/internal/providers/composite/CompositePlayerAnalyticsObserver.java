package ru.yandex.video.m3.player.ui.debug.internal.providers.composite;

import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.ui.debug.internal.providers.BandwidthEstimateProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ContentProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DrmModeProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.DroppedFramesProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider;
import ru.yandex.video.m3.player.ui.debug.internal.providers.ViewportSizeProvider;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010'\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001dH\u0016¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b=\u0010>J'\u0010B\u001a\u00020\u00142\u0006\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001dH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00142\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00142\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\u0014¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010T¨\u0006U"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/composite/CompositePlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;", "contentProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BandwidthEstimateProvider;", "bandwidthEstimateProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;", "decoderDataProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DrmModeProvider;", "drmModeProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;", "droppedFramesProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;", "loadedChunksProvider", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ViewportSizeProvider;", "viewPortSizeProvider", "<init>", "(Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/BandwidthEstimateProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/DrmModeProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;Lru/yandex/video/m3/player/ui/debug/internal/providers/ViewportSizeProvider;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "Lzy11;", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "Lru/yandex/video/m3/data/StreamType;", "streamType", "onVideoAndStreamTypeChanged", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;)V", "", "bandwidthEstimation", "onBandwidthEstimation", "(J)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "decoderName", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "Lru/yandex/video/m3/data/DrmType;", "drmType", "onDrmSessionAcquired", "(Lru/yandex/video/m3/data/DrmType;)V", "", "count", "onVideoFramesDropped", "(I)V", "chunkLengthMs", "loadTimeMs", "onDataLoaded", "(JJ)V", "bytes", "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "Lru/yandex/video/m3/data/Size;", "surfaceSize", "onSurfaceSizeChanged", "(Lru/yandex/video/m3/data/Size;)V", "release", "()V", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ContentProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/BandwidthEstimateProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DrmModeProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/ViewportSizeProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositePlayerAnalyticsObserver implements PlayerAnalyticsObserver {
    public static final int $stable = 0;
    private final BandwidthEstimateProvider bandwidthEstimateProvider;
    private final ContentProvider contentProvider;
    private final DecoderDataProvider decoderDataProvider;
    private final DrmModeProvider drmModeProvider;
    private final DroppedFramesProvider droppedFramesProvider;
    private final LoadedChunksProvider loadedChunksProvider;
    private final ViewportSizeProvider viewPortSizeProvider;

    public CompositePlayerAnalyticsObserver(ContentProvider contentProvider, BandwidthEstimateProvider bandwidthEstimateProvider, DecoderDataProvider decoderDataProvider, DrmModeProvider drmModeProvider, DroppedFramesProvider droppedFramesProvider, LoadedChunksProvider loadedChunksProvider, ViewportSizeProvider viewportSizeProvider) {
        this.contentProvider = contentProvider;
        this.bandwidthEstimateProvider = bandwidthEstimateProvider;
        this.decoderDataProvider = decoderDataProvider;
        this.drmModeProvider = drmModeProvider;
        this.droppedFramesProvider = droppedFramesProvider;
        this.loadedChunksProvider = loadedChunksProvider;
        this.viewPortSizeProvider = viewportSizeProvider;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        this.decoderDataProvider.onAudioInputFormatChanged(format, codecReuseLog);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBandwidthEstimation(long bandwidthEstimation) {
        this.bandwidthEstimateProvider.onBandwidthEstimation(bandwidthEstimation);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        this.loadedChunksProvider.onBandwidthSample(elapsedMs, bytesTransferred, bitrateEstimate);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBytesLoaded(long bytes, TrackType trackType) {
        this.loadedChunksProvider.onBytesLoaded(bytes, trackType);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDataLoaded(long chunkLengthMs, long loadTimeMs) {
        this.loadedChunksProvider.onDataLoaded(chunkLengthMs, loadTimeMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
        this.decoderDataProvider.onDecoderInitialized(trackType, decoderName, mediaCodecSelectorLog);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDrmSessionAcquired(DrmType drmType) {
        this.drmModeProvider.onDrmSessionAcquired(drmType);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadError(LoadError loadError) {
        this.loadedChunksProvider.onLoadError(loadError);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        this.contentProvider.onPreparingStarted(params);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSurfaceSizeChanged(Size surfaceSize) {
        this.viewPortSizeProvider.onSurfaceSizeChanged(surfaceSize);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoAndStreamTypeChanged(VideoType videoType, StreamType streamType) {
        this.contentProvider.onVideoAndStreamTypeChanged(videoType, streamType);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoFramesDropped(int count) {
        this.droppedFramesProvider.onVideoFramesDropped(count);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        this.decoderDataProvider.onVideoInputFormatChanged(format, codecReuseLog);
    }

    public final void release() {
        this.loadedChunksProvider.release();
        this.decoderDataProvider.release();
        this.droppedFramesProvider.release();
    }
}
