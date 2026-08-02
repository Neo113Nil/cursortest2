package androidx.compose.runtime.snapshots;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class StateListIterator implements ListIterator, KMappedMarker {
    public int index;
    public int lastRequested = -1;
    public final SnapshotStateList list;
    public int structure;

    public StateListIterator(SnapshotStateList snapshotStateList, int i) {
        this.list = snapshotStateList;
        this.index = i - 1;
        this.structure = SnapshotId_jvmKt.getStructure(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        validateModification();
        int i = this.index + 1;
        SnapshotStateList snapshotStateList = this.list;
        snapshotStateList.add(i, obj);
        this.lastRequested = -1;
        this.index++;
        this.structure = SnapshotId_jvmKt.getStructure(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        validateModification();
        int i = this.index + 1;
        this.lastRequested = i;
        SnapshotStateList snapshotStateList = this.list;
        SnapshotId_jvmKt.access$validateRange(i, snapshotStateList.size());
        Object obj = snapshotStateList.get(i);
        this.index = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        validateModification();
        int i = this.index;
        SnapshotStateList snapshotStateList = this.list;
        SnapshotId_jvmKt.access$validateRange(i, snapshotStateList.size());
        int i2 = this.index;
        this.lastRequested = i2;
        this.index--;
        return snapshotStateList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        validateModification();
        int i = this.lastRequested;
        SnapshotStateList snapshotStateList = this.list;
        snapshotStateList.remove(i);
        this.index--;
        this.lastRequested = -1;
        this.structure = SnapshotId_jvmKt.getStructure(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        validateModification();
        int i = this.lastRequested;
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            return;
        }
        SnapshotStateList snapshotStateList = this.list;
        snapshotStateList.set(i, obj);
        this.structure = SnapshotId_jvmKt.getStructure(snapshotStateList);
    }

    public final void validateModification() {
        if (SnapshotId_jvmKt.getStructure(this.list) == this.structure) {
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m$1();
    }
}
