package androidx.compose.runtime.composer.gapbuffer;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes3.dex */
public final class SourceInformationGroupDataIterator implements Iterable, Iterator, KMappedMarker {
    public final int base;
    public final int end;
    public final HeadersReader filter;
    public int index;
    public final int start;
    public final SlotTable table;

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i, GapGroupSourceInformation gapGroupSourceInformation) {
        this.table = slotTable;
        int[] iArr = slotTable.groups;
        int i2 = iArr[(i * 5) + 4];
        this.base = i2;
        this.start = 0;
        int i3 = i + 1;
        this.end = (i3 < slotTable.groupsSize ? iArr[(i3 * 5) + 4] : slotTable.slotsSize) - i2;
        HeadersReader headersReader = new HeadersReader(2);
        headersReader.source = SlotTableKt.EmptyLongArray;
        ArrayList arrayList = gapGroupSourceInformation.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (arrayList.get(i4) instanceof GapGroupSourceInformation) {
                    headersReader.headerLimit = (((0 * 1) >>> (64 - (Math.min(64, 0) - 0))) << 0) | headersReader.headerLimit;
                }
            }
        }
        this.filter = headersReader;
        this.index = headersReader.nextClear(this.start);
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
        int i = this.index;
        Object obj = (i < 0 || i >= this.end) ? null : this.table.slots[this.base + i];
        this.index = this.filter.nextClear(i + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
