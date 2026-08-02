package defpackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

/* loaded from: classes4.dex */
public final /* synthetic */ class kv2 implements ForkJoinPool.ForkJoinWorkerThreadFactory {
    @Override // java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory
    public final ForkJoinWorkerThread newThread(ForkJoinPool forkJoinPool) {
        ForkJoinWorkerThread newThread = ForkJoinPool.defaultForkJoinWorkerThreadFactory.newThread(forkJoinPool);
        newThread.setName("Music:OkHttpForkJoinPool-" + newThread.getPoolIndex());
        return newThread;
    }
}
