package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import defpackage.bms;
import defpackage.che;
import defpackage.f9h;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.l9;
import defpackage.npg;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.tw21;
import defpackage.wnb0;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00122\u0010\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010\u0014JG\u0010)\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$20\u0010(\u001a,\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00120&j\u0002`'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010\u0014J\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R@\u0010(\u001a,\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00120&j\u0002`'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010=R\u001a\u0010?\u001a\u0006\u0012\u0002\b\u00030>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadWorkerJobHandle;", "", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "downloaderFactory", "Ljava/util/concurrent/ExecutorService;", "executorService", "Landroid/os/Handler;", "launcherHandler", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "preloadTrackInfoRepository", "", "trackPreloadTimeoutInSec", "Lra7;", "cache", "Lpb7;", "cacheKeyFactory", "<init>", "(Lru/yandex/video/m3/preload/YandexDownloaderFactory;Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;JLra7;Lpb7;)V", "Lzy11;", "body", "()V", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "Lru/yandex/video/m3/preload_manager/PreloadTracksInfo;", "tracks", "initTracksPreloader", "(Ljava/util/List;)V", "Lru/yandex/video/m3/preload_manager/JobResult;", ACSPConstants.STATUS, "Lru/yandex/video/m3/preload_manager/PreloadException;", "error", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "results", "reportFinish", "(Lru/yandex/video/m3/preload_manager/JobResult;Lru/yandex/video/m3/preload_manager/PreloadException;Ljava/util/List;)V", "applyContentMetadataMutationsForCachedManifest", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "Lkotlin/Function4;", "Lru/yandex/video/m3/preload_manager/JobFinishedCallback;", "onFinished", "launch", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lbms;)V", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "changePriority", "(Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "withdraw", "cancel", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "J", "Lra7;", "Lpb7;", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "getRequest", "()Lru/yandex/video/m3/preload_manager/PreloadRequest;", "setRequest", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "Lbms;", "Ljava/util/concurrent/Future;", "future", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/preload_manager/TracksPreloader;", "tracksPreloader", "Lru/yandex/video/m3/preload_manager/TracksPreloader;", "", "<set-?>", "requestResultIsFinal", "Z", "getRequestResultIsFinal", "()Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadWorkerJobHandle {
    private static final String KEY_TIMESTAMP = "timestamp";
    private final ra7 cache;
    private final pb7 cacheKeyFactory;
    private final YandexDownloaderFactory downloaderFactory;
    private final ExecutorService executorService;
    private Future<?> future;
    private final Handler launcherHandler;
    private bms onFinished;
    private final PreloadTrackInfoRepository preloadTrackInfoRepository;
    public volatile PreloadRequest request;
    private boolean requestResultIsFinal = true;
    private final long trackPreloadTimeoutInSec;
    private TracksPreloader tracksPreloader;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public PreloadWorkerJobHandle(YandexDownloaderFactory yandexDownloaderFactory, ExecutorService executorService, Handler handler, PreloadTrackInfoRepository preloadTrackInfoRepository, long j, ra7 ra7Var, pb7 pb7Var) {
        this.downloaderFactory = yandexDownloaderFactory;
        this.executorService = executorService;
        this.launcherHandler = handler;
        this.preloadTrackInfoRepository = preloadTrackInfoRepository;
        this.trackPreloadTimeoutInSec = j;
        this.cache = ra7Var;
        this.cacheKeyFactory = pb7Var;
    }

    private final void applyContentMetadataMutationsForCachedManifest() {
        String buildCacheKey = this.cacheKeyFactory.buildCacheKey(new npg(Uri.parse(getRequest().getManifestUrl())));
        if (((f9h) this.cache.getContentMetadata(buildCacheKey)).b.containsKey("timestamp")) {
            return;
        }
        che cheVar = new che();
        cheVar.a(Long.valueOf(System.currentTimeMillis()), "timestamp");
        this.cache.applyContentMetadataMutations(buildCacheKey, cheVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void body() {
        jl40.l(Looper.myLooper(), this.launcherHandler.getLooper());
        try {
            List<PreloadTrackInfo> fetchTracksSync = this.preloadTrackInfoRepository.fetchTracksSync(getRequest());
            initTracksPreloader(fetchTracksSync);
            List<DownloadResult> download = this.tracksPreloader.download();
            PreloadLiveDashConfig experimentalPreloadLiveDashConfig = getRequest().getConfig().getExperimentalPreloadLiveDashConfig();
            if (experimentalPreloadLiveDashConfig != null && experimentalPreloadLiveDashConfig.getLiveDashPreloadEnabled() && TracksPreloader.INSTANCE.isDynamic$video_player_internalRelease(fetchTracksSync)) {
                applyContentMetadataMutationsForCachedManifest();
            }
            reportFinish$default(this, JobResult.SUCCESS, null, download, 2, null);
        } catch (PreloadException.CanceledOperationException e) {
            reportFinish$default(this, JobResult.CANCELED, e, null, 4, null);
        } catch (PreloadException e2) {
            reportFinish$default(this, JobResult.ERROR, e2, null, 4, null);
        } catch (Throwable th) {
            reportFinish$default(this, JobResult.ERROR, new PreloadException.UnknownError("Unhandled throwable during job execution", th), null, 4, null);
        }
    }

    private final synchronized void initTracksPreloader(List<? extends PreloadTrackInfo> tracks) {
        jl40.l(Looper.myLooper(), this.launcherHandler.getLooper());
        if (Thread.interrupted()) {
            throw new PreloadException.CanceledOperationException.CanceledTracksDownload("Canceled right before downloader creation", null, EmptyList.a, 2, null);
        }
        this.tracksPreloader = new TracksPreloader(tracks, getRequest(), this.downloaderFactory, this.executorService, this.trackPreloadTimeoutInSec);
    }

    private final void reportFinish(JobResult status, PreloadException error, List<DownloadResult> results) {
        tw21.a0(this.launcherHandler, new l9(this, status, results, error, 27));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportFinish$default(PreloadWorkerJobHandle preloadWorkerJobHandle, JobResult jobResult, PreloadException preloadException, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            preloadException = null;
        }
        if ((i & 4) != 0) {
            list = EmptyList.a;
        }
        preloadWorkerJobHandle.reportFinish(jobResult, preloadException, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportFinish$lambda$2(PreloadWorkerJobHandle preloadWorkerJobHandle, JobResult jobResult, List list, PreloadException preloadException) {
        bms bmsVar = preloadWorkerJobHandle.onFinished;
        if (bmsVar == null) {
            bmsVar = null;
        }
        bmsVar.invoke(preloadWorkerJobHandle, jobResult, list, preloadException);
    }

    public final synchronized void cancel() {
        try {
            jl40.l(Looper.myLooper(), this.launcherHandler.getLooper());
            h5z0.a.a("downloading interrupted by PreloadWorkerJobData.cancel", new Object[0]);
            TracksPreloader tracksPreloader = this.tracksPreloader;
            if (tracksPreloader != null) {
                tracksPreloader.cancel();
            }
            Future<?> future = this.future;
            if (future == null) {
                future = null;
            }
            future.cancel(true);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void changePriority(PreloadPriority priority) {
        jl40.l(Looper.myLooper(), this.launcherHandler.getLooper());
        setRequest(PreloadRequest.copy$default(getRequest(), null, null, priority, null, 0, null, false, false, false, false, 1019, null));
    }

    public final PreloadRequest getRequest() {
        PreloadRequest preloadRequest = this.request;
        if (preloadRequest != null) {
            return preloadRequest;
        }
        return null;
    }

    public final boolean getRequestResultIsFinal() {
        return this.requestResultIsFinal;
    }

    public final void launch(PreloadRequest request, bms onFinished) {
        jl40.l(Looper.myLooper(), this.launcherHandler.getLooper());
        setRequest(request);
        this.onFinished = onFinished;
        this.future = this.executorService.submit(new wnb0(27, this));
    }

    public final void setRequest(PreloadRequest preloadRequest) {
        this.request = preloadRequest;
    }

    public final void withdraw() {
        this.requestResultIsFinal = false;
        cancel();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadWorkerJobHandle$Companion;", "", "()V", "KEY_TIMESTAMP", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
