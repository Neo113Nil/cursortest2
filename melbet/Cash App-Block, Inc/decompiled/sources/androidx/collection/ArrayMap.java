package androidx.collection;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class ArrayMap extends SimpleArrayMap implements Map {
    public EntrySet mEntrySet;
    public KeySet mKeySet;
    public ValueCollection mValues;

    public final class EntrySet extends AbstractSet {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return ArrayMap.this.new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.size;
        }
    }

    public final class MapIterator implements Iterator, Map.Entry {
        public int mEnd;
        public boolean mEntryValid;
        public int mIndex = -1;

        public MapIterator() {
            this.mEnd = ArrayMap.this.size - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.mEntryValid) {
                a$$ExternalSyntheticBUOutline0.m$1("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.mIndex;
                ArrayMap arrayMap = ArrayMap.this;
                if (Intrinsics.areEqual(key, arrayMap.keyAt(i)) && Intrinsics.areEqual(entry.getValue(), arrayMap.valueAt(this.mIndex))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            if (this.mEntryValid) {
                return ArrayMap.this.keyAt(this.mIndex);
            }
            a$$ExternalSyntheticBUOutline0.m$1("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            if (this.mEntryValid) {
                return ArrayMap.this.valueAt(this.mIndex);
            }
            a$$ExternalSyntheticBUOutline0.m$1("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.mEntryValid) {
                a$$ExternalSyntheticBUOutline0.m$1("This container does not support retaining Map.Entry objects");
                return 0;
            }
            int i = this.mIndex;
            ArrayMap arrayMap = ArrayMap.this;
            Object keyAt = arrayMap.keyAt(i);
            Object valueAt = arrayMap.valueAt(this.mIndex);
            return (keyAt == null ? 0 : keyAt.hashCode()) ^ (valueAt != null ? valueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.mIndex++;
            this.mEntryValid = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.mEntryValid) {
                Path$$ExternalSyntheticBUOutline0.m();
                return;
            }
            ArrayMap.this.removeAt(this.mIndex);
            this.mIndex--;
            this.mEnd--;
            this.mEntryValid = false;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (this.mEntryValid) {
                return ArrayMap.this.setValueAt(this.mIndex, obj);
            }
            a$$ExternalSyntheticBUOutline0.m$1("This container does not support retaining Map.Entry objects");
            return null;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes3.dex */
    public final class ValueIterator extends IndexBasedArrayIterator {
        public ValueIterator() {
            super(ArrayMap.this.size);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object elementAt(int i) {
            return ArrayMap.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void removeAt(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    public ArrayMap(ArrayMap arrayMap) {
        super(0);
        putAll(arrayMap);
    }

    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.mEntrySet;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.mEntrySet = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        KeySet keySet = this.mKeySet;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.mKeySet = keySet2;
        return keySet2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ensureCapacity(map.size() + this.size);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final boolean removeAll(Collection collection) {
        int i = this.size;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.size;
    }

    public final boolean retainAll(Collection collection) {
        int i = this.size;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(keyAt(i2))) {
                removeAt(i2);
            }
        }
        return i != this.size;
    }

    @Override // java.util.Map
    public final Collection values() {
        ValueCollection valueCollection = this.mValues;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.mValues = valueCollection2;
        return valueCollection2;
    }

    public ArrayMap() {
        super(0);
    }

    public final class KeyIterator extends IndexBasedArrayIterator {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyIterator(ArraySet arraySet) {
            super(arraySet._size);
            this.this$0 = arraySet;
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object elementAt(int i) {
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    return ((ArrayMap) obj).keyAt(i);
                default:
                    return ((ArraySet) obj).f847array[i];
            }
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void removeAt(int i) {
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    ((ArrayMap) obj).removeAt(i);
                    break;
                default:
                    ((ArraySet) obj).removeAt(i);
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyIterator(ArrayMap arrayMap) {
            super(arrayMap.size);
            this.this$0 = arrayMap;
        }
    }

    public final class KeySet implements Set {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (arrayMap.size == set.size()) {
                    return arrayMap.containsAll(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = 0;
            for (int i2 = arrayMap.size - 1; i2 >= 0; i2--) {
                Object keyAt = arrayMap.keyAt(i2);
                i += keyAt == null ? 0 : keyAt.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new KeyIterator(ArrayMap.this);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int indexOfKey = arrayMap.indexOfKey(obj);
            if (indexOfKey < 0) {
                return false;
            }
            arrayMap.removeAt(indexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection collection) {
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.size;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.size;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.keyAt(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.size;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.keyAt(i2);
            }
            return objArr;
        }
    }

    /* loaded from: classes3.dex */
    public final class ValueCollection implements Collection {
        public ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return ArrayMap.this.new ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int __restricted$indexOfValue = arrayMap.__restricted$indexOfValue(obj);
            if (__restricted$indexOfValue < 0) {
                return false;
            }
            arrayMap.removeAt(__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.size;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(arrayMap.valueAt(i2))) {
                    arrayMap.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.size;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(arrayMap.valueAt(i2))) {
                    arrayMap.removeAt(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.size;
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.size;
            if (objArr.length < i) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            }
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.valueAt(i2);
            }
            if (objArr.length > i) {
                objArr[i] = null;
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int i = arrayMap.size;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = arrayMap.valueAt(i2);
            }
            return objArr;
        }
    }
}
