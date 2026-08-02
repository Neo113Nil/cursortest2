package ru.yandex.video.m3.player.impl.utils;

import defpackage.h5z0;
import defpackage.tls;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0007\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0004J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\bJ!\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J'\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "T", "", "<init>", "()V", "observer", "Lzy11;", "add", "(Ljava/lang/Object;)V", "", "observers", "(Ljava/util/List;)V", "clear", "remove", "Lkotlin/Function1;", "action", "forEach", "(Ltls;)V", "function", "notifyObservers", "block", "explicitNotifyObservers", "", "_observers", "Ljava/util/Set;", "", "getObservers", "()Ljava/util/Set;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ObserverDispatcher<T> {
    public static final int $stable = 8;
    private final Set<T> _observers = new LinkedHashSet();

    public final void add(List<? extends T> observers) {
        synchronized (this._observers) {
            this._observers.addAll(observers);
        }
    }

    public final void clear() {
        synchronized (getObservers()) {
            this._observers.clear();
        }
    }

    public final void explicitNotifyObservers(tls block) {
        HashSet H0;
        synchronized (getObservers()) {
            H0 = a.H0(getObservers());
        }
        Iterator<T> it = H0.iterator();
        while (it.hasNext()) {
            block.invoke(it.next());
        }
    }

    public final void forEach(tls action) {
        Object failure;
        synchronized (this._observers) {
            Iterator<T> it = this._observers.iterator();
            while (it.hasNext()) {
                try {
                    action.invoke(it.next());
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "forEach", new Object[0]);
                }
            }
        }
    }

    public final Set<T> getObservers() {
        return this._observers;
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

    public final void remove(T observer) {
        synchronized (this._observers) {
            this._observers.remove(observer);
        }
    }

    public final void add(T observer) {
        synchronized (this._observers) {
            this._observers.add(observer);
        }
    }
}
