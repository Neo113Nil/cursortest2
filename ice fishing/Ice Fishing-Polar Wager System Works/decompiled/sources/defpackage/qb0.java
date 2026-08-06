package defpackage;

/* loaded from: classes.dex */
public final class qb0 {
    public final java.util.ArrayList AARZUJiTa;
    public final java.util.ArrayList EXtogiMhuM;
    public final java.util.ArrayList F7NU4MC0GW;
    public final defpackage.nl0 IHQe1A4L2xu;
    public final java.util.ArrayList adDC3e2L;
    public defpackage.p2 oh6vYeIP;
    public final defpackage.ol0 r1MBDhnF;
    public final defpackage.mj0 riuEU0zW4;
    public final java.util.ArrayList xiZrDbcSW0;

    public qb0() {
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        this.IHQe1A4L2xu = new defpackage.nl0();
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        this.r1MBDhnF = new defpackage.ol0();
        this.F7NU4MC0GW = new java.util.ArrayList();
        this.adDC3e2L = new java.util.ArrayList();
        this.xiZrDbcSW0 = new java.util.ArrayList();
        this.AARZUJiTa = new java.util.ArrayList();
        this.EXtogiMhuM = new java.util.ArrayList();
        this.riuEU0zW4 = new defpackage.nb0(this);
    }

    public static int adDC3e2L(int[] iArr, defpackage.tc0 tc0Var) {
        tc0Var.getClass();
        int i = iArr[0] + tc0Var.JlrlGoKF;
        iArr[0] = i;
        return java.lang.Math.max(0, i);
    }

    public final void F7NU4MC0GW(defpackage.tc0 tc0Var, boolean z) {
        java.lang.Object AARZUJiTa = this.IHQe1A4L2xu.AARZUJiTa(tc0Var.AARZUJiTa);
        AARZUJiTa.getClass();
        defpackage.fx0.kd6TUFXn(AARZUJiTa);
        throw null;
    }

    public final long IHQe1A4L2xu() {
        java.util.ArrayList arrayList = this.EXtogiMhuM;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        defpackage.fx0.kd6TUFXn(arrayList.get(0));
        throw null;
    }

