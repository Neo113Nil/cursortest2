package W2;

import N3.r;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3567a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f3568b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f3569c;

    public a() {
        this.f3567a = 1;
        this.f3568b = Executors.defaultThreadFactory();
        this.f3569c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3567a) {
            case 0:
                Thread newThread = this.f3568b.newThread(new r(2, runnable));
                newThread.setName((String) this.f3569c);
                return newThread;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f3569c;
                Thread newThread2 = this.f3568b.newThread(runnable);
                int andIncrement = atomicInteger.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 5);
                sb.append("gads-");
                sb.append(andIncrement);
                newThread2.setName(sb.toString());
                return newThread2;
        }
    }

    public a(String str) {
        this.f3567a = 0;
        this.f3568b = Executors.defaultThreadFactory();
        this.f3569c = str;
    }
}
