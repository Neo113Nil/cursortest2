package com.anythink.expressad.foundation.g.i;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f20364a;

    /* renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f20365b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f20366c;

    public static ThreadPoolExecutor a() {
        if (f20364a == null) {
            f20364a = new ThreadPoolExecutor(5, 10, 15L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.i.a.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20364a;
    }

    public static ThreadPoolExecutor b() {
        if (f20366c == null) {
            f20366c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.i.a.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20366c;
    }

    private static ThreadPoolExecutor c() {
        if (f20365b == null) {
            f20365b = new ThreadPoolExecutor(5, 200, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(60), new ThreadFactory() { // from class: com.anythink.expressad.foundation.g.i.a.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20365b;
    }
}
