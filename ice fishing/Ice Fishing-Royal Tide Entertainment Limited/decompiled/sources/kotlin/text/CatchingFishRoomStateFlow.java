package kotlin.text;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishRoomStateFlow implements Collection, Set, CatchingFishViewAndroidX, CatchingFishContextMVP {
    public int CatchingFishWorkManager;
    public int[] CatchingFishReduxKtor = CatchingFishAdMobFAB.CatchingFishSnackbar;
    public Object[] CatchingFishDaggerWebsocket = CatchingFishAdMobFAB.CatchingFishReduxKtor;

    public CatchingFishRoomStateFlow(int i) {
        if (i > 0) {
            CatchingFishRobolectricHilt.CatchingFishViewModelFAB(this, i);
        }
    }

    public final Object CatchingFishParcelableFAB(int i) {
        int i2 = this.CatchingFishWorkManager;
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.CatchingFishReduxKtor;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                CatchingFishMVVMHilt.CatchingFishParcelable(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i, i4, i2);
            }
            this.CatchingFishDaggerWebsocket[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.CatchingFishReduxKtor = iArr2;
            this.CatchingFishDaggerWebsocket = new Object[i5];
            if (i > 0) {
                CatchingFishMVVMHilt.CatchingFishDataStoreIntent(0, i, 6, iArr, iArr2);
                CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, this.CatchingFishDaggerWebsocket, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                CatchingFishMVVMHilt.CatchingFishParcelable(i, i6, i2, iArr, this.CatchingFishReduxKtor);
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, this.CatchingFishDaggerWebsocket, i, i6, i2);
            }
        }
        if (i2 != this.CatchingFishWorkManager) {
            throw new ConcurrentModificationException();
        }
        this.CatchingFishWorkManager = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int CatchingFishCardViewView;
        int i2 = this.CatchingFishWorkManager;
        if (obj == null) {
            CatchingFishCardViewView = CatchingFishRobolectricHilt.CatchingFishCardViewView(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            CatchingFishCardViewView = CatchingFishRobolectricHilt.CatchingFishCardViewView(this, obj, hashCode);
        }
        if (CatchingFishCardViewView >= 0) {
            return false;
        }
        int i3 = ~CatchingFishCardViewView;
        int[] iArr = this.CatchingFishReduxKtor;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            int[] iArr2 = new int[i4];
            this.CatchingFishReduxKtor = iArr2;
            this.CatchingFishDaggerWebsocket = new Object[i4];
            if (i2 != this.CatchingFishWorkManager) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                CatchingFishMVVMHilt.CatchingFishDataStoreIntent(0, iArr.length, 6, iArr, iArr2);
                CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, this.CatchingFishDaggerWebsocket, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.CatchingFishReduxKtor;
            int i5 = i3 + 1;
            CatchingFishMVVMHilt.CatchingFishParcelable(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.CatchingFishWorkManager;
        if (i2 == i6) {
            int[] iArr4 = this.CatchingFishReduxKtor;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.CatchingFishDaggerWebsocket[i3] = obj;
                this.CatchingFishWorkManager = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        int size = collection.size() + this.CatchingFishWorkManager;
        int i = this.CatchingFishWorkManager;
        int[] iArr = this.CatchingFishReduxKtor;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            int[] iArr2 = new int[size];
            this.CatchingFishReduxKtor = iArr2;
            this.CatchingFishDaggerWebsocket = new Object[size];
            if (i > 0) {
                CatchingFishMVVMHilt.CatchingFishDataStoreIntent(0, i, 6, iArr, iArr2);
                CatchingFishMVVMHilt.CatchingFishStateFlow(objArr, this.CatchingFishDaggerWebsocket, 0, this.CatchingFishWorkManager, 6);
            }
        }
        if (this.CatchingFishWorkManager != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.CatchingFishWorkManager != 0) {
            this.CatchingFishReduxKtor = CatchingFishAdMobFAB.CatchingFishSnackbar;
            this.CatchingFishDaggerWebsocket = CatchingFishAdMobFAB.CatchingFishReduxKtor;
            this.CatchingFishWorkManager = 0;
        }
        if (this.CatchingFishWorkManager != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? CatchingFishRobolectricHilt.CatchingFishCardViewView(this, null, 0) : CatchingFishRobolectricHilt.CatchingFishCardViewView(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.CatchingFishWorkManager != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.CatchingFishWorkManager;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.CatchingFishDaggerWebsocket[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.CatchingFishReduxKtor;
        int i = this.CatchingFishWorkManager;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.CatchingFishWorkManager <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new CatchingFishHiltToast(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int CatchingFishCardViewView = obj == null ? CatchingFishRobolectricHilt.CatchingFishCardViewView(this, null, 0) : CatchingFishRobolectricHilt.CatchingFishCardViewView(this, obj, obj.hashCode());
        if (CatchingFishCardViewView < 0) {
            return false;
        }
        CatchingFishParcelableFAB(CatchingFishCardViewView);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        boolean z = false;
        for (int i = this.CatchingFishWorkManager - 1; -1 < i; i--) {
            if (!CatchingFishCameraXCameraX.CatchingFishDataStoreIntent(collection, this.CatchingFishDaggerWebsocket[i])) {
                CatchingFishParcelableFAB(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.CatchingFishWorkManager;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return CatchingFishMVVMHilt.CatchingFishJUnitRealm(this.CatchingFishDaggerWebsocket, 0, this.CatchingFishWorkManager);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.CatchingFishWorkManager * 14);
        sb.append('{');
        int i = this.CatchingFishWorkManager;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.CatchingFishDaggerWebsocket[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        int i = this.CatchingFishWorkManager;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        CatchingFishMVVMHilt.CatchingFishAppCompat(this.CatchingFishDaggerWebsocket, objArr, 0, 0, this.CatchingFishWorkManager);
        return objArr;
    }
}
