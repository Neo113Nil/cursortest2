package yc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class f1 extends dd.k implements z0, k0, w0 {

    /* renamed from: j, reason: collision with root package name */
    public k1 f8844j;

    @Override // yc.k0
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k1 k3 = k();
        while (true) {
            Object M = k3.M();
            if (M instanceof f1) {
                if (M != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k1.f8872g;
                m0 m0Var = a0.f8827j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(k3, M, m0Var)) {
                    if (atomicReferenceFieldUpdater2.get(k3) != M) {
                        break;
                    }
                }
                return;
            }
            if (!(M instanceof w0) || ((w0) M).e() == null) {
                return;
            }
            while (true) {
                Object h10 = h();
                if (h10 instanceof dd.r) {
                    return;
                }
                if (h10 == this) {
                    return;
                }
                pc.j.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                dd.k kVar = (dd.k) h10;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = dd.k.f1870i;
                dd.r rVar = (dd.r) atomicReferenceFieldUpdater3.get(kVar);
                if (rVar == null) {
                    rVar = new dd.r(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, rVar);
                }
                do {
                    atomicReferenceFieldUpdater = dd.k.f1868g;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, h10, rVar)) {
                        kVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == h10);
            }
        }
    }

    @Override // yc.w0
    public final boolean b() {
        return true;
    }

    @Override // yc.w0
    public final m1 e() {
        return null;
    }

    public b1 getParent() {
        return k();
    }

    public final k1 k() {
        k1 k1Var = this.f8844j;
        if (k1Var != null) {
            return k1Var;
        }
        pc.j.k("job");
        throw null;
    }

    @Override // dd.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.j(this) + "[job@" + a0.j(k()) + ']';
    }
}
