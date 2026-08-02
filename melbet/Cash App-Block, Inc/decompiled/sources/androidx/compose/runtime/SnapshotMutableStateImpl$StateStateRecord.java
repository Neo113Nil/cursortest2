package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateRecord;

/* loaded from: classes.dex */
public final class SnapshotMutableStateImpl$StateStateRecord extends StateRecord {
    public Object value;

    public SnapshotMutableStateImpl$StateStateRecord(Object obj, long j) {
        super(j);
        this.value = obj;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord) {
        stateRecord.getClass();
        this.value = ((SnapshotMutableStateImpl$StateStateRecord) stateRecord).value;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new SnapshotMutableStateImpl$StateStateRecord(this.value, SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create(long j) {
        return new SnapshotMutableStateImpl$StateStateRecord(this.value, SnapshotKt.currentSnapshot().getSnapshotId());
    }
}
