package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final class d9 extends leu {
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;

    public d9(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.h = atomicReferenceFieldUpdater;
        this.i = atomicReferenceFieldUpdater2;
        this.j = atomicReferenceFieldUpdater3;
        this.k = atomicReferenceFieldUpdater4;
        this.l = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.leu
    public final boolean H(j9 j9Var, b9 b9Var, b9 b9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(j9Var, b9Var, b9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j9Var) == b9Var);
        return false;
    }

    @Override // defpackage.leu
    public final boolean I(j9 j9Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(j9Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j9Var) == obj);
        return false;
    }

    @Override // defpackage.leu
    public final boolean J(j9 j9Var, h9 h9Var, h9 h9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(j9Var, h9Var, h9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j9Var) == h9Var);
        return false;
    }

    @Override // defpackage.leu
    public final void V(h9 h9Var, h9 h9Var2) {
        this.i.lazySet(h9Var, h9Var2);
    }

    @Override // defpackage.leu
    public final void W(h9 h9Var, Thread thread) {
        this.h.lazySet(h9Var, thread);
    }
}
