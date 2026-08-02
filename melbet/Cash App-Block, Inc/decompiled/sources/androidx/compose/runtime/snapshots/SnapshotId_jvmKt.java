package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class SnapshotId_jvmKt {
    public static final Object sync = new Object();

    public static final void access$validateRange(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final boolean attemptUpdate(StateListStateRecord stateListStateRecord, int i, AbstractPersistentList abstractPersistentList, boolean z) {
        boolean z2;
        synchronized (sync) {
            try {
                int i2 = stateListStateRecord.modification;
                if (i2 == i) {
                    stateListStateRecord.list = abstractPersistentList;
                    z2 = true;
                    if (z) {
                        stateListStateRecord.structuralChange++;
                    }
                    stateListStateRecord.modification = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final int binarySearch(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final StateListStateRecord getReadable(SnapshotStateList snapshotStateList) {
        StateListStateRecord stateListStateRecord = snapshotStateList.firstStateRecord;
        stateListStateRecord.getClass();
        return (StateListStateRecord) SnapshotKt.readable(stateListStateRecord, snapshotStateList);
    }

    public static final int getStructure(SnapshotStateList snapshotStateList) {
        StateListStateRecord stateListStateRecord = snapshotStateList.firstStateRecord;
        stateListStateRecord.getClass();
        return ((StateListStateRecord) SnapshotKt.current(stateListStateRecord)).structuralChange;
    }

    public static final boolean mutateBoolean(SnapshotStateList snapshotStateList, Function1 function1) {
        int i;
        AbstractPersistentList abstractPersistentList;
        Object invoke;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (sync) {
                StateListStateRecord stateListStateRecord = snapshotStateList.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            PersistentVectorBuilder builder = abstractPersistentList.builder();
            invoke = function1.invoke(builder);
            AbstractPersistentList build = builder.build();
            if (Intrinsics.areEqual(build, abstractPersistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = snapshotStateList.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, snapshotStateList, currentSnapshot), i, build, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, snapshotStateList);
        } while (!attemptUpdate);
        return ((Boolean) invoke).booleanValue();
    }

    public abstract void check();
}
