package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class w7x extends u6x implements NavigableSet, Iterable {
    public static final w7x f;
    public final transient Comparator c;
    public transient w7x d;
    public final transient i6x e;

    static {
        e6x e6xVar = i6x.b;
        f = new w7x(p7x.e, m7x.b);
    }

    public w7x(i6x i6xVar, Comparator comparator) {
        this.c = comparator;
        this.e = i6xVar;
    }

    @Override // defpackage.a6x
    public final int a(Object[] objArr) {
        return this.e.a(objArr);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int w = w(obj, true);
        i6x i6xVar = this.e;
        if (w == i6xVar.size()) {
            return null;
        }
        return i6xVar.get(w);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.e, obj, this.c) >= 0) {
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
        if (collection instanceof l7x) {
            collection = ((l7x) collection).d();
        }
        Comparator comparator = this.c;
        if (!ivf.Q(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        e6x listIterator = this.e.listIterator(0);
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
        return this.e.s().listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        w7x w7xVar;
        w7x w7xVar2 = this.d;
        if (w7xVar2 == null) {
            Comparator reverseOrder = Collections.reverseOrder(this.c);
            if (!isEmpty()) {
                w7xVar = new w7x(this.e.s(), reverseOrder);
            } else if (m7x.b.equals(reverseOrder)) {
                w7xVar2 = f;
                this.d = w7xVar2;
                w7xVar2.d = this;
            } else {
                e6x e6xVar = i6x.b;
                w7xVar = new w7x(p7x.e, reverseOrder);
            }
            w7xVar2 = w7xVar;
            this.d = w7xVar2;
            w7xVar2.d = this;
        }
        return w7xVar2;
    }

    @Override // defpackage.u6x, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            i6x i6xVar = this.e;
            if (i6xVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.c;
                if (!ivf.Q(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    e6x listIterator = i6xVar.listIterator(0);
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

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.e.get(0);
        }
        wvs.n();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int v = v(obj, true) - 1;
        if (v == -1) {
            return null;
        }
        return this.e.get(v);
    }

    @Override // defpackage.a6x
    public final int g() {
        return this.e.g();
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return x(0, v(obj, false));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int w = w(obj, false);
        i6x i6xVar = this.e;
        if (w == i6xVar.size()) {
            return null;
        }
        return i6xVar.get(w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            wvs.n();
            return null;
        }
        return this.e.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int v = v(obj, false) - 1;
        if (v == -1) {
            return null;
        }
        return this.e.get(v);
    }

    @Override // defpackage.a6x
    public final int n() {
        return this.e.n();
    }

    @Override // defpackage.u6x, defpackage.a6x
    public final i6x o() {
        return this.e;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.a6x
    public final Object[] r() {
        return this.e.r();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) <= 0) {
            w7x x = x(w(obj, true), this.e.size());
            return x.x(0, x.v(obj2, false));
        }
        e7o.e();
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return x(w(obj, true), this.e.size());
    }

    public final int v(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.e, obj, this.c);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int w(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.e, obj, this.c);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final w7x x(int i, int i2) {
        i6x i6xVar = this.e;
        if (i == 0) {
            if (i2 == i6xVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.c;
        if (i < i2) {
            return new w7x(i6xVar.subList(i, i2), comparator);
        }
        if (m7x.b.equals(comparator)) {
            return f;
        }
        e6x e6xVar = i6x.b;
        return new w7x(p7x.e, comparator);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return x(0, v(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return x(w(obj, z), this.e.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) <= 0) {
            w7x x = x(w(obj, z), this.e.size());
            return x.x(0, x.v(obj2, z2));
        }
        e7o.e();
        return null;
    }
}
