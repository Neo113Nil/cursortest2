package j1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC4600d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f38303d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f38304a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f38305b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f38306c;

    public ThreadFactoryC4600d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f38304a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f38306c = "lottie-" + f38303d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f38304a, runnable, this.f38306c + this.f38305b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
