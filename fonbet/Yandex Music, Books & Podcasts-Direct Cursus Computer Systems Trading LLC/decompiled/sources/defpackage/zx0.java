package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zx0 extends h8 {

    @NotNull
    public static final xx0 d = new xx0(null);
    public static final Object[] e = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public zx0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else {
            if (i <= 0) {
                xq0.x(k5r.i(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // defpackage.h8
    public final Object a(int i) {
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.b(i, i2);
        if (i == f() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        v();
        int u = u(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[u];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (u >= i4) {
                uz0.f(i4 + 1, i4, u, objArr, objArr);
            } else {
                uz0.f(1, 0, u, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                uz0.f(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = q(i6);
        } else {
            int u2 = u((f() - 1) + i4);
            Object[] objArr4 = this.b;
            if (u <= u2) {
                uz0.f(u, u + 1, u2 + 1, objArr4, objArr4);
            } else {
                uz0.f(u, u + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                uz0.f(0, 1, u2 + 1, objArr5, objArr5);
            }
            this.b[u2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.c(i, i2);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        v();
        o(this.c + 1);
        int u = u(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            int D = u == 0 ? xz0.D(this.b) : u - 1;
            int i4 = this.a;
            int D2 = i4 == 0 ? xz0.D(this.b) : i4 - 1;
            int i5 = this.a;
            Object[] objArr = this.b;
            if (D >= i5) {
                objArr[D2] = objArr[i5];
                uz0.f(i5, i5 + 1, D + 1, objArr, objArr);
            } else {
                uz0.f(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                uz0.f(0, 1, D + 1, objArr2, objArr2);
            }
            this.b[D] = obj;
            this.a = D2;
        } else {
            int u2 = u(i3 + this.a);
            Object[] objArr3 = this.b;
            if (u < u2) {
                uz0.f(u + 1, u, u2, objArr3, objArr3);
            } else {
                uz0.f(1, 0, u2, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                uz0.f(u + 1, u, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[u] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.c(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        v();
        o(collection.size() + this.c);
        int u = u(this.c + this.a);
        int u2 = u(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = u2 + size;
            Object[] objArr = this.b;
            if (u2 < u) {
                int i4 = size + u;
                if (i4 <= objArr.length) {
                    uz0.f(i3, u2, u, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    uz0.f(i3 - objArr.length, u2, u, objArr, objArr);
                } else {
                    int length = u - (i4 - objArr.length);
                    uz0.f(0, length, u, objArr, objArr);
                    Object[] objArr2 = this.b;
                    uz0.f(i3, u2, length, objArr2, objArr2);
                }
            } else {
                uz0.f(size, 0, u, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i3 >= objArr3.length) {
                    uz0.f(i3 - objArr3.length, u2, objArr3.length, objArr3, objArr3);
                } else {
                    uz0.f(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    uz0.f(i3, u2, objArr4.length - size, objArr4, objArr4);
                }
            }
            g(u2, collection);
            return true;
        }
        int i5 = this.a;
        int i6 = i5 - size;
        Object[] objArr5 = this.b;
        if (u2 < i5) {
            uz0.f(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size >= u2) {
                uz0.f(objArr6.length - size, 0, u2, objArr6, objArr6);
            } else {
                uz0.f(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.b;
                uz0.f(0, size, u2, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            uz0.f(i6, i5, u2, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = u2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                uz0.f(i6, i5, u2, objArr5, objArr5);
            } else {
                uz0.f(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.b;
                uz0.f(0, this.a + length2, u2, objArr8, objArr8);
            }
        }
        this.a = i6;
        g(s(u2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        v();
        o(this.c + 1);
        int i = this.a;
        int D = i == 0 ? xz0.D(this.b) : i - 1;
        this.a = D;
        this.b[D] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        v();
        o(f() + 1);
        this.b[u(f() + this.a)] = obj;
        this.c = f() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            v();
            t(this.a, u(f() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.h8
    public final int f() {
        return this.c;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        wvs.h("ArrayDeque is empty.");
        return null;
    }

    public final void g(int i, Collection collection) {
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
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.b(i, i2);
        return this.b[u(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int u = u(f() + this.a);
        int i2 = this.a;
        if (i2 < u) {
            while (i2 < u) {
                if (Intrinsics.d(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < u) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < u; i3++) {
                    if (Intrinsics.d(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (Intrinsics.d(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return f() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            wvs.h("ArrayDeque is empty.");
            return null;
        }
        return this.b[u((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int D;
        int i;
        int u = u(f() + this.a);
        int i2 = this.a;
        if (i2 < u) {
            D = u - 1;
            if (i2 <= D) {
                while (!Intrinsics.d(obj, this.b[D])) {
                    if (D != i2) {
                        D--;
                    }
                }
                i = this.a;
                return D - i;
            }
            return -1;
        }
        if (i2 > u) {
            while (true) {
                u--;
                Object[] objArr = this.b;
                if (-1 >= u) {
                    D = xz0.D(objArr);
                    int i3 = this.a;
                    if (i3 <= D) {
                        while (!Intrinsics.d(obj, this.b[D])) {
                            if (D != i3) {
                                D--;
                            }
                        }
                        i = this.a;
                    }
                } else if (Intrinsics.d(obj, objArr[u])) {
                    D = u + this.b.length;
                    i = this.a;
                    break;
                }
            }
        }
        return -1;
    }

    public final void o(int i) {
        if (i < 0) {
            xq0.q("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        b7 b7Var = a.a;
        int length = objArr.length;
        b7Var.getClass();
        Object[] objArr2 = new Object[b7.e(length, i)];
        Object[] objArr3 = this.b;
        uz0.f(0, this.a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.a;
        uz0.f(length2 - i2, 0, i2, objArr4, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final int q(int i) {
        if (i == xz0.D(this.b)) {
            return 0;
        }
        return i + 1;
    }

    public final Object r() {
        if (isEmpty()) {
            return null;
        }
        return this.b[u((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        a(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int u;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int u2 = u(f() + this.a);
            int i = this.a;
            if (i < u2) {
                u = i;
                while (true) {
                    objArr = this.b;
                    if (i >= u2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[u] = obj;
                        u++;
                    }
                    i++;
                }
                uz0.l(u, u2, null, objArr);
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
                u = u(i2);
                for (int i3 = 0; i3 < u2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[u] = obj3;
                        u = q(u);
                    }
                }
                z = z2;
            }
            if (z) {
                v();
                this.c = s(u - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            wvs.h("ArrayDeque is empty.");
            return null;
        }
        v();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = q(i);
        this.c = f() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            wvs.h("ArrayDeque is empty.");
            return null;
        }
        v();
        int u = u((size() - 1) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[u];
        objArr[u] = null;
        this.c = f() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b7 b7Var = a.a;
        int i3 = this.c;
        b7Var.getClass();
        b7.d(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.c) {
            clear();
            return;
        }
        if (i4 == 1) {
            a(i);
            return;
        }
        v();
        int i5 = this.c - i2;
        int i6 = this.a;
        if (i < i5) {
            int u = u((i - 1) + i6);
            int u2 = u(this.a + (i2 - 1));
            while (i > 0) {
                int i7 = u + 1;
                int min = Math.min(i, Math.min(i7, u2 + 1));
                Object[] objArr = this.b;
                int i8 = u2 - min;
                int i9 = u - min;
                uz0.f(i8 + 1, i9 + 1, i7, objArr, objArr);
                u = s(i9);
                u2 = s(i8);
                i -= min;
            }
            int u3 = u(this.a + i4);
            t(this.a, u3);
            this.a = u3;
        } else {
            int u4 = u(i6 + i2);
            int u5 = u(this.a + i);
            int i10 = this.c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i10, Math.min(objArr2.length - u4, objArr2.length - u5));
                Object[] objArr3 = this.b;
                int i11 = u4 + i2;
                uz0.f(u5, u4, i11, objArr3, objArr3);
                u4 = u(i11);
                u5 = u(u5 + i2);
            }
            int u6 = u(this.c + this.a);
            t(s(u6 - i4), u6);
        }
        this.c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int u;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int u2 = u(f() + this.a);
            int i = this.a;
            if (i < u2) {
                u = i;
                while (true) {
                    objArr = this.b;
                    if (i >= u2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[u] = obj;
                        u++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                uz0.l(u, u2, null, objArr);
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
                u = u(i2);
                for (int i3 = 0; i3 < u2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[u] = obj3;
                        u = q(u);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                v();
                this.c = s(u - this.a);
            }
        }
        return z;
    }

    public final int s(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b7 b7Var = a.a;
        int i2 = this.c;
        b7Var.getClass();
        b7.b(i, i2);
        int u = u(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[u];
        objArr[u] = obj;
        return obj2;
    }

    public final void t(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            uz0.l(i, i2, null, objArr);
        } else {
            uz0.l(i, objArr.length, null, objArr);
            uz0.l(0, i2, null, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        Object[] objArr2 = objArr;
        int u = u(this.c + this.a);
        int i2 = this.a;
        if (i2 < u) {
            uz0.i(this.b, objArr2, 0, i2, u, 2);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.b;
            uz0.f(0, this.a, objArr3.length, objArr3, objArr2);
            Object[] objArr4 = this.b;
            uz0.f(objArr4.length - this.a, 0, u, objArr4, objArr2);
        }
        int i3 = this.c;
        if (i3 < objArr2.length) {
            objArr2[i3] = null;
        }
        return objArr2;
    }

    public final int u(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void v() {
        ((AbstractList) this).modCount++;
    }

    public zx0() {
        this.b = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        v();
        o(collection.size() + f());
        g(u(f() + this.a), collection);
        return true;
    }
}
