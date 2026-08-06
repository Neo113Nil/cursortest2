package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ky0 extends defpackage.blKFvluuDQOf {
    public final int P05cfTpS5W5L;
    public final java.lang.Object[] QiMR8OkAhezm;
    public final int e6mdH7fiFuta;
    public final java.lang.Object[] oh71FJcDz6S2;

    public ky0(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2) {
        this.oh71FJcDz6S2 = objArr;
        this.QiMR8OkAhezm = objArr2;
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = i2;
        if (!(ZpBGe2uQfcn8() > 32)) {
            defpackage.g11.ZpBGe2uQfcn8("Trie-based persistent vector should have at least 33 elements, got " + ZpBGe2uQfcn8());
        }
        int length = objArr2.length;
    }

    public static java.lang.Object[] Ns0WNyEWdPsk(java.lang.Object[] objArr, int i, int i2, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        java.lang.Object[] Ns0WNyEWdPsk;
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        if (i == 5) {
            lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr[OcTWLQzke1i2];
            Ns0WNyEWdPsk = null;
        } else {
            java.lang.Object obj = objArr[OcTWLQzke1i2];
            obj.getClass();
            Ns0WNyEWdPsk = Ns0WNyEWdPsk((java.lang.Object[]) obj, i - 5, i2, lCK4GGEwbWAr);
        }
        if (Ns0WNyEWdPsk == null && OcTWLQzke1i2 == 0) {
            return null;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        copyOf[OcTWLQzke1i2] = Ns0WNyEWdPsk;
        return copyOf;
    }

    public static java.lang.Object[] WmetiUbpKU9I(int i, int i2, java.lang.Object obj, java.lang.Object[] objArr) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[OcTWLQzke1i2] = obj;
            return copyOf;
        }
        java.lang.Object obj2 = copyOf[OcTWLQzke1i2];
        obj2.getClass();
        copyOf[OcTWLQzke1i2] = WmetiUbpKU9I(i - 5, i2, obj, (java.lang.Object[]) obj2);
        return copyOf;
    }

    public static java.lang.Object[] e6mdH7fiFuta(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        if (i == 0) {
            java.lang.Object[] copyOf = OcTWLQzke1i2 == 0 ? new java.lang.Object[32] : java.util.Arrays.copyOf(objArr, 32);
            defpackage.y7.hwoZxnIesQBZ(objArr, copyOf, OcTWLQzke1i2 + 1, OcTWLQzke1i2, 31);
            lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr[31];
            copyOf[OcTWLQzke1i2] = obj;
            return copyOf;
        }
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        java.lang.Object obj2 = objArr[OcTWLQzke1i2];
        obj2.getClass();
        copyOf2[OcTWLQzke1i2] = e6mdH7fiFuta((java.lang.Object[]) obj2, i3, i2, obj, lCK4GGEwbWAr);
        while (true) {
            OcTWLQzke1i2++;
            if (OcTWLQzke1i2 >= 32 || copyOf2[OcTWLQzke1i2] == null) {
                break;
            }
            java.lang.Object obj3 = objArr[OcTWLQzke1i2];
            obj3.getClass();
            copyOf2[OcTWLQzke1i2] = e6mdH7fiFuta((java.lang.Object[]) obj3, i3, 0, lCK4GGEwbWAr.ZpBGe2uQfcn8, lCK4GGEwbWAr);
        }
        return copyOf2;
    }

    public final defpackage.ky0 GE9mJIPrb8gP(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int XntWc4eZSQ8j = XntWc4eZSQ8j();
        int i2 = this.P05cfTpS5W5L;
        int i3 = i2 - XntWc4eZSQ8j;
        java.lang.Object[] objArr2 = this.QiMR8OkAhezm;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            defpackage.y7.hwoZxnIesQBZ(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new defpackage.ky0(objArr, copyOf, i2 + 1, this.e6mdH7fiFuta);
        }
        java.lang.Object obj2 = objArr2[31];
        defpackage.y7.hwoZxnIesQBZ(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = obj2;
        return fNwYGHIYeJcR(objArr, copyOf, objArr3);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf P05cfTpS5W5L(int i, java.lang.Object obj) {
        int i2 = this.P05cfTpS5W5L;
        defpackage.n70.GE9mJIPrb8gP(i, i2);
        int XntWc4eZSQ8j = XntWc4eZSQ8j();
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object[] objArr2 = this.QiMR8OkAhezm;
        int i3 = this.e6mdH7fiFuta;
        if (XntWc4eZSQ8j > i) {
            return new defpackage.ky0(WmetiUbpKU9I(i3, i, obj, objArr), objArr2, i2, i3);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new defpackage.ky0(objArr, copyOf, i2, i3);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf QiMR8OkAhezm(int i) {
        defpackage.n70.GE9mJIPrb8gP(i, ZpBGe2uQfcn8());
        int XntWc4eZSQ8j = XntWc4eZSQ8j();
        int i2 = this.e6mdH7fiFuta;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        return i >= XntWc4eZSQ8j ? T1fB7bDYiVJQ(objArr, XntWc4eZSQ8j, i2, i - XntWc4eZSQ8j) : T1fB7bDYiVJQ(gUjdnLbkVAaA(objArr, i2, i, new defpackage.LCK4GGEwbWAr(this.QiMR8OkAhezm[0])), XntWc4eZSQ8j, i2, 0);
    }

    public final defpackage.blKFvluuDQOf T1fB7bDYiVJQ(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.P05cfTpS5W5L - i;
        if (i4 != 1) {
            java.lang.Object[] objArr2 = this.QiMR8OkAhezm;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                defpackage.y7.hwoZxnIesQBZ(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new defpackage.ky0(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = java.util.Arrays.copyOf(objArr, 32);
            }
            return new defpackage.ke1(objArr);
        }
        defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(null);
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr, i2, i - 1, lCK4GGEwbWAr);
        Ns0WNyEWdPsk.getClass();
        java.lang.Object obj = lCK4GGEwbWAr.ZpBGe2uQfcn8;
        obj.getClass();
        java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
        if (Ns0WNyEWdPsk[1] != null) {
            return new defpackage.ky0(Ns0WNyEWdPsk, objArr3, i, i2);
        }
        java.lang.Object obj2 = Ns0WNyEWdPsk[0];
        obj2.getClass();
        return new defpackage.ky0((java.lang.Object[]) obj2, objArr3, i, i2 - 5);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.ly0 WDYagTQQm9ns() {
        return new defpackage.ly0(this, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.e6mdH7fiFuta);
    }

    public final int XntWc4eZSQ8j() {
        return (this.P05cfTpS5W5L - 1) & (-32);
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        return this.P05cfTpS5W5L;
    }

    public final defpackage.ky0 fNwYGHIYeJcR(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.P05cfTpS5W5L;
        int i2 = i >> 5;
        int i3 = this.e6mdH7fiFuta;
        if (i2 <= (1 << i3)) {
            return new defpackage.ky0(h3m55N1URyyK(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        java.lang.Object[] objArr4 = new java.lang.Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new defpackage.ky0(h3m55N1URyyK(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf fWTAfUmVKrZq(java.lang.Object obj) {
        int XntWc4eZSQ8j = XntWc4eZSQ8j();
        int i = this.P05cfTpS5W5L;
        int i2 = i - XntWc4eZSQ8j;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object[] objArr2 = this.QiMR8OkAhezm;
        if (i2 < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new defpackage.ky0(objArr, copyOf, i + 1, this.e6mdH7fiFuta);
        }
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = obj;
        return fNwYGHIYeJcR(objArr, objArr2, objArr3);
    }

    public final java.lang.Object[] gUjdnLbkVAaA(java.lang.Object[] objArr, int i, int i2, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        if (i == 0) {
            java.lang.Object[] copyOf = OcTWLQzke1i2 == 0 ? new java.lang.Object[32] : java.util.Arrays.copyOf(objArr, 32);
            defpackage.y7.hwoZxnIesQBZ(objArr, copyOf, OcTWLQzke1i2, OcTWLQzke1i2 + 1, 32);
            copyOf[31] = lCK4GGEwbWAr.ZpBGe2uQfcn8;
            lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr[OcTWLQzke1i2];
            return copyOf;
        }
        int OcTWLQzke1i22 = objArr[31] == null ? defpackage.m90.OcTWLQzke1i2(XntWc4eZSQ8j() - 1, i) : 31;
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = OcTWLQzke1i2 + 1;
        if (i4 <= OcTWLQzke1i22) {
            while (true) {
                java.lang.Object obj = copyOf2[OcTWLQzke1i22];
                obj.getClass();
                copyOf2[OcTWLQzke1i22] = gUjdnLbkVAaA((java.lang.Object[]) obj, i3, 0, lCK4GGEwbWAr);
                if (OcTWLQzke1i22 == i4) {
                    break;
                }
                OcTWLQzke1i22--;
            }
        }
        java.lang.Object obj2 = copyOf2[OcTWLQzke1i2];
        obj2.getClass();
        copyOf2[OcTWLQzke1i2] = gUjdnLbkVAaA((java.lang.Object[]) obj2, i3, i2, lCK4GGEwbWAr);
        return copyOf2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr;
        defpackage.n70.GE9mJIPrb8gP(i, ZpBGe2uQfcn8());
        if (XntWc4eZSQ8j() <= i) {
            objArr = this.QiMR8OkAhezm;
        } else {
            java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
            for (int i2 = this.e6mdH7fiFuta; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[defpackage.m90.OcTWLQzke1i2(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf giKS3J6vZuNy(int i, java.lang.Object obj) {
        int i2 = this.P05cfTpS5W5L;
        defpackage.n70.Ns0WNyEWdPsk(i, i2);
        if (i == i2) {
            return fWTAfUmVKrZq(obj);
        }
        int XntWc4eZSQ8j = XntWc4eZSQ8j();
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (i >= XntWc4eZSQ8j) {
            return GE9mJIPrb8gP(objArr, i - XntWc4eZSQ8j, obj);
        }
        defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(null);
        return GE9mJIPrb8gP(e6mdH7fiFuta(objArr, this.e6mdH7fiFuta, i, obj, lCK4GGEwbWAr), 0, lCK4GGEwbWAr.ZpBGe2uQfcn8);
    }

    public final java.lang.Object[] h3m55N1URyyK(int i, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(ZpBGe2uQfcn8() - 1, i);
        java.lang.Object[] copyOf = objArr != null ? java.util.Arrays.copyOf(objArr, 32) : new java.lang.Object[32];
        if (i == 5) {
            copyOf[OcTWLQzke1i2] = objArr2;
            return copyOf;
        }
        copyOf[OcTWLQzke1i2] = h3m55N1URyyK(i - 5, (java.lang.Object[]) copyOf[OcTWLQzke1i2], objArr2);
        return copyOf;
    }

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.n70.Ns0WNyEWdPsk(i, this.P05cfTpS5W5L);
        return new defpackage.my0(this.oh71FJcDz6S2, this.QiMR8OkAhezm, i, this.P05cfTpS5W5L, (this.e6mdH7fiFuta / 5) + 1);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf oh71FJcDz6S2(defpackage.OcTWLQzke1i2 ocTWLQzke1i2) {
        defpackage.ly0 ly0Var = new defpackage.ly0(this, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.e6mdH7fiFuta);
        ly0Var.oCu53ZX2v4Ju(ocTWLQzke1i2);
        return ly0Var.fWTAfUmVKrZq();
    }
}
