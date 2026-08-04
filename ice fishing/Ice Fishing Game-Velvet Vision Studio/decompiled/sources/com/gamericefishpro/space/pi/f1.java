package com.gamericefishpro.space.pi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f1 extends l1 implements o {
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(d1 d1Var) {
        super(true);
        boolean z = true;
        S(d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar == null) {
            z = false;
            break;
        }
        l1 l1VarJ = lVar.j();
        while (!l1VarJ.L()) {
            k kVar2 = (k) atomicReferenceFieldUpdater.get(l1VarJ);
            l lVar2 = kVar2 instanceof l ? (l) kVar2 : null;
            if (lVar2 == null) {
                z = false;
                break;
            }
            l1VarJ = lVar2.j();
        }
        this.i = z;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final boolean L() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final boolean O() {
        return true;
    }
}