    public final void oh6vYeIP(int i, int i2, java.util.ArrayList arrayList, defpackage.p2 p2Var, defpackage.qc0 qc0Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        defpackage.ol0 ol0Var;
        defpackage.p2 p2Var2 = this.oh6vYeIP;
        this.oh6vYeIP = p2Var;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            defpackage.tc0 tc0Var = (defpackage.tc0) arrayList.get(i11);
            int size2 = tc0Var.oh6vYeIP.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((defpackage.bv0) tc0Var.oh6vYeIP.get(i12)).ez2rX8ReCYw();
            }
        }
        defpackage.nl0 nl0Var = this.IHQe1A4L2xu;
        if (nl0Var.riuEU0zW4()) {
            r1MBDhnF();
            return;
        }
        boolean z3 = z || !z2;
        java.lang.Object[] objArr = nl0Var.oh6vYeIP;
        long[] jArr = nl0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        defpackage.ol0 ol0Var2 = this.r1MBDhnF;
        int i13 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j = jArr[i14];
                defpackage.ol0 ol0Var3 = ol0Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    long j2 = j;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            ol0Var = ol0Var3;
                            ol0Var.IHQe1A4L2xu(objArr[(i14 << 3) + i16]);
                        } else {
                            ol0Var = ol0Var3;
                        }
                        j2 >>= 8;
                        i16++;
                        ol0Var3 = ol0Var;
                    }
                    ol0Var2 = ol0Var3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    ol0Var2 = ol0Var3;
                }
                if (i14 == length) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            defpackage.tc0 tc0Var2 = (defpackage.tc0) arrayList.get(i17);
            java.lang.Object obj = tc0Var2.AARZUJiTa;
            java.util.List list = tc0Var2.oh6vYeIP;
            ol0Var2.JlrlGoKF(obj);
            int size4 = list.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((defpackage.bv0) list.get(i18)).ez2rX8ReCYw();
            }
            defpackage.fx0.kd6TUFXn(nl0Var.ez2rX8ReCYw(tc0Var2.AARZUJiTa));
        }
        int[] iArr = new int[1];
        java.util.ArrayList arrayList2 = this.adDC3e2L;
        java.util.ArrayList arrayList3 = this.F7NU4MC0GW;
        if (z4 && p2Var2 != null) {
            if (arrayList3.isEmpty()) {
                i10 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    defpackage.xd.wKlPRKlRnfqr(arrayList3, new defpackage.pb0(p2Var2, 2));
                }
                if (arrayList3.size() > 0) {
                    defpackage.tc0 tc0Var3 = (defpackage.tc0) arrayList3.get(0);
                    adDC3e2L(iArr, tc0Var3);
                    java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(tc0Var3.AARZUJiTa);
                    AARZUJiTa.getClass();
                    defpackage.fx0.kd6TUFXn(AARZUJiTa);
                    tc0Var3.IHQe1A4L2xu(0);
                    throw null;
                }
                i10 = 0;
                java.util.Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    defpackage.xd.wKlPRKlRnfqr(arrayList2, new defpackage.pb0(p2Var2, i10));
                }
                if (arrayList2.size() > 0) {
                    defpackage.tc0 tc0Var4 = (defpackage.tc0) arrayList2.get(i10);
                    adDC3e2L(iArr, tc0Var4);
                    java.lang.Object AARZUJiTa2 = nl0Var.AARZUJiTa(tc0Var4.AARZUJiTa);
                    AARZUJiTa2.getClass();
                    defpackage.fx0.kd6TUFXn(AARZUJiTa2);
                    tc0Var4.IHQe1A4L2xu(i10);
                    throw null;
                }
                java.util.Arrays.fill(iArr, i10, 1, i10);
            }
        }
        java.lang.Object[] objArr2 = ol0Var2.oh6vYeIP;
        long[] jArr2 = ol0Var2.IHQe1A4L2xu;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j3 = jArr2[i19];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j3 & 255) < 128) {
                            i9 = i13;
                            defpackage.fx0.kd6TUFXn(nl0Var.AARZUJiTa(objArr2[(i19 << 3) + i21]));
                        } else {
                            i9 = i13;
                        }
                        j3 >>= i9;
                        i21++;
                        i13 = i9;
                    }
                    i8 = i13;
                    if (i20 != i8) {
                        break;
                    }
                } else {
                    i8 = i13;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                i13 = i8;
            }
        }
        java.util.ArrayList arrayList4 = this.xiZrDbcSW0;
        if (arrayList4.isEmpty()) {
            i5 = i;
            i6 = i2;
            i7 = 1;
        } else {
            if (arrayList4.size() > 1) {
                defpackage.xd.wKlPRKlRnfqr(arrayList4, new defpackage.pb0(p2Var, 3));
            }
            int size5 = arrayList4.size();
            for (int i22 = 0; i22 < size5; i22++) {
                defpackage.tc0 tc0Var5 = (defpackage.tc0) arrayList4.get(i22);
                java.lang.Object AARZUJiTa3 = nl0Var.AARZUJiTa(tc0Var5.AARZUJiTa);
                AARZUJiTa3.getClass();
                defpackage.fx0.kd6TUFXn(AARZUJiTa3);
                tc0Var5.r1MBDhnF((z ? (int) (4294967295L & ((defpackage.tc0) defpackage.td.JcqDrWrgMf(arrayList)).IHQe1A4L2xu(0)) : 0) - adDC3e2L(iArr, tc0Var5), i, i2);
                if (z4) {
                    F7NU4MC0GW(tc0Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            java.util.Arrays.fill(iArr, 0, 1, 0);
        }
        java.util.ArrayList arrayList5 = this.AARZUJiTa;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                defpackage.xd.wKlPRKlRnfqr(arrayList5, new defpackage.pb0(p2Var, i7));
            }
            int size6 = arrayList5.size();
            for (int i23 = 0; i23 < size6; i23++) {
                defpackage.tc0 tc0Var6 = (defpackage.tc0) arrayList5.get(i23);
                java.lang.Object AARZUJiTa4 = nl0Var.AARZUJiTa(tc0Var6.AARZUJiTa);
                AARZUJiTa4.getClass();
                defpackage.fx0.kd6TUFXn(AARZUJiTa4);
                tc0Var6.r1MBDhnF((0 - tc0Var6.JlrlGoKF) + adDC3e2L(iArr, tc0Var6), i5, i6);
                if (z4) {
                    F7NU4MC0GW(tc0Var6, true);
                    throw null;
                }
            }
        }
        java.util.Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        ol0Var2.oh6vYeIP();
    }

    public final void r1MBDhnF() {
        defpackage.nl0 nl0Var = this.IHQe1A4L2xu;
        if (nl0Var.SH1y5HwkJhh()) {
            java.lang.Object[] objArr = nl0Var.r1MBDhnF;
            long[] jArr = nl0Var.IHQe1A4L2xu;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                defpackage.fx0.kd6TUFXn(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            nl0Var.IHQe1A4L2xu();
        }
    }
}
