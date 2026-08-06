package defpackage;

/* loaded from: classes.dex */
public final class ru0 extends defpackage.D2vUnMij {
    public final int AARZUJiTa;
    public final int EXtogiMhuM;
    public final java.lang.Object[] adDC3e2L;
    public final java.lang.Object[] xiZrDbcSW0;

    public ru0(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2) {
        this.adDC3e2L = objArr;
        this.xiZrDbcSW0 = objArr2;
        this.AARZUJiTa = i;
        this.EXtogiMhuM = i2;
        if (!(IHQe1A4L2xu() > 32)) {
            defpackage.nw0.IHQe1A4L2xu("Trie-based persistent vector should have at least 33 elements, got " + IHQe1A4L2xu());
        }
        int length = objArr2.length;
    }

    public static java.lang.Object[] JlrlGoKF(java.lang.Object[] objArr, int i, int i2, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        java.lang.Object[] JlrlGoKF;
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        if (i == 5) {
            fyULxpbU8bu.IHQe1A4L2xu = objArr[kNAkVymC];
            JlrlGoKF = null;
        } else {
            java.lang.Object obj = objArr[kNAkVymC];
            obj.getClass();
            JlrlGoKF = JlrlGoKF((java.lang.Object[]) obj, i - 5, i2, fyULxpbU8bu);
        }
        if (JlrlGoKF == null && kNAkVymC == 0) {
            return null;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        copyOf[kNAkVymC] = JlrlGoKF;
        return copyOf;
    }

    public static java.lang.Object[] SH1y5HwkJhh(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        if (i == 0) {
            java.lang.Object[] copyOf = kNAkVymC == 0 ? new java.lang.Object[32] : java.util.Arrays.copyOf(objArr, 32);
            defpackage.t6.wKlPRKlRnfqr(objArr, copyOf, kNAkVymC + 1, kNAkVymC, 31);
            fyULxpbU8bu.IHQe1A4L2xu = objArr[31];
            copyOf[kNAkVymC] = obj;
            return copyOf;
        }
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        java.lang.Object obj2 = objArr[kNAkVymC];
        obj2.getClass();
        copyOf2[kNAkVymC] = SH1y5HwkJhh((java.lang.Object[]) obj2, i3, i2, obj, fyULxpbU8bu);
        while (true) {
            kNAkVymC++;
            if (kNAkVymC >= 32 || copyOf2[kNAkVymC] == null) {
                break;
            }
            java.lang.Object obj3 = objArr[kNAkVymC];
            obj3.getClass();
            copyOf2[kNAkVymC] = SH1y5HwkJhh((java.lang.Object[]) obj3, i3, 0, fyULxpbU8bu.IHQe1A4L2xu, fyULxpbU8bu);
        }
        return copyOf2;
    }

    public static java.lang.Object[] kd6TUFXn(int i, int i2, java.lang.Object obj, java.lang.Object[] objArr) {
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[kNAkVymC] = obj;
            return copyOf;
        }
        java.lang.Object obj2 = copyOf[kNAkVymC];
        obj2.getClass();
        copyOf[kNAkVymC] = kd6TUFXn(i - 5, i2, obj, (java.lang.Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij AARZUJiTa(defpackage.v5iciZok v5icizok) {
        defpackage.su0 su0Var = new defpackage.su0(this, this.adDC3e2L, this.xiZrDbcSW0, this.EXtogiMhuM);
        su0Var.QQUzIjv3iOC5(v5icizok);
        return su0Var.r1MBDhnF();
    }

    public final defpackage.ru0 DFo87pBq1E5(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.AARZUJiTa;
        int i2 = i >> 5;
        int i3 = this.EXtogiMhuM;
        if (i2 <= (1 << i3)) {
            return new defpackage.ru0(SyNS6RMn(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        java.lang.Object[] objArr4 = new java.lang.Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new defpackage.ru0(SyNS6RMn(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij EXtogiMhuM(int i) {
        defpackage.e90.riuEU0zW4(i, IHQe1A4L2xu());
        int G3OKOH3wZRC = G3OKOH3wZRC();
        int i2 = this.EXtogiMhuM;
        java.lang.Object[] objArr = this.adDC3e2L;
        return i >= G3OKOH3wZRC ? QoRHpC4k(objArr, G3OKOH3wZRC, i2, i - G3OKOH3wZRC) : QoRHpC4k(cnag84Bm(objArr, i2, i, new defpackage.FyULxpbU8bu(this.xiZrDbcSW0[0])), G3OKOH3wZRC, i2, 0);
    }

    public final int G3OKOH3wZRC() {
        return (this.AARZUJiTa - 1) & (-32);
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.AARZUJiTa;
    }

    public final defpackage.D2vUnMij QoRHpC4k(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.AARZUJiTa - i;
        if (i4 != 1) {
            java.lang.Object[] objArr2 = this.xiZrDbcSW0;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                defpackage.t6.wKlPRKlRnfqr(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new defpackage.ru0(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = java.util.Arrays.copyOf(objArr, 32);
            }
            return new defpackage.ja1(objArr);
        }
        defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(null);
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr, i2, i - 1, fyULxpbU8bu);
        JlrlGoKF.getClass();
        java.lang.Object obj = fyULxpbU8bu.IHQe1A4L2xu;
        obj.getClass();
        java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
        if (JlrlGoKF[1] != null) {
            return new defpackage.ru0(JlrlGoKF, objArr3, i, i2);
        }
        java.lang.Object obj2 = JlrlGoKF[0];
        obj2.getClass();
        return new defpackage.ru0((java.lang.Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final java.lang.Object[] SyNS6RMn(int i, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int kNAkVymC = defpackage.c80.kNAkVymC(IHQe1A4L2xu() - 1, i);
        java.lang.Object[] copyOf = objArr != null ? java.util.Arrays.copyOf(objArr, 32) : new java.lang.Object[32];
        if (i == 5) {
            copyOf[kNAkVymC] = objArr2;
            return copyOf;
        }
        copyOf[kNAkVymC] = SyNS6RMn(i - 5, (java.lang.Object[]) copyOf[kNAkVymC], objArr2);
        return copyOf;
    }

    public final java.lang.Object[] cnag84Bm(java.lang.Object[] objArr, int i, int i2, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        if (i == 0) {
            java.lang.Object[] copyOf = kNAkVymC == 0 ? new java.lang.Object[32] : java.util.Arrays.copyOf(objArr, 32);
            defpackage.t6.wKlPRKlRnfqr(objArr, copyOf, kNAkVymC, kNAkVymC + 1, 32);
            copyOf[31] = fyULxpbU8bu.IHQe1A4L2xu;
            fyULxpbU8bu.IHQe1A4L2xu = objArr[kNAkVymC];
            return copyOf;
        }
        int kNAkVymC2 = objArr[31] == null ? defpackage.c80.kNAkVymC(G3OKOH3wZRC() - 1, i) : 31;
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = kNAkVymC + 1;
        if (i4 <= kNAkVymC2) {
            while (true) {
                java.lang.Object obj = copyOf2[kNAkVymC2];
                obj.getClass();
                copyOf2[kNAkVymC2] = cnag84Bm((java.lang.Object[]) obj, i3, 0, fyULxpbU8bu);
                if (kNAkVymC2 == i4) {
                    break;
                }
                kNAkVymC2--;
            }
        }
        java.lang.Object obj2 = copyOf2[kNAkVymC];
        obj2.getClass();
        copyOf2[kNAkVymC] = cnag84Bm((java.lang.Object[]) obj2, i3, i2, fyULxpbU8bu);
        return copyOf2;
    }

    public final defpackage.ru0 ez2rX8ReCYw(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int G3OKOH3wZRC = G3OKOH3wZRC();
        int i2 = this.AARZUJiTa;
        int i3 = i2 - G3OKOH3wZRC;
        java.lang.Object[] objArr2 = this.xiZrDbcSW0;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            defpackage.t6.wKlPRKlRnfqr(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new defpackage.ru0(objArr, copyOf, i2 + 1, this.EXtogiMhuM);
        }
        java.lang.Object obj2 = objArr2[31];
        defpackage.t6.wKlPRKlRnfqr(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = obj2;
        return DFo87pBq1E5(objArr, copyOf, objArr3);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr;
        defpackage.e90.riuEU0zW4(i, IHQe1A4L2xu());
        if (G3OKOH3wZRC() <= i) {
            objArr = this.xiZrDbcSW0;
        } else {
            java.lang.Object[] objArr2 = this.adDC3e2L;
            for (int i2 = this.EXtogiMhuM; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[defpackage.c80.kNAkVymC(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.e90.ez2rX8ReCYw(i, this.AARZUJiTa);
        return new defpackage.tu0(this.adDC3e2L, this.xiZrDbcSW0, i, this.AARZUJiTa, (this.EXtogiMhuM / 5) + 1);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij oh6vYeIP(int i, java.lang.Object obj) {
        int i2 = this.AARZUJiTa;
        defpackage.e90.ez2rX8ReCYw(i, i2);
        if (i == i2) {
            return r1MBDhnF(obj);
        }
        int G3OKOH3wZRC = G3OKOH3wZRC();
        java.lang.Object[] objArr = this.adDC3e2L;
        if (i >= G3OKOH3wZRC) {
            return ez2rX8ReCYw(objArr, i - G3OKOH3wZRC, obj);
        }
        defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(null);
        return ez2rX8ReCYw(SH1y5HwkJhh(objArr, this.EXtogiMhuM, i, obj, fyULxpbU8bu), 0, fyULxpbU8bu.IHQe1A4L2xu);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij r1MBDhnF(java.lang.Object obj) {
        int G3OKOH3wZRC = G3OKOH3wZRC();
        int i = this.AARZUJiTa;
        int i2 = i - G3OKOH3wZRC;
        java.lang.Object[] objArr = this.adDC3e2L;
        java.lang.Object[] objArr2 = this.xiZrDbcSW0;
        if (i2 < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new defpackage.ru0(objArr, copyOf, i + 1, this.EXtogiMhuM);
        }
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = obj;
        return DFo87pBq1E5(objArr, objArr2, objArr3);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij riuEU0zW4(int i, java.lang.Object obj) {
        int i2 = this.AARZUJiTa;
        defpackage.e90.riuEU0zW4(i, i2);
        int G3OKOH3wZRC = G3OKOH3wZRC();
        java.lang.Object[] objArr = this.adDC3e2L;
        java.lang.Object[] objArr2 = this.xiZrDbcSW0;
        int i3 = this.EXtogiMhuM;
        if (G3OKOH3wZRC > i) {
            return new defpackage.ru0(kd6TUFXn(i3, i, obj, objArr), objArr2, i2, i3);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new defpackage.ru0(objArr, copyOf, i2, i3);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.su0 xiZrDbcSW0() {
        return new defpackage.su0(this, this.adDC3e2L, this.xiZrDbcSW0, this.EXtogiMhuM);
    }
}
