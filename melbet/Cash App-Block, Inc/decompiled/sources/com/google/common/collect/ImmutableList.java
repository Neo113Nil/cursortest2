package com.google.common.collect;

import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class ImmutableList extends ImmutableCollection implements List, RandomAccess {
    public static final Itr EMPTY_ITR = new Itr(RegularImmutableList.EMPTY, 0);

    public final class Builder extends ImmutableCollection.ArrayBasedBuilder {
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableCollection.ArrayBasedBuilder add(Object obj) {
            m2032add(obj);
            return this;
        }

        public final RegularImmutableList build() {
            this.forceCopy = true;
            return ImmutableList.asImmutableList(this.size, this.contents);
        }
    }

    public final class Itr extends AbstractIndexedListIterator {
        public final ImmutableList list;

        public Itr(ImmutableList immutableList, int i) {
            super(immutableList.size(), i);
            this.list = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object get(int i) {
            return this.list.get(i);
        }
    }

    public static RegularImmutableList asImmutableList(int i, Object[] objArr) {
        return i == 0 ? RegularImmutableList.EMPTY : new RegularImmutableList(i, objArr);
    }

    public static Builder builder() {
        return new Builder(4);
    }

    public static Builder builderWithExpectedSize(int i) {
        DimensionKt.checkNonnegative(i, "expectedSize");
        return new Builder(i);
    }

    public static ImmutableList copyOf(Iterable iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableList.EMPTY;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        Builder builder = new Builder(4);
        builder.m2032add(next);
        while (it.hasNext()) {
            builder.m2032add(it.next());
        }
        return builder.build();
    }

    public static RegularImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Trace.checkArgument("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        PlatformKt.checkElementsNotNull(length, objArr2);
        return asImmutableList(length, objArr2);
    }

    public static RegularImmutableList sortedCopyOf(Ordering ordering, List list) {
        ordering.getClass();
        Object[] array2 = Maps.toArray(list);
        PlatformKt.checkElementsNotNull(array2.length, array2);
        Arrays.sort(array2, ordering);
        return asImmutableList(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return Maps.equalsImpl(obj, this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Maps.indexOfImpl(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final UnmodifiableIterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Maps.lastIndexOfImpl(this, obj);
    }

    @Override // java.util.List
    public final Itr listIterator(int i) {
        Trace.checkPositionIndex(i, size());
        return isEmpty() ? EMPTY_ITR : new Itr(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ImmutableList subList(int i, int i2) {
        Trace.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? RegularImmutableList.EMPTY : new SubList(i, i3);
    }

    /* loaded from: classes4.dex */
    public final class ReverseImmutableList extends ImmutableList {
        public final transient ImmutableList forwardList;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.forwardList = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.forwardList.contains(obj);
        }

        @Override // java.util.List
        public final Object get(int i) {
            ImmutableList immutableList = this.forwardList;
            Trace.checkElementIndex(i, immutableList.size());
            return immutableList.get((immutableList.size() - 1) - i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            int lastIndexOf = this.forwardList.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return (r0.size() - 1) - lastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            int indexOf = this.forwardList.indexOf(obj);
            if (indexOf >= 0) {
                return (r0.size() - 1) - indexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList reverse() {
            return this.forwardList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ImmutableList subList(int i, int i2) {
            ImmutableList immutableList = this.forwardList;
            Trace.checkPositionIndexes(i, i2, immutableList.size());
            return immutableList.subList(immutableList.size() - i2, immutableList.size() - i).reverse();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    /* loaded from: classes4.dex */
    public final class SubList extends ImmutableList {
        public final transient int length;
        public final transient int offset;

        public SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            Trace.checkElementIndex(i, this.length);
            return ImmutableList.this.get(i + this.offset);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ImmutableList subList(int i, int i2) {
            Trace.checkPositionIndexes(i, i2, this.length);
            int i3 = this.offset;
            return ImmutableList.this.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public static ImmutableList copyOf(Collection collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList asList = ((ImmutableCollection) collection).asList();
            if (!asList.isPartialView()) {
                return asList;
            }
            Object[] array2 = asList.toArray(ImmutableCollection.EMPTY_ARRAY);
            return asImmutableList(array2.length, array2);
        }
        Object[] array3 = collection.toArray();
        PlatformKt.checkElementsNotNull(array3.length, array3);
        return asImmutableList(array3.length, array3);
    }

    public static RegularImmutableList copyOf(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.EMPTY;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        PlatformKt.checkElementsNotNull(objArr2.length, objArr2);
        return asImmutableList(objArr2.length, objArr2);
    }

    public static RegularImmutableList of(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        PlatformKt.checkElementsNotNull(2, objArr);
        return asImmutableList(2, objArr);
    }

    public static RegularImmutableList of(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        PlatformKt.checkElementsNotNull(3, objArr);
        return asImmutableList(3, objArr);
    }

    public static RegularImmutableList of(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        PlatformKt.checkElementsNotNull(5, objArr);
        return asImmutableList(5, objArr);
    }

    public static RegularImmutableList of(Object obj) {
        Object[] objArr = {obj};
        PlatformKt.checkElementsNotNull(1, objArr);
        return asImmutableList(1, objArr);
    }
}
