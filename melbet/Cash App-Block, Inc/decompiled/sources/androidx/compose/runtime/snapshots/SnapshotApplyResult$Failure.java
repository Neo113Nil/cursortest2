package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public final class SnapshotApplyResult$Failure extends SnapshotId_jvmKt {
    public final MutableSnapshot snapshot;

    public SnapshotApplyResult$Failure(MutableSnapshot mutableSnapshot) {
        this.snapshot = mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotId_jvmKt
    public final void check() {
        this.snapshot.dispose();
        throw new SnapshotApplyConflictException();
    }
}
