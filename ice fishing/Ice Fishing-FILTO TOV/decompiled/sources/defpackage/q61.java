package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q61 implements Collection, q40 {
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 0;

    public q61() {
        int i = wm0.GWasM1elztuh;
        this.EljAMC1QTz = new bg0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).GWasM1elztuh(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((bg0) this.EljAMC1QTz).Yi7zF1RB1();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).X1lG3V04pd(obj);
            default:
                return ((hg0) this.EljAMC1QTz).xqGvceK5x(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((bg0) obj).X1lG3V04pd(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((hg0) obj).xqGvceK5x(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).AvO7iQsrTN == 0;
            default:
                return ((hg0) this.EljAMC1QTz).mOu10nynGul();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                bg0 bg0Var = (bg0) this.EljAMC1QTz;
                bg0Var.getClass();
                return new cy(new dg0(bg0Var));
            default:
                return q70.Y6hRI1cF8(new mq(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).AvO7iQsrTN(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).AvO7iQsrTN(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).mOu10nynGul(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                return ((bg0) this.EljAMC1QTz).AvO7iQsrTN;
            default:
                return ((hg0) this.EljAMC1QTz).OOA6hdeuvCS;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return fb1.c4eaifQP(this, objArr);
    }

    public q61(hg0 hg0Var) {
        hg0Var.getClass();
        this.EljAMC1QTz = hg0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.OOA6hdeuvCS) {
        }
        return fb1.Fm8W7vP7q(this);
    }
}
