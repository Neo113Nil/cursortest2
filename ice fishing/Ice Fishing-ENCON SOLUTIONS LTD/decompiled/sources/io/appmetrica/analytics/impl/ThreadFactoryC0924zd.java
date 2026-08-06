package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0924zd implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f7275a = new AtomicInteger(0);

    public static int a() {
        return f7275a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, "null-" + f7275a.incrementAndGet());
    }
}
