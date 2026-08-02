package com.google.common.collect;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public final class RegularImmutableSortedSet extends ImmutableSortedSet {
    public static final RegularImmutableSortedSet NATURAL_EMPTY_SET;
    public final transient ImmutableList elements;

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        NATURAL_EMPTY_SET = new RegularImmutableSortedSet(RegularImmutableList.EMPTY, NaturalOrdering.INSTANCE);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.elements = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return this.elements;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int tailIndex = tailIndex(obj, true);
        ImmutableList immutableList = this.elements;
        if (tailIndex == immutableList.size()) {
            return null;
        }
        return immutableList.get(tailIndex);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.elements, obj, this.comparator) >= 0) {
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
        if (collection instanceof RegularImmutableMultiset) {
            collection = ((RegularImmutableMultiset) collection).elementSet();
        }
        Comparator comparator = this.comparator;
        if (!Maps.hasSameComparator(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator it = iterator();
        Iterator it2 = collection.iterator();
        AbstractIndexedListIterator abstractIndexedListIterator = (AbstractIndexedListIterator) it;
        if (!abstractIndexedListIterator.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractIndexedListIterator.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!abstractIndexedListIterator.hasNext()) {
                        return false;
                    }
                    next2 = abstractIndexedListIterator.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(int i, Object[] objArr) {
        return this.elements.copyIntoArray(i, objArr);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.elements.reverse().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.elements.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.comparator;
        if (!Maps.hasSameComparator(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            UnmodifiableIterator it2 = iterator();
            do {
                AbstractIndexedListIterator abstractIndexedListIterator = (AbstractIndexedListIterator) it2;
                if (!abstractIndexedListIterator.hasNext()) {
                    return true;
                }
                next = abstractIndexedListIterator.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.elements.get(0);
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int headIndex = headIndex(obj, true) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    public final RegularImmutableSortedSet getSubSet(int i, int i2) {
        ImmutableList immutableList = this.elements;
        if (i == 0 && i2 == immutableList.size()) {
            return this;
        }
        Comparator comparator = this.comparator;
        return i < i2 ? new RegularImmutableSortedSet(immutableList.subList(i, i2), comparator) : NaturalOrdering.INSTANCE != comparator ? new RegularImmutableSortedSet(RegularImmutableList.EMPTY, comparator) : NATURAL_EMPTY_SET;
    }

    public final int headIndex(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.elements, obj, this.comparator);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int tailIndex = tailIndex(obj, false);
        ImmutableList immutableList = this.elements;
        if (tailIndex == immutableList.size()) {
            return null;
        }
        return immutableList.get(tailIndex);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] internalArray() {
        return this.elements.internalArray();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayEnd() {
        return this.elements.internalArrayEnd();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayStart() {
        return this.elements.internalArrayStart();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
        return this.elements.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final UnmodifiableIterator iterator() {
        return this.elements.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        return this.elements.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int headIndex = headIndex(obj, false) - 1;
        if (headIndex == -1) {
            return null;
        }
        return this.elements.get(headIndex);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.elements.size();
    }

    public final int tailIndex(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.elements, obj, this.comparator);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }
}
