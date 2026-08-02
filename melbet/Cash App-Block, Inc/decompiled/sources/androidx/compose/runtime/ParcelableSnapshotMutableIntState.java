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
public final class ParcelableSnapshotMutableIntState extends StateObjectImpl implements Parcelable, SnapshotMutableState, MutableState, State {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new ParcelableSnapshotMutableIntState$Companion$CREATOR$1(0);
    public SnapshotMutableIntStateImpl$IntStateStateRecord next;

    public ParcelableSnapshotMutableIntState(int i) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        SnapshotMutableIntStateImpl$IntStateStateRecord snapshotMutableIntStateImpl$IntStateStateRecord = new SnapshotMutableIntStateImpl$IntStateStateRecord(currentSnapshot.getSnapshotId(), i);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            snapshotMutableIntStateImpl$IntStateStateRecord.next = new SnapshotMutableIntStateImpl$IntStateStateRecord(1L, i);
        }
        this.next = snapshotMutableIntStateImpl$IntStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.next;
    }

    public final int getIntValue() {
        return ((SnapshotMutableIntStateImpl$IntStateStateRecord) SnapshotKt.readable(this.next, this)).value;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy getPolicy() {
        return NeverEqualPolicy.INSTANCE$3;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return Integer.valueOf(getIntValue());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((SnapshotMutableIntStateImpl$IntStateStateRecord) stateRecord2).value == ((SnapshotMutableIntStateImpl$IntStateStateRecord) stateRecord3).value) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.next = (SnapshotMutableIntStateImpl$IntStateStateRecord) stateRecord;
    }

    public final void setIntValue(int i) {
        Snapshot currentSnapshot;
        SnapshotMutableIntStateImpl$IntStateStateRecord snapshotMutableIntStateImpl$IntStateStateRecord = (SnapshotMutableIntStateImpl$IntStateStateRecord) SnapshotKt.current(this.next);
        if (snapshotMutableIntStateImpl$IntStateStateRecord.value != i) {
            SnapshotMutableIntStateImpl$IntStateStateRecord snapshotMutableIntStateImpl$IntStateStateRecord2 = this.next;
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                ((SnapshotMutableIntStateImpl$IntStateStateRecord) SnapshotKt.overwritableRecord(snapshotMutableIntStateImpl$IntStateStateRecord2, this, currentSnapshot, snapshotMutableIntStateImpl$IntStateStateRecord)).value = i;
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        }
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(Object obj) {
        setIntValue(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((SnapshotMutableIntStateImpl$IntStateStateRecord) SnapshotKt.current(this.next)).value + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getIntValue());
    }
}
