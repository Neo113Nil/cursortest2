package android.content.Context;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorStateListInflaterHyperSparkPhoenix6234 implements ThreadFactory {
    public final AtomicInteger FrostHunterAlphaAnimationNeoCosmos5761 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.FrostHunterAlphaAnimationNeoCosmos5761.getAndIncrement());
        return thread;
    }
}
