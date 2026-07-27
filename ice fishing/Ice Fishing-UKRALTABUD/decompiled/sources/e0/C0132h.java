package e0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132h implements InterfaceC0129e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1859a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1860b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1861c = new AtomicBoolean(false);

    public C0132h(ExecutorService executorService) {
        this.f1859a = executorService;
    }

    @Override // e0.InterfaceC0129e
    public final void a(RunnableC0127c runnableC0127c) {
        this.f1860b.add(runnableC0127c);
        this.f1859a.execute(new androidx.lifecycle.k(1, this));
    }
}
