package T7;

import B2.RunnableC0272f;
import O7.A;
import O7.AbstractC0395u;
import O7.C;
import O7.C0382g;
import O7.H;
import O7.t0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class i extends AbstractC0395u implements C {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3144A = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC0395u f3145v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3146w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C f3147x;

    /* renamed from: y, reason: collision with root package name */
    public final l f3148y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3149z;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0395u abstractC0395u, int i) {
        this.f3145v = abstractC0395u;
        this.f3146w = i;
        C c4 = abstractC0395u instanceof C ? (C) abstractC0395u : null;
        this.f3147x = c4 == null ? A.f2547a : c4;
        this.f3148y = new l();
        this.f3149z = new Object();
    }

    public final Runnable B() {
        while (true) {
            Runnable runnable = (Runnable) this.f3148y.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3149z) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3144A;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3148y.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean C() {
        synchronized (this.f3149z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3144A;
            if (atomicIntegerFieldUpdater.get(this) >= this.f3146w) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // O7.C
    public final H b(long j9, t0 t0Var, InterfaceC5138i interfaceC5138i) {
        return this.f3147x.b(j9, t0Var, interfaceC5138i);
    }

    @Override // O7.C
    public final void k(long j9, C0382g c0382g) {
        this.f3147x.k(j9, c0382g);
    }

    @Override // O7.AbstractC0395u
    public final void p(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        Runnable B8;
        this.f3148y.a(runnable);
        if (f3144A.get(this) >= this.f3146w || !C() || (B8 = B()) == null) {
            return;
        }
        this.f3145v.p(this, new RunnableC0272f(this, B8, 22, false));
    }

    @Override // O7.AbstractC0395u
    public final void q(InterfaceC5138i interfaceC5138i, Runnable runnable) {
        Runnable B8;
        this.f3148y.a(runnable);
        if (f3144A.get(this) >= this.f3146w || !C() || (B8 = B()) == null) {
            return;
        }
        this.f3145v.q(this, new RunnableC0272f(this, B8, 22, false));
    }
}
