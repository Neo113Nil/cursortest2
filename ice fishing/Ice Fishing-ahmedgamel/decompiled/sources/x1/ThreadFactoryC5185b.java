package x1;

import com.google.android.gms.internal.ads.RunnableC3191fP;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5185b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactoryC5184a f41759a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41760b;

    /* renamed from: c, reason: collision with root package name */
    public final C5186c f41761c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41762d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f41763e;

    public ThreadFactoryC5185b(ThreadFactoryC5184a threadFactoryC5184a, String str, boolean z3) {
        C5186c c5186c = C5186c.f41764a;
        this.f41763e = new AtomicInteger();
        this.f41759a = threadFactoryC5184a;
        this.f41760b = str;
        this.f41761c = c5186c;
        this.f41762d = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC3191fP runnableC3191fP = new RunnableC3191fP(this, runnable, 22, false);
        this.f41759a.getClass();
        X2.d dVar = new X2.d(runnableC3191fP);
        dVar.setName("glide-" + this.f41760b + "-thread-" + this.f41763e.getAndIncrement());
        return dVar;
    }
}
