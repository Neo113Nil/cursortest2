package Q0;

import L0.AbstractC0061t;
import L0.AbstractC0066y;
import L0.InterfaceC0067z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class j extends AbstractC0061t implements InterfaceC0067z {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f890k = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: g, reason: collision with root package name */
    public final S0.l f891g;

    /* renamed from: h, reason: collision with root package name */
    public final int f892h;

    /* renamed from: i, reason: collision with root package name */
    public final m f893i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f894j;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(S0.l lVar, int i2) {
        this.f891g = lVar;
        this.f892h = i2;
        if ((lVar instanceof InterfaceC0067z ? (InterfaceC0067z) lVar : null) == null) {
            int i3 = AbstractC0066y.f694a;
        }
        this.f893i = new m();
        this.f894j = new Object();
    }

    @Override // L0.AbstractC0061t
    public final void c(v0.i iVar, Runnable runnable) {
        this.f893i.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f890k;
        if (atomicIntegerFieldUpdater.get(this) < this.f892h) {
            synchronized (this.f894j) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f892h) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e2 = e();
                if (e2 == null) {
                    return;
                }
                this.f891g.c(this, new i(0, this, e2));
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f893i.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f894j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f890k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f893i.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
