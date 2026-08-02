package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public boolean deactivated;
    public final MutableSnapshot parent;

    public NestedMutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12, MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.nestedActivated$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotId_jvmKt apply() {
        NestedMutableSnapshot nestedMutableSnapshot;
        MutableSnapshot mutableSnapshot = this.parent;
        if (mutableSnapshot.applied || mutableSnapshot.disposed) {
            return new SnapshotApplyResult$Failure(this);
        }
        MutableScatterSet mutableScatterSet = this.modified;
        long j = this.snapshotId;
        HashMap access$optimisticMerges = mutableScatterSet != null ? SnapshotKt.access$optimisticMerges(mutableSnapshot.getSnapshotId(), this, this.parent.getInvalid$runtime()) : null;
        Object obj = SnapshotKt.lock;
        synchronized (obj) {
            try {
                SnapshotKt.access$validateOpen(this);
                if (mutableScatterSet == null || mutableScatterSet._size == 0) {
                    nestedMutableSnapshot = this;
                    nestedMutableSnapshot.closeAndReleasePinning$runtime();
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotId_jvmKt innerApplyLocked$runtime = nestedMutableSnapshot.innerApplyLocked$runtime(this.parent.getSnapshotId(), mutableScatterSet, access$optimisticMerges, this.parent.getInvalid$runtime());
                    if (!innerApplyLocked$runtime.equals(SnapshotApplyResult$Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    MutableScatterSet modified$runtime = nestedMutableSnapshot.parent.getModified$runtime();
                    if (modified$runtime != null) {
                        modified$runtime.plusAssign(mutableScatterSet);
                    } else {
                        nestedMutableSnapshot.parent.setModified$runtime(mutableScatterSet);
                        nestedMutableSnapshot.modified = null;
                    }
                }
                if (Intrinsics.compare(nestedMutableSnapshot.parent.getSnapshotId(), j) < 0) {
                    nestedMutableSnapshot.parent.advance$runtime();
                }
                MutableSnapshot mutableSnapshot2 = nestedMutableSnapshot.parent;
                mutableSnapshot2.setInvalid$runtime(mutableSnapshot2.getInvalid$runtime().clear(j).andNot(nestedMutableSnapshot.previousIds));
                nestedMutableSnapshot.parent.recordPrevious$runtime(j);
                MutableSnapshot mutableSnapshot3 = nestedMutableSnapshot.parent;
                int i = nestedMutableSnapshot.pinningTrackingHandle;
                nestedMutableSnapshot.pinningTrackingHandle = -1;
                if (i >= 0) {
                    int[] iArr = mutableSnapshot3.previousPinnedSnapshots;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    mutableSnapshot3.previousPinnedSnapshots = copyOf;
                } else {
                    mutableSnapshot3.getClass();
                }
                MutableSnapshot mutableSnapshot4 = nestedMutableSnapshot.parent;
                SnapshotIdSet snapshotIdSet = nestedMutableSnapshot.previousIds;
                mutableSnapshot4.getClass();
                synchronized (obj) {
                    mutableSnapshot4.previousIds = mutableSnapshot4.previousIds.or(snapshotIdSet);
                    MutableSnapshot mutableSnapshot5 = nestedMutableSnapshot.parent;
                    int[] iArr2 = nestedMutableSnapshot.previousPinnedSnapshots;
                    mutableSnapshot5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = mutableSnapshot5.previousPinnedSnapshots;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        mutableSnapshot5.previousPinnedSnapshots = iArr2;
                    }
                }
                nestedMutableSnapshot.applied = true;
                if (!nestedMutableSnapshot.deactivated) {
                    nestedMutableSnapshot.deactivated = true;
                    nestedMutableSnapshot.parent.nestedDeactivated$runtime();
                }
                return SnapshotApplyResult$Success.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        if (this.disposed) {
            return;
        }
        super.dispose();
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.nestedDeactivated$runtime();
    }
}
