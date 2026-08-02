package ru.yandex.video.m3.list_player_manager.impl.preload;

import android.os.Handler;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.gw00;
import defpackage.hek0;
import defpackage.t601;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository;
import ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager;
import ru.yandex.video.m3.list_player_manager.impl.preload.cache.DataCache;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\u00172\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0016¢\u0006\u0004\b%\u0010$J\u0019\u0010(\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00100R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u000302018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManagerImpl;", "Lru/yandex/video/m3/data/dto/VideoData;", "T", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager;", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "videoDataRepository", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "videoDataCache", "Ljava/util/concurrent/ExecutorService;", "executor", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;)V", "", "", "contentIds", "", "Lkotlin/Result;", "loadFromVideoDataRepository", "(Ljava/util/List;)Ljava/util/Map;", "loadFromCache", "results", "Lzy11;", "storeToCache", "(Ljava/util/Map;)V", TarifficatorScenarioActivity.RESULT_KEY, "postResult", "", "throwable", "Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "wrapPreloadException", "(Ljava/lang/Throwable;)Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "", "videoContentIds", "startPreload", "(Ljava/lang/Iterable;)V", "cancelPreload", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;", "preloadListener", "setListener", "(Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;)V", "shutDown", "()V", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "Lru/yandex/video/m3/list_player_manager/impl/preload/cache/DataCache;", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Lru/yandex/video/m3/list_player_manager/impl/preload/VideoDataPreloadManager$VideoDataPreloadListener;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/Future;", "activeVideoDataRequests", "Ljava/util/concurrent/ConcurrentHashMap;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoDataPreloadManagerImpl<T extends VideoData> implements VideoDataPreloadManager {
    public static final int $stable = 8;
    private final ConcurrentHashMap<String, Future<?>> activeVideoDataRequests = new ConcurrentHashMap<>();
    private final Handler callbackHandler;
    private final ExecutorService executor;
    private VideoDataPreloadManager.VideoDataPreloadListener preloadListener;
    private final DataCache<T> videoDataCache;
    private final VideoDataRepository<T> videoDataRepository;

    public VideoDataPreloadManagerImpl(VideoDataRepository<T> videoDataRepository, DataCache<T> dataCache, ExecutorService executorService, Handler handler) {
        this.videoDataRepository = videoDataRepository;
        this.videoDataCache = dataCache;
        this.executor = executorService;
        this.callbackHandler = handler;
    }

    private final Map<String, Result<T>> loadFromCache(List<String> contentIds) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : contentIds) {
            T t = this.videoDataCache.get(str);
            if (t != null) {
                linkedHashMap.put(str, new Result(t));
            }
        }
        return linkedHashMap;
    }

    private final Map<String, Result<T>> loadFromVideoDataRepository(List<String> contentIds) {
        return this.videoDataRepository.getVideoData(contentIds);
    }

    private final void postResult(Map<String, ? extends Result<? extends T>> result) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, ? extends Result<? extends T>> entry : result.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue().getValue();
            VideoData videoData = (VideoData) (value instanceof Result.Failure ? null : value);
            if (videoData != null) {
                linkedHashMap.put(key, videoData);
            } else {
                linkedHashMap2.put(key, wrapPreloadException(Result.a(value)));
            }
        }
        this.callbackHandler.post(new hek0(result, this, linkedHashMap, linkedHashMap2, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postResult$lambda$14(Map map, VideoDataPreloadManagerImpl videoDataPreloadManagerImpl, Map map2, Map map3) {
        VideoDataPreloadManager.VideoDataPreloadListener videoDataPreloadListener;
        VideoDataPreloadManager.VideoDataPreloadListener videoDataPreloadListener2;
        Set keySet = map.keySet();
        ConcurrentHashMap<String, Future<?>> concurrentHashMap = videoDataPreloadManagerImpl.activeVideoDataRequests;
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((String) it.next());
        }
        if (!map2.isEmpty() && (videoDataPreloadListener2 = videoDataPreloadManagerImpl.preloadListener) != null) {
            videoDataPreloadListener2.onVideoDataLoaded(map2);
        }
        if (map3.isEmpty() || (videoDataPreloadListener = videoDataPreloadManagerImpl.preloadListener) == null) {
            return;
        }
        videoDataPreloadListener.onVideoDataError(map3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void startPreload$lambda$4(List list, VideoDataPreloadManagerImpl videoDataPreloadManagerImpl) {
        Object failure;
        try {
            Map loadFromCache = videoDataPreloadManagerImpl.loadFromCache(list);
            videoDataPreloadManagerImpl.postResult(loadFromCache);
            list = a.k0(list, loadFromCache.keySet());
            if (!list.isEmpty()) {
                Map loadFromVideoDataRepository = videoDataPreloadManagerImpl.loadFromVideoDataRepository(list);
                videoDataPreloadManagerImpl.storeToCache(loadFromVideoDataRepository);
                videoDataPreloadManagerImpl.postResult(loadFromVideoDataRepository);
            }
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            List list2 = list;
            int d = gw00.d(tcc.n(list2, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : list2) {
                linkedHashMap.put(obj, new Result(new Result.Failure(a)));
            }
            videoDataPreloadManagerImpl.postResult(linkedHashMap);
        }
    }

    private final void storeToCache(Map<String, ? extends Result<? extends T>> results) {
        for (Map.Entry<String, ? extends Result<? extends T>> entry : results.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue().getValue();
            if (value instanceof Result.Failure) {
                value = null;
            }
            VideoData videoData = (VideoData) value;
            DataCache<T> dataCache = this.videoDataCache;
            if (videoData != null) {
                dataCache.set(key, videoData);
            } else {
                dataCache.remove(key);
            }
        }
    }

    private final PreloadException.ApiCallError wrapPreloadException(Throwable throwable) {
        return new PreloadException.ApiCallError("Error getting videoData: " + throwable, throwable, 0L, 4, null);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager
    public void cancelPreload(Iterable<String> videoContentIds) {
        Iterator<String> it = videoContentIds.iterator();
        while (it.hasNext()) {
            Future<?> remove = this.activeVideoDataRequests.remove(it.next());
            if (remove != null && !this.activeVideoDataRequests.values().contains(remove)) {
                remove.cancel(true);
            }
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager
    public void setListener(VideoDataPreloadManager.VideoDataPreloadListener preloadListener) {
        this.preloadListener = preloadListener;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager
    public void shutDown() {
        this.executor.shutdown();
        Iterator<Map.Entry<String, Future<?>>> it = this.activeVideoDataRequests.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel(true);
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.preload.VideoDataPreloadManager
    public void startPreload(Iterable<String> videoContentIds) {
        ArrayList arrayList = new ArrayList();
        for (String str : videoContentIds) {
            Future<?> future = this.activeVideoDataRequests.get(str);
            if (future == null || future.isDone()) {
                arrayList.add(str);
            }
        }
        Future<?> submitSafely = ExecutorsUtilKt.submitSafely(this.executor, new t601(24, arrayList, this));
        if (submitSafely != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.activeVideoDataRequests.put((String) it.next(), submitSafely);
            }
        }
    }
}
