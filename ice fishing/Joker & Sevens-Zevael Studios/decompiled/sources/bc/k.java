package bc;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f1060j = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public int f1061g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f1062h = f1060j;

    /* renamed from: i, reason: collision with root package name */
    public int f1063i;

    @Override // bc.g
    public final int a() {
        return this.f1063i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int i12 = this.f1063i;
        if (i10 < 0 || i10 > i12) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i12, "index: ", ", size: "));
        }
        if (i10 == i12) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        j();
        e(this.f1063i + 1);
        int i13 = i(this.f1061g + i10);
        int i14 = this.f1063i;
        if (i10 < ((i14 + 1) >> 1)) {
            if (i13 == 0) {
                Object[] objArr = this.f1062h;
                pc.j.e(objArr, "<this>");
                i13 = objArr.length;
            }
            int i15 = i13 - 1;
            int i16 = this.f1061g;
            if (i16 == 0) {
                Object[] objArr2 = this.f1062h;
                pc.j.e(objArr2, "<this>");
                i11 = objArr2.length - 1;
            } else {
                i11 = i16 - 1;
            }
            int i17 = this.f1061g;
            if (i15 >= i17) {
                Object[] objArr3 = this.f1062h;
                objArr3[i11] = objArr3[i17];
                l.R(objArr3, objArr3, i17, i17 + 1, i15 + 1);
            } else {
                Object[] objArr4 = this.f1062h;
                l.R(objArr4, objArr4, i17 - 1, i17, objArr4.length);
                Object[] objArr5 = this.f1062h;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.R(objArr5, objArr5, 0, 1, i15 + 1);
            }
            this.f1062h[i15] = obj;
            this.f1061g = i11;
        } else {
            int i18 = i(i14 + this.f1061g);
            if (i13 < i18) {
                Object[] objArr6 = this.f1062h;
                l.R(objArr6, objArr6, i13 + 1, i13, i18);
            } else {
                Object[] objArr7 = this.f1062h;
                l.R(objArr7, objArr7, 1, 0, i18);
                Object[] objArr8 = this.f1062h;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.R(objArr8, objArr8, i13 + 1, i13, objArr8.length - 1);
            }
            this.f1062h[i13] = obj;
        }
        this.f1063i++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        pc.j.e(collection, "elements");
        int i11 = this.f1063i;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == this.f1063i) {
            return addAll(collection);
        }
        j();
        e(collection.size() + this.f1063i);
        int i12 = i(this.f1063i + this.f1061g);
        int i13 = i(this.f1061g + i10);
        int size = collection.size();
        if (i10 >= ((this.f1063i + 1) >> 1)) {
            int i14 = i13 + size;
            if (i13 < i12) {
                int i15 = size + i12;
                Object[] objArr = this.f1062h;
                if (i15 <= objArr.length) {
                    l.R(objArr, objArr, i14, i13, i12);
                } else if (i14 >= objArr.length) {
                    l.R(objArr, objArr, i14 - objArr.length, i13, i12);
                } else {
                    int length = i12 - (i15 - objArr.length);
                    l.R(objArr, objArr, 0, length, i12);
                    Object[] objArr2 = this.f1062h;
                    l.R(objArr2, objArr2, i14, i13, length);
                }
            } else {
                Object[] objArr3 = this.f1062h;
                l.R(objArr3, objArr3, size, 0, i12);
                Object[] objArr4 = this.f1062h;
                if (i14 >= objArr4.length) {
                    l.R(objArr4, objArr4, i14 - objArr4.length, i13, objArr4.length);
                } else {
                    l.R(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f1062h;
                    l.R(objArr5, objArr5, i14, i13, objArr5.length - size);
                }
            }
            d(i13, collection);
            return true;
        }
        int i16 = this.f1061g;
        int i17 = i16 - size;
        if (i13 < i16) {
            Object[] objArr6 = this.f1062h;
            l.R(objArr6, objArr6, i17, i16, objArr6.length);
            if (size >= i13) {
                Object[] objArr7 = this.f1062h;
                l.R(objArr7, objArr7, objArr7.length - size, 0, i13);
            } else {
                Object[] objArr8 = this.f1062h;
                l.R(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f1062h;
                l.R(objArr9, objArr9, 0, size, i13);
            }
        } else if (i17 >= 0) {
            Object[] objArr10 = this.f1062h;
            l.R(objArr10, objArr10, i17, i16, i13);
        } else {
            Object[] objArr11 = this.f1062h;
            i17 += objArr11.length;
            int i18 = i13 - i16;
            int length2 = objArr11.length - i17;
            if (length2 >= i18) {
                l.R(objArr11, objArr11, i17, i16, i13);
            } else {
                l.R(objArr11, objArr11, i17, i16, i16 + length2);
                Object[] objArr12 = this.f1062h;
                l.R(objArr12, objArr12, 0, this.f1061g + length2, i13);
            }
        }
        this.f1061g = i17;
        d(g(i13 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(this.f1063i + 1);
        int i10 = this.f1061g;
        if (i10 == 0) {
            Object[] objArr = this.f1062h;
            pc.j.e(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.f1061g = i11;
        this.f1062h[i11] = obj;
        this.f1063i++;
    }

    public final void addLast(Object obj) {
        j();
        e(a() + 1);
        this.f1062h[i(a() + this.f1061g)] = obj;
        this.f1063i = a() + 1;
    }

    @Override // bc.g
    public final Object b(int i10) {
        int i11 = this.f1063i;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        if (i10 == n.K(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        j();
        int i12 = i(this.f1061g + i10);
        Object[] objArr = this.f1062h;
        Object obj = objArr[i12];
        if (i10 < (this.f1063i >> 1)) {
            int i13 = this.f1061g;
            if (i12 >= i13) {
                l.R(objArr, objArr, i13 + 1, i13, i12);
            } else {
                l.R(objArr, objArr, 1, 0, i12);
                Object[] objArr2 = this.f1062h;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i14 = this.f1061g;
                l.R(objArr2, objArr2, i14 + 1, i14, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1062h;
            int i15 = this.f1061g;
            objArr3[i15] = null;
            this.f1061g = f(i15);
        } else {
            int i16 = i(n.K(this) + this.f1061g);
            if (i12 <= i16) {
                Object[] objArr4 = this.f1062h;
                l.R(objArr4, objArr4, i12, i12 + 1, i16 + 1);
            } else {
                Object[] objArr5 = this.f1062h;
                l.R(objArr5, objArr5, i12, i12 + 1, objArr5.length);
                Object[] objArr6 = this.f1062h;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.R(objArr6, objArr6, 0, 1, i16 + 1);
            }
            this.f1062h[i16] = null;
        }
        this.f1063i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f1061g, i(a() + this.f1061g));
        }
        this.f1061g = 0;
        this.f1063i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1062h.length;
        while (i10 < length && it.hasNext()) {
            this.f1062h[i10] = it.next();
            i10++;
        }
        int i11 = this.f1061g;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f1062h[i12] = it.next();
        }
        this.f1063i = collection.size() + this.f1063i;
    }

    public final void e(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1062h;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f1060j) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f1062h = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        l.R(objArr, objArr2, 0, this.f1061g, objArr.length);
        Object[] objArr3 = this.f1062h;
        int length2 = objArr3.length;
        int i12 = this.f1061g;
        l.R(objArr3, objArr2, length2 - i12, 0, i12);
        this.f1061g = 0;
        this.f1062h = objArr2;
    }

    public final int f(int i10) {
        pc.j.e(this.f1062h, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f1062h[this.f1061g];
    }

    public final int g(int i10) {
        return i10 < 0 ? i10 + this.f1062h.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int a6 = a();
        if (i10 < 0 || i10 >= a6) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, a6, "index: ", ", size: "));
        }
        return this.f1062h[i(this.f1061g + i10)];
    }

    public final void h(int i10, int i11) {
        if (i10 < i11) {
            l.V(i10, i11, null, this.f1062h);
            return;
        }
        Object[] objArr = this.f1062h;
        l.V(i10, objArr.length, null, objArr);
        l.V(0, i11, null, this.f1062h);
    }

    public final int i(int i10) {
        Object[] objArr = this.f1062h;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int i11 = i(a() + this.f1061g);
        int i12 = this.f1061g;
        if (i12 < i11) {
            while (i12 < i11) {
                if (pc.j.a(obj, this.f1062h[i12])) {
                    i10 = this.f1061g;
                } else {
                    i12++;
                }
            }
            return -1;
        }
        if (i12 < i11) {
            return -1;
        }
        int length = this.f1062h.length;
        while (true) {
            if (i12 >= length) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (pc.j.a(obj, this.f1062h[i13])) {
                        i12 = i13 + this.f1062h.length;
                        i10 = this.f1061g;
                    }
                }
                return -1;
            }
            if (pc.j.a(obj, this.f1062h[i12])) {
                i10 = this.f1061g;
                break;
            }
            i12++;
        }
        return i12 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f1062h[i(n.K(this) + this.f1061g)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int i11 = i(this.f1063i + this.f1061g);
        int i12 = this.f1061g;
        if (i12 < i11) {
            length = i11 - 1;
            if (i12 <= length) {
                while (!pc.j.a(obj, this.f1062h[length])) {
                    if (length != i12) {
                        length--;
                    }
                }
                i10 = this.f1061g;
                return length - i10;
            }
            return -1;
        }
        if (i12 > i11) {
            int i13 = i11 - 1;
            while (true) {
                if (-1 >= i13) {
                    Object[] objArr = this.f1062h;
                    pc.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i14 = this.f1061g;
                    if (i14 <= length) {
                        while (!pc.j.a(obj, this.f1062h[length])) {
                            if (length != i14) {
                                length--;
                            }
                        }
                        i10 = this.f1061g;
                    }
                } else {
                    if (pc.j.a(obj, this.f1062h[i13])) {
                        length = i13 + this.f1062h.length;
                        i10 = this.f1061g;
                        break;
                    }
                    i13--;
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
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i10;
        pc.j.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f1062h.length != 0) {
            int i11 = i(a() + this.f1061g);
            int i12 = this.f1061g;
            if (i12 < i11) {
                i10 = i12;
                while (i12 < i11) {
                    Object obj = this.f1062h[i12];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f1062h[i10] = obj;
                        i10++;
                    }
                    i12++;
                }
                l.V(i10, i11, null, this.f1062h);
            } else {
                int length = this.f1062h.length;
                boolean z11 = false;
                int i13 = i12;
                while (i12 < length) {
                    Object[] objArr = this.f1062h;
                    Object obj2 = objArr[i12];
                    objArr[i12] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f1062h[i13] = obj2;
                        i13++;
                    }
                    i12++;
                }
                i10 = i(i13);
                for (int i14 = 0; i14 < i11; i14++) {
                    Object[] objArr2 = this.f1062h;
                    Object obj3 = objArr2[i14];
                    objArr2[i14] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f1062h[i10] = obj3;
                        i10 = f(i10);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                j();
                this.f1063i = g(i10 - this.f1061g);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f1062h;
        int i10 = this.f1061g;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f1061g = f(i10);
        this.f1063i = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i10 = i(n.K(this) + this.f1061g);
        Object[] objArr = this.f1062h;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f1063i = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        x4.f.A(i10, i11, this.f1063i);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f1063i) {
            clear();
            return;
        }
        if (i12 == 1) {
            b(i10);
            return;
        }
        j();
        if (i10 < this.f1063i - i11) {
            int i13 = i((i10 - 1) + this.f1061g);
            int i14 = i((i11 - 1) + this.f1061g);
            while (i10 > 0) {
                int i15 = i13 + 1;
                int min = Math.min(i10, Math.min(i15, i14 + 1));
                Object[] objArr = this.f1062h;
                int i16 = i14 - min;
                int i17 = i13 - min;
                l.R(objArr, objArr, i16 + 1, i17 + 1, i15);
                i13 = g(i17);
                i14 = g(i16);
                i10 -= min;
            }
            int i18 = i(this.f1061g + i12);
            h(this.f1061g, i18);
            this.f1061g = i18;
        } else {
            int i19 = i(this.f1061g + i11);
            int i20 = i(this.f1061g + i10);
            int i21 = this.f1063i;
            while (true) {
                i21 -= i11;
                if (i21 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1062h;
                i11 = Math.min(i21, Math.min(objArr2.length - i19, objArr2.length - i20));
                Object[] objArr3 = this.f1062h;
                int i22 = i19 + i11;
                l.R(objArr3, objArr3, i20, i19, i22);
                i19 = i(i22);
                i20 = i(i20 + i11);
            }
            int i23 = i(this.f1063i + this.f1061g);
            h(g(i23 - i12), i23);
        }
        this.f1063i -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i10;
        pc.j.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f1062h.length != 0) {
            int i11 = i(a() + this.f1061g);
            int i12 = this.f1061g;
            if (i12 < i11) {
                i10 = i12;
                while (i12 < i11) {
                    Object obj = this.f1062h[i12];
                    if (collection.contains(obj)) {
                        this.f1062h[i10] = obj;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i12++;
                }
                l.V(i10, i11, null, this.f1062h);
            } else {
                int length = this.f1062h.length;
                boolean z11 = false;
                int i13 = i12;
                while (i12 < length) {
                    Object[] objArr = this.f1062h;
                    Object obj2 = objArr[i12];
                    objArr[i12] = null;
                    if (collection.contains(obj2)) {
                        this.f1062h[i13] = obj2;
                        i13++;
                    } else {
                        z11 = true;
                    }
                    i12++;
                }
                i10 = i(i13);
                for (int i14 = 0; i14 < i11; i14++) {
                    Object[] objArr2 = this.f1062h;
                    Object obj3 = objArr2[i14];
                    objArr2[i14] = null;
                    if (collection.contains(obj3)) {
                        this.f1062h[i10] = obj3;
                        i10 = f(i10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                j();
                this.f1063i = g(i10 - this.f1061g);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int a6 = a();
        if (i10 < 0 || i10 >= a6) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, a6, "index: ", ", size: "));
        }
        int i11 = i(this.f1061g + i10);
        Object[] objArr = this.f1062h;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        pc.j.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f1063i;
        if (length < i10) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            pc.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int i11 = i(this.f1063i + this.f1061g);
        int i12 = this.f1061g;
        if (i12 < i11) {
            l.T(this.f1062h, objArr, i12, i11, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1062h;
            l.R(objArr2, objArr, 0, this.f1061g, objArr2.length);
            Object[] objArr3 = this.f1062h;
            l.R(objArr3, objArr, objArr3.length - this.f1061g, 0, i11);
        }
        int i13 = this.f1063i;
        if (i13 < objArr.length) {
            objArr[i13] = null;
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
        pc.j.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        e(collection.size() + a());
        d(i(a() + this.f1061g), collection);
        return true;
    }
}
