package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class swi implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;
    public final Serializable c;

    public swi() {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = this.b.newThread(new hh(runnable, 3));
                newThread.setName((String) this.c);
                return newThread;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                Thread newThread2 = this.b.newThread(runnable);
                newThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread2;
        }
    }

    public swi(String str) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
