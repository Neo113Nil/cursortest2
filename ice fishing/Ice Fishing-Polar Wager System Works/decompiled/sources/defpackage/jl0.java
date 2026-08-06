package defpackage;

/* loaded from: classes.dex */
public final class jl0 implements defpackage.i90, java.util.Set, defpackage.g90 {
    public final defpackage.hl0 adDC3e2L;
    public final defpackage.hl0 xiZrDbcSW0;

    public jl0(defpackage.hl0 hl0Var) {
        hl0Var.getClass();
        this.adDC3e2L = hl0Var;
        this.xiZrDbcSW0 = hl0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.xiZrDbcSW0.IHQe1A4L2xu(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.hl0 hl0Var = this.xiZrDbcSW0;
        hl0Var.getClass();
        int i = hl0Var.AARZUJiTa;
        for (java.lang.Object obj : collection) {
            int F7NU4MC0GW = hl0Var.F7NU4MC0GW(obj);
            hl0Var.oh6vYeIP[F7NU4MC0GW] = obj;
            long[] jArr = hl0Var.r1MBDhnF;
            int i2 = hl0Var.F7NU4MC0GW;
            jArr[F7NU4MC0GW] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((F7NU4MC0GW & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            hl0Var.F7NU4MC0GW = F7NU4MC0GW;
            if (hl0Var.adDC3e2L == Integer.MAX_VALUE) {
                hl0Var.adDC3e2L = F7NU4MC0GW;
            }
        }
        return i != hl0Var.AARZUJiTa;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.xiZrDbcSW0.oh6vYeIP();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.r1MBDhnF(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.adDC3e2L.r1MBDhnF(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.jl0.class != obj.getClass()) {
            return false;
        }
        return defpackage.x70.QoRHpC4k(this.adDC3e2L, ((defpackage.jl0) obj).adDC3e2L);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.adDC3e2L.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.AARZUJiTa == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.f20(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.xiZrDbcSW0.AARZUJiTa(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(java.util.Collection collection) {
        int i;
        int i2;
        collection.getClass();
        defpackage.hl0 hl0Var = this.xiZrDbcSW0;
        hl0Var.getClass();
        int i3 = hl0Var.AARZUJiTa;
        java.util.Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = hl0Var.xiZrDbcSW0;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = hl0Var.IHQe1A4L2xu;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (defpackage.x70.QoRHpC4k(hl0Var.oh6vYeIP[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                hl0Var.EXtogiMhuM(i2);
            }
        }
        return i3 != hl0Var.AARZUJiTa;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return this.xiZrDbcSW0.riuEU0zW4(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.adDC3e2L.AARZUJiTa;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }

    public final java.lang.String toString() {
        return this.adDC3e2L.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }
}
