package defpackage;

/* loaded from: classes.dex */
public final class en implements java.util.concurrent.ThreadFactory {
    public final java.util.concurrent.atomic.AtomicInteger IHQe1A4L2xu = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setName("arch_disk_io_" + this.IHQe1A4L2xu.getAndIncrement());
        return thread;
    }
}
