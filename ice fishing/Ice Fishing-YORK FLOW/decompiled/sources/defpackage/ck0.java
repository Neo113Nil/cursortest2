package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ck0 implements java.util.Map, java.io.Serializable, defpackage.ob0 {
    public static final defpackage.ck0 s0TASMVLSWD5;
    public int GE9mJIPrb8gP;
    public int Ns0WNyEWdPsk;
    public int[] P05cfTpS5W5L;
    public int[] QiMR8OkAhezm;
    public defpackage.ek0 T1fB7bDYiVJQ;
    public java.lang.Object[] WDYagTQQm9ns;
    public boolean WmetiUbpKU9I;
    public defpackage.dk0 XntWc4eZSQ8j;
    public int e6mdH7fiFuta;
    public int fNwYGHIYeJcR;
    public defpackage.dk0 gUjdnLbkVAaA;
    public int h3m55N1URyyK;
    public java.lang.Object[] oh71FJcDz6S2;

    static {
        defpackage.ck0 ck0Var = new defpackage.ck0(0);
        ck0Var.WmetiUbpKU9I = true;
        s0TASMVLSWD5 = ck0Var;
    }

    public ck0(int i) {
        if (i < 0) {
            defpackage.h7.w7APNrr0aGRc("capacity must be non-negative.");
            throw null;
        }
        java.lang.Object[] objArr = new java.lang.Object[i];
        int[] iArr = new int[i];
        int highestOneBit = java.lang.Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.WDYagTQQm9ns = objArr;
        this.oh71FJcDz6S2 = null;
        this.QiMR8OkAhezm = iArr;
        this.P05cfTpS5W5L = new int[highestOneBit];
        this.e6mdH7fiFuta = 2;
        this.GE9mJIPrb8gP = 0;
        this.Ns0WNyEWdPsk = java.lang.Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.QiMR8OkAhezm[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void GE9mJIPrb8gP(int i) {
        this.fNwYGHIYeJcR++;
        int i2 = 0;
        if (this.GE9mJIPrb8gP > this.h3m55N1URyyK) {
            JhCgjQRTAOCT(false);
        }
        this.P05cfTpS5W5L = new int[i];
        this.Ns0WNyEWdPsk = java.lang.Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.GE9mJIPrb8gP) {
            int i3 = i2 + 1;
            int e6mdH7fiFuta = e6mdH7fiFuta(this.WDYagTQQm9ns[i2]);
            int i4 = this.e6mdH7fiFuta;
            while (true) {
                int[] iArr = this.P05cfTpS5W5L;
                if (iArr[e6mdH7fiFuta] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    defpackage.h7.P05cfTpS5W5L("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                e6mdH7fiFuta = e6mdH7fiFuta == 0 ? iArr.length - 1 : e6mdH7fiFuta - 1;
            }
        }
    }

    public final void JhCgjQRTAOCT(boolean z) {
        int i;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.GE9mJIPrb8gP;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.QiMR8OkAhezm;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.P05cfTpS5W5L[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        defpackage.wc1.NkfcFfdaVTox(this.WDYagTQQm9ns, i3, i);
        if (objArr != null) {
            defpackage.wc1.NkfcFfdaVTox(objArr, i3, this.GE9mJIPrb8gP);
        }
        this.GE9mJIPrb8gP = i3;
    }

    public final void Ns0WNyEWdPsk(int i) {
        int i2;
        int i3;
        int e6mdH7fiFuta;
        int[] iArr;
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        objArr.getClass();
        objArr[i] = null;
        java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.QiMR8OkAhezm[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.P05cfTpS5W5L.length - 1 : i4 - 1;
                int[] iArr2 = this.P05cfTpS5W5L;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.e6mdH7fiFuta) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    e6mdH7fiFuta = e6mdH7fiFuta(this.WDYagTQQm9ns[i3]) - i4;
                    iArr = this.P05cfTpS5W5L;
                }
            } while ((e6mdH7fiFuta & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.QiMR8OkAhezm[i3] = i5;
        }
        this.QiMR8OkAhezm[i] = -1;
        this.h3m55N1URyyK--;
        this.fNwYGHIYeJcR++;
    }

    public final int P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.GE9mJIPrb8gP;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.QiMR8OkAhezm[i] >= 0) {
                java.lang.Object[] objArr = this.oh71FJcDz6S2;
                objArr.getClass();
                if (defpackage.ma0.QiMR8OkAhezm(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int QiMR8OkAhezm(java.lang.Object obj) {
        int e6mdH7fiFuta = e6mdH7fiFuta(obj);
        int i = this.e6mdH7fiFuta;
        while (true) {
            int i2 = this.P05cfTpS5W5L[e6mdH7fiFuta];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            e6mdH7fiFuta = e6mdH7fiFuta == 0 ? this.P05cfTpS5W5L.length - 1 : e6mdH7fiFuta - 1;
        }
    }

    public final boolean WDYagTQQm9ns(java.util.Collection collection) {
        boolean QiMR8OkAhezm;
        collection.getClass();
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                try {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    int QiMR8OkAhezm2 = QiMR8OkAhezm(entry.getKey());
                    if (QiMR8OkAhezm2 < 0) {
                        QiMR8OkAhezm = false;
                    } else {
                        java.lang.Object[] objArr = this.oh71FJcDz6S2;
                        objArr.getClass();
                        QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm(objArr[QiMR8OkAhezm2], entry.getValue());
                    }
                    if (!QiMR8OkAhezm) {
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final int ZpBGe2uQfcn8(java.lang.Object obj) {
        fWTAfUmVKrZq();
        while (true) {
            int e6mdH7fiFuta = e6mdH7fiFuta(obj);
            int i = this.e6mdH7fiFuta * 2;
            int length = this.P05cfTpS5W5L.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.P05cfTpS5W5L;
                int i3 = iArr[e6mdH7fiFuta];
                if (i3 == 0) {
                    int i4 = this.GE9mJIPrb8gP;
                    java.lang.Object[] objArr = this.WDYagTQQm9ns;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.GE9mJIPrb8gP = i5;
                        objArr[i4] = obj;
                        this.QiMR8OkAhezm[i4] = e6mdH7fiFuta;
                        iArr[e6mdH7fiFuta] = i5;
                        this.h3m55N1URyyK++;
                        this.fNwYGHIYeJcR++;
                        if (i2 > this.e6mdH7fiFuta) {
                            this.e6mdH7fiFuta = i2;
                        }
                        return i4;
                    }
                    oh71FJcDz6S2(1);
                } else {
                    if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        GE9mJIPrb8gP(this.P05cfTpS5W5L.length * 2);
                        break;
                    }
                    e6mdH7fiFuta = e6mdH7fiFuta == 0 ? this.P05cfTpS5W5L.length - 1 : e6mdH7fiFuta - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        fWTAfUmVKrZq();
        int i = this.GE9mJIPrb8gP - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.QiMR8OkAhezm;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.P05cfTpS5W5L[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        defpackage.wc1.NkfcFfdaVTox(this.WDYagTQQm9ns, 0, this.GE9mJIPrb8gP);
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (objArr != null) {
            defpackage.wc1.NkfcFfdaVTox(objArr, 0, this.GE9mJIPrb8gP);
        }
        this.h3m55N1URyyK = 0;
        this.GE9mJIPrb8gP = 0;
        this.fNwYGHIYeJcR++;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return QiMR8OkAhezm(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return P05cfTpS5W5L(obj) >= 0;
    }

    public final int e6mdH7fiFuta(java.lang.Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.Ns0WNyEWdPsk;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.dk0 dk0Var = this.XntWc4eZSQ8j;
        if (dk0Var != null) {
            return dk0Var;
        }
        defpackage.dk0 dk0Var2 = new defpackage.dk0(this, 0);
        this.XntWc4eZSQ8j = dk0Var2;
        return dk0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        return this.h3m55N1URyyK == map.size() && WDYagTQQm9ns(map.entrySet());
    }

    public final void fWTAfUmVKrZq() {
        if (this.WmetiUbpKU9I) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        int QiMR8OkAhezm = QiMR8OkAhezm(obj);
        if (QiMR8OkAhezm < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        objArr.getClass();
        return objArr[QiMR8OkAhezm];
    }

    public final defpackage.ck0 giKS3J6vZuNy() {
        fWTAfUmVKrZq();
        this.WmetiUbpKU9I = true;
        if (this.h3m55N1URyyK > 0) {
            return this;
        }
        defpackage.ck0 ck0Var = s0TASMVLSWD5;
        ck0Var.getClass();
        return ck0Var;
    }

    @Override // java.util.Map
    public final int hashCode() {
        defpackage.zj0 zj0Var = new defpackage.zj0(this, 0);
        int i = 0;
        while (zj0Var.hasNext()) {
            int i2 = zj0Var.WDYagTQQm9ns;
            defpackage.ck0 ck0Var = (defpackage.ck0) zj0Var.P05cfTpS5W5L;
            if (i2 >= ck0Var.GE9mJIPrb8gP) {
                defpackage.h7.BHfvd2J71qpO();
                return 0;
            }
            zj0Var.WDYagTQQm9ns = i2 + 1;
            zj0Var.oh71FJcDz6S2 = i2;
            java.lang.Object obj = ck0Var.WDYagTQQm9ns[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = ck0Var.oh71FJcDz6S2;
            objArr.getClass();
            java.lang.Object obj2 = objArr[zj0Var.oh71FJcDz6S2];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            zj0Var.fWTAfUmVKrZq();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.h3m55N1URyyK == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.dk0 dk0Var = this.gUjdnLbkVAaA;
        if (dk0Var != null) {
            return dk0Var;
        }
        defpackage.dk0 dk0Var2 = new defpackage.dk0(this, 1);
        this.gUjdnLbkVAaA = dk0Var2;
        return dk0Var2;
    }

    public final void oh71FJcDz6S2(int i) {
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int length = objArr.length;
        int i2 = this.GE9mJIPrb8gP;
        int i3 = length - i2;
        int i4 = i2 - this.h3m55N1URyyK;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            JhCgjQRTAOCT(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.WDYagTQQm9ns = java.util.Arrays.copyOf(objArr, i6);
            java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
            this.oh71FJcDz6S2 = objArr2 != null ? java.util.Arrays.copyOf(objArr2, i6) : null;
            this.QiMR8OkAhezm = java.util.Arrays.copyOf(this.QiMR8OkAhezm, i6);
            int highestOneBit = java.lang.Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.P05cfTpS5W5L.length) {
                GE9mJIPrb8gP(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        fWTAfUmVKrZq();
        int ZpBGe2uQfcn8 = ZpBGe2uQfcn8(obj);
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (objArr == null) {
            int length = this.WDYagTQQm9ns.length;
            if (length < 0) {
                defpackage.h7.w7APNrr0aGRc("capacity must be non-negative.");
                return null;
            }
            objArr = new java.lang.Object[length];
            this.oh71FJcDz6S2 = objArr;
        }
        if (ZpBGe2uQfcn8 >= 0) {
            objArr[ZpBGe2uQfcn8] = obj2;
            return null;
        }
        int i = (-ZpBGe2uQfcn8) - 1;
        java.lang.Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        map.getClass();
        fWTAfUmVKrZq();
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        oh71FJcDz6S2(entrySet.size());
        for (java.util.Map.Entry entry : entrySet) {
            int ZpBGe2uQfcn8 = ZpBGe2uQfcn8(entry.getKey());
            java.lang.Object[] objArr = this.oh71FJcDz6S2;
            if (objArr == null) {
                int length = this.WDYagTQQm9ns.length;
                if (length < 0) {
                    defpackage.h7.w7APNrr0aGRc("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new java.lang.Object[length];
                    this.oh71FJcDz6S2 = objArr;
                }
            }
            if (ZpBGe2uQfcn8 >= 0) {
                objArr[ZpBGe2uQfcn8] = entry.getValue();
            } else {
                int i = (-ZpBGe2uQfcn8) - 1;
                if (!defpackage.ma0.QiMR8OkAhezm(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        fWTAfUmVKrZq();
        int QiMR8OkAhezm = QiMR8OkAhezm(obj);
        if (QiMR8OkAhezm < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        objArr.getClass();
        java.lang.Object obj2 = objArr[QiMR8OkAhezm];
        Ns0WNyEWdPsk(QiMR8OkAhezm);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h3m55N1URyyK;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.h3m55N1URyyK * 3) + 2);
        sb.append("{");
        int i = 0;
        defpackage.zj0 zj0Var = new defpackage.zj0(this, 0);
        while (zj0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = zj0Var.WDYagTQQm9ns;
            defpackage.ck0 ck0Var = (defpackage.ck0) zj0Var.P05cfTpS5W5L;
            if (i2 >= ck0Var.GE9mJIPrb8gP) {
                defpackage.h7.BHfvd2J71qpO();
                return null;
            }
            zj0Var.WDYagTQQm9ns = i2 + 1;
            zj0Var.oh71FJcDz6S2 = i2;
            java.lang.Object obj = ck0Var.WDYagTQQm9ns[i2];
            if (obj == ck0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            java.lang.Object[] objArr = ck0Var.oh71FJcDz6S2;
            objArr.getClass();
            java.lang.Object obj2 = objArr[zj0Var.oh71FJcDz6S2];
            if (obj2 == ck0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            zj0Var.fWTAfUmVKrZq();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.ek0 ek0Var = this.T1fB7bDYiVJQ;
        if (ek0Var != null) {
            return ek0Var;
        }
        defpackage.ek0 ek0Var2 = new defpackage.ek0(0, this);
        this.T1fB7bDYiVJQ = ek0Var2;
        return ek0Var2;
    }

    public ck0() {
        this(8);
    }
}
