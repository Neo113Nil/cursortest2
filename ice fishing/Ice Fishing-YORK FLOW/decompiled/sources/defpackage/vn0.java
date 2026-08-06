package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vn0 implements defpackage.pb0, java.util.Set, defpackage.nb0 {
    public final defpackage.tn0 WDYagTQQm9ns;
    public final defpackage.tn0 oh71FJcDz6S2;

    public vn0(defpackage.tn0 tn0Var) {
        tn0Var.getClass();
        this.WDYagTQQm9ns = tn0Var;
        this.oh71FJcDz6S2 = tn0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.oh71FJcDz6S2.ZpBGe2uQfcn8(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.tn0 tn0Var = this.oh71FJcDz6S2;
        tn0Var.getClass();
        int i = tn0Var.QiMR8OkAhezm;
        for (java.lang.Object obj : collection) {
            int JhCgjQRTAOCT = tn0Var.JhCgjQRTAOCT(obj);
            tn0Var.giKS3J6vZuNy[JhCgjQRTAOCT] = obj;
            long[] jArr = tn0Var.fWTAfUmVKrZq;
            int i2 = tn0Var.JhCgjQRTAOCT;
            jArr[JhCgjQRTAOCT] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((JhCgjQRTAOCT & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            tn0Var.JhCgjQRTAOCT = JhCgjQRTAOCT;
            if (tn0Var.WDYagTQQm9ns == Integer.MAX_VALUE) {
                tn0Var.WDYagTQQm9ns = JhCgjQRTAOCT;
            }
        }
        return i != tn0Var.QiMR8OkAhezm;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.oh71FJcDz6S2.giKS3J6vZuNy();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.WDYagTQQm9ns.fWTAfUmVKrZq(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.WDYagTQQm9ns.fWTAfUmVKrZq(it.next())) {
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
        if (obj == null || defpackage.vn0.class != obj.getClass()) {
            return false;
        }
        return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, ((defpackage.vn0) obj).WDYagTQQm9ns);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.WDYagTQQm9ns.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.QiMR8OkAhezm == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.l30(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.oh71FJcDz6S2.QiMR8OkAhezm(obj);
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
        defpackage.tn0 tn0Var = this.oh71FJcDz6S2;
        tn0Var.getClass();
        int i3 = tn0Var.QiMR8OkAhezm;
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
            int i8 = tn0Var.oh71FJcDz6S2;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = tn0Var.ZpBGe2uQfcn8;
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
                    if (defpackage.ma0.QiMR8OkAhezm(tn0Var.giKS3J6vZuNy[i2], next)) {
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
                tn0Var.P05cfTpS5W5L(i2);
            }
        }
        return i3 != tn0Var.QiMR8OkAhezm;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return this.oh71FJcDz6S2.e6mdH7fiFuta(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.WDYagTQQm9ns.QiMR8OkAhezm;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return defpackage.i61.Mearx7yMn90V(this, objArr);
    }

    public final java.lang.String toString() {
        return this.WDYagTQQm9ns.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.i61.jjTN4uUnoyEn(this);
    }
}
