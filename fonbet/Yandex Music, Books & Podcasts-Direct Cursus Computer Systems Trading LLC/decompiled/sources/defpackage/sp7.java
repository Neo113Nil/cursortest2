package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class sp7 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public sp7(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                break;
            default:
                this.b = new AtomicInteger();
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "Downloader-" + this.b.incrementAndGet());
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.b.getAndIncrement());
                return thread;
        }
    }
}
