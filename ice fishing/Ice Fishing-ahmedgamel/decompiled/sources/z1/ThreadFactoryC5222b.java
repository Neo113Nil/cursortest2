package z1;

import com.google.android.gms.internal.ads.RunnableC3214fP;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5222b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactoryC5221a f42221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42222b;

    /* renamed from: c, reason: collision with root package name */
    public final C5223c f42223c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42224d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f42225e;

    public ThreadFactoryC5222b(ThreadFactoryC5221a threadFactoryC5221a, String str, boolean z6) {
        C5223c c5223c = C5223c.f42226a;
        this.f42225e = new AtomicInteger();
        this.f42221a = threadFactoryC5221a;
        this.f42222b = str;
        this.f42223c = c5223c;
        this.f42224d = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC3214fP runnableC3214fP = new RunnableC3214fP(this, runnable, 22, false);
        this.f42221a.getClass();
        Z2.c cVar = new Z2.c(runnableC3214fP);
        cVar.setName("glide-" + this.f42222b + "-thread-" + this.f42225e.getAndIncrement());
        return cVar;
    }
}
