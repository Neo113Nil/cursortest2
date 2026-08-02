package androidx.compose.runtime.snapshots;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class StateSetIterator implements Iterator, KMappedMarker {
    public Object current;
    public final Iterator iterator;
    public int modification;
    public Object next;
    public final SnapshotStateSet set;

    public StateSetIterator(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        StateSetStateRecord stateSetStateRecord = snapshotStateSet.firstStateRecord;
        stateSetStateRecord.getClass();
        this.modification = ((StateSetStateRecord) SnapshotKt.current(stateSetStateRecord)).modification;
        this.current = this.next;
        this.next = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        StateSetStateRecord stateSetStateRecord = this.set.firstStateRecord;
        stateSetStateRecord.getClass();
        if (((StateSetStateRecord) SnapshotKt.current(stateSetStateRecord)).modification != this.modification) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        this.current = this.next;
        Iterator it = this.iterator;
        this.next = it.hasNext() ? it.next() : null;
        Object obj = this.current;
        if (obj != null) {
            return obj;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.set;
        StateSetStateRecord stateSetStateRecord = snapshotStateSet.firstStateRecord;
        stateSetStateRecord.getClass();
        if (((StateSetStateRecord) SnapshotKt.current(stateSetStateRecord)).modification != this.modification) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        Object obj = this.current;
        if (obj == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        snapshotStateSet.remove(obj);
        this.current = null;
        StateSetStateRecord stateSetStateRecord2 = snapshotStateSet.firstStateRecord;
        stateSetStateRecord2.getClass();
        this.modification = ((StateSetStateRecord) SnapshotKt.current(stateSetStateRecord2)).modification;
    }
}
