package ru.yandex.video.m3.player.impl.utils;

import defpackage.tls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001*B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00052\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u0019R&\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u001f\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010\u0018\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010)\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006+"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/FutureAsync;", "T", "Ljava/util/concurrent/Future;", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/utils/FutureAsync$Callback;", "Lzy11;", "function", "<init>", "(Ltls;)V", "value", "setValue", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_EXCEPTION, "setException", "(Ljava/lang/Exception;)V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "awaitAndGet", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "", "isDone", "()Z", "get", "()Ljava/lang/Object;", "mayInterruptIfRunning", "cancel", "(Z)Z", "isCancelled", "Ltls;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", "valueRef", "Ljava/util/concurrent/atomic/AtomicReference;", "exceptionRef", "Callback", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FutureAsync<T> implements Future<T> {
    public static final int $stable = 8;
    private final tls function;
    private final CountDownLatch countDownLatch = new CountDownLatch(1);
    private AtomicBoolean isCancelled = new AtomicBoolean(false);
    private AtomicBoolean isDone = new AtomicBoolean(false);
    private AtomicReference<T> valueRef = new AtomicReference<>();
    private AtomicReference<Exception> exceptionRef = new AtomicReference<>();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/FutureAsync$Callback;", "T", "", "Lru/yandex/video/m3/player/impl/utils/FutureAsync;", "futureAsync", "<init>", "(Lru/yandex/video/m3/player/impl/utils/FutureAsync;)V", "value", "Lzy11;", "onComplete", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_EXCEPTION, "onException", "(Ljava/lang/Exception;)V", "Lru/yandex/video/m3/player/impl/utils/FutureAsync;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Callback<T> {
        public static final int $stable = 8;
        private final FutureAsync<T> futureAsync;

        public Callback(FutureAsync<T> futureAsync) {
            this.futureAsync = futureAsync;
        }

        public final void onComplete(T value) {
            this.futureAsync.setValue(value);
        }

        public final void onException(Exception exception) {
            this.futureAsync.setException(exception);
        }
    }

    public FutureAsync(tls tlsVar) {
        this.function = tlsVar;
    }

    private final T awaitAndGet(long timeout, TimeUnit unit) {
        if (isCancelled()) {
            throw new CancellationException();
        }
        if (!this.isDone.get()) {
            try {
                this.function.invoke(new Callback(this));
            } catch (Exception e) {
                this.isDone.set(true);
                this.exceptionRef.set(e);
                this.countDownLatch.countDown();
            }
            this.countDownLatch.await(timeout, unit);
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Exception exc = this.exceptionRef.get();
        if (exc == null) {
            return this.valueRef.get();
        }
        throw new ExecutionException(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setException(Exception exception) {
        this.exceptionRef.set(exception);
        this.isDone.set(true);
        this.countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(T value) {
        this.valueRef.set(value);
        this.isDone.set(true);
        this.countDownLatch.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        this.isCancelled.set(true);
        this.countDownLatch.countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return awaitAndGet(2147483647L, TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.isCancelled.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.isDone.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) {
        return awaitAndGet(timeout, unit);
    }
}
