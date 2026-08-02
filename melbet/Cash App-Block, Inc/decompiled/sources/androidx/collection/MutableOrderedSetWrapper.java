package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SubSequence$iterator$1;

/* loaded from: classes3.dex */
public final class MutableOrderedSetWrapper implements KMutableSet, Set, KMappedMarker {
    public final MutableOrderedScatterSet parent;
    public final MutableOrderedScatterSet parent$1;

    public MutableOrderedSetWrapper(MutableOrderedScatterSet mutableOrderedScatterSet) {
        mutableOrderedScatterSet.getClass();
        mutableOrderedScatterSet.getClass();
        this.parent$1 = mutableOrderedScatterSet;
        this.parent = mutableOrderedScatterSet;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.parent.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        MutableOrderedScatterSet mutableOrderedScatterSet = this.parent;
        mutableOrderedScatterSet.getClass();
        collection2.getClass();
        int i = mutableOrderedScatterSet._size;
        for (Object obj : collection2) {
            int findAbsoluteInsertIndex = mutableOrderedScatterSet.findAbsoluteInsertIndex(obj);
            mutableOrderedScatterSet.elements[findAbsoluteInsertIndex] = obj;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i2 = mutableOrderedScatterSet.head;
            jArr[findAbsoluteInsertIndex] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((findAbsoluteInsertIndex & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            mutableOrderedScatterSet.head = findAbsoluteInsertIndex;
            if (mutableOrderedScatterSet.tail == Integer.MAX_VALUE) {
                mutableOrderedScatterSet.tail = findAbsoluteInsertIndex;
            }
        }
        return i != mutableOrderedScatterSet._size;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.parent$1.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent$1.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutableOrderedSetWrapper.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.parent$1, ((MutableOrderedSetWrapper) obj).parent$1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.parent$1.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.parent$1._size == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new SubSequence$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.parent.remove(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        Collection collection2 = collection;
        MutableOrderedScatterSet mutableOrderedScatterSet = this.parent;
        mutableOrderedScatterSet.getClass();
        collection2.getClass();
        int i3 = mutableOrderedScatterSet._size;
        Iterator it = collection2.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = mutableOrderedScatterSet._capacity;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = mutableOrderedScatterSet.metadata;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (Intrinsics.areEqual(mutableOrderedScatterSet.elements[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                mutableOrderedScatterSet.removeElementAt(i2);
            }
        }
        return i3 != mutableOrderedScatterSet._size;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.parent.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.parent$1._size;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ArrayIteratorKt.toArray(this, objArr);
    }

    public final String toString() {
        return this.parent$1.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }
}
