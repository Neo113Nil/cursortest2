package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

/* loaded from: classes.dex */
public final class SnapshotStateList implements Parcelable, StateObject, List, RandomAccess, KMutableList {
    public static final Parcelable.Creator<SnapshotStateList> CREATOR = new SnapshotStateList$Companion$CREATOR$1();
    public StateListStateRecord firstStateRecord;

    public SnapshotStateList(AbstractPersistentList abstractPersistentList) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(currentSnapshot.getSnapshotId(), abstractPersistentList);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.next = new StateListStateRecord(1L, abstractPersistentList);
        }
        this.firstStateRecord = stateListStateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            AbstractPersistentList add = abstractPersistentList.add(obj);
            if (add.equals(abstractPersistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i, add, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            AbstractPersistentList addAll = abstractPersistentList.addAll(collection);
            if (Intrinsics.areEqual(addAll, abstractPersistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i, addAll, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot currentSnapshot;
        StateListStateRecord stateListStateRecord = this.firstStateRecord;
        stateListStateRecord.getClass();
        synchronized (SnapshotKt.lock) {
            currentSnapshot = SnapshotKt.currentSnapshot();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, currentSnapshot);
            synchronized (SnapshotId_jvmKt.sync) {
                stateListStateRecord2.list = SmallPersistentVector.EMPTY;
                stateListStateRecord2.modification++;
                stateListStateRecord2.structuralChange++;
            }
        }
        SnapshotKt.notifyWrite(currentSnapshot, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return SnapshotId_jvmKt.getReadable(this).list.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return SnapshotId_jvmKt.getReadable(this).list.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return SnapshotId_jvmKt.getReadable(this).list.get(i);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return SnapshotId_jvmKt.getReadable(this).list.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return SnapshotId_jvmKt.getReadable(this).list.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return SnapshotId_jvmKt.getReadable(this).list.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord) {
        stateRecord.next = this.firstStateRecord;
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            int indexOf = abstractPersistentList.indexOf(obj);
            AbstractPersistentList removeAt = indexOf != -1 ? abstractPersistentList.removeAt(indexOf) : abstractPersistentList;
            if (removeAt.equals(abstractPersistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i, removeAt, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            AbstractPersistentList removeAll = abstractPersistentList.removeAll(new AliasQueries$$ExternalSyntheticLambda11(1, collection));
            if (Intrinsics.areEqual(removeAll, abstractPersistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i, removeAll, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return true;
    }

    public final void removeRange(int i, int i2) {
        int i3;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i3 = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            PersistentVectorBuilder builder = abstractPersistentList.builder();
            builder.subList(i, i2).clear();
            AbstractPersistentList build = builder.build();
            if (Intrinsics.areEqual(build, abstractPersistentList)) {
                return;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i3, build, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return SnapshotId_jvmKt.mutateBoolean(this, new AliasQueries$$ExternalSyntheticLambda11(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        Object obj2 = get(i);
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i2 = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            AbstractPersistentList abstractPersistentList2 = abstractPersistentList.set(i, obj);
            if (abstractPersistentList2.equals(abstractPersistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i2, abstractPersistentList2, false);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return SnapshotId_jvmKt.getReadable(this).list.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }

    public final String toString() {
        StateListStateRecord stateListStateRecord = this.firstStateRecord;
        stateListStateRecord.getClass();
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current(stateListStateRecord)).list + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractPersistentList abstractPersistentList = SnapshotId_jvmKt.getReadable(this).list;
        int size = abstractPersistentList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(abstractPersistentList.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ArrayIteratorKt.toArray(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new StateListIterator(this, i);
    }

    public SnapshotStateList() {
        this(SmallPersistentVector.EMPTY);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i2 = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            AbstractPersistentList add = abstractPersistentList.add(i, obj);
            if (add.equals(abstractPersistentList)) {
                return;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i2, add, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return SnapshotId_jvmKt.mutateBoolean(this, new LazyListState$$ExternalSyntheticLambda3(i, collection, 3));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractPersistentList abstractPersistentList;
        Snapshot currentSnapshot;
        boolean attemptUpdate;
        Object obj = get(i);
        do {
            synchronized (SnapshotId_jvmKt.sync) {
                StateListStateRecord stateListStateRecord = this.firstStateRecord;
                stateListStateRecord.getClass();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.current(stateListStateRecord);
                i2 = stateListStateRecord2.modification;
                abstractPersistentList = stateListStateRecord2.list;
            }
            abstractPersistentList.getClass();
            AbstractPersistentList removeAt = abstractPersistentList.removeAt(i);
            if (removeAt.equals(abstractPersistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.firstStateRecord;
            stateListStateRecord3.getClass();
            synchronized (SnapshotKt.lock) {
                currentSnapshot = SnapshotKt.currentSnapshot();
                attemptUpdate = SnapshotId_jvmKt.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord3, this, currentSnapshot), i2, removeAt, true);
            }
            SnapshotKt.notifyWrite(currentSnapshot, this);
        } while (!attemptUpdate);
        return obj;
    }
}
