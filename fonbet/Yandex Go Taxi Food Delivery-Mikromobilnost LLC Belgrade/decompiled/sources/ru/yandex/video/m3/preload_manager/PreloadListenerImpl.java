package ru.yandex.video.m3.preload_manager;

import android.util.LruCache;
import defpackage.h5z0;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.PreloadManager;
import ru.yandex.video.m3.preload_manager.PreloadWorkers;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u000eJ\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00050#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadListenerImpl;", "Lru/yandex/video/m3/preload_manager/PreloadWorkers$Listener;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/preload_manager/PreloadManager$Listener;", "listeners", "", "Lru/yandex/video/m3/preload_manager/PreloadObserver;", "observers", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Ljava/util/List;)V", "Lru/yandex/video/m3/preload_manager/PreloadRequest;", "request", "Lzy11;", "checkApiErrors", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "e", "saveApiError", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;)V", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "results", "onSuccess", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Ljava/util/List;)V", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_EXCEPTION, "onCancel", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException;)V", "onError", "onRequestQueued", "onApiError", "(Lru/yandex/video/m3/preload_manager/PreloadRequest;Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "preloadObservers", "Landroid/util/LruCache;", "", "apiErrors", "Landroid/util/LruCache;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadListenerImpl implements PreloadWorkers.Listener {
    public static final int $stable = 8;
    private final LruCache<String, List<PreloadException.ApiCallError>> apiErrors;
    private final ObserverDispatcher<PreloadManager.Listener> listeners;
    private final ObserverDispatcher<PreloadObserver> preloadObservers;

    public PreloadListenerImpl(ObserverDispatcher<PreloadManager.Listener> observerDispatcher, List<? extends PreloadObserver> list) {
        this.listeners = observerDispatcher;
        ObserverDispatcher<PreloadObserver> observerDispatcher2 = new ObserverDispatcher<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            observerDispatcher2.add((ObserverDispatcher<PreloadObserver>) it.next());
        }
        this.preloadObservers = observerDispatcher2;
        this.apiErrors = new LruCache<>(64);
    }

    private final void checkApiErrors(PreloadRequest request) {
        HashSet H0;
        Object failure;
        List<PreloadException.ApiCallError> list = this.apiErrors.get(request.getPreloadKey());
        if (list != null) {
            for (PreloadException.ApiCallError apiCallError : list) {
                ObserverDispatcher<PreloadObserver> observerDispatcher = this.preloadObservers;
                synchronized (observerDispatcher.getObservers()) {
                    H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    try {
                        ((PreloadObserver) it.next()).onApiError(request, apiCallError);
                        failure = zy11.a;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        h5z0.a.f(a, "notifyObservers", new Object[0]);
                    }
                }
            }
        }
        this.apiErrors.remove(request.getPreloadKey());
    }

    private final void saveApiError(VideoData videoData, PreloadException.ApiCallError e) {
        String buildPreloadKey$video_player_internalRelease = PreloadRequest.INSTANCE.buildPreloadKey$video_player_internalRelease(videoData);
        List<PreloadException.ApiCallError> list = this.apiErrors.get(buildPreloadKey$video_player_internalRelease);
        if (list == null || this.apiErrors.put(buildPreloadKey$video_player_internalRelease, kotlin.collections.a.o0(list, e)) == null) {
            this.apiErrors.put(buildPreloadKey$video_player_internalRelease, Collections.singletonList(e));
        }
    }

    public final void onApiError(final PreloadRequest request, final PreloadException.ApiCallError e) {
        HashSet H0;
        Object failure;
        h5z0.a.f(e.getCause(), request.getVideoSessionId() + ": Exception caught:", new Object[0]);
        ObserverDispatcher<PreloadObserver> observerDispatcher = this.preloadObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PreloadObserver) it.next()).onApiError(request, e);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PreloadManager.Listener> observerDispatcher2 = this.listeners;
        if (observerDispatcher2 != null) {
            observerDispatcher2.forEach(new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadListenerImpl$onApiError$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PreloadManager.Listener listener) {
                    InternalListener internalListener = listener instanceof InternalListener ? (InternalListener) listener : null;
                    if (internalListener != null) {
                        internalListener.onInternalApiError(PreloadRequest.this.getRawVideoDataWithIncorrectVsid(), e);
                    }
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PreloadManager.Listener) obj);
                    return zy11.a;
                }
            });
        }
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadWorkers.Listener
    public void onCancel(final PreloadRequest request, final PreloadException exception) {
        HashSet<PreloadObserver> H0;
        Object failure;
        List<DownloadResult> results;
        ObserverDispatcher<PreloadObserver> observerDispatcher = this.preloadObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        for (PreloadObserver preloadObserver : H0) {
            try {
                List<DownloadResult> list = null;
                PreloadException.CanceledOperationException canceledOperationException = exception instanceof PreloadException.CanceledOperationException ? (PreloadException.CanceledOperationException) exception : null;
                if (canceledOperationException != null && (results = canceledOperationException.getResults()) != null && !results.isEmpty()) {
                    list = results;
                }
                preloadObserver.onJobCancel(request, exception, list);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PreloadManager.Listener> observerDispatcher2 = this.listeners;
        if (observerDispatcher2 != null) {
            observerDispatcher2.forEach(new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadListenerImpl$onCancel$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PreloadManager.Listener listener) {
                    listener.onCancel(PreloadRequest.this.getRawVideoDataWithIncorrectVsid(), PreloadRequest.this.getVideoSessionId(), exception);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PreloadManager.Listener) obj);
                    return zy11.a;
                }
            });
        }
        checkApiErrors(request);
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadWorkers.Listener
    public void onError(final PreloadRequest request, final PreloadException exception) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PreloadObserver> observerDispatcher = this.preloadObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PreloadObserver) it.next()).onJobError(request, exception);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PreloadManager.Listener> observerDispatcher2 = this.listeners;
        if (observerDispatcher2 != null) {
            observerDispatcher2.forEach(new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadListenerImpl$onError$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PreloadManager.Listener listener) {
                    listener.onError(PreloadRequest.this.getRawVideoDataWithIncorrectVsid(), PreloadRequest.this.getVideoSessionId(), exception);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PreloadManager.Listener) obj);
                    return zy11.a;
                }
            });
        }
        checkApiErrors(request);
    }

    public final void onRequestQueued(PreloadRequest request) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PreloadObserver> observerDispatcher = this.preloadObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PreloadObserver) it.next()).onRequestQueued(request);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        checkApiErrors(request);
    }

    @Override // ru.yandex.video.m3.preload_manager.PreloadWorkers.Listener
    public void onSuccess(final PreloadRequest request, final List<DownloadResult> results) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PreloadObserver> observerDispatcher = this.preloadObservers;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PreloadObserver) it.next()).onJobSuccess(request, results);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<PreloadManager.Listener> observerDispatcher2 = this.listeners;
        if (observerDispatcher2 != null) {
            observerDispatcher2.forEach(new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadListenerImpl$onSuccess$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PreloadManager.Listener listener) {
                    listener.onSuccess(PreloadRequest.this.getRawVideoDataWithIncorrectVsid(), PreloadRequest.this.getVideoSessionId(), results);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PreloadManager.Listener) obj);
                    return zy11.a;
                }
            });
        }
        checkApiErrors(request);
    }

    public final void onApiError(final VideoData videoData, final PreloadException.ApiCallError e) {
        h5z0.a.e(e);
        saveApiError(videoData, e);
        ObserverDispatcher<PreloadManager.Listener> observerDispatcher = this.listeners;
        if (observerDispatcher != null) {
            observerDispatcher.forEach(new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadListenerImpl$onApiError$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PreloadManager.Listener listener) {
                    InternalListener internalListener = listener instanceof InternalListener ? (InternalListener) listener : null;
                    if (internalListener != null) {
                        internalListener.onInternalApiError(VideoData.this, e);
                    }
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PreloadManager.Listener) obj);
                    return zy11.a;
                }
            });
        }
    }
}
