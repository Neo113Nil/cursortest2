package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class c0 extends X7.k implements H, V, I7.l {

    /* renamed from: w, reason: collision with root package name */
    public h0 f2947w;

    @Override // S7.H
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        h0 h9 = h();
        while (true) {
            Object C8 = h9.C();
            if (C8 instanceof c0) {
                if (C8 != this) {
                    return;
                }
                J j6 = AbstractC0406y.f3015j;
                do {
                    atomicReferenceFieldUpdater2 = h0.f2970n;
                    if (atomicReferenceFieldUpdater2.compareAndSet(h9, C8, j6)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(h9) == C8);
            } else {
                if (!(C8 instanceof V) || ((V) C8).k() == null) {
                    return;
                }
                while (true) {
                    Object e9 = e();
                    if (e9 instanceof X7.q) {
                        X7.k kVar = ((X7.q) e9).f3857a;
                        return;
                    }
                    if (e9 == this) {
                        return;
                    }
                    kotlin.jvm.internal.h.c(e9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    X7.k kVar2 = (X7.k) e9;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = X7.k.f3846v;
                    X7.q qVar = (X7.q) atomicReferenceFieldUpdater3.get(kVar2);
                    if (qVar == null) {
                        qVar = new X7.q(kVar2);
                        atomicReferenceFieldUpdater3.set(kVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = X7.k.f3844n;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, e9, qVar)) {
                            kVar2.c();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == e9);
                }
            }
        }
    }

    public Y getParent() {
        return h();
    }

    public final h0 h() {
        h0 h0Var = this.f2947w;
        if (h0Var != null) {
            return h0Var;
        }
        kotlin.jvm.internal.h.k("job");
        throw null;
    }

    public abstract void i(Throwable th);

    @Override // S7.V
    public final boolean j() {
        return true;
    }

    @Override // S7.V
    public final k0 k() {
        return null;
    }

    @Override // X7.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0406y.j(this) + "[job@" + AbstractC0406y.j(h()) + ']';
    }
}
