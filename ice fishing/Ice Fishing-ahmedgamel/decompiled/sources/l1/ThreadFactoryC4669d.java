package l1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC4669d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f38815d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f38816a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f38817b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f38818c;

    public ThreadFactoryC4669d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f38816a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f38818c = "lottie-" + f38815d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f38816a, runnable, this.f38818c + this.f38817b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
