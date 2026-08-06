package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nq implements Set, q40 {
    public final hg0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public nq(hg0 hg0Var, int i) {
        this.OOA6hdeuvCS = i;
        hg0Var.getClass();
        switch (i) {
            case 1:
                this.EljAMC1QTz = hg0Var;
                break;
            default:
                this.EljAMC1QTz = hg0Var;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.OOA6hdeuvCS;
        hg0 hg0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return o30.rQPn8YBR(hg0Var.AvO7iQsrTN(entry.getKey()), entry.getValue());
            default:
                return hg0Var.X1lG3V04pd(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.OOA6hdeuvCS;
        hg0 hg0Var = this.EljAMC1QTz;
        collection.getClass();
        switch (i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!o30.rQPn8YBR(hg0Var.AvO7iQsrTN(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!hg0Var.X1lG3V04pd(it.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.EljAMC1QTz.mOu10nynGul();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        vg vgVar = null;
        switch (this.OOA6hdeuvCS) {
            case 0:
                return q70.Y6hRI1cF8(new mq(this, vgVar, 0));
            default:
                return q70.Y6hRI1cF8(new mq(this, vgVar, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.EljAMC1QTz.OOA6hdeuvCS;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return fb1.c4eaifQP(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.OOA6hdeuvCS) {
        }
        return fb1.Fm8W7vP7q(this);
    }
}
