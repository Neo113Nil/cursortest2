package androidx.compose.runtime.snapshots;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class StateMapMutableKeysIterator implements Iterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public Map.Entry current;
    public final Iterator iterator;
    public final SnapshotStateMap map;
    public int modification;
    public Map.Entry next;

    public StateMapMutableKeysIterator(SnapshotStateMap snapshotStateMap, Iterator it, int i) {
        this.$r8$classId = i;
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getReadable$runtime().modification;
        advance$1();
    }

    public final void advance$1() {
        this.current = this.next;
        Iterator it = this.iterator;
        this.next = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                Map.Entry entry = this.next;
                if (entry == null) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    advance$1();
                    break;
                }
            case 1:
                advance$1();
                if (this.current == null) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    break;
                }
            default:
                Map.Entry entry2 = this.next;
                if (entry2 == null) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    advance$1();
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateMap snapshotStateMap = this.map;
        if (snapshotStateMap.getReadable$runtime().modification != this.modification) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        Map.Entry entry = this.current;
        if (entry == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return;
        }
        snapshotStateMap.remove(entry.getKey());
        this.current = null;
        this.modification = snapshotStateMap.getReadable$runtime().modification;
    }
}
