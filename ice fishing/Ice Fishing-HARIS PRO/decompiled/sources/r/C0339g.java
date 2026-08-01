package r;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import s.AbstractC0346a;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339g implements Collection, Set, E1.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4311a = AbstractC0346a.f4337a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4312b = AbstractC0346a.f4338b;

    /* renamed from: c, reason: collision with root package name */
    public int f4313c;

    public final Object a(int i) {
        int i2 = this.f4313c;
        Object[] objArr = this.f4312b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f4311a;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    u1.f.E(i, i4, i2, iArr, iArr);
                    Object[] objArr2 = this.f4312b;
                    u1.f.F(objArr2, objArr2, i, i4, i2);
                }
                this.f4312b[i3] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr2 = new int[i5];
                this.f4311a = iArr2;
                this.f4312b = new Object[i5];
                if (i > 0) {
                    u1.f.E(0, 0, i, iArr, iArr2);
                    u1.f.G(objArr, this.f4312b, 0, i, 6);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    u1.f.E(i, i6, i2, iArr, this.f4311a);
                    u1.f.F(objArr, this.f4312b, i, i6, i2);
                }
            }
            if (i2 != this.f4313c) {
                throw new ConcurrentModificationException();
            }
            this.f4313c = i3;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int b2;
        int i2 = this.f4313c;
        if (obj == null) {
            b2 = AbstractC0341i.b(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            b2 = AbstractC0341i.b(this, obj, hashCode);
        }
        if (b2 >= 0) {
            return false;
        }
        int i3 = ~b2;
        int[] iArr = this.f4311a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f4312b;
            int[] iArr2 = new int[i4];
            this.f4311a = iArr2;
            this.f4312b = new Object[i4];
            if (i2 != this.f4313c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                u1.f.E(0, 0, iArr.length, iArr, iArr2);
                u1.f.G(objArr, this.f4312b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f4311a;
            int i5 = i3 + 1;
            u1.f.E(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.f4312b;
            u1.f.F(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f4313c;
        if (i2 == i6) {
            int[] iArr4 = this.f4311a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f4312b[i3] = obj;
                this.f4313c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        D1.i.e(collection, "elements");
        int size = collection.size() + this.f4313c;
        int i = this.f4313c;
        int[] iArr = this.f4311a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4312b;
            int[] iArr2 = new int[size];
            this.f4311a = iArr2;
            this.f4312b = new Object[size];
            int i2 = this.f4313c;
            if (i2 > 0) {
                u1.f.E(0, 0, i2, iArr, iArr2);
                u1.f.G(objArr, this.f4312b, 0, this.f4313c, 6);
            }
        }
        if (this.f4313c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f4313c != 0) {
            this.f4311a = AbstractC0346a.f4337a;
            this.f4312b = AbstractC0346a.f4338b;
            this.f4313c = 0;
        }
        if (this.f4313c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0341i.b(this, null, 0) : AbstractC0341i.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        D1.i.e(collection, "elements");
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
        if ((obj instanceof Set) && this.f4313c == ((Set) obj).size()) {
            try {
                int i = this.f4313c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.f4312b[i2])) {
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
        int[] iArr = this.f4311a;
        int i = this.f4313c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4313c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0334b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b2 = obj == null ? AbstractC0341i.b(this, null, 0) : AbstractC0341i.b(this, obj, obj.hashCode());
        if (b2 < 0) {
            return false;
        }
        a(b2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        D1.i.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        D1.i.e(collection, "elements");
        boolean z2 = false;
        for (int i = this.f4313c - 1; -1 < i; i--) {
            if (!u1.g.L(collection, this.f4312b[i])) {
                a(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4313c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f4312b;
        int i = this.f4313c;
        D1.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
            D1.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4313c * 14);
        sb.append('{');
        int i = this.f4313c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4312b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        D1.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        D1.i.e(objArr, "array");
        int i = this.f4313c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        u1.f.F(this.f4312b, objArr, 0, 0, this.f4313c);
        return objArr;
    }
}
