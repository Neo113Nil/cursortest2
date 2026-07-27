package K0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class V extends P0.l implements D, M, D0.l {

    /* renamed from: i, reason: collision with root package name */
    public a0 f483i;

    @Override // K0.M
    public final boolean b() {
        return true;
    }

    @Override // K0.M
    public final b0 c() {
        return null;
    }

    @Override // K0.D
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
                F f2 = AbstractC0046w.f543i;
                do {
                    atomicReferenceFieldUpdater2 = a0.f498f;
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
                    if (k2 instanceof P0.s) {
                        P0.l lVar = ((P0.s) k2).f902a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    E0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    P0.l lVar2 = (P0.l) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = P0.l.f888h;
                    P0.s sVar = (P0.s) atomicReferenceFieldUpdater3.get(lVar2);
                    if (sVar == null) {
                        sVar = new P0.s(lVar2);
                        atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = P0.l.f886f;
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
        a0 a0Var = this.f483i;
        if (a0Var != null) {
            return a0Var;
        }
        E0.i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // P0.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0046w.b(this) + "[job@" + AbstractC0046w.b(n()) + ']';
    }
}
