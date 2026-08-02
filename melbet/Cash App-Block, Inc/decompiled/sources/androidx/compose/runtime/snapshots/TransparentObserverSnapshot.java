package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public final boolean mergeParentObservers;
    public final boolean ownsParentSnapshot;
    public final Snapshot parentSnapshot;
    public Function1 readObserver;
    public final long threadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentObserverSnapshot(Snapshot snapshot, Function1 function1, boolean z, boolean z2) {
        super(0L, SnapshotIdSet.EMPTY);
        Function1 readObserver;
        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = SnapshotKt.emptyLambda;
        this.parentSnapshot = snapshot;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = SnapshotKt.mergedReadObserver(function1, (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) ? SnapshotKt.globalSnapshot.readObserver : readObserver, z);
        this.threadId = Expect_jvmKt.currentThreadId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        Snapshot snapshot;
        this.disposed = true;
        if (!this.ownsParentSnapshot || (snapshot = this.parentSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    public final Snapshot getCurrentSnapshot() {
        Snapshot snapshot = this.parentSnapshot;
        return snapshot == null ? SnapshotKt.globalSnapshot : snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final SnapshotIdSet getInvalid$runtime() {
        return getCurrentSnapshot().getInvalid$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Function1 getWriteObserver$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void nestedActivated$runtime() {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void nestedDeactivated$runtime() {
        SnapshotStateMapKt.unsupported();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void notifyObjectsInitialized$runtime() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void recordModified$runtime(StateObject stateObject) {
        getCurrentSnapshot().recordModified$runtime(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot takeNestedSnapshot(Function1 function1) {
        Function1 mergedReadObserver = SnapshotKt.mergedReadObserver(function1, this.readObserver, true);
        return !this.mergeParentObservers ? SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver, true) : getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver);
    }
}
