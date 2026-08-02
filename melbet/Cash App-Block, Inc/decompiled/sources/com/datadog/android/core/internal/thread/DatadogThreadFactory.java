package com.datadog.android.core.internal.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class DatadogThreadFactory implements ThreadFactory {
    public final String newThreadContext;
    public final AtomicInteger threadNumber = new AtomicInteger(1);

    public DatadogThreadFactory(String str) {
        this.newThreadContext = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "datadog-" + this.newThreadContext + "-thread-" + this.threadNumber.getAndIncrement());
        thread.setPriority(5);
        thread.setDaemon(false);
        return thread;
    }
}
