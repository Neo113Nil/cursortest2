package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bo0 implements defpackage.pb0, java.util.Set, defpackage.nb0 {
    public final defpackage.zn0 WDYagTQQm9ns;
    public final defpackage.zn0 oh71FJcDz6S2;

    public bo0(defpackage.zn0 zn0Var) {
        this.WDYagTQQm9ns = zn0Var;
        this.oh71FJcDz6S2 = zn0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.oh71FJcDz6S2.ZpBGe2uQfcn8(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.zn0 zn0Var = this.oh71FJcDz6S2;
        int i = zn0Var.JhCgjQRTAOCT;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            zn0Var.Ns0WNyEWdPsk(it.next());
        }
        return i != zn0Var.JhCgjQRTAOCT;
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
        if (obj == null || defpackage.bo0.class != obj.getClass()) {
            return false;
        }
        return this.WDYagTQQm9ns.equals(((defpackage.bo0) obj).WDYagTQQm9ns);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.WDYagTQQm9ns.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.QiMR8OkAhezm();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.l30(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.oh71FJcDz6S2.fNwYGHIYeJcR(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.zn0 zn0Var = this.oh71FJcDz6S2;
        int i = zn0Var.JhCgjQRTAOCT;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            zn0Var.e6mdH7fiFuta(it.next());
        }
        return i != zn0Var.JhCgjQRTAOCT;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.zn0 zn0Var = this.oh71FJcDz6S2;
        java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
        int i = zn0Var.JhCgjQRTAOCT;
        long[] jArr = zn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!defpackage.hf.PS16moFv2oLu(collection, objArr[i5])) {
                                zn0Var.h3m55N1URyyK(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != zn0Var.JhCgjQRTAOCT;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.WDYagTQQm9ns.JhCgjQRTAOCT;
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
