package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v4 extends pog2g9KITJA {
    public static final Object[] encWxUiV2 = new Object[0];
    public int AvO7iQsrTN;
    public Object[] EljAMC1QTz;
    public int OOA6hdeuvCS;

    public v4(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = encWxUiV2;
        } else {
            if (i <= 0) {
                o4.mE4lRynR(mr0.AvO7iQsrTN("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.EljAMC1QTz = objArr;
    }

    public final int AvO7iQsrTN(int i) {
        this.EljAMC1QTz.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void E7jCp8Ls() {
        ((AbstractList) this).modCount++;
    }

    public final Object EljAMC1QTz() {
        if (isEmpty()) {
            return null;
        }
        return this.EljAMC1QTz[this.OOA6hdeuvCS];
    }

    @Override // defpackage.pog2g9KITJA
    public final int GWasM1elztuh() {
        return this.AvO7iQsrTN;
    }

    public final void JFJ3QoxA(int i, int i2) {
        Object[] objArr = this.EljAMC1QTz;
        if (i < i2) {
            d5.JFXS9W1rB5s4(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            d5.JFXS9W1rB5s4(this.EljAMC1QTz, 0, i2);
        }
    }

    public final void OOA6hdeuvCS(int i) {
        if (i < 0) {
            o4.jivtDDk9H("Deque is too big.");
            return;
        }
        Object[] objArr = this.EljAMC1QTz;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == encWxUiV2) {
            if (i < 10) {
                i = 10;
            }
            this.EljAMC1QTz = new Object[i];
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
        d5.Fm8W7vP7q(objArr, objArr2, 0, this.OOA6hdeuvCS, objArr.length);
        Object[] objArr3 = this.EljAMC1QTz;
        int length2 = objArr3.length;
        int i3 = this.OOA6hdeuvCS;
        d5.Fm8W7vP7q(objArr3, objArr2, length2 - i3, 0, i3);
        this.OOA6hdeuvCS = 0;
        this.EljAMC1QTz = objArr2;
    }

    public final void X1lG3V04pd(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.EljAMC1QTz.length;
        while (i < length && it.hasNext()) {
            this.EljAMC1QTz[i] = it.next();
            i++;
        }
        int i2 = this.OOA6hdeuvCS;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.EljAMC1QTz[i3] = it.next();
        }
        this.AvO7iQsrTN = collection.size() + this.AvO7iQsrTN;
    }

    @Override // defpackage.pog2g9KITJA
    public final Object Yi7zF1RB1(int i) {
        int i2 = this.AvO7iQsrTN;
        if (i < 0 || i >= i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == GWasM1elztuh() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        E7jCp8Ls();
        int rQPn8YBR = rQPn8YBR(this.OOA6hdeuvCS + i);
        Object[] objArr = this.EljAMC1QTz;
        Object obj = objArr[rQPn8YBR];
        int i3 = this.AvO7iQsrTN >> 1;
        int i4 = this.OOA6hdeuvCS;
        if (i < i3) {
            if (rQPn8YBR >= i4) {
                d5.Fm8W7vP7q(objArr, objArr, i4 + 1, i4, rQPn8YBR);
            } else {
                d5.Fm8W7vP7q(objArr, objArr, 1, 0, rQPn8YBR);
                Object[] objArr2 = this.EljAMC1QTz;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.OOA6hdeuvCS;
                d5.Fm8W7vP7q(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.EljAMC1QTz;
            int i6 = this.OOA6hdeuvCS;
            objArr3[i6] = null;
            this.OOA6hdeuvCS = AvO7iQsrTN(i6);
        } else {
            int rQPn8YBR2 = rQPn8YBR((GWasM1elztuh() - 1) + i4);
            Object[] objArr4 = this.EljAMC1QTz;
            if (rQPn8YBR <= rQPn8YBR2) {
                d5.Fm8W7vP7q(objArr4, objArr4, rQPn8YBR, rQPn8YBR + 1, rQPn8YBR2 + 1);
            } else {
                d5.Fm8W7vP7q(objArr4, objArr4, rQPn8YBR, rQPn8YBR + 1, objArr4.length);
                Object[] objArr5 = this.EljAMC1QTz;
                objArr5[objArr5.length - 1] = objArr5[0];
                d5.Fm8W7vP7q(objArr5, objArr5, 0, 1, rQPn8YBR2 + 1);
            }
            this.EljAMC1QTz[rQPn8YBR2] = null;
        }
        this.AvO7iQsrTN--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.AvO7iQsrTN;
        if (i < 0 || i > i3) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i3));
            return;
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        E7jCp8Ls();
        OOA6hdeuvCS(this.AvO7iQsrTN + 1);
        int rQPn8YBR = rQPn8YBR(this.OOA6hdeuvCS + i);
        int i4 = this.AvO7iQsrTN;
        if (i < ((i4 + 1) >> 1)) {
            if (rQPn8YBR == 0) {
                Object[] objArr = this.EljAMC1QTz;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = rQPn8YBR - 1;
            }
            int i5 = this.OOA6hdeuvCS;
            if (i5 == 0) {
                Object[] objArr2 = this.EljAMC1QTz;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.OOA6hdeuvCS;
            Object[] objArr3 = this.EljAMC1QTz;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                d5.Fm8W7vP7q(objArr3, objArr3, i7, i7 + 1, i2 + 1);
            } else {
                d5.Fm8W7vP7q(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                Object[] objArr4 = this.EljAMC1QTz;
                objArr4[objArr4.length - 1] = objArr4[0];
                d5.Fm8W7vP7q(objArr4, objArr4, 0, 1, i2 + 1);
            }
            this.EljAMC1QTz[i2] = obj;
            this.OOA6hdeuvCS = i6;
        } else {
            int rQPn8YBR2 = rQPn8YBR(i4 + this.OOA6hdeuvCS);
            Object[] objArr5 = this.EljAMC1QTz;
            if (rQPn8YBR < rQPn8YBR2) {
                d5.Fm8W7vP7q(objArr5, objArr5, rQPn8YBR + 1, rQPn8YBR, rQPn8YBR2);
            } else {
                d5.Fm8W7vP7q(objArr5, objArr5, 1, 0, rQPn8YBR2);
                Object[] objArr6 = this.EljAMC1QTz;
                objArr6[0] = objArr6[objArr6.length - 1];
                d5.Fm8W7vP7q(objArr6, objArr6, rQPn8YBR + 1, rQPn8YBR, objArr6.length - 1);
            }
            this.EljAMC1QTz[rQPn8YBR] = obj;
        }
        this.AvO7iQsrTN++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.AvO7iQsrTN;
        if (i < 0 || i > i2) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.AvO7iQsrTN) {
            return addAll(collection);
        }
        E7jCp8Ls();
        OOA6hdeuvCS(collection.size() + this.AvO7iQsrTN);
        int rQPn8YBR = rQPn8YBR(this.AvO7iQsrTN + this.OOA6hdeuvCS);
        int rQPn8YBR2 = rQPn8YBR(this.OOA6hdeuvCS + i);
        int size = collection.size();
        if (i >= ((this.AvO7iQsrTN + 1) >> 1)) {
            int i3 = rQPn8YBR2 + size;
            Object[] objArr = this.EljAMC1QTz;
            if (rQPn8YBR2 < rQPn8YBR) {
                int i4 = size + rQPn8YBR;
                if (i4 <= objArr.length) {
                    d5.Fm8W7vP7q(objArr, objArr, i3, rQPn8YBR2, rQPn8YBR);
                } else if (i3 >= objArr.length) {
                    d5.Fm8W7vP7q(objArr, objArr, i3 - objArr.length, rQPn8YBR2, rQPn8YBR);
                } else {
                    int length = rQPn8YBR - (i4 - objArr.length);
                    d5.Fm8W7vP7q(objArr, objArr, 0, length, rQPn8YBR);
                    Object[] objArr2 = this.EljAMC1QTz;
                    d5.Fm8W7vP7q(objArr2, objArr2, i3, rQPn8YBR2, length);
                }
            } else {
                d5.Fm8W7vP7q(objArr, objArr, size, 0, rQPn8YBR);
                Object[] objArr3 = this.EljAMC1QTz;
                if (i3 >= objArr3.length) {
                    d5.Fm8W7vP7q(objArr3, objArr3, i3 - objArr3.length, rQPn8YBR2, objArr3.length);
                } else {
                    d5.Fm8W7vP7q(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.EljAMC1QTz;
                    d5.Fm8W7vP7q(objArr4, objArr4, i3, rQPn8YBR2, objArr4.length - size);
                }
            }
            X1lG3V04pd(rQPn8YBR2, collection);
            return true;
        }
        int i5 = this.OOA6hdeuvCS;
        int i6 = i5 - size;
        Object[] objArr5 = this.EljAMC1QTz;
        if (rQPn8YBR2 < i5) {
            d5.Fm8W7vP7q(objArr5, objArr5, i6, i5, objArr5.length);
            Object[] objArr6 = this.EljAMC1QTz;
            if (size >= rQPn8YBR2) {
                d5.Fm8W7vP7q(objArr6, objArr6, objArr6.length - size, 0, rQPn8YBR2);
            } else {
                d5.Fm8W7vP7q(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.EljAMC1QTz;
                d5.Fm8W7vP7q(objArr7, objArr7, 0, size, rQPn8YBR2);
            }
        } else if (i6 >= 0) {
            d5.Fm8W7vP7q(objArr5, objArr5, i6, i5, rQPn8YBR2);
        } else {
            i6 += objArr5.length;
            int i7 = rQPn8YBR2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                d5.Fm8W7vP7q(objArr5, objArr5, i6, i5, rQPn8YBR2);
            } else {
                d5.Fm8W7vP7q(objArr5, objArr5, i6, i5, i5 + length2);
                Object[] objArr8 = this.EljAMC1QTz;
                d5.Fm8W7vP7q(objArr8, objArr8, 0, this.OOA6hdeuvCS + length2, rQPn8YBR2);
            }
        }
        this.OOA6hdeuvCS = i6;
        X1lG3V04pd(mOu10nynGul(rQPn8YBR2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        E7jCp8Ls();
        OOA6hdeuvCS(this.AvO7iQsrTN + 1);
        int i = this.OOA6hdeuvCS;
        if (i == 0) {
            Object[] objArr = this.EljAMC1QTz;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.OOA6hdeuvCS = i2;
        this.EljAMC1QTz[i2] = obj;
        this.AvO7iQsrTN++;
    }

    public final void addLast(Object obj) {
        E7jCp8Ls();
        OOA6hdeuvCS(GWasM1elztuh() + 1);
        this.EljAMC1QTz[rQPn8YBR(GWasM1elztuh() + this.OOA6hdeuvCS)] = obj;
        this.AvO7iQsrTN = GWasM1elztuh() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            E7jCp8Ls();
            JFJ3QoxA(this.OOA6hdeuvCS, rQPn8YBR(GWasM1elztuh() + this.OOA6hdeuvCS));
        }
        this.OOA6hdeuvCS = 0;
        this.AvO7iQsrTN = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object encWxUiV2() {
        if (isEmpty()) {
            return null;
        }
        return this.EljAMC1QTz[rQPn8YBR((size() - 1) + this.OOA6hdeuvCS)];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.EljAMC1QTz[this.OOA6hdeuvCS];
        }
        o4.AvO7iQsrTN("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int GWasM1elztuh = GWasM1elztuh();
        if (i >= 0 && i < GWasM1elztuh) {
            return this.EljAMC1QTz[rQPn8YBR(this.OOA6hdeuvCS + i)];
        }
        o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", GWasM1elztuh));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int rQPn8YBR = rQPn8YBR(GWasM1elztuh() + this.OOA6hdeuvCS);
        int i2 = this.OOA6hdeuvCS;
        if (i2 < rQPn8YBR) {
            while (i2 < rQPn8YBR) {
                if (o30.rQPn8YBR(obj, this.EljAMC1QTz[i2])) {
                    i = this.OOA6hdeuvCS;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.OOA6hdeuvCS) < rQPn8YBR) {
            return -1;
        }
        int length = this.EljAMC1QTz.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < rQPn8YBR; i3++) {
                    if (o30.rQPn8YBR(obj, this.EljAMC1QTz[i3])) {
                        i2 = i3 + this.EljAMC1QTz.length;
                        i = this.OOA6hdeuvCS;
                    }
                }
                return -1;
            }
            if (o30.rQPn8YBR(obj, this.EljAMC1QTz[i2])) {
                i = this.OOA6hdeuvCS;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return GWasM1elztuh() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            o4.AvO7iQsrTN("ArrayDeque is empty.");
            return null;
        }
        return this.EljAMC1QTz[rQPn8YBR((size() - 1) + this.OOA6hdeuvCS)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int rQPn8YBR = rQPn8YBR(this.AvO7iQsrTN + this.OOA6hdeuvCS);
        int i2 = this.OOA6hdeuvCS;
        if (i2 < rQPn8YBR) {
            length = rQPn8YBR - 1;
            if (i2 <= length) {
                while (!o30.rQPn8YBR(obj, this.EljAMC1QTz[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.OOA6hdeuvCS;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.OOA6hdeuvCS >= rQPn8YBR) {
            while (true) {
                rQPn8YBR--;
                Object[] objArr = this.EljAMC1QTz;
                if (-1 >= rQPn8YBR) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.OOA6hdeuvCS;
                    if (i3 <= length) {
                        while (!o30.rQPn8YBR(obj, this.EljAMC1QTz[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.OOA6hdeuvCS;
                    }
                } else if (o30.rQPn8YBR(obj, objArr[rQPn8YBR])) {
                    length = rQPn8YBR + this.EljAMC1QTz.length;
                    i = this.OOA6hdeuvCS;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int mOu10nynGul(int i) {
        return i < 0 ? i + this.EljAMC1QTz.length : i;
    }

    public final int rQPn8YBR(int i) {
        Object[] objArr = this.EljAMC1QTz;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        Yi7zF1RB1(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int rQPn8YBR;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.EljAMC1QTz.length != 0) {
            int rQPn8YBR2 = rQPn8YBR(this.AvO7iQsrTN + this.OOA6hdeuvCS);
            int i = this.OOA6hdeuvCS;
            if (i < rQPn8YBR2) {
                rQPn8YBR = i;
                while (true) {
                    objArr = this.EljAMC1QTz;
                    if (i >= rQPn8YBR2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.EljAMC1QTz[rQPn8YBR] = obj;
                        rQPn8YBR++;
                    }
                    i++;
                }
                d5.JFXS9W1rB5s4(objArr, rQPn8YBR, rQPn8YBR2);
            } else {
                int length = this.EljAMC1QTz.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.EljAMC1QTz;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.EljAMC1QTz[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                rQPn8YBR = rQPn8YBR(i2);
                for (int i3 = 0; i3 < rQPn8YBR2; i3++) {
                    Object[] objArr3 = this.EljAMC1QTz;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.EljAMC1QTz[rQPn8YBR] = obj3;
                        rQPn8YBR = AvO7iQsrTN(rQPn8YBR);
                    }
                }
                z = z2;
            }
            if (z) {
                E7jCp8Ls();
                this.AvO7iQsrTN = mOu10nynGul(rQPn8YBR - this.OOA6hdeuvCS);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            o4.AvO7iQsrTN("ArrayDeque is empty.");
            return null;
        }
        E7jCp8Ls();
        Object[] objArr = this.EljAMC1QTz;
        int i = this.OOA6hdeuvCS;
        Object obj = objArr[i];
        objArr[i] = null;
        this.OOA6hdeuvCS = AvO7iQsrTN(i);
        this.AvO7iQsrTN = GWasM1elztuh() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            o4.AvO7iQsrTN("ArrayDeque is empty.");
            return null;
        }
        E7jCp8Ls();
        int rQPn8YBR = rQPn8YBR((size() - 1) + this.OOA6hdeuvCS);
        Object[] objArr = this.EljAMC1QTz;
        Object obj = objArr[rQPn8YBR];
        objArr[rQPn8YBR] = null;
        this.AvO7iQsrTN = GWasM1elztuh() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        qj.rQPn8YBR(i, i2, this.AvO7iQsrTN);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.AvO7iQsrTN) {
            clear();
            return;
        }
        if (i3 == 1) {
            Yi7zF1RB1(i);
            return;
        }
        E7jCp8Ls();
        int i4 = this.AvO7iQsrTN - i2;
        int i5 = this.OOA6hdeuvCS;
        if (i < i4) {
            int rQPn8YBR = rQPn8YBR((i - 1) + i5);
            int rQPn8YBR2 = rQPn8YBR(this.OOA6hdeuvCS + (i2 - 1));
            while (i > 0) {
                int i6 = rQPn8YBR + 1;
                int min = Math.min(i, Math.min(i6, rQPn8YBR2 + 1));
                Object[] objArr = this.EljAMC1QTz;
                int i7 = rQPn8YBR2 - min;
                int i8 = rQPn8YBR - min;
                d5.Fm8W7vP7q(objArr, objArr, i7 + 1, i8 + 1, i6);
                rQPn8YBR = mOu10nynGul(i8);
                rQPn8YBR2 = mOu10nynGul(i7);
                i -= min;
            }
            int rQPn8YBR3 = rQPn8YBR(this.OOA6hdeuvCS + i3);
            JFJ3QoxA(this.OOA6hdeuvCS, rQPn8YBR3);
            this.OOA6hdeuvCS = rQPn8YBR3;
        } else {
            int rQPn8YBR4 = rQPn8YBR(i5 + i2);
            int rQPn8YBR5 = rQPn8YBR(this.OOA6hdeuvCS + i);
            int i9 = this.AvO7iQsrTN;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.EljAMC1QTz;
                i2 = Math.min(i9, Math.min(objArr2.length - rQPn8YBR4, objArr2.length - rQPn8YBR5));
                Object[] objArr3 = this.EljAMC1QTz;
                int i10 = rQPn8YBR4 + i2;
                d5.Fm8W7vP7q(objArr3, objArr3, rQPn8YBR5, rQPn8YBR4, i10);
                rQPn8YBR4 = rQPn8YBR(i10);
                rQPn8YBR5 = rQPn8YBR(rQPn8YBR5 + i2);
            }
            int rQPn8YBR6 = rQPn8YBR(this.AvO7iQsrTN + this.OOA6hdeuvCS);
            JFJ3QoxA(mOu10nynGul(rQPn8YBR6 - i3), rQPn8YBR6);
        }
        this.AvO7iQsrTN -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int rQPn8YBR;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.EljAMC1QTz.length != 0) {
            int rQPn8YBR2 = rQPn8YBR(this.AvO7iQsrTN + this.OOA6hdeuvCS);
            int i = this.OOA6hdeuvCS;
            if (i < rQPn8YBR2) {
                rQPn8YBR = i;
                while (true) {
                    objArr = this.EljAMC1QTz;
                    if (i >= rQPn8YBR2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.EljAMC1QTz[rQPn8YBR] = obj;
                        rQPn8YBR++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                d5.JFXS9W1rB5s4(objArr, rQPn8YBR, rQPn8YBR2);
            } else {
                int length = this.EljAMC1QTz.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.EljAMC1QTz;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.EljAMC1QTz[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                rQPn8YBR = rQPn8YBR(i2);
                for (int i3 = 0; i3 < rQPn8YBR2; i3++) {
                    Object[] objArr3 = this.EljAMC1QTz;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.EljAMC1QTz[rQPn8YBR] = obj3;
                        rQPn8YBR = AvO7iQsrTN(rQPn8YBR);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                E7jCp8Ls();
                this.AvO7iQsrTN = mOu10nynGul(rQPn8YBR - this.OOA6hdeuvCS);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int GWasM1elztuh = GWasM1elztuh();
        if (i < 0 || i >= GWasM1elztuh) {
            o4.uFEq9NpZ(mr0.mOu10nynGul("index: ", i, ", size: ", GWasM1elztuh));
            return null;
        }
        int rQPn8YBR = rQPn8YBR(this.OOA6hdeuvCS + i);
        Object[] objArr = this.EljAMC1QTz;
        Object obj2 = objArr[rQPn8YBR];
        objArr[rQPn8YBR] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.AvO7iQsrTN;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int rQPn8YBR = rQPn8YBR(this.AvO7iQsrTN + this.OOA6hdeuvCS);
        int i2 = this.OOA6hdeuvCS;
        if (i2 < rQPn8YBR) {
            d5.mqNvfisv7(this.EljAMC1QTz, objArr, i2, rQPn8YBR, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.EljAMC1QTz;
            d5.Fm8W7vP7q(objArr2, objArr, 0, this.OOA6hdeuvCS, objArr2.length);
            Object[] objArr3 = this.EljAMC1QTz;
            d5.Fm8W7vP7q(objArr3, objArr, objArr3.length - this.OOA6hdeuvCS, 0, rQPn8YBR);
        }
        int i3 = this.AvO7iQsrTN;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public v4() {
        this.EljAMC1QTz = encWxUiV2;
    }

    public v4(bv0 bv0Var) {
        Object[] c4eaifQP = fb1.c4eaifQP(bv0Var, new Object[0]);
        this.EljAMC1QTz = c4eaifQP;
        this.AvO7iQsrTN = c4eaifQP.length;
        if (c4eaifQP.length == 0) {
            this.EljAMC1QTz = encWxUiV2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[GWasM1elztuh()]);
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
        E7jCp8Ls();
        OOA6hdeuvCS(collection.size() + GWasM1elztuh());
        X1lG3V04pd(rQPn8YBR(GWasM1elztuh() + this.OOA6hdeuvCS), collection);
        return true;
    }
}
