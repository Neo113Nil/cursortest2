package P0;

import K0.AbstractC0043t;
import K0.AbstractC0048y;
import K0.InterfaceC0049z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class j extends AbstractC0043t implements InterfaceC0049z {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f881l = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: h, reason: collision with root package name */
    public final R0.l f882h;

    /* renamed from: i, reason: collision with root package name */
    public final int f883i;

    /* renamed from: j, reason: collision with root package name */
    public final m f884j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f885k;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(R0.l lVar, int i2) {
        this.f882h = lVar;
        this.f883i = i2;
        if ((lVar instanceof InterfaceC0049z ? (InterfaceC0049z) lVar : null) == null) {
            int i3 = AbstractC0048y.f546a;
        }
        this.f884j = new m();
        this.f885k = new Object();
    }

    @Override // K0.AbstractC0043t
    public final void c(v0.i iVar, Runnable runnable) {
        this.f884j.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f881l;
        if (atomicIntegerFieldUpdater.get(this) < this.f883i) {
            synchronized (this.f885k) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f883i) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable e2 = e();
                if (e2 == null) {
                    return;
                }
                this.f882h.c(this, new i(0, this, e2));
            }
        }
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f884j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f885k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f881l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f884j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
