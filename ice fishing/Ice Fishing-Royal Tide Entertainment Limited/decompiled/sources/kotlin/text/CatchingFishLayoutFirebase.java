package kotlin.text;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishLayoutFirebase implements Set {
    public final /* synthetic */ CatchingFishCameraXRetrofit CatchingFishReduxKtor;

    public CatchingFishLayoutFirebase(CatchingFishCameraXRetrofit catchingFishCameraXRetrofit) {
        this.CatchingFishReduxKtor = catchingFishCameraXRetrofit;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.CatchingFishReduxKtor.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.CatchingFishReduxKtor.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.CatchingFishReduxKtor.CatchingFishFragmentHandler(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishReduxKtor;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (catchingFishCameraXRetrofit.CatchingFishWorkManager == set.size()) {
                return catchingFishCameraXRetrofit.CatchingFishFragmentHandler(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishReduxKtor;
        int i = 0;
        for (int i2 = catchingFishCameraXRetrofit.CatchingFishWorkManager - 1; i2 >= 0; i2--) {
            Object CatchingFishWorkManager = catchingFishCameraXRetrofit.CatchingFishWorkManager(i2);
            i += CatchingFishWorkManager == null ? 0 : CatchingFishWorkManager.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.CatchingFishReduxKtor.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishHiltToast(this.CatchingFishReduxKtor, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishReduxKtor;
        int CatchingFishReduxKtor = catchingFishCameraXRetrofit.CatchingFishReduxKtor(obj);
        if (CatchingFishReduxKtor < 0) {
            return false;
        }
        catchingFishCameraXRetrofit.CatchingFishViewModelScope(CatchingFishReduxKtor);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.CatchingFishReduxKtor.CatchingFishCloudMessaging(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishReduxKtor;
        int i = catchingFishCameraXRetrofit.CatchingFishWorkManager;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(catchingFishCameraXRetrofit.CatchingFishWorkManager(i2))) {
                catchingFishCameraXRetrofit.CatchingFishViewModelScope(i2);
            }
        }
        return i != catchingFishCameraXRetrofit.CatchingFishWorkManager;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.CatchingFishReduxKtor.CatchingFishWorkManager;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishReduxKtor;
        int i = catchingFishCameraXRetrofit.CatchingFishWorkManager;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = catchingFishCameraXRetrofit.CatchingFishWorkManager(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        CatchingFishCameraXRetrofit catchingFishCameraXRetrofit = this.CatchingFishReduxKtor;
        int i = catchingFishCameraXRetrofit.CatchingFishWorkManager;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = catchingFishCameraXRetrofit.CatchingFishWorkManager(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
