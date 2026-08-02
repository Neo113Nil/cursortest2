package ru.yandex.video.m3.preload_manager;

import android.os.Handler;
import defpackage.bms;
import defpackage.pb7;
import defpackage.ra7;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u001220\u0010\u001c\u001a,\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a0\u0014j\u0002`\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%¨\u0006&"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadWorkerJobFactory;", "", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "downloaderFactory", "Ljava/util/concurrent/ExecutorService;", "executorService", "Landroid/os/Handler;", "launcherHandler", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "preloadTrackInfoRepository", "", "trackPreloadTimeoutInSec", "Lra7;", "cache", "Lpb7;", "cacheKeyFactory", "<init>", "(Lru/yandex/video/m3/preload/YandexDownloaderFactory;Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;JLra7;Lpb7;)V", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "Lkotlin/Function4;", "Lru/yandex/video/m3/preload_manager/PreloadWorkerJobHandle;", "Lru/yandex/video/m3/preload_manager/JobResult;", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "Lru/yandex/video/m3/preload_manager/PreloadException;", "Lzy11;", "Lru/yandex/video/m3/preload_manager/JobFinishedCallback;", "onFinished", "launchJob", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lbms;)Lru/yandex/video/m3/preload_manager/PreloadWorkerJobHandle;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "J", "Lra7;", "Lpb7;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadWorkerJobFactory {
    public static final int $stable = 8;
    private final ra7 cache;
    private final pb7 cacheKeyFactory;
    private final YandexDownloaderFactory downloaderFactory;
    private final ExecutorService executorService;
    private final Handler launcherHandler;
    private final PreloadTrackInfoRepository preloadTrackInfoRepository;
    private final long trackPreloadTimeoutInSec;

    public PreloadWorkerJobFactory(YandexDownloaderFactory yandexDownloaderFactory, ExecutorService executorService, Handler handler, PreloadTrackInfoRepository preloadTrackInfoRepository, long j, ra7 ra7Var, pb7 pb7Var) {
        this.downloaderFactory = yandexDownloaderFactory;
        this.executorService = executorService;
        this.launcherHandler = handler;
        this.preloadTrackInfoRepository = preloadTrackInfoRepository;
        this.trackPreloadTimeoutInSec = j;
        this.cache = ra7Var;
        this.cacheKeyFactory = pb7Var;
    }

    public final PreloadWorkerJobHandle launchJob(PreloadRequest request, bms onFinished) {
        PreloadWorkerJobHandle preloadWorkerJobHandle = new PreloadWorkerJobHandle(this.downloaderFactory, this.executorService, this.launcherHandler, this.preloadTrackInfoRepository, this.trackPreloadTimeoutInSec, this.cache, this.cacheKeyFactory);
        preloadWorkerJobHandle.launch(request, onFinished);
        return preloadWorkerJobHandle;
    }
}
