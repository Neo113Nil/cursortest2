package kotlin.text;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataCameraX implements Collection, CatchingFishCardViewFAB {
    public final boolean CatchingFishDaggerWebsocket;
    public final Object[] CatchingFishReduxKtor;

    public CatchingFishLiveDataCameraX(Object[] objArr, boolean z) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "values");
        this.CatchingFishReduxKtor = objArr;
        this.CatchingFishDaggerWebsocket = z;
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
        return CatchingFishMVVMHilt.CatchingFishMotionLayout(this.CatchingFishReduxKtor, obj);
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
            if (!CatchingFishMVVMHilt.CatchingFishMotionLayout(this.CatchingFishReduxKtor, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        return new CatchingFishMultiplatform(objArr);
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
    public final int size() {
        return this.CatchingFishReduxKtor.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
        if (this.CatchingFishDaggerWebsocket && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }
}
