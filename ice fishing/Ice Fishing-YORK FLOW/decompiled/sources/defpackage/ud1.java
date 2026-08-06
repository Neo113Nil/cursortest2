package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class ud1 {
    public int QiMR8OkAhezm;
    public int[] WDYagTQQm9ns = defpackage.vx1.P05cfTpS5W5L;
    public java.lang.Object[] oh71FJcDz6S2 = defpackage.vx1.GE9mJIPrb8gP;

    public final int JhCgjQRTAOCT() {
        int i = this.QiMR8OkAhezm;
        if (i == 0) {
            return -1;
        }
        int GE9mJIPrb8gP = defpackage.vx1.GE9mJIPrb8gP(this.WDYagTQQm9ns, i, 0);
        if (GE9mJIPrb8gP < 0 || this.oh71FJcDz6S2[GE9mJIPrb8gP << 1] == null) {
            return GE9mJIPrb8gP;
        }
        int i2 = GE9mJIPrb8gP + 1;
        while (i2 < i && this.WDYagTQQm9ns[i2] == 0) {
            if (this.oh71FJcDz6S2[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = GE9mJIPrb8gP - 1; i3 >= 0 && this.WDYagTQQm9ns[i3] == 0; i3--) {
            if (this.oh71FJcDz6S2[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final java.lang.Object P05cfTpS5W5L(int i) {
        boolean z = false;
        if (i >= 0 && i < this.QiMR8OkAhezm) {
            z = true;
        }
        if (z) {
            return this.oh71FJcDz6S2[(i << 1) + 1];
        }
        defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final java.lang.Object QiMR8OkAhezm(int i, java.lang.Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.QiMR8OkAhezm) {
            z = true;
        }
        if (!z) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final java.lang.Object WDYagTQQm9ns(int i) {
        boolean z = false;
        if (i >= 0 && i < this.QiMR8OkAhezm) {
            z = true;
        }
        if (z) {
            return this.oh71FJcDz6S2[i << 1];
        }
        defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int ZpBGe2uQfcn8(java.lang.Object obj) {
        int i = this.QiMR8OkAhezm * 2;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
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

    public final void clear() {
        if (this.QiMR8OkAhezm > 0) {
            this.WDYagTQQm9ns = defpackage.vx1.P05cfTpS5W5L;
            this.oh71FJcDz6S2 = defpackage.vx1.GE9mJIPrb8gP;
            this.QiMR8OkAhezm = 0;
        }
        if (this.QiMR8OkAhezm > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return fWTAfUmVKrZq(obj) >= 0;
    }

    public boolean containsValue(java.lang.Object obj) {
        return ZpBGe2uQfcn8(obj) >= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof defpackage.ud1) {
                int i = this.QiMR8OkAhezm;
                if (i != ((defpackage.ud1) obj).QiMR8OkAhezm) {
                    return false;
                }
                defpackage.ud1 ud1Var = (defpackage.ud1) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    java.lang.Object WDYagTQQm9ns = WDYagTQQm9ns(i2);
                    java.lang.Object P05cfTpS5W5L = P05cfTpS5W5L(i2);
                    java.lang.Object obj2 = ud1Var.get(WDYagTQQm9ns);
                    if (P05cfTpS5W5L == null) {
                        if (obj2 != null || !ud1Var.containsKey(WDYagTQQm9ns)) {
                            return false;
                        }
                    } else if (!P05cfTpS5W5L.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.QiMR8OkAhezm != ((java.util.Map) obj).size()) {
                return false;
            }
            int i3 = this.QiMR8OkAhezm;
            for (int i4 = 0; i4 < i3; i4++) {
                java.lang.Object WDYagTQQm9ns2 = WDYagTQQm9ns(i4);
                java.lang.Object P05cfTpS5W5L2 = P05cfTpS5W5L(i4);
                java.lang.Object obj3 = ((java.util.Map) obj).get(WDYagTQQm9ns2);
                if (P05cfTpS5W5L2 == null) {
                    if (obj3 != null || !((java.util.Map) obj).containsKey(WDYagTQQm9ns2)) {
                        return false;
                    }
                } else if (!P05cfTpS5W5L2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public final int fWTAfUmVKrZq(java.lang.Object obj) {
        return obj == null ? JhCgjQRTAOCT() : giKS3J6vZuNy(obj.hashCode(), obj);
    }

    public java.lang.Object get(java.lang.Object obj) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq >= 0) {
            return this.oh71FJcDz6S2[(fWTAfUmVKrZq << 1) + 1];
        }
        return null;
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        return fWTAfUmVKrZq >= 0 ? this.oh71FJcDz6S2[(fWTAfUmVKrZq << 1) + 1] : obj2;
    }

    public final int giKS3J6vZuNy(int i, java.lang.Object obj) {
        int i2 = this.QiMR8OkAhezm;
        if (i2 == 0) {
            return -1;
        }
        int GE9mJIPrb8gP = defpackage.vx1.GE9mJIPrb8gP(this.WDYagTQQm9ns, i2, i);
        if (GE9mJIPrb8gP < 0 || defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[GE9mJIPrb8gP << 1])) {
            return GE9mJIPrb8gP;
        }
        int i3 = GE9mJIPrb8gP + 1;
        while (i3 < i2 && this.WDYagTQQm9ns[i3] == i) {
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = GE9mJIPrb8gP - 1; i4 >= 0 && this.WDYagTQQm9ns[i4] == i; i4--) {
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int hashCode() {
        int[] iArr = this.WDYagTQQm9ns;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        int i = this.QiMR8OkAhezm;
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
        return this.QiMR8OkAhezm <= 0;
    }

    public final java.lang.Object oh71FJcDz6S2(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.QiMR8OkAhezm)) {
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        int i3 = i << 1;
        java.lang.Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.WDYagTQQm9ns;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                defpackage.y7.cCeDCHgnx5OL(iArr, iArr, i, i5, i2);
                java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.WDYagTQQm9ns = java.util.Arrays.copyOf(iArr, i7);
            this.oh71FJcDz6S2 = java.util.Arrays.copyOf(this.oh71FJcDz6S2, i7 << 1);
            if (i2 != this.QiMR8OkAhezm) {
                throw new java.util.ConcurrentModificationException();
            }
            if (i > 0) {
                defpackage.y7.cCeDCHgnx5OL(iArr, this.WDYagTQQm9ns, 0, 0, i);
                defpackage.y7.hwoZxnIesQBZ(objArr, this.oh71FJcDz6S2, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                defpackage.y7.cCeDCHgnx5OL(iArr, this.WDYagTQQm9ns, i, i8, i2);
                defpackage.y7.hwoZxnIesQBZ(objArr, this.oh71FJcDz6S2, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.QiMR8OkAhezm) {
            throw new java.util.ConcurrentModificationException();
        }
        this.QiMR8OkAhezm = i4;
        return obj;
    }

    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.QiMR8OkAhezm;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int giKS3J6vZuNy = obj != null ? giKS3J6vZuNy(hashCode, obj) : JhCgjQRTAOCT();
        if (giKS3J6vZuNy >= 0) {
            int i2 = (giKS3J6vZuNy << 1) + 1;
            java.lang.Object[] objArr = this.oh71FJcDz6S2;
            java.lang.Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~giKS3J6vZuNy;
        int[] iArr = this.WDYagTQQm9ns;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.WDYagTQQm9ns = java.util.Arrays.copyOf(iArr, i4);
            this.oh71FJcDz6S2 = java.util.Arrays.copyOf(this.oh71FJcDz6S2, i4 << 1);
            if (i != this.QiMR8OkAhezm) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.WDYagTQQm9ns;
            int i5 = i3 + 1;
            defpackage.y7.cCeDCHgnx5OL(iArr2, iArr2, i5, i3, i);
            java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
            defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i5 << 1, i3 << 1, this.QiMR8OkAhezm << 1);
        }
        int i6 = this.QiMR8OkAhezm;
        if (i == i6) {
            int[] iArr3 = this.WDYagTQQm9ns;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.QiMR8OkAhezm = i6 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq < 0 || !defpackage.ma0.QiMR8OkAhezm(obj2, P05cfTpS5W5L(fWTAfUmVKrZq))) {
            return false;
        }
        oh71FJcDz6S2(fWTAfUmVKrZq);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq < 0 || !defpackage.ma0.QiMR8OkAhezm(obj2, P05cfTpS5W5L(fWTAfUmVKrZq))) {
            return false;
        }
        QiMR8OkAhezm(fWTAfUmVKrZq, obj3);
        return true;
    }

    public final int size() {
        return this.QiMR8OkAhezm;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.QiMR8OkAhezm * 28);
        sb.append('{');
        int i = this.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object WDYagTQQm9ns = WDYagTQQm9ns(i2);
            if (WDYagTQQm9ns != sb) {
                sb.append(WDYagTQQm9ns);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object P05cfTpS5W5L = P05cfTpS5W5L(i2);
            if (P05cfTpS5W5L != sb) {
                sb.append(P05cfTpS5W5L);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public java.lang.Object remove(java.lang.Object obj) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq >= 0) {
            return oh71FJcDz6S2(fWTAfUmVKrZq);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int fWTAfUmVKrZq = fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq >= 0) {
            return QiMR8OkAhezm(fWTAfUmVKrZq, obj2);
        }
        return null;
    }
}
