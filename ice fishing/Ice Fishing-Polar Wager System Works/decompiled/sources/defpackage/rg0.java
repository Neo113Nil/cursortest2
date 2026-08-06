package defpackage;

/* loaded from: classes.dex */
public final class rg0 implements java.util.Map, java.io.Serializable, defpackage.h90 {
    public static final defpackage.rg0 kd6TUFXn;
    public int[] AARZUJiTa;
    public int DFo87pBq1E5;
    public int[] EXtogiMhuM;
    public boolean G3OKOH3wZRC;
    public int JlrlGoKF;
    public defpackage.sg0 QoRHpC4k;
    public int SH1y5HwkJhh;
    public defpackage.sg0 SyNS6RMn;
    public java.lang.Object[] adDC3e2L;
    public defpackage.tg0 cnag84Bm;
    public int ez2rX8ReCYw;
    public int riuEU0zW4;
    public java.lang.Object[] xiZrDbcSW0;

    static {
        defpackage.rg0 rg0Var = new defpackage.rg0(0);
        rg0Var.G3OKOH3wZRC = true;
        kd6TUFXn = rg0Var;
    }

    public rg0(int i) {
        if (i < 0) {
            defpackage.db.fnWB2E7cs("capacity must be non-negative.");
            throw null;
        }
        java.lang.Object[] objArr = new java.lang.Object[i];
        int[] iArr = new int[i];
        int highestOneBit = java.lang.Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.adDC3e2L = objArr;
        this.xiZrDbcSW0 = null;
        this.AARZUJiTa = iArr;
        this.EXtogiMhuM = new int[highestOneBit];
        this.riuEU0zW4 = 2;
        this.SH1y5HwkJhh = 0;
        this.ez2rX8ReCYw = java.lang.Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int AARZUJiTa(java.lang.Object obj) {
        int riuEU0zW4 = riuEU0zW4(obj);
        int i = this.riuEU0zW4;
        while (true) {
            int i2 = this.EXtogiMhuM[riuEU0zW4];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            riuEU0zW4 = riuEU0zW4 == 0 ? this.EXtogiMhuM.length - 1 : riuEU0zW4 - 1;
        }
    }

    public final int EXtogiMhuM(java.lang.Object obj) {
        int i = this.SH1y5HwkJhh;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.AARZUJiTa[i] >= 0) {
                java.lang.Object[] objArr = this.xiZrDbcSW0;
                objArr.getClass();
                if (defpackage.x70.QoRHpC4k(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final void F7NU4MC0GW(boolean z) {
        int i;
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.SH1y5HwkJhh;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.AARZUJiTa;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                java.lang.Object[] objArr2 = this.adDC3e2L;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.EXtogiMhuM[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        defpackage.x80.mAr5m2L7gYDP(this.adDC3e2L, i3, i);
        if (objArr != null) {
            defpackage.x80.mAr5m2L7gYDP(objArr, i3, this.SH1y5HwkJhh);
        }
        this.SH1y5HwkJhh = i3;
    }

    public final int IHQe1A4L2xu(java.lang.Object obj) {
        r1MBDhnF();
        while (true) {
            int riuEU0zW4 = riuEU0zW4(obj);
            int i = this.riuEU0zW4 * 2;
            int length = this.EXtogiMhuM.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.EXtogiMhuM;
                int i3 = iArr[riuEU0zW4];
                if (i3 == 0) {
                    int i4 = this.SH1y5HwkJhh;
                    java.lang.Object[] objArr = this.adDC3e2L;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.SH1y5HwkJhh = i5;
                        objArr[i4] = obj;
                        this.AARZUJiTa[i4] = riuEU0zW4;
                        iArr[riuEU0zW4] = i5;
                        this.DFo87pBq1E5++;
                        this.JlrlGoKF++;
                        if (i2 > this.riuEU0zW4) {
                            this.riuEU0zW4 = i2;
                        }
                        return i4;
                    }
                    xiZrDbcSW0(1);
                } else {
                    if (defpackage.x70.QoRHpC4k(this.adDC3e2L[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        SH1y5HwkJhh(this.EXtogiMhuM.length * 2);
                        break;
                    }
                    riuEU0zW4 = riuEU0zW4 == 0 ? this.EXtogiMhuM.length - 1 : riuEU0zW4 - 1;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.AARZUJiTa[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void SH1y5HwkJhh(int i) {
        this.JlrlGoKF++;
        int i2 = 0;
        if (this.SH1y5HwkJhh > this.DFo87pBq1E5) {
            F7NU4MC0GW(false);
        }
        this.EXtogiMhuM = new int[i];
        this.ez2rX8ReCYw = java.lang.Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.SH1y5HwkJhh) {
            int i3 = i2 + 1;
            int riuEU0zW4 = riuEU0zW4(this.adDC3e2L[i2]);
            int i4 = this.riuEU0zW4;
            while (true) {
                int[] iArr = this.EXtogiMhuM;
                if (iArr[riuEU0zW4] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    defpackage.db.AARZUJiTa("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                riuEU0zW4 = riuEU0zW4 == 0 ? iArr.length - 1 : riuEU0zW4 - 1;
            }
        }
    }

    public final boolean adDC3e2L(java.util.Collection collection) {
        boolean QoRHpC4k;
        collection.getClass();
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                try {
                    java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                    int AARZUJiTa = AARZUJiTa(entry.getKey());
                    if (AARZUJiTa < 0) {
                        QoRHpC4k = false;
                    } else {
                        java.lang.Object[] objArr = this.xiZrDbcSW0;
                        objArr.getClass();
                        QoRHpC4k = defpackage.x70.QoRHpC4k(objArr[AARZUJiTa], entry.getValue());
                    }
                    if (!QoRHpC4k) {
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        r1MBDhnF();
        int i = this.SH1y5HwkJhh - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.AARZUJiTa;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.EXtogiMhuM[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        defpackage.x80.mAr5m2L7gYDP(this.adDC3e2L, 0, this.SH1y5HwkJhh);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (objArr != null) {
            defpackage.x80.mAr5m2L7gYDP(objArr, 0, this.SH1y5HwkJhh);
        }
        this.DFo87pBq1E5 = 0;
        this.SH1y5HwkJhh = 0;
        this.JlrlGoKF++;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return AARZUJiTa(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return EXtogiMhuM(obj) >= 0;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.sg0 sg0Var = this.QoRHpC4k;
        if (sg0Var != null) {
            return sg0Var;
        }
        defpackage.sg0 sg0Var2 = new defpackage.sg0(this, 0);
        this.QoRHpC4k = sg0Var2;
        return sg0Var2;
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
        return this.DFo87pBq1E5 == map.size() && adDC3e2L(map.entrySet());
    }

    public final void ez2rX8ReCYw(int i) {
        int i2;
        int i3;
        int riuEU0zW4;
        int[] iArr;
        java.lang.Object[] objArr = this.adDC3e2L;
        objArr.getClass();
        objArr[i] = null;
        java.lang.Object[] objArr2 = this.xiZrDbcSW0;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.AARZUJiTa[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.EXtogiMhuM.length - 1 : i4 - 1;
                int[] iArr2 = this.EXtogiMhuM;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.riuEU0zW4) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    riuEU0zW4 = riuEU0zW4(this.adDC3e2L[i3]) - i4;
                    iArr = this.EXtogiMhuM;
                }
            } while ((riuEU0zW4 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.AARZUJiTa[i3] = i5;
        }
        this.AARZUJiTa[i] = -1;
        this.DFo87pBq1E5--;
        this.JlrlGoKF++;
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        int AARZUJiTa = AARZUJiTa(obj);
        if (AARZUJiTa < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        objArr.getClass();
        return objArr[AARZUJiTa];
    }

    @Override // java.util.Map
    public final int hashCode() {
        defpackage.og0 og0Var = new defpackage.og0(this, 0);
        int i = 0;
        while (og0Var.hasNext()) {
            int i2 = og0Var.adDC3e2L;
            defpackage.rg0 rg0Var = (defpackage.rg0) og0Var.EXtogiMhuM;
            if (i2 >= rg0Var.SH1y5HwkJhh) {
                defpackage.db.DFo87pBq1E5();
                return 0;
            }
            og0Var.adDC3e2L = i2 + 1;
            og0Var.xiZrDbcSW0 = i2;
            java.lang.Object obj = rg0Var.adDC3e2L[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = rg0Var.xiZrDbcSW0;
            objArr.getClass();
            java.lang.Object obj2 = objArr[og0Var.xiZrDbcSW0];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            og0Var.r1MBDhnF();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.DFo87pBq1E5 == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.sg0 sg0Var = this.SyNS6RMn;
        if (sg0Var != null) {
            return sg0Var;
        }
        defpackage.sg0 sg0Var2 = new defpackage.sg0(this, 1);
        this.SyNS6RMn = sg0Var2;
        return sg0Var2;
    }

    public final defpackage.rg0 oh6vYeIP() {
        r1MBDhnF();
        this.G3OKOH3wZRC = true;
        if (this.DFo87pBq1E5 > 0) {
            return this;
        }
        defpackage.rg0 rg0Var = kd6TUFXn;
        rg0Var.getClass();
        return rg0Var;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        r1MBDhnF();
        int IHQe1A4L2xu = IHQe1A4L2xu(obj);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (objArr == null) {
            int length = this.adDC3e2L.length;
            if (length < 0) {
                defpackage.db.fnWB2E7cs("capacity must be non-negative.");
                return null;
            }
            objArr = new java.lang.Object[length];
            this.xiZrDbcSW0 = objArr;
        }
        if (IHQe1A4L2xu >= 0) {
            objArr[IHQe1A4L2xu] = obj2;
            return null;
        }
        int i = (-IHQe1A4L2xu) - 1;
        java.lang.Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        map.getClass();
        r1MBDhnF();
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        xiZrDbcSW0(entrySet.size());
        for (java.util.Map.Entry entry : entrySet) {
            int IHQe1A4L2xu = IHQe1A4L2xu(entry.getKey());
            java.lang.Object[] objArr = this.xiZrDbcSW0;
            if (objArr == null) {
                int length = this.adDC3e2L.length;
                if (length < 0) {
                    defpackage.db.fnWB2E7cs("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new java.lang.Object[length];
                    this.xiZrDbcSW0 = objArr;
                }
            }
            if (IHQe1A4L2xu >= 0) {
                objArr[IHQe1A4L2xu] = entry.getValue();
            } else {
                int i = (-IHQe1A4L2xu) - 1;
                if (!defpackage.x70.QoRHpC4k(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    public final void r1MBDhnF() {
        if (this.G3OKOH3wZRC) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        r1MBDhnF();
        int AARZUJiTa = AARZUJiTa(obj);
        if (AARZUJiTa < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        objArr.getClass();
        java.lang.Object obj2 = objArr[AARZUJiTa];
        ez2rX8ReCYw(AARZUJiTa);
        return obj2;
    }

    public final int riuEU0zW4(java.lang.Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.ez2rX8ReCYw;
    }

    @Override // java.util.Map
    public final int size() {
        return this.DFo87pBq1E5;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.DFo87pBq1E5 * 3) + 2);
        sb.append("{");
        int i = 0;
        defpackage.og0 og0Var = new defpackage.og0(this, 0);
        while (og0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = og0Var.adDC3e2L;
            defpackage.rg0 rg0Var = (defpackage.rg0) og0Var.EXtogiMhuM;
            if (i2 >= rg0Var.SH1y5HwkJhh) {
                defpackage.db.DFo87pBq1E5();
                return null;
            }
            og0Var.adDC3e2L = i2 + 1;
            og0Var.xiZrDbcSW0 = i2;
            java.lang.Object obj = rg0Var.adDC3e2L[i2];
            if (obj == rg0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            java.lang.Object[] objArr = rg0Var.xiZrDbcSW0;
            objArr.getClass();
            java.lang.Object obj2 = objArr[og0Var.xiZrDbcSW0];
            if (obj2 == rg0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            og0Var.r1MBDhnF();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.tg0 tg0Var = this.cnag84Bm;
        if (tg0Var != null) {
            return tg0Var;
        }
        defpackage.tg0 tg0Var2 = new defpackage.tg0(this);
        this.cnag84Bm = tg0Var2;
        return tg0Var2;
    }

    public final void xiZrDbcSW0(int i) {
        java.lang.Object[] objArr = this.adDC3e2L;
        int length = objArr.length;
        int i2 = this.SH1y5HwkJhh;
        int i3 = length - i2;
        int i4 = i2 - this.DFo87pBq1E5;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            F7NU4MC0GW(true);
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
            this.adDC3e2L = java.util.Arrays.copyOf(objArr, i6);
            java.lang.Object[] objArr2 = this.xiZrDbcSW0;
            this.xiZrDbcSW0 = objArr2 != null ? java.util.Arrays.copyOf(objArr2, i6) : null;
            this.AARZUJiTa = java.util.Arrays.copyOf(this.AARZUJiTa, i6);
            int highestOneBit = java.lang.Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.EXtogiMhuM.length) {
                SH1y5HwkJhh(highestOneBit);
            }
        }
    }

    public rg0() {
        this(8);
    }
}
