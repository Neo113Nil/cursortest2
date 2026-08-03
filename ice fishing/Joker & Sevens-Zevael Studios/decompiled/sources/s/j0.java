package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 implements qc.f, Set, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final h0 f6293g;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f6294h;

    public j0(h0 h0Var) {
        this.f6293g = h0Var;
        this.f6294h = h0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f6294h.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        pc.j.e(collection, "elements");
        h0 h0Var = this.f6294h;
        int i10 = h0Var.f6277d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            h0Var.i(it.next());
        }
        return i10 != h0Var.f6277d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f6294h.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6293g.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        pc.j.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f6293g.c(it.next())) {
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
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        return pc.j.a(this.f6293g, ((j0) obj).f6293g);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f6293g.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f6293g.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f6294h.k(obj);
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
        h0 h0Var = this.f6294h;
        h0Var.getClass();
        int i11 = h0Var.f6277d;
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
            int i16 = h0Var.f6276c;
            int i17 = (i14 >>> 7) & i16;
            while (true) {
                long[] jArr = h0Var.f6274a;
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
                    if (pc.j.a(h0Var.f6275b[i10], next)) {
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
                h0Var.l(i10);
            }
        }
        return i11 != h0Var.f6277d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z10;
        pc.j.e(collection, "elements");
        h0 h0Var = this.f6294h;
        h0Var.getClass();
        Object[] objArr = h0Var.f6275b;
        int i10 = h0Var.f6277d;
        long[] jArr = h0Var.f6274a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!bc.m.R(collection, objArr[i14])) {
                                h0Var.l(i14);
                            }
                        }
                        j3 >>= 8;
                    }
                    z10 = false;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z10 = false;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        } else {
            z10 = false;
        }
        if (i10 != h0Var.f6277d) {
            return true;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f6293g.f6277d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return pc.i.a(this);
    }

    public final String toString() {
        return this.f6293g.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        pc.j.e(objArr, "array");
        return pc.i.b(this, objArr);
    }
}
