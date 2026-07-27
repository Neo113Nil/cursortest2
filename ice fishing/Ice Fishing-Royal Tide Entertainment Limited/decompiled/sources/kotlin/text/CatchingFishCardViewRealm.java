package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishCardViewRealm implements Set, CatchingFishCardViewFAB {
    public final CatchingFishServiceBundle CatchingFishReduxKtor;

    public CatchingFishCardViewRealm(CatchingFishServiceBundle catchingFishServiceBundle) {
        this.CatchingFishReduxKtor = catchingFishServiceBundle;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishCoroutine(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.CatchingFishReduxKtor.CatchingFishCoroutine(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.CatchingFishViewModelScope();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return CatchingFishToastHiltBundle.CatchingFishGsonAppCompat(new CatchingFishRealmViewOkHttp(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
