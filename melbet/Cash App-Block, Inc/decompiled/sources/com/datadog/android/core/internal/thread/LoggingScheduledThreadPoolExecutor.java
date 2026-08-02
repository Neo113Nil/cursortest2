package com.datadog.android.core.internal.thread;

import app.cash.trifle.KeyHandle$keyPair$2;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.google.android.gms.internal.measurement.zzlj;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LoggingScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public final InternalLogger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingScheduledThreadPoolExecutor(final InternalLogger internalLogger, final BackPressureStrategy backPressureStrategy, final String str) {
        super(1, new DatadogThreadFactory(str), new RejectedExecutionHandler(backPressureStrategy, str) { // from class: com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor$$ExternalSyntheticLambda0
            public final /* synthetic */ String f$1;

            {
                this.f$1 = str;
            }

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable != null) {
                    ((zzlj) InternalLogger.this).log(5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), (Function0) new KeyHandle$keyPair$2(runnable, 19), (Throwable) null, false, Thread$State$EnumUnboxingLocalUtility.m("executor.context", this.f$1));
                }
            }
        });
        internalLogger.getClass();
        this.logger = internalLogger;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        ThreadExtKt.loggingAfterExecute(runnable, th, this.logger);
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
}
