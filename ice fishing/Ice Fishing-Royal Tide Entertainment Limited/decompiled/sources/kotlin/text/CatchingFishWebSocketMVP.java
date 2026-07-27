package kotlin.text;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class CatchingFishWebSocketMVP extends CatchingFishKtorViewPager implements RandomAccess, Serializable {
    public final int CatchingFishDaggerWebsocket;
    public Object[] CatchingFishReduxKtor;
    public final CatchingFishCameraXGson CatchingFishViewModelFAB;
    public final CatchingFishWebSocketMVP CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishWebSocketMVP(Object[] objArr, int i, int i2, CatchingFishWebSocketMVP catchingFishWebSocketMVP, CatchingFishCameraXGson catchingFishCameraXGson) {
        int i3;
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "backing");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishCameraXGson, "root");
        this.CatchingFishReduxKtor = objArr;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = i2;
        this.CatchingFishViewModelScope = catchingFishWebSocketMVP;
        this.CatchingFishViewModelFAB = catchingFishCameraXGson;
        i3 = ((AbstractList) catchingFishCameraXGson).modCount;
        ((AbstractList) this).modCount = i3;
    }

    public final int CatchingFishCloudMessaging(int i, int i2, Collection collection, boolean z) {
        int CatchingFishCloudMessaging;
        CatchingFishWebSocketMVP catchingFishWebSocketMVP = this.CatchingFishViewModelScope;
        if (catchingFishWebSocketMVP != null) {
            CatchingFishCloudMessaging = catchingFishWebSocketMVP.CatchingFishCloudMessaging(i, i2, collection, z);
        } else {
            CatchingFishCameraXGson catchingFishCameraXGson = CatchingFishCameraXGson.CatchingFishViewModelScope;
            CatchingFishCloudMessaging = this.CatchingFishViewModelFAB.CatchingFishCloudMessaging(i, i2, collection, z);
        }
        if (CatchingFishCloudMessaging > 0) {
            ((AbstractList) this).modCount++;
        }
        this.CatchingFishWorkManager -= CatchingFishCloudMessaging;
        return CatchingFishCloudMessaging;
    }

    public final void CatchingFishDaggerWebsocket(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        CatchingFishCameraXGson catchingFishCameraXGson = this.CatchingFishViewModelFAB;
        CatchingFishWebSocketMVP catchingFishWebSocketMVP = this.CatchingFishViewModelScope;
        if (catchingFishWebSocketMVP != null) {
            catchingFishWebSocketMVP.CatchingFishDaggerWebsocket(i, collection, i2);
        } else {
            CatchingFishCameraXGson catchingFishCameraXGson2 = CatchingFishCameraXGson.CatchingFishViewModelScope;
            catchingFishCameraXGson.CatchingFishDaggerWebsocket(i, collection, i2);
        }
        this.CatchingFishReduxKtor = catchingFishCameraXGson.CatchingFishReduxKtor;
        this.CatchingFishWorkManager += i2;
    }

    public final void CatchingFishFragmentHandler(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        CatchingFishWebSocketMVP catchingFishWebSocketMVP = this.CatchingFishViewModelScope;
        if (catchingFishWebSocketMVP != null) {
            catchingFishWebSocketMVP.CatchingFishFragmentHandler(i, i2);
        } else {
            CatchingFishCameraXGson catchingFishCameraXGson = CatchingFishCameraXGson.CatchingFishViewModelScope;
            this.CatchingFishViewModelFAB.CatchingFishFragmentHandler(i, i2);
        }
        this.CatchingFishWorkManager -= i2;
    }

    public final Object CatchingFishLayout(int i) {
        Object CatchingFishLayout;
        ((AbstractList) this).modCount++;
        CatchingFishWebSocketMVP catchingFishWebSocketMVP = this.CatchingFishViewModelScope;
        if (catchingFishWebSocketMVP != null) {
            CatchingFishLayout = catchingFishWebSocketMVP.CatchingFishLayout(i);
        } else {
            CatchingFishCameraXGson catchingFishCameraXGson = CatchingFishCameraXGson.CatchingFishViewModelScope;
            CatchingFishLayout = this.CatchingFishViewModelFAB.CatchingFishLayout(i);
        }
        this.CatchingFishWorkManager--;
        return CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final int CatchingFishParcelableFAB() {
        CatchingFishViewModelScope();
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final Object CatchingFishSnackbar(int i) {
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return CatchingFishLayout(this.CatchingFishDaggerWebsocket + i);
    }

    public final void CatchingFishViewModelFAB() {
        if (this.CatchingFishViewModelFAB.CatchingFishWorkManager) {
            throw new UnsupportedOperationException();
        }
    }

    public final void CatchingFishViewModelScope() {
        int i;
        i = ((AbstractList) this.CatchingFishViewModelFAB).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void CatchingFishWorkManager(int i, Object obj) {
        ((AbstractList) this).modCount++;
        CatchingFishCameraXGson catchingFishCameraXGson = this.CatchingFishViewModelFAB;
        CatchingFishWebSocketMVP catchingFishWebSocketMVP = this.CatchingFishViewModelScope;
        if (catchingFishWebSocketMVP != null) {
            catchingFishWebSocketMVP.CatchingFishWorkManager(i, obj);
        } else {
            CatchingFishCameraXGson catchingFishCameraXGson2 = CatchingFishCameraXGson.CatchingFishViewModelScope;
            catchingFishCameraXGson.CatchingFishWorkManager(i, obj);
        }
        this.CatchingFishReduxKtor = catchingFishCameraXGson.CatchingFishReduxKtor;
        this.CatchingFishWorkManager++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        CatchingFishWorkManager(this.CatchingFishDaggerWebsocket + this.CatchingFishWorkManager, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        int size = collection.size();
        CatchingFishDaggerWebsocket(this.CatchingFishDaggerWebsocket + this.CatchingFishWorkManager, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        CatchingFishFragmentHandler(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        CatchingFishViewModelScope();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.CatchingFishReduxKtor;
            int i = this.CatchingFishWorkManager;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(objArr[this.CatchingFishDaggerWebsocket + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return this.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        CatchingFishViewModelScope();
        Object[] objArr = this.CatchingFishReduxKtor;
        int i = this.CatchingFishWorkManager;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.CatchingFishDaggerWebsocket + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        CatchingFishViewModelScope();
        for (int i = 0; i < this.CatchingFishWorkManager; i++) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        CatchingFishViewModelScope();
        return this.CatchingFishWorkManager == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        CatchingFishViewModelScope();
        for (int i = this.CatchingFishWorkManager - 1; i >= 0; i--) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket + i], obj)) {
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
        CatchingFishViewModelFAB();
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
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        return CatchingFishCloudMessaging(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        return CatchingFishCloudMessaging(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishDaggerWebsocket;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        CatchingFishLayoutRoomFAB.CatchingFishUnitTesting(i, i2, this.CatchingFishWorkManager);
        return new CatchingFishWebSocketMVP(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket + i, i2 - i, this, this.CatchingFishViewModelFAB);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        CatchingFishViewModelScope();
        int length = objArr.length;
        int i = this.CatchingFishWorkManager;
        int i2 = this.CatchingFishDaggerWebsocket;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.CatchingFishReduxKtor, i2, i + i2, objArr.getClass());
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        CatchingFishMVVMHilt.CatchingFishAppCompat(this.CatchingFishReduxKtor, objArr, 0, i2, i + i2);
        int i3 = this.CatchingFishWorkManager;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        CatchingFishViewModelScope();
        return CatchingFishLayoutRoomFAB.CatchingFishWorkManager(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        return new CatchingFishEspressoMVI(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishWorkManager;
        if (i >= 0 && i <= i2) {
            CatchingFishWorkManager(this.CatchingFishDaggerWebsocket + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        CatchingFishViewModelFAB();
        CatchingFishViewModelScope();
        int i2 = this.CatchingFishWorkManager;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            CatchingFishDaggerWebsocket(this.CatchingFishDaggerWebsocket + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        CatchingFishViewModelScope();
        Object[] objArr = this.CatchingFishReduxKtor;
        int i = this.CatchingFishWorkManager;
        int i2 = this.CatchingFishDaggerWebsocket;
        return CatchingFishMVVMHilt.CatchingFishJUnitRealm(objArr, i2, i + i2);
    }
}
