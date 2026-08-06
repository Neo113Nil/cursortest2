package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kc0 extends arNh8D4Z5gB {
    public final ic0 OOA6hdeuvCS;

    public kc0(ic0 ic0Var) {
        this.OOA6hdeuvCS = ic0Var;
    }

    @Override // defpackage.arNh8D4Z5gB
    public final int GWasM1elztuh() {
        return this.OOA6hdeuvCS.XnEVoBF0td1l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.OOA6hdeuvCS.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.OOA6hdeuvCS.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ic0 ic0Var = this.OOA6hdeuvCS;
        ic0Var.getClass();
        return new fc0(ic0Var, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        ic0 ic0Var = this.OOA6hdeuvCS;
        ic0Var.Yi7zF1RB1();
        int AvO7iQsrTN = ic0Var.AvO7iQsrTN(obj);
        if (AvO7iQsrTN < 0) {
            return false;
        }
        ic0Var.JFJ3QoxA(AvO7iQsrTN);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.OOA6hdeuvCS.Yi7zF1RB1();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.OOA6hdeuvCS.Yi7zF1RB1();
        return super.retainAll(collection);
    }
}
