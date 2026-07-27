package v7;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5127h extends AbstractC5124e {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f41434w = new Object[0];

    /* renamed from: n, reason: collision with root package name */
    public int f41435n;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f41436u = f41434w;

    /* renamed from: v, reason: collision with root package name */
    public int f41437v;

    @Override // v7.AbstractC5124e
    public final int a() {
        return this.f41437v;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i6;
        int i9 = this.f41437v;
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i9, "index: ", ", size: "));
        }
        if (i == i9) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        e(this.f41437v + 1);
        int i10 = i(this.f41435n + i);
        int i11 = this.f41437v;
        if (i < ((i11 + 1) >> 1)) {
            if (i10 == 0) {
                Object[] objArr = this.f41436u;
                kotlin.jvm.internal.h.e(objArr, "<this>");
                i10 = objArr.length;
            }
            int i12 = i10 - 1;
            int i13 = this.f41435n;
            if (i13 == 0) {
                Object[] objArr2 = this.f41436u;
                kotlin.jvm.internal.h.e(objArr2, "<this>");
                i6 = objArr2.length - 1;
            } else {
                i6 = i13 - 1;
            }
            int i14 = this.f41435n;
            if (i12 >= i14) {
                Object[] objArr3 = this.f41436u;
                objArr3[i6] = objArr3[i14];
                AbstractC5128i.r(i14, i14 + 1, i12 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f41436u;
                AbstractC5128i.r(i14 - 1, i14, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f41436u;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC5128i.r(0, 1, i12 + 1, objArr5, objArr5);
            }
            this.f41436u[i12] = obj;
            this.f41435n = i6;
        } else {
            int i15 = i(i11 + this.f41435n);
            if (i10 < i15) {
                Object[] objArr6 = this.f41436u;
                AbstractC5128i.r(i10 + 1, i10, i15, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f41436u;
                AbstractC5128i.r(1, 0, i15, objArr7, objArr7);
                Object[] objArr8 = this.f41436u;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC5128i.r(i10 + 1, i10, objArr8.length - 1, objArr8, objArr8);
            }
            this.f41436u[i10] = obj;
        }
        this.f41437v++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        int i6 = this.f41437v;
        if (i < 0 || i > i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f41437v) {
            return addAll(elements);
        }
        j();
        e(elements.size() + this.f41437v);
        int i9 = i(this.f41437v + this.f41435n);
        int i10 = i(this.f41435n + i);
        int size = elements.size();
        if (i >= ((this.f41437v + 1) >> 1)) {
            int i11 = i10 + size;
            if (i10 < i9) {
                int i12 = size + i9;
                Object[] objArr = this.f41436u;
                if (i12 <= objArr.length) {
                    AbstractC5128i.r(i11, i10, i9, objArr, objArr);
                } else if (i11 >= objArr.length) {
                    AbstractC5128i.r(i11 - objArr.length, i10, i9, objArr, objArr);
                } else {
                    int length = i9 - (i12 - objArr.length);
                    AbstractC5128i.r(0, length, i9, objArr, objArr);
                    Object[] objArr2 = this.f41436u;
                    AbstractC5128i.r(i11, i10, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f41436u;
                AbstractC5128i.r(size, 0, i9, objArr3, objArr3);
                Object[] objArr4 = this.f41436u;
                if (i11 >= objArr4.length) {
                    AbstractC5128i.r(i11 - objArr4.length, i10, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC5128i.r(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f41436u;
                    AbstractC5128i.r(i11, i10, objArr5.length - size, objArr5, objArr5);
                }
            }
            d(i10, elements);
            return true;
        }
        int i13 = this.f41435n;
        int i14 = i13 - size;
        if (i10 < i13) {
            Object[] objArr6 = this.f41436u;
            AbstractC5128i.r(i14, i13, objArr6.length, objArr6, objArr6);
            if (size >= i10) {
                Object[] objArr7 = this.f41436u;
                AbstractC5128i.r(objArr7.length - size, 0, i10, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f41436u;
                AbstractC5128i.r(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f41436u;
                AbstractC5128i.r(0, size, i10, objArr9, objArr9);
            }
        } else if (i14 >= 0) {
            Object[] objArr10 = this.f41436u;
            AbstractC5128i.r(i14, i13, i10, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f41436u;
            i14 += objArr11.length;
            int i15 = i10 - i13;
            int length2 = objArr11.length - i14;
            if (length2 >= i15) {
                AbstractC5128i.r(i14, i13, i10, objArr11, objArr11);
            } else {
                AbstractC5128i.r(i14, i13, i13 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f41436u;
                AbstractC5128i.r(0, this.f41435n + length2, i10, objArr12, objArr12);
            }
        }
        this.f41435n = i14;
        d(g(i10 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(this.f41437v + 1);
        int i = this.f41435n;
        if (i == 0) {
            Object[] objArr = this.f41436u;
            kotlin.jvm.internal.h.e(objArr, "<this>");
            i = objArr.length;
        }
        int i6 = i - 1;
        this.f41435n = i6;
        this.f41436u[i6] = obj;
        this.f41437v++;
    }

    public final void addLast(Object obj) {
        j();
        e(a() + 1);
        this.f41436u[i(a() + this.f41435n)] = obj;
        this.f41437v = a() + 1;
    }

    @Override // v7.AbstractC5124e
    public final Object c(int i) {
        int i6 = this.f41437v;
        if (i < 0 || i >= i6) {
            throw new IndexOutOfBoundsException(u1.h.c(i, i6, "index: ", ", size: "));
        }
        if (i == AbstractC5130k.u(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i9 = i(this.f41435n + i);
        Object[] objArr = this.f41436u;
        Object obj = objArr[i9];
        if (i < (this.f41437v >> 1)) {
            int i10 = this.f41435n;
            if (i9 >= i10) {
                AbstractC5128i.r(i10 + 1, i10, i9, objArr, objArr);
            } else {
                AbstractC5128i.r(1, 0, i9, objArr, objArr);
                Object[] objArr2 = this.f41436u;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i11 = this.f41435n;
                AbstractC5128i.r(i11 + 1, i11, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f41436u;
            int i12 = this.f41435n;
            objArr3[i12] = null;
            this.f41435n = f(i12);
        } else {
            int i13 = i(AbstractC5130k.u(this) + this.f41435n);
            if (i9 <= i13) {
                Object[] objArr4 = this.f41436u;
                AbstractC5128i.r(i9, i9 + 1, i13 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f41436u;
                AbstractC5128i.r(i9, i9 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f41436u;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC5128i.r(0, 1, i13 + 1, objArr6, objArr6);
            }
            this.f41436u[i13] = null;
        }
        this.f41437v--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f41435n, i(a() + this.f41435n));
        }
        this.f41435n = 0;
        this.f41437v = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f41436u.length;
        while (i < length && it.hasNext()) {
            this.f41436u[i] = it.next();
            i++;
        }
        int i6 = this.f41435n;
        for (int i9 = 0; i9 < i6 && it.hasNext(); i9++) {
            this.f41436u[i9] = it.next();
        }
        this.f41437v = collection.size() + this.f41437v;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f41436u;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f41434w) {
            if (i < 10) {
                i = 10;
            }
            this.f41436u = new Object[i];
            return;
        }
        int length = objArr.length;
        int i6 = length + (length >> 1);
        if (i6 - i < 0) {
            i6 = i;
        }
        if (i6 - 2147483639 > 0) {
            i6 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i6];
        AbstractC5128i.r(0, this.f41435n, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f41436u;
        int length2 = objArr3.length;
        int i9 = this.f41435n;
        AbstractC5128i.r(length2 - i9, 0, i9, objArr3, objArr2);
        this.f41435n = 0;
        this.f41436u = objArr2;
    }

    public final int f(int i) {
        kotlin.jvm.internal.h.e(this.f41436u, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int g(int i) {
        return i < 0 ? i + this.f41436u.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a9 = a();
        if (i < 0 || i >= a9) {
            throw new IndexOutOfBoundsException(u1.h.c(i, a9, "index: ", ", size: "));
        }
        return this.f41436u[i(this.f41435n + i)];
    }

    public final void h(int i, int i6) {
        if (i < i6) {
            AbstractC5128i.v(this.f41436u, i, i6);
            return;
        }
        Object[] objArr = this.f41436u;
        AbstractC5128i.v(objArr, i, objArr.length);
        AbstractC5128i.v(this.f41436u, 0, i6);
    }

    public final int i(int i) {
        Object[] objArr = this.f41436u;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i6 = i(a() + this.f41435n);
        int i9 = this.f41435n;
        if (i9 < i6) {
            while (i9 < i6) {
                if (kotlin.jvm.internal.h.a(obj, this.f41436u[i9])) {
                    i = this.f41435n;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 < i6) {
            return -1;
        }
        int length = this.f41436u.length;
        while (true) {
            if (i9 >= length) {
                for (int i10 = 0; i10 < i6; i10++) {
                    if (kotlin.jvm.internal.h.a(obj, this.f41436u[i10])) {
                        i9 = i10 + this.f41436u.length;
                        i = this.f41435n;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.h.a(obj, this.f41436u[i9])) {
                i = this.f41435n;
                break;
            }
            i9++;
        }
        return i9 - i;
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
        int i6 = i(this.f41437v + this.f41435n);
        int i9 = this.f41435n;
        if (i9 < i6) {
            length = i6 - 1;
            if (i9 <= length) {
                while (!kotlin.jvm.internal.h.a(obj, this.f41436u[length])) {
                    if (length != i9) {
                        length--;
                    }
                }
                i = this.f41435n;
                return length - i;
            }
            return -1;
        }
        if (i9 > i6) {
            int i10 = i6 - 1;
            while (true) {
                if (-1 >= i10) {
                    Object[] objArr = this.f41436u;
                    kotlin.jvm.internal.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i11 = this.f41435n;
                    if (i11 <= length) {
                        while (!kotlin.jvm.internal.h.a(obj, this.f41436u[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i = this.f41435n;
                    }
                } else {
                    if (kotlin.jvm.internal.h.a(obj, this.f41436u[i10])) {
                        length = i10 + this.f41436u.length;
                        i = this.f41435n;
                        break;
                    }
                    i10--;
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
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f41436u.length != 0) {
            int i6 = i(this.f41437v + this.f41435n);
            int i9 = this.f41435n;
            if (i9 < i6) {
                i = i9;
                while (i9 < i6) {
                    Object obj = this.f41436u[i9];
                    if (elements.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f41436u[i] = obj;
                        i++;
                    }
                    i9++;
                }
                AbstractC5128i.v(this.f41436u, i, i6);
            } else {
                int length = this.f41436u.length;
                boolean z6 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f41436u;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (elements.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.f41436u[i10] = obj2;
                        i10++;
                    }
                    i9++;
                }
                i = i(i10);
                for (int i11 = 0; i11 < i6; i11++) {
                    Object[] objArr2 = this.f41436u;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.f41436u[i] = obj3;
                        i = f(i);
                    }
                }
                z3 = z6;
            }
            if (z3) {
                j();
                this.f41437v = g(i - this.f41435n);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f41436u;
        int i = this.f41435n;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f41435n = f(i);
        this.f41437v = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i(AbstractC5130k.u(this) + this.f41435n);
        Object[] objArr = this.f41436u;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f41437v = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i6) {
        com.bumptech.glide.g.c(i, i6, this.f41437v);
        int i9 = i6 - i;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f41437v) {
            clear();
            return;
        }
        if (i9 == 1) {
            c(i);
            return;
        }
        j();
        if (i < this.f41437v - i6) {
            int i10 = i(this.f41435n + (i - 1));
            int i11 = i(this.f41435n + (i6 - 1));
            while (i > 0) {
                int i12 = i10 + 1;
                int min = Math.min(i, Math.min(i12, i11 + 1));
                Object[] objArr = this.f41436u;
                int i13 = i11 - min;
                int i14 = i10 - min;
                AbstractC5128i.r(i13 + 1, i14 + 1, i12, objArr, objArr);
                i10 = g(i14);
                i11 = g(i13);
                i -= min;
            }
            int i15 = i(this.f41435n + i9);
            h(this.f41435n, i15);
            this.f41435n = i15;
        } else {
            int i16 = i(this.f41435n + i6);
            int i17 = i(this.f41435n + i);
            int i18 = this.f41437v;
            while (true) {
                i18 -= i6;
                if (i18 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f41436u;
                i6 = Math.min(i18, Math.min(objArr2.length - i16, objArr2.length - i17));
                Object[] objArr3 = this.f41436u;
                int i19 = i16 + i6;
                AbstractC5128i.r(i17, i16, i19, objArr3, objArr3);
                i16 = i(i19);
                i17 = i(i17 + i6);
            }
            int i20 = i(this.f41437v + this.f41435n);
            h(g(i20 - i9), i20);
        }
        this.f41437v -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i;
        kotlin.jvm.internal.h.e(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f41436u.length != 0) {
            int i6 = i(this.f41437v + this.f41435n);
            int i9 = this.f41435n;
            if (i9 < i6) {
                i = i9;
                while (i9 < i6) {
                    Object obj = this.f41436u[i9];
                    if (elements.contains(obj)) {
                        this.f41436u[i] = obj;
                        i++;
                    } else {
                        z3 = true;
                    }
                    i9++;
                }
                AbstractC5128i.v(this.f41436u, i, i6);
            } else {
                int length = this.f41436u.length;
                boolean z6 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f41436u;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (elements.contains(obj2)) {
                        this.f41436u[i10] = obj2;
                        i10++;
                    } else {
                        z6 = true;
                    }
                    i9++;
                }
                i = i(i10);
                for (int i11 = 0; i11 < i6; i11++) {
                    Object[] objArr2 = this.f41436u;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f41436u[i] = obj3;
                        i = f(i);
                    } else {
                        z6 = true;
                    }
                }
                z3 = z6;
            }
            if (z3) {
                j();
                this.f41437v = g(i - this.f41435n);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a9 = a();
        if (i < 0 || i >= a9) {
            throw new IndexOutOfBoundsException(u1.h.c(i, a9, "index: ", ", size: "));
        }
        int i6 = i(this.f41435n + i);
        Object[] objArr = this.f41436u;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
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
        int i = this.f41437v;
        if (length < i) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int i6 = i(this.f41437v + this.f41435n);
        int i9 = this.f41435n;
        if (i9 < i6) {
            AbstractC5128i.r(0, i9, i6, this.f41436u, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f41436u;
            AbstractC5128i.r(0, this.f41435n, objArr.length, objArr, array);
            Object[] objArr2 = this.f41436u;
            AbstractC5128i.r(objArr2.length - this.f41435n, 0, i6, objArr2, array);
        }
        int i10 = this.f41437v;
        if (i10 < array.length) {
            array[i10] = null;
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
        d(i(a() + this.f41435n), elements);
        return true;
    }
}
