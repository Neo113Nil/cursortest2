package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import androidx.customview.view.AbsSavedState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: classes3.dex */
public final class SnapshotStateSet implements Parcelable, StateObject, Set, RandomAccess, KMutableSet {
    public static final Parcelable.Creator<SnapshotStateSet> CREATOR = new AbsSavedState.AnonymousClass2(3);
    public StateSetStateRecord firstStateRecord;

    public SnapshotStateSet() {
        PersistentOrderedSet persistentOrderedSet = PersistentOrderedSet.EMPTY;
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), persistentOrderedSet);
        if (SnapshotKt.threadSnapshot.get() != null) {
            stateSetStateRecord.next = new StateSetStateRecord(1L, persistentOrderedSet);
        }
        this.firstStateRecord = stateSetStateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        PersistentOrderedSet persistentOrderedSet;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync$1) {
                StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
                stateSetStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.current(stateSetStateRecord);
                i = stateSetStateRecord2.modification;
                persistentOrderedSet = stateSetStateRecord2.set;
            }
            persistentOrderedSet.getClass();
            PersistentOrderedSet add = persistentOrderedSet.add(obj);
            if (add.equals(persistentOrderedSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.firstStateRecord;
            stateSetStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotStateMapKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord3, this, currentSnapshot), i, add);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        PersistentOrderedSet persistentOrderedSet;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync$1) {
                StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
                stateSetStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.current(stateSetStateRecord);
                i = stateSetStateRecord2.modification;
                persistentOrderedSet = stateSetStateRecord2.set;
            }
            persistentOrderedSet.getClass();
            PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(persistentOrderedSet);
            persistentOrderedSetBuilder.addAll(collection);
            PersistentOrderedSet build = persistentOrderedSetBuilder.build();
            if (build.equals(persistentOrderedSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.firstStateRecord;
            stateSetStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotStateMapKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord3, this, currentSnapshot), i, build);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        Snapshot currentSnapshot;
        StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
        stateSetStateRecord.getClass();
        synchronized (SnapshotKt.lock) {
            currentSnapshot = SnapshotKt.currentSnapshot();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord, this, currentSnapshot);
            synchronized (SnapshotStateMapKt.sync$1) {
                stateSetStateRecord2.set = PersistentOrderedSet.EMPTY;
                stateSetStateRecord2.modification++;
            }
        }
        SnapshotKt.notifyWrite(currentSnapshot, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return SnapshotStateMapKt.getReadable(this).set.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return SnapshotStateMapKt.getReadable(this).set.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return SnapshotStateMapKt.getReadable(this).set.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new StateSetIterator(this, SnapshotStateMapKt.getReadable(this).set.iterator());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.next = this.firstStateRecord;
        this.firstStateRecord = (StateSetStateRecord) stateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        PersistentOrderedSet persistentOrderedSet;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync$1) {
                StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
                stateSetStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.current(stateSetStateRecord);
                i = stateSetStateRecord2.modification;
                persistentOrderedSet = stateSetStateRecord2.set;
            }
            persistentOrderedSet.getClass();
            PersistentOrderedSet remove = persistentOrderedSet.remove(obj);
            if (remove.equals(persistentOrderedSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.firstStateRecord;
            stateSetStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotStateMapKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord3, this, currentSnapshot), i, remove);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        PersistentOrderedSet persistentOrderedSet;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync$1) {
                StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
                stateSetStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.current(stateSetStateRecord);
                i = stateSetStateRecord2.modification;
                persistentOrderedSet = stateSetStateRecord2.set;
            }
            persistentOrderedSet.getClass();
            PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(persistentOrderedSet);
            persistentOrderedSetBuilder.removeAll(collection);
            PersistentOrderedSet build = persistentOrderedSetBuilder.build();
            if (build.equals(persistentOrderedSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.firstStateRecord;
            stateSetStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotStateMapKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord3, this, currentSnapshot), i, build);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        PersistentOrderedSet persistentOrderedSet;
        boolean retainAll;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync$1) {
                StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
                stateSetStateRecord.getClass();
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.current(stateSetStateRecord);
                i = stateSetStateRecord2.modification;
                persistentOrderedSet = stateSetStateRecord2.set;
            }
            if (persistentOrderedSet == null) {
                a$$ExternalSyntheticBUOutline0.m$1("No set to mutate");
                return false;
            }
            PersistentOrderedSetBuilder persistentOrderedSetBuilder = new PersistentOrderedSetBuilder(persistentOrderedSet);
            retainAll = persistentOrderedSetBuilder.retainAll(CollectionsKt.toSet(collection));
            PersistentOrderedSet build = persistentOrderedSetBuilder.build();
            if (build.equals(persistentOrderedSet)) {
                break;
            }
            StateSetStateRecord stateSetStateRecord3 = this.firstStateRecord;
            stateSetStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotStateMapKt.attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord3, this, currentSnapshot), i, build);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return retainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return SnapshotStateMapKt.getReadable(this).set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }

    public final String toString() {
        StateSetStateRecord stateSetStateRecord = this.firstStateRecord;
        stateSetStateRecord.getClass();
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.current(stateSetStateRecord)).set + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersistentOrderedSet persistentOrderedSet = SnapshotStateMapKt.getReadable(this).set;
        parcel.writeInt(size());
        Iterator it = persistentOrderedSet.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ArrayIteratorKt.toArray(this, objArr);
    }
}
