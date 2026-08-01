package J0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import u.AbstractC5049e;

/* renamed from: J0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0314a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1362a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1363b;

    public ThreadFactoryC0314a(boolean z3) {
        this.f1363b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder b9 = AbstractC5049e.b(this.f1363b ? "WM.task-" : "androidx.work-");
        b9.append(this.f1362a.incrementAndGet());
        return new Thread(runnable, b9.toString());
    }
}
