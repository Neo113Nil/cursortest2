package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class x43 extends v8 {
    public static final Object[] w = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public x43(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = w;
        } else {
            if (i <= 0) {
                ny61.g(oyr.i(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.c(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        l();
        b(size() + 1);
        int k = k(this.a + i);
        int size2 = (size() + 1) >> 1;
        int i2 = this.a;
        if (i < size2) {
            int length = k == 0 ? this.b.length - 1 : k - 1;
            int length2 = i2 == 0 ? this.b.length - 1 : i2 - 1;
            Object[] objArr = this.b;
            if (length >= i2) {
                objArr[length2] = objArr[i2];
                f73.g(objArr, i2, objArr, i2 + 1, length + 1);
            } else {
                f73.g(objArr, i2 - 1, objArr, i2, objArr.length);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                f73.g(objArr2, 0, objArr2, 1, length + 1);
            }
            this.b[length] = obj;
            this.a = length2;
        } else {
            int k2 = k(size() + i2);
            Object[] objArr3 = this.b;
            if (k < k2) {
                f73.g(objArr3, k + 1, objArr3, k, k2);
            } else {
                f73.g(objArr3, 1, objArr3, 0, k2);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                f73.g(objArr4, k + 1, objArr4, k, objArr4.length - 1);
            }
            this.b[k] = obj;
        }
        this.c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.c(i, size);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        l();
        b(collection.size() + size());
        int k = k(size() + this.a);
        int k2 = k(this.a + i);
        int size2 = collection.size();
        if (i >= ((size() + 1) >> 1)) {
            int i2 = k2 + size2;
            Object[] objArr = this.b;
            if (k2 < k) {
                int i3 = size2 + k;
                if (i3 <= objArr.length) {
                    f73.g(objArr, i2, objArr, k2, k);
                } else if (i2 >= objArr.length) {
                    f73.g(objArr, i2 - objArr.length, objArr, k2, k);
                } else {
                    int length = k - (i3 - objArr.length);
                    f73.g(objArr, 0, objArr, length, k);
                    Object[] objArr2 = this.b;
                    f73.g(objArr2, i2, objArr2, k2, length);
                }
            } else {
                f73.g(objArr, size2, objArr, 0, k);
                Object[] objArr3 = this.b;
                if (i2 >= objArr3.length) {
                    f73.g(objArr3, i2 - objArr3.length, objArr3, k2, objArr3.length);
                } else {
                    f73.g(objArr3, 0, objArr3, objArr3.length - size2, objArr3.length);
                    Object[] objArr4 = this.b;
                    f73.g(objArr4, i2, objArr4, k2, objArr4.length - size2);
                }
            }
            a(k2, collection);
            return true;
        }
        int i4 = this.a;
        int i5 = i4 - size2;
        Object[] objArr5 = this.b;
        if (k2 < i4) {
            f73.g(objArr5, i5, objArr5, i4, objArr5.length);
            Object[] objArr6 = this.b;
            if (size2 >= k2) {
                f73.g(objArr6, objArr6.length - size2, objArr6, 0, k2);
            } else {
                f73.g(objArr6, objArr6.length - size2, objArr6, 0, size2);
                Object[] objArr7 = this.b;
                f73.g(objArr7, 0, objArr7, size2, k2);
            }
        } else if (i5 >= 0) {
            f73.g(objArr5, i5, objArr5, i4, k2);
        } else {
            i5 += objArr5.length;
            int i6 = k2 - i4;
            int length2 = objArr5.length - i5;
            if (length2 >= i6) {
                f73.g(objArr5, i5, objArr5, i4, k2);
            } else {
                f73.g(objArr5, i5, objArr5, i4, i4 + length2);
                Object[] objArr8 = this.b;
                f73.g(objArr8, 0, objArr8, this.a + length2, k2);
            }
        }
        this.a = i5;
        a(i(k2 - size2), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        b(size() + 1);
        int i = this.a;
        if (i == 0) {
            i = this.b.length;
        }
        int i2 = i - 1;
        this.a = i2;
        this.b[i2] = obj;
        this.c = size() + 1;
    }

    public final void addLast(Object obj) {
        l();
        b(size() + 1);
        this.b[k(size() + this.a)] = obj;
        this.c = size() + 1;
    }

    public final void b(int i) {
        if (i < 0) {
            ny61.r("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == w) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        g8 g8Var = k8.Companion;
        int length = objArr.length;
        g8Var.getClass();
        Object[] objArr2 = new Object[g8.e(length, i)];
        Object[] objArr3 = this.b;
        f73.g(objArr3, 0, objArr2, this.a, objArr3.length);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.a;
        f73.g(objArr4, length2 - i2, objArr2, 0, i2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.a, k(size() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        w511.i("ArrayDeque is empty.");
        return null;
    }

    public final int g(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.b(i, size);
        return this.b[k(this.a + i)];
    }

    @Override // defpackage.v8
    /* renamed from: getSize */
    public final int getLength() {
        return this.c;
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.b[k(scc.f(this) + this.a)];
    }

    public final int i(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int k = k(size() + this.a);
        int i2 = this.a;
        if (i2 < k) {
            while (i2 < k) {
                if (jl40.l(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.a) < k) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < k; i3++) {
                    if (jl40.l(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (jl40.l(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void j(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.b, 0, i2, (Object) null);
        }
    }

    public final int k(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            w511.i("ArrayDeque is empty.");
            return null;
        }
        return this.b[k(scc.f(this) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int k = k(size() + this.a);
        int i2 = this.a;
        if (i2 < k) {
            length = k - 1;
            if (i2 <= length) {
                while (!jl40.l(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= k) {
            while (true) {
                k--;
                Object[] objArr = this.b;
                if (-1 >= k) {
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!jl40.l(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else if (jl40.l(obj, objArr[k])) {
                    length = k + this.b.length;
                    i = this.a;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final Object m() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int k;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int k2 = k(size() + this.a);
            int i = this.a;
            if (i < k2) {
                k = i;
                while (true) {
                    objArr = this.b;
                    if (i >= k2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[k] = obj;
                        k++;
                    }
                    i++;
                }
                Arrays.fill(objArr, k, k2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                k = k(i2);
                for (int i3 = 0; i3 < k2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[k] = obj3;
                        k = g(k);
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.c = i(k - this.a);
            }
        }
        return z;
    }

    @Override // defpackage.v8
    public final Object removeAt(int i) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.b(i, size);
        if (i == scc.f(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        l();
        int k = k(this.a + i);
        Object obj = this.b[k];
        int size2 = size() >> 1;
        int i2 = this.a;
        if (i < size2) {
            Object[] objArr = this.b;
            if (k >= i2) {
                f73.g(objArr, i2 + 1, objArr, i2, k);
            } else {
                f73.g(objArr, 1, objArr, 0, k);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = this.a;
                f73.g(objArr2, i3 + 1, objArr2, i3, objArr2.length - 1);
            }
            Object[] objArr3 = this.b;
            int i4 = this.a;
            objArr3[i4] = null;
            this.a = g(i4);
        } else {
            int k2 = k(scc.f(this) + i2);
            Object[] objArr4 = this.b;
            if (k <= k2) {
                f73.g(objArr4, k, objArr4, k + 1, k2 + 1);
            } else {
                f73.g(objArr4, k, objArr4, k + 1, objArr4.length);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                f73.g(objArr5, 0, objArr5, 1, k2 + 1);
            }
            this.b[k2] = null;
        }
        this.c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            w511.i("ArrayDeque is empty.");
            return null;
        }
        l();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = g(i);
        this.c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            w511.i("ArrayDeque is empty.");
            return null;
        }
        l();
        int k = k(scc.f(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[k];
        objArr[k] = null;
        this.c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.d(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        l();
        int size2 = size() - i2;
        int i4 = this.a;
        if (i < size2) {
            int k = k((i - 1) + i4);
            int k2 = k(this.a + (i2 - 1));
            while (i > 0) {
                int i5 = k + 1;
                int min = Math.min(i, Math.min(i5, k2 + 1));
                Object[] objArr = this.b;
                int i6 = k2 - min;
                int i7 = k - min;
                f73.g(objArr, i6 + 1, objArr, i7 + 1, i5);
                k = i(i7);
                k2 = i(i6);
                i -= min;
            }
            int k3 = k(this.a + i3);
            j(this.a, k3);
            this.a = k3;
        } else {
            int k4 = k(i4 + i2);
            int k5 = k(this.a + i);
            int size3 = size();
            while (true) {
                size3 -= i2;
                if (size3 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(size3, Math.min(objArr2.length - k4, objArr2.length - k5));
                Object[] objArr3 = this.b;
                int i8 = k4 + i2;
                f73.g(objArr3, k5, objArr3, k4, i8);
                k4 = k(i8);
                k5 = k(k5 + i2);
            }
            int k6 = k(size() + this.a);
            j(i(k6 - i3), k6);
        }
        this.c = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int k;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int k2 = k(size() + this.a);
            int i = this.a;
            if (i < k2) {
                k = i;
                while (true) {
                    objArr = this.b;
                    if (i >= k2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[k] = obj;
                        k++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, k, k2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                k = k(i2);
                for (int i3 = 0; i3 < k2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[k] = obj3;
                        k = g(k);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.c = i(k - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g8 g8Var = k8.Companion;
        int size = size();
        g8Var.getClass();
        g8.b(i, size);
        int k = k(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[k];
        objArr[k] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < size()) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size());
        }
        int k = k(size() + this.a);
        int i = this.a;
        if (i < k) {
            f73.l(this.b, i, objArr, k, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            f73.g(objArr2, 0, objArr, this.a, objArr2.length);
            Object[] objArr3 = this.b;
            f73.g(objArr3, objArr3.length - this.a, objArr, 0, k);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    public x43() {
        this.b = w;
    }

    public x43(Collection collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.b = array;
        this.c = array.length;
        if (array.length == 0) {
            this.b = w;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        l();
        b(collection.size() + size());
        a(k(size() + this.a), collection);
        return true;
    }
}
