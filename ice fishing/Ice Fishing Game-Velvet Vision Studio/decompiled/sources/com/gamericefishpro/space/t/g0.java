package com.gamericefishpro.space.t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements com.gamericefishpro.space.fi.f, Set, com.gamericefishpro.space.fi.a {
    public final e0 d;
    public final e0 e;

    public g0(e0 parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.d = parent;
        this.e = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection elements2 = elements;
        e0 e0Var = this.e;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(elements2, "elements");
        int i = e0Var.g;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        for (Object obj : elements2) {
            int iD = e0Var.d(obj);
            e0Var.b[iD] = obj;
            long[] jArr = e0Var.c;
            int i2 = e0Var.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            e0Var.d = iD;
            if (e0Var.e == Integer.MAX_VALUE) {
                e0Var.e = iD;
            }
        }
        return i != e0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.d.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.a(this.d, ((g0) obj).d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.d.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new com.gamericefishpro.space.li.e(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.e.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        int iNumberOfTrailingZeros;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection elements2 = elements;
        e0 e0Var = this.e;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(elements2, "elements");
        int i = e0Var.g;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Iterator it = elements2.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = e0Var.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = e0Var.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                int i10 = i2;
                int i11 = i3;
                long j = (((-i9) >> 63) & (jArr[i8 + i2] << (64 - i9))) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j4 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i6;
                    long j5 = j3;
                    if (Intrinsics.a(e0Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                if ((j & ((~j) << 6) & j3) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 = i11 + 8;
                i7 = (i7 + i3) & i6;
                i2 = i10;
            }
            if (iNumberOfTrailingZeros >= 0) {
                e0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i != e0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.e.i(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.d.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return com.gamericefishpro.space.ei.k.b(this);
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return com.gamericefishpro.space.ei.k.c(this, array);
    }
}
