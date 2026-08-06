package A1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class W extends F1.k implements E, N, t1.l {

    /* renamed from: d, reason: collision with root package name */
    public b0 f22d;

    @Override // A1.E
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        b0 j2 = j();
        while (true) {
            Object D2 = j2.D();
            if (D2 instanceof W) {
                if (D2 != this) {
                    return;
                }
                G g2 = AbstractC0022x.f82i;
                do {
                    atomicReferenceFieldUpdater2 = b0.f38a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(j2, D2, g2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(j2) == D2);
            } else {
                if (!(D2 instanceof N) || ((N) D2).d() == null) {
                    return;
                }
                while (true) {
                    Object g3 = g();
                    if (g3 instanceof F1.r) {
                        F1.k kVar = ((F1.r) g3).f628a;
                        return;
                    }
                    if (g3 == this) {
                        return;
                    }
                    kotlin.jvm.internal.i.c(g3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    F1.k kVar2 = (F1.k) g3;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = F1.k.f614c;
                    F1.r rVar = (F1.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new F1.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = F1.k.f612a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, g3, rVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == g3);
                }
            }
        }
    }

    @Override // A1.N
    public final boolean b() {
        return true;
    }

    @Override // A1.N
    public final c0 d() {
        return null;
    }

    public S getParent() {
        return j();
    }

    public final b0 j() {
        b0 b0Var = this.f22d;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.i.i("job");
        throw null;
    }

    public abstract void k(Throwable th);

    @Override // F1.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0022x.b(this) + "[job@" + AbstractC0022x.b(j()) + ']';
    }
}
