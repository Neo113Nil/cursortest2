package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z0 implements Collection, Set, yn {
    public int wxUZMvaN;
    public int[] NCTxEWno = le0.MdtA4re8;
    public Object[] MdtA4re8 = le0.wxUZMvaN;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int amk52bBQ;
        int i2 = this.wxUZMvaN;
        if (obj == null) {
            amk52bBQ = fn.amk52bBQ(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            amk52bBQ = fn.amk52bBQ(this, obj, hashCode);
        }
        if (amk52bBQ >= 0) {
            return false;
        }
        int i3 = ~amk52bBQ;
        int[] iArr = this.NCTxEWno;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.MdtA4re8;
            int[] iArr2 = new int[i4];
            this.NCTxEWno = iArr2;
            this.MdtA4re8 = new Object[i4];
            if (i2 != this.wxUZMvaN) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                a1.ESscZ9M1(0, 0, iArr.length, iArr, iArr2);
                a1.LfKQckgD(objArr, this.MdtA4re8, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.NCTxEWno;
            int i5 = i3 + 1;
            a1.ESscZ9M1(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.MdtA4re8;
            a1.VGmz0ccI(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.wxUZMvaN;
        if (i2 == i6) {
            int[] iArr4 = this.NCTxEWno;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.MdtA4re8[i3] = obj;
                this.wxUZMvaN = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.wxUZMvaN;
        int i = this.wxUZMvaN;
        int[] iArr = this.NCTxEWno;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.MdtA4re8;
            int[] iArr2 = new int[size];
            this.NCTxEWno = iArr2;
            this.MdtA4re8 = new Object[size];
            if (i > 0) {
                a1.ESscZ9M1(0, 0, i, iArr, iArr2);
                a1.LfKQckgD(objArr, this.MdtA4re8, 0, this.wxUZMvaN, 6);
            }
        }
        if (this.wxUZMvaN != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.wxUZMvaN;
        if (i != 0) {
            this.NCTxEWno = le0.MdtA4re8;
            this.MdtA4re8 = le0.wxUZMvaN;
            i = 0;
            this.wxUZMvaN = 0;
        }
        if (i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? fn.amk52bBQ(this, null, 0) : fn.amk52bBQ(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.wxUZMvaN == ((Set) obj).size()) {
            try {
                int i = this.wxUZMvaN;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.MdtA4re8[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.NCTxEWno;
        int i = this.wxUZMvaN;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.wxUZMvaN <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new t0(this);
    }

    public final Object qoPGr6Ce(int i) {
        int i2 = this.wxUZMvaN;
        Object[] objArr = this.MdtA4re8;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.NCTxEWno;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                a1.ESscZ9M1(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.MdtA4re8;
                a1.VGmz0ccI(objArr2, objArr2, i, i4, i2);
            }
            this.MdtA4re8[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.NCTxEWno = iArr2;
            this.MdtA4re8 = new Object[i5];
            if (i > 0) {
                a1.ESscZ9M1(0, 0, i, iArr, iArr2);
                a1.LfKQckgD(objArr, this.MdtA4re8, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                a1.ESscZ9M1(i, i6, i2, iArr, this.NCTxEWno);
                a1.VGmz0ccI(objArr, this.MdtA4re8, i, i6, i2);
            }
        }
        if (i2 != this.wxUZMvaN) {
            throw new ConcurrentModificationException();
        }
        this.wxUZMvaN = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int amk52bBQ = obj == null ? fn.amk52bBQ(this, null, 0) : fn.amk52bBQ(this, obj, obj.hashCode());
        if (amk52bBQ < 0) {
            return false;
        }
        qoPGr6Ce(amk52bBQ);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.wxUZMvaN - 1; -1 < i; i--) {
            if (!x5.g2aRJUAd(collection, this.MdtA4re8[i])) {
                qoPGr6Ce(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.wxUZMvaN;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.wxUZMvaN;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        a1.VGmz0ccI(this.MdtA4re8, objArr, 0, 0, this.wxUZMvaN);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.wxUZMvaN * 14);
        sb.append('{');
        int i = this.wxUZMvaN;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.MdtA4re8[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return a1.pP9Y2m6O(this.MdtA4re8, 0, this.wxUZMvaN);
    }
}
