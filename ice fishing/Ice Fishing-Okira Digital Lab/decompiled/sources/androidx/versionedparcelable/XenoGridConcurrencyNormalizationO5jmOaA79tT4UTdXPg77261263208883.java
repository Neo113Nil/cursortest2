package androidx.versionedparcelable;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridConcurrencyNormalizationO5jmOaA79tT4UTdXPg77261263208883 implements ThreadFactory {
    public final AtomicInteger ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAndIncrement());
        return thread;
    }
}
