package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import com.squareup.wire.GrpcMethod;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public abstract class SnapshotKt {
    public static List applyObservers;
    public static final StatusLine extraStateObjects;
    public static final GlobalSnapshot globalSnapshot;
    public static List globalWriteObservers;
    public static long nextSnapshotId;
    public static SnapshotIdSet openSnapshots;
    public static final AtomicInt pendingApplyObserverCount;
    public static final SnapshotDoubleIndexHeap pinningTable;
    public static final SaversKt$$ExternalSyntheticLambda2 emptyLambda = new SaversKt$$ExternalSyntheticLambda2(13);
    public static final GrpcMethod threadSnapshot = new GrpcMethod(5, false);
    public static final Object lock = new Object();

    static {
        byte b = 0;
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.EMPTY;
        openSnapshots = snapshotIdSet;
        nextSnapshotId = 2L;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = new SnapshotDoubleIndexHeap();
        snapshotDoubleIndexHeap.values = new long[16];
        snapshotDoubleIndexHeap.index = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        snapshotDoubleIndexHeap.handles = iArr;
        pinningTable = snapshotDoubleIndexHeap;
        StatusLine statusLine = new StatusLine(b, 1);
        statusLine.protocol = new int[16];
        statusLine.message = new WeakReference[16];
        extraStateObjects = statusLine;
        EmptyList emptyList = EmptyList.INSTANCE;
        applyObservers = emptyList;
        globalWriteObservers = emptyList;
        long j = nextSnapshotId;
        nextSnapshotId = 1 + j;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j, snapshotIdSet, null, new SaversKt$$ExternalSyntheticLambda2(12));
        openSnapshots = openSnapshots.set(globalSnapshot2.snapshotId);
        globalSnapshot = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static final HashMap access$optimisticMerges(long j, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        SnapshotIdSet snapshotIdSet3;
        int i;
        int i2;
        StateRecord readable;
        MutableScatterSet modified$runtime = mutableSnapshot.getModified$runtime();
        if (modified$runtime != null) {
            long snapshotId = mutableSnapshot.getSnapshotId();
            SnapshotIdSet or = mutableSnapshot.getInvalid$runtime().set(snapshotId).or(mutableSnapshot.previousIds);
            Object[] objArr = modified$runtime.elements;
            long[] jArr3 = modified$runtime.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr[(i3 << 3) + i6];
                                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                StateRecord readable2 = readable(firstStateRecord, j, snapshotIdSet);
                                if (readable2 == null || (readable = readable(firstStateRecord, snapshotId, or)) == null || readable2.equals(readable)) {
                                    snapshotIdSet3 = or;
                                } else {
                                    snapshotIdSet3 = or;
                                    StateRecord readable3 = readable(firstStateRecord, snapshotId, mutableSnapshot.getInvalid$runtime());
                                    if (readable3 == null) {
                                        readError();
                                        throw null;
                                    }
                                    StateRecord mergeRecords = stateObject.mergeRecords(readable, readable2, readable3);
                                    if (mergeRecords == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(readable2, mergeRecords);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                snapshotIdSet3 = or;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            or = snapshotIdSet3;
                        }
                        jArr = jArr3;
                        snapshotIdSet2 = or;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        snapshotIdSet2 = or;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    or = snapshotIdSet2;
                }
            }
        }
        return null;
    }

    public static final void access$validateOpen(Snapshot snapshot) {
        long j;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getSnapshotId());
        sb.append(", disposed=");
        sb.append(snapshot.disposed);
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.applied) : "read-only");
        sb.append(", lowestPin=");
        synchronized (lock) {
            SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = pinningTable;
            j = snapshotDoubleIndexHeap.size > 0 ? snapshotDoubleIndexHeap.values[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, long j, long j2) {
        while (Intrinsics.compare(j, j2) < 0) {
            snapshotIdSet = snapshotIdSet.set(j);
            j++;
        }
        return snapshotIdSet;
    }

    public static final Object advanceGlobalSnapshot(Function1 function1) {
        MutableScatterSet mutableScatterSet;
        Object resetGlobalSnapshotLocked;
        GlobalSnapshot globalSnapshot2 = globalSnapshot;
        synchronized (lock) {
            try {
                mutableScatterSet = globalSnapshot2.modified;
                if (mutableScatterSet != null) {
                    pendingApplyObserverCount.addAndGet(1);
                }
                resetGlobalSnapshotLocked = resetGlobalSnapshotLocked(globalSnapshot2, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mutableScatterSet != null) {
            try {
                List list = applyObservers;
                ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(mutableScatterSet);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Function2) list.get(i)).invoke(scatterSetWrapper, globalSnapshot2);
                }
            } finally {
                pendingApplyObserverCount.addAndGet(-1);
            }
        }
        synchronized (lock) {
            checkAndOverwriteUnusedRecordsLocked();
            if (mutableScatterSet != null) {
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    processForUnusedRecordsLocked((StateObject) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return resetGlobalSnapshotLocked;
    }

    public static final void checkAndOverwriteUnusedRecordsLocked() {
        StatusLine statusLine = extraStateObjects;
        int i = statusLine.code;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            WeakReference weakReference = ((WeakReference[]) statusLine.message)[i2];
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj != null && overwriteUnusedRecordsLocked((StateObject) obj)) {
                if (i3 != i2) {
                    ((WeakReference[]) statusLine.message)[i3] = weakReference;
                    int[] iArr = (int[]) statusLine.protocol;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((WeakReference[]) statusLine.message)[i4] = null;
            ((int[]) statusLine.protocol)[i4] = 0;
        }
        if (i3 != i) {
            statusLine.code = i3;
        }
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1 function1, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, function1, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z);
    }

    public static final StateRecord current(StateRecord stateRecord) {
        StateRecord readable;
        Snapshot currentSnapshot = currentSnapshot();
        StateRecord readable2 = readable(stateRecord, currentSnapshot.getSnapshotId(), currentSnapshot.getInvalid$runtime());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (lock) {
            Snapshot currentSnapshot2 = currentSnapshot();
            readable = readable(stateRecord, currentSnapshot2.getSnapshotId(), currentSnapshot2.getInvalid$runtime());
        }
        if (readable != null) {
            return readable;
        }
        readError();
        throw null;
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = (Snapshot) threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    public static final Function1 mergedReadObserver(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new SnapshotKt$$ExternalSyntheticLambda1(function1, function12, 0);
    }

    public static final Function1 mergedWriteObserver(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new SnapshotKt$$ExternalSyntheticLambda1(function1, function12, 1);
    }

    public static final StateRecord newOverwritableRecordLocked(StateRecord stateRecord, StateObject stateObject) {
        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
        long j = nextSnapshotId;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = pinningTable;
        if (snapshotDoubleIndexHeap.size > 0) {
            j = snapshotDoubleIndexHeap.values[0];
        }
        long j2 = j - 1;
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        while (true) {
            if (firstStateRecord == null) {
                break;
            }
            long j3 = firstStateRecord.snapshotId;
            if (j3 == 0) {
                break;
            }
            if (j3 != 0 && Intrinsics.compare(j3, j2) <= 0 && !SnapshotIdSet.EMPTY.get(j3)) {
                if (stateRecord3 == null) {
                    stateRecord3 = firstStateRecord;
                } else if (Intrinsics.compare(firstStateRecord.snapshotId, stateRecord3.snapshotId) >= 0) {
                    stateRecord2 = stateRecord3;
                }
            }
            firstStateRecord = firstStateRecord.next;
        }
        stateRecord2 = firstStateRecord;
        if (stateRecord2 != null) {
            stateRecord2.snapshotId = Long.MAX_VALUE;
            return stateRecord2;
        }
        StateRecord create = stateRecord.create(Long.MAX_VALUE);
        create.next = stateObject.getFirstStateRecord();
        stateObject.prependStateRecord(create);
        return create;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime(snapshot.getWriteCount$runtime() + 1);
        Function1 writeObserver$runtime = snapshot.getWriteObserver$runtime();
        if (writeObserver$runtime != null) {
            writeObserver$runtime.invoke(stateObject);
        }
    }

    public static final StateRecord overwritableRecord(StateRecord stateRecord, StateObjectImpl stateObjectImpl, Snapshot snapshot, StateRecord stateRecord2) {
        StateRecord newOverwritableRecordLocked;
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime(stateObjectImpl);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (stateRecord2.snapshotId == snapshotId) {
            return stateRecord2;
        }
        synchronized (lock) {
            newOverwritableRecordLocked = newOverwritableRecordLocked(stateRecord, stateObjectImpl);
        }
        newOverwritableRecordLocked.snapshotId = snapshotId;
        if (stateRecord2.snapshotId != 1) {
            snapshot.recordModified$runtime(stateObjectImpl);
        }
        return newOverwritableRecordLocked;
    }

    public static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long j = nextSnapshotId;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = pinningTable;
        if (snapshotDoubleIndexHeap.size > 0) {
            j = snapshotDoubleIndexHeap.values[0];
        }
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.next) {
            long j2 = firstStateRecord.snapshotId;
            if (j2 != 0) {
                if (Intrinsics.compare(j2, j) >= 0) {
                    i++;
                } else if (stateRecord2 == null) {
                    i++;
                    stateRecord2 = firstStateRecord;
                } else {
                    if (Intrinsics.compare(firstStateRecord.snapshotId, stateRecord2.snapshotId) < 0) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.getFirstStateRecord();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            }
                            if (Intrinsics.compare(stateRecord3.snapshotId, j) >= 0) {
                                break;
                            }
                            if (Intrinsics.compare(stateRecord4.snapshotId, stateRecord3.snapshotId) < 0) {
                                stateRecord4 = stateRecord3;
                            }
                            stateRecord3 = stateRecord3.next;
                        }
                    }
                    stateRecord2.snapshotId = 0L;
                    stateRecord2.assign(stateRecord3);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i > 1;
    }

    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            StatusLine statusLine = extraStateObjects;
            int i = statusLine.code;
            int identityHashCode = System.identityHashCode(stateObject);
            int i2 = -1;
            if (i > 0) {
                int i3 = statusLine.code - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) statusLine.protocol)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        WeakReference weakReference = ((WeakReference[]) statusLine.message)[i5];
                        if (stateObject != (weakReference != null ? weakReference.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) statusLine.protocol)[i7] == identityHashCode; i7--) {
                                WeakReference weakReference2 = ((WeakReference[]) statusLine.message)[i7];
                                if ((weakReference2 != null ? weakReference2.get() : null) == stateObject) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = statusLine.code;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(statusLine.code + 1);
                                    break;
                                } else {
                                    if (((int[]) statusLine.protocol)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    WeakReference weakReference3 = ((WeakReference[]) statusLine.message)[i5];
                                    if ((weakReference3 != null ? weakReference3.get() : null) == stateObject) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            WeakReference[] weakReferenceArr = (WeakReference[]) statusLine.message;
            int length = weakReferenceArr.length;
            if (i == length) {
                int i10 = length * 2;
                WeakReference[] weakReferenceArr2 = new WeakReference[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(weakReferenceArr, i9, weakReferenceArr2, i11, i - i9);
                System.arraycopy((WeakReference[]) statusLine.message, 0, weakReferenceArr2, 0, i9);
                ArraysKt___ArraysJvmKt.copyInto(i11, (int[]) statusLine.protocol, i9, i, iArr);
                ArraysKt___ArraysJvmKt.copyInto$default(0, (int[]) statusLine.protocol, i9, 6, iArr);
                statusLine.message = weakReferenceArr2;
                statusLine.protocol = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(weakReferenceArr, i9, weakReferenceArr, i12, i - i9);
                int[] iArr2 = (int[]) statusLine.protocol;
                ArraysKt___ArraysJvmKt.copyInto(i12, iArr2, i9, i, iArr2);
            }
            ((WeakReference[]) statusLine.message)[i9] = new WeakReference(stateObject);
            ((int[]) statusLine.protocol)[i9] = identityHashCode;
            statusLine.code++;
        }
    }

    public static final void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final StateRecord readable(StateRecord stateRecord, StateObject stateObject) {
        StateRecord readable;
        Snapshot currentSnapshot = currentSnapshot();
        Function1 readObserver = currentSnapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        StateRecord readable2 = readable(stateRecord, currentSnapshot.getSnapshotId(), currentSnapshot.getInvalid$runtime());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (lock) {
            Snapshot currentSnapshot2 = currentSnapshot();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            firstStateRecord.getClass();
            readable = readable(firstStateRecord, currentSnapshot2.getSnapshotId(), currentSnapshot2.getInvalid$runtime());
            if (readable == null) {
                readError();
                throw null;
            }
        }
        return readable;
    }

    public static final void releasePinningLocked(int i) {
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = pinningTable;
        int i2 = snapshotDoubleIndexHeap.handles[i];
        snapshotDoubleIndexHeap.swap(i2, snapshotDoubleIndexHeap.size - 1);
        snapshotDoubleIndexHeap.size--;
        long[] jArr = snapshotDoubleIndexHeap.values;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr[i4], j) <= 0) {
                break;
            }
            snapshotDoubleIndexHeap.swap(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = snapshotDoubleIndexHeap.values;
        int i5 = snapshotDoubleIndexHeap.size >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < snapshotDoubleIndexHeap.size && Intrinsics.compare(jArr2[i6], jArr2[i7]) < 0) {
                if (Intrinsics.compare(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                snapshotDoubleIndexHeap.swap(i6, i2);
                i2 = i6;
            } else {
                if (Intrinsics.compare(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                snapshotDoubleIndexHeap.swap(i7, i2);
                i2 = i7;
            }
        }
        snapshotDoubleIndexHeap.handles[i] = snapshotDoubleIndexHeap.firstFreeHandle;
        snapshotDoubleIndexHeap.firstFreeHandle = i;
    }

    public static final Object resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, Function1 function1) {
        long j = globalSnapshot2.snapshotId;
        Object invoke = function1.invoke(openSnapshots.clear(j));
        long j2 = nextSnapshotId;
        nextSnapshotId = 1 + j2;
        SnapshotIdSet clear = openSnapshots.clear(j);
        openSnapshots = clear;
        globalSnapshot2.snapshotId = j2;
        globalSnapshot2.invalid = clear;
        globalSnapshot2.writeCount = 0;
        globalSnapshot2.modified = null;
        globalSnapshot2.releasePinnedSnapshotLocked$runtime();
        openSnapshots = openSnapshots.set(j2);
        return invoke;
    }

    public static final StateRecord writableRecord(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord readable;
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        StateRecord readable2 = readable(stateRecord, snapshotId, snapshot.getInvalid$runtime());
        if (readable2 == null) {
            readError();
            throw null;
        }
        if (readable2.snapshotId == snapshot.getSnapshotId()) {
            return readable2;
        }
        synchronized (lock) {
            readable = readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid$runtime());
            if (readable == null) {
                readError();
                throw null;
            }
            if (readable.snapshotId != snapshotId) {
                StateRecord newOverwritableRecordLocked = newOverwritableRecordLocked(readable, stateObject);
                newOverwritableRecordLocked.assign(readable);
                newOverwritableRecordLocked.snapshotId = snapshot.getSnapshotId();
                readable = newOverwritableRecordLocked;
            }
        }
        if (readable2.snapshotId != 1) {
            snapshot.recordModified$runtime(stateObject);
        }
        return readable;
    }

    public static final StateRecord current(StateRecord stateRecord, Snapshot snapshot) {
        StateRecord readable;
        StateRecord readable2 = readable(stateRecord, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        if (readable2 != null) {
            return readable2;
        }
        synchronized (lock) {
            readable = readable(stateRecord, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        }
        if (readable != null) {
            return readable;
        }
        readError();
        throw null;
    }

    public static final StateRecord readable(StateRecord stateRecord, long j, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            long j2 = stateRecord.snapshotId;
            if (j2 != 0 && Intrinsics.compare(j2, j) <= 0 && !snapshotIdSet.get(j2) && (stateRecord2 == null || Intrinsics.compare(stateRecord2.snapshotId, stateRecord.snapshotId) < 0)) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.next;
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }
}
