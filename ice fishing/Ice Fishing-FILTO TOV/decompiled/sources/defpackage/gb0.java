package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gb0 implements Collection, q40 {
    public static final gb0 AvO7iQsrTN = new gb0(xp.OOA6hdeuvCS);
    public final int EljAMC1QTz;
    public final List OOA6hdeuvCS;

    public gb0(List list) {
        this.OOA6hdeuvCS = list;
        this.EljAMC1QTz = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof fb0)) {
            return false;
        }
        return this.OOA6hdeuvCS.contains((fb0) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.OOA6hdeuvCS.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gb0) {
            return this.OOA6hdeuvCS.equals(((gb0) obj).OOA6hdeuvCS);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.OOA6hdeuvCS.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.EljAMC1QTz;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return fb1.Fm8W7vP7q(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.OOA6hdeuvCS + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return fb1.c4eaifQP(this, objArr);
    }
}
