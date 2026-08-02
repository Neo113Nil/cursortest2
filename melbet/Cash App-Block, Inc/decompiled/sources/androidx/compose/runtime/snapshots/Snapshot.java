package androidx.compose.runtime.snapshots;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import com.squareup.wire.GrpcMethod;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class Snapshot {
    public boolean disposed;
    public SnapshotIdSet invalid;
    public int pinningTrackingHandle;
    public long snapshotId;

    public Snapshot(long j, SnapshotIdSet snapshotIdSet) {
        int i;
        int numberOfTrailingZeros;
        this.invalid = snapshotIdSet;
        this.snapshotId = j;
        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = SnapshotKt.emptyLambda;
        if (j != 0) {
            SnapshotIdSet invalid$runtime = getInvalid$runtime();
            long j2 = invalid$runtime.lowerBound;
            long[] jArr = invalid$runtime.belowBound;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = invalid$runtime.lowerSet;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = invalid$runtime.upperSet;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (SnapshotKt.lock) {
                i = SnapshotKt.pinningTable.add(j);
            }
        } else {
            i = -1;
        }
        this.pinningTrackingHandle = i;
    }

    public static void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void closeAndReleasePinning$runtime() {
        synchronized (SnapshotKt.lock) {
            closeLocked$runtime();
            releasePinnedSnapshotsForCloseLocked$runtime();
        }
    }

    public void closeLocked$runtime() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId());
    }

    public abstract void dispose();

    public SnapshotIdSet getInvalid$runtime() {
        return this.invalid;
    }

    public abstract Function1 getReadObserver();

    public abstract boolean getReadOnly();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime() {
        return 0;
    }

    public abstract Function1 getWriteObserver$runtime();

    public final Snapshot makeCurrent() {
        GrpcMethod grpcMethod = SnapshotKt.threadSnapshot;
        Snapshot snapshot = (Snapshot) grpcMethod.get();
        grpcMethod.set(this);
        return snapshot;
    }

    public abstract void nestedActivated$runtime();

    public abstract void nestedDeactivated$runtime();

    public abstract void notifyObjectsInitialized$runtime();

    public abstract void recordModified$runtime(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePinnedSnapshotLocked$runtime();
    }

    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    public void setWriteCount$runtime(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot takeNestedSnapshot(Function1 function1);
}
