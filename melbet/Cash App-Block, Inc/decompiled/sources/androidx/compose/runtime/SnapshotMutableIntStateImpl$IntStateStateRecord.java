package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateRecord;

/* loaded from: classes.dex */
public final class SnapshotMutableIntStateImpl$IntStateStateRecord extends StateRecord {
    public int value;

    public SnapshotMutableIntStateImpl$IntStateStateRecord(long j, int i) {
        super(j);
        this.value = i;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord) {
        stateRecord.getClass();
        this.value = ((SnapshotMutableIntStateImpl$IntStateStateRecord) stateRecord).value;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return create(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create(long j) {
        return new SnapshotMutableIntStateImpl$IntStateStateRecord(j, this.value);
    }
}
