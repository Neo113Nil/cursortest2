package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;

/* loaded from: classes.dex */
public final class MutableVector implements RandomAccess {
    public Object[] content;
    public MutableVectorList list;
    public int size;

    public final class VectorListIterator implements ListIterator, KMappedMarker {
        public int index;
        public final List list;

        public VectorListIterator(List list, int i) {
            this.list = list;
            this.index = i;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.list.add(this.index, obj);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.index;
            this.index = i + 1;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.index - 1;
            this.index = i;
            return this.list.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.index - 1;
            this.index = i;
            this.list.remove(i);
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.list.set(this.index, obj);
        }
    }

    public MutableVector(int i, Object[] objArr) {
        this.content = objArr;
        this.size = i;
    }

    public final void add(int i, Object obj) {
        int i2 = this.size + 1;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.size++;
    }

    public final boolean addAll(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.size + size;
        if (this.content.length < i3) {
            resizeStorage(i3);
        }
        Object[] objArr = this.content;
        int i4 = this.size;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.size += size;
        return true;
    }

    public final List asMutableList() {
        MutableVectorList mutableVectorList = this.list;
        if (mutableVectorList != null) {
            return mutableVectorList;
        }
        MutableVectorList mutableVectorList2 = new MutableVectorList(this);
        this.list = mutableVectorList2;
        return mutableVectorList2;
    }

    public final void clear() {
        Object[] objArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
    }

    public final boolean contains(Object obj) {
        int i = this.size - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.areEqual(this.content[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int indexOf(Object obj) {
        Object[] objArr = this.content;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.areEqual(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final Object removeAt(int i) {
        Object[] objArr = this.content;
        Object obj = objArr[i];
        int i2 = this.size;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.size - 1;
        this.size = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.size;
            if (i2 < i3) {
                Object[] objArr = this.content;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.size;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.content[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.size = i5;
        }
    }

    public final void resizeStorage(int i) {
        Object[] objArr = this.content;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.content = objArr2;
    }

    public final class MutableVectorList implements List, KMutableList {
        public final MutableVector vector;

        public MutableVectorList(MutableVector mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.vector.add(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            MutableVector mutableVector = this.vector;
            return mutableVector.addAll(mutableVector.size, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.vector.contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.checkIndex(i, this);
            return this.vector.content[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.vector.size == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableVector mutableVector = this.vector;
            Object[] objArr = mutableVector.content;
            for (int i = mutableVector.size - 1; i >= 0; i--) {
                if (Intrinsics.areEqual(obj, objArr[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.checkIndex(i, this);
            return this.vector.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            MutableVector mutableVector = this.vector;
            int i = mutableVector.size;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                mutableVector.remove(it.next());
            }
            return i != mutableVector.size;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            MutableVector mutableVector = this.vector;
            int i = mutableVector.size;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(mutableVector.content[i2])) {
                    mutableVector.removeAt(i2);
                }
            }
            return i != mutableVector.size;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.checkIndex(i, this);
            Object[] objArr = this.vector.content;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.vector.size;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.checkSubIndex(i, i2, this);
            return new MutableObjectList.SubList(i, i2, 1, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return ArrayIteratorKt.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return ArrayIteratorKt.toArray(this, objArr);
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.vector.add(i, obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            return this.vector.addAll(i, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.vector.remove(obj);
        }
    }

    public final void add(Object obj) {
        int i = this.size + 1;
        if (this.content.length < i) {
            resizeStorage(i);
        }
        Object[] objArr = this.content;
        int i2 = this.size;
        objArr[i2] = obj;
        this.size = i2 + 1;
    }

    public final void addAll(int i, MutableVector mutableVector) {
        int i2 = mutableVector.size;
        if (i2 == 0) {
            return;
        }
        int i3 = this.size + i2;
        if (this.content.length < i3) {
            resizeStorage(i3);
        }
        Object[] objArr = this.content;
        int i4 = this.size;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(mutableVector.content, 0, objArr, i, i2);
        this.size += i2;
    }

    public final void addAll(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            resizeStorage(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.size += size;
    }
}
