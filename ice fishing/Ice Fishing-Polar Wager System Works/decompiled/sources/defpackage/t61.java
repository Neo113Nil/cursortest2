package defpackage;

/* loaded from: classes.dex */
public abstract class t61 extends defpackage.uh implements defpackage.rp0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater xiZrDbcSW0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.t61.class, "cleanedAndPointers$volatile");
    public final long adDC3e2L;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t61(long j, defpackage.t61 t61Var, int i) {
        super(t61Var);
        this.adDC3e2L = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final void DFo87pBq1E5() {
        if (xiZrDbcSW0.incrementAndGet(this) == ez2rX8ReCYw()) {
            EXtogiMhuM();
        }
    }

    public abstract void JlrlGoKF(int i, defpackage.lj ljVar);

    public final boolean SH1y5HwkJhh() {
        return xiZrDbcSW0.addAndGet(this, -65536) == ez2rX8ReCYw() && r1MBDhnF() != null;
    }

    public final boolean SyNS6RMn() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = xiZrDbcSW0;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == ez2rX8ReCYw() && r1MBDhnF() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public abstract int ez2rX8ReCYw();

    @Override // defpackage.uh
    public final boolean xiZrDbcSW0() {
        return xiZrDbcSW0.get(this) == ez2rX8ReCYw() && r1MBDhnF() != null;
    }
}
