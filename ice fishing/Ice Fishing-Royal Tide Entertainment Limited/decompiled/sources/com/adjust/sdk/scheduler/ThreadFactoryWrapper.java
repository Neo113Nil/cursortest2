package com.adjust.sdk.scheduler;

import com.adjust.sdk.Constants;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.text.CatchingFishFluxView;

/* loaded from: classes.dex */
public class ThreadFactoryWrapper implements ThreadFactory {
    private String source;

    public ThreadFactoryWrapper(String str) {
        this.source = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        newThread.setName(Constants.THREAD_PREFIX + newThread.getName() + "-" + this.source);
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new CatchingFishFluxView());
        return newThread;
    }
}
