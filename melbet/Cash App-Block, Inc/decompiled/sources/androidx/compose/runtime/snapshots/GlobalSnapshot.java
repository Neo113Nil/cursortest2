package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2;
import androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotId_jvmKt apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        synchronized (SnapshotKt.lock) {
            releasePinnedSnapshotLocked$runtime();
        }
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
        SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableSnapshot takeNestedMutableSnapshot(Function1 function1, Function1 function12) {
        return (MutableSnapshot) ((Snapshot) SnapshotKt.advanceGlobalSnapshot(new SnapshotKt$$ExternalSyntheticLambda3(0, new WorkerWrapperKt$awaitWithin$2$1(2, function1, function12))));
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot takeNestedSnapshot(Function1 function1) {
        return (ReadonlySnapshot) ((Snapshot) SnapshotKt.advanceGlobalSnapshot(new SnapshotKt$$ExternalSyntheticLambda3(0, new MonotonicFrameClockKt$withFrameMillis$2(1, function1))));
    }
}
