package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;

/* loaded from: classes3.dex */
public final class Keys implements Set, KMappedMarker {
    public final /* synthetic */ int $r8$classId;
    public final MutableScatterMap parent;

    public Keys(MutableScatterMap mutableScatterMap, int i) {
        this.$r8$classId = i;
        mutableScatterMap.getClass();
        switch (i) {
            case 1:
                this.parent = mutableScatterMap;
                break;
            default:
                this.parent = mutableScatterMap;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        MutableScatterMap mutableScatterMap = this.parent;
        switch (i) {
            case 0:
                return mutableScatterMap.containsKey(obj);
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.areEqual(mutableScatterMap.get(entry.getKey()), entry.getValue());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.$r8$classId;
        MutableScatterMap mutableScatterMap = this.parent;
        collection.getClass();
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!mutableScatterMap.containsKey(it.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection<Map.Entry> collection3 = collection;
                if (!collection3.isEmpty()) {
                    for (Map.Entry entry : collection3) {
                        if (!Intrinsics.areEqual(mutableScatterMap.get(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.$r8$classId) {
        }
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                return SequencesKt__SequenceBuilderKt.iterator(new Keys$iterator$1(this, continuation, 0));
            default:
                return SequencesKt__SequenceBuilderKt.iterator(new Keys$iterator$1(this, continuation, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.$r8$classId) {
        }
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.$r8$classId) {
            case 0:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return ArrayIteratorKt.toArray(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.$r8$classId) {
        }
        return ArrayIteratorKt.toArray(this);
    }
}
