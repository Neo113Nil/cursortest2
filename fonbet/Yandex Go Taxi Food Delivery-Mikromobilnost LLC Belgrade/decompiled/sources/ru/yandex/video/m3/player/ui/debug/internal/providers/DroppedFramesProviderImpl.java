package ru.yandex.video.m3.player.ui.debug.internal.providers;

import defpackage.h5z0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DroppedFramesProvider;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "count", "Lzy11;", "onVideoFramesDropped", "(I)V", "release", "()V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "droppedFramesCount", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DroppedFramesProviderImpl implements DroppedFramesProvider {
    public static final int $stable = 8;
    private int droppedFramesCount;
    private final ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher;

    public DroppedFramesProviderImpl(ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher) {
        this.observerDispatcher = observerDispatcher;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.DroppedFramesProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoFramesDropped(int count) {
        HashSet H0;
        Object failure;
        this.droppedFramesCount += count;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onFramesDropped(this.droppedFramesCount);
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.DroppedFramesProvider
    public void release() {
        this.droppedFramesCount = 0;
    }
}
