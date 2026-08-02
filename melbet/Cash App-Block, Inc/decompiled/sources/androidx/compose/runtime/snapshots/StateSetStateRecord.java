package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;

/* loaded from: classes3.dex */
public final class StateSetStateRecord extends StateRecord {
    public int modification;
    public PersistentOrderedSet set;

    public StateSetStateRecord(long j, PersistentOrderedSet persistentOrderedSet) {
        super(j);
        this.set = persistentOrderedSet;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord) {
        synchronized (SnapshotStateMapKt.sync$1) {
            stateRecord.getClass();
            this.set = ((StateSetStateRecord) stateRecord).set;
            this.modification = ((StateSetStateRecord) stateRecord).modification;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create(long j) {
        return new StateSetStateRecord(j, this.set);
    }
}
