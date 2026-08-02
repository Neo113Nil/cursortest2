package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gvu0;
import defpackage.h5z0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.u7m;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import ru.yandex.video.m3.model.config.download.DownloaderConfig;
import ru.yandex.video.m3.model.config.download.DownloaderConfigKt;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B9\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u0002¢\u0006\u0004\b'\u0010\u001fR\u001e\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010(R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/yandex/video/m3/preload_manager/TracksPreloader;", "", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "Lru/yandex/video/m3/preload_manager/PreloadTracksInfo;", "tracks", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "downloaderFactory", "Ljava/util/concurrent/ExecutorService;", "owningExecutor", "", "trackPreloadTimeoutInSec", "<init>", "(Ljava/util/List;Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload/YandexDownloaderFactory;Ljava/util/concurrent/ExecutorService;J)V", "totalSize", "calculateSizeLimitsByBitrate", "(Ljava/util/List;J)Ljava/util/List;", "Lru/yandex/video/m3/preload_manager/TrackDownload;", "createDownloadWithWrappedErrors", "(Ljava/util/List;)Lru/yandex/video/m3/preload_manager/TrackDownload;", "", "getContentType", "(Ljava/util/List;)Ljava/lang/String;", "", "e", "Lru/yandex/video/m3/preload_manager/PreloadException;", "handleDownloaderException", "(Ljava/lang/Throwable;)Lru/yandex/video/m3/preload_manager/PreloadException;", "prepareDownloads", "()Ljava/util/List;", "downloads", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "runParallelDownloads", "(Ljava/util/List;)Ljava/util/List;", "Lzy11;", "cancel", "()V", "download", "Ljava/util/List;", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Ljava/util/concurrent/ExecutorService;", "J", "", "wasCanceled", "Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TracksPreloader {
    private final YandexDownloaderFactory downloaderFactory;
    private List<TrackDownload> downloads = EmptyList.a;
    private final ExecutorService owningExecutor;
    private final PreloadRequest request;
    private final long trackPreloadTimeoutInSec;
    private final List<PreloadTrackInfo> tracks;
    private volatile boolean wasCanceled;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackType.Subtitles.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrackType.Other.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TracksPreloader(List<? extends PreloadTrackInfo> list, PreloadRequest preloadRequest, YandexDownloaderFactory yandexDownloaderFactory, ExecutorService executorService, long j) {
        this.tracks = list;
        this.request = preloadRequest;
        this.downloaderFactory = yandexDownloaderFactory;
        this.owningExecutor = executorService;
        this.trackPreloadTimeoutInSec = j;
    }

    private final List<Long> calculateSizeLimitsByBitrate(List<? extends PreloadTrackInfo> tracks, long totalSize) {
        androidx.media3.common.a format;
        int size = tracks.size();
        int[] iArr = new int[size];
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i >= size) {
                break;
            }
            PreloadTrackInfo preloadTrackInfo = tracks.get(i);
            ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo = preloadTrackInfo instanceof ExoPlayerPreloadTrackInfo ? (ExoPlayerPreloadTrackInfo) preloadTrackInfo : null;
            if (exoPlayerPreloadTrackInfo != null && (format = exoPlayerPreloadTrackInfo.getFormat()) != null) {
                i2 = format.j;
            }
            iArr[i] = i2;
            i++;
        }
        if (j73.w(-1, iArr)) {
            h5z0.a.o("impossible to calculate size limits", new Object[0]);
            return EmptyList.a;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += iArr[i4];
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Long.valueOf((long) (((iArr[i5] * 1.0d) / i3) * totalSize)));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        if (r3.equals("both") != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final TrackDownload createDownloadWithWrappedErrors(List<? extends PreloadTrackInfo> tracks) {
        final int intValue;
        Integer valueOf;
        Integer num;
        Integer num2;
        try {
            boolean isDynamic$video_player_internalRelease = INSTANCE.isDynamic$video_player_internalRelease(tracks);
            PreloadLiveDashConfig experimentalPreloadLiveDashConfig = this.request.getConfig().getExperimentalPreloadLiveDashConfig();
            if (experimentalPreloadLiveDashConfig != null && experimentalPreloadLiveDashConfig.getLiveDashPreloadEnabled() && isDynamic$video_player_internalRelease) {
                intValue = 0;
            } else {
                Integer maxDownloadSegmentCount = this.request.getConfig().getMaxDownloadSegmentCount();
                intValue = maxDownloadSegmentCount != null ? maxDownloadSegmentCount.intValue() : -1;
            }
            DownloaderConfig DownloaderConfig = DownloaderConfigKt.DownloaderConfig(new tls() { // from class: ru.yandex.video.m3.preload_manager.TracksPreloader$createDownloadWithWrappedErrors$downloaderConfig$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(DownloaderConfig.Builder builder) {
                    PreloadRequest preloadRequest;
                    PreloadRequest preloadRequest2;
                    PreloadRequest preloadRequest3;
                    builder.setMaxSegmentsCount(Integer.valueOf(intValue));
                    preloadRequest = this.request;
                    builder.setSourceIndex(Integer.valueOf(preloadRequest.getSourceIndex()));
                    preloadRequest2 = this.request;
                    builder.setVsid(preloadRequest2.getVideoSessionId());
                    preloadRequest3 = this.request;
                    builder.setStartPositionMs(Long.valueOf(preloadRequest3.getConfig().getStartPosition()));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DownloaderConfig.Builder) obj);
                    return zy11.a;
                }
            });
            String manifestUrl = this.request.getManifestUrl();
            String A0 = tracks.size() == 1 ? gvu0.A0(40, evu0.Q("Format=", PreloadTrackInfoKt.debugPrint((PreloadTrackInfo) kotlin.collections.a.P(tracks)))) : "";
            YandexDownloaderFactory yandexDownloaderFactory = this.downloaderFactory;
            String X = kotlin.collections.a.X(scc.g(A0, manifestUrl), null, null, null, null, 63);
            Uri parse = Uri.parse(manifestUrl);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = tracks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PreloadTrackInfo preloadTrackInfo = (PreloadTrackInfo) it.next();
                ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo = preloadTrackInfo instanceof ExoPlayerPreloadTrackInfo ? (ExoPlayerPreloadTrackInfo) preloadTrackInfo : null;
                StreamKey streamKey = exoPlayerPreloadTrackInfo != null ? exoPlayerPreloadTrackInfo.getStreamKey() : null;
                if (streamKey != null) {
                    arrayList.add(streamKey);
                }
            }
            u7m createDownloader = yandexDownloaderFactory.createDownloader(new DownloadRequest(X, parse, null, arrayList, null, null, null, null), DownloaderConfig);
            String contentType = getContentType(tracks);
            int hashCode = contentType.hashCode();
            if (hashCode != 3029889) {
                if (hashCode != 93166550) {
                    if (hashCode == 112202875) {
                        if (!contentType.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        }
                        Object P = kotlin.collections.a.P(tracks);
                        ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo2 = P instanceof ExoPlayerPreloadTrackInfo ? (ExoPlayerPreloadTrackInfo) P : null;
                        androidx.media3.common.a format = exoPlayerPreloadTrackInfo2 != null ? exoPlayerPreloadTrackInfo2.getFormat() : null;
                        if (format != null) {
                            Integer valueOf2 = Integer.valueOf(format.u);
                            Integer valueOf3 = Integer.valueOf(format.v);
                            valueOf = Integer.valueOf(format.j);
                            num = valueOf3;
                            num2 = valueOf2;
                            return new TrackDownload(A0, getContentType(tracks), createDownloader, QualityInfoKt.QualityInfo$default(num2, num, valueOf, null, 8, null));
                        }
                    }
                } else if (contentType.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    Object P2 = kotlin.collections.a.P(tracks);
                    ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo3 = P2 instanceof ExoPlayerPreloadTrackInfo ? (ExoPlayerPreloadTrackInfo) P2 : null;
                    androidx.media3.common.a format2 = exoPlayerPreloadTrackInfo3 != null ? exoPlayerPreloadTrackInfo3.getFormat() : null;
                    if (format2 != null) {
                        valueOf = Integer.valueOf(format2.j);
                        num2 = null;
                        num = null;
                        return new TrackDownload(A0, getContentType(tracks), createDownloader, QualityInfoKt.QualityInfo$default(num2, num, valueOf, null, 8, null));
                    }
                }
                num2 = null;
                num = null;
                valueOf = null;
                return new TrackDownload(A0, getContentType(tracks), createDownloader, QualityInfoKt.QualityInfo$default(num2, num, valueOf, null, 8, null));
            }
        } catch (Throwable th) {
            throw new PreloadException.UnknownError("Unknown error during downloader instantiation", th);
        }
        throw new PreloadException.UnknownError("Unknown error during downloader instantiation", th);
    }

    private final String getContentType(List<? extends PreloadTrackInfo> tracks) {
        if (tracks.size() > 1) {
            return "both";
        }
        if (tracks.isEmpty()) {
            return "no";
        }
        Object P = kotlin.collections.a.P(tracks);
        ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo = P instanceof ExoPlayerPreloadTrackInfo ? (ExoPlayerPreloadTrackInfo) P : null;
        TrackType trackType = exoPlayerPreloadTrackInfo != null ? exoPlayerPreloadTrackInfo.getTrackType() : null;
        int i = trackType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        if (i == -1) {
            return "unknown";
        }
        if (i == 1) {
            return MediaStreamTrack.AUDIO_TRACK_KIND;
        }
        if (i == 2) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (i == 3 || i == 4) {
            return "unknown";
        }
        w511.b();
        return null;
    }

    private final PreloadException handleDownloaderException(Throwable e) {
        String str;
        if (!this.wasCanceled && !this.owningExecutor.isShutdown()) {
            Iterator<T> it = this.downloads.iterator();
            while (it.hasNext()) {
                ((TrackDownload) it.next()).cancel(true);
            }
            PreloadException preloadException = e instanceof PreloadException ? (PreloadException) e : null;
            return preloadException == null ? new PreloadException.TracksDownloadError(g8e.s(e, new StringBuilder("Downloader failed to download the request with exception ")), e) : preloadException;
        }
        List<TrackDownload> list = this.downloads;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TrackDownload) it2.next()).cancelAndGetResult());
        }
        if (this.owningExecutor.isShutdown()) {
            str = "Tracks downloading was canceled by executor shutdown";
        } else {
            str = "Tracks downloading was canceled by " + e;
        }
        return new PreloadException.CanceledOperationException.CanceledTracksDownload(str, e, arrayList);
    }

    private final List<TrackDownload> prepareDownloads() {
        List<TrackDownload> singletonList = Collections.singletonList(createDownloadWithWrappedErrors(this.tracks));
        long maxDownloadBytes = this.request.getConfig().getMaxDownloadBytes();
        List<Long> calculateSizeLimitsByBitrate = calculateSizeLimitsByBitrate(this.tracks, maxDownloadBytes);
        int i = 0;
        for (Object obj : singletonList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            ((TrackDownload) obj).setSizeLimit(((i < 0 || i >= calculateSizeLimitsByBitrate.size()) ? Long.valueOf(maxDownloadBytes / singletonList.size()) : calculateSizeLimitsByBitrate.get(i)).longValue());
            i = i2;
        }
        return singletonList;
    }

    private final List<DownloadResult> runParallelDownloads(List<TrackDownload> downloads) {
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(this.owningExecutor);
        Iterator<T> it = downloads.iterator();
        while (it.hasNext()) {
            executorCompletionService.submit((TrackDownload) it.next());
        }
        int size = downloads.size();
        DownloadResult[] downloadResultArr = new DownloadResult[size];
        for (int i = 0; i < size; i++) {
            downloadResultArr[i] = null;
        }
        try {
            int size2 = downloads.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Future poll = executorCompletionService.poll(this.trackPreloadTimeoutInSec, TimeUnit.SECONDS);
                if (poll == null) {
                    throw new PreloadException.TracksDownloadTimeout("Track preload is not complete in " + this.trackPreloadTimeoutInSec + " seconds");
                }
                DownloadResult downloadResult = (DownloadResult) poll.get();
                Iterator<TrackDownload> it2 = downloads.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (jl40.l(it2.next().getId(), downloadResult.getDownloadId())) {
                        break;
                    }
                    i3++;
                }
                Integer valueOf = Integer.valueOf(i3);
                if (i3 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    downloadResultArr[valueOf.intValue()] = downloadResult;
                }
            }
            return j73.A(downloadResultArr);
        } catch (Throwable th) {
            throw handleDownloaderException(th);
        }
    }

    public final void cancel() {
        this.wasCanceled = true;
        Iterator<T> it = this.downloads.iterator();
        while (it.hasNext()) {
            ((TrackDownload) it.next()).cancel(true);
        }
    }

    public final List<DownloadResult> download() {
        List<TrackDownload> prepareDownloads = prepareDownloads();
        this.downloads = prepareDownloads;
        List<DownloadResult> runParallelDownloads = runParallelDownloads(prepareDownloads);
        h5z0.a.h("download results=" + runParallelDownloads, new Object[0]);
        return runParallelDownloads;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u0004*\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/preload_manager/TracksPreloader$Companion;", "", "()V", "isDynamic", "", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "Lru/yandex/video/m3/preload_manager/PreloadTracksInfo;", "isDynamic$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isDynamic$video_player_internalRelease(List<? extends PreloadTrackInfo> list) {
            List<? extends PreloadTrackInfo> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (PreloadTrackInfo preloadTrackInfo : list2) {
                ExoPlayerPreloadTrackInfo exoPlayerPreloadTrackInfo = preloadTrackInfo instanceof ExoPlayerPreloadTrackInfo ? (ExoPlayerPreloadTrackInfo) preloadTrackInfo : null;
                if (exoPlayerPreloadTrackInfo != null && exoPlayerPreloadTrackInfo.getIsDynamic()) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }
}
