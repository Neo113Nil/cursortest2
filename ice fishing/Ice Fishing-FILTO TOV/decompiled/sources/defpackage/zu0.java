package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zu0 implements ListIterator, q40 {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 0;

    public zu0(bv0 bv0Var, int i) {
        this.AvO7iQsrTN = bv0Var;
        this.EljAMC1QTz = bv0Var.OOA6hdeuvCS.listIterator(rb.rASgSCrgZkT7(i, bv0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                ListIterator listIterator = (ListIterator) this.EljAMC1QTz;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((pt0) obj).OOA6hdeuvCS < ((l61) this.AvO7iQsrTN).encWxUiV2 - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((pt0) obj).OOA6hdeuvCS >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                pt0 pt0Var = (pt0) obj;
                int i2 = pt0Var.OOA6hdeuvCS + 1;
                l61 l61Var = (l61) this.AvO7iQsrTN;
                qj.EljAMC1QTz(i2, l61Var.encWxUiV2);
                pt0Var.OOA6hdeuvCS = i2;
                return l61Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int size;
        int i = this.OOA6hdeuvCS;
        Object obj = this.AvO7iQsrTN;
        Object obj2 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((av0) obj).size();
                break;
            case 1:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((bv0) obj).size();
                break;
            default:
                return ((pt0) obj2).OOA6hdeuvCS + 1;
        }
        return (size - 1) - previousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                pt0 pt0Var = (pt0) obj;
                int i2 = pt0Var.OOA6hdeuvCS;
                l61 l61Var = (l61) this.AvO7iQsrTN;
                qj.EljAMC1QTz(i2, l61Var.encWxUiV2);
                pt0Var.OOA6hdeuvCS = i2 - 1;
                return l61Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int size;
        int i = this.OOA6hdeuvCS;
        Object obj = this.AvO7iQsrTN;
        Object obj2 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((av0) obj).size();
                break;
            case 1:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((bv0) obj).size();
                break;
            default:
                return ((pt0) obj2).OOA6hdeuvCS;
        }
        return (size - 1) - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((ListIterator) this.EljAMC1QTz).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((ListIterator) this.EljAMC1QTz).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public zu0(av0 av0Var, int i) {
        this.AvO7iQsrTN = av0Var;
        this.EljAMC1QTz = av0Var.OOA6hdeuvCS.listIterator(rb.rASgSCrgZkT7(i, av0Var));
    }

    public zu0(pt0 pt0Var, l61 l61Var) {
        this.EljAMC1QTz = pt0Var;
        this.AvO7iQsrTN = l61Var;
    }
}
