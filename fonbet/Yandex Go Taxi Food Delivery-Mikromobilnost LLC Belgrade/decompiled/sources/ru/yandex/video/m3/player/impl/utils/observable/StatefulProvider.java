package ru.yandex.video.m3.player.impl.utils.observable;

import android.os.Handler;
import android.os.Looper;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.m8t0;
import defpackage.tpt0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.provider.StatefulObservable;
import ru.yandex.video.m3.player.provider.ValueObserver;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/observable/StatefulProvider;", "T", "Lru/yandex/video/m3/player/provider/StatefulObservable;", "Landroid/os/Handler;", "observingThreadHandler", "initialValue", "<init>", "(Landroid/os/Handler;Ljava/lang/Object;)V", "value", "Lzy11;", "accept", "(Ljava/lang/Object;)V", "", "stateful", "Lru/yandex/video/m3/player/provider/ValueObserver;", "observer", "addObserver", "(ZLru/yandex/video/m3/player/provider/ValueObserver;)V", "removeObserver", "(Lru/yandex/video/m3/player/provider/ValueObserver;)V", "get", "()Ljava/lang/Object;", "Landroid/os/Handler;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentValue", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "dispatcher", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRunnablePending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/lang/Runnable;", "notifyObservers", "Ljava/lang/Runnable;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatefulProvider<T> implements StatefulObservable<T> {
    public static final int $stable = 8;
    private final AtomicReference<T> currentValue;
    private final ObserverDispatcher<ValueObserver<T>> dispatcher;
    private final AtomicBoolean isRunnablePending;
    private final Runnable notifyObservers;
    private final Handler observingThreadHandler;

    public StatefulProvider(Handler handler, T t) {
        this.observingThreadHandler = handler;
        this.currentValue = new AtomicReference<>(t);
        this.dispatcher = new ObserverDispatcher<>();
        this.isRunnablePending = new AtomicBoolean(false);
        this.notifyObservers = new m8t0(20, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserver$lambda$2(ValueObserver valueObserver, StatefulProvider statefulProvider) {
        valueObserver.onValueChanged(statefulProvider.currentValue.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$1(StatefulProvider statefulProvider) {
        HashSet H0;
        Object failure;
        statefulProvider.isRunnablePending.set(false);
        T t = statefulProvider.currentValue.get();
        ObserverDispatcher<ValueObserver<T>> observerDispatcher = statefulProvider.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator<T> it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((ValueObserver) it.next()).onValueChanged(t);
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

    @Override // ru.yandex.video.m3.player.provider.Consumer
    public void accept(T value) {
        T t = this.currentValue.get();
        AtomicReference<T> atomicReference = this.currentValue;
        while (!atomicReference.compareAndSet(t, value)) {
            if (atomicReference.get() != t) {
                return;
            }
        }
        if (this.isRunnablePending.compareAndSet(false, true)) {
            this.observingThreadHandler.post(this.notifyObservers);
        }
    }

    @Override // ru.yandex.video.m3.player.provider.StatefulObservable
    public void addObserver(boolean stateful, ValueObserver<T> observer) {
        this.dispatcher.add((ObserverDispatcher<ValueObserver<T>>) observer);
        if (stateful) {
            if (jl40.l(Looper.myLooper(), this.observingThreadHandler.getLooper())) {
                observer.onValueChanged(this.currentValue.get());
            } else {
                this.observingThreadHandler.postAtFrontOfQueue(new tpt0(3, observer, this));
            }
        }
    }

    public final T get() {
        return this.currentValue.get();
    }

    @Override // ru.yandex.video.m3.player.provider.StatefulObservable
    public void removeObserver(ValueObserver<T> observer) {
        this.dispatcher.remove(observer);
    }

    public /* synthetic */ StatefulProvider(Handler handler, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : obj);
    }
}
