package kotlin.text;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishMVVMLifecycle extends CatchingFishKtorViewPager {
    public static final Object[] CatchingFishViewModelScope = new Object[0];
    public Object[] CatchingFishDaggerWebsocket = CatchingFishViewModelScope;
    public int CatchingFishReduxKtor;
    public int CatchingFishWorkManager;

    public final void CatchingFishCoroutine(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.CatchingFishDaggerWebsocket.length;
        while (i < length && it.hasNext()) {
            this.CatchingFishDaggerWebsocket[i] = it.next();
            i++;
        }
        int i2 = this.CatchingFishReduxKtor;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.CatchingFishDaggerWebsocket[i3] = it.next();
        }
        this.CatchingFishWorkManager = collection.size() + this.CatchingFishWorkManager;
    }

    public final void CatchingFishDaggerWebsocket(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == CatchingFishViewModelScope) {
            if (i < 10) {
                i = 10;
            }
            this.CatchingFishDaggerWebsocket = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr2, 0, this.CatchingFishReduxKtor, objArr.length);
        Object[] objArr3 = this.CatchingFishDaggerWebsocket;
        int length2 = objArr3.length;
        int i3 = this.CatchingFishReduxKtor;
        CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, objArr2, length2 - i3, 0, i3);
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = objArr2;
    }

    public final void CatchingFishFragmentHandler() {
        ((AbstractList) this).modCount++;
    }

    public final int CatchingFishLayout(int i) {
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final int CatchingFishParcelableFAB() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishKtorViewPager
    public final Object CatchingFishSnackbar(int i) {
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        if (i == CatchingFishToastCustomView.CatchingFishMotionLayout(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        CatchingFishFragmentHandler();
        int CatchingFishLayout = CatchingFishLayout(this.CatchingFishReduxKtor + i);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj = objArr[CatchingFishLayout];
        if (i < (this.CatchingFishWorkManager >> 1)) {
            int i3 = this.CatchingFishReduxKtor;
            if (CatchingFishLayout >= i3) {
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i3 + 1, i3, CatchingFishLayout);
            } else {
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, 1, 0, CatchingFishLayout);
                Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.CatchingFishReduxKtor;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.CatchingFishDaggerWebsocket;
            int i5 = this.CatchingFishReduxKtor;
            objArr3[i5] = null;
            this.CatchingFishReduxKtor = CatchingFishWorkManager(i5);
        } else {
            int CatchingFishLayout2 = CatchingFishLayout(CatchingFishToastCustomView.CatchingFishMotionLayout(this) + this.CatchingFishReduxKtor);
            if (CatchingFishLayout <= CatchingFishLayout2) {
                Object[] objArr4 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr4, objArr4, CatchingFishLayout, CatchingFishLayout + 1, CatchingFishLayout2 + 1);
            } else {
                Object[] objArr5 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr5, objArr5, CatchingFishLayout, CatchingFishLayout + 1, objArr5.length);
                Object[] objArr6 = this.CatchingFishDaggerWebsocket;
                objArr6[objArr6.length - 1] = objArr6[0];
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr6, objArr6, 0, 1, CatchingFishLayout2 + 1);
            }
            this.CatchingFishDaggerWebsocket[CatchingFishLayout2] = null;
        }
        this.CatchingFishWorkManager--;
        return obj;
    }

    public final void CatchingFishViewModelFAB(int i, int i2) {
        if (i < i2) {
            CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishDaggerWebsocket, i, i2);
            return;
        }
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        CatchingFishMVVMHilt.CatchingFishAnimation(objArr, i, objArr.length);
        CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishDaggerWebsocket, 0, i2);
    }

    public final int CatchingFishViewModelScope(int i) {
        return i < 0 ? i + this.CatchingFishDaggerWebsocket.length : i;
    }

    public final int CatchingFishWorkManager(int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(this.CatchingFishDaggerWebsocket, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.CatchingFishWorkManager;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i3, "index: ", ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        CatchingFishFragmentHandler();
        CatchingFishDaggerWebsocket(this.CatchingFishWorkManager + 1);
        int CatchingFishLayout = CatchingFishLayout(this.CatchingFishReduxKtor + i);
        int i4 = this.CatchingFishWorkManager;
        if (i < ((i4 + 1) >> 1)) {
            if (CatchingFishLayout == 0) {
                Object[] objArr = this.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
                CatchingFishLayout = objArr.length;
            }
            int i5 = CatchingFishLayout - 1;
            int i6 = this.CatchingFishReduxKtor;
            if (i6 == 0) {
                Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                CatchingFishFirebaseDagger.CatchingFishNavigation(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.CatchingFishReduxKtor;
            if (i5 >= i7) {
                Object[] objArr3 = this.CatchingFishDaggerWebsocket;
                objArr3[i2] = objArr3[i7];
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.CatchingFishDaggerWebsocket;
                objArr5[objArr5.length - 1] = objArr5[0];
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.CatchingFishDaggerWebsocket[i5] = obj;
            this.CatchingFishReduxKtor = i2;
        } else {
            int CatchingFishLayout2 = CatchingFishLayout(i4 + this.CatchingFishReduxKtor);
            if (CatchingFishLayout < CatchingFishLayout2) {
                Object[] objArr6 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr6, objArr6, CatchingFishLayout + 1, CatchingFishLayout, CatchingFishLayout2);
            } else {
                Object[] objArr7 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr7, objArr7, 1, 0, CatchingFishLayout2);
                Object[] objArr8 = this.CatchingFishDaggerWebsocket;
                objArr8[0] = objArr8[objArr8.length - 1];
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr8, objArr8, CatchingFishLayout + 1, CatchingFishLayout, objArr8.length - 1);
            }
            this.CatchingFishDaggerWebsocket[CatchingFishLayout] = obj;
        }
        this.CatchingFishWorkManager++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        int i2 = this.CatchingFishWorkManager;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.CatchingFishWorkManager) {
            return addAll(collection);
        }
        CatchingFishFragmentHandler();
        CatchingFishDaggerWebsocket(collection.size() + this.CatchingFishWorkManager);
        int CatchingFishLayout = CatchingFishLayout(this.CatchingFishWorkManager + this.CatchingFishReduxKtor);
        int CatchingFishLayout2 = CatchingFishLayout(this.CatchingFishReduxKtor + i);
        int size = collection.size();
        if (i >= ((this.CatchingFishWorkManager + 1) >> 1)) {
            int i3 = CatchingFishLayout2 + size;
            if (CatchingFishLayout2 < CatchingFishLayout) {
                int i4 = size + CatchingFishLayout;
                Object[] objArr = this.CatchingFishDaggerWebsocket;
                if (i4 <= objArr.length) {
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i3, CatchingFishLayout2, CatchingFishLayout);
                } else if (i3 >= objArr.length) {
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i3 - objArr.length, CatchingFishLayout2, CatchingFishLayout);
                } else {
                    int length = CatchingFishLayout - (i4 - objArr.length);
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, 0, length, CatchingFishLayout);
                    Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr2, i3, CatchingFishLayout2, length);
                }
            } else {
                Object[] objArr3 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, objArr3, size, 0, CatchingFishLayout);
                Object[] objArr4 = this.CatchingFishDaggerWebsocket;
                if (i3 >= objArr4.length) {
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr4, objArr4, i3 - objArr4.length, CatchingFishLayout2, objArr4.length);
                } else {
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.CatchingFishDaggerWebsocket;
                    CatchingFishMVVMHilt.CatchingFishAppCompat(objArr5, objArr5, i3, CatchingFishLayout2, objArr5.length - size);
                }
            }
            CatchingFishCoroutine(CatchingFishLayout2, collection);
            return true;
        }
        int i5 = this.CatchingFishReduxKtor;
        int i6 = i5 - size;
        if (CatchingFishLayout2 < i5) {
            Object[] objArr6 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr6, objArr6, i6, i5, objArr6.length);
            if (size >= CatchingFishLayout2) {
                Object[] objArr7 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr7, objArr7, objArr7.length - size, 0, CatchingFishLayout2);
            } else {
                Object[] objArr8 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr9, objArr9, 0, size, CatchingFishLayout2);
            }
        } else if (i6 >= 0) {
            Object[] objArr10 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr10, objArr10, i6, i5, CatchingFishLayout2);
        } else {
            Object[] objArr11 = this.CatchingFishDaggerWebsocket;
            i6 += objArr11.length;
            int i7 = CatchingFishLayout2 - i5;
            int length2 = objArr11.length - i6;
            if (length2 >= i7) {
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr11, objArr11, i6, i5, CatchingFishLayout2);
            } else {
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr11, objArr11, i6, i5, i5 + length2);
                Object[] objArr12 = this.CatchingFishDaggerWebsocket;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr12, objArr12, 0, this.CatchingFishReduxKtor + length2, CatchingFishLayout2);
            }
        }
        this.CatchingFishReduxKtor = i6;
        CatchingFishCoroutine(CatchingFishViewModelScope(CatchingFishLayout2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        CatchingFishFragmentHandler();
        CatchingFishDaggerWebsocket(this.CatchingFishWorkManager + 1);
        int i = this.CatchingFishReduxKtor;
        if (i == 0) {
            Object[] objArr = this.CatchingFishDaggerWebsocket;
            CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishDaggerWebsocket[i2] = obj;
        this.CatchingFishWorkManager++;
    }

    public final void addLast(Object obj) {
        CatchingFishFragmentHandler();
        CatchingFishDaggerWebsocket(CatchingFishParcelableFAB() + 1);
        this.CatchingFishDaggerWebsocket[CatchingFishLayout(CatchingFishParcelableFAB() + this.CatchingFishReduxKtor)] = obj;
        this.CatchingFishWorkManager = CatchingFishParcelableFAB() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            CatchingFishFragmentHandler();
            CatchingFishViewModelFAB(this.CatchingFishReduxKtor, CatchingFishLayout(CatchingFishParcelableFAB() + this.CatchingFishReduxKtor));
        }
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishWorkManager = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB();
        if (i < 0 || i >= CatchingFishParcelableFAB) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, CatchingFishParcelableFAB, "index: ", ", size: "));
        }
        return this.CatchingFishDaggerWebsocket[CatchingFishLayout(this.CatchingFishReduxKtor + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int CatchingFishLayout = CatchingFishLayout(CatchingFishParcelableFAB() + this.CatchingFishReduxKtor);
        int i2 = this.CatchingFishReduxKtor;
        if (i2 < CatchingFishLayout) {
            while (i2 < CatchingFishLayout) {
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[i2])) {
                    i = this.CatchingFishReduxKtor;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < CatchingFishLayout) {
            return -1;
        }
        int length = this.CatchingFishDaggerWebsocket.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < CatchingFishLayout; i3++) {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[i3])) {
                        i2 = i3 + this.CatchingFishDaggerWebsocket.length;
                        i = this.CatchingFishReduxKtor;
                    }
                }
                return -1;
            }
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[i2])) {
                i = this.CatchingFishReduxKtor;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return CatchingFishParcelableFAB() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int CatchingFishLayout = CatchingFishLayout(this.CatchingFishWorkManager + this.CatchingFishReduxKtor);
        int i2 = this.CatchingFishReduxKtor;
        if (i2 < CatchingFishLayout) {
            length = CatchingFishLayout - 1;
            if (i2 <= length) {
                while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.CatchingFishReduxKtor;
                return length - i;
            }
            return -1;
        }
        if (i2 > CatchingFishLayout) {
            int i3 = CatchingFishLayout - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.CatchingFishDaggerWebsocket;
                    CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.CatchingFishReduxKtor;
                    if (i4 <= length) {
                        while (!CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.CatchingFishReduxKtor;
                    }
                } else {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, this.CatchingFishDaggerWebsocket[i3])) {
                        length = i3 + this.CatchingFishDaggerWebsocket.length;
                        i = this.CatchingFishReduxKtor;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        CatchingFishSnackbar(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int CatchingFishLayout;
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.CatchingFishDaggerWebsocket.length != 0) {
            int CatchingFishLayout2 = CatchingFishLayout(this.CatchingFishWorkManager + this.CatchingFishReduxKtor);
            int i = this.CatchingFishReduxKtor;
            if (i < CatchingFishLayout2) {
                CatchingFishLayout = i;
                while (i < CatchingFishLayout2) {
                    Object obj = this.CatchingFishDaggerWebsocket[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.CatchingFishDaggerWebsocket[CatchingFishLayout] = obj;
                        CatchingFishLayout++;
                    }
                    i++;
                }
                CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishDaggerWebsocket, CatchingFishLayout, CatchingFishLayout2);
            } else {
                int length = this.CatchingFishDaggerWebsocket.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.CatchingFishDaggerWebsocket;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.CatchingFishDaggerWebsocket[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                CatchingFishLayout = CatchingFishLayout(i2);
                for (int i3 = 0; i3 < CatchingFishLayout2; i3++) {
                    Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.CatchingFishDaggerWebsocket[CatchingFishLayout] = obj3;
                        CatchingFishLayout = CatchingFishWorkManager(CatchingFishLayout);
                    }
                }
                z = z2;
            }
            if (z) {
                CatchingFishFragmentHandler();
                this.CatchingFishWorkManager = CatchingFishViewModelScope(CatchingFishLayout - this.CatchingFishReduxKtor);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        CatchingFishFragmentHandler();
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        int i = this.CatchingFishReduxKtor;
        Object obj = objArr[i];
        objArr[i] = null;
        this.CatchingFishReduxKtor = CatchingFishWorkManager(i);
        this.CatchingFishWorkManager = CatchingFishParcelableFAB() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        CatchingFishFragmentHandler();
        int CatchingFishLayout = CatchingFishLayout(CatchingFishToastCustomView.CatchingFishMotionLayout(this) + this.CatchingFishReduxKtor);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj = objArr[CatchingFishLayout];
        objArr[CatchingFishLayout] = null;
        this.CatchingFishWorkManager = CatchingFishParcelableFAB() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        CatchingFishLayoutRoomFAB.CatchingFishUnitTesting(i, i2, this.CatchingFishWorkManager);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.CatchingFishWorkManager) {
            clear();
            return;
        }
        if (i3 == 1) {
            CatchingFishSnackbar(i);
            return;
        }
        CatchingFishFragmentHandler();
        if (i < this.CatchingFishWorkManager - i2) {
            int CatchingFishLayout = CatchingFishLayout((i - 1) + this.CatchingFishReduxKtor);
            int CatchingFishLayout2 = CatchingFishLayout((i2 - 1) + this.CatchingFishReduxKtor);
            while (i > 0) {
                int i4 = CatchingFishLayout + 1;
                int min = Math.min(i, Math.min(i4, CatchingFishLayout2 + 1));
                Object[] objArr = this.CatchingFishDaggerWebsocket;
                int i5 = CatchingFishLayout2 - min;
                int i6 = CatchingFishLayout - min;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr, objArr, i5 + 1, i6 + 1, i4);
                CatchingFishLayout = CatchingFishViewModelScope(i6);
                CatchingFishLayout2 = CatchingFishViewModelScope(i5);
                i -= min;
            }
            int CatchingFishLayout3 = CatchingFishLayout(this.CatchingFishReduxKtor + i3);
            CatchingFishViewModelFAB(this.CatchingFishReduxKtor, CatchingFishLayout3);
            this.CatchingFishReduxKtor = CatchingFishLayout3;
        } else {
            int CatchingFishLayout4 = CatchingFishLayout(this.CatchingFishReduxKtor + i2);
            int CatchingFishLayout5 = CatchingFishLayout(this.CatchingFishReduxKtor + i);
            int i7 = this.CatchingFishWorkManager;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                i2 = Math.min(i7, Math.min(objArr2.length - CatchingFishLayout4, objArr2.length - CatchingFishLayout5));
                Object[] objArr3 = this.CatchingFishDaggerWebsocket;
                int i8 = CatchingFishLayout4 + i2;
                CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, objArr3, CatchingFishLayout5, CatchingFishLayout4, i8);
                CatchingFishLayout4 = CatchingFishLayout(i8);
                CatchingFishLayout5 = CatchingFishLayout(CatchingFishLayout5 + i2);
            }
            int CatchingFishLayout6 = CatchingFishLayout(this.CatchingFishWorkManager + this.CatchingFishReduxKtor);
            CatchingFishViewModelFAB(CatchingFishViewModelScope(CatchingFishLayout6 - i3), CatchingFishLayout6);
        }
        this.CatchingFishWorkManager -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int CatchingFishLayout;
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.CatchingFishDaggerWebsocket.length != 0) {
            int CatchingFishLayout2 = CatchingFishLayout(this.CatchingFishWorkManager + this.CatchingFishReduxKtor);
            int i = this.CatchingFishReduxKtor;
            if (i < CatchingFishLayout2) {
                CatchingFishLayout = i;
                while (i < CatchingFishLayout2) {
                    Object obj = this.CatchingFishDaggerWebsocket[i];
                    if (collection.contains(obj)) {
                        this.CatchingFishDaggerWebsocket[CatchingFishLayout] = obj;
                        CatchingFishLayout++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                CatchingFishMVVMHilt.CatchingFishAnimation(this.CatchingFishDaggerWebsocket, CatchingFishLayout, CatchingFishLayout2);
            } else {
                int length = this.CatchingFishDaggerWebsocket.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.CatchingFishDaggerWebsocket;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.CatchingFishDaggerWebsocket[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                CatchingFishLayout = CatchingFishLayout(i2);
                for (int i3 = 0; i3 < CatchingFishLayout2; i3++) {
                    Object[] objArr2 = this.CatchingFishDaggerWebsocket;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.CatchingFishDaggerWebsocket[CatchingFishLayout] = obj3;
                        CatchingFishLayout = CatchingFishWorkManager(CatchingFishLayout);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                CatchingFishFragmentHandler();
                this.CatchingFishWorkManager = CatchingFishViewModelScope(CatchingFishLayout - this.CatchingFishReduxKtor);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int CatchingFishParcelableFAB = CatchingFishParcelableFAB();
        if (i < 0 || i >= CatchingFishParcelableFAB) {
            throw new IndexOutOfBoundsException(CatchingFishMVPLiveData.CatchingFishFragmentHandler(i, CatchingFishParcelableFAB, "index: ", ", size: "));
        }
        int CatchingFishLayout = CatchingFishLayout(this.CatchingFishReduxKtor + i);
        Object[] objArr = this.CatchingFishDaggerWebsocket;
        Object obj2 = objArr[CatchingFishLayout];
        objArr[CatchingFishLayout] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[CatchingFishParcelableFAB()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(objArr, "array");
        int length = objArr.length;
        int i = this.CatchingFishWorkManager;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int CatchingFishLayout = CatchingFishLayout(this.CatchingFishWorkManager + this.CatchingFishReduxKtor);
        int i2 = this.CatchingFishReduxKtor;
        if (i2 < CatchingFishLayout) {
            CatchingFishMVVMHilt.CatchingFishStateFlow(this.CatchingFishDaggerWebsocket, objArr, i2, CatchingFishLayout, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr2, objArr, 0, this.CatchingFishReduxKtor, objArr2.length);
            Object[] objArr3 = this.CatchingFishDaggerWebsocket;
            CatchingFishMVVMHilt.CatchingFishAppCompat(objArr3, objArr, objArr3.length - this.CatchingFishReduxKtor, 0, CatchingFishLayout);
        }
        int i3 = this.CatchingFishWorkManager;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        CatchingFishFragmentHandler();
        CatchingFishDaggerWebsocket(collection.size() + CatchingFishParcelableFAB());
        CatchingFishCoroutine(CatchingFishLayout(CatchingFishParcelableFAB() + this.CatchingFishReduxKtor), collection);
        return true;
    }
}
