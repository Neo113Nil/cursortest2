package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SubSequence$iterator$1;

/* loaded from: classes3.dex */
public final class Values implements Collection, KMappedMarker {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object parent;

    public Values() {
        int i = OrderedScatterSetKt.$r8$clinit;
        this.parent = new MutableOrderedScatterSet(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((MutableOrderedScatterSet) this.parent).add(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((MutableOrderedScatterSet) this.parent).clear();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((MutableScatterMap) this.parent).containsValue(obj);
            default:
                return ((MutableOrderedScatterSet) this.parent).contains(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.$r8$classId;
        Object obj = this.parent;
        switch (i) {
            case 0:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((MutableScatterMap) obj).containsValue(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((MutableOrderedScatterSet) obj).contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.$r8$classId) {
            case 0:
                return ((MutableScatterMap) this.parent).isEmpty();
            default:
                return ((MutableOrderedScatterSet) this.parent)._size == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return SequencesKt__SequenceBuilderKt.iterator(new Keys$iterator$1(this, null, 2));
            default:
                MutableOrderedScatterSet mutableOrderedScatterSet = (MutableOrderedScatterSet) this.parent;
                mutableOrderedScatterSet.getClass();
                return new SubSequence$iterator$1(new MutableOrderedSetWrapper(mutableOrderedScatterSet));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((MutableOrderedScatterSet) this.parent).remove(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((MutableOrderedScatterSet) this.parent).remove(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((MutableOrderedScatterSet) this.parent).retainAll(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.$r8$classId) {
            case 0:
                return ((MutableScatterMap) this.parent)._size;
            default:
                return ((MutableOrderedScatterSet) this.parent)._size;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.$r8$classId) {
            case 0:
                objArr.getClass();
                break;
        }
        return ArrayIteratorKt.toArray(this, objArr);
    }

    public Values(MutableScatterMap mutableScatterMap) {
        mutableScatterMap.getClass();
        this.parent = mutableScatterMap;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.$r8$classId) {
        }
        return ArrayIteratorKt.toArray(this);
    }
}
