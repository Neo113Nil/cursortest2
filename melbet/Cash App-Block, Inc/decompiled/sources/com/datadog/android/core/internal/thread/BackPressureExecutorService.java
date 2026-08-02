package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.configuration.Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$1;
import com.datadog.android.core.configuration.Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$2;
import com.squareup.util.Strings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class BackPressureExecutorService extends ThreadPoolExecutor implements AutoCloseable, ExecutorService {
    public final InternalLogger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressureExecutorService(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy, Strings strings) {
        super(1, 1, 5000L, TimeUnit.MILLISECONDS, new BackPressuredBlockingQueue(internalLogger, str, 1024, Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$1.INSTANCE, Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$2.INSTANCE, 2, strings), new DatadogThreadFactory(str));
        internalLogger.getClass();
        strings.getClass();
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
