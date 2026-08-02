package ru.yandex.video.m3.preload_manager;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.SimpleIndexGenerator;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/video/m3/preload_manager/NoOpPreloadManager;", "Lru/yandex/video/m3/preload_manager/PreloadManager;", "Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker;", "preloadEventTracker", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "cacheInitException", "Lru/yandex/video/m3/player/impl/utils/VsidGenerator;", "vsidGenerator", "<init>", "(Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker;Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;Lru/yandex/video/m3/player/impl/utils/VsidGenerator;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "priority", "", "startPreload", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;)Ljava/lang/String;", "Lzy11;", "setPriority", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "cancelPreload", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "startTransaction", "()Lru/yandex/video/m3/preload_manager/PreloaderTransaction;", "shutdown", "()V", "Lru/yandex/video/m3/preload_manager/tracking/PreloadEventTracker;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "Lru/yandex/video/m3/player/impl/utils/VsidGenerator;", "Landroid/util/LruCache;", "videoDataLogCache", "Landroid/util/LruCache;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpPreloadManager implements PreloadManager {
    public static final int $stable = 8;
    private final PreloadException.CacheInitException cacheInitException;
    private final PreloadEventTracker preloadEventTracker;
    private final LruCache<VideoData, String> videoDataLogCache;
    private final VsidGenerator vsidGenerator;

    public NoOpPreloadManager(PreloadEventTracker preloadEventTracker, PreloadException.CacheInitException cacheInitException, VsidGenerator vsidGenerator) {
        this.preloadEventTracker = preloadEventTracker;
        this.cacheInitException = cacheInitException;
        this.vsidGenerator = vsidGenerator;
        this.videoDataLogCache = new LruCache<>(64);
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void cancelPreload(VideoData videoData) {
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void setPriority(VideoData videoData, PreloadPriority priority) {
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public void shutdown() {
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public String startPreload(VideoData videoData, PreloadConfig config, PreloadPriority priority) {
        String str = this.videoDataLogCache.get(videoData);
        if (str != null) {
            return str;
        }
        String generatePreloaderVsid = this.vsidGenerator.generatePreloaderVsid();
        Integer sourceIndex = config.getSourceIndex();
        PreloadRequest preloadRequest = new PreloadRequest(videoData, config, priority, generatePreloaderVsid, sourceIndex != null ? sourceIndex.intValue() : 0, new SimpleIndexGenerator(), false, false, false, false, 960, null);
        PreloadException preloadException = this.cacheInitException;
        if (preloadException == null) {
            preloadException = new PreloadException.UnknownError("Failed to initialize cache, but no exception passed to NoOpPreloadManager", null, 2, null);
        }
        this.preloadEventTracker.onJobError(preloadRequest, preloadException);
        this.videoDataLogCache.put(videoData, generatePreloaderVsid);
        return generatePreloaderVsid;
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadManager
    public PreloaderTransaction startTransaction() {
        return new PreloaderTransaction() { // from class: ru.yandex.video.m3.preload_manager.NoOpPreloadManager$startTransaction$1
            @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
            public void cancelPreload(VideoData videoData) {
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
            public void commit() {
            }

            @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
            public boolean getInProgress() {
                return true;
            }

            @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
            public void revert() {
            }

            @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
            public void setPriority(VideoData videoData, PreloadPriority priority) {
            }

            @Override // ru.yandex.video.m3.preload_manager.PreloaderTransaction
            public void startPreload(VideoData videoData, PreloadConfig config, PreloadPriority priority) {
            }
        };
    }

    public /* synthetic */ NoOpPreloadManager(PreloadEventTracker preloadEventTracker, PreloadException.CacheInitException cacheInitException, VsidGenerator vsidGenerator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preloadEventTracker, cacheInitException, (i & 4) != 0 ? new VsidGenerator(new SystemTimeProvider()) : vsidGenerator);
    }
}
