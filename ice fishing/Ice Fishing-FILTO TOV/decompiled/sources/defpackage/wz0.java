package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class wz0 extends pf implements mk0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater EljAMC1QTz = AtomicIntegerFieldUpdater.newUpdater(wz0.class, "cleanedAndPointers$volatile");
    public final long OOA6hdeuvCS;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public wz0(long j, wz0 wz0Var, int i) {
        super(wz0Var);
        this.OOA6hdeuvCS = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public abstract void E7jCp8Ls(int i, gh ghVar);

    @Override // defpackage.pf
    public final boolean EljAMC1QTz() {
        return EljAMC1QTz.get(this) == rQPn8YBR() && X1lG3V04pd() != null;
    }

    public final boolean JFJ3QoxA() {
        return EljAMC1QTz.addAndGet(this, -65536) == rQPn8YBR() && X1lG3V04pd() != null;
    }

    public final void XnEVoBF0td1l() {
        if (EljAMC1QTz.incrementAndGet(this) == rQPn8YBR()) {
            encWxUiV2();
        }
    }

    public abstract int rQPn8YBR();

    public final boolean uFEq9NpZ() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = EljAMC1QTz;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == rQPn8YBR() && X1lG3V04pd() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
