package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes9.dex */
public final class sfy extends jse implements fph {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(sfy.class, "runningWorkers$volatile");
    public final /* synthetic */ fph b;
    public final jse c;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final int w;
    public final sdz x;
    public final Object y;

    /* JADX WARN: Multi-variable type inference failed */
    public sfy(jse jseVar, int i) {
        fph fphVar = jseVar instanceof fph ? (fph) jseVar : null;
        this.b = fphVar == null ? ebh.a : fphVar;
        this.c = jseVar;
        this.w = i;
        this.x = new sdz();
        this.y = new Object();
    }

    @Override // defpackage.jse
    public final void B(fse fseVar, Runnable runnable) {
        Runnable R;
        this.x.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
        if (atomicIntegerFieldUpdater.get(this) >= this.w || !T() || (R = R()) == null) {
            return;
        }
        try {
            this.c.B(this, new na3(4, this, R));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.jse
    public final jse P(int i) {
        cma1.n(i);
        return i >= this.w ? this : super.P(i);
    }

    public final Runnable R() {
        while (true) {
            Runnable runnable = (Runnable) this.x.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.y) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.x.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean T() {
        synchronized (this.y) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
            if (atomicIntegerFieldUpdater.get(this) >= this.w) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.fph
    public final void d(long j, j18 j18Var) {
        this.b.d(j, j18Var);
    }

    @Override // defpackage.fph
    public final m1k e(long j, Runnable runnable, fse fseVar) {
        return this.b.e(j, runnable, fseVar);
    }

    @Override // defpackage.jse
    public final void o(fse fseVar, Runnable runnable) {
        Runnable R;
        this.x.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z;
        if (atomicIntegerFieldUpdater.get(this) >= this.w || !T() || (R = R()) == null) {
            return;
        }
        try {
            bvf0.Q(this, this.c, new na3(4, this, R));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.jse
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append(".limitedParallelism(");
        return oyr.s(sb, this.w, ')');
    }
}
