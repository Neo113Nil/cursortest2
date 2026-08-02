package v7;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC5128c;

/* renamed from: v7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5117h extends AbstractC5114e {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f41216w = new Object[0];

    /* renamed from: n, reason: collision with root package name */
    public int f41217n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f41218u = f41216w;

    /* renamed from: v, reason: collision with root package name */
    public int f41219v;

    @Override // v7.AbstractC5114e
    public final int a() {
        return this.f41219v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        int i6 = this.f41219v;
        if (i < 0 || i > i6) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i6, "index: ", ", size: "));
        }
        if (i == i6) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        e(this.f41219v + 1);
        int i9 = i(this.f41217n + i);
        int i10 = this.f41219v;
        if (i < ((i10 + 1) >> 1)) {
            if (i9 == 0) {
                Object[] objArr = this.f41218u;
                kotlin.jvm.internal.h.e(objArr, "<this>");
                i9 = objArr.length;
            }
            int i11 = i9 - 1;
            int i12 = this.f41217n;
            if (i12 == 0) {
                Object[] objArr2 = this.f41218u;
                kotlin.jvm.internal.h.e(objArr2, "<this>");
                i4 = objArr2.length - 1;
            } else {
                i4 = i12 - 1;
            }
            int i13 = this.f41217n;
            if (i11 >= i13) {
                Object[] objArr3 = this.f41218u;
                objArr3[i4] = objArr3[i13];
                AbstractC5118i.u(i13, i13 + 1, i11 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f41218u;
                AbstractC5118i.u(i13 - 1, i13, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f41218u;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC5118i.u(0, 1, i11 + 1, objArr5, objArr5);
            }
            this.f41218u[i11] = obj;
            this.f41217n = i4;
        } else {
            int i14 = i(i10 + this.f41217n);
            if (i9 < i14) {
                Object[] objArr6 = this.f41218u;
                AbstractC5118i.u(i9 + 1, i9, i14, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f41218u;
                AbstractC5118i.u(1, 0, i14, objArr7, objArr7);
                Object[] objArr8 = this.f41218u;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC5118i.u(i9 + 1, i9, objArr8.length - 1, objArr8, objArr8);
            }
            this.f41218u[i9] = obj;
        }
        this.f41219v++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        int i4 = this.f41219v;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f41219v) {
            return addAll(elements);
        }
        j();
        e(elements.size() + this.f41219v);
        int i6 = i(this.f41219v + this.f41217n);
        int i9 = i(this.f41217n + i);
        int size = elements.size();
        if (i >= ((this.f41219v + 1) >> 1)) {
            int i10 = i9 + size;
            if (i9 < i6) {
                int i11 = size + i6;
                Object[] objArr = this.f41218u;
                if (i11 <= objArr.length) {
                    AbstractC5118i.u(i10, i9, i6, objArr, objArr);
                } else if (i10 >= objArr.length) {
                    AbstractC5118i.u(i10 - objArr.length, i9, i6, objArr, objArr);
                } else {
                    int length = i6 - (i11 - objArr.length);
                    AbstractC5118i.u(0, length, i6, objArr, objArr);
                    Object[] objArr2 = this.f41218u;
                    AbstractC5118i.u(i10, i9, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f41218u;
                AbstractC5118i.u(size, 0, i6, objArr3, objArr3);
                Object[] objArr4 = this.f41218u;
                if (i10 >= objArr4.length) {
                    AbstractC5118i.u(i10 - objArr4.length, i9, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC5118i.u(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f41218u;
                    AbstractC5118i.u(i10, i9, objArr5.length - size, objArr5, objArr5);
                }
            }
            d(i9, elements);
            return true;
        }
        int i12 = this.f41217n;
        int i13 = i12 - size;
        if (i9 < i12) {
            Object[] objArr6 = this.f41218u;
            AbstractC5118i.u(i13, i12, objArr6.length, objArr6, objArr6);
            if (size >= i9) {
                Object[] objArr7 = this.f41218u;
                AbstractC5118i.u(objArr7.length - size, 0, i9, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f41218u;
                AbstractC5118i.u(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f41218u;
                AbstractC5118i.u(0, size, i9, objArr9, objArr9);
            }
        } else if (i13 >= 0) {
            Object[] objArr10 = this.f41218u;
            AbstractC5118i.u(i13, i12, i9, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f41218u;
            i13 += objArr11.length;
            int i14 = i9 - i12;
            int length2 = objArr11.length - i13;
            if (length2 >= i14) {
                AbstractC5118i.u(i13, i12, i9, objArr11, objArr11);
            } else {
                AbstractC5118i.u(i13, i12, i12 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f41218u;
                AbstractC5118i.u(0, this.f41217n + length2, i9, objArr12, objArr12);
            }
        }
        this.f41217n = i13;
        d(g(i9 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(this.f41219v + 1);
        int i = this.f41217n;
        if (i == 0) {
            Object[] objArr = this.f41218u;
            kotlin.jvm.internal.h.e(objArr, "<this>");
            i = objArr.length;
        }
        int i4 = i - 1;
        this.f41217n = i4;
        this.f41218u[i4] = obj;
        this.f41219v++;
    }

    public final void addLast(Object obj) {
        j();
        e(a() + 1);
        this.f41218u[i(a() + this.f41217n)] = obj;
        this.f41219v = a() + 1;
    }

    @Override // v7.AbstractC5114e
    public final Object c(int i) {
        int i4 = this.f41219v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, i4, "index: ", ", size: "));
        }
        if (i == AbstractC5120k.s(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i6 = i(this.f41217n + i);
        Object[] objArr = this.f41218u;
        Object obj = objArr[i6];
        if (i < (this.f41219v >> 1)) {
            int i9 = this.f41217n;
            if (i6 >= i9) {
                AbstractC5118i.u(i9 + 1, i9, i6, objArr, objArr);
            } else {
                AbstractC5118i.u(1, 0, i6, objArr, objArr);
                Object[] objArr2 = this.f41218u;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f41217n;
                AbstractC5118i.u(i10 + 1, i10, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f41218u;
            int i11 = this.f41217n;
            objArr3[i11] = null;
            this.f41217n = f(i11);
        } else {
            int i12 = i(AbstractC5120k.s(this) + this.f41217n);
            if (i6 <= i12) {
                Object[] objArr4 = this.f41218u;
                AbstractC5118i.u(i6, i6 + 1, i12 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f41218u;
                AbstractC5118i.u(i6, i6 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f41218u;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC5118i.u(0, 1, i12 + 1, objArr6, objArr6);
            }
            this.f41218u[i12] = null;
        }
        this.f41219v--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f41217n, i(a() + this.f41217n));
        }
        this.f41217n = 0;
        this.f41219v = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f41218u.length;
        while (i < length && it.hasNext()) {
            this.f41218u[i] = it.next();
            i++;
        }
        int i4 = this.f41217n;
        for (int i6 = 0; i6 < i4 && it.hasNext(); i6++) {
            this.f41218u[i6] = it.next();
        }
        this.f41219v = collection.size() + this.f41219v;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f41218u;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f41216w) {
            if (i < 10) {
                i = 10;
            }
            this.f41218u = new Object[i];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i < 0) {
            i4 = i;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        AbstractC5118i.u(0, this.f41217n, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f41218u;
        int length2 = objArr3.length;
        int i6 = this.f41217n;
        AbstractC5118i.u(length2 - i6, 0, i6, objArr3, objArr2);
        this.f41217n = 0;
        this.f41218u = objArr2;
    }

    public final int f(int i) {
        kotlin.jvm.internal.h.e(this.f41218u, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int g(int i) {
        return i < 0 ? i + this.f41218u.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a9 = a();
        if (i < 0 || i >= a9) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, a9, "index: ", ", size: "));
        }
        return this.f41218u[i(this.f41217n + i)];
    }

    public final void h(int i, int i4) {
        if (i < i4) {
            AbstractC5118i.y(this.f41218u, i, i4);
            return;
        }
        Object[] objArr = this.f41218u;
        AbstractC5118i.y(objArr, i, objArr.length);
        AbstractC5118i.y(this.f41218u, 0, i4);
    }

    public final int i(int i) {
        Object[] objArr = this.f41218u;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i4 = i(a() + this.f41217n);
        int i6 = this.f41217n;
        if (i6 < i4) {
            while (i6 < i4) {
                if (kotlin.jvm.internal.h.a(obj, this.f41218u[i6])) {
                    i = this.f41217n;
                } else {
                    i6++;
                }
            }
            return -1;
        }
        if (i6 < i4) {
            return -1;
        }
        int length = this.f41218u.length;
        while (true) {
            if (i6 >= length) {
                for (int i9 = 0; i9 < i4; i9++) {
                    if (kotlin.jvm.internal.h.a(obj, this.f41218u[i9])) {
                        i6 = i9 + this.f41218u.length;
                        i = this.f41217n;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.h.a(obj, this.f41218u[i6])) {
                i = this.f41217n;
                break;
            }
            i6++;
        }
        return i6 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i4 = i(this.f41219v + this.f41217n);
        int i6 = this.f41217n;
        if (i6 < i4) {
            length = i4 - 1;
            if (i6 <= length) {
                while (!kotlin.jvm.internal.h.a(obj, this.f41218u[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i = this.f41217n;
                return length - i;
            }
            return -1;
        }
        if (i6 > i4) {
            int i9 = i4 - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f41218u;
                    kotlin.jvm.internal.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f41217n;
                    if (i10 <= length) {
                        while (!kotlin.jvm.internal.h.a(obj, this.f41218u[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i = this.f41217n;
                    }
                } else {
                    if (kotlin.jvm.internal.h.a(obj, this.f41218u[i9])) {
                        length = i9 + this.f41218u.length;
                        i = this.f41217n;
                        break;
                    }
                    i9--;
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
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int i;
        kotlin.jvm.internal.h.e(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f41218u.length != 0) {
            int i4 = i(this.f41219v + this.f41217n);
            int i6 = this.f41217n;
            if (i6 < i4) {
                i = i6;
                while (i6 < i4) {
                    Object obj = this.f41218u[i6];
                    if (elements.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f41218u[i] = obj;
                        i++;
                    }
                    i6++;
                }
                AbstractC5118i.y(this.f41218u, i, i4);
            } else {
                int length = this.f41218u.length;
                boolean z9 = false;
                int i9 = i6;
                while (i6 < length) {
                    Object[] objArr = this.f41218u;
                    Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (elements.contains(obj2)) {
                        z9 = true;
                    } else {
                        this.f41218u[i9] = obj2;
                        i9++;
                    }
                    i6++;
                }
                i = i(i9);
                for (int i10 = 0; i10 < i4; i10++) {
                    Object[] objArr2 = this.f41218u;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        z9 = true;
                    } else {
                        this.f41218u[i] = obj3;
                        i = f(i);
                    }
                }
                z6 = z9;
            }
            if (z6) {
                j();
                this.f41219v = g(i - this.f41217n);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f41218u;
        int i = this.f41217n;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f41217n = f(i);
        this.f41219v = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i(AbstractC5120k.s(this) + this.f41217n);
        Object[] objArr = this.f41218u;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f41219v = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        S0.f.c(i, i4, this.f41219v);
        int i6 = i4 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f41219v) {
            clear();
            return;
        }
        if (i6 == 1) {
            c(i);
            return;
        }
        j();
        if (i < this.f41219v - i4) {
            int i9 = i(this.f41217n + (i - 1));
            int i10 = i(this.f41217n + (i4 - 1));
            while (i > 0) {
                int i11 = i9 + 1;
                int min = Math.min(i, Math.min(i11, i10 + 1));
                Object[] objArr = this.f41218u;
                int i12 = i10 - min;
                int i13 = i9 - min;
                AbstractC5118i.u(i12 + 1, i13 + 1, i11, objArr, objArr);
                i9 = g(i13);
                i10 = g(i12);
                i -= min;
            }
            int i14 = i(this.f41217n + i6);
            h(this.f41217n, i14);
            this.f41217n = i14;
        } else {
            int i15 = i(this.f41217n + i4);
            int i16 = i(this.f41217n + i);
            int i17 = this.f41219v;
            while (true) {
                i17 -= i4;
                if (i17 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f41218u;
                i4 = Math.min(i17, Math.min(objArr2.length - i15, objArr2.length - i16));
                Object[] objArr3 = this.f41218u;
                int i18 = i15 + i4;
                AbstractC5118i.u(i16, i15, i18, objArr3, objArr3);
                i15 = i(i18);
                i16 = i(i16 + i4);
            }
            int i19 = i(this.f41219v + this.f41217n);
            h(g(i19 - i6), i19);
        }
        this.f41219v -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i;
        kotlin.jvm.internal.h.e(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f41218u.length != 0) {
            int i4 = i(this.f41219v + this.f41217n);
            int i6 = this.f41217n;
            if (i6 < i4) {
                i = i6;
                while (i6 < i4) {
                    Object obj = this.f41218u[i6];
                    if (elements.contains(obj)) {
                        this.f41218u[i] = obj;
                        i++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                AbstractC5118i.y(this.f41218u, i, i4);
            } else {
                int length = this.f41218u.length;
                boolean z9 = false;
                int i9 = i6;
                while (i6 < length) {
                    Object[] objArr = this.f41218u;
                    Object obj2 = objArr[i6];
                    objArr[i6] = null;
                    if (elements.contains(obj2)) {
                        this.f41218u[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i6++;
                }
                i = i(i9);
                for (int i10 = 0; i10 < i4; i10++) {
                    Object[] objArr2 = this.f41218u;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f41218u[i] = obj3;
                        i = f(i);
                    } else {
                        z9 = true;
                    }
                }
                z6 = z9;
            }
            if (z6) {
                j();
                this.f41219v = g(i - this.f41217n);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a9 = a();
        if (i < 0 || i >= a9) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, a9, "index: ", ", size: "));
        }
        int i4 = i(this.f41217n + i);
        Object[] objArr = this.f41218u;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i = this.f41219v;
        if (length < i) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int i4 = i(this.f41219v + this.f41217n);
        int i6 = this.f41217n;
        if (i6 < i4) {
            AbstractC5118i.u(0, i6, i4, this.f41218u, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f41218u;
            AbstractC5118i.u(0, this.f41217n, objArr.length, objArr, array);
            Object[] objArr2 = this.f41218u;
            AbstractC5118i.u(objArr2.length - this.f41217n, 0, i4, objArr2, array);
        }
        int i9 = this.f41219v;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        j();
        e(elements.size() + a());
        d(i(a() + this.f41217n), elements);
        return true;
    }
}
