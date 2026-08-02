package app.cash.redwood.lazylayout.widget;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.RingBuffer$iterator$1;

/* loaded from: classes3.dex */
public final class SparseList extends AbstractList {
    public final ArrayList elements = new ArrayList();
    public final ArrayList externalIndexes = CollectionsKt__CollectionsKt.mutableListOf(0);

    @Override // kotlin.collections.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        if (i < 0 || i > getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        int insertIndex = insertIndex(i);
        ArrayList arrayList = this.externalIndexes;
        if (obj != null) {
            this.elements.add(insertIndex, obj);
            arrayList.add(insertIndex, Integer.valueOf(i));
            insertIndex++;
        }
        int size = arrayList.size();
        while (insertIndex < size) {
            arrayList.set(insertIndex, Integer.valueOf(((Number) arrayList.get(insertIndex)).intValue() + 1));
            insertIndex++;
        }
    }

    public final void addNulls(int i, int i2) {
        if (i < 0 || i > getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        ArrayList arrayList = this.externalIndexes;
        int size = arrayList.size();
        for (int insertIndex = insertIndex(i); insertIndex < size; insertIndex++) {
            arrayList.set(insertIndex, Integer.valueOf(((Number) arrayList.get(insertIndex)).intValue() + i2));
        }
    }

    public final void addRange(int i, SparseList sparseList, int i2, int i3) {
        sparseList.getClass();
        if (i < 0 || i > getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        if (i2 < 0 || i2 > sparseList.getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        if (i3 < 0 || i3 > sparseList.getSize() - i2) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        int insertIndex = insertIndex(i);
        int insertIndex2 = sparseList.insertIndex(i2);
        int insertIndex3 = sparseList.insertIndex(i2 + i3);
        this.elements.addAll(insertIndex, sparseList.elements.subList(insertIndex2, insertIndex3));
        ArrayList arrayList = this.externalIndexes;
        List subList = arrayList.subList(insertIndex, arrayList.size());
        Integer[] numArr = (Integer[]) subList.toArray(new Integer[0]);
        subList.clear();
        while (insertIndex2 < insertIndex3) {
            arrayList.add(Integer.valueOf((((Number) sparseList.externalIndexes.get(insertIndex2)).intValue() + i) - i2));
            insertIndex2++;
        }
        for (Integer num : numArr) {
            arrayList.add(Integer.valueOf(num.intValue() + i3));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.externalIndexes, Integer.valueOf(i));
        if (binarySearch$default < 0) {
            return null;
        }
        return this.elements.get(binarySearch$default);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return ((Number) CollectionsKt.last((List) this.externalIndexes)).intValue();
    }

    public final int insertIndex(int i) {
        int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.externalIndexes, Integer.valueOf(i));
        return binarySearch$default >= 0 ? binarySearch$default : (-1) - binarySearch$default;
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new RingBuffer$iterator$1(this);
    }

    public final Object removeAt(int i) {
        if (i < 0 || i >= getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.externalIndexes;
        int binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(arrayList, valueOf);
        if (binarySearch$default < 0) {
            int size = arrayList.size();
            for (int i2 = (-1) - binarySearch$default; i2 < size; i2++) {
                arrayList.set(i2, Integer.valueOf(((Number) arrayList.get(i2)).intValue() - 1));
            }
            return null;
        }
        arrayList.remove(binarySearch$default);
        int size2 = arrayList.size();
        for (int i3 = binarySearch$default; i3 < size2; i3++) {
            arrayList.set(i3, Integer.valueOf(((Number) arrayList.get(i3)).intValue() - 1));
        }
        return this.elements.remove(binarySearch$default);
    }

    public final Object removeLast() {
        return removeAt(getSize() - 1);
    }

    public final void removeRange(int i, int i2) {
        if (i < 0 || i > getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        if (i > i2 || i2 > getSize()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        int i3 = i2 - i;
        int insertIndex = insertIndex(i);
        int insertIndex2 = insertIndex(i2);
        ArrayList arrayList = this.externalIndexes;
        arrayList.subList(insertIndex, insertIndex2).clear();
        this.elements.subList(insertIndex, insertIndex2).clear();
        int size = arrayList.size();
        while (insertIndex < size) {
            arrayList.set(insertIndex, Integer.valueOf(((Number) arrayList.get(insertIndex)).intValue() - i3));
            insertIndex++;
        }
    }
}
