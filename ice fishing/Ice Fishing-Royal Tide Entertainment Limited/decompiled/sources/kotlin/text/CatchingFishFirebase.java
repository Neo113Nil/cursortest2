package kotlin.text;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CatchingFishFirebase implements Collection, CatchingFishCardViewFAB {
    public abstract int CatchingFishParcelableFAB();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return CatchingFishParcelableFAB() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return CatchingFishParcelableFAB();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    public final String toString() {
        return CatchingFishCameraXCameraX.CatchingFishMVVMAppCompat(this, ", ", "[", "]", new CatchingFishFragmentFactory(0, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
