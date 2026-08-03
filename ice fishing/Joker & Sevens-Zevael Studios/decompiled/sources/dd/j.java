package dd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import yc.c0;
import yc.f0;
import yc.k0;
import yc.w1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends yc.u implements f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1862n = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers$volatile");

    /* renamed from: i, reason: collision with root package name */
    public final yc.u f1863i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1864j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f1865k;

    /* renamed from: l, reason: collision with root package name */
    public final l f1866l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1867m;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public j(yc.u uVar, int i10) {
        this.f1863i = uVar;
        this.f1864j = i10;
        f0 f0Var = uVar instanceof f0 ? (f0) uVar : null;
        this.f1865k = f0Var == null ? c0.f8836a : f0Var;
        this.f1866l = new l();
        this.f1867m = new Object();
    }

    public final boolean A() {
        synchronized (this.f1867m) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1862n;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1864j) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // yc.f0
    public final k0 f(long j3, w1 w1Var, fc.i iVar) {
        return this.f1865k.f(j3, w1Var, iVar);
    }

    @Override // yc.f0
    public final void s(long j3, yc.g gVar) {
        this.f1865k.s(j3, gVar);
    }

    @Override // yc.u
    public final void w(fc.i iVar, Runnable runnable) {
        Runnable z10;
        this.f1866l.a(runnable);
        if (f1862n.get(this) >= this.f1864j || !A() || (z10 = z()) == null) {
            return;
        }
        this.f1863i.w(this, new i(0, this, z10));
    }

    @Override // yc.u
    public final void x(fc.i iVar, Runnable runnable) {
        Runnable z10;
        this.f1866l.a(runnable);
        if (f1862n.get(this) >= this.f1864j || !A() || (z10 = z()) == null) {
            return;
        }
        this.f1863i.x(this, new i(0, this, z10));
    }

    public final Runnable z() {
        while (true) {
            Runnable runnable = (Runnable) this.f1866l.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1867m) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1862n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1866l.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
