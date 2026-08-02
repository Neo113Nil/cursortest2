package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes9.dex */
public abstract class s7q0 extends cxd implements mf60 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(s7q0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long x;

    public s7q0(long j, s7q0 s7q0Var, int i) {
        super(s7q0Var);
        this.x = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.cxd
    public final boolean g() {
        return y.get(this) == l() && d() != null;
    }

    public final boolean k() {
        return y.addAndGet(this, -65536) == l() && d() != null;
    }

    public abstract int l();

    public abstract void m(int i, fse fseVar);

    public final void n() {
        if (y.incrementAndGet(this) == l()) {
            i();
        }
    }

    public final boolean o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = y;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == l() && d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
