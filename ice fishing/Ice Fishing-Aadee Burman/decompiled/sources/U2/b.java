package U2;

import L3.u;
import a7.C0445d;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3202b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3203c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f3204d;

    public b() {
        this.f3201a = 0;
        this.f3203c = new AtomicInteger();
        this.f3204d = Executors.defaultThreadFactory();
        this.f3202b = "GAC_Executor";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3201a) {
            case 0:
                Thread newThread = this.f3204d.newThread(new u(2, runnable));
                int andIncrement = this.f3203c.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f3202b;
                StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
                sb.append(str);
                sb.append("[");
                sb.append(andIncrement);
                sb.append("]");
                newThread.setName(sb.toString());
                return newThread;
            default:
                Thread newThread2 = this.f3204d.newThread(runnable);
                newThread2.setUncaughtExceptionHandler(new C0445d(newThread2.getUncaughtExceptionHandler()));
                try {
                    newThread2.setDaemon(true);
                    newThread2.setName(this.f3202b + "-" + this.f3203c.incrementAndGet());
                    newThread2.setContextClassLoader(null);
                } catch (SecurityException unused) {
                }
                return newThread2;
        }
    }

    public b(String str) {
        this.f3201a = 1;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        this.f3203c = new AtomicInteger();
        this.f3202b = str;
        this.f3204d = defaultThreadFactory;
    }
}
