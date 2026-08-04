package com.gamericefishpro.space.pi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends com.gamericefishpro.space.ui.i implements m0, z0 {
    public l1 v;

    @Override // com.gamericefishpro.space.pi.m0
    public final void a() {
        l1 l1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.d;
            Object obj = atomicReferenceFieldUpdater.get(l1VarJ);
            if (obj instanceof h1) {
                if (obj != this) {
                    return;
                }
                o0 o0Var = a0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(l1VarJ, obj, o0Var)) {
                    if (atomicReferenceFieldUpdater.get(l1VarJ) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof z0) || ((z0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = com.gamericefishpro.space.ui.i.d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof com.gamericefishpro.space.ui.n) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                com.gamericefishpro.space.ui.i iVar = (com.gamericefishpro.space.ui.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = com.gamericefishpro.space.ui.i.i;
                com.gamericefishpro.space.ui.n nVar = (com.gamericefishpro.space.ui.n) atomicReferenceFieldUpdater3.get(iVar);
                if (nVar == null) {
                    nVar = new com.gamericefishpro.space.ui.n(iVar);
                    atomicReferenceFieldUpdater3.set(iVar, nVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                        iVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    @Override // com.gamericefishpro.space.pi.z0
    public final boolean b() {
        return true;
    }

    @Override // com.gamericefishpro.space.pi.z0
    public final n1 d() {
        return null;
    }

    public d1 getParent() {
        return j();
    }

    public final l1 j() {
        l1 l1Var = this.v;
        if (l1Var != null) {
            return l1Var;
        }
        Intrinsics.h("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // com.gamericefishpro.space.ui.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.m(this) + "[job@" + a0.m(j()) + ']';
    }
}
