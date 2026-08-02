package ru.yandex.video.m3.util;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011Jä\u0001\u0010\u001a\u001a^\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00180\u0018 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00180\u0018\u0018\u00010\u00190\u0017\"\u0010\b\u0000\u0010\u0013*\n \n*\u0004\u0018\u00010\u00120\u00122d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015\u0018\u00010\u00160\u0014H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJü\u0001\u0010\u001a\u001a^\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00180\u0018 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00180\u0018\u0018\u00010\u00190\u0017\"\u0010\b\u0000\u0010\u0013*\n \n*\u0004\u0018\u00010\u00120\u00122d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015\u0018\u00010\u00160\u00142\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001dJ\u0090\u0001\u0010\u001e\u001a\n \n*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0013*\n \n*\u0004\u0018\u00010\u00120\u00122d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015\u0018\u00010\u00160\u0014H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ¨\u0001\u0010\u001e\u001a\n \n*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0013*\n \n*\u0004\u0018\u00010\u00120\u00122d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015\u0018\u00010\u00160\u00142\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b#\u0010\"JH\u0010%\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010$0$2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b%\u0010&J\u008a\u0001\u0010%\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010$0$\"\u0010\b\u0000\u0010'*\n \n*\u0004\u0018\u00010\u00120\u00122*\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u00152\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001c\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b%\u0010(JP\u0010*\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010$0$2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u000e\u0010)\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b*\u0010+JP\u0010,\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010$0$2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u000e\u0010)\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b-\u0010.J4\u0010/\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u00190\u0017H\u0096\u0001¢\u0006\u0004\b/\u00100J0\u00101\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\u00180\u00182\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000e0\u000eH\u0096\u0001¢\u0006\u0004\b1\u00102Jf\u00101\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00180\u0018\"\u0010\b\u0000\u0010\u0013*\n \n*\u0004\u0018\u00010\u00120\u00122\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b1\u00103Jr\u00101\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00180\u0018\"\u0010\b\u0000\u0010\u0013*\n \n*\u0004\u0018\u00010\u00120\u00122*\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0015H\u0096\u0001¢\u0006\u0004\b1\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\"¨\u00067"}, d2 = {"Lru/yandex/video/m3/util/MarkedScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "", "createdByPlayer", "delegate", "<init>", "(ZLjava/util/concurrent/ScheduledExecutorService;)V", "", "p0", "Ljava/util/concurrent/TimeUnit;", "kotlin.jvm.PlatformType", "p1", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Runnable;", "Lzy11;", "execute", "(Ljava/lang/Runnable;)V", "", "T", "", "Ljava/util/concurrent/Callable;", "", "", "Ljava/util/concurrent/Future;", "", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "p2", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", CA20Status.STATUS_CERTIFICATE_V, "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "p3", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "shutdown", "()V", "shutdownNow", "()Ljava/util/List;", "submit", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "Z", "getCreatedByPlayer$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MarkedScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    public static final int $stable = 8;
    private final /* synthetic */ ScheduledExecutorService $$delegate_0;
    private final boolean createdByPlayer;

    public MarkedScheduledExecutorService(boolean z, ScheduledExecutorService scheduledExecutorService) {
        this.createdByPlayer = z;
        this.$$delegate_0 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long p0, TimeUnit p1) {
        return this.$$delegate_0.awaitTermination(p0, p1);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable p0) {
        this.$$delegate_0.execute(p0);
    }

    /* renamed from: getCreatedByPlayer$video_player_internalRelease, reason: from getter */
    public final boolean getCreatedByPlayer() {
        return this.createdByPlayer;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p0) {
        return this.$$delegate_0.invokeAll(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p0) {
        return (T) this.$$delegate_0.invokeAny(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.$$delegate_0.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.$$delegate_0.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable p0, long p1, TimeUnit p2) {
        return this.$$delegate_0.schedule(p0, p1, p2);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable p0, long p1, long p2, TimeUnit p3) {
        return this.$$delegate_0.scheduleAtFixedRate(p0, p1, p2, p3);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable p0, long p1, long p2, TimeUnit p3) {
        return this.$$delegate_0.scheduleWithFixedDelay(p0, p1, p2, p3);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.$$delegate_0.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.$$delegate_0.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable p0) {
        return this.$$delegate_0.submit(p0);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p0, long p1, TimeUnit p2) {
        return this.$$delegate_0.invokeAll(p0, p1, p2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p0, long p1, TimeUnit p2) {
        return (T) this.$$delegate_0.invokeAny(p0, p1, p2);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> p0, long p1, TimeUnit p2) {
        return this.$$delegate_0.schedule(p0, p1, p2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable p0, T p1) {
        return this.$$delegate_0.submit(p0, p1);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> p0) {
        return this.$$delegate_0.submit(p0);
    }
}
