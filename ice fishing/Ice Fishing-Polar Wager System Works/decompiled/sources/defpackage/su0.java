package defpackage;

/* loaded from: classes.dex */
public final class su0 extends defpackage.UsuH8pd5P implements java.util.Collection, defpackage.g90 {
    public java.lang.Object[] AARZUJiTa;
    public int EXtogiMhuM;
    public int JlrlGoKF;
    public java.lang.Object[] SH1y5HwkJhh;
    public defpackage.D2vUnMij adDC3e2L;
    public java.lang.Object[] ez2rX8ReCYw;
    public defpackage.ky riuEU0zW4 = new defpackage.ky(10);
    public java.lang.Object[] xiZrDbcSW0;

    public su0(defpackage.D2vUnMij d2vUnMij, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        this.adDC3e2L = d2vUnMij;
        this.xiZrDbcSW0 = objArr;
        this.AARZUJiTa = objArr2;
        this.EXtogiMhuM = i;
        this.SH1y5HwkJhh = objArr;
        this.ez2rX8ReCYw = objArr2;
        this.JlrlGoKF = d2vUnMij.IHQe1A4L2xu();
    }

    public static void adDC3e2L(java.lang.Object[] objArr, int i, java.util.Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final void AARZUJiTa(java.util.Collection collection, int i, int i2, java.lang.Object[][] objArr, int i3, java.lang.Object[] objArr2) {
        if (this.SH1y5HwkJhh == null) {
            defpackage.db.AARZUJiTa("root is null");
            return;
        }
        int i4 = i >> 5;
        defpackage.NHJTzaLwkd ez2rX8ReCYw = ez2rX8ReCYw(nBH8hAHy() >> 5);
        int i5 = i3;
        java.lang.Object[] objArr3 = objArr2;
        while (ez2rX8ReCYw.adDC3e2L - 1 != i4) {
            java.lang.Object[] objArr4 = (java.lang.Object[]) ez2rX8ReCYw.previous();
            defpackage.t6.wKlPRKlRnfqr(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = DFo87pBq1E5(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        java.lang.Object[] objArr5 = (java.lang.Object[]) ez2rX8ReCYw.previous();
        int nBH8hAHy = i3 - (((nBH8hAHy() >> 5) - 1) - i4);
        if (nBH8hAHy < i3) {
            objArr2 = objArr[nBH8hAHy];
            objArr2.getClass();
        }
        D2vUnMij(collection, i, objArr5, 32, objArr, nBH8hAHy, objArr2);
    }

    public final java.lang.Object[] C0U8sNJm(java.lang.Object[] objArr, int i, int i2, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        if (i == 0) {
            java.lang.Object obj = objArr[kNAkVymC];
            java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
            defpackage.t6.wKlPRKlRnfqr(objArr, JlrlGoKF, kNAkVymC, kNAkVymC + 1, 32);
            JlrlGoKF[31] = fyULxpbU8bu.IHQe1A4L2xu;
            fyULxpbU8bu.IHQe1A4L2xu = obj;
            return JlrlGoKF;
        }
        int kNAkVymC2 = objArr[31] == null ? defpackage.c80.kNAkVymC(nBH8hAHy() - 1, i) : 31;
        java.lang.Object[] JlrlGoKF2 = JlrlGoKF(objArr);
        int i3 = i - 5;
        int i4 = kNAkVymC + 1;
        if (i4 <= kNAkVymC2) {
            while (true) {
                java.lang.Object obj2 = JlrlGoKF2[kNAkVymC2];
                obj2.getClass();
                JlrlGoKF2[kNAkVymC2] = C0U8sNJm((java.lang.Object[]) obj2, i3, 0, fyULxpbU8bu);
                if (kNAkVymC2 == i4) {
                    break;
                }
                kNAkVymC2--;
            }
        }
        java.lang.Object obj3 = JlrlGoKF2[kNAkVymC];
        obj3.getClass();
        JlrlGoKF2[kNAkVymC] = C0U8sNJm((java.lang.Object[]) obj3, i3, i2, fyULxpbU8bu);
        return JlrlGoKF2;
    }

    public final void D2vUnMij(java.util.Collection collection, int i, java.lang.Object[] objArr, int i2, java.lang.Object[][] objArr2, int i3, java.lang.Object[] objArr3) {
        java.lang.Object[] SyNS6RMn;
        if (i3 < 1) {
            defpackage.nw0.IHQe1A4L2xu("requires at least one nullBuffer");
        }
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
        objArr2[0] = JlrlGoKF;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            defpackage.t6.wKlPRKlRnfqr(JlrlGoKF, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                SyNS6RMn = JlrlGoKF;
            } else {
                SyNS6RMn = SyNS6RMn();
                i3--;
                objArr2[i3] = SyNS6RMn;
            }
            int i7 = i2 - i6;
            defpackage.t6.wKlPRKlRnfqr(JlrlGoKF, objArr3, 0, i7, i2);
            defpackage.t6.wKlPRKlRnfqr(JlrlGoKF, SyNS6RMn, size + 1, i4, i7);
            objArr3 = SyNS6RMn;
        }
        java.util.Iterator it = collection.iterator();
        adDC3e2L(JlrlGoKF, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            java.lang.Object[] SyNS6RMn2 = SyNS6RMn();
            adDC3e2L(SyNS6RMn2, 0, it);
            objArr2[i8] = SyNS6RMn2;
        }
        adDC3e2L(objArr3, 0, it);
    }

    public final java.lang.Object[] DFo87pBq1E5(int i, java.lang.Object[] objArr) {
        if (SH1y5HwkJhh(objArr)) {
            defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        java.lang.Object[] SyNS6RMn = SyNS6RMn();
        defpackage.t6.wKlPRKlRnfqr(objArr, SyNS6RMn, i, 0, 32 - i);
        return SyNS6RMn;
    }

    public final java.lang.Object[] EXtogiMhuM(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        java.lang.Object obj2;
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        if (i == 0) {
            fyULxpbU8bu.IHQe1A4L2xu = objArr[31];
            java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
            defpackage.t6.wKlPRKlRnfqr(objArr, JlrlGoKF, kNAkVymC + 1, kNAkVymC, 31);
            JlrlGoKF[kNAkVymC] = obj;
            return JlrlGoKF;
        }
        java.lang.Object[] JlrlGoKF2 = JlrlGoKF(objArr);
        int i3 = i - 5;
        java.lang.Object obj3 = JlrlGoKF2[kNAkVymC];
        obj3.getClass();
        JlrlGoKF2[kNAkVymC] = EXtogiMhuM((java.lang.Object[]) obj3, i3, i2, obj, fyULxpbU8bu);
        while (true) {
            kNAkVymC++;
            if (kNAkVymC >= 32 || (obj2 = JlrlGoKF2[kNAkVymC]) == null) {
                break;
            }
            JlrlGoKF2[kNAkVymC] = EXtogiMhuM((java.lang.Object[]) obj2, i3, 0, fyULxpbU8bu.IHQe1A4L2xu, fyULxpbU8bu);
        }
        return JlrlGoKF2;
    }

    public final java.lang.Object[] EgCjBq0SZwJ(java.lang.Object[] objArr, int i, int i2, java.util.Iterator it) {
        if (!it.hasNext()) {
            defpackage.nw0.IHQe1A4L2xu("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            defpackage.nw0.IHQe1A4L2xu("negative shift");
        }
        if (i2 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
        int kNAkVymC = defpackage.c80.kNAkVymC(i, i2);
        int i3 = i2 - 5;
        JlrlGoKF[kNAkVymC] = EgCjBq0SZwJ((java.lang.Object[]) JlrlGoKF[kNAkVymC], i, i3, it);
        while (true) {
            kNAkVymC++;
            if (kNAkVymC >= 32 || !it.hasNext()) {
                break;
            }
            JlrlGoKF[kNAkVymC] = EgCjBq0SZwJ((java.lang.Object[]) JlrlGoKF[kNAkVymC], 0, i3, it);
        }
        return JlrlGoKF;
    }

    public final java.lang.Object[] G3OKOH3wZRC(java.lang.Object[] objArr, int i, int i2, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        java.lang.Object[] G3OKOH3wZRC;
        int kNAkVymC = defpackage.c80.kNAkVymC(i2 - 1, i);
        if (i == 5) {
            fyULxpbU8bu.IHQe1A4L2xu = objArr[kNAkVymC];
            G3OKOH3wZRC = null;
        } else {
            java.lang.Object obj = objArr[kNAkVymC];
            obj.getClass();
            G3OKOH3wZRC = G3OKOH3wZRC((java.lang.Object[]) obj, i - 5, i2, fyULxpbU8bu);
        }
        if (G3OKOH3wZRC == null && kNAkVymC == 0) {
            return null;
        }
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
        JlrlGoKF[kNAkVymC] = G3OKOH3wZRC;
        return JlrlGoKF;
    }

    @Override // defpackage.UsuH8pd5P
    public final int IHQe1A4L2xu() {
        return this.JlrlGoKF;
    }

    public final java.lang.Object[] JlrlGoKF(java.lang.Object[] objArr) {
        if (objArr == null) {
            return SyNS6RMn();
        }
        if (SH1y5HwkJhh(objArr)) {
            return objArr;
        }
        java.lang.Object[] SyNS6RMn = SyNS6RMn();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        defpackage.t6.RmCzwkUxICV(objArr, SyNS6RMn, 0, length, 6);
        return SyNS6RMn;
    }

    public final int NHJTzaLwkd(defpackage.g00 g00Var, int i, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        int abhbClRa = abhbClRa(g00Var, this.ez2rX8ReCYw, i, fyULxpbU8bu);
        java.lang.Object obj = fyULxpbU8bu.IHQe1A4L2xu;
        if (abhbClRa == i) {
            return i;
        }
        obj.getClass();
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        java.util.Arrays.fill(objArr, abhbClRa, i, (java.lang.Object) null);
        this.ez2rX8ReCYw = objArr;
        this.JlrlGoKF -= i - abhbClRa;
        return abhbClRa;
    }

    public final int PAEGRtP0bX(defpackage.g00 g00Var, java.lang.Object[] objArr, int i, int i2, defpackage.FyULxpbU8bu fyULxpbU8bu, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (SH1y5HwkJhh(objArr)) {
            arrayList.add(objArr);
        }
        java.lang.Object obj = fyULxpbU8bu.IHQe1A4L2xu;
        obj.getClass();
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        java.lang.Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj2 = objArr[i3];
            if (!((java.lang.Boolean) g00Var.AARZUJiTa(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (java.lang.Object[]) arrayList.remove(arrayList.size() - 1) : SyNS6RMn();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        fyULxpbU8bu.IHQe1A4L2xu = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (NHJTzaLwkd(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean QQUzIjv3iOC5(defpackage.g00 g00Var) {
        int i;
        defpackage.g00 g00Var2 = g00Var;
        int frpfPPIgqM9O = frpfPPIgqM9O();
        java.lang.Object[] objArr = null;
        defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(null);
        boolean z = false;
        if (this.SH1y5HwkJhh != null) {
            defpackage.NHJTzaLwkd ez2rX8ReCYw = ez2rX8ReCYw(0);
            int i2 = 32;
            while (i2 == 32 && ez2rX8ReCYw.hasNext()) {
                i2 = abhbClRa(g00Var2, (java.lang.Object[]) ez2rX8ReCYw.next(), 32, fyULxpbU8bu);
            }
            if (i2 == 32) {
                int NHJTzaLwkd = NHJTzaLwkd(g00Var2, frpfPPIgqM9O, fyULxpbU8bu);
                if (NHJTzaLwkd == 0) {
                    kd6TUFXn(this.SH1y5HwkJhh, this.JlrlGoKF, this.EXtogiMhuM);
                }
            } else {
                int i3 = (ez2rX8ReCYw.adDC3e2L - 1) << 5;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int i4 = i2;
                while (ez2rX8ReCYw.hasNext()) {
                    i4 = PAEGRtP0bX(g00Var2, (java.lang.Object[]) ez2rX8ReCYw.next(), 32, i4, fyULxpbU8bu, arrayList2, arrayList);
                    g00Var2 = g00Var;
                }
                int PAEGRtP0bX = PAEGRtP0bX(g00Var, this.ez2rX8ReCYw, frpfPPIgqM9O, i4, fyULxpbU8bu, arrayList2, arrayList);
                java.lang.Object obj = fyULxpbU8bu.IHQe1A4L2xu;
                obj.getClass();
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                java.util.Arrays.fill(objArr2, PAEGRtP0bX, 32, (java.lang.Object) null);
                boolean isEmpty = arrayList.isEmpty();
                java.lang.Object[] objArr3 = this.SH1y5HwkJhh;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = EgCjBq0SZwJ(objArr3, i3, this.EXtogiMhuM, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    defpackage.nw0.IHQe1A4L2xu("invalid size");
                }
                if (size == 0) {
                    this.EXtogiMhuM = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.EXtogiMhuM;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.EXtogiMhuM = i - 5;
                        java.lang.Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = QoRHpC4k(objArr3, i5, i);
                }
                this.SH1y5HwkJhh = objArr;
                this.ez2rX8ReCYw = objArr2;
                this.JlrlGoKF = size + PAEGRtP0bX;
            }
            z = true;
        }
        if (z) {
            ((java.util.AbstractList) this).modCount++;
        }
        return z;
    }

    public final java.lang.Object[] QoRHpC4k(java.lang.Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            defpackage.nw0.IHQe1A4L2xu("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int kNAkVymC = defpackage.c80.kNAkVymC(i, i2);
        java.lang.Object obj = objArr[kNAkVymC];
        obj.getClass();
        java.lang.Object QoRHpC4k = QoRHpC4k((java.lang.Object[]) obj, i, i2 - 5);
        if (kNAkVymC < 31) {
            int i3 = kNAkVymC + 1;
            if (objArr[i3] != null) {
                if (SH1y5HwkJhh(objArr)) {
                    java.util.Arrays.fill(objArr, i3, 32, (java.lang.Object) null);
                }
                java.lang.Object[] SyNS6RMn = SyNS6RMn();
                defpackage.t6.wKlPRKlRnfqr(objArr, SyNS6RMn, 0, 0, i3);
                objArr = SyNS6RMn;
            }
        }
        if (QoRHpC4k == objArr[kNAkVymC]) {
            return objArr;
        }
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
        JlrlGoKF[kNAkVymC] = QoRHpC4k;
        return JlrlGoKF;
    }

    public final boolean SH1y5HwkJhh(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.riuEU0zW4;
    }

    public final java.lang.Object[] SyNS6RMn() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.riuEU0zW4;
        return objArr;
    }

    public final java.lang.Object UsuH8pd5P(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.JlrlGoKF - i;
        java.lang.Object[] objArr2 = this.ez2rX8ReCYw;
        if (i4 == 1) {
            java.lang.Object obj = objArr2[0];
            kd6TUFXn(objArr, i, i2);
            return obj;
        }
        java.lang.Object obj2 = objArr2[i3];
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr2);
        defpackage.t6.wKlPRKlRnfqr(objArr2, JlrlGoKF, i3, i3 + 1, i4);
        JlrlGoKF[i4 - 1] = null;
        this.SH1y5HwkJhh = objArr;
        this.ez2rX8ReCYw = JlrlGoKF;
        this.JlrlGoKF = (i + i4) - 1;
        this.EXtogiMhuM = i2;
        return obj2;
    }

    public final java.lang.Object[] V7bD7b8KA(int i, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int kNAkVymC = defpackage.c80.kNAkVymC(IHQe1A4L2xu() - 1, i);
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
        if (i == 5) {
            JlrlGoKF[kNAkVymC] = objArr2;
            return JlrlGoKF;
        }
        JlrlGoKF[kNAkVymC] = V7bD7b8KA(i - 5, (java.lang.Object[]) JlrlGoKF[kNAkVymC], objArr2);
        return JlrlGoKF;
    }

    public final int abhbClRa(defpackage.g00 g00Var, java.lang.Object[] objArr, int i, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        java.lang.Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (((java.lang.Boolean) g00Var.AARZUJiTa(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = JlrlGoKF(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        fyULxpbU8bu.IHQe1A4L2xu = objArr2;
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        defpackage.e90.ez2rX8ReCYw(i, IHQe1A4L2xu());
        if (i == IHQe1A4L2xu()) {
            add(obj);
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        int nBH8hAHy = nBH8hAHy();
        if (i >= nBH8hAHy) {
            riuEU0zW4(this.SH1y5HwkJhh, i - nBH8hAHy, obj);
            return;
        }
        defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(null);
        java.lang.Object[] objArr = this.SH1y5HwkJhh;
        objArr.getClass();
        riuEU0zW4(EXtogiMhuM(objArr, this.EXtogiMhuM, i, obj, fyULxpbU8bu), 0, fyULxpbU8bu.IHQe1A4L2xu);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        java.util.Collection collection2;
        java.lang.Object[] SyNS6RMn;
        defpackage.e90.ez2rX8ReCYw(i, this.JlrlGoKF);
        if (i == this.JlrlGoKF) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.JlrlGoKF - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            java.lang.Object[] objArr = this.ez2rX8ReCYw;
            java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
            defpackage.t6.wKlPRKlRnfqr(objArr, JlrlGoKF, size2 + 1, i3, frpfPPIgqM9O());
            adDC3e2L(JlrlGoKF, i3, collection.iterator());
            this.ez2rX8ReCYw = JlrlGoKF;
            this.JlrlGoKF = collection.size() + this.JlrlGoKF;
            return true;
        }
        java.lang.Object[][] objArr2 = new java.lang.Object[size][];
        int frpfPPIgqM9O = frpfPPIgqM9O();
        int size3 = collection.size() + this.JlrlGoKF;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= nBH8hAHy()) {
            SyNS6RMn = SyNS6RMn();
            collection2 = collection;
            D2vUnMij(collection2, i, this.ez2rX8ReCYw, frpfPPIgqM9O, objArr2, size, SyNS6RMn);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            java.lang.Object[] objArr3 = this.ez2rX8ReCYw;
            if (size3 > frpfPPIgqM9O) {
                int i4 = size3 - frpfPPIgqM9O;
                java.lang.Object[] DFo87pBq1E5 = DFo87pBq1E5(i4, objArr3);
                AARZUJiTa(collection2, i, i4, objArr2, size, DFo87pBq1E5);
                objArr2 = objArr2;
                SyNS6RMn = DFo87pBq1E5;
            } else {
                SyNS6RMn = SyNS6RMn();
                int i5 = frpfPPIgqM9O - size3;
                defpackage.t6.wKlPRKlRnfqr(objArr3, SyNS6RMn, 0, i5, frpfPPIgqM9O);
                int i6 = 32 - i5;
                java.lang.Object[] DFo87pBq1E52 = DFo87pBq1E5(i6, this.ez2rX8ReCYw);
                int i7 = size - 1;
                objArr2[i7] = DFo87pBq1E52;
                AARZUJiTa(collection2, i, i6, objArr2, i7, DFo87pBq1E52);
                collection2 = collection2;
            }
        }
        this.SH1y5HwkJhh = fnWB2E7cs(this.SH1y5HwkJhh, i2, objArr2);
        this.ez2rX8ReCYw = SyNS6RMn;
        this.JlrlGoKF = collection2.size() + this.JlrlGoKF;
        return true;
    }

    public final java.lang.Object[] cnag84Bm(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.riuEU0zW4;
        return objArr;
    }

    public final defpackage.NHJTzaLwkd ez2rX8ReCYw(int i) {
        java.lang.Object[] objArr = this.SH1y5HwkJhh;
        if (objArr == null) {
            defpackage.db.AARZUJiTa("Invalid root");
            return null;
        }
        int nBH8hAHy = nBH8hAHy() >> 5;
        defpackage.e90.ez2rX8ReCYw(i, nBH8hAHy);
        int i2 = this.EXtogiMhuM;
        return i2 == 0 ? new defpackage.s9(i, objArr) : new defpackage.xi1(objArr, i, nBH8hAHy, i2 / 5);
    }

    public final java.lang.Object[] fnWB2E7cs(java.lang.Object[] objArr, int i, java.lang.Object[][] objArr2) {
        defpackage.kNAkVymC knakvymc = new defpackage.kNAkVymC(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.EXtogiMhuM;
        java.lang.Object[] EgCjBq0SZwJ = i2 < (1 << i3) ? EgCjBq0SZwJ(objArr, i, i3, knakvymc) : JlrlGoKF(objArr);
        while (knakvymc.hasNext()) {
            this.EXtogiMhuM += 5;
            EgCjBq0SZwJ = cnag84Bm(EgCjBq0SZwJ);
            int i4 = this.EXtogiMhuM;
            EgCjBq0SZwJ(EgCjBq0SZwJ, 1 << i4, i4, knakvymc);
        }
        return EgCjBq0SZwJ;
    }

    public final int frpfPPIgqM9O() {
        int i = this.JlrlGoKF;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr;
        defpackage.e90.riuEU0zW4(i, IHQe1A4L2xu());
        if (nBH8hAHy() <= i) {
            objArr = this.ez2rX8ReCYw;
        } else {
            java.lang.Object[] objArr2 = this.SH1y5HwkJhh;
            objArr2.getClass();
            for (int i2 = this.EXtogiMhuM; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[defpackage.c80.kNAkVymC(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    public final void kNAkVymC(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.JlrlGoKF;
        int i2 = i >> 5;
        int i3 = this.EXtogiMhuM;
        if (i2 > (1 << i3)) {
            this.SH1y5HwkJhh = V7bD7b8KA(this.EXtogiMhuM + 5, cnag84Bm(objArr), objArr2);
            this.ez2rX8ReCYw = objArr3;
            this.EXtogiMhuM += 5;
            this.JlrlGoKF++;
            return;
        }
        if (objArr == null) {
            this.SH1y5HwkJhh = objArr2;
            this.ez2rX8ReCYw = objArr3;
            this.JlrlGoKF = i + 1;
        } else {
            this.SH1y5HwkJhh = V7bD7b8KA(i3, objArr, objArr2);
            this.ez2rX8ReCYw = objArr3;
            this.JlrlGoKF++;
        }
    }

    public final void kd6TUFXn(java.lang.Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.SH1y5HwkJhh = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.ez2rX8ReCYw = objArr;
            this.JlrlGoKF = i;
            this.EXtogiMhuM = i2;
            return;
        }
        defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(null);
        objArr.getClass();
        java.lang.Object[] G3OKOH3wZRC = G3OKOH3wZRC(objArr, i2, i, fyULxpbU8bu);
        G3OKOH3wZRC.getClass();
        java.lang.Object obj = fyULxpbU8bu.IHQe1A4L2xu;
        obj.getClass();
        this.ez2rX8ReCYw = (java.lang.Object[]) obj;
        this.JlrlGoKF = i;
        if (G3OKOH3wZRC[1] == null) {
            this.SH1y5HwkJhh = (java.lang.Object[]) G3OKOH3wZRC[0];
            this.EXtogiMhuM = i2 - 5;
        } else {
            this.SH1y5HwkJhh = G3OKOH3wZRC;
            this.EXtogiMhuM = i2;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.e90.ez2rX8ReCYw(i, this.JlrlGoKF);
        return new defpackage.uu0(this, i);
    }

    public final int nBH8hAHy() {
        int i = this.JlrlGoKF;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    @Override // defpackage.UsuH8pd5P
    public final java.lang.Object oh6vYeIP(int i) {
        defpackage.e90.riuEU0zW4(i, IHQe1A4L2xu());
        ((java.util.AbstractList) this).modCount++;
        int nBH8hAHy = nBH8hAHy();
        if (i >= nBH8hAHy) {
            return UsuH8pd5P(this.SH1y5HwkJhh, nBH8hAHy, this.EXtogiMhuM, i - nBH8hAHy);
        }
        defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(this.ez2rX8ReCYw[0]);
        java.lang.Object[] objArr = this.SH1y5HwkJhh;
        objArr.getClass();
        UsuH8pd5P(C0U8sNJm(objArr, this.EXtogiMhuM, i, fyULxpbU8bu), nBH8hAHy, this.EXtogiMhuM, 0);
        return fyULxpbU8bu.IHQe1A4L2xu;
    }

    public final defpackage.D2vUnMij r1MBDhnF() {
        defpackage.D2vUnMij ja1Var;
        java.lang.Object[] objArr = this.SH1y5HwkJhh;
        if (objArr == this.xiZrDbcSW0 && this.ez2rX8ReCYw == this.AARZUJiTa) {
            ja1Var = this.adDC3e2L;
        } else {
            this.riuEU0zW4 = new defpackage.ky(10);
            this.xiZrDbcSW0 = objArr;
            java.lang.Object[] objArr2 = this.ez2rX8ReCYw;
            this.AARZUJiTa = objArr2;
            ja1Var = objArr == null ? objArr2.length == 0 ? defpackage.ja1.xiZrDbcSW0 : new defpackage.ja1(java.util.Arrays.copyOf(objArr2, this.JlrlGoKF)) : new defpackage.ru0(objArr, objArr2, this.JlrlGoKF, this.EXtogiMhuM);
        }
        this.adDC3e2L = ja1Var;
        return ja1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        return QQUzIjv3iOC5(new defpackage.v5iciZok(1, collection));
    }

    public final void riuEU0zW4(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int frpfPPIgqM9O = frpfPPIgqM9O();
        java.lang.Object[] JlrlGoKF = JlrlGoKF(this.ez2rX8ReCYw);
        java.lang.Object[] objArr2 = this.ez2rX8ReCYw;
        if (frpfPPIgqM9O >= 32) {
            java.lang.Object obj2 = objArr2[31];
            defpackage.t6.wKlPRKlRnfqr(objArr2, JlrlGoKF, i + 1, i, 31);
            JlrlGoKF[i] = obj;
            kNAkVymC(objArr, JlrlGoKF, cnag84Bm(obj2));
            return;
        }
        defpackage.t6.wKlPRKlRnfqr(objArr2, JlrlGoKF, i + 1, i, frpfPPIgqM9O);
        JlrlGoKF[i] = obj;
        this.SH1y5HwkJhh = objArr;
        this.ez2rX8ReCYw = JlrlGoKF;
        this.JlrlGoKF++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.e90.riuEU0zW4(i, IHQe1A4L2xu());
        if (nBH8hAHy() > i) {
            defpackage.FyULxpbU8bu fyULxpbU8bu = new defpackage.FyULxpbU8bu(null);
            java.lang.Object[] objArr = this.SH1y5HwkJhh;
            objArr.getClass();
            this.SH1y5HwkJhh = v5iciZok(objArr, this.EXtogiMhuM, i, obj, fyULxpbU8bu);
            return fyULxpbU8bu.IHQe1A4L2xu;
        }
        java.lang.Object[] JlrlGoKF = JlrlGoKF(this.ez2rX8ReCYw);
        if (JlrlGoKF != this.ez2rX8ReCYw) {
            ((java.util.AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        java.lang.Object obj2 = JlrlGoKF[i2];
        JlrlGoKF[i2] = obj;
        this.ez2rX8ReCYw = JlrlGoKF;
        return obj2;
    }

    public final java.lang.Object[] v5iciZok(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, defpackage.FyULxpbU8bu fyULxpbU8bu) {
        int kNAkVymC = defpackage.c80.kNAkVymC(i2, i);
        java.lang.Object[] JlrlGoKF = JlrlGoKF(objArr);
        if (i != 0) {
            java.lang.Object obj2 = JlrlGoKF[kNAkVymC];
            obj2.getClass();
            JlrlGoKF[kNAkVymC] = v5iciZok((java.lang.Object[]) obj2, i - 5, i2, obj, fyULxpbU8bu);
            return JlrlGoKF;
        }
        if (JlrlGoKF != objArr) {
            ((java.util.AbstractList) this).modCount++;
        }
        fyULxpbU8bu.IHQe1A4L2xu = JlrlGoKF[kNAkVymC];
        JlrlGoKF[kNAkVymC] = obj;
        return JlrlGoKF;
    }

    public final int xiZrDbcSW0() {
        return ((java.util.AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        int frpfPPIgqM9O = frpfPPIgqM9O();
        if (frpfPPIgqM9O < 32) {
            java.lang.Object[] JlrlGoKF = JlrlGoKF(this.ez2rX8ReCYw);
            JlrlGoKF[frpfPPIgqM9O] = obj;
            this.ez2rX8ReCYw = JlrlGoKF;
            this.JlrlGoKF = IHQe1A4L2xu() + 1;
        } else {
            kNAkVymC(this.SH1y5HwkJhh, this.ez2rX8ReCYw, cnag84Bm(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((java.util.AbstractList) this).modCount++;
        int frpfPPIgqM9O = frpfPPIgqM9O();
        java.util.Iterator it = collection.iterator();
        if (32 - frpfPPIgqM9O >= collection.size()) {
            java.lang.Object[] JlrlGoKF = JlrlGoKF(this.ez2rX8ReCYw);
            adDC3e2L(JlrlGoKF, frpfPPIgqM9O, it);
            this.ez2rX8ReCYw = JlrlGoKF;
            this.JlrlGoKF = collection.size() + this.JlrlGoKF;
            return true;
        }
        int size = ((collection.size() + frpfPPIgqM9O) - 1) / 32;
        java.lang.Object[][] objArr = new java.lang.Object[size][];
        java.lang.Object[] JlrlGoKF2 = JlrlGoKF(this.ez2rX8ReCYw);
        adDC3e2L(JlrlGoKF2, frpfPPIgqM9O, it);
        objArr[0] = JlrlGoKF2;
        for (int i = 1; i < size; i++) {
            java.lang.Object[] SyNS6RMn = SyNS6RMn();
            adDC3e2L(SyNS6RMn, 0, it);
            objArr[i] = SyNS6RMn;
        }
        this.SH1y5HwkJhh = fnWB2E7cs(this.SH1y5HwkJhh, nBH8hAHy(), objArr);
        java.lang.Object[] SyNS6RMn2 = SyNS6RMn();
        adDC3e2L(SyNS6RMn2, 0, it);
        this.ez2rX8ReCYw = SyNS6RMn2;
        this.JlrlGoKF = collection.size() + this.JlrlGoKF;
        return true;
    }
}
