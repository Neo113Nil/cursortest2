package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;

/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableFloatState extends StateObjectImpl implements Parcelable, MutableFloatState, SnapshotMutableState {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new ParcelableSnapshotMutableIntState$Companion$CREATOR$1(1);
    public SnapshotMutableFloatStateImpl$FloatStateStateRecord next;

    public ParcelableSnapshotMutableFloatState(float f) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        SnapshotMutableFloatStateImpl$FloatStateStateRecord snapshotMutableFloatStateImpl$FloatStateStateRecord = new SnapshotMutableFloatStateImpl$FloatStateStateRecord(currentSnapshot.getSnapshotId(), f);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            snapshotMutableFloatStateImpl$FloatStateStateRecord.next = new SnapshotMutableFloatStateImpl$FloatStateStateRecord(1L, f);
        }
        this.next = snapshotMutableFloatStateImpl$FloatStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.next;
    }

    public final float getFloatValue() {
        return ((SnapshotMutableFloatStateImpl$FloatStateStateRecord) SnapshotKt.readable(this.next, this)).value;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy getPolicy() {
        return NeverEqualPolicy.INSTANCE$3;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((SnapshotMutableFloatStateImpl$FloatStateStateRecord) stateRecord2).value == ((SnapshotMutableFloatStateImpl$FloatStateStateRecord) stateRecord3).value) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.next = (SnapshotMutableFloatStateImpl$FloatStateStateRecord) stateRecord;
    }

    public final void setFloatValue(float f) {
        Snapshot currentSnapshot;
        SnapshotMutableFloatStateImpl$FloatStateStateRecord snapshotMutableFloatStateImpl$FloatStateStateRecord = (SnapshotMutableFloatStateImpl$FloatStateStateRecord) SnapshotKt.current(this.next);
        if (snapshotMutableFloatStateImpl$FloatStateStateRecord.value == f) {
            return;
        }
        SnapshotMutableFloatStateImpl$FloatStateStateRecord snapshotMutableFloatStateImpl$FloatStateStateRecord2 = this.next;
        synchronized (SnapshotKt.lock) {
            currentSnapshot = SnapshotKt.currentSnapshot();
            ((SnapshotMutableFloatStateImpl$FloatStateStateRecord) SnapshotKt.overwritableRecord(snapshotMutableFloatStateImpl$FloatStateStateRecord2, this, currentSnapshot, snapshotMutableFloatStateImpl$FloatStateStateRecord)).value = f;
        }
        SnapshotKt.notifyWrite(currentSnapshot, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((SnapshotMutableFloatStateImpl$FloatStateStateRecord) SnapshotKt.current(this.next)).value + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(getFloatValue());
    }
}
