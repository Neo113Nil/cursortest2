package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class k6 extends qwp {
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;

    public k6(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.k = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.qwp
    public final boolean A(v6 v6Var, j6 j6Var, j6 j6Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(v6Var, j6Var, j6Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(v6Var) == j6Var);
        return false;
    }

    @Override // defpackage.qwp
    public final boolean B(v6 v6Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(v6Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(v6Var) == obj);
        return false;
    }

    @Override // defpackage.qwp
    public final boolean C(v6 v6Var, u6 u6Var, u6 u6Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(v6Var, u6Var, u6Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(v6Var) == u6Var);
        return false;
    }

    @Override // defpackage.qwp
    public final j6 L(v6 v6Var) {
        return (j6) this.j.getAndSet(v6Var, j6.d);
    }

    @Override // defpackage.qwp
    public final u6 M(v6 v6Var) {
        return (u6) this.i.getAndSet(v6Var, u6.c);
    }

    @Override // defpackage.qwp
    public final void k0(u6 u6Var, u6 u6Var2) {
        this.h.lazySet(u6Var, u6Var2);
    }

    @Override // defpackage.qwp
    public final void l0(u6 u6Var, Thread thread) {
        this.g.lazySet(u6Var, thread);
    }
}
