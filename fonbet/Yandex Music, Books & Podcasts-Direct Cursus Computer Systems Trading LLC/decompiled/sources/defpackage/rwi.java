package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class rwi implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final AtomicInteger c;
    public final Object d;

    public rwi(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = new AtomicInteger();
                this.d = Executors.defaultThreadFactory();
                this.b = "GAC_Executor";
                break;
            default:
                this.d = Executors.defaultThreadFactory();
                this.c = new AtomicInteger(1);
                this.b = "connectionLostChecker";
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.d).newThread(runnable);
                newThread.setName(this.b + "-" + this.c);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.d).newThread(new hh(runnable, 3));
                newThread2.setName(this.b + "[" + this.c.getAndIncrement() + "]");
                return newThread2;
            default:
                Thread thread = new Thread((ThreadGroup) this.d, runnable, this.b + this.c.getAndIncrement(), 0L);
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
        }
    }

    public rwi(String str) {
        ThreadGroup threadGroup;
        this.a = 2;
        this.c = new AtomicInteger(1);
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.d = threadGroup;
        this.b = str;
    }
}
