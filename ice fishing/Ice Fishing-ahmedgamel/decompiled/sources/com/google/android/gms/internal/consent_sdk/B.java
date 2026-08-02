package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.ads.Wv;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class B implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final ThreadPoolExecutor f36258u;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f36257n = new AtomicInteger(1);

    /* renamed from: v, reason: collision with root package name */
    public WeakReference f36259v = new WeakReference(null);

    public B() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.A
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                B b9 = B.this;
                Thread thread = new Thread(runnable, Wv.f(b9.f36257n.getAndIncrement(), "Google consent worker #"));
                b9.f36259v = new WeakReference(thread);
                return thread;
            }
        });
        this.f36258u = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f36259v.get()) {
            runnable.run();
        } else {
            this.f36258u.execute(runnable);
        }
    }
}
