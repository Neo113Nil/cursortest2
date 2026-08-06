package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ly0 extends defpackage.oCu53ZX2v4Ju implements java.util.Collection, defpackage.nb0 {
    public java.lang.Object[] GE9mJIPrb8gP;
    public java.lang.Object[] Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public java.lang.Object[] QiMR8OkAhezm;
    public defpackage.blKFvluuDQOf WDYagTQQm9ns;
    public defpackage.hu e6mdH7fiFuta = new defpackage.hu(19);
    public int fNwYGHIYeJcR;
    public java.lang.Object[] oh71FJcDz6S2;

    public ly0(defpackage.blKFvluuDQOf blkfvluudqof, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        this.WDYagTQQm9ns = blkfvluudqof;
        this.oh71FJcDz6S2 = objArr;
        this.QiMR8OkAhezm = objArr2;
        this.P05cfTpS5W5L = i;
        this.GE9mJIPrb8gP = objArr;
        this.Ns0WNyEWdPsk = objArr2;
        this.fNwYGHIYeJcR = blkfvluudqof.ZpBGe2uQfcn8();
    }

    public static void JhCgjQRTAOCT(java.lang.Object[] objArr, int i, java.util.Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final java.lang.Object[] BHfvd2J71qpO(java.lang.Object[] objArr, int i, java.lang.Object[][] objArr2) {
        defpackage.ZVVdXbWmyCSK zVVdXbWmyCSK = new defpackage.ZVVdXbWmyCSK(objArr2);
        int i2 = i >> 5;
        int i3 = this.P05cfTpS5W5L;
        java.lang.Object[] s0TASMVLSWD5 = i2 < (1 << i3) ? s0TASMVLSWD5(objArr, i, i3, zVVdXbWmyCSK) : Ns0WNyEWdPsk(objArr);
        while (zVVdXbWmyCSK.hasNext()) {
            this.P05cfTpS5W5L += 5;
            s0TASMVLSWD5 = gUjdnLbkVAaA(s0TASMVLSWD5);
            int i4 = this.P05cfTpS5W5L;
            s0TASMVLSWD5(s0TASMVLSWD5, 1 << i4, i4, zVVdXbWmyCSK);
        }
        return s0TASMVLSWD5;
    }

    public final defpackage.VFeft99leXEK GE9mJIPrb8gP(int i) {
        java.lang.Object[] objArr = this.GE9mJIPrb8gP;
        if (objArr == null) {
            defpackage.h7.P05cfTpS5W5L("Invalid root");
            return null;
        }
        int blKFvluuDQOf = blKFvluuDQOf() >> 5;
        defpackage.n70.Ns0WNyEWdPsk(i, blKFvluuDQOf);
        int i2 = this.P05cfTpS5W5L;
        return i2 == 0 ? new defpackage.yb(i, objArr) : new defpackage.up1(objArr, i, blKFvluuDQOf, i2 / 5);
    }

    public final int IJ0hOnjhPOri(defpackage.y10 y10Var, java.lang.Object[] objArr, int i, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        java.lang.Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (((java.lang.Boolean) y10Var.P05cfTpS5W5L(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Ns0WNyEWdPsk(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr2;
        return i2;
    }

    public final java.lang.Object[] Ns0WNyEWdPsk(java.lang.Object[] objArr) {
        if (objArr == null) {
            return h3m55N1URyyK();
        }
        if (e6mdH7fiFuta(objArr)) {
            return objArr;
        }
        java.lang.Object[] h3m55N1URyyK = h3m55N1URyyK();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        defpackage.y7.EgL5gQQnyJKX(objArr, h3m55N1URyyK, 0, length, 6);
        return h3m55N1URyyK;
    }

    public final java.lang.Object OcTWLQzke1i2(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.fNwYGHIYeJcR - i;
        java.lang.Object[] objArr2 = this.Ns0WNyEWdPsk;
        if (i4 == 1) {
            java.lang.Object obj = objArr2[0];
            WmetiUbpKU9I(objArr, i, i2);
            return obj;
        }
        java.lang.Object obj2 = objArr2[i3];
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr2);
        defpackage.y7.hwoZxnIesQBZ(objArr2, Ns0WNyEWdPsk, i3, i3 + 1, i4);
        Ns0WNyEWdPsk[i4 - 1] = null;
        this.GE9mJIPrb8gP = objArr;
        this.Ns0WNyEWdPsk = Ns0WNyEWdPsk;
        this.fNwYGHIYeJcR = (i + i4) - 1;
        this.P05cfTpS5W5L = i2;
        return obj2;
    }

    public final void P05cfTpS5W5L(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int jjTN4uUnoyEn = jjTN4uUnoyEn();
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(this.Ns0WNyEWdPsk);
        java.lang.Object[] objArr2 = this.Ns0WNyEWdPsk;
        if (jjTN4uUnoyEn >= 32) {
            java.lang.Object obj2 = objArr2[31];
            defpackage.y7.hwoZxnIesQBZ(objArr2, Ns0WNyEWdPsk, i + 1, i, 31);
            Ns0WNyEWdPsk[i] = obj;
            ZVVdXbWmyCSK(objArr, Ns0WNyEWdPsk, gUjdnLbkVAaA(obj2));
            return;
        }
        defpackage.y7.hwoZxnIesQBZ(objArr2, Ns0WNyEWdPsk, i + 1, i, jjTN4uUnoyEn);
        Ns0WNyEWdPsk[i] = obj;
        this.GE9mJIPrb8gP = objArr;
        this.Ns0WNyEWdPsk = Ns0WNyEWdPsk;
        this.fNwYGHIYeJcR++;
    }

    public final java.lang.Object[] QiMR8OkAhezm(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        java.lang.Object obj2;
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        if (i == 0) {
            lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr[31];
            java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
            defpackage.y7.hwoZxnIesQBZ(objArr, Ns0WNyEWdPsk, OcTWLQzke1i2 + 1, OcTWLQzke1i2, 31);
            Ns0WNyEWdPsk[OcTWLQzke1i2] = obj;
            return Ns0WNyEWdPsk;
        }
        java.lang.Object[] Ns0WNyEWdPsk2 = Ns0WNyEWdPsk(objArr);
        int i3 = i - 5;
        java.lang.Object obj3 = Ns0WNyEWdPsk2[OcTWLQzke1i2];
        obj3.getClass();
        Ns0WNyEWdPsk2[OcTWLQzke1i2] = QiMR8OkAhezm((java.lang.Object[]) obj3, i3, i2, obj, lCK4GGEwbWAr);
        while (true) {
            OcTWLQzke1i2++;
            if (OcTWLQzke1i2 >= 32 || (obj2 = Ns0WNyEWdPsk2[OcTWLQzke1i2]) == null) {
                break;
            }
            Ns0WNyEWdPsk2[OcTWLQzke1i2] = QiMR8OkAhezm((java.lang.Object[]) obj2, i3, 0, lCK4GGEwbWAr.ZpBGe2uQfcn8, lCK4GGEwbWAr);
        }
        return Ns0WNyEWdPsk2;
    }

    public final java.lang.Object[] T1fB7bDYiVJQ(java.lang.Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            defpackage.g11.ZpBGe2uQfcn8("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i, i2);
        java.lang.Object obj = objArr[OcTWLQzke1i2];
        obj.getClass();
        java.lang.Object T1fB7bDYiVJQ = T1fB7bDYiVJQ((java.lang.Object[]) obj, i, i2 - 5);
        if (OcTWLQzke1i2 < 31) {
            int i3 = OcTWLQzke1i2 + 1;
            if (objArr[i3] != null) {
                if (e6mdH7fiFuta(objArr)) {
                    java.util.Arrays.fill(objArr, i3, 32, (java.lang.Object) null);
                }
                java.lang.Object[] h3m55N1URyyK = h3m55N1URyyK();
                defpackage.y7.hwoZxnIesQBZ(objArr, h3m55N1URyyK, 0, 0, i3);
                objArr = h3m55N1URyyK;
            }
        }
        if (T1fB7bDYiVJQ == objArr[OcTWLQzke1i2]) {
            return objArr;
        }
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
        Ns0WNyEWdPsk[OcTWLQzke1i2] = T1fB7bDYiVJQ;
        return Ns0WNyEWdPsk;
    }

    public final java.lang.Object[] UmgHb6n58gfG(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
        if (i != 0) {
            java.lang.Object obj2 = Ns0WNyEWdPsk[OcTWLQzke1i2];
            obj2.getClass();
            Ns0WNyEWdPsk[OcTWLQzke1i2] = UmgHb6n58gfG((java.lang.Object[]) obj2, i - 5, i2, obj, lCK4GGEwbWAr);
            return Ns0WNyEWdPsk;
        }
        if (Ns0WNyEWdPsk != objArr) {
            ((java.util.AbstractList) this).modCount++;
        }
        lCK4GGEwbWAr.ZpBGe2uQfcn8 = Ns0WNyEWdPsk[OcTWLQzke1i2];
        Ns0WNyEWdPsk[OcTWLQzke1i2] = obj;
        return Ns0WNyEWdPsk;
    }

    public final int VFeft99leXEK(defpackage.y10 y10Var, int i, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        int IJ0hOnjhPOri = IJ0hOnjhPOri(y10Var, this.Ns0WNyEWdPsk, i, lCK4GGEwbWAr);
        java.lang.Object obj = lCK4GGEwbWAr.ZpBGe2uQfcn8;
        if (IJ0hOnjhPOri == i) {
            return i;
        }
        obj.getClass();
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        java.util.Arrays.fill(objArr, IJ0hOnjhPOri, i, (java.lang.Object) null);
        this.Ns0WNyEWdPsk = objArr;
        this.fNwYGHIYeJcR -= i - IJ0hOnjhPOri;
        return IJ0hOnjhPOri;
    }

    public final int WDYagTQQm9ns() {
        return ((java.util.AbstractList) this).modCount;
    }

    public final void WmetiUbpKU9I(java.lang.Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.GE9mJIPrb8gP = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.Ns0WNyEWdPsk = objArr;
            this.fNwYGHIYeJcR = i;
            this.P05cfTpS5W5L = i2;
            return;
        }
        defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(null);
        objArr.getClass();
        java.lang.Object[] XntWc4eZSQ8j = XntWc4eZSQ8j(objArr, i2, i, lCK4GGEwbWAr);
        XntWc4eZSQ8j.getClass();
        java.lang.Object obj = lCK4GGEwbWAr.ZpBGe2uQfcn8;
        obj.getClass();
        this.Ns0WNyEWdPsk = (java.lang.Object[]) obj;
        this.fNwYGHIYeJcR = i;
        if (XntWc4eZSQ8j[1] == null) {
            this.GE9mJIPrb8gP = (java.lang.Object[]) XntWc4eZSQ8j[0];
            this.P05cfTpS5W5L = i2 - 5;
        } else {
            this.GE9mJIPrb8gP = XntWc4eZSQ8j;
            this.P05cfTpS5W5L = i2;
        }
    }

    public final java.lang.Object[] XntWc4eZSQ8j(java.lang.Object[] objArr, int i, int i2, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        java.lang.Object[] XntWc4eZSQ8j;
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2 - 1, i);
        if (i == 5) {
            lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr[OcTWLQzke1i2];
            XntWc4eZSQ8j = null;
        } else {
            java.lang.Object obj = objArr[OcTWLQzke1i2];
            obj.getClass();
            XntWc4eZSQ8j = XntWc4eZSQ8j((java.lang.Object[]) obj, i - 5, i2, lCK4GGEwbWAr);
        }
        if (XntWc4eZSQ8j == null && OcTWLQzke1i2 == 0) {
            return null;
        }
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
        Ns0WNyEWdPsk[OcTWLQzke1i2] = XntWc4eZSQ8j;
        return Ns0WNyEWdPsk;
    }

    public final void ZVVdXbWmyCSK(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.fNwYGHIYeJcR;
        int i2 = i >> 5;
        int i3 = this.P05cfTpS5W5L;
        if (i2 > (1 << i3)) {
            this.GE9mJIPrb8gP = w7APNrr0aGRc(this.P05cfTpS5W5L + 5, gUjdnLbkVAaA(objArr), objArr2);
            this.Ns0WNyEWdPsk = objArr3;
            this.P05cfTpS5W5L += 5;
            this.fNwYGHIYeJcR++;
            return;
        }
        if (objArr == null) {
            this.GE9mJIPrb8gP = objArr2;
            this.Ns0WNyEWdPsk = objArr3;
            this.fNwYGHIYeJcR = i + 1;
        } else {
            this.GE9mJIPrb8gP = w7APNrr0aGRc(i3, objArr, objArr2);
            this.Ns0WNyEWdPsk = objArr3;
            this.fNwYGHIYeJcR++;
        }
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final int ZpBGe2uQfcn8() {
        return this.fNwYGHIYeJcR;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        defpackage.n70.Ns0WNyEWdPsk(i, ZpBGe2uQfcn8());
        if (i == ZpBGe2uQfcn8()) {
            add(obj);
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        int blKFvluuDQOf = blKFvluuDQOf();
        if (i >= blKFvluuDQOf) {
            P05cfTpS5W5L(this.GE9mJIPrb8gP, i - blKFvluuDQOf, obj);
            return;
        }
        defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(null);
        java.lang.Object[] objArr = this.GE9mJIPrb8gP;
        objArr.getClass();
        P05cfTpS5W5L(QiMR8OkAhezm(objArr, this.P05cfTpS5W5L, i, obj, lCK4GGEwbWAr), 0, lCK4GGEwbWAr.ZpBGe2uQfcn8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        java.util.Collection collection2;
        java.lang.Object[] h3m55N1URyyK;
        defpackage.n70.Ns0WNyEWdPsk(i, this.fNwYGHIYeJcR);
        if (i == this.fNwYGHIYeJcR) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.fNwYGHIYeJcR - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            java.lang.Object[] objArr = this.Ns0WNyEWdPsk;
            java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
            defpackage.y7.hwoZxnIesQBZ(objArr, Ns0WNyEWdPsk, size2 + 1, i3, jjTN4uUnoyEn());
            JhCgjQRTAOCT(Ns0WNyEWdPsk, i3, collection.iterator());
            this.Ns0WNyEWdPsk = Ns0WNyEWdPsk;
            this.fNwYGHIYeJcR = collection.size() + this.fNwYGHIYeJcR;
            return true;
        }
        java.lang.Object[][] objArr2 = new java.lang.Object[size][];
        int jjTN4uUnoyEn = jjTN4uUnoyEn();
        int size3 = collection.size() + this.fNwYGHIYeJcR;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= blKFvluuDQOf()) {
            h3m55N1URyyK = h3m55N1URyyK();
            collection2 = collection;
            qjMheFZ0l9kA(collection2, i, this.Ns0WNyEWdPsk, jjTN4uUnoyEn, objArr2, size, h3m55N1URyyK);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            java.lang.Object[] objArr3 = this.Ns0WNyEWdPsk;
            if (size3 > jjTN4uUnoyEn) {
                int i4 = size3 - jjTN4uUnoyEn;
                java.lang.Object[] fNwYGHIYeJcR = fNwYGHIYeJcR(i4, objArr3);
                oh71FJcDz6S2(collection2, i, i4, objArr2, size, fNwYGHIYeJcR);
                objArr2 = objArr2;
                h3m55N1URyyK = fNwYGHIYeJcR;
            } else {
                h3m55N1URyyK = h3m55N1URyyK();
                int i5 = jjTN4uUnoyEn - size3;
                defpackage.y7.hwoZxnIesQBZ(objArr3, h3m55N1URyyK, 0, i5, jjTN4uUnoyEn);
                int i6 = 32 - i5;
                java.lang.Object[] fNwYGHIYeJcR2 = fNwYGHIYeJcR(i6, this.Ns0WNyEWdPsk);
                int i7 = size - 1;
                objArr2[i7] = fNwYGHIYeJcR2;
                oh71FJcDz6S2(collection2, i, i6, objArr2, i7, fNwYGHIYeJcR2);
                collection2 = collection2;
            }
        }
        this.GE9mJIPrb8gP = BHfvd2J71qpO(this.GE9mJIPrb8gP, i2, objArr2);
        this.Ns0WNyEWdPsk = h3m55N1URyyK;
        this.fNwYGHIYeJcR = collection2.size() + this.fNwYGHIYeJcR;
        return true;
    }

    public final int blKFvluuDQOf() {
        int i = this.fNwYGHIYeJcR;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final java.lang.Object[] dG7RjM6DqYVL(java.lang.Object[] objArr, int i, int i2, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i2, i);
        if (i == 0) {
            java.lang.Object obj = objArr[OcTWLQzke1i2];
            java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
            defpackage.y7.hwoZxnIesQBZ(objArr, Ns0WNyEWdPsk, OcTWLQzke1i2, OcTWLQzke1i2 + 1, 32);
            Ns0WNyEWdPsk[31] = lCK4GGEwbWAr.ZpBGe2uQfcn8;
            lCK4GGEwbWAr.ZpBGe2uQfcn8 = obj;
            return Ns0WNyEWdPsk;
        }
        int OcTWLQzke1i22 = objArr[31] == null ? defpackage.m90.OcTWLQzke1i2(blKFvluuDQOf() - 1, i) : 31;
        java.lang.Object[] Ns0WNyEWdPsk2 = Ns0WNyEWdPsk(objArr);
        int i3 = i - 5;
        int i4 = OcTWLQzke1i2 + 1;
        if (i4 <= OcTWLQzke1i22) {
            while (true) {
                java.lang.Object obj2 = Ns0WNyEWdPsk2[OcTWLQzke1i22];
                obj2.getClass();
                Ns0WNyEWdPsk2[OcTWLQzke1i22] = dG7RjM6DqYVL((java.lang.Object[]) obj2, i3, 0, lCK4GGEwbWAr);
                if (OcTWLQzke1i22 == i4) {
                    break;
                }
                OcTWLQzke1i22--;
            }
        }
        java.lang.Object obj3 = Ns0WNyEWdPsk2[OcTWLQzke1i2];
        obj3.getClass();
        Ns0WNyEWdPsk2[OcTWLQzke1i2] = dG7RjM6DqYVL((java.lang.Object[]) obj3, i3, i2, lCK4GGEwbWAr);
        return Ns0WNyEWdPsk2;
    }

    public final boolean e6mdH7fiFuta(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e6mdH7fiFuta;
    }

    public final java.lang.Object[] fNwYGHIYeJcR(int i, java.lang.Object[] objArr) {
        if (e6mdH7fiFuta(objArr)) {
            defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        java.lang.Object[] h3m55N1URyyK = h3m55N1URyyK();
        defpackage.y7.hwoZxnIesQBZ(objArr, h3m55N1URyyK, i, 0, 32 - i);
        return h3m55N1URyyK;
    }

    public final defpackage.blKFvluuDQOf fWTAfUmVKrZq() {
        defpackage.blKFvluuDQOf ke1Var;
        java.lang.Object[] objArr = this.GE9mJIPrb8gP;
        if (objArr == this.oh71FJcDz6S2 && this.Ns0WNyEWdPsk == this.QiMR8OkAhezm) {
            ke1Var = this.WDYagTQQm9ns;
        } else {
            this.e6mdH7fiFuta = new defpackage.hu(19);
            this.oh71FJcDz6S2 = objArr;
            java.lang.Object[] objArr2 = this.Ns0WNyEWdPsk;
            this.QiMR8OkAhezm = objArr2;
            ke1Var = objArr == null ? objArr2.length == 0 ? defpackage.ke1.QiMR8OkAhezm : new defpackage.ke1(java.util.Arrays.copyOf(objArr2, this.fNwYGHIYeJcR)) : new defpackage.ky0(objArr, objArr2, this.fNwYGHIYeJcR, this.P05cfTpS5W5L);
        }
        this.WDYagTQQm9ns = ke1Var;
        return ke1Var;
    }

    public final java.lang.Object[] gUjdnLbkVAaA(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.e6mdH7fiFuta;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr;
        defpackage.n70.GE9mJIPrb8gP(i, ZpBGe2uQfcn8());
        if (blKFvluuDQOf() <= i) {
            objArr = this.Ns0WNyEWdPsk;
        } else {
            java.lang.Object[] objArr2 = this.GE9mJIPrb8gP;
            objArr2.getClass();
            for (int i2 = this.P05cfTpS5W5L; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[defpackage.m90.OcTWLQzke1i2(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final java.lang.Object giKS3J6vZuNy(int i) {
        defpackage.n70.GE9mJIPrb8gP(i, ZpBGe2uQfcn8());
        ((java.util.AbstractList) this).modCount++;
        int blKFvluuDQOf = blKFvluuDQOf();
        if (i >= blKFvluuDQOf) {
            return OcTWLQzke1i2(this.GE9mJIPrb8gP, blKFvluuDQOf, this.P05cfTpS5W5L, i - blKFvluuDQOf);
        }
        defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(this.Ns0WNyEWdPsk[0]);
        java.lang.Object[] objArr = this.GE9mJIPrb8gP;
        objArr.getClass();
        OcTWLQzke1i2(dG7RjM6DqYVL(objArr, this.P05cfTpS5W5L, i, lCK4GGEwbWAr), blKFvluuDQOf, this.P05cfTpS5W5L, 0);
        return lCK4GGEwbWAr.ZpBGe2uQfcn8;
    }

    public final java.lang.Object[] h3m55N1URyyK() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.e6mdH7fiFuta;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    public final int jjTN4uUnoyEn() {
        int i = this.fNwYGHIYeJcR;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.n70.Ns0WNyEWdPsk(i, this.fNwYGHIYeJcR);
        return new defpackage.ny0(this, i);
    }

    public final int maCixPsq4ml2(defpackage.y10 y10Var, java.lang.Object[] objArr, int i, int i2, defpackage.LCK4GGEwbWAr lCK4GGEwbWAr, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (e6mdH7fiFuta(objArr)) {
            arrayList.add(objArr);
        }
        java.lang.Object obj = lCK4GGEwbWAr.ZpBGe2uQfcn8;
        obj.getClass();
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        java.lang.Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj2 = objArr[i3];
            if (!((java.lang.Boolean) y10Var.P05cfTpS5W5L(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (java.lang.Object[]) arrayList.remove(arrayList.size() - 1) : h3m55N1URyyK();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        lCK4GGEwbWAr.ZpBGe2uQfcn8 = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (VFeft99leXEK(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean oCu53ZX2v4Ju(defpackage.y10 y10Var) {
        int i;
        defpackage.y10 y10Var2 = y10Var;
        int jjTN4uUnoyEn = jjTN4uUnoyEn();
        java.lang.Object[] objArr = null;
        defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(null);
        boolean z = false;
        if (this.GE9mJIPrb8gP != null) {
            defpackage.VFeft99leXEK GE9mJIPrb8gP = GE9mJIPrb8gP(0);
            int i2 = 32;
            while (i2 == 32 && GE9mJIPrb8gP.hasNext()) {
                i2 = IJ0hOnjhPOri(y10Var2, (java.lang.Object[]) GE9mJIPrb8gP.next(), 32, lCK4GGEwbWAr);
            }
            if (i2 == 32) {
                int VFeft99leXEK = VFeft99leXEK(y10Var2, jjTN4uUnoyEn, lCK4GGEwbWAr);
                if (VFeft99leXEK == 0) {
                    WmetiUbpKU9I(this.GE9mJIPrb8gP, this.fNwYGHIYeJcR, this.P05cfTpS5W5L);
                }
            } else {
                int i3 = (GE9mJIPrb8gP.WDYagTQQm9ns - 1) << 5;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int i4 = i2;
                while (GE9mJIPrb8gP.hasNext()) {
                    i4 = maCixPsq4ml2(y10Var2, (java.lang.Object[]) GE9mJIPrb8gP.next(), 32, i4, lCK4GGEwbWAr, arrayList2, arrayList);
                    y10Var2 = y10Var;
                }
                int maCixPsq4ml2 = maCixPsq4ml2(y10Var, this.Ns0WNyEWdPsk, jjTN4uUnoyEn, i4, lCK4GGEwbWAr, arrayList2, arrayList);
                java.lang.Object obj = lCK4GGEwbWAr.ZpBGe2uQfcn8;
                obj.getClass();
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                java.util.Arrays.fill(objArr2, maCixPsq4ml2, 32, (java.lang.Object) null);
                boolean isEmpty = arrayList.isEmpty();
                java.lang.Object[] objArr3 = this.GE9mJIPrb8gP;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = s0TASMVLSWD5(objArr3, i3, this.P05cfTpS5W5L, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    defpackage.g11.ZpBGe2uQfcn8("invalid size");
                }
                if (size == 0) {
                    this.P05cfTpS5W5L = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.P05cfTpS5W5L;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.P05cfTpS5W5L = i - 5;
                        java.lang.Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = T1fB7bDYiVJQ(objArr3, i5, i);
                }
                this.GE9mJIPrb8gP = objArr;
                this.Ns0WNyEWdPsk = objArr2;
                this.fNwYGHIYeJcR = size + maCixPsq4ml2;
            }
            z = true;
        }
        if (z) {
            ((java.util.AbstractList) this).modCount++;
        }
        return z;
    }

    public final void oh71FJcDz6S2(java.util.Collection collection, int i, int i2, java.lang.Object[][] objArr, int i3, java.lang.Object[] objArr2) {
        if (this.GE9mJIPrb8gP == null) {
            defpackage.h7.P05cfTpS5W5L("root is null");
            return;
        }
        int i4 = i >> 5;
        defpackage.VFeft99leXEK GE9mJIPrb8gP = GE9mJIPrb8gP(blKFvluuDQOf() >> 5);
        int i5 = i3;
        java.lang.Object[] objArr3 = objArr2;
        while (GE9mJIPrb8gP.WDYagTQQm9ns - 1 != i4) {
            java.lang.Object[] objArr4 = (java.lang.Object[]) GE9mJIPrb8gP.previous();
            defpackage.y7.hwoZxnIesQBZ(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = fNwYGHIYeJcR(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        java.lang.Object[] objArr5 = (java.lang.Object[]) GE9mJIPrb8gP.previous();
        int blKFvluuDQOf = i3 - (((blKFvluuDQOf() >> 5) - 1) - i4);
        if (blKFvluuDQOf < i3) {
            objArr2 = objArr[blKFvluuDQOf];
            objArr2.getClass();
        }
        qjMheFZ0l9kA(collection, i, objArr5, 32, objArr, blKFvluuDQOf, objArr2);
    }

    public final void qjMheFZ0l9kA(java.util.Collection collection, int i, java.lang.Object[] objArr, int i2, java.lang.Object[][] objArr2, int i3, java.lang.Object[] objArr3) {
        java.lang.Object[] h3m55N1URyyK;
        if (i3 < 1) {
            defpackage.g11.ZpBGe2uQfcn8("requires at least one nullBuffer");
        }
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
        objArr2[0] = Ns0WNyEWdPsk;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            defpackage.y7.hwoZxnIesQBZ(Ns0WNyEWdPsk, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                h3m55N1URyyK = Ns0WNyEWdPsk;
            } else {
                h3m55N1URyyK = h3m55N1URyyK();
                i3--;
                objArr2[i3] = h3m55N1URyyK;
            }
            int i7 = i2 - i6;
            defpackage.y7.hwoZxnIesQBZ(Ns0WNyEWdPsk, objArr3, 0, i7, i2);
            defpackage.y7.hwoZxnIesQBZ(Ns0WNyEWdPsk, h3m55N1URyyK, size + 1, i4, i7);
            objArr3 = h3m55N1URyyK;
        }
        java.util.Iterator it = collection.iterator();
        JhCgjQRTAOCT(Ns0WNyEWdPsk, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            java.lang.Object[] h3m55N1URyyK2 = h3m55N1URyyK();
            JhCgjQRTAOCT(h3m55N1URyyK2, 0, it);
            objArr2[i8] = h3m55N1URyyK2;
        }
        JhCgjQRTAOCT(objArr3, 0, it);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        return oCu53ZX2v4Ju(new defpackage.OcTWLQzke1i2(1, collection));
    }

    public final java.lang.Object[] s0TASMVLSWD5(java.lang.Object[] objArr, int i, int i2, java.util.Iterator it) {
        if (!it.hasNext()) {
            defpackage.g11.ZpBGe2uQfcn8("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            defpackage.g11.ZpBGe2uQfcn8("negative shift");
        }
        if (i2 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(i, i2);
        int i3 = i2 - 5;
        Ns0WNyEWdPsk[OcTWLQzke1i2] = s0TASMVLSWD5((java.lang.Object[]) Ns0WNyEWdPsk[OcTWLQzke1i2], i, i3, it);
        while (true) {
            OcTWLQzke1i2++;
            if (OcTWLQzke1i2 >= 32 || !it.hasNext()) {
                break;
            }
            Ns0WNyEWdPsk[OcTWLQzke1i2] = s0TASMVLSWD5((java.lang.Object[]) Ns0WNyEWdPsk[OcTWLQzke1i2], 0, i3, it);
        }
        return Ns0WNyEWdPsk;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.n70.GE9mJIPrb8gP(i, ZpBGe2uQfcn8());
        if (blKFvluuDQOf() > i) {
            defpackage.LCK4GGEwbWAr lCK4GGEwbWAr = new defpackage.LCK4GGEwbWAr(null);
            java.lang.Object[] objArr = this.GE9mJIPrb8gP;
            objArr.getClass();
            this.GE9mJIPrb8gP = UmgHb6n58gfG(objArr, this.P05cfTpS5W5L, i, obj, lCK4GGEwbWAr);
            return lCK4GGEwbWAr.ZpBGe2uQfcn8;
        }
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(this.Ns0WNyEWdPsk);
        if (Ns0WNyEWdPsk != this.Ns0WNyEWdPsk) {
            ((java.util.AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        java.lang.Object obj2 = Ns0WNyEWdPsk[i2];
        Ns0WNyEWdPsk[i2] = obj;
        this.Ns0WNyEWdPsk = Ns0WNyEWdPsk;
        return obj2;
    }

    public final java.lang.Object[] w7APNrr0aGRc(int i, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int OcTWLQzke1i2 = defpackage.m90.OcTWLQzke1i2(ZpBGe2uQfcn8() - 1, i);
        java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(objArr);
        if (i == 5) {
            Ns0WNyEWdPsk[OcTWLQzke1i2] = objArr2;
            return Ns0WNyEWdPsk;
        }
        Ns0WNyEWdPsk[OcTWLQzke1i2] = w7APNrr0aGRc(i - 5, (java.lang.Object[]) Ns0WNyEWdPsk[OcTWLQzke1i2], objArr2);
        return Ns0WNyEWdPsk;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        int jjTN4uUnoyEn = jjTN4uUnoyEn();
        if (jjTN4uUnoyEn < 32) {
            java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(this.Ns0WNyEWdPsk);
            Ns0WNyEWdPsk[jjTN4uUnoyEn] = obj;
            this.Ns0WNyEWdPsk = Ns0WNyEWdPsk;
            this.fNwYGHIYeJcR = ZpBGe2uQfcn8() + 1;
        } else {
            ZVVdXbWmyCSK(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, gUjdnLbkVAaA(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int jjTN4uUnoyEn = jjTN4uUnoyEn();
        java.util.Iterator it = collection.iterator();
        if (32 - jjTN4uUnoyEn >= collection.size()) {
            java.lang.Object[] Ns0WNyEWdPsk = Ns0WNyEWdPsk(this.Ns0WNyEWdPsk);
            JhCgjQRTAOCT(Ns0WNyEWdPsk, jjTN4uUnoyEn, it);
            this.Ns0WNyEWdPsk = Ns0WNyEWdPsk;
            this.fNwYGHIYeJcR = collection.size() + this.fNwYGHIYeJcR;
            return true;
        }
        int size = ((collection.size() + jjTN4uUnoyEn) - 1) / 32;
        java.lang.Object[][] objArr = new java.lang.Object[size][];
        java.lang.Object[] Ns0WNyEWdPsk2 = Ns0WNyEWdPsk(this.Ns0WNyEWdPsk);
        JhCgjQRTAOCT(Ns0WNyEWdPsk2, jjTN4uUnoyEn, it);
        objArr[0] = Ns0WNyEWdPsk2;
        for (int i = 1; i < size; i++) {
            java.lang.Object[] h3m55N1URyyK = h3m55N1URyyK();
            JhCgjQRTAOCT(h3m55N1URyyK, 0, it);
            objArr[i] = h3m55N1URyyK;
        }
        this.GE9mJIPrb8gP = BHfvd2J71qpO(this.GE9mJIPrb8gP, blKFvluuDQOf(), objArr);
        java.lang.Object[] h3m55N1URyyK2 = h3m55N1URyyK();
        JhCgjQRTAOCT(h3m55N1URyyK2, 0, it);
        this.Ns0WNyEWdPsk = h3m55N1URyyK2;
        this.fNwYGHIYeJcR = collection.size() + this.fNwYGHIYeJcR;
        return true;
    }
}
