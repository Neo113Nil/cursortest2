package W2;

import N3.r;
import a7.C0449d;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3571b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3572c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f3573d;

    public b() {
        this.f3570a = 0;
        this.f3572c = new AtomicInteger();
        this.f3573d = Executors.defaultThreadFactory();
        this.f3571b = "GAC_Executor";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3570a) {
            case 0:
                Thread newThread = this.f3573d.newThread(new r(2, runnable));
                int andIncrement = this.f3572c.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f3571b;
                StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
                sb.append(str);
                sb.append("[");
                sb.append(andIncrement);
                sb.append("]");
                newThread.setName(sb.toString());
                return newThread;
            default:
                Thread newThread2 = this.f3573d.newThread(runnable);
                newThread2.setUncaughtExceptionHandler(new C0449d(newThread2.getUncaughtExceptionHandler()));
                try {
                    newThread2.setDaemon(true);
                    newThread2.setName(this.f3571b + "-" + this.f3572c.incrementAndGet());
                    newThread2.setContextClassLoader(null);
                } catch (SecurityException unused) {
                }
                return newThread2;
        }
    }

    public b(String str) {
        this.f3570a = 1;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        this.f3572c = new AtomicInteger();
        this.f3571b = str;
        this.f3573d = defaultThreadFactory;
    }
}
