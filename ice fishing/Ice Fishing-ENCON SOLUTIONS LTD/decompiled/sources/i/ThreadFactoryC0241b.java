package i;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0241b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f3396a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f3396a.getAndIncrement());
        return thread;
    }
}
