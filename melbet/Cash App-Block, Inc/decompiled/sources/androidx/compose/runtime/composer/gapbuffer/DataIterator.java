package androidx.compose.runtime.composer.gapbuffer;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class DataIterator implements Iterable, Iterator, KMappedMarker {
    public final int end;
    public int index;
    public final SlotTable table;

    public DataIterator(SlotTable slotTable, int i) {
        this.table = slotTable;
        int[] iArr = slotTable.groups;
        int i2 = iArr[(i * 5) + 4];
        int i3 = i + 1;
        this.end = i3 < slotTable.groupsSize ? iArr[(i3 * 5) + 4] : slotTable.slotsSize;
        this.index = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        int i = this.index;
        if (i >= 0) {
            Object[] objArr = this.table.slots;
            if (i < objArr.length) {
                obj = objArr[i];
                this.index = i + 1;
                return obj;
            }
        }
        obj = null;
        this.index = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
