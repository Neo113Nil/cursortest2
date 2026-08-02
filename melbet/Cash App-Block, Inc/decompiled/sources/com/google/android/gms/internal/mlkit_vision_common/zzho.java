package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzho {
    public static final void executeSafe(Executor executor, String str, InternalLogger internalLogger, Runnable runnable) {
        executor.getClass();
        internalLogger.getClass();
        runnable.getClass();
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str, 12), e, 48);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLocalCashDetail.deepLinkSpecs;
    }

    public static final Object getSafe(Future future, String str, InternalLogger internalLogger) {
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.USER;
        internalLogger.getClass();
        if (future == null) {
            return null;
        }
        try {
            return future.get();
        } catch (InterruptedException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogInterceptor$intercept$1(str, 13), e, 48);
            return null;
        } catch (CancellationException e2) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogInterceptor$intercept$1(str, 14), e2, 48);
            return null;
        } catch (ExecutionException e3) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new DatadogInterceptor$intercept$1(str, 15), e3, 48);
            return null;
        }
    }

    public static final void scheduleSafe(ScheduledExecutorService scheduledExecutorService, String str, long j, InternalLogger internalLogger, Runnable runnable) {
        scheduledExecutorService.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        internalLogger.getClass();
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str, 16), e, 48);
        }
    }

    public static final Future submitSafe(ExecutorService executorService, String str, InternalLogger internalLogger, Callable callable) {
        executorService.getClass();
        internalLogger.getClass();
        try {
            return executorService.submit(callable);
        } catch (RejectedExecutionException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str, 17), e, 48);
            return null;
        }
    }
}
