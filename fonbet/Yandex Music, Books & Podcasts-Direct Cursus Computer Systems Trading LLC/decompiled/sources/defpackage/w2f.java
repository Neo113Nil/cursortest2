package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class w2f extends h3f {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2f(r2f r2fVar) {
        super(true);
        boolean z = true;
        Q(r2fVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h3f.b;
        hj4 hj4Var = (hj4) atomicReferenceFieldUpdater.get(this);
        ij4 ij4Var = hj4Var instanceof ij4 ? (ij4) hj4Var : null;
        if (ij4Var != null) {
            h3f j = ij4Var.j();
            while (!j.F()) {
                hj4 hj4Var2 = (hj4) atomicReferenceFieldUpdater.get(j);
                ij4 ij4Var2 = hj4Var2 instanceof ij4 ? (ij4) hj4Var2 : null;
                if (ij4Var2 != null) {
                    j = ij4Var2.j();
                }
            }
            this.c = z;
        }
        z = false;
        this.c = z;
    }

    @Override // defpackage.h3f
    public final boolean F() {
        return this.c;
    }

    @Override // defpackage.h3f
    public final boolean J() {
        return true;
    }
}
