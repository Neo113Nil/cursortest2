package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateRecord;

/* loaded from: classes.dex */
public final class SnapshotMutableFloatStateImpl$FloatStateStateRecord extends StateRecord {
    public float value;

    public SnapshotMutableFloatStateImpl$FloatStateStateRecord(long j, float f) {
        super(j);
        this.value = f;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord) {
        stateRecord.getClass();
        this.value = ((SnapshotMutableFloatStateImpl$FloatStateStateRecord) stateRecord).value;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return create(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create(long j) {
        return new SnapshotMutableFloatStateImpl$FloatStateStateRecord(j, this.value);
    }
}
