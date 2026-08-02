package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateRecord;

/* loaded from: classes.dex */
public final class SnapshotMutableLongStateImpl$LongStateStateRecord extends StateRecord {
    public long value;

    public SnapshotMutableLongStateImpl$LongStateStateRecord(long j, long j2) {
        super(j);
        this.value = j2;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord) {
        stateRecord.getClass();
        this.value = ((SnapshotMutableLongStateImpl$LongStateStateRecord) stateRecord).value;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return create(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create(long j) {
        return new SnapshotMutableLongStateImpl$LongStateStateRecord(j, this.value);
    }
}
