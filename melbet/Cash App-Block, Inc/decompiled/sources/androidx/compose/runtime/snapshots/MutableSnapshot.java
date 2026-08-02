package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    public static final int[] EmptyIntArray = new int[0];
    public boolean applied;
    public ArrayList merged;
    public MutableScatterSet modified;
    public SnapshotIdSet previousIds;
    public int[] previousPinnedSnapshots;
    public final Function1 readObserver;
    public int snapshots;
    public int writeCount;
    public final Function1 writeObserver;

    public MutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12) {
        super(j, snapshotIdSet);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.EMPTY;
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    public final void advance$runtime() {
        recordPrevious$runtime(getSnapshotId());
        if (this.applied || this.disposed) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.lock) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j + 1;
            setSnapshotId$runtime(j);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[LOOP:1: B:31:0x00af->B:32:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:37:0x00c0, B:39:0x00d0, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00f8, B:50:0x0106, B:56:0x0117, B:59:0x0121, B:61:0x012b, B:63:0x0135, B:65:0x013b, B:67:0x0145, B:73:0x014d, B:75:0x0150, B:77:0x0154, B:79:0x015b, B:81:0x0167, B:87:0x010e), top: B:36:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:37:0x00c0, B:39:0x00d0, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00f8, B:50:0x0106, B:56:0x0117, B:59:0x0121, B:61:0x012b, B:63:0x0135, B:65:0x013b, B:67:0x0145, B:73:0x014d, B:75:0x0150, B:77:0x0154, B:79:0x015b, B:81:0x0167, B:87:0x010e), top: B:36:0x00c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnapshotId_jvmKt apply() {
        HashMap hashMap;
        List list;
        MutableScatterSet mutableScatterSet;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        MutableScatterSet modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            long j3 = SnapshotKt.globalSnapshot.snapshotId;
            hashMap = SnapshotKt.access$optimisticMerges(j3, this, SnapshotKt.openSnapshots.clear(j3));
        } else {
            hashMap = null;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        synchronized (SnapshotKt.lock) {
            try {
                SnapshotKt.access$validateOpen(this);
                if (modified$runtime != null && modified$runtime._size != 0) {
                    GlobalSnapshot globalSnapshot = SnapshotKt.globalSnapshot;
                    SnapshotId_jvmKt innerApplyLocked$runtime = innerApplyLocked$runtime(SnapshotKt.nextSnapshotId, modified$runtime, hashMap, SnapshotKt.openSnapshots.clear(globalSnapshot.snapshotId));
                    if (!innerApplyLocked$runtime.equals(SnapshotApplyResult$Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    closeLocked$runtime();
                    mutableScatterSet = globalSnapshot.modified;
                    SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot, SnapshotKt.emptyLambda);
                    setModified$runtime(null);
                    globalSnapshot.modified = null;
                    list = SnapshotKt.applyObservers;
                    this.applied = true;
                    if (mutableScatterSet != null) {
                        ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(mutableScatterSet);
                        if (!mutableScatterSet.isEmpty()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) list.get(i2)).invoke(scatterSetWrapper, this);
                            }
                        }
                    }
                    if (modified$runtime != null && modified$runtime.isNotEmpty()) {
                        ScatterSetWrapper scatterSetWrapper2 = new ScatterSetWrapper(modified$runtime);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(scatterSetWrapper2, this);
                        }
                    }
                    synchronized (SnapshotKt.lock) {
                        try {
                            releasePinnedSnapshotsForCloseLocked$runtime();
                            SnapshotKt.checkAndOverwriteUnusedRecordsLocked();
                            if (mutableScatterSet != null) {
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (modified$runtime != null) {
                                        Object[] objArr2 = modified$runtime.elements;
                                        long[] jArr2 = modified$runtime.metadata;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            SnapshotKt.processForUnusedRecordsLocked((StateObject) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.merged;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            SnapshotKt.processForUnusedRecordsLocked((StateObject) arrayList.get(i9));
                                        }
                                    }
                                    this.merged = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (modified$runtime != null) {
                            }
                            arrayList = this.merged;
                            if (arrayList != null) {
                            }
                            this.merged = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return SnapshotApplyResult$Success.INSTANCE;
                }
                closeLocked$runtime();
                GlobalSnapshot globalSnapshot2 = SnapshotKt.globalSnapshot;
                MutableScatterSet mutableScatterSet2 = globalSnapshot2.modified;
                SnapshotKt.resetGlobalSnapshotLocked(globalSnapshot2, SnapshotKt.emptyLambda);
                if (mutableScatterSet2 == null || !mutableScatterSet2.isNotEmpty()) {
                    list = emptyList;
                    mutableScatterSet = null;
                } else {
                    list = SnapshotKt.applyObservers;
                    mutableScatterSet = mutableScatterSet2;
                }
                this.applied = true;
                if (mutableScatterSet != null) {
                }
                if (modified$runtime != null) {
                    ScatterSetWrapper scatterSetWrapper22 = new ScatterSetWrapper(modified$runtime);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (SnapshotKt.lock) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void closeLocked$runtime() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        synchronized (SnapshotKt.lock) {
            releasePinnedSnapshotLocked$runtime();
        }
        nestedDeactivated$runtime();
    }

    public MutableScatterSet getModified$runtime() {
        return this.modified;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime() {
        return this.writeObserver;
    }

    public final SnapshotId_jvmKt innerApplyLocked$runtime(long j, MutableScatterSet mutableScatterSet, HashMap hashMap, SnapshotIdSet snapshotIdSet) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        long[] jArr;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        StateRecord mergeRecords;
        SnapshotIdSet or = getInvalid$runtime().set(getSnapshotId()).or(this.previousIds);
        Object[] objArr3 = mutableScatterSet.elements;
        long[] jArr3 = mutableScatterSet.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            StateObject stateObject = (StateObject) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            StateRecord readable = SnapshotKt.readable(firstStateRecord, j, snapshotIdSet);
                            if (readable == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                StateRecord readable2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), or);
                                if (readable2 != null && readable2.snapshotId != 1 && !readable.equals(readable2)) {
                                    snapshotIdSet3 = or;
                                    StateRecord readable3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid$runtime());
                                    if (readable3 == null) {
                                        SnapshotKt.readError();
                                        throw null;
                                    }
                                    if (hashMap == null || (mergeRecords = (StateRecord) hashMap.get(readable)) == null) {
                                        mergeRecords = stateObject.mergeRecords(readable2, readable, readable3);
                                    }
                                    if (mergeRecords == null) {
                                        return new SnapshotApplyResult$Failure(this);
                                    }
                                    if (!mergeRecords.equals(readable3)) {
                                        if (mergeRecords.equals(readable)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(stateObject, readable.create(getSnapshotId())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(stateObject);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!mergeRecords.equals(readable2) ? new Pair(stateObject, mergeRecords) : new Pair(stateObject, readable2.create(getSnapshotId())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            snapshotIdSet3 = or;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            snapshotIdSet3 = or;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        or = snapshotIdSet3;
                    }
                    snapshotIdSet2 = or;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    snapshotIdSet2 = or;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                or = snapshotIdSet2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            advance$runtime();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList3.get(i5);
                StateObject stateObject2 = (StateObject) pair.first;
                StateRecord stateRecord = (StateRecord) pair.second;
                stateRecord.snapshotId = j;
                synchronized (SnapshotKt.lock) {
                    stateRecord.next = stateObject2.getFirstStateRecord();
                    stateObject2.prependStateRecord(stateRecord);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                mutableScatterSet.remove((StateObject) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.merged;
            if (arrayList7 != null) {
                arrayList2 = CollectionsKt.plus((Iterable) arrayList2, (Collection) arrayList7);
            }
            this.merged = arrayList2;
        }
        return SnapshotApplyResult$Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime() {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime() {
        if (this.snapshots <= 0) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i = this.snapshots - 1;
        this.snapshots = i;
        if (i != 0 || this.applied) {
            return;
        }
        MutableScatterSet modified$runtime = getModified$runtime();
        if (modified$runtime != null) {
            if (this.applied) {
                PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
            }
            setModified$runtime(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = modified$runtime.elements;
            long[] jArr = modified$runtime.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i2 << 3) + i4]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.next) {
                                    long j2 = firstStateRecord.snapshotId;
                                    if (j2 == snapshotId || CollectionsKt.contains(this.previousIds, Long.valueOf(j2))) {
                                        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = SnapshotKt.emptyLambda;
                                        firstStateRecord.snapshotId = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        closeAndReleasePinning$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        if (this.applied || this.disposed) {
            return;
        }
        advance$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime(StateObject stateObject) {
        MutableScatterSet modified$runtime = getModified$runtime();
        if (modified$runtime == null) {
            MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
            modified$runtime = new MutableScatterSet();
            setModified$runtime(modified$runtime);
        }
        modified$runtime.add(stateObject);
    }

    public final void recordPrevious$runtime(long j) {
        synchronized (SnapshotKt.lock) {
            this.previousIds = this.previousIds.set(j);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void releasePinnedSnapshotsForCloseLocked$runtime() {
        int length = this.previousPinnedSnapshots.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i]);
        }
        releasePinnedSnapshotLocked$runtime();
    }

    public void setModified$runtime(MutableScatterSet mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        this.writeCount = i;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1 function1, Function1 function12) {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
        if (this.applied && this.pinningTrackingHandle < 0) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        recordPrevious$runtime(getSnapshotId());
        Object obj = SnapshotKt.lock;
        synchronized (obj) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j);
            SnapshotIdSet invalid$runtime = getInvalid$runtime();
            setInvalid$runtime(invalid$runtime.set(j));
            nestedMutableSnapshot = new NestedMutableSnapshot(j, SnapshotKt.addRange(invalid$runtime, getSnapshotId() + 1, j), SnapshotKt.mergedReadObserver(function1, getReadObserver(), true), SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime()), this);
        }
        if (this.applied || this.disposed) {
            return nestedMutableSnapshot;
        }
        long snapshotId = getSnapshotId();
        synchronized (obj) {
            long j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j2 + 1;
            setSnapshotId$runtime(j2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function1) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
        if (this.applied && this.pinningTrackingHandle < 0) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
        }
        long snapshotId = getSnapshotId();
        recordPrevious$runtime(getSnapshotId());
        Object obj = SnapshotKt.lock;
        synchronized (obj) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j, SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, j), SnapshotKt.mergedReadObserver(function1, getReadObserver(), true), this);
        }
        if (this.applied || this.disposed) {
            return nestedReadonlySnapshot;
        }
        long snapshotId2 = getSnapshotId();
        synchronized (obj) {
            long j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = j2 + 1;
            setSnapshotId$runtime(j2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId2 + 1, getSnapshotId()));
        return nestedReadonlySnapshot;
    }
}
