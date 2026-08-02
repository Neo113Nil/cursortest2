package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class CustomThreadFactory implements ThreadFactory {
    public static final ThreadFactory DEFAULT = Executors.defaultThreadFactory();
    public final String namePrefix;
    public final StrictMode.ThreadPolicy policy;
    public final int priority;
    public final AtomicLong threadCount = new AtomicLong();

    public CustomThreadFactory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.namePrefix = str;
        this.priority = i;
        this.policy = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = DEFAULT.newThread(new MainActivity$$ExternalSyntheticLambda8(10, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.namePrefix + " Thread #" + this.threadCount.getAndIncrement());
        return newThread;
    }
}
