package defpackage;

/* loaded from: classes.dex */
public final class kk0 implements defpackage.ii0 {
    public final defpackage.px IHQe1A4L2xu;

    public kk0(defpackage.px pxVar) {
        this.IHQe1A4L2xu = pxVar;
    }

    @Override // defpackage.ii0
    public final int AARZUJiTa(defpackage.t70 t70Var, java.util.List list, int i) {
        java.util.ArrayList kNAkVymC = defpackage.x80.kNAkVymC(t70Var);
        defpackage.px pxVar = this.IHQe1A4L2xu;
        defpackage.nx nxVar = pxVar.xiZrDbcSW0;
        java.util.List list2 = (java.util.List) defpackage.td.sJNB7mCer5(1, kNAkVymC);
        defpackage.di0 di0Var = list2 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list2) : null;
        java.util.List list3 = (java.util.List) defpackage.td.sJNB7mCer5(2, kNAkVymC);
        nxVar.IHQe1A4L2xu(di0Var, list3 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list3) : null, defpackage.li.oh6vYeIP(i, 0, 13));
        java.util.List list4 = (java.util.List) defpackage.td.gG5uWf3dqScO(kNAkVymC);
        if (list4 == null) {
            list4 = defpackage.nt.adDC3e2L;
        }
        return defpackage.px.IHQe1A4L2xu(list4, i, t70Var.yIx6ChFVk(pxVar.r1MBDhnF), t70Var.yIx6ChFVk(pxVar.adDC3e2L), pxVar.xiZrDbcSW0);
    }

    @Override // defpackage.ii0
    public final int IHQe1A4L2xu(defpackage.t70 t70Var, java.util.List list, int i) {
        java.util.ArrayList kNAkVymC = defpackage.x80.kNAkVymC(t70Var);
        defpackage.px pxVar = this.IHQe1A4L2xu;
        defpackage.nx nxVar = pxVar.xiZrDbcSW0;
        java.util.List list2 = (java.util.List) defpackage.td.sJNB7mCer5(1, kNAkVymC);
        defpackage.di0 di0Var = list2 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list2) : null;
        java.util.List list3 = (java.util.List) defpackage.td.sJNB7mCer5(2, kNAkVymC);
        nxVar.IHQe1A4L2xu(di0Var, list3 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list3) : null, defpackage.li.oh6vYeIP(i, 0, 13));
        java.util.List list4 = (java.util.List) defpackage.td.gG5uWf3dqScO(kNAkVymC);
        if (list4 == null) {
            list4 = defpackage.nt.adDC3e2L;
        }
        return defpackage.px.IHQe1A4L2xu(list4, i, t70Var.yIx6ChFVk(pxVar.r1MBDhnF), t70Var.yIx6ChFVk(pxVar.adDC3e2L), pxVar.xiZrDbcSW0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.kk0) && defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, ((defpackage.kk0) obj).IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    @Override // defpackage.ii0
    public final int r1MBDhnF(defpackage.t70 t70Var, java.util.List list, int i) {
        java.util.ArrayList kNAkVymC = defpackage.x80.kNAkVymC(t70Var);
        defpackage.px pxVar = this.IHQe1A4L2xu;
        defpackage.nx nxVar = pxVar.xiZrDbcSW0;
        java.util.List list2 = (java.util.List) defpackage.td.sJNB7mCer5(1, kNAkVymC);
        defpackage.di0 di0Var = list2 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list2) : null;
        java.util.List list3 = (java.util.List) defpackage.td.sJNB7mCer5(2, kNAkVymC);
        nxVar.IHQe1A4L2xu(di0Var, list3 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list3) : null, defpackage.li.oh6vYeIP(0, i, 7));
        java.util.List list4 = (java.util.List) defpackage.td.gG5uWf3dqScO(kNAkVymC);
        if (list4 == null) {
            list4 = defpackage.nt.adDC3e2L;
        }
        int yIx6ChFVk = t70Var.yIx6ChFVk(pxVar.r1MBDhnF);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int AsxAYCCkb3Hi = ((defpackage.di0) list4.get(i2)).AsxAYCCkb3Hi(i) + yIx6ChFVk;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = java.lang.Math.max(i3, (i5 + AsxAYCCkb3Hi) - yIx6ChFVk);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += AsxAYCCkb3Hi;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0218 A[SYNTHETIC] */
    @Override // defpackage.ii0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int riuEU0zW4(defpackage.t70 t70Var, java.util.List list, int i) {
        int[] iArr;
        long j;
        java.util.List list2;
        long IHQe1A4L2xu;
        defpackage.di0 di0Var;
        int i2;
        defpackage.u60 u60Var;
        java.util.ArrayList kNAkVymC = defpackage.x80.kNAkVymC(t70Var);
        defpackage.px pxVar = this.IHQe1A4L2xu;
        defpackage.nx nxVar = pxVar.xiZrDbcSW0;
        int i3 = 1;
        java.util.List list3 = (java.util.List) defpackage.td.sJNB7mCer5(1, kNAkVymC);
        defpackage.di0 di0Var2 = list3 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list3) : null;
        java.util.List list4 = (java.util.List) defpackage.td.sJNB7mCer5(2, kNAkVymC);
        nxVar.IHQe1A4L2xu(di0Var2, list4 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list4) : null, defpackage.li.oh6vYeIP(0, i, 7));
        java.util.List list5 = (java.util.List) defpackage.td.gG5uWf3dqScO(kNAkVymC);
        if (list5 == null) {
            list5 = defpackage.nt.adDC3e2L;
        }
        int yIx6ChFVk = t70Var.yIx6ChFVk(pxVar.r1MBDhnF);
        int yIx6ChFVk2 = t70Var.yIx6ChFVk(pxVar.adDC3e2L);
        defpackage.nx nxVar2 = pxVar.xiZrDbcSW0;
        long IHQe1A4L2xu2 = defpackage.u60.IHQe1A4L2xu(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i4 = 0; i4 < size3; i4++) {
            defpackage.di0 di0Var3 = (defpackage.di0) list5.get(i4);
            int lpprD5VAS = di0Var3.lpprD5VAS(i);
            iArr2[i4] = lpprD5VAS;
            iArr3[i4] = di0Var3.RmCzwkUxICV(lpprD5VAS);
        }
        int i5 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE < list5.size()) {
            nxVar2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            nxVar2.getClass();
        }
        int min = java.lang.Math.min(Integer.MAX_VALUE, list5.size());
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += iArr2[i7];
        }
        int size4 = ((list5.size() - 1) * yIx6ChFVk) + i6;
        if (size2 == 0) {
            defpackage.db.DFo87pBq1E5();
            return 0;
        }
        int i8 = iArr3[0];
        int i9 = size2 - 1;
        int i10 = 0;
        if (1 <= i9) {
            int i11 = 1;
            while (true) {
                int i12 = iArr3[i11];
                if (i8 < i12) {
                    i8 = i12;
                }
                if (i11 == i9) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            defpackage.db.DFo87pBq1E5();
            return 0;
        }
        int i13 = iArr2[0];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size4;
        while (i13 <= i17 && i8 != i) {
            int i18 = (i13 + i17) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                j = IHQe1A4L2xu2;
                iArr = iArr2;
            } else {
                int i19 = i10;
                defpackage.ix ixVar = new defpackage.ix(nxVar2, defpackage.li.IHQe1A4L2xu(i19, i18, i19, i5), yIx6ChFVk, yIx6ChFVk2);
                defpackage.di0 di0Var4 = (defpackage.di0) defpackage.td.sJNB7mCer5(i19, list5);
                int i20 = di0Var4 != null ? iArr3[i19] : i19;
                int i21 = di0Var4 != null ? iArr2[i19] : 0;
                iArr = iArr2;
                int i22 = 0;
                if (ixVar.oh6vYeIP(list5.size() > i3 ? i3 : 0, 0, defpackage.u60.IHQe1A4L2xu(i18, Integer.MAX_VALUE), di0Var4 == null ? null : new defpackage.u60(defpackage.u60.IHQe1A4L2xu(i21, i20)), 0, 0, 0, false, false).oh6vYeIP) {
                    nxVar2.getClass();
                    list2 = list5;
                    j = IHQe1A4L2xu2;
                } else {
                    int size5 = list5.size();
                    j = IHQe1A4L2xu2;
                    int i23 = i18;
                    int i24 = i21;
                    int i25 = i20;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    while (true) {
                        if (i28 >= size5) {
                            list2 = list5;
                            break;
                        }
                        int i31 = i23 - i24;
                        i30 = i28 + 1;
                        int max = java.lang.Math.max(i27, i25);
                        defpackage.di0 di0Var5 = (defpackage.di0) defpackage.td.sJNB7mCer5(i30, list5);
                        i25 = di0Var5 != null ? iArr3[i30] : 0;
                        i24 = di0Var5 != null ? iArr[i30] + yIx6ChFVk : 0;
                        list2 = list5;
                        boolean z = i28 + 2 < list2.size();
                        int i32 = i30 - i29;
                        int i33 = i26;
                        long IHQe1A4L2xu3 = defpackage.u60.IHQe1A4L2xu(i31, Integer.MAX_VALUE);
                        if (di0Var5 == null) {
                            di0Var = di0Var5;
                            i2 = i31;
                            u60Var = null;
                        } else {
                            di0Var = di0Var5;
                            i2 = i31;
                            u60Var = new defpackage.u60(defpackage.u60.IHQe1A4L2xu(i24, i25));
                        }
                        defpackage.hx oh6vYeIP = ixVar.oh6vYeIP(z, i32, IHQe1A4L2xu3, u60Var, i33, i22, max, false, false);
                        if (oh6vYeIP.IHQe1A4L2xu) {
                            int i34 = max + yIx6ChFVk2 + i22;
                            ixVar.IHQe1A4L2xu(oh6vYeIP, di0Var != null, i33, i34, i2, i32);
                            i24 -= yIx6ChFVk;
                            i26 = i33 + 1;
                            if (oh6vYeIP.oh6vYeIP) {
                                i22 = i34;
                                break;
                            }
                            i23 = i18;
                            i29 = i30;
                            i22 = i34;
                            i27 = 0;
                        } else {
                            i26 = i33;
                            i27 = max;
                            i23 = i2;
                        }
                        i28 = i30;
                        list5 = list2;
                    }
                    IHQe1A4L2xu = defpackage.u60.IHQe1A4L2xu(i22 - yIx6ChFVk2, i30);
                    i8 = (int) (IHQe1A4L2xu >> 32);
                    int i35 = (int) (IHQe1A4L2xu & 4294967295L);
                    if (i8 <= i || i35 < min) {
                        i13 = i18 + 1;
                        if (i13 <= i17) {
                            return i13;
                        }
                    } else {
                        if (i8 >= i) {
                            return i18;
                        }
                        i17 = i18 - 1;
                    }
                    size4 = i18;
                    iArr2 = iArr;
                    IHQe1A4L2xu2 = j;
                    list5 = list2;
                    i3 = 1;
                    i5 = Integer.MAX_VALUE;
                    i10 = 0;
                }
            }
            IHQe1A4L2xu = j;
            i8 = (int) (IHQe1A4L2xu >> 32);
            int i352 = (int) (IHQe1A4L2xu & 4294967295L);
            if (i8 <= i) {
            }
            i13 = i18 + 1;
            if (i13 <= i17) {
            }
        }
        return size4;
    }

    public final java.lang.String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.IHQe1A4L2xu + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
    @Override // defpackage.ii0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        defpackage.di0 di0Var;
        defpackage.di0 di0Var2;
        long j2;
        defpackage.bv0 bv0Var;
        defpackage.u60 u60Var;
        defpackage.hx hxVar;
        int i;
        int i2;
        char c;
        int[] iArr;
        defpackage.di0 di0Var3;
        defpackage.di0 di0Var4;
        int i3;
        defpackage.bv0 bv0Var2;
        defpackage.u60 u60Var2;
        int i4;
        java.lang.Integer num;
        defpackage.u60 u60Var3;
        defpackage.hx oh6vYeIP;
        defpackage.hx hxVar2;
        int i5;
        long IHQe1A4L2xu;
        defpackage.bv0 bv0Var3;
        long IHQe1A4L2xu2;
        defpackage.bv0 bv0Var4;
        java.util.ArrayList kNAkVymC = defpackage.x80.kNAkVymC(ki0Var);
        final defpackage.px pxVar = this.IHQe1A4L2xu;
        final defpackage.nx nxVar = pxVar.xiZrDbcSW0;
        boolean isEmpty = kNAkVymC.isEmpty();
        defpackage.ot otVar = defpackage.ot.adDC3e2L;
        final int i6 = 0;
        if (!isEmpty) {
            if (defpackage.ki.AARZUJiTa(j) != 0) {
                java.util.List list2 = (java.util.List) defpackage.td.JcqDrWrgMf(kNAkVymC);
                if (list2.isEmpty()) {
                    return ki0Var.EoOhNTTfIN7K(0, 0, otVar, new defpackage.JX5fKip1C6(3));
                }
                final int i7 = 1;
                java.util.List list3 = (java.util.List) defpackage.td.sJNB7mCer5(1, kNAkVymC);
                defpackage.di0 di0Var5 = list3 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list3) : null;
                java.util.List list4 = (java.util.List) defpackage.td.sJNB7mCer5(2, kNAkVymC);
                defpackage.di0 di0Var6 = list4 != null ? (defpackage.di0) defpackage.td.gG5uWf3dqScO(list4) : null;
                list2.size();
                nxVar.getClass();
                defpackage.bb0 bb0Var = defpackage.bb0.adDC3e2L;
                long TFRaUu83X3E = defpackage.x80.TFRaUu83X3E(defpackage.x80.cnag84Bm(10, defpackage.x80.SyNS6RMn(j, bb0Var)));
                if (di0Var5 != null) {
                    defpackage.x70.XZx205DYe(di0Var5, pxVar, TFRaUu83X3E, new defpackage.g00() { // from class: mx
                        @Override // defpackage.g00
                        public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                            int i8;
                            int i9;
                            int i10 = i6;
                            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                            int i11 = 0;
                            defpackage.px pxVar2 = pxVar;
                            defpackage.nx nxVar2 = nxVar;
                            defpackage.bv0 bv0Var5 = (defpackage.bv0) obj;
                            switch (i10) {
                                case 0:
                                    if (bv0Var5 != null) {
                                        pxVar2.getClass();
                                        i11 = bv0Var5.nVhUznk1t();
                                        i8 = bv0Var5.QUKZkWRtw6();
                                    } else {
                                        i8 = 0;
                                    }
                                    new defpackage.u60(defpackage.u60.IHQe1A4L2xu(i11, i8));
                                    nxVar2.getClass();
                                    break;
                                default:
                                    if (bv0Var5 != null) {
                                        pxVar2.getClass();
                                        i11 = bv0Var5.nVhUznk1t();
                                        i9 = bv0Var5.QUKZkWRtw6();
                                    } else {
                                        i9 = 0;
                                    }
                                    new defpackage.u60(defpackage.u60.IHQe1A4L2xu(i11, i9));
                                    nxVar2.getClass();
                                    break;
                            }
                            return ok1Var;
                        }
                    });
                }
                if (di0Var6 != null) {
                    defpackage.x70.XZx205DYe(di0Var6, pxVar, TFRaUu83X3E, new defpackage.g00() { // from class: mx
                        @Override // defpackage.g00
                        public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                            int i8;
                            int i9;
                            int i10 = i7;
                            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                            int i11 = 0;
                            defpackage.px pxVar2 = pxVar;
                            defpackage.nx nxVar2 = nxVar;
                            defpackage.bv0 bv0Var5 = (defpackage.bv0) obj;
                            switch (i10) {
                                case 0:
                                    if (bv0Var5 != null) {
                                        pxVar2.getClass();
                                        i11 = bv0Var5.nVhUznk1t();
                                        i8 = bv0Var5.QUKZkWRtw6();
                                    } else {
                                        i8 = 0;
                                    }
                                    new defpackage.u60(defpackage.u60.IHQe1A4L2xu(i11, i8));
                                    nxVar2.getClass();
                                    break;
                                default:
                                    if (bv0Var5 != null) {
                                        pxVar2.getClass();
                                        i11 = bv0Var5.nVhUznk1t();
                                        i9 = bv0Var5.QUKZkWRtw6();
                                    } else {
                                        i9 = 0;
                                    }
                                    new defpackage.u60(defpackage.u60.IHQe1A4L2xu(i11, i9));
                                    nxVar2.getClass();
                                    break;
                            }
                            return ok1Var;
                        }
                    });
                }
                java.util.Iterator it = list2.iterator();
                float f = pxVar.r1MBDhnF;
                float f2 = pxVar.adDC3e2L;
                long SyNS6RMn = defpackage.x80.SyNS6RMn(j, bb0Var);
                defpackage.nx nxVar2 = pxVar.xiZrDbcSW0;
                defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.ji0[16]);
                int EXtogiMhuM = defpackage.ki.EXtogiMhuM(SyNS6RMn);
                int SH1y5HwkJhh = defpackage.ki.SH1y5HwkJhh(SyNS6RMn);
                int AARZUJiTa = defpackage.ki.AARZUJiTa(SyNS6RMn);
                defpackage.xk0 xk0Var = defpackage.y60.IHQe1A4L2xu;
                defpackage.xk0 xk0Var2 = new defpackage.xk0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int ceil = (int) java.lang.Math.ceil(ki0Var.EgCjBq0SZwJ(f));
                int ceil2 = (int) java.lang.Math.ceil(ki0Var.EgCjBq0SZwJ(f2));
                long IHQe1A4L2xu3 = defpackage.li.IHQe1A4L2xu(0, EXtogiMhuM, 0, AARZUJiTa);
                long TFRaUu83X3E2 = defpackage.x80.TFRaUu83X3E(defpackage.x80.cnag84Bm(14, IHQe1A4L2xu3));
                if (it.hasNext()) {
                    try {
                        di0Var = (defpackage.di0) it.next();
                    } catch (java.lang.IndexOutOfBoundsException unused) {
                        di0Var = null;
                    }
                    di0Var2 = di0Var;
                } else {
                    di0Var2 = null;
                }
                if (di0Var2 != null) {
                    if (defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var2)) == 0.0f) {
                        defpackage.l80.G3OKOH3wZRC(di0Var2);
                        bv0Var4 = di0Var2.xiZrDbcSW0(TFRaUu83X3E2);
                        j2 = IHQe1A4L2xu3;
                        IHQe1A4L2xu2 = defpackage.u60.IHQe1A4L2xu(bv0Var4.nVhUznk1t(), bv0Var4.QUKZkWRtw6());
                    } else {
                        j2 = IHQe1A4L2xu3;
                        int lpprD5VAS = di0Var2.lpprD5VAS(Integer.MAX_VALUE);
                        IHQe1A4L2xu2 = defpackage.u60.IHQe1A4L2xu(lpprD5VAS, di0Var2.RmCzwkUxICV(lpprD5VAS));
                        bv0Var4 = null;
                    }
                    u60Var = new defpackage.u60(IHQe1A4L2xu2);
                    bv0Var = bv0Var4;
                } else {
                    j2 = IHQe1A4L2xu3;
                    bv0Var = null;
                    u60Var = null;
                }
                defpackage.bv0 bv0Var5 = bv0Var;
                java.lang.Integer valueOf = u60Var != null ? java.lang.Integer.valueOf((int) (u60Var.IHQe1A4L2xu >> 32)) : null;
                java.lang.Integer valueOf2 = u60Var != null ? java.lang.Integer.valueOf((int) (u60Var.IHQe1A4L2xu & 4294967295L)) : null;
                int[] iArr2 = new int[16];
                int[] iArr3 = new int[16];
                defpackage.u60 u60Var4 = u60Var;
                defpackage.yk0 yk0Var = new defpackage.yk0();
                defpackage.ix ixVar = new defpackage.ix(nxVar2, SyNS6RMn, ceil, ceil2);
                defpackage.hx oh6vYeIP2 = ixVar.oh6vYeIP(it.hasNext(), 0, defpackage.u60.IHQe1A4L2xu(EXtogiMhuM, AARZUJiTa), u60Var4, 0, 0, 0, false, false);
                if (oh6vYeIP2.oh6vYeIP) {
                    hxVar = oh6vYeIP2;
                    ixVar.IHQe1A4L2xu(hxVar, u60Var4 != null, -1, 0, EXtogiMhuM, 0);
                } else {
                    hxVar = oh6vYeIP2;
                }
                defpackage.px pxVar2 = pxVar;
                int i8 = SH1y5HwkJhh;
                int[] iArr4 = iArr3;
                defpackage.di0 di0Var7 = di0Var2;
                int i9 = AARZUJiTa;
                defpackage.yk0 yk0Var2 = yk0Var;
                int[] iArr5 = iArr2;
                defpackage.hx hxVar3 = hxVar;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = EXtogiMhuM;
                while (!hxVar3.oh6vYeIP && di0Var7 != null) {
                    valueOf.getClass();
                    int intValue = valueOf.intValue();
                    valueOf2.getClass();
                    int intValue2 = valueOf2.intValue();
                    int i19 = i13;
                    int i20 = i14 + intValue;
                    int max = java.lang.Math.max(i10, intValue2);
                    int i21 = i18 - intValue;
                    int i22 = i11 + 1;
                    nxVar2.getClass();
                    arrayList.add(di0Var7);
                    xk0Var2.EXtogiMhuM(i11, bv0Var5);
                    di0Var7.ez2rX8ReCYw();
                    int i23 = i22 - i15;
                    if (it.hasNext()) {
                        try {
                            di0Var3 = (defpackage.di0) it.next();
                        } catch (java.lang.IndexOutOfBoundsException unused2) {
                        }
                        if (di0Var3 == null) {
                            if (defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var3)) == 0.0f) {
                                defpackage.l80.G3OKOH3wZRC(di0Var3);
                                defpackage.bv0 xiZrDbcSW0 = di0Var3.xiZrDbcSW0(TFRaUu83X3E2);
                                bv0Var3 = xiZrDbcSW0;
                                IHQe1A4L2xu = defpackage.u60.IHQe1A4L2xu(xiZrDbcSW0.nVhUznk1t(), bv0Var3.QUKZkWRtw6());
                            } else {
                                int lpprD5VAS2 = di0Var3.lpprD5VAS(Integer.MAX_VALUE);
                                IHQe1A4L2xu = defpackage.u60.IHQe1A4L2xu(lpprD5VAS2, di0Var3.RmCzwkUxICV(lpprD5VAS2));
                                bv0Var3 = null;
                            }
                            di0Var4 = di0Var3;
                            i3 = i22;
                            u60Var2 = new defpackage.u60(IHQe1A4L2xu);
                            bv0Var2 = bv0Var3;
                        } else {
                            di0Var4 = di0Var3;
                            i3 = i22;
                            bv0Var2 = null;
                            u60Var2 = null;
                        }
                        defpackage.bv0 bv0Var6 = bv0Var2;
                        java.lang.Integer valueOf3 = u60Var2 == null ? java.lang.Integer.valueOf(((int) (u60Var2.IHQe1A4L2xu >> 32)) + ceil) : null;
                        java.lang.Integer valueOf4 = u60Var2 == null ? java.lang.Integer.valueOf((int) (u60Var2.IHQe1A4L2xu & 4294967295L)) : null;
                        boolean hasNext = it.hasNext();
                        long IHQe1A4L2xu4 = defpackage.u60.IHQe1A4L2xu(i21, i9);
                        if (u60Var2 != null) {
                            i4 = i21;
                            num = valueOf4;
                            u60Var3 = null;
                        } else {
                            valueOf3.getClass();
                            int intValue3 = valueOf3.intValue();
                            valueOf4.getClass();
                            i4 = i21;
                            num = valueOf4;
                            u60Var3 = new defpackage.u60(defpackage.u60.IHQe1A4L2xu(intValue3, valueOf4.intValue()));
                        }
                        oh6vYeIP = ixVar.oh6vYeIP(hasNext, i23, IHQe1A4L2xu4, u60Var3, i16, i17, max, false, false);
                        if (oh6vYeIP.IHQe1A4L2xu) {
                            hxVar2 = oh6vYeIP;
                            i5 = i20;
                            valueOf = valueOf3;
                            i10 = max;
                            i13 = i19;
                        } else {
                            int min = java.lang.Math.min(java.lang.Math.max(i8, i20), EXtogiMhuM);
                            int i24 = i17 + max;
                            hxVar2 = oh6vYeIP;
                            ixVar.IHQe1A4L2xu(hxVar2, u60Var2 != null, i16, i24, i4, i23);
                            int i25 = i19 + 1;
                            if (iArr4.length < i25) {
                                iArr4 = java.util.Arrays.copyOf(iArr4, java.lang.Math.max(i25, (iArr4.length * 3) / 2));
                            }
                            iArr4[i19] = max;
                            i13 = i19 + 1;
                            i9 = (i9 - i24) - ceil2;
                            int i26 = i12 + 1;
                            if (iArr5.length < i26) {
                                iArr5 = java.util.Arrays.copyOf(iArr5, java.lang.Math.max(i26, (iArr5.length * 3) / 2));
                            }
                            iArr5[i12] = i3;
                            i12++;
                            i16++;
                            i17 = i24 + ceil2;
                            valueOf = valueOf3 != null ? java.lang.Integer.valueOf(valueOf3.intValue() - ceil) : null;
                            i8 = min;
                            i4 = EXtogiMhuM;
                            i15 = i3;
                            i5 = 0;
                            i10 = 0;
                        }
                        defpackage.hx hxVar4 = hxVar2;
                        i14 = i5;
                        hxVar3 = hxVar4;
                        di0Var7 = di0Var4;
                        bv0Var5 = bv0Var6;
                        i18 = i4;
                        i11 = i3;
                        valueOf2 = num;
                    }
                    di0Var3 = null;
                    if (di0Var3 == null) {
                    }
                    defpackage.bv0 bv0Var62 = bv0Var2;
                    java.lang.Integer valueOf32 = u60Var2 == null ? java.lang.Integer.valueOf(((int) (u60Var2.IHQe1A4L2xu >> 32)) + ceil) : null;
                    if (u60Var2 == null) {
                    }
                    boolean hasNext2 = it.hasNext();
                    long IHQe1A4L2xu42 = defpackage.u60.IHQe1A4L2xu(i21, i9);
                    if (u60Var2 != null) {
                    }
                    oh6vYeIP = ixVar.oh6vYeIP(hasNext2, i23, IHQe1A4L2xu42, u60Var3, i16, i17, max, false, false);
                    if (oh6vYeIP.IHQe1A4L2xu) {
                    }
                    defpackage.hx hxVar42 = hxVar2;
                    i14 = i5;
                    hxVar3 = hxVar42;
                    di0Var7 = di0Var4;
                    bv0Var5 = bv0Var62;
                    i18 = i4;
                    i11 = i3;
                    valueOf2 = num;
                }
                int i27 = i13;
                int size = arrayList.size();
                defpackage.bv0[] bv0VarArr = new defpackage.bv0[size];
                for (int i28 = 0; i28 < size; i28++) {
                    bv0VarArr[i28] = xk0Var2.oh6vYeIP(i28);
                }
                int[] iArr6 = new int[i12];
                int[] iArr7 = new int[i12];
                int i29 = i8;
                int[] iArr8 = iArr5;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i31 < i12) {
                    int[] iArr9 = iArr4;
                    int i33 = iArr8[i31];
                    if (i31 < 0 || i31 >= (i2 = i27)) {
                        defpackage.db.cnag84Bm("Index must be between 0 and size");
                        return null;
                    }
                    int i34 = iArr9[i31];
                    defpackage.yk0 yk0Var3 = yk0Var2;
                    if (yk0Var3.oh6vYeIP(i31)) {
                        iArr = iArr9;
                        c = 65535;
                    } else {
                        c = 65535;
                        if (defpackage.ki.AARZUJiTa(j2) == Integer.MAX_VALUE) {
                            iArr = iArr9;
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = defpackage.ki.AARZUJiTa(j2) - i32;
                            iArr = iArr9;
                        }
                    }
                    yk0Var2 = yk0Var3;
                    int[] iArr10 = iArr8;
                    int i35 = i12;
                    int[] iArr11 = iArr6;
                    defpackage.px pxVar3 = pxVar2;
                    defpackage.ji0 SiPhmbmu = defpackage.x80.SiPhmbmu(pxVar3, i29, defpackage.ki.riuEU0zW4(j2), defpackage.ki.EXtogiMhuM(j2), i34, ceil, ki0Var, arrayList, bv0VarArr, i30, i33, iArr11, i31);
                    int adDC3e2L = SiPhmbmu.adDC3e2L();
                    int r1MBDhnF = SiPhmbmu.r1MBDhnF();
                    iArr7[i31] = r1MBDhnF;
                    i29 = java.lang.Math.max(i29, adDC3e2L);
                    xl0Var.oh6vYeIP(SiPhmbmu);
                    i31++;
                    i30 = i33;
                    i27 = i2;
                    iArr4 = iArr;
                    pxVar2 = pxVar3;
                    i32 += r1MBDhnF;
                    iArr6 = iArr11;
                    i12 = i35;
                    iArr8 = iArr10;
                }
                int[] iArr12 = iArr6;
                int i36 = i32;
                defpackage.px pxVar4 = pxVar2;
                if (xl0Var.AARZUJiTa == 0) {
                    i29 = 0;
                    i = 0;
                } else {
                    i = i36;
                }
                defpackage.j6 j6Var = pxVar4.oh6vYeIP;
                int yIx6ChFVk = ((xl0Var.AARZUJiTa - 1) * ki0Var.yIx6ChFVk(j6Var.IHQe1A4L2xu())) + i;
                int riuEU0zW4 = defpackage.ki.riuEU0zW4(SyNS6RMn);
                int AARZUJiTa2 = defpackage.ki.AARZUJiTa(SyNS6RMn);
                if (yIx6ChFVk < riuEU0zW4) {
                    yIx6ChFVk = riuEU0zW4;
                }
                if (yIx6ChFVk <= AARZUJiTa2) {
                    AARZUJiTa2 = yIx6ChFVk;
                }
                j6Var.EXtogiMhuM(AARZUJiTa2, ki0Var, iArr7, iArr12);
                int SH1y5HwkJhh2 = defpackage.ki.SH1y5HwkJhh(SyNS6RMn);
                int EXtogiMhuM2 = defpackage.ki.EXtogiMhuM(SyNS6RMn);
                if (i29 < SH1y5HwkJhh2) {
                    i29 = SH1y5HwkJhh2;
                }
                if (i29 <= EXtogiMhuM2) {
                    EXtogiMhuM2 = i29;
                }
                return ki0Var.EoOhNTTfIN7K(EXtogiMhuM2, AARZUJiTa2, otVar, new defpackage.DFo87pBq1E5(6, xl0Var));
            }
            nxVar.getClass();
        }
        return ki0Var.EoOhNTTfIN7K(0, 0, otVar, new defpackage.JX5fKip1C6(3));
    }
}
