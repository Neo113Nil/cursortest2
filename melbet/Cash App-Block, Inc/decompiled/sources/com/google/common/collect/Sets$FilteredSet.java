package com.google.common.collect;

import androidx.tracing.Trace;
import com.google.common.base.Predicate;
import com.google.common.collect.Sets$2;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public class Sets$FilteredSet extends AbstractCollection implements Set {
    public final Predicate predicate;
    public final Set unfiltered;

    public Sets$FilteredSet(Set set, Predicate predicate) {
        this.unfiltered = set;
        this.predicate = predicate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Trace.checkArgument(this.predicate.apply(obj));
        return this.unfiltered.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Trace.checkArgument(this.predicate.apply(it.next()));
        }
        return this.unfiltered.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.unfiltered;
        boolean z = set instanceof RandomAccess;
        Predicate predicate = this.predicate;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            predicate.getClass();
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        predicate.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!predicate.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        Maps.slowRemoveIfForRemainingElements(list, predicate, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        Maps.slowRemoveIfForRemainingElements(list, predicate, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.unfiltered;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.predicate.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return Maps.hashCodeImpl(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.unfiltered.iterator();
        Predicate predicate = this.predicate;
        Trace.checkNotNull(predicate, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (predicate.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.unfiltered.iterator();
        it.getClass();
        Predicate predicate = this.predicate;
        predicate.getClass();
        return new Sets$2.AnonymousClass1(it, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.unfiltered.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.unfiltered.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.predicate.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.unfiltered.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.predicate.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.unfiltered.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.predicate.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Maps.newArrayList(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return Maps.newArrayList(iterator()).toArray(objArr);
    }
}
