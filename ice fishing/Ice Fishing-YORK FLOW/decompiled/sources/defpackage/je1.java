package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class je1 {
    public defpackage.gn0 BHfvd2J71qpO;
    public int GE9mJIPrb8gP;
    public boolean IJ0hOnjhPOri;
    public java.util.ArrayList JhCgjQRTAOCT;
    public int Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public int T1fB7bDYiVJQ;
    public defpackage.fn0 VFeft99leXEK;
    public java.util.HashMap WDYagTQQm9ns;
    public final defpackage.v90 WmetiUbpKU9I;
    public final defpackage.v90 XntWc4eZSQ8j;
    public int ZVVdXbWmyCSK;
    public final defpackage.ge1 ZpBGe2uQfcn8;
    public int e6mdH7fiFuta;
    public int fNwYGHIYeJcR;
    public java.lang.Object[] fWTAfUmVKrZq;
    public int gUjdnLbkVAaA;
    public int[] giKS3J6vZuNy;
    public int h3m55N1URyyK;
    public int maCixPsq4ml2;
    public defpackage.gn0 oh71FJcDz6S2;
    public final defpackage.v90 s0TASMVLSWD5;
    public int w7APNrr0aGRc;

    public je1(defpackage.ge1 ge1Var) {
        this.ZpBGe2uQfcn8 = ge1Var;
        int[] iArr = ge1Var.WDYagTQQm9ns;
        this.giKS3J6vZuNy = iArr;
        java.lang.Object[] objArr = ge1Var.QiMR8OkAhezm;
        this.fWTAfUmVKrZq = objArr;
        this.JhCgjQRTAOCT = ge1Var.h3m55N1URyyK;
        this.WDYagTQQm9ns = ge1Var.gUjdnLbkVAaA;
        this.oh71FJcDz6S2 = ge1Var.T1fB7bDYiVJQ;
        int i = ge1Var.oh71FJcDz6S2;
        this.QiMR8OkAhezm = i;
        this.P05cfTpS5W5L = (iArr.length / 5) - i;
        int i2 = ge1Var.P05cfTpS5W5L;
        this.Ns0WNyEWdPsk = i2;
        this.fNwYGHIYeJcR = objArr.length - i2;
        this.h3m55N1URyyK = i;
        this.XntWc4eZSQ8j = new defpackage.v90();
        this.WmetiUbpKU9I = new defpackage.v90();
        this.s0TASMVLSWD5 = new defpackage.v90();
        this.w7APNrr0aGRc = i;
        this.maCixPsq4ml2 = -1;
    }

    public static void dG7RjM6DqYVL(defpackage.je1 je1Var) {
        int i = je1Var.maCixPsq4ml2;
        int s0TASMVLSWD5 = je1Var.s0TASMVLSWD5(i);
        int[] iArr = je1Var.giKS3J6vZuNy;
        int i2 = (s0TASMVLSWD5 * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        je1Var.CZa7MwI9IzLd(je1Var.jjTN4uUnoyEn(iArr, i));
    }

    public static int e6mdH7fiFuta(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final int BHfvd2J71qpO(int i) {
        return this.giKS3J6vZuNy[s0TASMVLSWD5(i) * 5];
    }

    public final void BXaznwstz2U0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.fNwYGHIYeJcR;
            int i5 = i + i2;
            UmgHb6n58gfG(i5, i3);
            this.Ns0WNyEWdPsk = i;
            this.fNwYGHIYeJcR = i4 + i2;
            java.util.Arrays.fill(this.fWTAfUmVKrZq, i, i5, (java.lang.Object) null);
            int i6 = this.GE9mJIPrb8gP;
            if (i6 >= i) {
                this.GE9mJIPrb8gP = i6 - i2;
            }
        }
    }

    public final void CZa7MwI9IzLd(int i) {
        if (i >= 0) {
            defpackage.fn0 fn0Var = this.VFeft99leXEK;
            if (fn0Var == null) {
                fn0Var = new defpackage.fn0();
                this.VFeft99leXEK = fn0Var;
            }
            defpackage.q70.GE9mJIPrb8gP(fn0Var, i);
        }
    }

    public final void EPEWHACkMcF1(int i, java.lang.Object obj) {
        int s0TASMVLSWD5 = s0TASMVLSWD5(i);
        int[] iArr = this.giKS3J6vZuNy;
        if (s0TASMVLSWD5 >= iArr.length || (iArr[(s0TASMVLSWD5 * 5) + 1] & 1073741824) == 0) {
            defpackage.ej.ZpBGe2uQfcn8("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.fWTAfUmVKrZq[P05cfTpS5W5L(QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5))] = obj;
    }

    public final void Fu5WBEia9jBo(java.lang.Object obj) {
        int s0TASMVLSWD5 = s0TASMVLSWD5(this.ZVVdXbWmyCSK);
        int i = (s0TASMVLSWD5 * 5) + 1;
        if ((this.giKS3J6vZuNy[i] & 268435456) == 0) {
            defpackage.ej.ZpBGe2uQfcn8("Updating the data of a group that was not created with a data slot");
        }
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        int[] iArr = this.giKS3J6vZuNy;
        objArr[P05cfTpS5W5L(java.lang.Integer.bitCount(iArr[i] >> 29) + QiMR8OkAhezm(iArr, s0TASMVLSWD5))] = obj;
    }

    public final void GE9mJIPrb8gP() {
        defpackage.sn0 sn0Var;
        boolean z = this.gUjdnLbkVAaA > 0;
        int i = this.ZVVdXbWmyCSK;
        int i2 = this.w7APNrr0aGRc;
        int i3 = this.maCixPsq4ml2;
        int s0TASMVLSWD5 = s0TASMVLSWD5(i3);
        int i4 = this.T1fB7bDYiVJQ;
        int i5 = i - i3;
        int i6 = s0TASMVLSWD5 * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.giKS3J6vZuNy[i7] & 1073741824) != 0;
        defpackage.v90 v90Var = this.s0TASMVLSWD5;
        if (z) {
            defpackage.gn0 gn0Var = this.BHfvd2J71qpO;
            if (gn0Var != null && (sn0Var = (defpackage.sn0) gn0Var.giKS3J6vZuNy(i3)) != null) {
                java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
                int i8 = sn0Var.giKS3J6vZuNy;
                for (int i9 = 0; i9 < i8; i9++) {
                    Mearx7yMn90V(objArr[i9]);
                }
            }
            int[] iArr = this.giKS3J6vZuNy;
            iArr[i6 + 3] = i5;
            defpackage.ie1.fWTAfUmVKrZq(iArr, s0TASMVLSWD5, i4);
            int giKS3J6vZuNy = v90Var.giKS3J6vZuNy();
            if (z2) {
                i4 = 1;
            }
            this.T1fB7bDYiVJQ = giKS3J6vZuNy + i4;
            int jjTN4uUnoyEn = jjTN4uUnoyEn(this.giKS3J6vZuNy, i3);
            this.maCixPsq4ml2 = jjTN4uUnoyEn;
            int XntWc4eZSQ8j = jjTN4uUnoyEn < 0 ? XntWc4eZSQ8j() : s0TASMVLSWD5(jjTN4uUnoyEn + 1);
            int QiMR8OkAhezm = XntWc4eZSQ8j >= 0 ? QiMR8OkAhezm(this.giKS3J6vZuNy, XntWc4eZSQ8j) : 0;
            this.e6mdH7fiFuta = QiMR8OkAhezm;
            this.GE9mJIPrb8gP = QiMR8OkAhezm;
            return;
        }
        if (i != i2) {
            defpackage.ej.ZpBGe2uQfcn8("Expected to be at the end of a group");
        }
        int[] iArr2 = this.giKS3J6vZuNy;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        defpackage.ie1.fWTAfUmVKrZq(iArr2, s0TASMVLSWD5, i4);
        int giKS3J6vZuNy2 = this.XntWc4eZSQ8j.giKS3J6vZuNy();
        this.w7APNrr0aGRc = (T1fB7bDYiVJQ() - this.P05cfTpS5W5L) - this.WmetiUbpKU9I.giKS3J6vZuNy();
        this.maCixPsq4ml2 = giKS3J6vZuNy2;
        int jjTN4uUnoyEn2 = jjTN4uUnoyEn(this.giKS3J6vZuNy, i3);
        int giKS3J6vZuNy3 = v90Var.giKS3J6vZuNy();
        this.T1fB7bDYiVJQ = giKS3J6vZuNy3;
        if (jjTN4uUnoyEn2 == giKS3J6vZuNy2) {
            this.T1fB7bDYiVJQ = giKS3J6vZuNy3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (jjTN4uUnoyEn2 != 0 && jjTN4uUnoyEn2 != giKS3J6vZuNy2 && (i14 != 0 || i13 != 0)) {
                int s0TASMVLSWD52 = s0TASMVLSWD5(jjTN4uUnoyEn2);
                if (i13 != 0) {
                    int[] iArr3 = this.giKS3J6vZuNy;
                    int i15 = (s0TASMVLSWD52 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.giKS3J6vZuNy;
                    defpackage.ie1.fWTAfUmVKrZq(iArr4, s0TASMVLSWD52, (iArr4[(s0TASMVLSWD52 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.giKS3J6vZuNy;
                if ((iArr5[(s0TASMVLSWD52 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                jjTN4uUnoyEn2 = jjTN4uUnoyEn(iArr5, jjTN4uUnoyEn2);
            }
        }
        this.T1fB7bDYiVJQ += i14;
    }

    public final int GcLuU6pT9wO9() {
        int s0TASMVLSWD5 = s0TASMVLSWD5(this.ZVVdXbWmyCSK);
        int i = this.ZVVdXbWmyCSK;
        int[] iArr = this.giKS3J6vZuNy;
        int i2 = s0TASMVLSWD5 * 5;
        int i3 = iArr[i2 + 3] + i;
        this.ZVVdXbWmyCSK = i3;
        this.e6mdH7fiFuta = QiMR8OkAhezm(iArr, s0TASMVLSWD5(i3));
        int i4 = this.giKS3J6vZuNy[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final boolean IBvW5fLsPuHy(int i, int i2) {
        if (i2 > 0) {
            java.util.ArrayList arrayList = this.JhCgjQRTAOCT;
            blKFvluuDQOf(i);
            if (!arrayList.isEmpty()) {
                java.util.HashMap hashMap = this.WDYagTQQm9ns;
                int i3 = i + i2;
                int ZpBGe2uQfcn8 = defpackage.ie1.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, i3, T1fB7bDYiVJQ() - this.P05cfTpS5W5L);
                if (ZpBGe2uQfcn8 >= this.JhCgjQRTAOCT.size()) {
                    ZpBGe2uQfcn8--;
                }
                int i4 = ZpBGe2uQfcn8 + 1;
                int i5 = 0;
                while (ZpBGe2uQfcn8 >= 0) {
                    defpackage.y20 y20Var = (defpackage.y20) this.JhCgjQRTAOCT.get(ZpBGe2uQfcn8);
                    int fWTAfUmVKrZq = fWTAfUmVKrZq(y20Var);
                    if (fWTAfUmVKrZq < i) {
                        break;
                    }
                    if (fWTAfUmVKrZq < i3) {
                        y20Var.ZpBGe2uQfcn8 = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = ZpBGe2uQfcn8 + 1;
                        }
                        i4 = ZpBGe2uQfcn8;
                    }
                    ZpBGe2uQfcn8--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.JhCgjQRTAOCT.subList(i4, i5).clear();
                }
            }
            this.QiMR8OkAhezm = i;
            this.P05cfTpS5W5L += i2;
            int i6 = this.h3m55N1URyyK;
            if (i6 > i) {
                this.h3m55N1URyyK = java.lang.Math.max(i, i6 - i2);
            }
            int i7 = this.w7APNrr0aGRc;
            if (i7 >= this.QiMR8OkAhezm) {
                this.w7APNrr0aGRc = i7 - i2;
            }
            int i8 = this.maCixPsq4ml2;
            if (i8 >= 0 && (this.giKS3J6vZuNy[(s0TASMVLSWD5(i8) * 5) + 1] & 67108864) != 0) {
                CZa7MwI9IzLd(i8);
            }
        }
        return r0;
    }

    public final void IJ0hOnjhPOri(int i) {
        if (i > 0) {
            int i2 = this.ZVVdXbWmyCSK;
            blKFvluuDQOf(i2);
            int i3 = this.QiMR8OkAhezm;
            int i4 = this.P05cfTpS5W5L;
            int[] iArr = this.giKS3J6vZuNy;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                defpackage.y7.cCeDCHgnx5OL(iArr, iArr2, 0, 0, i3 * 5);
                defpackage.y7.cCeDCHgnx5OL(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.giKS3J6vZuNy = iArr2;
                i4 = i6;
            }
            int i7 = this.w7APNrr0aGRc;
            if (i7 >= i3) {
                this.w7APNrr0aGRc = i7 + i;
            }
            int i8 = i3 + i;
            this.QiMR8OkAhezm = i8;
            this.P05cfTpS5W5L = i4 - i;
            int e6mdH7fiFuta = e6mdH7fiFuta(i5 > 0 ? oh71FJcDz6S2(i2 + i) : 0, this.h3m55N1URyyK >= i3 ? this.Ns0WNyEWdPsk : 0, this.fNwYGHIYeJcR, this.fWTAfUmVKrZq.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.giKS3J6vZuNy[(i9 * 5) + 4] = e6mdH7fiFuta;
            }
            int i10 = this.h3m55N1URyyK;
            if (i10 >= i3) {
                this.h3m55N1URyyK = i10 + i;
            }
        }
    }

    public final void JhCgjQRTAOCT() {
        int i = this.gUjdnLbkVAaA;
        this.gUjdnLbkVAaA = i + 1;
        if (i == 0) {
            this.WmetiUbpKU9I.fWTAfUmVKrZq((T1fB7bDYiVJQ() - this.P05cfTpS5W5L) - this.w7APNrr0aGRc);
        }
    }

    public final defpackage.y20 Jkfc0NcwyPL8(int i) {
        java.util.ArrayList arrayList;
        int WDYagTQQm9ns;
        if (i < 0 || i >= XntWc4eZSQ8j() || (WDYagTQQm9ns = defpackage.ie1.WDYagTQQm9ns((arrayList = this.JhCgjQRTAOCT), i, XntWc4eZSQ8j())) < 0) {
            return null;
        }
        return (defpackage.y20) arrayList.get(WDYagTQQm9ns);
    }

    public final boolean KrtOTfE6jiS2() {
        if (this.gUjdnLbkVAaA != 0) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot remove group while inserting");
        }
        int i = this.ZVVdXbWmyCSK;
        int i2 = this.e6mdH7fiFuta;
        int QiMR8OkAhezm = QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(i));
        int GcLuU6pT9wO9 = GcLuU6pT9wO9();
        zJPqDeoF0Os1(this.maCixPsq4ml2);
        defpackage.fn0 fn0Var = this.VFeft99leXEK;
        if (fn0Var != null) {
            while (true) {
                int i3 = fn0Var.giKS3J6vZuNy;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    throw new java.util.NoSuchElementException("IntList is empty.");
                }
                if (fn0Var.ZpBGe2uQfcn8[0] < i) {
                    break;
                }
                defpackage.q70.zJPqDeoF0Os1(fn0Var);
            }
        }
        boolean IBvW5fLsPuHy = IBvW5fLsPuHy(i, this.ZVVdXbWmyCSK - i);
        BXaznwstz2U0(QiMR8OkAhezm, this.e6mdH7fiFuta - QiMR8OkAhezm, i - 1);
        this.ZVVdXbWmyCSK = i;
        this.e6mdH7fiFuta = i2;
        this.T1fB7bDYiVJQ -= GcLuU6pT9wO9;
        return IBvW5fLsPuHy;
    }

    public final java.lang.Object Mearx7yMn90V(java.lang.Object obj) {
        if (this.gUjdnLbkVAaA > 0) {
            VFeft99leXEK(1, this.maCixPsq4ml2);
        }
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        int i = this.e6mdH7fiFuta;
        this.e6mdH7fiFuta = i + 1;
        java.lang.Object obj2 = objArr[P05cfTpS5W5L(i)];
        if (this.e6mdH7fiFuta > this.GE9mJIPrb8gP) {
            defpackage.ej.ZpBGe2uQfcn8("Writing to an invalid slot");
        }
        this.fWTAfUmVKrZq[P05cfTpS5W5L(this.e6mdH7fiFuta - 1)] = obj;
        return obj2;
    }

    public final void Ns0WNyEWdPsk() {
        if (this.gUjdnLbkVAaA <= 0) {
            defpackage.g11.giKS3J6vZuNy("Unbalanced begin/end insert");
        }
        int i = this.gUjdnLbkVAaA - 1;
        this.gUjdnLbkVAaA = i;
        if (i == 0) {
            if (this.s0TASMVLSWD5.giKS3J6vZuNy != this.XntWc4eZSQ8j.giKS3J6vZuNy) {
                defpackage.ej.ZpBGe2uQfcn8("startGroup/endGroup mismatch while inserting");
            }
            this.w7APNrr0aGRc = (T1fB7bDYiVJQ() - this.P05cfTpS5W5L) - this.WmetiUbpKU9I.giKS3J6vZuNy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OVwOqzUGHcCU(int i, java.lang.Object obj, boolean z, java.lang.Object obj2) {
        int i2;
        int i3 = this.maCixPsq4ml2;
        java.lang.Object[] objArr = this.gUjdnLbkVAaA > 0;
        this.s0TASMVLSWD5.fWTAfUmVKrZq(this.T1fB7bDYiVJQ);
        defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
        if (objArr == true) {
            int i4 = this.ZVVdXbWmyCSK;
            int QiMR8OkAhezm = QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(i4));
            IJ0hOnjhPOri(1);
            this.e6mdH7fiFuta = QiMR8OkAhezm;
            this.GE9mJIPrb8gP = QiMR8OkAhezm;
            int s0TASMVLSWD5 = s0TASMVLSWD5(i4);
            int i5 = obj != pa1Var ? 1 : 0;
            int i6 = (z || obj2 == pa1Var) ? 0 : 1;
            int e6mdH7fiFuta = e6mdH7fiFuta(QiMR8OkAhezm, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.fWTAfUmVKrZq.length);
            if (e6mdH7fiFuta >= 0 && this.h3m55N1URyyK < i4) {
                e6mdH7fiFuta = -(((this.fWTAfUmVKrZq.length - this.fNwYGHIYeJcR) - e6mdH7fiFuta) + 1);
            }
            int[] iArr = this.giKS3J6vZuNy;
            int i7 = this.maCixPsq4ml2;
            int i8 = s0TASMVLSWD5 * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = e6mdH7fiFuta;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                VFeft99leXEK(i9, i4);
                java.lang.Object[] objArr2 = this.fWTAfUmVKrZq;
                int i10 = this.e6mdH7fiFuta;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.e6mdH7fiFuta = i10;
            }
            this.T1fB7bDYiVJQ = 0;
            i2 = i4 + 1;
            this.maCixPsq4ml2 = i4;
            this.ZVVdXbWmyCSK = i2;
            if (i3 >= 0) {
                zJPqDeoF0Os1(i3);
            }
        } else {
            this.XntWc4eZSQ8j.fWTAfUmVKrZq(i3);
            this.WmetiUbpKU9I.fWTAfUmVKrZq((T1fB7bDYiVJQ() - this.P05cfTpS5W5L) - this.w7APNrr0aGRc);
            int i11 = this.ZVVdXbWmyCSK;
            int s0TASMVLSWD52 = s0TASMVLSWD5(i11);
            if (!defpackage.ma0.QiMR8OkAhezm(obj2, pa1Var)) {
                if (z) {
                    EPEWHACkMcF1(this.ZVVdXbWmyCSK, obj2);
                } else {
                    Fu5WBEia9jBo(obj2);
                }
            }
            this.e6mdH7fiFuta = w6IV1lieBIux(this.giKS3J6vZuNy, s0TASMVLSWD52);
            this.GE9mJIPrb8gP = QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(this.ZVVdXbWmyCSK + 1));
            int[] iArr2 = this.giKS3J6vZuNy;
            int i12 = s0TASMVLSWD52 * 5;
            this.T1fB7bDYiVJQ = iArr2[i12 + 1] & 67108863;
            this.maCixPsq4ml2 = i11;
            this.ZVVdXbWmyCSK = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.w7APNrr0aGRc = i2;
    }

    public final void OcTWLQzke1i2(defpackage.ge1 ge1Var, int i) {
        if (this.gUjdnLbkVAaA <= 0) {
            defpackage.ej.ZpBGe2uQfcn8("Check failed");
        }
        if (i == 0 && this.ZVVdXbWmyCSK == 0 && this.ZpBGe2uQfcn8.oh71FJcDz6S2 == 0) {
            int[] iArr = ge1Var.WDYagTQQm9ns;
            int i2 = iArr[(i * 5) + 3];
            int i3 = ge1Var.oh71FJcDz6S2;
            if (i2 == i3) {
                int[] iArr2 = this.giKS3J6vZuNy;
                java.lang.Object[] objArr = this.fWTAfUmVKrZq;
                java.util.ArrayList arrayList = this.JhCgjQRTAOCT;
                java.util.HashMap hashMap = this.WDYagTQQm9ns;
                defpackage.gn0 gn0Var = this.oh71FJcDz6S2;
                java.lang.Object[] objArr2 = ge1Var.QiMR8OkAhezm;
                int i4 = ge1Var.P05cfTpS5W5L;
                java.util.HashMap hashMap2 = ge1Var.gUjdnLbkVAaA;
                defpackage.gn0 gn0Var2 = ge1Var.T1fB7bDYiVJQ;
                this.giKS3J6vZuNy = iArr;
                this.fWTAfUmVKrZq = objArr2;
                this.JhCgjQRTAOCT = ge1Var.h3m55N1URyyK;
                this.QiMR8OkAhezm = i3;
                this.P05cfTpS5W5L = (iArr.length / 5) - i3;
                this.Ns0WNyEWdPsk = i4;
                this.fNwYGHIYeJcR = objArr2.length - i4;
                this.h3m55N1URyyK = i3;
                this.WDYagTQQm9ns = hashMap2;
                this.oh71FJcDz6S2 = gn0Var2;
                ge1Var.WDYagTQQm9ns = iArr2;
                ge1Var.oh71FJcDz6S2 = 0;
                ge1Var.QiMR8OkAhezm = objArr;
                ge1Var.P05cfTpS5W5L = 0;
                ge1Var.h3m55N1URyyK = arrayList;
                ge1Var.gUjdnLbkVAaA = hashMap;
                ge1Var.T1fB7bDYiVJQ = gn0Var;
                return;
            }
        }
        defpackage.je1 JhCgjQRTAOCT = ge1Var.JhCgjQRTAOCT();
        try {
            defpackage.b80.qjMheFZ0l9kA(JhCgjQRTAOCT, i, this, true, true, false);
            JhCgjQRTAOCT.WDYagTQQm9ns(true);
        } catch (java.lang.Throwable th) {
            JhCgjQRTAOCT.WDYagTQQm9ns(false);
            throw th;
        }
    }

    public final int P05cfTpS5W5L(int i) {
        return (this.fNwYGHIYeJcR * (i < this.Ns0WNyEWdPsk ? 0 : 1)) + i;
    }

    public final int QiMR8OkAhezm(int[] iArr, int i) {
        if (i >= T1fB7bDYiVJQ()) {
            return this.fWTAfUmVKrZq.length - this.fNwYGHIYeJcR;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.fWTAfUmVKrZq.length - this.fNwYGHIYeJcR) + i2 + 1 : i2;
    }

    public final int T1fB7bDYiVJQ() {
        return this.giKS3J6vZuNy.length / 5;
    }

    public final void UmgHb6n58gfG(int i, int i2) {
        int i3 = this.fNwYGHIYeJcR;
        int i4 = this.Ns0WNyEWdPsk;
        int i5 = this.h3m55N1URyyK;
        if (i4 != i) {
            java.lang.Object[] objArr = this.fWTAfUmVKrZq;
            if (i < i4) {
                java.lang.System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                java.lang.System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = java.lang.Math.min(i2 + 1, XntWc4eZSQ8j());
        if (i5 != min) {
            int length = this.fWTAfUmVKrZq.length - i3;
            if (min < i5) {
                int s0TASMVLSWD5 = s0TASMVLSWD5(min);
                int s0TASMVLSWD52 = s0TASMVLSWD5(i5);
                int i7 = this.QiMR8OkAhezm;
                while (s0TASMVLSWD5 < s0TASMVLSWD52) {
                    int i8 = (s0TASMVLSWD5 * 5) + 4;
                    int i9 = this.giKS3J6vZuNy[i8];
                    if (i9 < 0) {
                        defpackage.ej.ZpBGe2uQfcn8("Unexpected anchor value, expected a positive anchor");
                    }
                    this.giKS3J6vZuNy[i8] = -((length - i9) + 1);
                    s0TASMVLSWD5++;
                    if (s0TASMVLSWD5 == i7) {
                        s0TASMVLSWD5 += this.P05cfTpS5W5L;
                    }
                }
            } else {
                int s0TASMVLSWD53 = s0TASMVLSWD5(i5);
                int s0TASMVLSWD54 = s0TASMVLSWD5(min);
                while (s0TASMVLSWD53 < s0TASMVLSWD54) {
                    int i10 = (s0TASMVLSWD53 * 5) + 4;
                    int i11 = this.giKS3J6vZuNy[i10];
                    if (i11 >= 0) {
                        defpackage.ej.ZpBGe2uQfcn8("Unexpected anchor value, expected a negative anchor");
                    }
                    this.giKS3J6vZuNy[i10] = i11 + length + 1;
                    s0TASMVLSWD53++;
                    if (s0TASMVLSWD53 == this.QiMR8OkAhezm) {
                        s0TASMVLSWD53 += this.P05cfTpS5W5L;
                    }
                }
            }
            this.h3m55N1URyyK = min;
        }
        this.Ns0WNyEWdPsk = i;
    }

    public final void VFeft99leXEK(int i, int i2) {
        if (i > 0) {
            UmgHb6n58gfG(this.e6mdH7fiFuta, i2);
            int i3 = this.Ns0WNyEWdPsk;
            int i4 = this.fNwYGHIYeJcR;
            if (i4 < i) {
                java.lang.Object[] objArr = this.fWTAfUmVKrZq;
                int length = objArr.length;
                int i5 = length - i4;
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i5 + i), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i3);
                java.lang.System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.fWTAfUmVKrZq = objArr2;
                i4 = i7;
            }
            int i9 = this.GE9mJIPrb8gP;
            if (i9 >= i3) {
                this.GE9mJIPrb8gP = i9 + i;
            }
            this.Ns0WNyEWdPsk = i3 + i;
            this.fNwYGHIYeJcR = i4 - i;
        }
    }

    public final void WDYagTQQm9ns(boolean z) {
        this.IJ0hOnjhPOri = true;
        if (z && this.XntWc4eZSQ8j.giKS3J6vZuNy == 0) {
            blKFvluuDQOf(XntWc4eZSQ8j());
            UmgHb6n58gfG(this.fWTAfUmVKrZq.length - this.fNwYGHIYeJcR, this.QiMR8OkAhezm);
            int i = this.Ns0WNyEWdPsk;
            java.util.Arrays.fill(this.fWTAfUmVKrZq, i, this.fNwYGHIYeJcR + i, (java.lang.Object) null);
            frSwwKIlbUhK();
        }
        int[] iArr = this.giKS3J6vZuNy;
        int i2 = this.QiMR8OkAhezm;
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        int i3 = this.Ns0WNyEWdPsk;
        java.util.ArrayList arrayList = this.JhCgjQRTAOCT;
        java.util.HashMap hashMap = this.WDYagTQQm9ns;
        defpackage.gn0 gn0Var = this.oh71FJcDz6S2;
        defpackage.ge1 ge1Var = this.ZpBGe2uQfcn8;
        if (!ge1Var.Ns0WNyEWdPsk) {
            defpackage.g11.ZpBGe2uQfcn8("Unexpected writer close()");
        }
        ge1Var.Ns0WNyEWdPsk = false;
        ge1Var.WDYagTQQm9ns = iArr;
        ge1Var.oh71FJcDz6S2 = i2;
        ge1Var.QiMR8OkAhezm = objArr;
        ge1Var.P05cfTpS5W5L = i3;
        ge1Var.h3m55N1URyyK = arrayList;
        ge1Var.gUjdnLbkVAaA = hashMap;
        ge1Var.T1fB7bDYiVJQ = gn0Var;
    }

    public final void Wc0TdmRSwbbi() {
        if (this.gUjdnLbkVAaA != 0) {
            defpackage.ej.ZpBGe2uQfcn8("Key must be supplied when inserting");
        }
        defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
        OVwOqzUGHcCU(0, pa1Var, false, pa1Var);
    }

    public final java.lang.Object WmetiUbpKU9I(int i) {
        int s0TASMVLSWD5 = s0TASMVLSWD5(i);
        int[] iArr = this.giKS3J6vZuNy;
        int i2 = (s0TASMVLSWD5 * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return defpackage.cj.ZpBGe2uQfcn8;
        }
        return this.fWTAfUmVKrZq[java.lang.Integer.bitCount(iArr[i2] >> 29) + QiMR8OkAhezm(iArr, s0TASMVLSWD5)];
    }

    public final int XntWc4eZSQ8j() {
        return T1fB7bDYiVJQ() - this.P05cfTpS5W5L;
    }

    public final java.lang.Object ZVVdXbWmyCSK(int i) {
        int s0TASMVLSWD5 = s0TASMVLSWD5(i);
        int[] iArr = this.giKS3J6vZuNy;
        int i2 = s0TASMVLSWD5 * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.fWTAfUmVKrZq[java.lang.Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void ZpBGe2uQfcn8(int i) {
        if (i < 0) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot seek backwards");
        }
        if (this.gUjdnLbkVAaA > 0) {
            defpackage.g11.giKS3J6vZuNy("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.ZVVdXbWmyCSK + i;
        if (i2 < this.maCixPsq4ml2 || i2 > this.w7APNrr0aGRc) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot seek outside the current group (" + this.maCixPsq4ml2 + '-' + this.w7APNrr0aGRc + ')');
        }
        this.ZVVdXbWmyCSK = i2;
        int QiMR8OkAhezm = QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(i2));
        this.e6mdH7fiFuta = QiMR8OkAhezm;
        this.GE9mJIPrb8gP = QiMR8OkAhezm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.giKS3J6vZuNy;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.y7.cCeDCHgnx5OL(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.y7.cCeDCHgnx5OL(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void blKFvluuDQOf(int i) {
        defpackage.y20 y20Var;
        int i2;
        defpackage.y20 y20Var2;
        int i3;
        int i4;
        int i5 = this.P05cfTpS5W5L;
        int i6 = this.QiMR8OkAhezm;
        if (i6 != i) {
            if (!this.JhCgjQRTAOCT.isEmpty()) {
                int T1fB7bDYiVJQ = T1fB7bDYiVJQ() - this.P05cfTpS5W5L;
                java.util.ArrayList arrayList = this.JhCgjQRTAOCT;
                if (i6 < i) {
                    for (int ZpBGe2uQfcn8 = defpackage.ie1.ZpBGe2uQfcn8(arrayList, i6, T1fB7bDYiVJQ); ZpBGe2uQfcn8 < this.JhCgjQRTAOCT.size() && (i3 = (y20Var2 = (defpackage.y20) this.JhCgjQRTAOCT.get(ZpBGe2uQfcn8)).ZpBGe2uQfcn8) < 0 && (i4 = i3 + T1fB7bDYiVJQ) < i; ZpBGe2uQfcn8++) {
                        y20Var2.ZpBGe2uQfcn8 = i4;
                    }
                } else {
                    for (int ZpBGe2uQfcn82 = defpackage.ie1.ZpBGe2uQfcn8(arrayList, i, T1fB7bDYiVJQ); ZpBGe2uQfcn82 < this.JhCgjQRTAOCT.size() && (i2 = (y20Var = (defpackage.y20) this.JhCgjQRTAOCT.get(ZpBGe2uQfcn82)).ZpBGe2uQfcn8) >= 0; ZpBGe2uQfcn82++) {
                        y20Var.ZpBGe2uQfcn8 = -(T1fB7bDYiVJQ - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int T1fB7bDYiVJQ2 = T1fB7bDYiVJQ();
            if (i6 >= T1fB7bDYiVJQ2) {
                defpackage.ej.ZpBGe2uQfcn8("Check failed");
            }
            while (i6 < T1fB7bDYiVJQ2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.giKS3J6vZuNy[i7];
                int XntWc4eZSQ8j = i8 > -2 ? i8 : (XntWc4eZSQ8j() + i8) - (-2);
                if (XntWc4eZSQ8j >= i) {
                    XntWc4eZSQ8j = -((XntWc4eZSQ8j() - XntWc4eZSQ8j) - (-2));
                }
                if (XntWc4eZSQ8j != i8) {
                    this.giKS3J6vZuNy[i7] = XntWc4eZSQ8j;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.QiMR8OkAhezm = i;
    }

    public final void fNwYGHIYeJcR(int i) {
        boolean z = false;
        if (!(this.gUjdnLbkVAaA <= 0)) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.maCixPsq4ml2;
        if (i2 != i) {
            if (i >= i2 && i < this.w7APNrr0aGRc) {
                z = true;
            }
            if (!z) {
                defpackage.ej.ZpBGe2uQfcn8("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.ZVVdXbWmyCSK;
            int i4 = this.e6mdH7fiFuta;
            int i5 = this.GE9mJIPrb8gP;
            this.ZVVdXbWmyCSK = i;
            Wc0TdmRSwbbi();
            this.ZVVdXbWmyCSK = i3;
            this.e6mdH7fiFuta = i4;
            this.GE9mJIPrb8gP = i5;
        }
    }

    public final int fWTAfUmVKrZq(defpackage.y20 y20Var) {
        int i = y20Var.ZpBGe2uQfcn8;
        return i < 0 ? XntWc4eZSQ8j() + i : i;
    }

    public final void frSwwKIlbUhK() {
        int i;
        defpackage.fn0 fn0Var = this.VFeft99leXEK;
        if (fn0Var != null) {
            while (fn0Var.giKS3J6vZuNy != 0) {
                int zJPqDeoF0Os1 = defpackage.q70.zJPqDeoF0Os1(fn0Var);
                int s0TASMVLSWD5 = s0TASMVLSWD5(zJPqDeoF0Os1);
                int i2 = zJPqDeoF0Os1 + 1;
                int w7APNrr0aGRc = w7APNrr0aGRc(zJPqDeoF0Os1) + zJPqDeoF0Os1;
                while (true) {
                    if (i2 >= w7APNrr0aGRc) {
                        i = 0;
                        break;
                    } else {
                        if ((this.giKS3J6vZuNy[(s0TASMVLSWD5(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += w7APNrr0aGRc(i2);
                    }
                }
                int[] iArr = this.giKS3J6vZuNy;
                int i3 = (s0TASMVLSWD5 * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int jjTN4uUnoyEn = jjTN4uUnoyEn(iArr, zJPqDeoF0Os1);
                    if (jjTN4uUnoyEn >= 0) {
                        defpackage.q70.GE9mJIPrb8gP(fn0Var, jjTN4uUnoyEn);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gUjdnLbkVAaA(int i, defpackage.c20 c20Var) {
        int i2;
        int i3;
        int i4;
        defpackage.c20 c20Var2 = c20Var;
        int jjTN4uUnoyEn = jjTN4uUnoyEn(this.giKS3J6vZuNy, i);
        int XntWc4eZSQ8j = XntWc4eZSQ8j();
        int w7APNrr0aGRc = w7APNrr0aGRc(i) + i;
        int i5 = i;
        defpackage.hn0 hn0Var = null;
        defpackage.fn0 fn0Var = null;
        loop0: while (i5 < w7APNrr0aGRc) {
            int oh71FJcDz6S2 = oh71FJcDz6S2(i5);
            int i6 = i5 + 1;
            int oh71FJcDz6S22 = oh71FJcDz6S2(i6);
            while (oh71FJcDz6S2 < oh71FJcDz6S22) {
                java.lang.Object obj = this.fWTAfUmVKrZq[P05cfTpS5W5L(oh71FJcDz6S2)];
                if (obj instanceof defpackage.j30) {
                    defpackage.j30 j30Var = (defpackage.j30) obj;
                    if (!(j30Var instanceof defpackage.j30)) {
                        j30Var = null;
                    }
                    if (j30Var == null) {
                        defpackage.ej.giKS3J6vZuNy("Inconsistent composition");
                        defpackage.h7.JhCgjQRTAOCT();
                        return;
                    }
                    int i7 = j30Var.giKS3J6vZuNy;
                    if (i7 >= 0) {
                        int w7APNrr0aGRc2 = w7APNrr0aGRc(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < w7APNrr0aGRc2 && i9 < i7) {
                            int s0TASMVLSWD5 = s0TASMVLSWD5(i8);
                            int i10 = jjTN4uUnoyEn;
                            int[] iArr = this.giKS3J6vZuNy;
                            int i11 = s0TASMVLSWD5 * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < w7APNrr0aGRc2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            jjTN4uUnoyEn = i10;
                        }
                        i4 = jjTN4uUnoyEn;
                        if (hn0Var == null) {
                            int[] iArr2 = defpackage.t90.ZpBGe2uQfcn8;
                            hn0Var = new defpackage.hn0();
                        }
                        if (fn0Var == null) {
                            fn0Var = new defpackage.fn0();
                        }
                        hn0Var.ZpBGe2uQfcn8(i8);
                        fn0Var.ZpBGe2uQfcn8(i8);
                        fn0Var.ZpBGe2uQfcn8(oh71FJcDz6S2);
                        oh71FJcDz6S2++;
                        jjTN4uUnoyEn = i4;
                    }
                }
                i4 = jjTN4uUnoyEn;
                c20Var2.QiMR8OkAhezm(java.lang.Integer.valueOf(oh71FJcDz6S2), obj);
                oh71FJcDz6S2++;
                jjTN4uUnoyEn = i4;
            }
            int i12 = jjTN4uUnoyEn;
            jjTN4uUnoyEn = i6 < XntWc4eZSQ8j ? jjTN4uUnoyEn(this.giKS3J6vZuNy, i6) : -1;
            if (jjTN4uUnoyEn != i5) {
                int i13 = i12;
                while (true) {
                    if (fn0Var == null || hn0Var == null || !hn0Var.WDYagTQQm9ns(i5)) {
                        i2 = XntWc4eZSQ8j;
                    } else {
                        int i14 = fn0Var.giKS3J6vZuNy;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = XntWc4eZSQ8j;
                            int giKS3J6vZuNy = fn0Var.giKS3J6vZuNy(i18);
                            if (giKS3J6vZuNy == i5) {
                                int giKS3J6vZuNy2 = fn0Var.giKS3J6vZuNy(i18 + 1);
                                c20Var2.QiMR8OkAhezm(java.lang.Integer.valueOf(giKS3J6vZuNy2), this.fWTAfUmVKrZq[P05cfTpS5W5L(giKS3J6vZuNy2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                fn0Var.WDYagTQQm9ns(i17, giKS3J6vZuNy);
                                i17 += 2;
                                fn0Var.WDYagTQQm9ns(i20, fn0Var.giKS3J6vZuNy(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            c20Var2 = c20Var;
                            XntWc4eZSQ8j = i19;
                        }
                        i2 = XntWc4eZSQ8j;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = fn0Var.giKS3J6vZuNy) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                defpackage.h7.w7APNrr0aGRc("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = fn0Var.ZpBGe2uQfcn8;
                                    defpackage.y7.cCeDCHgnx5OL(iArr3, iArr3, i17, i14, i3);
                                }
                                fn0Var.giKS3J6vZuNy -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != jjTN4uUnoyEn) {
                        i5 = i13;
                        XntWc4eZSQ8j = i2;
                        i13 = jjTN4uUnoyEn(this.giKS3J6vZuNy, i13);
                        c20Var2 = c20Var;
                    }
                }
            } else {
                i2 = XntWc4eZSQ8j;
            }
            c20Var2 = c20Var;
            i5 = i6;
            XntWc4eZSQ8j = i2;
        }
    }

    public final defpackage.y20 giKS3J6vZuNy(int i) {
        java.util.ArrayList arrayList = this.JhCgjQRTAOCT;
        int WDYagTQQm9ns = defpackage.ie1.WDYagTQQm9ns(arrayList, i, XntWc4eZSQ8j());
        if (WDYagTQQm9ns >= 0) {
            return (defpackage.y20) arrayList.get(WDYagTQQm9ns);
        }
        if (i > this.QiMR8OkAhezm) {
            i = -(XntWc4eZSQ8j() - i);
        }
        defpackage.y20 y20Var = new defpackage.y20(i);
        arrayList.add(-(WDYagTQQm9ns + 1), y20Var);
        return y20Var;
    }

    public final void h3m55N1URyyK(int i, int i2, int i3) {
        if (i >= this.QiMR8OkAhezm) {
            i = -((XntWc4eZSQ8j() - i) + 2);
        }
        while (i3 < i2) {
            this.giKS3J6vZuNy[(s0TASMVLSWD5(i3) * 5) + 2] = i;
            int i4 = this.giKS3J6vZuNy[(s0TASMVLSWD5(i3) * 5) + 3] + i3;
            h3m55N1URyyK(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final java.lang.Object hH0RRJrNssvh(int i, int i2, java.lang.Object obj) {
        int w6IV1lieBIux = w6IV1lieBIux(this.giKS3J6vZuNy, s0TASMVLSWD5(i));
        int QiMR8OkAhezm = QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(i + 1));
        int i3 = w6IV1lieBIux + i2;
        if (i3 < w6IV1lieBIux || i3 >= QiMR8OkAhezm) {
            defpackage.ej.ZpBGe2uQfcn8("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int P05cfTpS5W5L = P05cfTpS5W5L(i3);
        java.lang.Object[] objArr = this.fWTAfUmVKrZq;
        java.lang.Object obj2 = objArr[P05cfTpS5W5L];
        objArr[P05cfTpS5W5L] = obj;
        return obj2;
    }

    public final int jjTN4uUnoyEn(int[] iArr, int i) {
        int i2 = iArr[(s0TASMVLSWD5(i) * 5) + 2];
        return i2 > -2 ? i2 : (XntWc4eZSQ8j() + i2) - (-2);
    }

    public final boolean maCixPsq4ml2(int i, int i2) {
        int T1fB7bDYiVJQ;
        int w7APNrr0aGRc;
        if (i2 == this.maCixPsq4ml2) {
            T1fB7bDYiVJQ = this.w7APNrr0aGRc;
        } else {
            defpackage.v90 v90Var = this.XntWc4eZSQ8j;
            if (i2 > v90Var.ZpBGe2uQfcn8(0)) {
                w7APNrr0aGRc = w7APNrr0aGRc(i2);
            } else {
                int[] iArr = v90Var.ZpBGe2uQfcn8;
                int min = java.lang.Math.min(iArr.length, v90Var.giKS3J6vZuNy);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    w7APNrr0aGRc = w7APNrr0aGRc(i2);
                } else {
                    T1fB7bDYiVJQ = (T1fB7bDYiVJQ() - this.P05cfTpS5W5L) - this.WmetiUbpKU9I.ZpBGe2uQfcn8[i3];
                }
            }
            T1fB7bDYiVJQ = w7APNrr0aGRc + i2;
        }
        return i > i2 && i < T1fB7bDYiVJQ;
    }

    public final boolean oCu53ZX2v4Ju(int i) {
        return (this.giKS3J6vZuNy[(s0TASMVLSWD5(i) * 5) + 1] & 1073741824) != 0;
    }

    public final int oh71FJcDz6S2(int i) {
        return QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(i));
    }

    public final java.lang.Object qjMheFZ0l9kA(int i) {
        int s0TASMVLSWD5 = s0TASMVLSWD5(i);
        int[] iArr = this.giKS3J6vZuNy;
        if ((iArr[(s0TASMVLSWD5 * 5) + 1] & 1073741824) != 0) {
            return this.fWTAfUmVKrZq[P05cfTpS5W5L(QiMR8OkAhezm(iArr, s0TASMVLSWD5))];
        }
        return null;
    }

    public final int s0TASMVLSWD5(int i) {
        return (this.P05cfTpS5W5L * (i < this.QiMR8OkAhezm ? 0 : 1)) + i;
    }

    public final java.lang.String toString() {
        return "SlotWriter(current = " + this.ZVVdXbWmyCSK + " end=" + this.w7APNrr0aGRc + " size = " + XntWc4eZSQ8j() + " gap=" + this.QiMR8OkAhezm + '-' + (this.QiMR8OkAhezm + this.P05cfTpS5W5L) + ')';
    }

    public final int w6IV1lieBIux(int[] iArr, int i) {
        if (i >= T1fB7bDYiVJQ()) {
            return this.fWTAfUmVKrZq.length - this.fNwYGHIYeJcR;
        }
        int giKS3J6vZuNy = defpackage.ie1.giKS3J6vZuNy(iArr, i);
        return giKS3J6vZuNy < 0 ? (this.fWTAfUmVKrZq.length - this.fNwYGHIYeJcR) + giKS3J6vZuNy + 1 : giKS3J6vZuNy;
    }

    public final int w7APNrr0aGRc(int i) {
        return this.giKS3J6vZuNy[(s0TASMVLSWD5(i) * 5) + 3];
    }

    public final void xahdJg25P1Bv() {
        int i = this.w7APNrr0aGRc;
        this.ZVVdXbWmyCSK = i;
        this.e6mdH7fiFuta = QiMR8OkAhezm(this.giKS3J6vZuNy, s0TASMVLSWD5(i));
    }

    public final defpackage.g30 zJPqDeoF0Os1(int i) {
        defpackage.y20 Jkfc0NcwyPL8;
        java.util.HashMap hashMap = this.WDYagTQQm9ns;
        if (hashMap == null || (Jkfc0NcwyPL8 = Jkfc0NcwyPL8(i)) == null) {
            return null;
        }
        return (defpackage.g30) hashMap.get(Jkfc0NcwyPL8);
    }
}
