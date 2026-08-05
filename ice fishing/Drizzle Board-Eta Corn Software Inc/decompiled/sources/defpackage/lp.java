package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lp extends sjUBp5pO implements RandomAccess, Serializable {
    public final int MdtA4re8;
    public Object[] NCTxEWno;
    public final mp P7K7Inc8;
    public final lp VgvYg0wo;
    public int wxUZMvaN;

    public lp(Object[] objArr, int i, int i2, lp lpVar, mp mpVar) {
        int i3;
        objArr.getClass();
        this.NCTxEWno = objArr;
        this.MdtA4re8 = i;
        this.wxUZMvaN = i2;
        this.VgvYg0wo = lpVar;
        this.P7K7Inc8 = mpVar;
        i3 = ((AbstractList) mpVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // defpackage.sjUBp5pO
    public final Object NCTxEWno(int i) {
        b2ZJblxo();
        P7K7Inc8();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return Qr9iLBAD(this.MdtA4re8 + i);
    }

    public final void P7K7Inc8() {
        int i;
        i = ((AbstractList) this.P7K7Inc8).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object Qr9iLBAD(int i) {
        Object Qr9iLBAD;
        ((AbstractList) this).modCount++;
        lp lpVar = this.VgvYg0wo;
        if (lpVar != null) {
            Qr9iLBAD = lpVar.Qr9iLBAD(i);
        } else {
            mp mpVar = mp.VgvYg0wo;
            Qr9iLBAD = this.P7K7Inc8.Qr9iLBAD(i);
        }
        this.wxUZMvaN--;
        return Qr9iLBAD;
    }

    public final void VgvYg0wo(int i, Object obj) {
        ((AbstractList) this).modCount++;
        mp mpVar = this.P7K7Inc8;
        lp lpVar = this.VgvYg0wo;
        if (lpVar != null) {
            lpVar.VgvYg0wo(i, obj);
        } else {
            mp mpVar2 = mp.VgvYg0wo;
            mpVar.VgvYg0wo(i, obj);
        }
        this.NCTxEWno = mpVar.NCTxEWno;
        this.wxUZMvaN++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b2ZJblxo();
        P7K7Inc8();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        VgvYg0wo(this.MdtA4re8 + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        b2ZJblxo();
        P7K7Inc8();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        int size = collection.size();
        wxUZMvaN(this.MdtA4re8 + i, collection, size);
        return size > 0;
    }

    public final void b2ZJblxo() {
        if (this.P7K7Inc8.wxUZMvaN) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b2ZJblxo();
        P7K7Inc8();
        jb9XjC4I(this.MdtA4re8, this.wxUZMvaN);
    }

    public final int eVhOlqcC(int i, int i2, Collection collection, boolean z) {
        int eVhOlqcC;
        lp lpVar = this.VgvYg0wo;
        if (lpVar != null) {
            eVhOlqcC = lpVar.eVhOlqcC(i, i2, collection, z);
        } else {
            mp mpVar = mp.VgvYg0wo;
            eVhOlqcC = this.P7K7Inc8.eVhOlqcC(i, i2, collection, z);
        }
        if (eVhOlqcC > 0) {
            ((AbstractList) this).modCount++;
        }
        this.wxUZMvaN -= eVhOlqcC;
        return eVhOlqcC;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        P7K7Inc8();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.NCTxEWno;
            int i = this.wxUZMvaN;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (fn.qoPGr6Ce(objArr[this.MdtA4re8 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        P7K7Inc8();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return this.NCTxEWno[this.MdtA4re8 + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        P7K7Inc8();
        Object[] objArr = this.NCTxEWno;
        int i = this.wxUZMvaN;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.MdtA4re8 + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        P7K7Inc8();
        for (int i = 0; i < this.wxUZMvaN; i++) {
            if (fn.qoPGr6Ce(this.NCTxEWno[this.MdtA4re8 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        P7K7Inc8();
        return this.wxUZMvaN == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void jb9XjC4I(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        lp lpVar = this.VgvYg0wo;
        if (lpVar != null) {
            lpVar.jb9XjC4I(i, i2);
        } else {
            mp mpVar = mp.VgvYg0wo;
            this.P7K7Inc8.jb9XjC4I(i, i2);
        }
        this.wxUZMvaN -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        P7K7Inc8();
        for (int i = this.wxUZMvaN - 1; i >= 0; i--) {
            if (fn.qoPGr6Ce(this.NCTxEWno[this.MdtA4re8 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        P7K7Inc8();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        return new kp(this, i);
    }

    @Override // defpackage.sjUBp5pO
    public final int qoPGr6Ce() {
        P7K7Inc8();
        return this.wxUZMvaN;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b2ZJblxo();
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
        b2ZJblxo();
        P7K7Inc8();
        return eVhOlqcC(this.MdtA4re8, this.wxUZMvaN, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        b2ZJblxo();
        P7K7Inc8();
        return eVhOlqcC(this.MdtA4re8, this.wxUZMvaN, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b2ZJblxo();
        P7K7Inc8();
        int i2 = this.wxUZMvaN;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.NCTxEWno;
        int i3 = this.MdtA4re8;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ej0.VgvYg0wo(i, i2, this.wxUZMvaN);
        return new lp(this.NCTxEWno, this.MdtA4re8 + i, i2 - i, this, this.P7K7Inc8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        P7K7Inc8();
        int length = objArr.length;
        int i = this.wxUZMvaN;
        Object[] objArr2 = this.NCTxEWno;
        int i2 = this.MdtA4re8;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        a1.VGmz0ccI(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.wxUZMvaN;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        P7K7Inc8();
        return fn.euDDoUNr(this.NCTxEWno, this.MdtA4re8, this.wxUZMvaN, this);
    }

    public final void wxUZMvaN(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        mp mpVar = this.P7K7Inc8;
        lp lpVar = this.VgvYg0wo;
        if (lpVar != null) {
            lpVar.wxUZMvaN(i, collection, i2);
        } else {
            mp mpVar2 = mp.VgvYg0wo;
            mpVar.wxUZMvaN(i, collection, i2);
        }
        this.NCTxEWno = mpVar.NCTxEWno;
        this.wxUZMvaN += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b2ZJblxo();
        P7K7Inc8();
        VgvYg0wo(this.MdtA4re8 + this.wxUZMvaN, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        P7K7Inc8();
        Object[] objArr = this.NCTxEWno;
        int i = this.wxUZMvaN;
        int i2 = this.MdtA4re8;
        return a1.pP9Y2m6O(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        b2ZJblxo();
        P7K7Inc8();
        int size = collection.size();
        wxUZMvaN(this.MdtA4re8 + this.wxUZMvaN, collection, size);
        return size > 0;
    }
}
