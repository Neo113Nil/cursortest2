package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class wob implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public wob() {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new vob(0, runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.b).getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = ((ThreadFactory) this.b).newThread(runnable);
                newThread2.setName("JmDNS " + newThread2.getName());
                return newThread2;
        }
    }

    public wob(AtomicLong atomicLong) {
        this.a = 0;
        this.b = atomicLong;
    }
}
