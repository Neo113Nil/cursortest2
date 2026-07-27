package kotlin.text;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishWorkManagerFlux implements ThreadFactory {
    public final AtomicInteger CatchingFishParcelableFAB = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.CatchingFishParcelableFAB.getAndIncrement());
        return thread;
    }
}
