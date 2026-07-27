package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class CatchingFishFABFirebase implements List, CatchingFishViewAndroidX {
    public final CatchingFishFABToast CatchingFishReduxKtor;

    public CatchingFishFABFirebase(CatchingFishFABToast catchingFishFABToast) {
        this.CatchingFishReduxKtor = catchingFishFABToast;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.CatchingFishReduxKtor.CatchingFishSnackbar(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishReduxKtor;
        return catchingFishFABToast.CatchingFishDaggerWebsocket(catchingFishFABToast.CatchingFishWorkManager, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.CatchingFishReduxKtor.CatchingFishViewModelScope();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishViewModelFAB(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishReduxKtor;
        catchingFishFABToast.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!catchingFishFABToast.CatchingFishViewModelFAB(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        CatchingFishBundleMockk.CatchingFishParcelableFAB(i, this);
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishReduxKtor;
        Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.CatchingFishWorkManager == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishRoomHandler(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishReduxKtor;
        Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
        for (int i = catchingFishFABToast.CatchingFishWorkManager - 1; i >= 0; i--) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new CatchingFishRoomHandler(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.CatchingFishReduxKtor.CatchingFishLayout(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishReduxKtor;
        catchingFishFABToast.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = catchingFishFABToast.CatchingFishWorkManager;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            catchingFishFABToast.CatchingFishLayout(it.next());
        }
        return i != catchingFishFABToast.CatchingFishWorkManager;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        CatchingFishFABToast catchingFishFABToast = this.CatchingFishReduxKtor;
        int i = catchingFishFABToast.CatchingFishWorkManager;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(catchingFishFABToast.CatchingFishReduxKtor[i2])) {
                catchingFishFABToast.CatchingFishFragmentHandler(i2);
            }
        }
        return i != catchingFishFABToast.CatchingFishWorkManager;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishBundleMockk.CatchingFishParcelableFAB(i, this);
        Object[] objArr = this.CatchingFishReduxKtor.CatchingFishReduxKtor;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishWorkManager;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        CatchingFishBundleMockk.CatchingFishSnackbar(this, i, i2);
        return new CatchingFishViewModelGlide(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CatchingFishGsonCardView.CatchingFishSensorManager(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.CatchingFishReduxKtor.CatchingFishParcelableFAB(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new CatchingFishRoomHandler(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        CatchingFishBundleMockk.CatchingFishParcelableFAB(i, this);
        return this.CatchingFishReduxKtor.CatchingFishFragmentHandler(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CatchingFishGsonCardView.CatchingFishEspressoMockk(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket(i, collection);
    }
}
