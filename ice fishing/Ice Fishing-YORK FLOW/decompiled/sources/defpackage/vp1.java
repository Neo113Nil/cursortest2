package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vp1 {
    public static final defpackage.vp1 WDYagTQQm9ns = new defpackage.vp1(0, 0, new java.lang.Object[0], null);
    public java.lang.Object[] JhCgjQRTAOCT;
    public int ZpBGe2uQfcn8;
    public final defpackage.hu fWTAfUmVKrZq;
    public int giKS3J6vZuNy;

    public vp1(int i, int i2, java.lang.Object[] objArr, defpackage.hu huVar) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = huVar;
        this.JhCgjQRTAOCT = objArr;
    }

    public static defpackage.vp1 GE9mJIPrb8gP(int i, java.lang.Object obj, java.lang.Object obj2, int i2, java.lang.Object obj3, java.lang.Object obj4, int i3, defpackage.hu huVar) {
        if (i3 > 30) {
            return new defpackage.vp1(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, huVar);
        }
        int dG7RjM6DqYVL = defpackage.m90.dG7RjM6DqYVL(i, i3);
        int dG7RjM6DqYVL2 = defpackage.m90.dG7RjM6DqYVL(i2, i3);
        if (dG7RjM6DqYVL != dG7RjM6DqYVL2) {
            return new defpackage.vp1((1 << dG7RjM6DqYVL) | (1 << dG7RjM6DqYVL2), 0, dG7RjM6DqYVL < dG7RjM6DqYVL2 ? new java.lang.Object[]{obj, obj2, obj3, obj4} : new java.lang.Object[]{obj3, obj4, obj, obj2}, huVar);
        }
        return new defpackage.vp1(0, 1 << dG7RjM6DqYVL, new java.lang.Object[]{GE9mJIPrb8gP(i, obj, obj2, i2, obj3, obj4, i3 + 5, huVar)}, huVar);
    }

    public final defpackage.vp1 BHfvd2J71qpO(int i) {
        java.lang.Object obj = this.JhCgjQRTAOCT[i];
        obj.getClass();
        return (defpackage.vp1) obj;
    }

    public final defpackage.vp1 IJ0hOnjhPOri(int i, int i2, defpackage.vp1 vp1Var) {
        java.lang.Object[] objArr = vp1Var.JhCgjQRTAOCT;
        if (objArr.length != 2 || vp1Var.giKS3J6vZuNy != 0) {
            java.lang.Object[] objArr2 = this.JhCgjQRTAOCT;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = vp1Var;
            return new defpackage.vp1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, copyOf, null);
        }
        if (this.JhCgjQRTAOCT.length == 1) {
            vp1Var.ZpBGe2uQfcn8 = this.giKS3J6vZuNy;
            return vp1Var;
        }
        int oh71FJcDz6S2 = oh71FJcDz6S2(i2);
        java.lang.Object[] objArr3 = this.JhCgjQRTAOCT;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length + 1);
        defpackage.y7.hwoZxnIesQBZ(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        defpackage.y7.hwoZxnIesQBZ(copyOf2, copyOf2, oh71FJcDz6S2 + 2, oh71FJcDz6S2, i);
        copyOf2[oh71FJcDz6S2] = obj;
        copyOf2[oh71FJcDz6S2 + 1] = obj2;
        return new defpackage.vp1(this.ZpBGe2uQfcn8 ^ i2, this.giKS3J6vZuNy ^ i2, copyOf2, null);
    }

    public final boolean JhCgjQRTAOCT(int i, int i2, java.lang.Object obj) {
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        if (P05cfTpS5W5L(dG7RjM6DqYVL)) {
            return defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2(dG7RjM6DqYVL)]);
        }
        if (!e6mdH7fiFuta(dG7RjM6DqYVL)) {
            return false;
        }
        defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK(dG7RjM6DqYVL));
        return i2 == 30 ? BHfvd2J71qpO.fWTAfUmVKrZq(obj) : BHfvd2J71qpO.JhCgjQRTAOCT(i, i2 + 5, obj);
    }

    public final defpackage.vp1 Ns0WNyEWdPsk(int i, defpackage.zx0 zx0Var) {
        zx0Var.WDYagTQQm9ns(zx0Var.e6mdH7fiFuta - 1);
        zx0Var.QiMR8OkAhezm = VFeft99leXEK(i);
        java.lang.Object[] objArr = this.JhCgjQRTAOCT;
        if (objArr.length == 2) {
            return null;
        }
        if (this.fWTAfUmVKrZq != zx0Var.WDYagTQQm9ns) {
            return new defpackage.vp1(0, 0, defpackage.m90.h3m55N1URyyK(i, objArr), zx0Var.WDYagTQQm9ns);
        }
        this.JhCgjQRTAOCT = defpackage.m90.h3m55N1URyyK(i, objArr);
        return this;
    }

    public final boolean P05cfTpS5W5L(int i) {
        return (this.ZpBGe2uQfcn8 & i) != 0;
    }

    public final java.lang.Object QiMR8OkAhezm(int i, int i2, java.lang.Object obj) {
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        if (P05cfTpS5W5L(dG7RjM6DqYVL)) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(dG7RjM6DqYVL);
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2])) {
                return VFeft99leXEK(oh71FJcDz6S2);
            }
            return null;
        }
        if (!e6mdH7fiFuta(dG7RjM6DqYVL)) {
            return null;
        }
        defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK(dG7RjM6DqYVL));
        if (i2 != 30) {
            return BHfvd2J71qpO.QiMR8OkAhezm(i, i2 + 5, obj);
        }
        defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, BHfvd2J71qpO.JhCgjQRTAOCT.length));
        int i3 = w6IV1lieBIux.WDYagTQQm9ns;
        int i4 = w6IV1lieBIux.oh71FJcDz6S2;
        int i5 = w6IV1lieBIux.QiMR8OkAhezm;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!defpackage.ma0.QiMR8OkAhezm(obj, BHfvd2J71qpO.JhCgjQRTAOCT[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return BHfvd2J71qpO.VFeft99leXEK(i3);
    }

    public final defpackage.vp1 T1fB7bDYiVJQ(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.zx0 zx0Var) {
        defpackage.zx0 zx0Var2;
        defpackage.vp1 T1fB7bDYiVJQ;
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        if (P05cfTpS5W5L(dG7RjM6DqYVL)) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(dG7RjM6DqYVL);
            return (defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2]) && defpackage.ma0.QiMR8OkAhezm(obj2, VFeft99leXEK(oh71FJcDz6S2))) ? XntWc4eZSQ8j(oh71FJcDz6S2, dG7RjM6DqYVL, zx0Var) : this;
        }
        if (!e6mdH7fiFuta(dG7RjM6DqYVL)) {
            return this;
        }
        int ZVVdXbWmyCSK = ZVVdXbWmyCSK(dG7RjM6DqYVL);
        defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK);
        if (i2 == 30) {
            defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, BHfvd2J71qpO.JhCgjQRTAOCT.length));
            int i3 = w6IV1lieBIux.WDYagTQQm9ns;
            int i4 = w6IV1lieBIux.oh71FJcDz6S2;
            int i5 = w6IV1lieBIux.QiMR8OkAhezm;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!defpackage.ma0.QiMR8OkAhezm(obj, BHfvd2J71qpO.JhCgjQRTAOCT[i3]) || !defpackage.ma0.QiMR8OkAhezm(obj2, BHfvd2J71qpO.VFeft99leXEK(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        T1fB7bDYiVJQ = BHfvd2J71qpO.Ns0WNyEWdPsk(i3, zx0Var);
                        break;
                    }
                }
            }
            T1fB7bDYiVJQ = BHfvd2J71qpO;
            zx0Var2 = zx0Var;
        } else {
            zx0Var2 = zx0Var;
            T1fB7bDYiVJQ = BHfvd2J71qpO.T1fB7bDYiVJQ(i, obj, obj2, i2 + 5, zx0Var2);
        }
        return WmetiUbpKU9I(BHfvd2J71qpO, T1fB7bDYiVJQ, ZVVdXbWmyCSK, dG7RjM6DqYVL, zx0Var2.WDYagTQQm9ns);
    }

    public final java.lang.Object VFeft99leXEK(int i) {
        return this.JhCgjQRTAOCT[i + 1];
    }

    public final boolean WDYagTQQm9ns(defpackage.vp1 vp1Var) {
        if (this == vp1Var) {
            return true;
        }
        if (this.giKS3J6vZuNy == vp1Var.giKS3J6vZuNy && this.ZpBGe2uQfcn8 == vp1Var.ZpBGe2uQfcn8) {
            int length = this.JhCgjQRTAOCT.length;
            for (int i = 0; i < length; i++) {
                if (this.JhCgjQRTAOCT[i] == vp1Var.JhCgjQRTAOCT[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final defpackage.vp1 WmetiUbpKU9I(defpackage.vp1 vp1Var, defpackage.vp1 vp1Var2, int i, int i2, defpackage.hu huVar) {
        defpackage.hu huVar2 = this.fWTAfUmVKrZq;
        if (vp1Var2 != null) {
            return (huVar2 == huVar || vp1Var != vp1Var2) ? s0TASMVLSWD5(i, vp1Var2, huVar) : this;
        }
        java.lang.Object[] objArr = this.JhCgjQRTAOCT;
        if (objArr.length == 1) {
            return null;
        }
        if (huVar2 != huVar) {
            return new defpackage.vp1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy ^ i2, defpackage.m90.gUjdnLbkVAaA(i, objArr), huVar);
        }
        this.JhCgjQRTAOCT = defpackage.m90.gUjdnLbkVAaA(i, objArr);
        this.giKS3J6vZuNy ^= i2;
        return this;
    }

    public final defpackage.vp1 XntWc4eZSQ8j(int i, int i2, defpackage.zx0 zx0Var) {
        zx0Var.WDYagTQQm9ns(zx0Var.e6mdH7fiFuta - 1);
        zx0Var.QiMR8OkAhezm = VFeft99leXEK(i);
        java.lang.Object[] objArr = this.JhCgjQRTAOCT;
        if (objArr.length == 2) {
            return null;
        }
        if (this.fWTAfUmVKrZq != zx0Var.WDYagTQQm9ns) {
            return new defpackage.vp1(i2 ^ this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, defpackage.m90.h3m55N1URyyK(i, objArr), zx0Var.WDYagTQQm9ns);
        }
        this.JhCgjQRTAOCT = defpackage.m90.h3m55N1URyyK(i, objArr);
        this.ZpBGe2uQfcn8 ^= i2;
        return this;
    }

    public final int ZVVdXbWmyCSK(int i) {
        return (this.JhCgjQRTAOCT.length - 1) - java.lang.Integer.bitCount(this.giKS3J6vZuNy & (i - 1));
    }

    public final java.lang.Object[] ZpBGe2uQfcn8(int i, int i2, int i3, java.lang.Object obj, java.lang.Object obj2, int i4, defpackage.hu huVar) {
        java.lang.Object obj3 = this.JhCgjQRTAOCT[i];
        defpackage.vp1 GE9mJIPrb8gP = GE9mJIPrb8gP(obj3 != null ? obj3.hashCode() : 0, obj3, VFeft99leXEK(i), i3, obj, obj2, i4 + 5, huVar);
        int ZVVdXbWmyCSK = ZVVdXbWmyCSK(i2);
        int i5 = ZVVdXbWmyCSK + 1;
        java.lang.Object[] objArr = this.JhCgjQRTAOCT;
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        defpackage.y7.EgL5gQQnyJKX(objArr, objArr2, 0, i, 6);
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, i, i + 2, i5);
        objArr2[ZVVdXbWmyCSK - 1] = GE9mJIPrb8gP;
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, ZVVdXbWmyCSK, i5, objArr.length);
        return objArr2;
    }

    public final boolean e6mdH7fiFuta(int i) {
        return (this.giKS3J6vZuNy & i) != 0;
    }

    public final defpackage.vp1 fNwYGHIYeJcR(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.zx0 zx0Var) {
        defpackage.zx0 zx0Var2;
        defpackage.vp1 fNwYGHIYeJcR;
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        boolean P05cfTpS5W5L = P05cfTpS5W5L(dG7RjM6DqYVL);
        defpackage.hu huVar = this.fWTAfUmVKrZq;
        if (P05cfTpS5W5L) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(dG7RjM6DqYVL);
            if (!defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2])) {
                zx0Var.WDYagTQQm9ns(zx0Var.e6mdH7fiFuta + 1);
                defpackage.hu huVar2 = zx0Var.WDYagTQQm9ns;
                if (huVar != huVar2) {
                    return new defpackage.vp1(this.ZpBGe2uQfcn8 ^ dG7RjM6DqYVL, this.giKS3J6vZuNy | dG7RjM6DqYVL, ZpBGe2uQfcn8(oh71FJcDz6S2, dG7RjM6DqYVL, i, obj, obj2, i2, huVar2), huVar2);
                }
                this.JhCgjQRTAOCT = ZpBGe2uQfcn8(oh71FJcDz6S2, dG7RjM6DqYVL, i, obj, obj2, i2, huVar2);
                this.ZpBGe2uQfcn8 ^= dG7RjM6DqYVL;
                this.giKS3J6vZuNy |= dG7RjM6DqYVL;
                return this;
            }
            zx0Var.QiMR8OkAhezm = VFeft99leXEK(oh71FJcDz6S2);
            if (VFeft99leXEK(oh71FJcDz6S2) == obj2) {
                return this;
            }
            if (huVar == zx0Var.WDYagTQQm9ns) {
                this.JhCgjQRTAOCT[oh71FJcDz6S2 + 1] = obj2;
                return this;
            }
            zx0Var.P05cfTpS5W5L++;
            java.lang.Object[] objArr = this.JhCgjQRTAOCT;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            copyOf[oh71FJcDz6S2 + 1] = obj2;
            return new defpackage.vp1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, copyOf, zx0Var.WDYagTQQm9ns);
        }
        if (!e6mdH7fiFuta(dG7RjM6DqYVL)) {
            zx0Var.WDYagTQQm9ns(zx0Var.e6mdH7fiFuta + 1);
            defpackage.hu huVar3 = zx0Var.WDYagTQQm9ns;
            int oh71FJcDz6S22 = oh71FJcDz6S2(dG7RjM6DqYVL);
            java.lang.Object[] objArr2 = this.JhCgjQRTAOCT;
            if (huVar != huVar3) {
                return new defpackage.vp1(this.ZpBGe2uQfcn8 | dG7RjM6DqYVL, this.giKS3J6vZuNy, defpackage.m90.GE9mJIPrb8gP(objArr2, oh71FJcDz6S22, obj, obj2), huVar3);
            }
            this.JhCgjQRTAOCT = defpackage.m90.GE9mJIPrb8gP(objArr2, oh71FJcDz6S22, obj, obj2);
            this.ZpBGe2uQfcn8 |= dG7RjM6DqYVL;
            return this;
        }
        int ZVVdXbWmyCSK = ZVVdXbWmyCSK(dG7RjM6DqYVL);
        defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK);
        if (i2 == 30) {
            defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, BHfvd2J71qpO.JhCgjQRTAOCT.length));
            int i3 = w6IV1lieBIux.WDYagTQQm9ns;
            int i4 = w6IV1lieBIux.oh71FJcDz6S2;
            int i5 = w6IV1lieBIux.QiMR8OkAhezm;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!defpackage.ma0.QiMR8OkAhezm(obj, BHfvd2J71qpO.JhCgjQRTAOCT[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                zx0Var.QiMR8OkAhezm = BHfvd2J71qpO.VFeft99leXEK(i3);
                if (BHfvd2J71qpO.fWTAfUmVKrZq == zx0Var.WDYagTQQm9ns) {
                    BHfvd2J71qpO.JhCgjQRTAOCT[i3 + 1] = obj2;
                    fNwYGHIYeJcR = BHfvd2J71qpO;
                } else {
                    zx0Var.P05cfTpS5W5L++;
                    java.lang.Object[] objArr3 = BHfvd2J71qpO.JhCgjQRTAOCT;
                    java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    fNwYGHIYeJcR = new defpackage.vp1(0, 0, copyOf2, zx0Var.WDYagTQQm9ns);
                }
                zx0Var2 = zx0Var;
            }
            zx0Var.WDYagTQQm9ns(zx0Var.e6mdH7fiFuta + 1);
            fNwYGHIYeJcR = new defpackage.vp1(0, 0, defpackage.m90.GE9mJIPrb8gP(BHfvd2J71qpO.JhCgjQRTAOCT, 0, obj, obj2), zx0Var.WDYagTQQm9ns);
            zx0Var2 = zx0Var;
        } else {
            zx0Var2 = zx0Var;
            fNwYGHIYeJcR = BHfvd2J71qpO.fNwYGHIYeJcR(i, obj, obj2, i2 + 5, zx0Var2);
        }
        return BHfvd2J71qpO == fNwYGHIYeJcR ? this : s0TASMVLSWD5(ZVVdXbWmyCSK, fNwYGHIYeJcR, zx0Var2.WDYagTQQm9ns);
    }

    public final boolean fWTAfUmVKrZq(java.lang.Object obj) {
        defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, this.JhCgjQRTAOCT.length));
        int i = w6IV1lieBIux.WDYagTQQm9ns;
        int i2 = w6IV1lieBIux.oh71FJcDz6S2;
        int i3 = w6IV1lieBIux.QiMR8OkAhezm;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final defpackage.vp1 gUjdnLbkVAaA(int i, java.lang.Object obj, int i2, defpackage.zx0 zx0Var) {
        defpackage.vp1 gUjdnLbkVAaA;
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        if (P05cfTpS5W5L(dG7RjM6DqYVL)) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(dG7RjM6DqYVL);
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2])) {
                return XntWc4eZSQ8j(oh71FJcDz6S2, dG7RjM6DqYVL, zx0Var);
            }
        } else if (e6mdH7fiFuta(dG7RjM6DqYVL)) {
            int ZVVdXbWmyCSK = ZVVdXbWmyCSK(dG7RjM6DqYVL);
            defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK);
            if (i2 == 30) {
                defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, BHfvd2J71qpO.JhCgjQRTAOCT.length));
                int i3 = w6IV1lieBIux.WDYagTQQm9ns;
                int i4 = w6IV1lieBIux.oh71FJcDz6S2;
                int i5 = w6IV1lieBIux.QiMR8OkAhezm;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!defpackage.ma0.QiMR8OkAhezm(obj, BHfvd2J71qpO.JhCgjQRTAOCT[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    gUjdnLbkVAaA = BHfvd2J71qpO.Ns0WNyEWdPsk(i3, zx0Var);
                }
                gUjdnLbkVAaA = BHfvd2J71qpO;
                break;
            }
            gUjdnLbkVAaA = BHfvd2J71qpO.gUjdnLbkVAaA(i, obj, i2 + 5, zx0Var);
            return WmetiUbpKU9I(BHfvd2J71qpO, gUjdnLbkVAaA, ZVVdXbWmyCSK, dG7RjM6DqYVL, zx0Var.WDYagTQQm9ns);
        }
        return this;
    }

    public final int giKS3J6vZuNy() {
        if (this.giKS3J6vZuNy == 0) {
            return this.JhCgjQRTAOCT.length / 2;
        }
        int bitCount = java.lang.Integer.bitCount(this.ZpBGe2uQfcn8);
        int length = this.JhCgjQRTAOCT.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += BHfvd2J71qpO(i).giKS3J6vZuNy();
        }
        return bitCount;
    }

    public final defpackage.vp1 h3m55N1URyyK(defpackage.vp1 vp1Var, int i, defpackage.gp gpVar, defpackage.zx0 zx0Var) {
        java.lang.Object[] objArr;
        defpackage.vp1 GE9mJIPrb8gP;
        if (this == vp1Var) {
            gpVar.ZpBGe2uQfcn8 += giKS3J6vZuNy();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            defpackage.hu huVar = zx0Var.WDYagTQQm9ns;
            int i3 = vp1Var.giKS3J6vZuNy;
            java.lang.Object[] objArr2 = this.JhCgjQRTAOCT;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length + vp1Var.JhCgjQRTAOCT.length);
            int length = this.JhCgjQRTAOCT.length;
            defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, vp1Var.JhCgjQRTAOCT.length));
            int i4 = w6IV1lieBIux.WDYagTQQm9ns;
            int i5 = w6IV1lieBIux.oh71FJcDz6S2;
            int i6 = w6IV1lieBIux.QiMR8OkAhezm;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (fWTAfUmVKrZq(vp1Var.JhCgjQRTAOCT[i4])) {
                        gpVar.ZpBGe2uQfcn8++;
                    } else {
                        java.lang.Object[] objArr3 = vp1Var.JhCgjQRTAOCT;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.JhCgjQRTAOCT.length) {
                return length == vp1Var.JhCgjQRTAOCT.length ? vp1Var : length == copyOf.length ? new defpackage.vp1(0, 0, copyOf, huVar) : new defpackage.vp1(0, 0, java.util.Arrays.copyOf(copyOf, length), huVar);
            }
        } else {
            int i7 = this.giKS3J6vZuNy | vp1Var.giKS3J6vZuNy;
            int i8 = this.ZpBGe2uQfcn8;
            int i9 = vp1Var.ZpBGe2uQfcn8;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = java.lang.Integer.lowestOneBit(i11);
                if (defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT[oh71FJcDz6S2(lowestOneBit)], vp1Var.JhCgjQRTAOCT[vp1Var.oh71FJcDz6S2(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                defpackage.g11.giKS3J6vZuNy("Check failed.");
            }
            defpackage.vp1 vp1Var2 = (defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, zx0Var.WDYagTQQm9ns) && this.ZpBGe2uQfcn8 == i12 && this.giKS3J6vZuNy == i7) ? this : new defpackage.vp1(i12, i7, new java.lang.Object[java.lang.Integer.bitCount(i7) + (java.lang.Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = java.lang.Integer.lowestOneBit(i13);
                java.lang.Object[] objArr4 = vp1Var2.JhCgjQRTAOCT;
                int length2 = (objArr4.length - 1) - i14;
                if (e6mdH7fiFuta(lowestOneBit2)) {
                    GE9mJIPrb8gP = BHfvd2J71qpO(ZVVdXbWmyCSK(lowestOneBit2));
                    if (vp1Var.e6mdH7fiFuta(lowestOneBit2)) {
                        GE9mJIPrb8gP = GE9mJIPrb8gP.h3m55N1URyyK(vp1Var.BHfvd2J71qpO(vp1Var.ZVVdXbWmyCSK(lowestOneBit2)), i + 5, gpVar, zx0Var);
                        objArr = objArr4;
                    } else if (vp1Var.P05cfTpS5W5L(lowestOneBit2)) {
                        int oh71FJcDz6S2 = vp1Var.oh71FJcDz6S2(lowestOneBit2);
                        java.lang.Object obj = vp1Var.JhCgjQRTAOCT[oh71FJcDz6S2];
                        java.lang.Object VFeft99leXEK = vp1Var.VFeft99leXEK(oh71FJcDz6S2);
                        int i15 = zx0Var.e6mdH7fiFuta;
                        objArr = objArr4;
                        GE9mJIPrb8gP = GE9mJIPrb8gP.fNwYGHIYeJcR(obj != null ? obj.hashCode() : i2, obj, VFeft99leXEK, i + 5, zx0Var);
                        if (zx0Var.e6mdH7fiFuta == i15) {
                            gpVar.ZpBGe2uQfcn8++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (vp1Var.e6mdH7fiFuta(lowestOneBit2)) {
                        defpackage.vp1 BHfvd2J71qpO = vp1Var.BHfvd2J71qpO(vp1Var.ZVVdXbWmyCSK(lowestOneBit2));
                        if (P05cfTpS5W5L(lowestOneBit2)) {
                            int oh71FJcDz6S22 = oh71FJcDz6S2(lowestOneBit2);
                            java.lang.Object obj2 = this.JhCgjQRTAOCT[oh71FJcDz6S22];
                            int i16 = i + 5;
                            if (BHfvd2J71qpO.JhCgjQRTAOCT(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                gpVar.ZpBGe2uQfcn8++;
                            } else {
                                GE9mJIPrb8gP = BHfvd2J71qpO.fNwYGHIYeJcR(obj2 != null ? obj2.hashCode() : 0, obj2, VFeft99leXEK(oh71FJcDz6S22), i16, zx0Var);
                            }
                        }
                        GE9mJIPrb8gP = BHfvd2J71qpO;
                    } else {
                        int oh71FJcDz6S23 = oh71FJcDz6S2(lowestOneBit2);
                        java.lang.Object obj3 = this.JhCgjQRTAOCT[oh71FJcDz6S23];
                        java.lang.Object VFeft99leXEK2 = VFeft99leXEK(oh71FJcDz6S23);
                        int oh71FJcDz6S24 = vp1Var.oh71FJcDz6S2(lowestOneBit2);
                        java.lang.Object obj4 = vp1Var.JhCgjQRTAOCT[oh71FJcDz6S24];
                        GE9mJIPrb8gP = GE9mJIPrb8gP(obj3 != null ? obj3.hashCode() : 0, obj3, VFeft99leXEK2, obj4 != null ? obj4.hashCode() : 0, obj4, vp1Var.VFeft99leXEK(oh71FJcDz6S24), i + 5, zx0Var.WDYagTQQm9ns);
                    }
                }
                objArr[length2] = GE9mJIPrb8gP;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = java.lang.Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (vp1Var.P05cfTpS5W5L(lowestOneBit3)) {
                    int oh71FJcDz6S25 = vp1Var.oh71FJcDz6S2(lowestOneBit3);
                    java.lang.Object[] objArr5 = vp1Var2.JhCgjQRTAOCT;
                    objArr5[i18] = vp1Var.JhCgjQRTAOCT[oh71FJcDz6S25];
                    objArr5[i18 + 1] = vp1Var.VFeft99leXEK(oh71FJcDz6S25);
                    if (P05cfTpS5W5L(lowestOneBit3)) {
                        gpVar.ZpBGe2uQfcn8++;
                    }
                } else {
                    int oh71FJcDz6S26 = oh71FJcDz6S2(lowestOneBit3);
                    java.lang.Object[] objArr6 = vp1Var2.JhCgjQRTAOCT;
                    objArr6[i18] = this.JhCgjQRTAOCT[oh71FJcDz6S26];
                    objArr6[i18 + 1] = VFeft99leXEK(oh71FJcDz6S26);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!WDYagTQQm9ns(vp1Var2)) {
                return vp1Var.WDYagTQQm9ns(vp1Var2) ? vp1Var : vp1Var2;
            }
        }
        return this;
    }

    public final defpackage.vp1 maCixPsq4ml2(int i, int i2, java.lang.Object obj) {
        defpackage.vp1 maCixPsq4ml2;
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        if (P05cfTpS5W5L(dG7RjM6DqYVL)) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(dG7RjM6DqYVL);
            if (!defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2])) {
                return this;
            }
            java.lang.Object[] objArr = this.JhCgjQRTAOCT;
            if (objArr.length != 2) {
                return new defpackage.vp1(this.ZpBGe2uQfcn8 ^ dG7RjM6DqYVL, this.giKS3J6vZuNy, defpackage.m90.h3m55N1URyyK(oh71FJcDz6S2, objArr), null);
            }
        } else {
            if (!e6mdH7fiFuta(dG7RjM6DqYVL)) {
                return this;
            }
            int ZVVdXbWmyCSK = ZVVdXbWmyCSK(dG7RjM6DqYVL);
            defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK);
            if (i2 == 30) {
                defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, BHfvd2J71qpO.JhCgjQRTAOCT.length));
                int i3 = w6IV1lieBIux.WDYagTQQm9ns;
                int i4 = w6IV1lieBIux.oh71FJcDz6S2;
                int i5 = w6IV1lieBIux.QiMR8OkAhezm;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!defpackage.ma0.QiMR8OkAhezm(obj, BHfvd2J71qpO.JhCgjQRTAOCT[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    java.lang.Object[] objArr2 = BHfvd2J71qpO.JhCgjQRTAOCT;
                    maCixPsq4ml2 = objArr2.length == 2 ? null : new defpackage.vp1(0, 0, defpackage.m90.h3m55N1URyyK(i3, objArr2), null);
                }
                maCixPsq4ml2 = BHfvd2J71qpO;
                break;
            }
            maCixPsq4ml2 = BHfvd2J71qpO.maCixPsq4ml2(i, i2 + 5, obj);
            if (maCixPsq4ml2 != null) {
                return BHfvd2J71qpO != maCixPsq4ml2 ? IJ0hOnjhPOri(ZVVdXbWmyCSK, dG7RjM6DqYVL, maCixPsq4ml2) : this;
            }
            java.lang.Object[] objArr3 = this.JhCgjQRTAOCT;
            if (objArr3.length != 1) {
                return new defpackage.vp1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy ^ dG7RjM6DqYVL, defpackage.m90.gUjdnLbkVAaA(ZVVdXbWmyCSK, objArr3), null);
            }
        }
        return null;
    }

    public final int oh71FJcDz6S2(int i) {
        return java.lang.Integer.bitCount(this.ZpBGe2uQfcn8 & (i - 1)) * 2;
    }

    public final defpackage.vp1 s0TASMVLSWD5(int i, defpackage.vp1 vp1Var, defpackage.hu huVar) {
        java.lang.Object[] objArr = this.JhCgjQRTAOCT;
        if (objArr.length == 1 && vp1Var.JhCgjQRTAOCT.length == 2 && vp1Var.giKS3J6vZuNy == 0) {
            vp1Var.ZpBGe2uQfcn8 = this.giKS3J6vZuNy;
            return vp1Var;
        }
        if (this.fWTAfUmVKrZq == huVar) {
            objArr[i] = vp1Var;
            return this;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = vp1Var;
        return new defpackage.vp1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, copyOf, huVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r13.giKS3J6vZuNy = IJ0hOnjhPOri(r11, r4, (defpackage.vp1) r13.giKS3J6vZuNy);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.wg w7APNrr0aGRc(int i, int i2, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.wg w7APNrr0aGRc;
        int i3 = 1;
        int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i2);
        int i4 = 0;
        if (P05cfTpS5W5L(dG7RjM6DqYVL)) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(dG7RjM6DqYVL);
            if (!defpackage.ma0.QiMR8OkAhezm(obj, this.JhCgjQRTAOCT[oh71FJcDz6S2])) {
                return new defpackage.wg(i3, new defpackage.vp1(this.ZpBGe2uQfcn8 ^ dG7RjM6DqYVL, this.giKS3J6vZuNy | dG7RjM6DqYVL, ZpBGe2uQfcn8(oh71FJcDz6S2, dG7RjM6DqYVL, i, obj, obj2, i2, null), null));
            }
            if (VFeft99leXEK(oh71FJcDz6S2) != obj2) {
                java.lang.Object[] objArr = this.JhCgjQRTAOCT;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                copyOf[oh71FJcDz6S2 + 1] = obj2;
                return new defpackage.wg(i4, new defpackage.vp1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, copyOf, null));
            }
        } else {
            if (!e6mdH7fiFuta(dG7RjM6DqYVL)) {
                return new defpackage.wg(i3, new defpackage.vp1(this.ZpBGe2uQfcn8 | dG7RjM6DqYVL, this.giKS3J6vZuNy, defpackage.m90.GE9mJIPrb8gP(this.JhCgjQRTAOCT, oh71FJcDz6S2(dG7RjM6DqYVL), obj, obj2), null));
            }
            int ZVVdXbWmyCSK = ZVVdXbWmyCSK(dG7RjM6DqYVL);
            defpackage.vp1 BHfvd2J71qpO = BHfvd2J71qpO(ZVVdXbWmyCSK);
            if (i2 == 30) {
                defpackage.n90 w6IV1lieBIux = defpackage.j80.w6IV1lieBIux(defpackage.j80.OVwOqzUGHcCU(0, BHfvd2J71qpO.JhCgjQRTAOCT.length));
                int i5 = w6IV1lieBIux.WDYagTQQm9ns;
                int i6 = w6IV1lieBIux.oh71FJcDz6S2;
                int i7 = w6IV1lieBIux.QiMR8OkAhezm;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!defpackage.ma0.QiMR8OkAhezm(obj, BHfvd2J71qpO.JhCgjQRTAOCT[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == BHfvd2J71qpO.VFeft99leXEK(i5)) {
                        w7APNrr0aGRc = null;
                    } else {
                        java.lang.Object[] objArr2 = BHfvd2J71qpO.JhCgjQRTAOCT;
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i5 + 1] = obj2;
                        w7APNrr0aGRc = new defpackage.wg(i4, new defpackage.vp1(0, 0, copyOf2, null));
                    }
                }
                w7APNrr0aGRc = new defpackage.wg(i3, new defpackage.vp1(0, 0, defpackage.m90.GE9mJIPrb8gP(BHfvd2J71qpO.JhCgjQRTAOCT, 0, obj, obj2), null));
                break;
            }
            w7APNrr0aGRc = BHfvd2J71qpO.w7APNrr0aGRc(i, i2 + 5, obj, obj2);
        }
        return null;
    }
}
