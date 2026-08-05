package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mp extends sjUBp5pO implements RandomAccess, Serializable {
    public static final mp VgvYg0wo;
    public int MdtA4re8;
    public Object[] NCTxEWno;
    public boolean wxUZMvaN;

    static {
        mp mpVar = new mp(0);
        mpVar.wxUZMvaN = true;
        VgvYg0wo = mpVar;
    }

    public mp(int i) {
        if (i >= 0) {
            this.NCTxEWno = new Object[i];
        } else {
            m1.sjUBp5pO("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.sjUBp5pO
    public final Object NCTxEWno(int i) {
        P7K7Inc8();
        int i2 = this.MdtA4re8;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return Qr9iLBAD(i);
    }

    public final void P7K7Inc8() {
        if (this.wxUZMvaN) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object Qr9iLBAD(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.NCTxEWno;
        Object obj = objArr[i];
        a1.VGmz0ccI(objArr, objArr, i, i + 1, this.MdtA4re8);
        Object[] objArr2 = this.NCTxEWno;
        int i2 = this.MdtA4re8 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.MdtA4re8--;
        return obj;
    }

    public final void VgvYg0wo(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b2ZJblxo(i, 1);
        this.NCTxEWno[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        P7K7Inc8();
        int i2 = this.MdtA4re8;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        b2ZJblxo(i, 1);
        this.NCTxEWno[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        P7K7Inc8();
        int i2 = this.MdtA4re8;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        wxUZMvaN(i, collection, size);
        return size > 0;
    }

    public final void b2ZJblxo(int i, int i2) {
        int i3 = this.MdtA4re8 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.NCTxEWno;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            objArr = Arrays.copyOf(objArr, i4);
            this.NCTxEWno = objArr;
        }
        a1.VGmz0ccI(objArr, objArr, i + i2, i, this.MdtA4re8);
        this.MdtA4re8 += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        P7K7Inc8();
        jb9XjC4I(0, this.MdtA4re8);
    }

    public final int eVhOlqcC(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.NCTxEWno;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.NCTxEWno;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        a1.VGmz0ccI(objArr, objArr, i + i4, i2 + i, this.MdtA4re8);
        Object[] objArr3 = this.NCTxEWno;
        int i7 = this.MdtA4re8;
        fn.lwWCatUu(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.MdtA4re8 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.NCTxEWno;
            int i = this.MdtA4re8;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (fn.qoPGr6Ce(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.MdtA4re8;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return this.NCTxEWno[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.NCTxEWno;
        int i = this.MdtA4re8;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.MdtA4re8; i++) {
            if (fn.qoPGr6Ce(this.NCTxEWno[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.MdtA4re8 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void jb9XjC4I(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.NCTxEWno;
        a1.VGmz0ccI(objArr, objArr, i, i + i2, this.MdtA4re8);
        Object[] objArr2 = this.NCTxEWno;
        int i3 = this.MdtA4re8;
        fn.lwWCatUu(objArr2, i3 - i2, i3);
        this.MdtA4re8 -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.MdtA4re8 - 1; i >= 0; i--) {
            if (fn.qoPGr6Ce(this.NCTxEWno[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.MdtA4re8;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return new kp(this, i);
    }

    @Override // defpackage.sjUBp5pO
    public final int qoPGr6Ce() {
        return this.MdtA4re8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        P7K7Inc8();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            NCTxEWno(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        P7K7Inc8();
        return eVhOlqcC(0, this.MdtA4re8, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        P7K7Inc8();
        return eVhOlqcC(0, this.MdtA4re8, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        P7K7Inc8();
        int i2 = this.MdtA4re8;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.NCTxEWno;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ej0.VgvYg0wo(i, i2, this.MdtA4re8);
        return new lp(this.NCTxEWno, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.MdtA4re8;
        Object[] objArr2 = this.NCTxEWno;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        a1.VGmz0ccI(objArr2, objArr, 0, 0, i);
        int i2 = this.MdtA4re8;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return fn.euDDoUNr(this.NCTxEWno, 0, this.MdtA4re8, this);
    }

    public final void wxUZMvaN(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        b2ZJblxo(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.NCTxEWno[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return a1.pP9Y2m6O(this.NCTxEWno, 0, this.MdtA4re8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        P7K7Inc8();
        int i = this.MdtA4re8;
        ((AbstractList) this).modCount++;
        b2ZJblxo(i, 1);
        this.NCTxEWno[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        P7K7Inc8();
        int size = collection.size();
        wxUZMvaN(this.MdtA4re8, collection, size);
        return size > 0;
    }
}
