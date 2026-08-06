package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hp0 implements Iterator, q40 {
    public final Iterator EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 0;

    public hp0(bp0 bp0Var) {
        ab1[] ab1VarArr = new ab1[8];
        for (int i = 0; i < 8; i++) {
            ab1VarArr[i] = new cb1(this);
        }
        this.EljAMC1QTz = new fp0(bp0Var, ab1VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((fp0) this.EljAMC1QTz).AvO7iQsrTN;
            default:
                return this.EljAMC1QTz.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return (Map.Entry) ((fp0) this.EljAMC1QTz).next();
            default:
                return (qd1) this.EljAMC1QTz.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((fp0) this.EljAMC1QTz).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public hp0(od1 od1Var) {
        this.EljAMC1QTz = od1Var.EljAMC1QTz.iterator();
    }
}
