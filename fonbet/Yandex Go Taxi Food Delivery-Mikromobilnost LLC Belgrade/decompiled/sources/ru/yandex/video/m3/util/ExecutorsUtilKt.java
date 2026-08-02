package ru.yandex.video.m3.util;

import android.util.Log;
import defpackage.zy11;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "runnable", "Lzy11;", "executeSafely", "(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/Future;", "submitSafely", "(Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "Ljava/util/concurrent/ScheduledExecutorService;", "", "delay", "Ljava/util/concurrent/TimeUnit;", "unit", "Ljava/util/concurrent/ScheduledFuture;", "scheduleSafely", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "initialDelay", "period", "scheduleAtFixedRateSafely", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecutorsUtilKt {
    public static final void executeSafely(Executor executor, Runnable runnable) {
        Object failure;
        try {
            executor.execute(runnable);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(null, "Exception occurred in executeSafely", a);
        }
    }

    public static final ScheduledFuture<?> scheduleAtFixedRateSafely(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object failure;
        try {
            failure = scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(null, "Exception occurred in scheduleAtFixedRateSafely", a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (ScheduledFuture) failure;
    }

    public static final ScheduledFuture<?> scheduleSafely(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        Object failure;
        try {
            failure = scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(null, "Exception occurred in submitSafely", a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (ScheduledFuture) failure;
    }

    public static final Future<?> submitSafely(ExecutorService executorService, Runnable runnable) {
        Object failure;
        try {
            failure = executorService.submit(runnable);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(null, "Exception occurred in submitSafely", a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Future) failure;
    }
}
