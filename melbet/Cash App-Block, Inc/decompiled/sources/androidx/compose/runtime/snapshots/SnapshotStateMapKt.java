package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;

/* loaded from: classes3.dex */
public abstract class SnapshotStateMapKt {
    public static final Object sync = new Object();
    public static final Object sync$1 = new Object();

    public static final boolean attemptUpdate(StateSetStateRecord stateSetStateRecord, int i, PersistentOrderedSet persistentOrderedSet) {
        boolean z;
        synchronized (sync$1) {
            int i2 = stateSetStateRecord.modification;
            if (i2 == i) {
                stateSetStateRecord.set = persistentOrderedSet;
                z = true;
                stateSetStateRecord.modification = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final StateSetStateRecord getReadable(SnapshotStateSet snapshotStateSet) {
        StateSetStateRecord stateSetStateRecord = snapshotStateSet.firstStateRecord;
        stateSetStateRecord.getClass();
        return (StateSetStateRecord) SnapshotKt.readable(stateSetStateRecord, snapshotStateSet);
    }

    public static final void unsupported() {
        throw new UnsupportedOperationException();
    }
}
