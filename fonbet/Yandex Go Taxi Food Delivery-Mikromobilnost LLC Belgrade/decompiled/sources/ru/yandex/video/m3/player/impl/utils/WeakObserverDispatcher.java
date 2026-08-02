package ru.yandex.video.m3.player.impl.utils;

import defpackage.h5z0;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\nJ'\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/WeakObserverDispatcher;", "T", "", "<init>", "()V", "observer", "Lkotlin/Function0;", "Lzy11;", "action", "add", "(Ljava/lang/Object;Lsls;)V", "clear", "(Lsls;)V", "remove", "Lkotlin/Function1;", "function", "notifyObservers", "(Ltls;)V", "", "_observers", "Ljava/util/Set;", "", "observers", "getObservers", "()Ljava/util/Set;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeakObserverDispatcher<T> {
    public static final int $stable = 8;
    private final Set<T> _observers;
    private final Set<T> observers;

    public WeakObserverDispatcher() {
        Set<T> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        this._observers = newSetFromMap;
        this.observers = newSetFromMap;
    }

    public static /* synthetic */ void add$default(WeakObserverDispatcher weakObserverDispatcher, Object obj, sls slsVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            slsVar = new sls() { // from class: ru.yandex.video.m3.player.impl.utils.WeakObserverDispatcher$add$1
                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m797invoke();
                    return zy11.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m797invoke() {
                }
            };
        }
        weakObserverDispatcher.add(obj, slsVar);
    }

    public static /* synthetic */ void clear$default(WeakObserverDispatcher weakObserverDispatcher, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = new sls() { // from class: ru.yandex.video.m3.player.impl.utils.WeakObserverDispatcher$clear$1
                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m798invoke();
                    return zy11.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m798invoke() {
                }
            };
        }
        weakObserverDispatcher.clear(slsVar);
    }

    public static /* synthetic */ void remove$default(WeakObserverDispatcher weakObserverDispatcher, Object obj, sls slsVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            slsVar = new sls() { // from class: ru.yandex.video.m3.player.impl.utils.WeakObserverDispatcher$remove$1
                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m799invoke();
                    return zy11.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m799invoke() {
                }
            };
        }
        weakObserverDispatcher.remove(obj, slsVar);
    }

    public final void add(T observer, sls action) {
        synchronized (this.observers) {
            this._observers.add(observer);
            action.invoke();
        }
    }

    public final void clear(sls action) {
        synchronized (this.observers) {
            this._observers.clear();
            action.invoke();
        }
    }

    public final Set<T> getObservers() {
        return this.observers;
    }

    public final void notifyObservers(tls function) {
        HashSet H0;
        Object failure;
        synchronized (getObservers()) {
            H0 = a.H0(getObservers());
        }
        Iterator<T> it = H0.iterator();
        while (it.hasNext()) {
            try {
                failure = function.invoke(it.next());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    public final void remove(T observer, sls action) {
        synchronized (this.observers) {
            this._observers.remove(observer);
            action.invoke();
        }
    }
}
