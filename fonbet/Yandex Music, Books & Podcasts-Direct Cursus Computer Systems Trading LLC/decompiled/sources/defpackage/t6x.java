package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class t6x extends c6x {
    public static final t6x i;
    public final transient q5x h;

    static {
        t4x t4xVar = q5x.d;
        i = new t6x(o6x.g, l6x.b);
    }

    public t6x(q5x q5xVar, Comparator comparator) {
        super(comparator);
        this.h = q5xVar;
    }

    public final int A(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.h, obj, this.f);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final t6x B(int i2, int i3) {
        q5x q5xVar = this.h;
        if (i2 == 0) {
            if (i3 == q5xVar.size()) {
                return this;
            }
            i2 = 0;
        }
        Comparator comparator = this.f;
        return i2 < i3 ? new t6x(q5xVar.subList(i2, i3), comparator) : c6x.y(comparator);
    }

    @Override // defpackage.r4x
    public final int a(Object[] objArr) {
        return this.h.a(objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int A = A(obj, true);
        q5x q5xVar = this.h;
        if (A == q5xVar.size()) {
            return null;
        }
        return q5xVar.get(A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.h, obj, this.f) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof k6x) {
            collection = ((k6x) collection).d();
        }
        Comparator comparator = this.f;
        if (!avf.W(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        t4x listIterator = this.h.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.h.s().listIterator(0);
    }

    @Override // defpackage.u5x, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            q5x q5xVar = this.h;
            if (q5xVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f;
                if (!avf.W(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    t4x listIterator = q5xVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.c6x, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.h.get(0);
        }
        wvs.n();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int z = z(obj, true) - 1;
        if (z == -1) {
            return null;
        }
        return this.h.get(z);
    }

    @Override // defpackage.r4x
    public final int g() {
        return this.h.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int A = A(obj, false);
        q5x q5xVar = this.h;
        if (A == q5xVar.size()) {
            return null;
        }
        return q5xVar.get(A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.h.listIterator(0);
    }

    @Override // defpackage.c6x, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            wvs.n();
            return null;
        }
        return this.h.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int z = z(obj, false) - 1;
        if (z == -1) {
            return null;
        }
        return this.h.get(z);
    }

    @Override // defpackage.r4x
    public final int n() {
        return this.h.n();
    }

    @Override // defpackage.r4x
    public final xkt o() {
        return this.h.listIterator(0);
    }

    @Override // defpackage.r4x
    public final Object[] q() {
        return this.h.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h.size();
    }

    @Override // defpackage.u5x
    public final q5x u() {
        return this.h;
    }

    public final int z(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.h, obj, this.f);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }
}
