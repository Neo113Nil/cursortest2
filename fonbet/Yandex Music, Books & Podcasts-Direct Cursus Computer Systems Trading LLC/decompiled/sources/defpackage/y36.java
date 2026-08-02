package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class y36 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ y36(String str, AtomicInteger atomicInteger) {
        this.a = 2;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, this.b);
                thread.setPriority(10);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable, this.b);
                thread2.setDaemon(true);
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable, this.b);
                thread3.setDaemon(true);
                return thread3;
            default:
                return new Thread(runnable, this.b);
        }
    }

    public /* synthetic */ y36(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
