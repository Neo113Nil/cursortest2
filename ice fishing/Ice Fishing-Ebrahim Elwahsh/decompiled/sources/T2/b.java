package T2;

import O3.i;
import W6.d;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3097b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f3098c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f3099d;

    public b() {
        this.f3096a = 0;
        this.f3098c = new AtomicInteger();
        this.f3099d = Executors.defaultThreadFactory();
        this.f3097b = "GAC_Executor";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3096a) {
            case 0:
                Thread newThread = this.f3099d.newThread(new i(1, runnable));
                int andIncrement = this.f3098c.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f3097b;
                StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
                sb.append(str);
                sb.append("[");
                sb.append(andIncrement);
                sb.append("]");
                newThread.setName(sb.toString());
                return newThread;
            default:
                Thread newThread2 = this.f3099d.newThread(runnable);
                newThread2.setUncaughtExceptionHandler(new d(newThread2.getUncaughtExceptionHandler()));
                try {
                    newThread2.setDaemon(true);
                    newThread2.setName(this.f3097b + "-" + this.f3098c.incrementAndGet());
                    newThread2.setContextClassLoader(null);
                } catch (SecurityException unused) {
                }
                return newThread2;
        }
    }

    public b(String str) {
        this.f3096a = 1;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        this.f3098c = new AtomicInteger();
        this.f3097b = str;
        this.f3099d = defaultThreadFactory;
    }
}
