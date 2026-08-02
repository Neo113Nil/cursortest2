package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e9 extends i4w {
    public final AtomicReferenceFieldUpdater A;
    public final AtomicReferenceFieldUpdater B;
    public final AtomicReferenceFieldUpdater x;
    public final AtomicReferenceFieldUpdater y;
    public final AtomicReferenceFieldUpdater z;

    public e9(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.x = atomicReferenceFieldUpdater;
        this.y = atomicReferenceFieldUpdater2;
        this.z = atomicReferenceFieldUpdater3;
        this.A = atomicReferenceFieldUpdater4;
        this.B = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.i4w
    public final void P(i9 i9Var, i9 i9Var2) {
        this.y.lazySet(i9Var, i9Var2);
    }

    @Override // defpackage.i4w
    public final void Q(i9 i9Var, Thread thread) {
        this.x.lazySet(i9Var, thread);
    }

    @Override // defpackage.i4w
    public final boolean t(k9 k9Var, c9 c9Var, c9 c9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.A;
            if (atomicReferenceFieldUpdater.compareAndSet(k9Var, c9Var, c9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k9Var) == c9Var);
        return false;
    }

    @Override // defpackage.i4w
    public final boolean u(k9 k9Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.B;
            if (atomicReferenceFieldUpdater.compareAndSet(k9Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k9Var) == obj);
        return false;
    }

    @Override // defpackage.i4w
    public final boolean v(k9 k9Var, i9 i9Var, i9 i9Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.z;
            if (atomicReferenceFieldUpdater.compareAndSet(k9Var, i9Var, i9Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k9Var) == i9Var);
        return false;
    }
}
