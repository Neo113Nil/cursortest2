package L1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class O extends Q1.j implements InterfaceC0024z, I, C1.l {

    /* renamed from: d, reason: collision with root package name */
    public T f536d;

    @Override // L1.I
    public final boolean a() {
        return true;
    }

    @Override // L1.I
    public final U b() {
        return null;
    }

    @Override // L1.InterfaceC0024z
    public final void e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        T n2 = n();
        while (true) {
            Object q2 = n2.q();
            if (q2 instanceof O) {
                if (q2 != this) {
                    return;
                }
                B b2 = AbstractC0018t.i;
                do {
                    atomicReferenceFieldUpdater2 = T.f547a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(n2, q2, b2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(n2) == q2);
            } else {
                if (!(q2 instanceof I) || ((I) q2).b() == null) {
                    return;
                }
                while (true) {
                    Object k2 = k();
                    if (k2 instanceof Q1.q) {
                        Q1.j jVar = ((Q1.q) k2).f968a;
                        return;
                    }
                    if (k2 == this) {
                        return;
                    }
                    D1.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    Q1.j jVar2 = (Q1.j) k2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Q1.j.f955c;
                    Q1.q qVar = (Q1.q) atomicReferenceFieldUpdater3.get(jVar2);
                    if (qVar == null) {
                        qVar = new Q1.q(jVar2);
                        atomicReferenceFieldUpdater3.lazySet(jVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = Q1.j.f953a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, k2, qVar)) {
                            jVar2.i();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == k2);
                }
            }
        }
    }

    public final T n() {
        T t2 = this.f536d;
        if (t2 != null) {
            return t2;
        }
        D1.i.i("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // Q1.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0018t.a(this) + "[job@" + AbstractC0018t.a(n()) + ']';
    }
}
