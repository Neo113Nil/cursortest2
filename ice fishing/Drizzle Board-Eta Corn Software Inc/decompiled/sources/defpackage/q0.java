package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q0 extends sjUBp5pO {
    public static final Object[] VgvYg0wo = new Object[0];
    public Object[] MdtA4re8;
    public int NCTxEWno;
    public int wxUZMvaN;

    public q0(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = VgvYg0wo;
        } else {
            if (i <= 0) {
                m1.sjUBp5pO(q70.VgvYg0wo("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.MdtA4re8 = objArr;
    }

    public final void MdtA4re8(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.MdtA4re8.length;
        while (i < length && it.hasNext()) {
            this.MdtA4re8[i] = it.next();
            i++;
        }
        int i2 = this.NCTxEWno;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.MdtA4re8[i3] = it.next();
        }
        this.wxUZMvaN = collection.size() + this.wxUZMvaN;
    }

    @Override // defpackage.sjUBp5pO
    public final Object NCTxEWno(int i) {
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        if (i == qoPGr6Ce() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        eVhOlqcC();
        int jb9XjC4I = jb9XjC4I(this.NCTxEWno + i);
        Object[] objArr = this.MdtA4re8;
        Object obj = objArr[jb9XjC4I];
        int i3 = this.wxUZMvaN >> 1;
        int i4 = this.NCTxEWno;
        if (i < i3) {
            if (jb9XjC4I >= i4) {
                a1.VGmz0ccI(objArr, objArr, i4 + 1, i4, jb9XjC4I);
            } else {
                a1.VGmz0ccI(objArr, objArr, 1, 0, jb9XjC4I);
                Object[] objArr2 = this.MdtA4re8;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.NCTxEWno;
                a1.VGmz0ccI(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.MdtA4re8;
            int i6 = this.NCTxEWno;
            objArr3[i6] = null;
            this.NCTxEWno = VgvYg0wo(i6);
        } else {
            int jb9XjC4I2 = jb9XjC4I((qoPGr6Ce() - 1) + i4);
            Object[] objArr4 = this.MdtA4re8;
            if (jb9XjC4I <= jb9XjC4I2) {
                a1.VGmz0ccI(objArr4, objArr4, jb9XjC4I, jb9XjC4I + 1, jb9XjC4I2 + 1);
            } else {
                a1.VGmz0ccI(objArr4, objArr4, jb9XjC4I, jb9XjC4I + 1, objArr4.length);
                Object[] objArr5 = this.MdtA4re8;
                objArr5[objArr5.length - 1] = objArr5[0];
                a1.VGmz0ccI(objArr5, objArr5, 0, 1, jb9XjC4I2 + 1);
            }
            this.MdtA4re8[jb9XjC4I2] = null;
        }
        this.wxUZMvaN--;
        return obj;
    }

    public final Object P7K7Inc8() {
        if (isEmpty()) {
            return null;
        }
        return this.MdtA4re8[jb9XjC4I((qoPGr6Ce() - 1) + this.NCTxEWno)];
    }

    public final void Qr9iLBAD(int i, int i2) {
        Object[] objArr = this.MdtA4re8;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.MdtA4re8, 0, i2, (Object) null);
        }
    }

    public final int VgvYg0wo(int i) {
        if (i == this.MdtA4re8.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.wxUZMvaN;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        eVhOlqcC();
        wxUZMvaN(this.wxUZMvaN + 1);
        int jb9XjC4I = jb9XjC4I(this.NCTxEWno + i);
        int i3 = this.wxUZMvaN;
        if (i < ((i3 + 1) >> 1)) {
            int length = jb9XjC4I == 0 ? this.MdtA4re8.length - 1 : jb9XjC4I - 1;
            int i4 = this.NCTxEWno;
            int length2 = i4 == 0 ? this.MdtA4re8.length - 1 : i4 - 1;
            Object[] objArr = this.MdtA4re8;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                a1.VGmz0ccI(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                a1.VGmz0ccI(objArr, objArr, i4 - 1, i4, objArr.length);
                Object[] objArr2 = this.MdtA4re8;
                objArr2[objArr2.length - 1] = objArr2[0];
                a1.VGmz0ccI(objArr2, objArr2, 0, 1, length + 1);
            }
            this.MdtA4re8[length] = obj;
            this.NCTxEWno = length2;
        } else {
            int jb9XjC4I2 = jb9XjC4I(i3 + this.NCTxEWno);
            Object[] objArr3 = this.MdtA4re8;
            if (jb9XjC4I < jb9XjC4I2) {
                a1.VGmz0ccI(objArr3, objArr3, jb9XjC4I + 1, jb9XjC4I, jb9XjC4I2);
            } else {
                a1.VGmz0ccI(objArr3, objArr3, 1, 0, jb9XjC4I2);
                Object[] objArr4 = this.MdtA4re8;
                objArr4[0] = objArr4[objArr4.length - 1];
                a1.VGmz0ccI(objArr4, objArr4, jb9XjC4I + 1, jb9XjC4I, objArr4.length - 1);
            }
            this.MdtA4re8[jb9XjC4I] = obj;
        }
        this.wxUZMvaN++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.wxUZMvaN) {
            return addAll(collection);
        }
        eVhOlqcC();
        wxUZMvaN(collection.size() + this.wxUZMvaN);
        int jb9XjC4I = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
        int jb9XjC4I2 = jb9XjC4I(this.NCTxEWno + i);
        int size = collection.size();
        if (i >= ((this.wxUZMvaN + 1) >> 1)) {
            int i3 = jb9XjC4I2 + size;
            Object[] objArr = this.MdtA4re8;
            if (jb9XjC4I2 < jb9XjC4I) {
                int i4 = size + jb9XjC4I;
                if (i4 <= objArr.length) {
                    a1.VGmz0ccI(objArr, objArr, i3, jb9XjC4I2, jb9XjC4I);
                } else if (i3 >= objArr.length) {
                    a1.VGmz0ccI(objArr, objArr, i3 - objArr.length, jb9XjC4I2, jb9XjC4I);
                } else {
                    int length = jb9XjC4I - (i4 - objArr.length);
                    a1.VGmz0ccI(objArr, objArr, 0, length, jb9XjC4I);
                    Object[] objArr2 = this.MdtA4re8;
                    a1.VGmz0ccI(objArr2, objArr2, i3, jb9XjC4I2, length);
                }
            } else {
                a1.VGmz0ccI(objArr, objArr, size, 0, jb9XjC4I);
                Object[] objArr3 = this.MdtA4re8;
                if (i3 >= objArr3.length) {
                    a1.VGmz0ccI(objArr3, objArr3, i3 - objArr3.length, jb9XjC4I2, objArr3.length);
                } else {
                    a1.VGmz0ccI(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.MdtA4re8;
                    a1.VGmz0ccI(objArr4, objArr4, i3, jb9XjC4I2, objArr4.length - size);
                }
            }
            MdtA4re8(jb9XjC4I2, collection);
            return true;
        }
        int i5 = this.NCTxEWno;
        int i6 = i5 - size;
        Object[] objArr5 = this.MdtA4re8;
        if (jb9XjC4I2 < i5) {
            a1.VGmz0ccI(objArr5, objArr5, i6, i5, objArr5.length);
            Object[] objArr6 = this.MdtA4re8;
            if (size >= jb9XjC4I2) {
                a1.VGmz0ccI(objArr6, objArr6, objArr6.length - size, 0, jb9XjC4I2);
            } else {
                a1.VGmz0ccI(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.MdtA4re8;
                a1.VGmz0ccI(objArr7, objArr7, 0, size, jb9XjC4I2);
            }
        } else if (i6 >= 0) {
            a1.VGmz0ccI(objArr5, objArr5, i6, i5, jb9XjC4I2);
        } else {
            i6 += objArr5.length;
            int i7 = jb9XjC4I2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                a1.VGmz0ccI(objArr5, objArr5, i6, i5, jb9XjC4I2);
            } else {
                a1.VGmz0ccI(objArr5, objArr5, i6, i5, i5 + length2);
                Object[] objArr8 = this.MdtA4re8;
                a1.VGmz0ccI(objArr8, objArr8, 0, this.NCTxEWno + length2, jb9XjC4I2);
            }
        }
        this.NCTxEWno = i6;
        MdtA4re8(b2ZJblxo(jb9XjC4I2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        eVhOlqcC();
        wxUZMvaN(this.wxUZMvaN + 1);
        int i = this.NCTxEWno;
        if (i == 0) {
            i = this.MdtA4re8.length;
        }
        int i2 = i - 1;
        this.NCTxEWno = i2;
        this.MdtA4re8[i2] = obj;
        this.wxUZMvaN++;
    }

    public final void addLast(Object obj) {
        eVhOlqcC();
        wxUZMvaN(this.wxUZMvaN + 1);
        this.MdtA4re8[jb9XjC4I(this.wxUZMvaN + this.NCTxEWno)] = obj;
        this.wxUZMvaN++;
    }

    public final int b2ZJblxo(int i) {
        return i < 0 ? i + this.MdtA4re8.length : i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            eVhOlqcC();
            Qr9iLBAD(this.NCTxEWno, jb9XjC4I(this.wxUZMvaN + this.NCTxEWno));
        }
        this.NCTxEWno = 0;
        this.wxUZMvaN = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void eVhOlqcC() {
        ((AbstractList) this).modCount++;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.MdtA4re8[this.NCTxEWno];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return this.MdtA4re8[jb9XjC4I(this.NCTxEWno + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int jb9XjC4I = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
        int i2 = this.NCTxEWno;
        if (i2 < jb9XjC4I) {
            while (i2 < jb9XjC4I) {
                if (fn.qoPGr6Ce(obj, this.MdtA4re8[i2])) {
                    i = this.NCTxEWno;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.NCTxEWno) < jb9XjC4I) {
            return -1;
        }
        int length = this.MdtA4re8.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < jb9XjC4I; i3++) {
                    if (fn.qoPGr6Ce(obj, this.MdtA4re8[i3])) {
                        i2 = i3 + this.MdtA4re8.length;
                        i = this.NCTxEWno;
                    }
                }
                return -1;
            }
            if (fn.qoPGr6Ce(obj, this.MdtA4re8[i2])) {
                i = this.NCTxEWno;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return qoPGr6Ce() == 0;
    }

    public final int jb9XjC4I(int i) {
        Object[] objArr = this.MdtA4re8;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.MdtA4re8[jb9XjC4I((qoPGr6Ce() - 1) + this.NCTxEWno)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int jb9XjC4I = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
        int i2 = this.NCTxEWno;
        if (i2 < jb9XjC4I) {
            length = jb9XjC4I - 1;
            if (i2 <= length) {
                while (!fn.qoPGr6Ce(obj, this.MdtA4re8[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.NCTxEWno;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.NCTxEWno >= jb9XjC4I) {
            while (true) {
                jb9XjC4I--;
                Object[] objArr = this.MdtA4re8;
                if (-1 >= jb9XjC4I) {
                    length = objArr.length - 1;
                    int i3 = this.NCTxEWno;
                    if (i3 <= length) {
                        while (!fn.qoPGr6Ce(obj, this.MdtA4re8[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.NCTxEWno;
                    }
                } else if (fn.qoPGr6Ce(obj, objArr[jb9XjC4I])) {
                    length = jb9XjC4I + this.MdtA4re8.length;
                    i = this.NCTxEWno;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // defpackage.sjUBp5pO
    public final int qoPGr6Ce() {
        return this.wxUZMvaN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        NCTxEWno(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int jb9XjC4I;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.MdtA4re8.length != 0) {
            int jb9XjC4I2 = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
            int i = this.NCTxEWno;
            if (i < jb9XjC4I2) {
                jb9XjC4I = i;
                while (true) {
                    objArr = this.MdtA4re8;
                    if (i >= jb9XjC4I2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.MdtA4re8[jb9XjC4I] = obj;
                        jb9XjC4I++;
                    }
                    i++;
                }
                Arrays.fill(objArr, jb9XjC4I, jb9XjC4I2, (Object) null);
            } else {
                int length = this.MdtA4re8.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.MdtA4re8;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.MdtA4re8[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                jb9XjC4I = jb9XjC4I(i2);
                for (int i3 = 0; i3 < jb9XjC4I2; i3++) {
                    Object[] objArr3 = this.MdtA4re8;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.MdtA4re8[jb9XjC4I] = obj3;
                        jb9XjC4I = VgvYg0wo(jb9XjC4I);
                    }
                }
                z = z2;
            }
            if (z) {
                eVhOlqcC();
                this.wxUZMvaN = b2ZJblxo(jb9XjC4I - this.NCTxEWno);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        eVhOlqcC();
        Object[] objArr = this.MdtA4re8;
        int i = this.NCTxEWno;
        Object obj = objArr[i];
        objArr[i] = null;
        this.NCTxEWno = VgvYg0wo(i);
        this.wxUZMvaN--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        eVhOlqcC();
        int jb9XjC4I = jb9XjC4I((qoPGr6Ce() - 1) + this.NCTxEWno);
        Object[] objArr = this.MdtA4re8;
        Object obj = objArr[jb9XjC4I];
        objArr[jb9XjC4I] = null;
        this.wxUZMvaN--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ej0.VgvYg0wo(i, i2, this.wxUZMvaN);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.wxUZMvaN) {
            clear();
            return;
        }
        if (i3 == 1) {
            NCTxEWno(i);
            return;
        }
        eVhOlqcC();
        int i4 = this.wxUZMvaN - i2;
        int i5 = this.NCTxEWno;
        int i6 = this.NCTxEWno;
        if (i < i4) {
            int jb9XjC4I = jb9XjC4I((i - 1) + i5);
            int jb9XjC4I2 = jb9XjC4I((i2 - 1) + i6);
            while (i > 0) {
                int i7 = jb9XjC4I + 1;
                int min = Math.min(i, Math.min(i7, jb9XjC4I2 + 1));
                Object[] objArr = this.MdtA4re8;
                int i8 = jb9XjC4I2 - min;
                int i9 = jb9XjC4I - min;
                a1.VGmz0ccI(objArr, objArr, i8 + 1, i9 + 1, i7);
                jb9XjC4I = b2ZJblxo(i9);
                jb9XjC4I2 = b2ZJblxo(i8);
                i -= min;
            }
            int jb9XjC4I3 = jb9XjC4I(this.NCTxEWno + i3);
            Qr9iLBAD(this.NCTxEWno, jb9XjC4I3);
            this.NCTxEWno = jb9XjC4I3;
        } else {
            int jb9XjC4I4 = jb9XjC4I(i5 + i2);
            int jb9XjC4I5 = jb9XjC4I(i6 + i);
            int i10 = this.wxUZMvaN;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.MdtA4re8;
                i2 = Math.min(i10, Math.min(objArr2.length - jb9XjC4I4, objArr2.length - jb9XjC4I5));
                Object[] objArr3 = this.MdtA4re8;
                int i11 = jb9XjC4I4 + i2;
                a1.VGmz0ccI(objArr3, objArr3, jb9XjC4I5, jb9XjC4I4, i11);
                jb9XjC4I4 = jb9XjC4I(i11);
                jb9XjC4I5 = jb9XjC4I(jb9XjC4I5 + i2);
            }
            int jb9XjC4I6 = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
            Qr9iLBAD(b2ZJblxo(jb9XjC4I6 - i3), jb9XjC4I6);
        }
        this.wxUZMvaN -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int jb9XjC4I;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.MdtA4re8.length != 0) {
            int jb9XjC4I2 = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
            int i = this.NCTxEWno;
            if (i < jb9XjC4I2) {
                jb9XjC4I = i;
                while (true) {
                    objArr = this.MdtA4re8;
                    if (i >= jb9XjC4I2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.MdtA4re8[jb9XjC4I] = obj;
                        jb9XjC4I++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, jb9XjC4I, jb9XjC4I2, (Object) null);
            } else {
                int length = this.MdtA4re8.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.MdtA4re8;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.MdtA4re8[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                jb9XjC4I = jb9XjC4I(i2);
                for (int i3 = 0; i3 < jb9XjC4I2; i3++) {
                    Object[] objArr3 = this.MdtA4re8;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.MdtA4re8[jb9XjC4I] = obj3;
                        jb9XjC4I = VgvYg0wo(jb9XjC4I);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                eVhOlqcC();
                this.wxUZMvaN = b2ZJblxo(jb9XjC4I - this.NCTxEWno);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        int jb9XjC4I = jb9XjC4I(this.NCTxEWno + i);
        Object[] objArr = this.MdtA4re8;
        Object obj2 = objArr[jb9XjC4I];
        objArr[jb9XjC4I] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.wxUZMvaN;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int jb9XjC4I = jb9XjC4I(this.wxUZMvaN + this.NCTxEWno);
        int i2 = this.NCTxEWno;
        if (i2 < jb9XjC4I) {
            a1.LfKQckgD(this.MdtA4re8, objArr, i2, jb9XjC4I, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.MdtA4re8;
            a1.VGmz0ccI(objArr2, objArr, 0, this.NCTxEWno, objArr2.length);
            Object[] objArr3 = this.MdtA4re8;
            a1.VGmz0ccI(objArr3, objArr, objArr3.length - this.NCTxEWno, 0, jb9XjC4I);
        }
        int i3 = this.wxUZMvaN;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final void wxUZMvaN(int i) {
        if (i < 0) {
            m1.Ey6iv0m0("Deque is too big.");
            return;
        }
        Object[] objArr = this.MdtA4re8;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == VgvYg0wo) {
            if (i < 10) {
                i = 10;
            }
            this.MdtA4re8 = new Object[i];
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
        a1.VGmz0ccI(objArr, objArr2, 0, this.NCTxEWno, objArr.length);
        Object[] objArr3 = this.MdtA4re8;
        int length2 = objArr3.length;
        int i3 = this.NCTxEWno;
        a1.VGmz0ccI(objArr3, objArr2, length2 - i3, 0, i3);
        this.NCTxEWno = 0;
        this.MdtA4re8 = objArr2;
    }

    public q0() {
        this.MdtA4re8 = VgvYg0wo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[qoPGr6Ce()]);
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
        eVhOlqcC();
        wxUZMvaN(collection.size() + this.wxUZMvaN);
        MdtA4re8(jb9XjC4I(this.wxUZMvaN + this.NCTxEWno), collection);
        return true;
    }
}
