package com.gamericefishpro.space.ph;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends k {
    public static final q v = new q(null);
    public static final Object[] w = new Object[0];
    public int d;
    public Object[] e;
    public int i;

    public r() {
        this.e = w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p();
        f(elements.size() + b());
        d(o(b() + this.d), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        f(this.i + 1);
        int length = this.d;
        if (length == 0) {
            Object[] objArr = this.e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.d = i;
        this.e[i] = obj;
        this.i++;
    }

    public final void addLast(Object obj) {
        p();
        f(b() + 1);
        this.e[o(b() + this.d)] = obj;
        this.i = b() + 1;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final int b() {
        return this.i;
    }

    @Override // com.gamericefishpro.space.ph.k
    public final Object c(int i) {
        c cVar = f.d;
        int i2 = this.i;
        cVar.getClass();
        c.a(i, i2);
        if (i == x.e(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int iO = o(this.d + i);
        Object[] objArr = this.e;
        Object obj = objArr[iO];
        if (i < (this.i >> 1)) {
            int i3 = this.d;
            if (iO >= i3) {
                u.d(i3 + 1, i3, iO, objArr, objArr);
            } else {
                u.d(1, 0, iO, objArr, objArr);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.d;
                u.d(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.e;
            int i5 = this.d;
            objArr3[i5] = null;
            this.d = i(i5);
        } else {
            int iO2 = o(x.e(this) + this.d);
            if (iO <= iO2) {
                Object[] objArr4 = this.e;
                u.d(iO, iO + 1, iO2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.e;
                u.d(iO, iO + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.e;
                objArr6[objArr6.length - 1] = objArr6[0];
                u.d(0, 1, iO2 + 1, objArr6, objArr6);
            }
            this.e[iO2] = null;
        }
        this.i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.d, o(b() + this.d));
        }
        this.d = 0;
        this.i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i < length && it.hasNext()) {
            this.e[i] = it.next();
            i++;
        }
        int i2 = this.d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.e[i3] = it.next();
        }
        this.i = collection.size() + this.i;
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == w) {
            if (i < 10) {
                i = 10;
            }
            this.e = new Object[i];
            return;
        }
        c cVar = f.d;
        int length = objArr.length;
        cVar.getClass();
        Object[] objArr2 = new Object[c.d(length, i)];
        Object[] objArr3 = this.e;
        u.d(0, this.d, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.e;
        int length2 = objArr4.length;
        int i2 = this.d;
        u.d(length2 - i2, 0, i2, objArr4, objArr2);
        this.d = 0;
        this.e = objArr2;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[this.d];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c cVar = f.d;
        int i2 = this.i;
        cVar.getClass();
        c.a(i, i2);
        return this.e[o(this.d + i)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.e[this.d];
    }

    public final int i(int i) {
        Object[] objArr = this.e;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iO = o(b() + this.d);
        int length = this.d;
        if (length < iO) {
            while (length < iO) {
                if (Intrinsics.a(obj, this.e[length])) {
                    i = this.d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO) {
            return -1;
        }
        int length2 = this.e.length;
        while (length < length2) {
            if (Intrinsics.a(obj, this.e[length])) {
                i = this.d;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (Intrinsics.a(obj, this.e[i2])) {
                length = i2 + this.e.length;
                i = this.d;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.e[o(x.e(this) + this.d)];
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[o(x.e(this) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iO = o(this.i + this.d);
        int i2 = this.d;
        if (i2 < iO) {
            length = iO - 1;
            if (i2 <= length) {
                while (!Intrinsics.a(obj, this.e[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.d;
                return length - i;
            }
            return -1;
        }
        if (i2 > iO) {
            for (int i3 = iO - 1; -1 < i3; i3--) {
                if (Intrinsics.a(obj, this.e[i3])) {
                    length = i3 + this.e.length;
                    i = this.d;
                    return length - i;
                }
            }
            Object[] objArr = this.e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length - 1;
            int i4 = this.d;
            if (i4 <= length) {
                while (!Intrinsics.a(obj, this.e[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.d;
                return length - i;
            }
        }
        return -1;
    }

    public final int m(int i) {
        return i < 0 ? i + this.e.length : i;
    }

    public final void n(int i, int i2) {
        if (i < i2) {
            u.i(i, i2, null, this.e);
            return;
        }
        Object[] objArr = this.e;
        u.i(i, objArr.length, null, objArr);
        u.i(0, i2, null, this.e);
    }

    public final int o(int i) {
        Object[] objArr = this.e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iO2 = o(b() + this.d);
            int i = this.d;
            if (i < iO2) {
                iO = i;
                while (i < iO2) {
                    Object obj = this.e[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.e[iO] = obj;
                        iO++;
                    }
                    i++;
                }
                u.i(iO, iO2, null, this.e);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[iO] = obj3;
                        iO = i(iO);
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.i = m(iO - this.d);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        Object[] objArr = this.e;
        int i = this.d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.d = i(i);
        this.i = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        p();
        int iO = o(x.e(this) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.i = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        c cVar = f.d;
        int i3 = this.i;
        cVar.getClass();
        c.c(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.i) {
            clear();
            return;
        }
        if (i4 == 1) {
            c(i);
            return;
        }
        p();
        if (i < this.i - i2) {
            int iO = o((i - 1) + this.d);
            int iO2 = o((i2 - 1) + this.d);
            while (i > 0) {
                int i5 = iO + 1;
                int iMin = Math.min(i, Math.min(i5, iO2 + 1));
                Object[] objArr = this.e;
                int i6 = iO2 - iMin;
                int i7 = iO - iMin;
                u.d(i6 + 1, i7 + 1, i5, objArr, objArr);
                iO = m(i7);
                iO2 = m(i6);
                i -= iMin;
            }
            int iO3 = o(this.d + i4);
            n(this.d, iO3);
            this.d = iO3;
        } else {
            int iO4 = o(this.d + i2);
            int iO5 = o(this.d + i);
            int i8 = this.i;
            while (true) {
                i8 -= i2;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i2 = Math.min(i8, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.e;
                int i9 = iO4 + i2;
                u.d(iO5, iO4, i9, objArr3, objArr3);
                iO4 = o(i9);
                iO5 = o(iO5 + i2);
            }
            int iO6 = o(this.i + this.d);
            n(m(iO6 - i4), iO6);
        }
        this.i -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int iO2 = o(b() + this.d);
            int i = this.d;
            if (i < iO2) {
                iO = i;
                while (i < iO2) {
                    Object obj = this.e[i];
                    if (elements.contains(obj)) {
                        this.e[iO] = obj;
                        iO++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                u.i(iO, iO2, null, this.e);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.e[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr2 = this.e;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.e[iO] = obj3;
                        iO = i(iO);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.i = m(iO - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c cVar = f.d;
        int i2 = this.i;
        cVar.getClass();
        c.a(i, i2);
        int iO = o(this.d + i);
        Object[] objArr = this.e;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        c cVar = f.d;
        int i2 = this.i;
        cVar.getClass();
        c.b(i, i2);
        if (i == this.i) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        f(this.i + 1);
        int iO = o(this.d + i);
        int i3 = this.i;
        if (i < ((i3 + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.e;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                iO = objArr.length;
            }
            int i4 = iO - 1;
            int i5 = this.d;
            if (i5 == 0) {
                Object[] objArr2 = this.e;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.d;
            if (i4 >= i6) {
                Object[] objArr3 = this.e;
                objArr3[length] = objArr3[i6];
                u.d(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.e;
                u.d(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                u.d(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.e[i4] = obj;
            this.d = length;
        } else {
            int iO2 = o(i3 + this.d);
            if (iO < iO2) {
                Object[] objArr6 = this.e;
                u.d(iO + 1, iO, iO2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.e;
                u.d(1, 0, iO2, objArr7, objArr7);
                Object[] objArr8 = this.e;
                objArr8[0] = objArr8[objArr8.length - 1];
                u.d(iO + 1, iO, objArr8.length - 1, objArr8, objArr8);
            }
            this.e[iO] = obj;
        }
        this.i++;
    }

    public r(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = w;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Illegal Capacity: "));
        }
        this.e = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.i;
        if (length < i) {
            Intrinsics.checkNotNullParameter(array, "reference");
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iO = o(this.i + this.d);
        int i2 = this.d;
        if (i2 < iO) {
            u.g(i2, iO, 2, this.e, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.e;
            u.d(0, this.d, objArr.length, objArr, array);
            Object[] objArr2 = this.e;
            u.d(objArr2.length - this.d, 0, iO, objArr2, array);
        }
        int i3 = this.i;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        c cVar = f.d;
        int i2 = this.i;
        cVar.getClass();
        c.b(i, i2);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.i) {
            return addAll(elements);
        }
        p();
        f(elements.size() + this.i);
        int iO = o(this.i + this.d);
        int iO2 = o(this.d + i);
        int size = elements.size();
        if (i < ((this.i + 1) >> 1)) {
            int i3 = this.d;
            int length = i3 - size;
            if (iO2 < i3) {
                Object[] objArr = this.e;
                u.d(length, i3, objArr.length, objArr, objArr);
                if (size >= iO2) {
                    Object[] objArr2 = this.e;
                    u.d(objArr2.length - size, 0, iO2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.e;
                    u.d(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.e;
                    u.d(0, size, iO2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.e;
                u.d(length, i3, iO2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.e;
                length += objArr6.length;
                int i4 = iO2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    u.d(length, i3, iO2, objArr6, objArr6);
                } else {
                    u.d(length, i3, i3 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.e;
                    u.d(0, this.d + length2, iO2, objArr7, objArr7);
                }
            }
            this.d = length;
            d(m(iO2 - size), elements);
            return true;
        }
        int i5 = iO2 + size;
        if (iO2 < iO) {
            int i6 = size + iO;
            Object[] objArr8 = this.e;
            if (i6 <= objArr8.length) {
                u.d(i5, iO2, iO, objArr8, objArr8);
            } else if (i5 >= objArr8.length) {
                u.d(i5 - objArr8.length, iO2, iO, objArr8, objArr8);
            } else {
                int length3 = iO - (i6 - objArr8.length);
                u.d(0, length3, iO, objArr8, objArr8);
                Object[] objArr9 = this.e;
                u.d(i5, iO2, length3, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.e;
            u.d(size, 0, iO, objArr10, objArr10);
            Object[] objArr11 = this.e;
            if (i5 >= objArr11.length) {
                u.d(i5 - objArr11.length, iO2, objArr11.length, objArr11, objArr11);
            } else {
                u.d(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.e;
                u.d(i5, iO2, objArr12.length - size, objArr12, objArr12);
            }
        }
        d(iO2, elements);
        return true;
    }

    public r(p0 elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = new Object[0];
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] objArrC = com.gamericefishpro.space.ei.k.c(elements, array);
        this.e = objArrC;
        this.i = objArrC.length;
        if (objArrC.length == 0) {
            this.e = w;
        }
    }
}
