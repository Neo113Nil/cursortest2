package J0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1391a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1392b;

    public a(boolean z6) {
        this.f1392b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder b9 = AbstractC5050e.b(this.f1392b ? "WM.task-" : "androidx.work-");
        b9.append(this.f1391a.incrementAndGet());
        return new Thread(runnable, b9.toString());
    }
}
