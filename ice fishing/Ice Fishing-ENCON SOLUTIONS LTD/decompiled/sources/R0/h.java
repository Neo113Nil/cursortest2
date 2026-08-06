package R0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1728b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f1729c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f1727a = executorService;
    }

    @Override // R0.e
    public final void a(c cVar) {
        this.f1728b.add(cVar);
        this.f1727a.execute(new F0.a(2, this));
    }
}
