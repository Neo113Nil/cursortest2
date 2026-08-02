package ru.yandex.video.m3.player.utils;

import defpackage.sls;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\n\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/utils/FutureCallable;", "T", "Ljava/util/concurrent/Future;", "Lkotlin/Function0;", "function", "<init>", "(Lsls;)V", "", "isDone", "()Z", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "mayInterruptIfRunning", "cancel", "(Z)Z", "isCancelled", "Lsls;", "Z", "value", "Ljava/lang/Object;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FutureCallable<T> implements Future<T> {
    public static final int $stable = 8;
    private final sls function;
    private boolean isCancelled;
    private boolean isDone;
    private T value;

    public FutureCallable(sls slsVar) {
        this.function = slsVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        this.isCancelled = true;
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        if (isCancelled()) {
            throw new CancellationException();
        }
        if (!this.isDone) {
            this.value = (T) this.function.invoke();
            this.isDone = true;
        }
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.isDone;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) {
        return get();
    }
}
