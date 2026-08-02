package com.google.common.collect;

import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes.dex */
public abstract class ImmutableCollection extends AbstractCollection implements Serializable {
    public static final Object[] EMPTY_ARRAY = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableList asList();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public abstract int copyIntoArray(int i, Object[] objArr);

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract UnmodifiableIterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return Maps.copy(internalArrayStart(), internalArrayEnd(), internalArray, objArr);
            }
            objArr = Maps.newArray(size, objArr);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        copyIntoArray(0, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(EMPTY_ARRAY);
    }

    public abstract class ArrayBasedBuilder {
        public Object[] contents;
        public boolean forceCopy;
        public int size;

        public ArrayBasedBuilder(int i) {
            DimensionKt.checkNonnegative(i, "initialCapacity");
            this.contents = new Object[i];
            this.size = 0;
        }

        public static int expandedCapacity(int i, int i2) {
            if (i2 < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("cannot store more than Integer.MAX_VALUE elements");
                return 0;
            }
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }

        public abstract ArrayBasedBuilder add(Object obj);

        /* renamed from: add, reason: collision with other method in class */
        public final void m2032add(Object obj) {
            obj.getClass();
            ensureRoomFor(1);
            Object[] objArr = this.contents;
            int i = this.size;
            this.size = i + 1;
            objArr[i] = obj;
        }

        public final void addAll(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                ensureRoomFor(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.size = ((ImmutableCollection) collection).copyIntoArray(this.size, this.contents);
                    return;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }

        public final void ensureRoomFor(int i) {
            Object[] objArr = this.contents;
            int expandedCapacity = expandedCapacity(objArr.length, this.size + i);
            if (expandedCapacity > objArr.length || this.forceCopy) {
                this.contents = Arrays.copyOf(this.contents, expandedCapacity);
                this.forceCopy = false;
            }
        }

        public final void addAll(int i, Object[] objArr) {
            PlatformKt.checkElementsNotNull(i, objArr);
            ensureRoomFor(i);
            System.arraycopy(objArr, 0, this.contents, this.size, i);
            this.size += i;
        }
    }
}
