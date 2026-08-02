package ru.yandex.video.m3.player.baseurls;

import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.p16;
import defpackage.q16;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n \u0017*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManagerImpl;", "Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;", "Lru/yandex/video/m3/player/baseurls/BaseUrlChecker;", "urlChecker", "<init>", "(Lru/yandex/video/m3/player/baseurls/BaseUrlChecker;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrl;", "baseUrl", "Lzy11;", "addToBlackList", "(Lru/yandex/video/m3/player/baseurls/BaseUrl;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrlFromBlackListRemovedListener;", "listener", "addListener", "(Lru/yandex/video/m3/player/baseurls/BaseUrlFromBlackListRemovedListener;)V", "removeListener", "release", "()V", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "blackList", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/Future;", "checkBaseUrlFuture", "Ljava/util/concurrent/Future;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlacklistedBaseUrlsManagerImpl implements BlacklistedBaseUrlsManager {
    public static final long CHECK_INIT_DELAY_SEC = 30;
    public static final long CHECK_PERIOD_SEC = 30;
    private final Future<?> checkBaseUrlFuture;
    private final ExecutorService executor;
    private final ScheduledExecutorService scheduledExecutorService;
    public static final int $stable = 8;
    private final CopyOnWriteArraySet<BaseUrlFromBlackListRemovedListener> listeners = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<BaseUrl> blackList = new CopyOnWriteArraySet<>();

    public BlacklistedBaseUrlsManagerImpl(BaseUrlChecker baseUrlChecker) {
        int i = 0;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new p16(Executors.defaultThreadFactory(), i));
        this.scheduledExecutorService = newScheduledThreadPool;
        this.executor = Executors.newSingleThreadExecutor(new p16(Executors.defaultThreadFactory(), 1));
        this.checkBaseUrlFuture = newScheduledThreadPool.scheduleAtFixedRate(new q16(this, baseUrlChecker, i), 30L, 30L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(BlacklistedBaseUrlsManagerImpl blacklistedBaseUrlsManagerImpl, BaseUrlChecker baseUrlChecker) {
        ExecutorsUtilKt.executeSafely(blacklistedBaseUrlsManagerImpl.executor, new q16(blacklistedBaseUrlsManagerImpl, baseUrlChecker, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executor$lambda$5$lambda$4(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:BlacklistedBaseUrlsManager");
        return newThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$9$lambda$8(BlacklistedBaseUrlsManagerImpl blacklistedBaseUrlsManagerImpl, BaseUrlChecker baseUrlChecker) {
        h5z0.a.a("try to remove baseUrls from blacklist", new Object[0]);
        for (BaseUrl baseUrl : blacklistedBaseUrlsManagerImpl.blackList) {
            if (!Thread.interrupted()) {
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.a("Work with " + baseUrl, new Object[0]);
                if (baseUrlChecker.check(baseUrl.getUrl())) {
                    d5z0Var.a("Check is OK", new Object[0]);
                    blacklistedBaseUrlsManagerImpl.blackList.remove(baseUrl);
                    Iterator<T> it = blacklistedBaseUrlsManagerImpl.listeners.iterator();
                    while (it.hasNext()) {
                        ((BaseUrlFromBlackListRemovedListener) it.next()).onBaseUrlRemovedFromBlacklist(baseUrl);
                    }
                } else {
                    d5z0Var.a("Check is failed", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread scheduledExecutorService$lambda$2$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:SBlacklistedBaseUrlsManager");
        return newThread;
    }

    @Override // ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManager
    public void addListener(BaseUrlFromBlackListRemovedListener listener) {
        h5z0.a.a("addListener listener=" + listener, new Object[0]);
        this.listeners.add(listener);
    }

    @Override // ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManager
    public void addToBlackList(BaseUrl baseUrl) {
        h5z0.a.a("addToBlackList url=" + baseUrl, new Object[0]);
        this.blackList.add(baseUrl);
    }

    @Override // ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManager
    public void release() {
        this.checkBaseUrlFuture.cancel(true);
        this.scheduledExecutorService.shutdownNow();
        this.executor.shutdownNow();
    }

    @Override // ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManager
    public void removeListener(BaseUrlFromBlackListRemovedListener listener) {
        h5z0.a.a("removeListener listener=" + listener, new Object[0]);
        this.listeners.remove(listener);
    }
}
