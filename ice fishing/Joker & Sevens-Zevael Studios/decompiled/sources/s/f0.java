package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 implements qc.f, Set, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final c0 f6261g;

    /* renamed from: h, reason: collision with root package name */
    public final c0 f6262h;

    public f0(c0 c0Var) {
        pc.j.e(c0Var, "parent");
        this.f6261g = c0Var;
        this.f6262h = c0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f6262h.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        pc.j.e(collection, "elements");
        c0 c0Var = this.f6262h;
        c0Var.getClass();
        int i10 = c0Var.f6239g;
        for (Object obj : collection) {
            int d10 = c0Var.d(obj);
            c0Var.f6234b[d10] = obj;
            long[] jArr = c0Var.f6235c;
            int i11 = c0Var.f6236d;
            jArr[d10] = (i11 & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((d10 & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            c0Var.f6236d = d10;
            if (c0Var.f6237e == Integer.MAX_VALUE) {
                c0Var.f6237e = d10;
            }
        }
        return i10 != c0Var.f6239g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f6262h.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6261g.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        pc.j.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f6261g.c(it.next())) {
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
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return pc.j.a(this.f6261g, ((f0) obj).f6261g);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f6261g.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f6261g.f6239g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f6262h.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i10;
        pc.j.e(collection, "elements");
        c0 c0Var = this.f6262h;
        c0Var.getClass();
        int i11 = c0Var.f6239g;
        Iterator it = collection.iterator();
        while (true) {
            int i12 = 1;
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i14 = hashCode ^ (hashCode << 16);
            int i15 = i14 & 127;
            int i16 = c0Var.f6238f;
            int i17 = (i14 >>> 7) & i16;
            while (true) {
                long[] jArr = c0Var.f6233a;
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                int i20 = i12;
                int i21 = i13;
                long j3 = (((-i19) >> 63) & (jArr[i18 + i12] << (64 - i19))) | (jArr[i18] >>> i19);
                long j6 = (i15 * 72340172838076673L) ^ j3;
                long j10 = -9187201950435737472L;
                long j11 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i10 = ((Long.numberOfTrailingZeros(j11) >> 3) + i17) & i16;
                    long j12 = j10;
                    if (pc.j.a(c0Var.f6234b[i10], next)) {
                        break;
                    }
                    j11 &= j11 - 1;
                    j10 = j12;
                }
                i13 = i21 + 8;
                i17 = (i17 + i13) & i16;
                i12 = i20;
            }
            if (i10 >= 0) {
                c0Var.h(i10);
            }
        }
        return i11 != c0Var.f6239g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        pc.j.e(collection, "elements");
        return this.f6262h.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f6261g.f6239g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return pc.i.a(this);
    }

    public final String toString() {
        return this.f6261g.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        pc.j.e(objArr, "array");
        return pc.i.b(this, objArr);
    }
}
