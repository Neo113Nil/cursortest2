package com.gamericefishpro.space.t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, com.gamericefishpro.space.fi.b, com.gamericefishpro.space.fi.f {
    public int[] d = com.gamericefishpro.space.u.a.a;
    public Object[] e = com.gamericefishpro.space.u.a.c;
    public int i;

    public f(int i) {
        if (i > 0) {
            r.b(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iC;
        int i2 = this.i;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = r.c(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = r.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i3 = ~iC;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.e;
            r.b(this, i4);
            if (i2 != this.i) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.d;
            if (iArr2.length != 0) {
                com.gamericefishpro.space.ph.u.f(0, iArr.length, 6, iArr, iArr2);
                com.gamericefishpro.space.ph.u.g(0, objArr.length, 6, objArr, this.e);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.d;
            int i5 = i3 + 1;
            com.gamericefishpro.space.ph.u.c(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.e;
            com.gamericefishpro.space.ph.u.d(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.i;
        if (i2 == i6) {
            int[] iArr4 = this.d;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.e[i3] = obj;
                this.i = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.i;
        int i = this.i;
        int[] iArr = this.d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            r.b(this, size);
            int i2 = this.i;
            if (i2 > 0) {
                com.gamericefishpro.space.ph.u.f(0, i2, 6, iArr, this.d);
                com.gamericefishpro.space.ph.u.g(0, this.i, 6, objArr, this.e);
            }
        }
        if (this.i != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2 = this.i;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                com.gamericefishpro.space.ph.u.c(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.e;
                com.gamericefishpro.space.ph.u.d(i, i4, i2, objArr2, objArr2);
            }
            this.e[i3] = null;
        } else {
            r.b(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                com.gamericefishpro.space.ph.u.f(0, i, 6, iArr, this.d);
                com.gamericefishpro.space.ph.u.g(0, i, 6, objArr, this.e);
            }
            if (i < i3) {
                int i5 = i + 1;
                com.gamericefishpro.space.ph.u.c(i, i5, i2, iArr, this.d);
                com.gamericefishpro.space.ph.u.d(i, i5, i2, objArr, this.e);
            }
        }
        if (i2 != this.i) {
            throw new ConcurrentModificationException();
        }
        this.i = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.i != 0) {
            int[] iArr = com.gamericefishpro.space.u.a.a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.d = iArr;
            Object[] objArr = com.gamericefishpro.space.u.a.c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.e = objArr;
            this.i = 0;
        }
        if (this.i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = r.c(this, null, 0);
        } else {
            iC = r.c(this, obj, obj.hashCode());
        }
        return iC >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
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
        if (!(obj instanceof Set) || this.i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.i;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.e[i2])) {
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
        int[] iArr = this.d;
        int i = this.i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = r.c(this, null, 0);
        } else {
            iC = r.c(this, obj, obj.hashCode());
        }
        if (iC < 0) {
            return false;
        }
        b(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        for (int i = this.i - 1; -1 < i; i--) {
            if (!CollectionsKt.t(elements, this.e[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return com.gamericefishpro.space.ph.u.h(this.e, 0, this.i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 14);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.e[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i = this.i;
        if (array.length < i) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i);
        } else if (array.length > i) {
            array[i] = null;
        }
        com.gamericefishpro.space.ph.u.d(0, 0, this.i, this.e, array);
        Intrinsics.b(array);
        return array;
    }
}
