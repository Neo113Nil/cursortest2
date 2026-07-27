package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class CatchingFishMVPToastIntent implements Collection, CatchingFishCardViewFAB {
    public final CatchingFishPayPalService CatchingFishReduxKtor;

    public CatchingFishMVPToastIntent(CatchingFishPayPalService catchingFishPayPalService) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishPayPalService, "parent");
        this.CatchingFishReduxKtor = catchingFishPayPalService;
    }

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
    public final boolean contains(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.CatchingFishReduxKtor.CatchingFishReduxKtor(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.CatchingFishLayout();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return CatchingFishToastHiltBundle.CatchingFishGsonAppCompat(new CatchingFishJUnitGoogleMaps(this, null));
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
