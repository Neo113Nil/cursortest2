package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jpi implements o9f, Set, j9f {
    public final hpi a;
    public final hpi b;

    public jpi(hpi hpiVar) {
        hpiVar.getClass();
        hpiVar.getClass();
        this.a = hpiVar;
        this.b = hpiVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        hpi hpiVar = this.b;
        hpiVar.getClass();
        collection2.getClass();
        int i = hpiVar.g;
        for (Object obj : collection2) {
            int d = hpiVar.d(obj);
            hpiVar.b[d] = obj;
            long[] jArr = hpiVar.c;
            int i2 = hpiVar.d;
            jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            hpiVar.d = d;
            if (hpiVar.e == Integer.MAX_VALUE) {
                hpiVar.e = d;
            }
        }
        return i != hpiVar.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.c(it.next())) {
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
        if (obj == null || jpi.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.d(this.a, ((jpi) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g5d(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        collection.getClass();
        Collection collection2 = collection;
        hpi hpiVar = this.b;
        hpiVar.getClass();
        collection2.getClass();
        int i2 = hpiVar.g;
        Iterator it = collection2.iterator();
        while (true) {
            int i3 = 1;
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 & 127;
            int i7 = hpiVar.f;
            int i8 = (i5 >>> 7) & i7;
            while (true) {
                long[] jArr = hpiVar.a;
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                int i11 = i3;
                int i12 = i4;
                long j = (((-i10) >> 63) & (jArr[i9 + i3] << (64 - i10))) | (jArr[i9] >>> i10);
                long j2 = (i6 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j4) >> 3) + i8) & i7;
                    long j5 = j3;
                    if (Intrinsics.d(hpiVar.b[i], next)) {
                        break;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i4 = i12 + 8;
                i8 = (i8 + i4) & i7;
                i3 = i11;
            }
            if (i >= 0) {
                hpiVar.h(i);
            }
        }
        return i2 != hpiVar.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return hld.L(this, objArr);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return hld.K(this);
    }
}
