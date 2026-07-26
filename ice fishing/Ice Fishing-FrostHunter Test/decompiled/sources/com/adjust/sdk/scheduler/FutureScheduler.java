package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j, long j2);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j);

    void teardown();
}
