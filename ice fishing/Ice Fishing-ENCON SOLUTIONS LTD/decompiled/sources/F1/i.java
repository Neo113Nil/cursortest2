package F1;

import A1.A;
import A1.AbstractC0018t;
import A1.AbstractC0024z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class i extends AbstractC0018t implements A {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f607g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final H1.l f608c;

    /* renamed from: d, reason: collision with root package name */
    public final int f609d;

    /* renamed from: e, reason: collision with root package name */
    public final l f610e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f611f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(H1.l lVar, int i2) {
        this.f608c = lVar;
        this.f609d = i2;
        if ((lVar instanceof A ? (A) lVar : null) == null) {
            int i3 = AbstractC0024z.f85a;
        }
        this.f610e = new l();
        this.f611f = new Object();
    }

    @Override // A1.AbstractC0018t
    public final void j(l1.i iVar, Runnable runnable) {
        this.f610e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f607g;
        if (atomicIntegerFieldUpdater.get(this) < this.f609d) {
            synchronized (this.f611f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f609d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable o2 = o();
                if (o2 == null) {
                    return;
                }
                this.f608c.j(this, new D0.f(3, this, o2));
            }
        }
    }

    public final Runnable o() {
        while (true) {
            Runnable runnable = (Runnable) this.f610e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f611f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f607g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f610e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
