package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.time.zzfh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class SmallSortedMap$1 extends AbstractMap {
    public static final /* synthetic */ int $r8$clinit = 0;
    public List entryList;
    public boolean isImmutable;
    public volatile zzfh lazyEntrySet;
    public Map overflowEntries;
    public Map overflowEntriesDescending;

    public static SmallSortedMap$1 newFieldMap() {
        SmallSortedMap$1 smallSortedMap$1 = new SmallSortedMap$1();
        smallSortedMap$1.entryList = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        smallSortedMap$1.overflowEntries = map;
        smallSortedMap$1.overflowEntriesDescending = map;
        return smallSortedMap$1;
    }

    public final int binarySearchInArray(Comparable comparable) {
        int i;
        int size = this.entryList.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((SmallSortedMap$Entry) this.entryList.get(i2)).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((SmallSortedMap$Entry) this.entryList.get(i4)).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void checkMutable() {
        if (this.isImmutable) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new zzfh(this, 1);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap$1)) {
            return super.equals(obj);
        }
        SmallSortedMap$1 smallSortedMap$1 = (SmallSortedMap$1) obj;
        int size = size();
        if (size == smallSortedMap$1.size()) {
            int size2 = this.entryList.size();
            if (size2 != smallSortedMap$1.entryList.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap$1.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (getArrayEntryAt(i).equals(smallSortedMap$1.getArrayEntryAt(i))) {
                }
            }
            if (size2 != size) {
                return this.overflowEntries.equals(smallSortedMap$1.overflowEntries);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        return binarySearchInArray >= 0 ? ((SmallSortedMap$Entry) this.entryList.get(binarySearchInArray)).getValue() : this.overflowEntries.get(comparable);
    }

    public final Map.Entry getArrayEntryAt(int i) {
        return (Map.Entry) this.entryList.get(i);
    }

    public final Set getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? Collections.EMPTY_SET : this.overflowEntries.entrySet();
    }

    public final SortedMap getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.entryList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((SmallSortedMap$Entry) this.entryList.get(i2)).hashCode();
        }
        return this.overflowEntries.size() > 0 ? this.overflowEntries.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: put$androidx$datastore$preferences$protobuf$SmallSortedMap, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return ((SmallSortedMap$Entry) this.entryList.get(binarySearchInArray)).setValue(obj);
        }
        checkMutable();
        if (this.entryList.isEmpty() && !(this.entryList instanceof ArrayList)) {
            this.entryList = new ArrayList(16);
        }
        int i = -(binarySearchInArray + 1);
        if (i >= 16) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        if (this.entryList.size() == 16) {
            SmallSortedMap$Entry smallSortedMap$Entry = (SmallSortedMap$Entry) this.entryList.remove(15);
            getOverflowEntriesMutable().put(smallSortedMap$Entry.getKey(), smallSortedMap$Entry.getValue());
        }
        this.entryList.add(i, new SmallSortedMap$Entry(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    public final Object removeArrayEntryAt(int i) {
        checkMutable();
        Object value = ((SmallSortedMap$Entry) this.entryList.remove(i)).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new SmallSortedMap$Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.overflowEntries.size() + this.entryList.size();
    }
}
