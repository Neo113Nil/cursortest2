package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes.dex */
public final class SnapshotStateMap implements StateObject, Map, KMutableMap {
    public final SnapshotMapKeySet entries;
    public StateMapStateRecord firstStateRecord;
    public final SnapshotMapKeySet keys;
    public final SnapshotMapKeySet values;

    public SnapshotStateMap() {
        PersistentHashMap persistentHashMap = PersistentHashMap.EMPTY;
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(currentSnapshot.getSnapshotId(), persistentHashMap);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateMapStateRecord.next = new StateMapStateRecord(1L, persistentHashMap);
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapKeySet(this, 1);
        this.keys = new SnapshotMapKeySet(this, 0);
        this.values = new SnapshotMapKeySet(this, 2);
    }

    public static final boolean access$attemptUpdate(SnapshotStateMap snapshotStateMap, StateMapStateRecord stateMapStateRecord, int i, PersistentHashMap persistentHashMap) {
        boolean z;
        synchronized (SnapshotStateMapKt.sync) {
            int i2 = stateMapStateRecord.modification;
            if (i2 == i) {
                stateMapStateRecord.map = persistentHashMap;
                z = true;
                stateMapStateRecord.modification = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot currentSnapshot;
        StateMapStateRecord stateMapStateRecord = this.firstStateRecord;
        stateMapStateRecord.getClass();
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord);
        PersistentHashMap persistentHashMap = PersistentHashMap.EMPTY;
        if (persistentHashMap != stateMapStateRecord2.map) {
            StateMapStateRecord stateMapStateRecord3 = this.firstStateRecord;
            stateMapStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, currentSnapshot);
                synchronized (SnapshotStateMapKt.sync) {
                    stateMapStateRecord4.map = persistentHashMap;
                    stateMapStateRecord4.modification++;
                }
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return getReadable$runtime().map.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return getReadable$runtime().map.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.entries;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return getReadable$runtime().map.get(obj);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final StateMapStateRecord getReadable$runtime() {
        StateMapStateRecord stateMapStateRecord = this.firstStateRecord;
        stateMapStateRecord.getClass();
        return (StateMapStateRecord) SnapshotKt.readable(stateMapStateRecord, this);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getReadable$runtime().map.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.keys;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentHashMap persistentHashMap;
        int i;
        Object put;
        Snapshot currentSnapshot;
        boolean access$attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord = this.firstStateRecord;
                stateMapStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord);
                persistentHashMap = stateMapStateRecord2.map;
                i = stateMapStateRecord2.modification;
            }
            persistentHashMap.getClass();
            PersistentHashMapBuilder builder$1 = persistentHashMap.builder$1();
            put = builder$1.put(obj, obj2);
            PersistentHashMap build$1 = builder$1.build$1();
            if (Intrinsics.areEqual(build$1, persistentHashMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.firstStateRecord;
            stateMapStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                access$attemptUpdate = access$attemptUpdate(this, (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, currentSnapshot), i, build$1);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!access$attemptUpdate);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        PersistentHashMap persistentHashMap;
        int i;
        Snapshot currentSnapshot;
        boolean access$attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord = this.firstStateRecord;
                stateMapStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord);
                persistentHashMap = stateMapStateRecord2.map;
                i = stateMapStateRecord2.modification;
            }
            persistentHashMap.getClass();
            PersistentHashMapBuilder builder$1 = persistentHashMap.builder$1();
            builder$1.putAll(map);
            PersistentHashMap build$1 = builder$1.build$1();
            if (Intrinsics.areEqual(build$1, persistentHashMap)) {
                return;
            }
            StateMapStateRecord stateMapStateRecord3 = this.firstStateRecord;
            stateMapStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                access$attemptUpdate = access$attemptUpdate(this, (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, currentSnapshot), i, build$1);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!access$attemptUpdate);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        PersistentHashMap persistentHashMap;
        int i;
        V remove;
        Snapshot currentSnapshot;
        boolean access$attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateMapStateRecord stateMapStateRecord = this.firstStateRecord;
                stateMapStateRecord.getClass();
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.current(stateMapStateRecord);
                persistentHashMap = stateMapStateRecord2.map;
                i = stateMapStateRecord2.modification;
            }
            persistentHashMap.getClass();
            PersistentHashMapBuilder builder$1 = persistentHashMap.builder$1();
            remove = builder$1.remove(obj);
            PersistentHashMap build$1 = builder$1.build$1();
            if (Intrinsics.areEqual(build$1, persistentHashMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.firstStateRecord;
            stateMapStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                access$attemptUpdate = access$attemptUpdate(this, (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord3, this, currentSnapshot), i, build$1);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!access$attemptUpdate);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return getReadable$runtime().map.size();
    }

    public final String toString() {
        StateMapStateRecord stateMapStateRecord = this.firstStateRecord;
        stateMapStateRecord.getClass();
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current(stateMapStateRecord)).map + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.values;
    }

    public final class StateMapStateRecord extends StateRecord {
        public PersistentHashMap map;
        public int modification;

        public StateMapStateRecord(long j, PersistentHashMap persistentHashMap) {
            super(j);
            this.map = persistentHashMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.sync) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord create(long j) {
            return new StateMapStateRecord(j, this.map);
        }
    }
}
