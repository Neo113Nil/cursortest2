package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements Collection, Set, qc.b, qc.f {

    /* renamed from: g, reason: collision with root package name */
    public int[] f6263g = t.a.f6507a;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f6264h = t.a.f6509c;

    /* renamed from: i, reason: collision with root package name */
    public int f6265i;

    public g(int i10) {
        if (i10 > 0) {
            p.a(this, i10);
        }
    }

    public final Object a(int i10) {
        int i11 = this.f6265i;
        Object[] objArr = this.f6264h;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f6263g;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                bc.l.P(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f6264h;
                bc.l.R(objArr2, objArr2, i10, i13, i11);
            }
            this.f6264h[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f6263g = iArr2;
            this.f6264h = new Object[i14];
            if (i10 > 0) {
                bc.l.S(0, i10, 6, iArr, iArr2);
                bc.l.T(objArr, this.f6264h, 0, i10, 6);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                bc.l.P(i10, i15, i11, iArr, this.f6263g);
                bc.l.R(objArr, this.f6264h, i10, i15, i11);
            }
        }
        if (i11 != this.f6265i) {
            throw new ConcurrentModificationException();
        }
        this.f6265i = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int b2;
        int i11 = this.f6265i;
        if (obj == null) {
            b2 = p.b(this, null, 0);
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            b2 = p.b(this, obj, hashCode);
        }
        if (b2 >= 0) {
            return false;
        }
        int i12 = ~b2;
        int[] iArr = this.f6263g;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f6264h;
            int[] iArr2 = new int[i13];
            this.f6263g = iArr2;
            this.f6264h = new Object[i13];
            if (i11 != this.f6265i) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                bc.l.S(0, iArr.length, 6, iArr, iArr2);
                bc.l.T(objArr, this.f6264h, 0, objArr.length, 6);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f6263g;
            int i14 = i12 + 1;
            bc.l.P(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f6264h;
            bc.l.R(objArr2, objArr2, i14, i12, i11);
        }
        int i15 = this.f6265i;
        if (i11 == i15) {
            int[] iArr4 = this.f6263g;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f6264h[i12] = obj;
                this.f6265i = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        pc.j.e(collection, "elements");
        int size = collection.size() + this.f6265i;
        int i10 = this.f6265i;
        int[] iArr = this.f6263g;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6264h;
            int[] iArr2 = new int[size];
            this.f6263g = iArr2;
            this.f6264h = new Object[size];
            if (i10 > 0) {
                bc.l.S(0, i10, 6, iArr, iArr2);
                bc.l.T(objArr, this.f6264h, 0, this.f6265i, 6);
            }
        }
        if (this.f6265i != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f6265i != 0) {
            this.f6263g = t.a.f6507a;
            this.f6264h = t.a.f6509c;
            this.f6265i = 0;
        }
        if (this.f6265i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? p.b(this, null, 0) : p.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        pc.j.e(collection, "elements");
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
        if (!(obj instanceof Set) || this.f6265i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f6265i;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f6264h[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f6263g;
        int i10 = this.f6265i;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f6265i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b2 = obj == null ? p.b(this, null, 0) : p.b(this, obj, obj.hashCode());
        if (b2 < 0) {
            return false;
        }
        a(b2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        pc.j.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        pc.j.e(collection, "elements");
        boolean z10 = false;
        for (int i10 = this.f6265i - 1; -1 < i10; i10--) {
            if (!bc.m.R(collection, this.f6264h[i10])) {
                a(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f6265i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return bc.l.U(this.f6264h, 0, this.f6265i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6265i * 14);
        sb.append('{');
        int i10 = this.f6265i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f6264h[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        pc.j.e(objArr, "array");
        int i10 = this.f6265i;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        bc.l.R(this.f6264h, objArr, 0, 0, this.f6265i);
        return objArr;
    }
}
