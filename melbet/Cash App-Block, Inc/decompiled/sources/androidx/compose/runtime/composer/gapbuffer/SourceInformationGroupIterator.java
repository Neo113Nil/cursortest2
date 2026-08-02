package androidx.compose.runtime.composer.gapbuffer;

import com.squareup.cash.benefits.utils.ErrorReportingKt;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class SourceInformationGroupIterator implements Iterator, KMappedMarker {
    public int index;
    public final int parent;
    public final ErrorReportingKt path;
    public final SlotTable table;
    public final int version;

    public SourceInformationGroupIterator(SlotTable slotTable, int i, GapGroupSourceInformation gapGroupSourceInformation, ErrorReportingKt errorReportingKt) {
        this.table = slotTable;
        this.parent = i;
        this.path = errorReportingKt;
        this.version = slotTable.version;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
