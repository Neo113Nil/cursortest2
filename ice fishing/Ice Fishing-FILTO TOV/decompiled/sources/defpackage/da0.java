package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class da0 extends ih implements wk {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E7jCp8Ls = AtomicIntegerFieldUpdater.newUpdater(da0.class, "runningWorkers$volatile");
    public final /* synthetic */ wk AvO7iQsrTN;
    public final lb0 JFJ3QoxA;
    public final ih encWxUiV2;
    public final int mOu10nynGul;
    public final Object rQPn8YBR;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public da0(ih ihVar, int i) {
        wk wkVar = ihVar instanceof wk ? (wk) ihVar : null;
        this.AvO7iQsrTN = wkVar == null ? ck.GWasM1elztuh : wkVar;
        this.encWxUiV2 = ihVar;
        this.mOu10nynGul = i;
        this.JFJ3QoxA = new lb0();
        this.rQPn8YBR = new Object();
    }

    public final Runnable JFJ3QoxA() {
        while (true) {
            Runnable runnable = (Runnable) this.JFJ3QoxA.xqGvceK5x();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.rQPn8YBR) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E7jCp8Ls;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.JFJ3QoxA.X1lG3V04pd() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.ih
    public final void OOA6hdeuvCS(gh ghVar, Runnable runnable) {
        boolean z;
        Runnable JFJ3QoxA;
        this.JFJ3QoxA.GWasM1elztuh(runnable);
        if (E7jCp8Ls.get(this) < this.mOu10nynGul) {
            synchronized (this.rQPn8YBR) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E7jCp8Ls;
                if (atomicIntegerFieldUpdater.get(this) >= this.mOu10nynGul) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (!z || (JFJ3QoxA = JFJ3QoxA()) == null) {
                return;
            }
            this.encWxUiV2.OOA6hdeuvCS(this, new cz(this, JFJ3QoxA));
        }
    }

    @Override // defpackage.wk
    public final um X1lG3V04pd(long j, r91 r91Var, gh ghVar) {
        return this.AvO7iQsrTN.X1lG3V04pd(j, r91Var, ghVar);
    }

    @Override // defpackage.ih
    public final String toString() {
        return this.encWxUiV2 + ".limitedParallelism(" + this.mOu10nynGul + ')';
    }

    @Override // defpackage.wk
    public final void xqGvceK5x(long j, n9 n9Var) {
        this.AvO7iQsrTN.xqGvceK5x(j, n9Var);
    }
}
