package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public final boolean mergeParentObservers;
    public final boolean ownsParentSnapshot;
    public final MutableSnapshot parentSnapshot;
    public Function1 readObserver;
    public final long threadId;
    public Function1 writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, boolean z, boolean z2) {
        super(0L, SnapshotIdSet.EMPTY, SnapshotKt.mergedReadObserver(function1, (mutableSnapshot == null || (r0 = mutableSnapshot.getReadObserver()) == null) ? SnapshotKt.globalSnapshot.readObserver : r0, z), SnapshotKt.mergedWriteObserver(function12, (mutableSnapshot == null || (r9 = mutableSnapshot.getWriteObserver$runtime()) == null) ? SnapshotKt.globalSnapshot.writeObserver : r9));
        Function1 writeObserver$runtime;
        Function1 readObserver;
        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = SnapshotKt.emptyLambda;
        this.parentSnapshot = mutableSnapshot;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = super.readObserver;
        this.writeObserver = super.writeObserver;
        this.threadId = Expect_jvmKt.currentThreadId();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotId_jvmKt apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        MutableSnapshot mutableSnapshot;
        this.disposed = true;
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.dispose();
    }

    public final MutableSnapshot getCurrentSnapshot() {
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        return mutableSnapshot == null ? SnapshotKt.globalSnapshot : mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final SnapshotIdSet getInvalid$runtime() {
        return getCurrentSnapshot().getInvalid$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableScatterSet getModified$runtime() {
        return getCurrentSnapshot().getModified$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /* renamed from: getReadObserver$runtime */
    public final Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final int getWriteCount$runtime() {
        return getCurrentSnapshot().getWriteCount$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Function1 getWriteObserver$runtime() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void nestedActivated$runtime() {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void nestedDeactivated$runtime() {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void notifyObjectsInitialized$runtime() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void recordModified$runtime(StateObject stateObject) {
        getCurrentSnapshot().recordModified$runtime(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final void setModified$runtime(MutableScatterSet mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void setSnapshotId$runtime(long j) {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void setWriteCount$runtime(int i) {
        getCurrentSnapshot().setWriteCount$runtime(i);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableSnapshot takeNestedMutableSnapshot(Function1 function1, Function1 function12) {
        Function1 mergedReadObserver = SnapshotKt.mergedReadObserver(function1, this.readObserver, true);
        Function1 mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, this.writeObserver);
        return !this.mergeParentObservers ? new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, mergedWriteObserver), mergedReadObserver, mergedWriteObserver, false, true) : getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver, mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot takeNestedSnapshot(Function1 function1) {
        Function1 mergedReadObserver = SnapshotKt.mergedReadObserver(function1, this.readObserver, true);
        return !this.mergeParentObservers ? SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver, true) : getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver);
    }
}
