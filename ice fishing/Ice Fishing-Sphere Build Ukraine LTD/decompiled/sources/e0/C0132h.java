package e0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132h implements InterfaceC0129e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1868b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1869c = new AtomicBoolean(false);

    public C0132h(ExecutorService executorService) {
        this.f1867a = executorService;
    }

    @Override // e0.InterfaceC0129e
    public final void a(RunnableC0127c runnableC0127c) {
        this.f1868b.add(runnableC0127c);
        this.f1867a.execute(new androidx.lifecycle.k(1, this));
    }
}
