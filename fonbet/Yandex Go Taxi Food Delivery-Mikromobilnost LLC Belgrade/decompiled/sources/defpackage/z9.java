package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes11.dex */
public final class z9 extends wha1 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public z9(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.wha1
    public final boolean d(fa faVar, x9 x9Var, x9 x9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(faVar, x9Var, x9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(faVar) == x9Var);
        return false;
    }

    @Override // defpackage.wha1
    public final boolean e(fa faVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(faVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(faVar) == obj);
        return false;
    }

    @Override // defpackage.wha1
    public final boolean f(fa faVar, da daVar, da daVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(faVar, daVar, daVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(faVar) == daVar);
        return false;
    }

    @Override // defpackage.wha1
    public final void h(da daVar, da daVar2) {
        this.b.lazySet(daVar, daVar2);
    }

    @Override // defpackage.wha1
    public final void i(da daVar, Thread thread) {
        this.a.lazySet(daVar, thread);
    }
}
