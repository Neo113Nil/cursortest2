package defpackage;

/* loaded from: classes.dex */
public class s91 {
    public int AARZUJiTa;
    public int[] adDC3e2L = defpackage.s21.r1MBDhnF;
    public java.lang.Object[] xiZrDbcSW0 = defpackage.s21.adDC3e2L;

    public final java.lang.Object AARZUJiTa(int i, java.lang.Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.AARZUJiTa) {
            z = true;
        }
        if (!z) {
            defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final java.lang.Object EXtogiMhuM(int i) {
        boolean z = false;
        if (i >= 0 && i < this.AARZUJiTa) {
            z = true;
        }
        if (z) {
            return this.xiZrDbcSW0[(i << 1) + 1];
        }
        defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int F7NU4MC0GW() {
        int i = this.AARZUJiTa;
        if (i == 0) {
            return -1;
        }
        int G3OKOH3wZRC = defpackage.s21.G3OKOH3wZRC(this.adDC3e2L, i, 0);
        if (G3OKOH3wZRC < 0 || this.xiZrDbcSW0[G3OKOH3wZRC << 1] == null) {
            return G3OKOH3wZRC;
        }
        int i2 = G3OKOH3wZRC + 1;
        while (i2 < i && this.adDC3e2L[i2] == 0) {
            if (this.xiZrDbcSW0[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = G3OKOH3wZRC - 1; i3 >= 0 && this.adDC3e2L[i3] == 0; i3--) {
            if (this.xiZrDbcSW0[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int IHQe1A4L2xu(java.lang.Object obj) {
        int i = this.AARZUJiTa * 2;
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final java.lang.Object adDC3e2L(int i) {
        boolean z = false;
        if (i >= 0 && i < this.AARZUJiTa) {
            z = true;
        }
        if (z) {
            return this.xiZrDbcSW0[i << 1];
        }
        defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final void clear() {
        if (this.AARZUJiTa > 0) {
            this.adDC3e2L = defpackage.s21.r1MBDhnF;
            this.xiZrDbcSW0 = defpackage.s21.adDC3e2L;
            this.AARZUJiTa = 0;
        }
        if (this.AARZUJiTa > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return r1MBDhnF(obj) >= 0;
    }

    public boolean containsValue(java.lang.Object obj) {
        return IHQe1A4L2xu(obj) >= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof defpackage.s91) {
                int i = this.AARZUJiTa;
                if (i != ((defpackage.s91) obj).AARZUJiTa) {
                    return false;
                }
                defpackage.s91 s91Var = (defpackage.s91) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    java.lang.Object adDC3e2L = adDC3e2L(i2);
                    java.lang.Object EXtogiMhuM = EXtogiMhuM(i2);
                    java.lang.Object obj2 = s91Var.get(adDC3e2L);
                    if (EXtogiMhuM == null) {
                        if (obj2 != null || !s91Var.containsKey(adDC3e2L)) {
                            return false;
                        }
                    } else if (!EXtogiMhuM.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.AARZUJiTa != ((java.util.Map) obj).size()) {
                return false;
            }
            int i3 = this.AARZUJiTa;
            for (int i4 = 0; i4 < i3; i4++) {
                java.lang.Object adDC3e2L2 = adDC3e2L(i4);
                java.lang.Object EXtogiMhuM2 = EXtogiMhuM(i4);
                java.lang.Object obj3 = ((java.util.Map) obj).get(adDC3e2L2);
                if (EXtogiMhuM2 == null) {
                    if (obj3 != null || !((java.util.Map) obj).containsKey(adDC3e2L2)) {
                        return false;
                    }
                } else if (!EXtogiMhuM2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public java.lang.Object get(java.lang.Object obj) {
        int r1MBDhnF = r1MBDhnF(obj);
        if (r1MBDhnF >= 0) {
            return this.xiZrDbcSW0[(r1MBDhnF << 1) + 1];
        }
        return null;
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int r1MBDhnF = r1MBDhnF(obj);
        return r1MBDhnF >= 0 ? this.xiZrDbcSW0[(r1MBDhnF << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.adDC3e2L;
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        int i = this.AARZUJiTa;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            java.lang.Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.AARZUJiTa <= 0;
    }

    public final int oh6vYeIP(int i, java.lang.Object obj) {
        int i2 = this.AARZUJiTa;
        if (i2 == 0) {
            return -1;
        }
        int G3OKOH3wZRC = defpackage.s21.G3OKOH3wZRC(this.adDC3e2L, i2, i);
        if (G3OKOH3wZRC < 0 || defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[G3OKOH3wZRC << 1])) {
            return G3OKOH3wZRC;
        }
        int i3 = G3OKOH3wZRC + 1;
        while (i3 < i2 && this.adDC3e2L[i3] == i) {
            if (defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = G3OKOH3wZRC - 1; i4 >= 0 && this.adDC3e2L[i4] == i; i4--) {
            if (defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.AARZUJiTa;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int oh6vYeIP = obj != null ? oh6vYeIP(hashCode, obj) : F7NU4MC0GW();
        if (oh6vYeIP >= 0) {
            int i2 = (oh6vYeIP << 1) + 1;
            java.lang.Object[] objArr = this.xiZrDbcSW0;
            java.lang.Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~oh6vYeIP;
        int[] iArr = this.adDC3e2L;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.adDC3e2L = java.util.Arrays.copyOf(iArr, i4);
            this.xiZrDbcSW0 = java.util.Arrays.copyOf(this.xiZrDbcSW0, i4 << 1);
            if (i != this.AARZUJiTa) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.adDC3e2L;
            int i5 = i3 + 1;
            defpackage.t6.Ye0N2xE9Hc(iArr2, iArr2, i5, i3, i);
            java.lang.Object[] objArr2 = this.xiZrDbcSW0;
            defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i5 << 1, i3 << 1, this.AARZUJiTa << 1);
        }
        int i6 = this.AARZUJiTa;
        if (i == i6) {
            int[] iArr3 = this.adDC3e2L;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                java.lang.Object[] objArr3 = this.xiZrDbcSW0;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.AARZUJiTa = i6 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final int r1MBDhnF(java.lang.Object obj) {
        return obj == null ? F7NU4MC0GW() : oh6vYeIP(obj.hashCode(), obj);
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int r1MBDhnF = r1MBDhnF(obj);
        if (r1MBDhnF < 0 || !defpackage.x70.QoRHpC4k(obj2, EXtogiMhuM(r1MBDhnF))) {
            return false;
        }
        xiZrDbcSW0(r1MBDhnF);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int r1MBDhnF = r1MBDhnF(obj);
        if (r1MBDhnF < 0 || !defpackage.x70.QoRHpC4k(obj2, EXtogiMhuM(r1MBDhnF))) {
            return false;
        }
        AARZUJiTa(r1MBDhnF, obj3);
        return true;
    }

    public final int size() {
        return this.AARZUJiTa;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.AARZUJiTa * 28);
        sb.append('{');
        int i = this.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object adDC3e2L = adDC3e2L(i2);
            if (adDC3e2L != sb) {
                sb.append(adDC3e2L);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object EXtogiMhuM = EXtogiMhuM(i2);
            if (EXtogiMhuM != sb) {
                sb.append(EXtogiMhuM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final java.lang.Object xiZrDbcSW0(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.AARZUJiTa)) {
            defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        int i3 = i << 1;
        java.lang.Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.adDC3e2L;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                defpackage.t6.Ye0N2xE9Hc(iArr, iArr, i, i5, i2);
                java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            java.lang.Object[] objArr3 = this.xiZrDbcSW0;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.adDC3e2L = java.util.Arrays.copyOf(iArr, i7);
            this.xiZrDbcSW0 = java.util.Arrays.copyOf(this.xiZrDbcSW0, i7 << 1);
            if (i2 != this.AARZUJiTa) {
                throw new java.util.ConcurrentModificationException();
            }
            if (i > 0) {
                defpackage.t6.Ye0N2xE9Hc(iArr, this.adDC3e2L, 0, 0, i);
                defpackage.t6.wKlPRKlRnfqr(objArr, this.xiZrDbcSW0, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                defpackage.t6.Ye0N2xE9Hc(iArr, this.adDC3e2L, i, i8, i2);
                defpackage.t6.wKlPRKlRnfqr(objArr, this.xiZrDbcSW0, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.AARZUJiTa) {
            throw new java.util.ConcurrentModificationException();
        }
        this.AARZUJiTa = i4;
        return obj;
    }

    public java.lang.Object remove(java.lang.Object obj) {
        int r1MBDhnF = r1MBDhnF(obj);
        if (r1MBDhnF >= 0) {
            return xiZrDbcSW0(r1MBDhnF);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int r1MBDhnF = r1MBDhnF(obj);
        if (r1MBDhnF >= 0) {
            return AARZUJiTa(r1MBDhnF, obj2);
        }
        return null;
    }
}
