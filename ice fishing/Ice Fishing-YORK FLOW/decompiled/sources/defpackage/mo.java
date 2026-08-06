package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mo implements java.util.concurrent.ThreadFactory {
    public final java.util.concurrent.atomic.AtomicInteger ZpBGe2uQfcn8 = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setName("arch_disk_io_" + this.ZpBGe2uQfcn8.getAndIncrement());
        return thread;
    }
}
