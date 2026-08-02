package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class ThreadFactoryBuilder$1 implements ThreadFactory {
    public final /* synthetic */ ThreadFactory val$backingThreadFactory;
    public final /* synthetic */ AtomicLong val$count;
    public final /* synthetic */ Boolean val$daemon;
    public final /* synthetic */ String val$nameFormat;
    public final /* synthetic */ Integer val$priority;

    public ThreadFactoryBuilder$1(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num) {
        this.val$backingThreadFactory = threadFactory;
        this.val$nameFormat = str;
        this.val$count = atomicLong;
        this.val$daemon = bool;
        this.val$priority = num;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.val$backingThreadFactory.newThread(runnable);
        Objects.requireNonNull(newThread);
        AtomicLong atomicLong = this.val$count;
        Objects.requireNonNull(atomicLong);
        newThread.setName(String.format(Locale.ROOT, this.val$nameFormat, Long.valueOf(atomicLong.getAndIncrement())));
        Boolean bool = this.val$daemon;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        Integer num = this.val$priority;
        if (num != null) {
            newThread.setPriority(num.intValue());
        }
        return newThread;
    }
}
