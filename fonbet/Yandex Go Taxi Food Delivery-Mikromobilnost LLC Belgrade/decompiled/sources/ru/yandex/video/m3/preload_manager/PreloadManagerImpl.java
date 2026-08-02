package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import android.os.Handler;
import defpackage.b64;
import defpackage.db7;
import defpackage.g8e;
import defpackage.ijs;
import defpackage.ip4;
import defpackage.j73;
import defpackage.jl40;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.sls;
import defpackage.tls;
import defpackage.tw21;
import defpackage.zy11;
import java.io.Closeable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.ExoRenderersFactory;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.SimpleIndexGenerator;
import ru.yandex.video.m3.player.abr.AesthetePreferenceProvider;
import ru.yandex.video.m3.player.abr.UserQualityRepository;
import ru.yandex.video.m3.player.impl.SurfaceSizeHolderInternal;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.PreloadManager;
import ru.yandex.video.m3.util.UriUtilsKt;

@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 z2\u00020\u0001:\u0001zBã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020$\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u0002012\f\u00105\u001a\b\u0012\u0004\u0012\u00020104H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000201H\u0002¢\u0006\u0004\b8\u00103J\u0017\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010@\u001a\u00020=H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ'\u0010J\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u0002012\u0006\u0010D\u001a\u00020\u00122\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u0002012\u0006\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u000201H\u0016¢\u0006\u0004\bP\u00103R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010SR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010TR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010UR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010VR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010WR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010XR\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010XR\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010XR\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010XR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010YR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010ZR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010[R\u001e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00160c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u00109\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadManagerImpl;", "Lru/yandex/video/m3/preload_manager/PreloadManager;", "Ljava/util/concurrent/ExecutorService;", "workersExecutorService", "", "maxSimultaneousDownloads", "downloaderExecutorService", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "downloaderFactory", "Lra7;", "cache", "Ldb7;", "manifestDataSourceFactory", "Lip4;", "bandwidthMeter", "Lru/yandex/video/m3/player/ExoRenderersFactory;", "renderersFactory", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Lru/yandex/video/m3/preload_manager/TrackSelectorFactoryBuilder;", "trackSelectorFactoryBuilder", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "listener", "", "Lru/yandex/video/m3/preload_manager/PreloadObserver;", "observers", "Lru/yandex/video/m3/player/impl/utils/VsidGenerator;", "vsidGenerator", "", "trackFetchTimeoutInSec", "trackPreloadTimeoutInSec", "Lpb7;", "cacheKeyFactory", "Landroid/os/Handler;", "handler", "", "releaseCacheOnShutdown", "enableHevc", "ignoreMinHeightWithService", "ignoreMaxHeightWithService", "Lru/yandex/video/m3/player/abr/UserQualityRepository;", "userQualityRepository", "Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "aesthetePreferenceProvider", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "surfaceSizeHolder", "<init>", "(Ljava/util/concurrent/ExecutorService;ILjava/util/concurrent/ExecutorService;Lru/yandex/video/m3/preload/YandexDownloaderFactory;Lra7;Ldb7;Lip4;Lru/yandex/video/m3/player/ExoRenderersFactory;Ltls;Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;Ljava/util/List;Lru/yandex/video/m3/player/impl/utils/VsidGenerator;JJLpb7;Landroid/os/Handler;ZZZZLru/yandex/video/m3/player/abr/UserQualityRepository;Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;)V", "Lzy11;", "cancelAllPreloads", "()V", "Lkotlin/Function0;", "runnable", "postOrBatchOrRun", "(Lsls;)V", "updateSurfaceSizeHolder", "preloadListener", "addListener", "(Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;)V", "removeListener", "Ljava/io/Closeable;", "batchMode$video_player_internalRelease", "()Ljava/io/Closeable;", "batchMode", "Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "startTransaction", "()Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "", "startPreload", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;)Ljava/lang/String;", "setPriority", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "cancelPreload", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "shutdown", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "Lra7;", "Ljava/util/List;", "Lru/yandex/video/m3/player/impl/utils/VsidGenerator;", "Lpb7;", "Landroid/os/Handler;", "Z", "Lru/yandex/video/m3/player/abr/UserQualityRepository;", "Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/yandex/video/m3/preload_manager/PreloadManagerTasksBatcher;", "batcherReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue;", "queue", "Lru/yandex/video/m3/preload_manager/PreloadRequestsQueue;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "listeners", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "Lru/yandex/video/m3/preload_manager/PreloadListenerImpl;", "Lru/yandex/video/m3/preload_manager/PreloadListenerImpl;", "Lru/yandex/video/m3/preload_manager/YandexDownloadHelperFactory;", "downloadHelperFactory", "Lru/yandex/video/m3/preload_manager/YandexDownloadHelperFactory;", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "preloadTrackInfoRepository", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfoRepository;", "Lru/yandex/video/m3/preload_manager/PreloadWorkerJobFactory;", "jobFactory", "Lru/yandex/video/m3/preload_manager/PreloadWorkerJobFactory;", "Lru/yandex/video/m3/preload_manager/PreloadWorkers;", "workers", "Lru/yandex/video/m3/preload_manager/PreloadWorkers;", "Lkotlin/text/Regex;", "vsidRegex", "Lkotlin/text/Regex;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadManagerImpl implements PreloadManager {
    public static final String TAG = "PreloadManagerImpl";
    private AesthetePreferenceProvider aesthetePreferenceProvider;
    private AtomicReference<PreloadManagerTasksBatcher> batcherReference;
    private final ra7 cache;
    private final pb7 cacheKeyFactory;
    private final YandexDownloadHelperFactory downloadHelperFactory;
    private final ExecutorService downloaderExecutorService;
    private final YandexDownloaderFactory downloaderFactory;
    private final boolean enableHevc;
    private final Handler handler;
    private final boolean ignoreMaxHeightWithService;
    private final boolean ignoreMinHeightWithService;
    private final PreloadWorkerJobFactory jobFactory;
    private final ObserverDispatcher<PreloadManager.Listener> listeners;
    private final TimberPlayerLogger logger;
    private final List<PreloadObserver> observers;
    private final PreloadListenerImpl preloadListener;
    private final PreloadTrackInfoRepository preloadTrackInfoRepository;
    private final PreloadRequestsQueue queue;
    private final boolean releaseCacheOnShutdown;
    private final SurfaceSizeHolderInternal surfaceSizeHolder;
    private UserQualityRepository userQualityRepository;
    private final VsidGenerator vsidGenerator;
    private final Regex vsidRegex;
    private final PreloadWorkers workers;
    public static final int $stable = 8;
    private static final Set<String> SUPPORTED_FILE_EXTENSIONS = j73.f0(new String[]{"mpd", "mp4", "webm", "mkv"});

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadManagerImpl(ExecutorService executorService, int i, ExecutorService executorService2, YandexDownloaderFactory yandexDownloaderFactory, ra7 ra7Var, db7 db7Var, ip4 ip4Var, ExoRenderersFactory exoRenderersFactory, tls tlsVar, PreloadManager.Listener listener, List<? extends PreloadObserver> list, VsidGenerator vsidGenerator, long j, long j2, pb7 pb7Var, Handler handler, boolean z, boolean z2, boolean z3, boolean z4, UserQualityRepository userQualityRepository, AesthetePreferenceProvider aesthetePreferenceProvider, SurfaceSizeHolderInternal surfaceSizeHolderInternal) {
        this.downloaderExecutorService = executorService2;
        this.downloaderFactory = yandexDownloaderFactory;
        this.cache = ra7Var;
        this.observers = list;
        this.vsidGenerator = vsidGenerator;
        this.cacheKeyFactory = pb7Var;
        this.handler = handler;
        this.releaseCacheOnShutdown = z;
        this.enableHevc = z2;
        this.ignoreMinHeightWithService = z3;
        this.ignoreMaxHeightWithService = z4;
        this.userQualityRepository = userQualityRepository;
        this.aesthetePreferenceProvider = aesthetePreferenceProvider;
        this.surfaceSizeHolder = surfaceSizeHolderInternal;
        this.batcherReference = new AtomicReference<>();
        PreloadRequestsQueue preloadRequestsQueue = new PreloadRequestsQueue(handler);
        this.queue = preloadRequestsQueue;
        ObserverDispatcher<PreloadManager.Listener> observerDispatcher = new ObserverDispatcher<>();
        this.listeners = observerDispatcher;
        this.logger = new TimberPlayerLogger();
        if (listener != null) {
            addListener(listener);
        }
        PreloadListenerImpl preloadListenerImpl = new PreloadListenerImpl(observerDispatcher, list);
        this.preloadListener = preloadListenerImpl;
        YandexDownloadHelperFactory yandexDownloadHelperFactory = new YandexDownloadHelperFactory(tlsVar, exoRenderersFactory, ip4Var, db7Var, new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerImpl$downloadHelperFactory$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final SurfaceSizeHolderInternal invoke() {
                SurfaceSizeHolderInternal surfaceSizeHolderInternal2;
                surfaceSizeHolderInternal2 = PreloadManagerImpl.this.surfaceSizeHolder;
                return surfaceSizeHolderInternal2;
            }
        });
        this.downloadHelperFactory = yandexDownloadHelperFactory;
        PreloadTrackInfoRepository preloadTrackInfoRepository = new PreloadTrackInfoRepository(ra7Var, ip4Var, yandexDownloaderFactory, yandexDownloadHelperFactory, j, pb7Var, handler);
        this.preloadTrackInfoRepository = preloadTrackInfoRepository;
        PreloadWorkerJobFactory preloadWorkerJobFactory = new PreloadWorkerJobFactory(yandexDownloaderFactory, executorService, handler, preloadTrackInfoRepository, j2, ra7Var, pb7Var);
        this.jobFactory = preloadWorkerJobFactory;
        this.workers = new PreloadWorkers(i, preloadWorkerJobFactory, handler, preloadRequestsQueue, preloadListenerImpl);
        this.vsidRegex = new Regex("[0-9a-z]{44}x[A-Z]{3}x\\d{4}x\\d{10}");
    }

    private final void cancelAllPreloads() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "cancelAllPreloads", null, new Object[0], 4, null);
        }
        postOrBatchOrRun(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerImpl$cancelAllPreloads$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m895invoke() {
                TimberPlayerLogger timberPlayerLogger2;
                PreloadRequestsQueue preloadRequestsQueue;
                PreloadWorkers preloadWorkers;
                PreloadListenerImpl preloadListenerImpl;
                try {
                    preloadRequestsQueue = PreloadManagerImpl.this.queue;
                    List<PreloadRequest> removeAllRequests = preloadRequestsQueue.removeAllRequests();
                    PreloadManagerImpl preloadManagerImpl = PreloadManagerImpl.this;
                    for (PreloadRequest preloadRequest : removeAllRequests) {
                        preloadListenerImpl = preloadManagerImpl.preloadListener;
                        preloadListenerImpl.onCancel(preloadRequest, new PreloadException.CanceledOperationException.CanceledPendingRequest("Canceled pending requests while waiting in queue", null, 2, null));
                    }
                    preloadWorkers = PreloadManagerImpl.this.workers;
                    preloadWorkers.cancelAllRequest();
                } catch (Throwable th) {
                    timberPlayerLogger2 = PreloadManagerImpl.this.logger;
                    if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                        PlayerLogger.error$default(timberPlayerLogger2, PreloadManagerImpl.TAG, "cancelAllPreloads", null, th, new Object[0], 4, null);
                    }
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m895invoke();
                return zy11.a;
            }
        });
    }

    private final void postOrBatchOrRun(sls runnable) {
        PreloadManagerTasksBatcher preloadManagerTasksBatcher = this.batcherReference.get();
        if (preloadManagerTasksBatcher != null) {
            preloadManagerTasksBatcher.schedule(runnable);
        } else {
            tw21.a0(this.handler, new ijs(27, runnable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSurfaceSizeHolder() {
        Integer lastUserSelectedVideoHeightPx;
        SurfaceSizeHolderInternal surfaceSizeHolderInternal = this.surfaceSizeHolder;
        UserQualityRepository userQualityRepository = this.userQualityRepository;
        if (userQualityRepository != null && (lastUserSelectedVideoHeightPx = userQualityRepository.getLastUserSelectedVideoHeightPx()) != null) {
            surfaceSizeHolderInternal.setUserQuality(lastUserSelectedVideoHeightPx);
        }
        AesthetePreferenceProvider aesthetePreferenceProvider = this.aesthetePreferenceProvider;
        if (aesthetePreferenceProvider != null) {
            surfaceSizeHolderInternal.setPreferHD(aesthetePreferenceProvider.getPreferHD());
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void addListener(PreloadManager.Listener preloadListener) {
        this.listeners.add((ObserverDispatcher<PreloadManager.Listener>) preloadListener);
    }

    public final Closeable batchMode$video_player_internalRelease() {
        return this.workers.batchMode();
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void cancelPreload(final VideoData videoData) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "cancelPreload", "called with: videoData = " + videoData, new Object[0]);
        }
        postOrBatchOrRun(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerImpl$cancelPreload$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m896invoke() {
                PreloadListenerImpl preloadListenerImpl;
                PreloadRequestsQueue preloadRequestsQueue;
                PreloadWorkers preloadWorkers;
                PreloadWorkers preloadWorkers2;
                PreloadRequestsQueue preloadRequestsQueue2;
                PreloadListenerImpl preloadListenerImpl2;
                try {
                    String buildPreloadKey$video_player_internalRelease = PreloadRequest.INSTANCE.buildPreloadKey$video_player_internalRelease(VideoData.this);
                    preloadRequestsQueue = this.queue;
                    PreloadRequest findRequest = preloadRequestsQueue.findRequest(buildPreloadKey$video_player_internalRelease);
                    if (findRequest != null) {
                        PreloadManagerImpl preloadManagerImpl = this;
                        preloadRequestsQueue2 = preloadManagerImpl.queue;
                        preloadRequestsQueue2.removeRequest(findRequest);
                        preloadListenerImpl2 = preloadManagerImpl.preloadListener;
                        preloadListenerImpl2.onCancel(findRequest, new PreloadException.CanceledOperationException.CanceledPendingRequest("Canceled pending request while waiting in queue", null, 2, null));
                    }
                    preloadWorkers = this.workers;
                    PreloadRequest findRequest2 = preloadWorkers.findRequest(buildPreloadKey$video_player_internalRelease);
                    if (findRequest2 != null) {
                        preloadWorkers2 = this.workers;
                        preloadWorkers2.cancelRequest(findRequest2);
                    }
                } catch (Throwable th) {
                    preloadListenerImpl = this.preloadListener;
                    preloadListenerImpl.onApiError(VideoData.this, new PreloadException.ApiCallError(g8e.s(th, new StringBuilder("Error in cancelPriority: ")), th, 0L, 4, null));
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m896invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void removeListener(PreloadManager.Listener preloadListener) {
        this.listeners.remove(preloadListener);
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void setPriority(final VideoData videoData, final PreloadPriority priority) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "setPriority", "called with: videoData = " + videoData + ", priority = " + priority, new Object[0]);
        }
        postOrBatchOrRun(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerImpl$setPriority$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m897invoke() {
                PreloadListenerImpl preloadListenerImpl;
                PreloadRequestsQueue preloadRequestsQueue;
                PreloadWorkers preloadWorkers;
                PreloadWorkers preloadWorkers2;
                PreloadRequestsQueue preloadRequestsQueue2;
                try {
                    String buildPreloadKey$video_player_internalRelease = PreloadRequest.INSTANCE.buildPreloadKey$video_player_internalRelease(VideoData.this);
                    preloadRequestsQueue = this.queue;
                    PreloadRequest findRequest = preloadRequestsQueue.findRequest(buildPreloadKey$video_player_internalRelease);
                    if (findRequest != null) {
                        PreloadPriority preloadPriority = priority;
                        PreloadManagerImpl preloadManagerImpl = this;
                        if (!jl40.l(findRequest.getPriority(), preloadPriority)) {
                            preloadRequestsQueue2 = preloadManagerImpl.queue;
                            preloadRequestsQueue2.setPriority(findRequest, preloadPriority);
                        }
                    }
                    preloadWorkers = this.workers;
                    PreloadRequest findRequest2 = preloadWorkers.findRequest(buildPreloadKey$video_player_internalRelease);
                    if (findRequest2 != null) {
                        PreloadPriority preloadPriority2 = priority;
                        PreloadManagerImpl preloadManagerImpl2 = this;
                        if (jl40.l(findRequest2.getPriority(), preloadPriority2)) {
                            return;
                        }
                        preloadWorkers2 = preloadManagerImpl2.workers;
                        preloadWorkers2.setPriority(findRequest2, preloadPriority2);
                    }
                } catch (Throwable th) {
                    preloadListenerImpl = this.preloadListener;
                    preloadListenerImpl.onApiError(VideoData.this, new PreloadException.ApiCallError(g8e.s(th, new StringBuilder("Error in setPriority: ")), th, 0L, 4, null));
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m897invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void shutdown() {
        this.workers.shutdown();
        cancelAllPreloads();
        if (this.releaseCacheOnShutdown) {
            this.cache.release();
        }
        ExecutorService executorService = this.downloaderExecutorService;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public String startPreload(final VideoData videoData, final PreloadConfig config, final PreloadPriority priority) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "startPreload", "called with: videoData = " + videoData + ", config = " + config + ", priority = " + priority, new Object[0]);
        }
        String vsid = config.getVsid();
        if (vsid == null) {
            vsid = this.vsidGenerator.generatePreloaderVsid();
        }
        final String str = vsid;
        postOrBatchOrRun(new sls() { // from class: ru.yandex.video.m3.preload_manager.PreloadManagerImpl$startPreload$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m898invoke() {
                boolean z;
                boolean z2;
                boolean z3;
                Set set;
                PreloadListenerImpl preloadListenerImpl;
                PreloadRequestsQueue preloadRequestsQueue;
                PreloadListenerImpl preloadListenerImpl2;
                PreloadListenerImpl preloadListenerImpl3;
                Regex regex;
                PreloadListenerImpl preloadListenerImpl4;
                PreloadManagerImpl.this.updateSurfaceSizeHolder();
                VideoData videoData2 = videoData;
                PreloadConfig preloadConfig = config;
                PreloadPriority preloadPriority = priority;
                String str2 = str;
                Integer sourceIndex = preloadConfig.getSourceIndex();
                int intValue = sourceIndex != null ? sourceIndex.intValue() : 0;
                IndexGenerator eventIndexGenerator = config.getEventIndexGenerator();
                if (eventIndexGenerator == null) {
                    eventIndexGenerator = new SimpleIndexGenerator();
                }
                z = PreloadManagerImpl.this.enableHevc;
                z2 = PreloadManagerImpl.this.ignoreMinHeightWithService;
                z3 = PreloadManagerImpl.this.ignoreMaxHeightWithService;
                PreloadRequest preloadRequest = new PreloadRequest(videoData2, preloadConfig, preloadPriority, str2, intValue, eventIndexGenerator, z, z2, z3, config.getOmitAudio());
                if (config.getVsid() != null) {
                    regex = PreloadManagerImpl.this.vsidRegex;
                    if (!regex.h(config.getVsid())) {
                        preloadListenerImpl4 = PreloadManagerImpl.this.preloadListener;
                        preloadListenerImpl4.onApiError(preloadRequest, new PreloadException.ApiCallError("Incorrect vsid in PreloadConfig: " + config.getVsid(), null, 0L, 6, null));
                        return;
                    }
                }
                Uri uriOrNull = UriUtilsKt.toUriOrNull(videoData.getManifestUrl());
                String fileExtension = uriOrNull != null ? UriUtilsKt.getFileExtension(uriOrNull) : null;
                set = PreloadManagerImpl.SUPPORTED_FILE_EXTENSIONS;
                boolean G = kotlin.collections.a.G(set, fileExtension);
                PreloadManagerImpl preloadManagerImpl = PreloadManagerImpl.this;
                if (!G) {
                    preloadListenerImpl3 = preloadManagerImpl.preloadListener;
                    preloadListenerImpl3.onCancel(preloadRequest, new PreloadException.CanceledOperationException.UnsupportedMediaType(b64.j(fileExtension, " format is not supported for preload."), null, 2, null));
                    return;
                }
                try {
                    preloadRequestsQueue = preloadManagerImpl.queue;
                    PreloadRequestsQueue.addRequest$default(preloadRequestsQueue, preloadRequest, false, 2, null);
                    preloadListenerImpl2 = PreloadManagerImpl.this.preloadListener;
                    preloadListenerImpl2.onRequestQueued(preloadRequest);
                } catch (Throwable th) {
                    preloadListenerImpl = PreloadManagerImpl.this.preloadListener;
                    preloadListenerImpl.onApiError(preloadRequest, new PreloadException.ApiCallError(g8e.s(th, new StringBuilder("Error in startPreload: ")), th, 0L, 4, null));
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m898invoke();
                return zy11.a;
            }
        });
        return str;
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public PreloaderTransaction startTransaction() {
        return new PreloaderTransactionImpl(this, this.handler);
    }

    public /* synthetic */ PreloadManagerImpl(ExecutorService executorService, int i, ExecutorService executorService2, YandexDownloaderFactory yandexDownloaderFactory, ra7 ra7Var, db7 db7Var, ip4 ip4Var, ExoRenderersFactory exoRenderersFactory, tls tlsVar, PreloadManager.Listener listener, List list, VsidGenerator vsidGenerator, long j, long j2, pb7 pb7Var, Handler handler, boolean z, boolean z2, boolean z3, boolean z4, UserQualityRepository userQualityRepository, AesthetePreferenceProvider aesthetePreferenceProvider, SurfaceSizeHolderInternal surfaceSizeHolderInternal, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService, i, executorService2, yandexDownloaderFactory, ra7Var, db7Var, ip4Var, exoRenderersFactory, tlsVar, listener, list, (i2 & 2048) != 0 ? new VsidGenerator(new SystemTimeProvider()) : vsidGenerator, j, j2, pb7Var, handler, z, z2, z3, z4, (1048576 & i2) != 0 ? null : userQualityRepository, (i2 & 2097152) != 0 ? null : aesthetePreferenceProvider, surfaceSizeHolderInternal);
    }
}
