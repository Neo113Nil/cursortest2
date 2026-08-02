package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.google.android.gms.dynamite.zzg;
import com.squareup.wire.GrpcMethod;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class DerivedSnapshotState extends StateObjectImpl implements State {
    public final Function0 calculation;
    public ResultRecord first = new ResultRecord(SnapshotKt.currentSnapshot().getSnapshotId());
    public final SnapshotMutationPolicy policy;

    public DerivedSnapshotState(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }

    public final ResultRecord currentRecord(ResultRecord resultRecord, Snapshot snapshot, boolean z, Function0 function0) {
        MutableVector derivedStateObservers;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i;
        ResultRecord resultRecord2 = resultRecord;
        if (resultRecord2.isValid(this, snapshot)) {
            if (z) {
                derivedStateObservers = Updater.derivedStateObservers();
                Object[] objArr = derivedStateObservers.content;
                int i2 = derivedStateObservers.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((GapComposer$derivedStateObserver$1) objArr[i3]).start();
                }
                try {
                    MutableObjectIntMap mutableObjectIntMap = resultRecord2.dependencies;
                    GrpcMethod grpcMethod = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
                    IntRef intRef = (IntRef) grpcMethod.get();
                    if (intRef == null) {
                        intRef = new IntRef();
                        grpcMethod.set(intRef);
                    }
                    int i4 = intRef.element;
                    Object[] objArr2 = mutableObjectIntMap.keys;
                    int[] iArr = mutableObjectIntMap.values;
                    long[] jArr = mutableObjectIntMap.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        StateObject stateObject = (StateObject) objArr2[i9];
                                        i = i6;
                                        intRef.element = i4 + iArr[i9];
                                        Function1 readObserver = snapshot.getReadObserver();
                                        if (readObserver != null) {
                                            readObserver.invoke(stateObject);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    intRef.element = i4;
                    Object[] objArr3 = derivedStateObservers.content;
                    int i10 = derivedStateObservers.size;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((GapComposer$derivedStateObserver$1) objArr3[i11]).done();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return resultRecord2;
        }
        MutableObjectIntMap mutableObjectIntMap2 = new MutableObjectIntMap();
        GrpcMethod grpcMethod2 = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
        IntRef intRef2 = (IntRef) grpcMethod2.get();
        if (intRef2 == null) {
            intRef2 = new IntRef();
            grpcMethod2.set(intRef2);
        }
        int i12 = intRef2.element;
        derivedStateObservers = Updater.derivedStateObservers();
        Object[] objArr4 = derivedStateObservers.content;
        int i13 = derivedStateObservers.size;
        for (int i14 = 0; i14 < i13; i14++) {
            ((GapComposer$derivedStateObserver$1) objArr4[i14]).start();
        }
        try {
            intRef2.element = i12 + 1;
            Object observe = zzg.observe(function0, new DerivedSnapshotState$$ExternalSyntheticLambda0(this, intRef2, mutableObjectIntMap2, i12));
            intRef2.element = i12;
            Object[] objArr5 = derivedStateObservers.content;
            int i15 = derivedStateObservers.size;
            for (int i16 = 0; i16 < i15; i16++) {
                ((GapComposer$derivedStateObserver$1) objArr5[i16]).done();
            }
            Object obj = SnapshotKt.lock;
            synchronized (obj) {
                try {
                    Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                    Object obj2 = resultRecord2.result;
                    if (obj2 == ResultRecord.Unset || (snapshotMutationPolicy = this.policy) == null || !snapshotMutationPolicy.equivalent(observe, obj2)) {
                        ResultRecord resultRecord3 = this.first;
                        synchronized (obj) {
                            StateRecord newOverwritableRecordLocked = SnapshotKt.newOverwritableRecordLocked(resultRecord3, this);
                            newOverwritableRecordLocked.assign(resultRecord3);
                            newOverwritableRecordLocked.snapshotId = currentSnapshot.getSnapshotId();
                            resultRecord2 = (ResultRecord) newOverwritableRecordLocked;
                            resultRecord2.dependencies = mutableObjectIntMap2;
                            resultRecord2.resultHash = resultRecord2.readableHash(this, currentSnapshot);
                            resultRecord2.result = observe;
                        }
                        return resultRecord2;
                    }
                    resultRecord2.dependencies = mutableObjectIntMap2;
                    resultRecord2.resultHash = resultRecord2.readableHash(this, currentSnapshot);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef3 == null || intRef3.element != 0) {
                return resultRecord2;
            }
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
            synchronized (obj) {
                Snapshot currentSnapshot2 = SnapshotKt.currentSnapshot();
                resultRecord2.validSnapshotId = currentSnapshot2.getSnapshotId();
                resultRecord2.validSnapshotWriteCount = currentSnapshot2.getWriteCount$runtime();
                return resultRecord2;
            }
        } finally {
            Object[] objArr6 = derivedStateObservers.content;
            int i17 = derivedStateObservers.size;
            for (int i18 = 0; i18 < i17; i18++) {
                ((GapComposer$derivedStateObserver$1) objArr6[i18]).done();
            }
        }
    }

    public final ResultRecord getCurrentRecord() {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, currentSnapshot), currentSnapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        Function1 readObserver = SnapshotKt.currentSnapshot().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, currentSnapshot), currentSnapshot, true, this.calculation).result;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.first = (ResultRecord) stateRecord;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        sb.append(resultRecord.isValid(this, SnapshotKt.currentSnapshot()) ? String.valueOf(resultRecord.result) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    public final class ResultRecord extends StateRecord {
        public static final Object Unset = new Object();
        public MutableObjectIntMap dependencies;
        public Object result;
        public int resultHash;
        public long validSnapshotId;
        public int validSnapshotWriteCount;

        public ResultRecord(long j) {
            super(j);
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.EmptyObjectIntMap;
            mutableObjectIntMap.getClass();
            this.dependencies = mutableObjectIntMap;
            this.result = Unset;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create() {
            return new ResultRecord(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final boolean isValid(DerivedSnapshotState derivedSnapshotState, Snapshot snapshot) {
            boolean z;
            boolean z2;
            Object obj = SnapshotKt.lock;
            synchronized (obj) {
                z = true;
                if (this.validSnapshotId == snapshot.getSnapshotId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount$runtime()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.result == Unset || (z2 && this.resultHash != readableHash(derivedSnapshotState, snapshot))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (obj) {
                this.validSnapshotId = snapshot.getSnapshotId();
                this.validSnapshotWriteCount = snapshot.getWriteCount$runtime();
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.runtime.DerivedSnapshotState$ResultRecord] */
        /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.snapshots.StateRecord] */
        /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.snapshots.StateRecord, java.lang.Object] */
        public final int readableHash(DerivedSnapshotState derivedSnapshotState, Snapshot snapshot) {
            MutableObjectIntMap mutableObjectIntMap;
            int i;
            long[] jArr;
            int i2;
            Object[] objArr;
            long[] jArr2;
            int i3;
            Object[] objArr2;
            long j;
            long j2;
            int i4;
            ?? current;
            synchronized (SnapshotKt.lock) {
                mutableObjectIntMap = this.dependencies;
            }
            int i5 = 7;
            if (mutableObjectIntMap._size == 0) {
                return 7;
            }
            MutableVector derivedStateObservers = Updater.derivedStateObservers();
            Object[] objArr3 = derivedStateObservers.content;
            int i6 = derivedStateObservers.size;
            boolean z = false;
            for (int i7 = 0; i7 < i6; i7++) {
                ((GapComposer$derivedStateObserver$1) objArr3[i7]).start();
            }
            try {
                Object[] objArr4 = mutableObjectIntMap.keys;
                int[] iArr = mutableObjectIntMap.values;
                long[] jArr3 = mutableObjectIntMap.metadata;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    i = 7;
                    int i8 = 0;
                    while (true) {
                        long j3 = jArr3[i8];
                        long j4 = -9187201950435737472L;
                        if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            i2 = i5;
                            int i11 = z ? 1 : 0;
                            while (i11 < i10) {
                                if ((j3 & 255) < 128) {
                                    int i12 = (i8 << 3) + i11;
                                    j2 = j4;
                                    StateObject stateObject = (StateObject) objArr4[i12];
                                    int i13 = i9;
                                    if (iArr[i12] != 1) {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                    } else {
                                        if (stateObject instanceof DerivedSnapshotState) {
                                            DerivedSnapshotState derivedSnapshotState2 = (DerivedSnapshotState) stateObject;
                                            current = derivedSnapshotState2.currentRecord((ResultRecord) SnapshotKt.current(derivedSnapshotState2.first, snapshot), snapshot, z, derivedSnapshotState2.calculation);
                                            MutableObjectIntMap mutableObjectIntMap2 = current.dependencies;
                                            Object[] objArr5 = mutableObjectIntMap2.keys;
                                            long[] jArr4 = mutableObjectIntMap2.metadata;
                                            int length2 = jArr4.length - 2;
                                            jArr2 = jArr3;
                                            i3 = i11;
                                            objArr2 = objArr4;
                                            if (length2 >= 0) {
                                                int i14 = 0;
                                                while (true) {
                                                    long j5 = jArr4[i14];
                                                    j = j3;
                                                    int i15 = i;
                                                    if ((((~j5) << i2) & j5 & j2) != j2) {
                                                        int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                        for (int i17 = 0; i17 < i16; i17++) {
                                                            if ((j5 & 255) < 128) {
                                                                i15 = (i15 * 31) + System.identityHashCode((StateObject) objArr5[(i14 << 3) + i17]);
                                                            }
                                                            j5 >>= i13;
                                                        }
                                                        if (i16 != i13) {
                                                            i = i15;
                                                            break;
                                                        }
                                                    }
                                                    i = i15;
                                                    if (i14 == length2) {
                                                        break;
                                                    }
                                                    i14++;
                                                    j3 = j;
                                                    i13 = 8;
                                                }
                                            } else {
                                                j = j3;
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            i3 = i11;
                                            objArr2 = objArr4;
                                            j = j3;
                                            current = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                        }
                                        i = (((i * 31) + System.identityHashCode(current)) * 31) + Long.hashCode(current.snapshotId);
                                    }
                                    i4 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                    j2 = j4;
                                    i4 = i9;
                                }
                                j3 = j >> i4;
                                i9 = i4;
                                j4 = j2;
                                objArr4 = objArr2;
                                z = false;
                                i11 = i3 + 1;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            objArr = objArr4;
                            if (i10 != i9) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            i2 = i5;
                            objArr = objArr4;
                        }
                        if (i8 == length) {
                            i5 = i;
                            break;
                        }
                        i8++;
                        i5 = i2;
                        jArr3 = jArr;
                        objArr4 = objArr;
                        z = false;
                    }
                }
                i = i5;
                Object[] objArr6 = derivedStateObservers.content;
                int i18 = derivedStateObservers.size;
                for (int i19 = 0; i19 < i18; i19++) {
                    ((GapComposer$derivedStateObserver$1) objArr6[i19]).done();
                }
                return i;
            } catch (Throwable th) {
                Object[] objArr7 = derivedStateObservers.content;
                int i20 = derivedStateObservers.size;
                for (int i21 = 0; i21 < i20; i21++) {
                    ((GapComposer$derivedStateObserver$1) objArr7[i21]).done();
                }
                throw th;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create(long j) {
            return new ResultRecord(j);
        }
    }
}
