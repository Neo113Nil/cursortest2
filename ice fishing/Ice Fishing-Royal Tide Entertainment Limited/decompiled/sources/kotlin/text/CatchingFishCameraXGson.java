package kotlin.text;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class CatchingFishCameraXGson extends CatchingFishKtorViewPager implements RandomAccess, Serializable {
    public static final CatchingFishCameraXGson CatchingFishViewModelScope;
    public int CatchingFishDaggerWebsocket;
    public Object[] CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    static {
        CatchingFishCameraXGson catchingFishCameraXGson = new CatchingFishCameraXGson(0);
        catchingFishCameraXGson.CatchingFishWorkManager = true;
        CatchingFishViewModelScope = catchingFishCameraXGson;
    }

    public CatchingFishCameraXGson(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.CatchingFishReduxKtor = new Object[i];
    }

    public final int CatchingFishCloudMessaging(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.CatchingFishReduxKtor[i5]) == z) {
                Object[] objArr = this.CatchingFishReduxKtor;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.CatchingFishReduxKtor;
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i + i4, i2 + i, this.CatchingFishDaggerWebsocket);
        Object[] objArr3 = this.CatchingFishReduxKtor;
        int i7 = this.CatchingFishDaggerWebsocket;
        CatchingFishLayoutRoomFAB.CatchingFishAnimation(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.CatchingFishDaggerWebsocket -= i6;
        return i6;
    }

    public final void CatchingFishDaggerWebsocket(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        CatchingFishViewModelFAB(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.CatchingFishReduxKtor[i + i3] = it.next();
        }
    }

    public final void CatchingFishFragmentHandler(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i, i + i2, this.CatchingFishDaggerWebsocket);
        Object[] objArr2 = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishDaggerWebsocket;
        CatchingFishLayoutRoomFAB.CatchingFishAnimation(objArr2, i3 - i2, i3);
        this.CatchingFishDaggerWebsocket -= i2;
    }

    public final Object CatchingFishLayout(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.CatchingFishReduxKtor;
        Object obj = objArr[i];
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i, i + 1, this.CatchingFishDaggerWebsocket);
        Object[] objArr2 = this.CatchingFishReduxKtor;
        int i2 = this.CatchingFishDaggerWebsocket - 1;
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr2, "<this>");
        objArr2[i2] = null;
        this.CatchingFishDaggerWebsocket--;
        return obj;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final Object CatchingFishSnackbar(int i) {
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return CatchingFishLayout(i);
    }

    public final void CatchingFishViewModelFAB(int i, int i2) {
        int i3 = this.CatchingFishDaggerWebsocket + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i4);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf;
        }
        Object[] objArr2 = this.CatchingFishReduxKtor;
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i + i2, i, this.CatchingFishDaggerWebsocket);
        this.CatchingFishDaggerWebsocket += i2;
    }

    public final void CatchingFishViewModelScope() {
        if (this.CatchingFishWorkManager) {
            throw new UnsupportedOperationException();
        }
    }

    public final void CatchingFishWorkManager(int i, Object obj) {
        ((AbstractList) this).modCount++;
        CatchingFishViewModelFAB(i, 1);
        this.CatchingFishReduxKtor[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        CatchingFishViewModelScope();
        int i = this.CatchingFishDaggerWebsocket;
        ((AbstractList) this).modCount++;
        CatchingFishViewModelFAB(i, 1);
        this.CatchingFishReduxKtor[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelScope();
        int size = collection.size();
        CatchingFishDaggerWebsocket(this.CatchingFishDaggerWebsocket, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        CatchingFishViewModelScope();
        CatchingFishFragmentHandler(0, this.CatchingFishDaggerWebsocket);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.CatchingFishReduxKtor;
            int i = this.CatchingFishDaggerWebsocket;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return this.CatchingFishReduxKtor[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.CatchingFishReduxKtor;
        int i = this.CatchingFishDaggerWebsocket;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.CatchingFishDaggerWebsocket; i++) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.CatchingFishDaggerWebsocket == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.CatchingFishDaggerWebsocket - 1; i >= 0; i--) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        CatchingFishViewModelScope();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            CatchingFishSnackbar(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelScope();
        return CatchingFishCloudMessaging(0, this.CatchingFishDaggerWebsocket, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelScope();
        return CatchingFishCloudMessaging(0, this.CatchingFishDaggerWebsocket, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        CatchingFishLayoutRoomFAB.CatchingFishUnitTesting(i, i2, this.CatchingFishDaggerWebsocket);
        return new CatchingFishWebSocketMVP(this.CatchingFishReduxKtor, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        int length = objArr.length;
        int i = this.CatchingFishDaggerWebsocket;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.CatchingFishReduxKtor, 0, i, objArr.getClass());
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        CatchingFishMVVMHilt.CatchingFishAppCompat(this.CatchingFishReduxKtor, objArr, 0, 0, i);
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return CatchingFishLayoutRoomFAB.CatchingFishWorkManager(this.CatchingFishReduxKtor, 0, this.CatchingFishDaggerWebsocket, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return new CatchingFishEspressoMVI(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            CatchingFishDaggerWebsocket(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishDaggerWebsocket;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            CatchingFishViewModelFAB(i, 1);
            this.CatchingFishReduxKtor[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return CatchingFishMVVMHilt.CatchingFishJUnitRealm(this.CatchingFishReduxKtor, 0, this.CatchingFishDaggerWebsocket);
    }
}
