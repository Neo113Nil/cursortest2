package L0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class V extends Q0.l implements D, M, D0.l {

    /* renamed from: h, reason: collision with root package name */
    public a0 f631h;

    @Override // L0.M
    public final boolean b() {
        return true;
    }

    @Override // L0.M
    public final b0 c() {
        return null;
    }

    @Override // L0.D
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        a0 n2 = n();
        while (true) {
            Object E2 = n2.E();
            if (E2 instanceof V) {
                if (E2 != this) {
                    return;
                }
                F f2 = AbstractC0064w.f691i;
                do {
                    atomicReferenceFieldUpdater2 = a0.f646e;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, E2, f2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == E2);
            } else {
                if (!(E2 instanceof M) || ((M) E2).c() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof Q0.s) {
                        Q0.l lVar = ((Q0.s) k2).f911a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    E0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    Q0.l lVar2 = (Q0.l) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Q0.l.f897g;
                    Q0.s sVar = (Q0.s) atomicReferenceFieldUpdater3.get(lVar2);
                    if (sVar == null) {
                        sVar = new Q0.s(lVar2);
                        atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = Q0.l.f895e;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, sVar)) {
                            lVar2.h();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public Q getParent() {
        return n();
    }

    public final a0 n() {
        a0 a0Var = this.f631h;
        if (a0Var != null) {
            return a0Var;
        }
        E0.i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // Q0.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0064w.b(this) + "[job@" + AbstractC0064w.b(n()) + ']';
    }
}
