package Q1;

import L1.AbstractC0015p;
import L1.AbstractC0020v;
import L1.InterfaceC0021w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class h extends AbstractC0015p implements InterfaceC0021w {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f948g = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final R1.l f949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f950d;
    public final k e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f951f;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public h(R1.l lVar, int i) {
        this.f949c = lVar;
        this.f950d = i;
        if ((lVar instanceof InterfaceC0021w ? (InterfaceC0021w) lVar : null) == null) {
            int i2 = AbstractC0020v.f584a;
        }
        this.e = new k();
        this.f951f = new Object();
    }

    @Override // L1.AbstractC0015p
    public final void b(v1.i iVar, Runnable runnable) {
        this.e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f948g;
        if (atomicIntegerFieldUpdater.get(this) < this.f950d) {
            synchronized (this.f951f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f950d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable h2 = h();
                if (h2 == null) {
                    return;
                }
                this.f949c.b(this, new D.b(this, h2, 5, false));
            }
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f951f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f948g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
