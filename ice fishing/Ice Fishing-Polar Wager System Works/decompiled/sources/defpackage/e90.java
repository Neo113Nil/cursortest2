package defpackage;

/* loaded from: classes.dex */
public abstract class e90 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;
    public static final /* synthetic */ int oh6vYeIP = 0;

    public static final void AARZUJiTa(defpackage.sa1 sa1Var, defpackage.sv0 sv0Var, long j) {
        defpackage.gn gnVar = (defpackage.gn) sa1Var.xiZrDbcSW0;
        gnVar.getClass();
        defpackage.tl1 tl1Var = gnVar.oh6vYeIP;
        defpackage.tl1 tl1Var2 = gnVar.IHQe1A4L2xu;
        boolean JlrlGoKF = defpackage.s70.JlrlGoKF(sv0Var);
        long j2 = sv0Var.oh6vYeIP;
        if (JlrlGoKF) {
            defpackage.dl[] dlVarArr = tl1Var2.F7NU4MC0GW;
            defpackage.t6.nVhUznk1t(0, dlVarArr.length, null, dlVarArr);
            tl1Var2.adDC3e2L = 0;
            defpackage.dl[] dlVarArr2 = tl1Var.F7NU4MC0GW;
            defpackage.t6.nVhUznk1t(0, dlVarArr2.length, null, dlVarArr2);
            tl1Var.adDC3e2L = 0;
            gnVar.r1MBDhnF = 0L;
        }
        if (!defpackage.s70.DFo87pBq1E5(sv0Var)) {
            java.util.List list = sv0Var.DFo87pBq1E5;
            if (list == null) {
                list = defpackage.nt.adDC3e2L;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.z30 z30Var = (defpackage.z30) list.get(i);
                gnVar.IHQe1A4L2xu(z30Var.IHQe1A4L2xu, defpackage.gq0.adDC3e2L(z30Var.adDC3e2L, j));
            }
            gnVar.IHQe1A4L2xu(j2, defpackage.gq0.adDC3e2L(sv0Var.SyNS6RMn, j));
        }
        if (defpackage.s70.DFo87pBq1E5(sv0Var) && j2 - gnVar.r1MBDhnF > 40) {
            defpackage.dl[] dlVarArr3 = tl1Var2.F7NU4MC0GW;
            defpackage.t6.nVhUznk1t(0, dlVarArr3.length, null, dlVarArr3);
            tl1Var2.adDC3e2L = 0;
            defpackage.dl[] dlVarArr4 = tl1Var.F7NU4MC0GW;
            defpackage.t6.nVhUznk1t(0, dlVarArr4.length, null, dlVarArr4);
            tl1Var.adDC3e2L = 0;
            gnVar.r1MBDhnF = 0L;
        }
        gnVar.r1MBDhnF = j2;
    }

    public static final java.lang.String C0U8sNJm(java.lang.Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
    }

    public static void DFo87pBq1E5(defpackage.ln0 ln0Var, java.lang.String str, java.util.List list, defpackage.sf sfVar, int i) {
        if ((i & 2) != 0) {
            list = defpackage.nt.adDC3e2L;
        }
        defpackage.po0 po0Var = ln0Var.xiZrDbcSW0;
        po0Var.getClass();
        defpackage.hg hgVar = new defpackage.hg((defpackage.gg) po0Var.oh6vYeIP(kd6TUFXn(defpackage.gg.class)), str, sfVar);
        for (defpackage.lm0 lm0Var : list) {
            lm0Var.getClass();
            hgVar.r1MBDhnF.put("relicId", lm0Var.IHQe1A4L2xu);
        }
        ln0Var.EXtogiMhuM.add(hgVar.IHQe1A4L2xu());
    }

    public static void EXtogiMhuM(defpackage.ia1 ia1Var, java.util.List list, defpackage.kh khVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int r1MBDhnF = ia1Var.r1MBDhnF((defpackage.o10) list.get(i));
            int Uv8CGu3G = ia1Var.Uv8CGu3G(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(r1MBDhnF));
            java.lang.Object obj = Uv8CGu3G < ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(r1MBDhnF + 1)) ? ia1Var.r1MBDhnF[ia1Var.EXtogiMhuM(Uv8CGu3G)] : defpackage.bh.IHQe1A4L2xu;
            defpackage.az0 az0Var = obj instanceof defpackage.az0 ? (defpackage.az0) obj : null;
            if (az0Var != null) {
                az0Var.IHQe1A4L2xu = khVar;
            }
        }
    }

    public static final android.view.ViewParent EgCjBq0SZwJ(android.view.View view) {
        view.getClass();
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.view_tree_disjoint_parent);
        if (tag instanceof android.view.ViewParent) {
            return (android.view.ViewParent) tag;
        }
        return null;
    }

    public static final defpackage.f71 F7NU4MC0GW(defpackage.ma0 ma0Var, boolean z) {
        defpackage.lj0 lj0Var = ma0Var.yIx6ChFVk.xiZrDbcSW0;
        defpackage.kn knVar = null;
        if ((lj0Var.EXtogiMhuM & 8) != 0) {
            loop0: while (true) {
                if (lj0Var == null) {
                    break;
                }
                if ((lj0Var.AARZUJiTa & 8) != 0) {
                    defpackage.lj0 lj0Var2 = lj0Var;
                    defpackage.xl0 xl0Var = null;
                    while (lj0Var2 != null) {
                        if (lj0Var2 instanceof defpackage.d71) {
                            knVar = lj0Var2;
                            break loop0;
                        }
                        if ((lj0Var2.AARZUJiTa & 8) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                            int i = 0;
                            for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                if ((lj0Var3.AARZUJiTa & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lj0Var2 = lj0Var3;
                                    } else {
                                        if (xl0Var == null) {
                                            xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                        }
                                        if (lj0Var2 != null) {
                                            xl0Var.oh6vYeIP(lj0Var2);
                                            lj0Var2 = null;
                                        }
                                        xl0Var.oh6vYeIP(lj0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var);
                    }
                }
                if ((lj0Var.EXtogiMhuM & 8) == 0) {
                    break;
                }
                lj0Var = lj0Var.SH1y5HwkJhh;
            }
        }
        knVar.getClass();
        defpackage.lj0 lj0Var4 = ((defpackage.lj0) ((defpackage.d71) knVar)).adDC3e2L;
        defpackage.b71 abhbClRa = ma0Var.abhbClRa();
        if (abhbClRa == null) {
            abhbClRa = new defpackage.b71();
        }
        return new defpackage.f71(lj0Var4, z, ma0Var, abhbClRa);
    }

    public static final long G3OKOH3wZRC(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final void IHQe1A4L2xu(final defpackage.vz vzVar, final defpackage.mj0 mj0Var, final defpackage.ec0 ec0Var, final defpackage.rc0 rc0Var, defpackage.t10 t10Var, final int i) {
        t10Var.QUKZkWRtw6(1055276397);
        int i2 = (t10Var.EXtogiMhuM(vzVar) ? 4 : 2) | i | (t10Var.xiZrDbcSW0(mj0Var) ? 32 : 16) | (t10Var.xiZrDbcSW0(ec0Var) ? 256 : 128) | (t10Var.xiZrDbcSW0(rc0Var) ? 2048 : 1024);
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 1171) != 1170)) {
            final defpackage.sl0 D2vUnMij = defpackage.c80.D2vUnMij(vzVar, t10Var);
            defpackage.j70.IHQe1A4L2xu(defpackage.h1.XZx205DYe(-933153643, new defpackage.l00() { // from class: ub0
                @Override // defpackage.l00
                public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.mj0 r1MBDhnF;
                    defpackage.r31 r31Var = (defpackage.r31) obj;
                    defpackage.t10 t10Var2 = (defpackage.t10) obj2;
                    ((java.lang.Integer) obj3).getClass();
                    java.lang.Object mAr5m2L7gYDP = t10Var2.mAr5m2L7gYDP();
                    java.lang.Object obj4 = defpackage.bh.IHQe1A4L2xu;
                    if (mAr5m2L7gYDP == obj4) {
                        mAr5m2L7gYDP = new defpackage.sb0(r31Var, new defpackage.wb0(D2vUnMij, 0));
                        t10Var2.OtkytngK3Mr(mAr5m2L7gYDP);
                    }
                    defpackage.sb0 sb0Var = (defpackage.sb0) mAr5m2L7gYDP;
                    java.lang.Object mAr5m2L7gYDP2 = t10Var2.mAr5m2L7gYDP();
                    if (mAr5m2L7gYDP2 == obj4) {
                        mAr5m2L7gYDP2 = new defpackage.fd1(new defpackage.F7NU4MC0GW(sb0Var));
                        t10Var2.OtkytngK3Mr(mAr5m2L7gYDP2);
                    }
                    defpackage.fd1 fd1Var = (defpackage.fd1) mAr5m2L7gYDP2;
                    defpackage.ec0 ec0Var2 = defpackage.ec0.this;
                    if (ec0Var2 != null) {
                        t10Var2.AsxAYCCkb3Hi(1743490539);
                        t10Var2.AsxAYCCkb3Hi(887527095);
                        java.lang.Object obj5 = defpackage.mx0.IHQe1A4L2xu;
                        if (obj5 != null) {
                            t10Var2.AsxAYCCkb3Hi(1345554384);
                            t10Var2.QoRHpC4k(false);
                        } else {
                            t10Var2.AsxAYCCkb3Hi(1345603457);
                            android.view.View view = (android.view.View) t10Var2.SH1y5HwkJhh(defpackage.j1.adDC3e2L);
                            boolean xiZrDbcSW0 = t10Var2.xiZrDbcSW0(view);
                            java.lang.Object mAr5m2L7gYDP3 = t10Var2.mAr5m2L7gYDP();
                            if (xiZrDbcSW0 || mAr5m2L7gYDP3 == obj4) {
                                java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.compose_prefetch_scheduler);
                                mAr5m2L7gYDP3 = tag instanceof defpackage.kx0 ? (defpackage.kx0) tag : null;
                                if (mAr5m2L7gYDP3 == null) {
                                    mAr5m2L7gYDP3 = new defpackage.d3(view);
                                    view.setTag(com.combinations.spin.balbi.R.id.compose_prefetch_scheduler, mAr5m2L7gYDP3);
                                }
                                t10Var2.OtkytngK3Mr(mAr5m2L7gYDP3);
                            }
                            obj5 = (defpackage.kx0) mAr5m2L7gYDP3;
                            t10Var2.QoRHpC4k(false);
                        }
                        java.lang.Object obj6 = obj5;
                        t10Var2.QoRHpC4k(false);
                        java.lang.Object[] objArr = {ec0Var2, sb0Var, fd1Var, obj6};
                        boolean xiZrDbcSW02 = t10Var2.xiZrDbcSW0(ec0Var2) | t10Var2.EXtogiMhuM(sb0Var) | t10Var2.EXtogiMhuM(fd1Var) | t10Var2.EXtogiMhuM(obj6);
                        java.lang.Object mAr5m2L7gYDP4 = t10Var2.mAr5m2L7gYDP();
                        if (xiZrDbcSW02 || mAr5m2L7gYDP4 == obj4) {
                            mAr5m2L7gYDP4 = new defpackage.t3(ec0Var2, sb0Var, fd1Var, obj6, 2);
                            t10Var2.OtkytngK3Mr(mAr5m2L7gYDP4);
                        }
                        defpackage.g00 g00Var = (defpackage.g00) mAr5m2L7gYDP4;
                        boolean z = false;
                        for (java.lang.Object obj7 : java.util.Arrays.copyOf(objArr, 4)) {
                            z |= t10Var2.xiZrDbcSW0(obj7);
                        }
                        java.lang.Object mAr5m2L7gYDP5 = t10Var2.mAr5m2L7gYDP();
                        if (z || mAr5m2L7gYDP5 == obj4) {
                            t10Var2.OtkytngK3Mr(new defpackage.gq(g00Var));
                        }
                    } else {
                        t10Var2.AsxAYCCkb3Hi(1737291469);
                    }
                    t10Var2.QoRHpC4k(false);
                    int i3 = defpackage.fc0.IHQe1A4L2xu;
                    defpackage.mj0 mj0Var2 = mj0Var;
                    if (ec0Var2 != null && (r1MBDhnF = mj0Var2.r1MBDhnF(new defpackage.vi1(ec0Var2))) != null) {
                        mj0Var2 = r1MBDhnF;
                    }
                    boolean xiZrDbcSW03 = t10Var2.xiZrDbcSW0(sb0Var);
                    java.lang.Object obj8 = rc0Var;
                    boolean xiZrDbcSW04 = xiZrDbcSW03 | t10Var2.xiZrDbcSW0(obj8);
                    java.lang.Object mAr5m2L7gYDP6 = t10Var2.mAr5m2L7gYDP();
                    int i4 = 8;
                    if (xiZrDbcSW04 || mAr5m2L7gYDP6 == obj4) {
                        mAr5m2L7gYDP6 = new defpackage.oKqPTyA2(i4, sb0Var, obj8);
                        t10Var2.OtkytngK3Mr(mAr5m2L7gYDP6);
                    }
                    defpackage.h1.ez2rX8ReCYw(fd1Var, mj0Var2, (defpackage.k00) mAr5m2L7gYDP6, t10Var2, 8);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            }, t10Var), t10Var, 6);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(mj0Var, ec0Var, rc0Var, i) { // from class: vb0
                public final /* synthetic */ defpackage.ec0 AARZUJiTa;
                public final /* synthetic */ defpackage.rc0 EXtogiMhuM;
                public final /* synthetic */ defpackage.mj0 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(1);
                    defpackage.e90.IHQe1A4L2xu(defpackage.vz.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, (defpackage.t10) obj, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void JlrlGoKF(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            defpackage.db.fnWB2E7cs(defpackage.fx0.EXtogiMhuM(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final java.lang.Object NHJTzaLwkd(java.lang.Object[] objArr, defpackage.l41 l41Var, defpackage.vz vzVar, defpackage.t10 t10Var, int i) {
        return QQUzIjv3iOC5(java.util.Arrays.copyOf(objArr, objArr.length), l41Var, vzVar, t10Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final void PAEGRtP0bX(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            defpackage.x50.IHQe1A4L2xu("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            java.lang.System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float SyNS6RMn = SyNS6RMn(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * SyNS6RMn);
                }
            }
            float sqrt = (float) java.lang.Math.sqrt(SyNS6RMn(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : SyNS6RMn(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float SyNS6RMn2 = SyNS6RMn(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    SyNS6RMn2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = SyNS6RMn2 / fArr11[i14];
        }
    }

    public static final java.lang.Object QQUzIjv3iOC5(java.lang.Object[] objArr, defpackage.l41 l41Var, defpackage.vz vzVar, defpackage.t10 t10Var, int i, int i2) {
        java.lang.Object[] objArr2;
        defpackage.l41 l41Var2;
        final java.lang.Object obj;
        java.lang.Object xiZrDbcSW0;
        long j = t10Var.Ye0N2xE9Hc;
        defpackage.x70.G3OKOH3wZRC(36);
        final java.lang.String l = java.lang.Long.toString(j, 36);
        l.getClass();
        l41Var.getClass();
        final defpackage.t31 t31Var = (defpackage.t31) t10Var.SH1y5HwkJhh(defpackage.w31.IHQe1A4L2xu);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        java.lang.Object obj2 = defpackage.bh.IHQe1A4L2xu;
        if (mAr5m2L7gYDP == obj2) {
            java.lang.Object F7NU4MC0GW = (t31Var == null || (xiZrDbcSW0 = t31Var.xiZrDbcSW0(l)) == null) ? null : l41Var.F7NU4MC0GW(xiZrDbcSW0);
            if (F7NU4MC0GW == null) {
                F7NU4MC0GW = vzVar.IHQe1A4L2xu();
            }
            objArr2 = objArr;
            l41Var2 = l41Var;
            java.lang.Object q31Var = new defpackage.q31(l41Var2, t31Var, l, F7NU4MC0GW, objArr2);
            t10Var.OtkytngK3Mr(q31Var);
            mAr5m2L7gYDP = q31Var;
        } else {
            objArr2 = objArr;
            l41Var2 = l41Var;
        }
        final defpackage.q31 q31Var2 = (defpackage.q31) mAr5m2L7gYDP;
        java.lang.Object obj3 = java.util.Arrays.equals(objArr2, q31Var2.riuEU0zW4) ? q31Var2.EXtogiMhuM : null;
        if (obj3 == null) {
            obj3 = vzVar.IHQe1A4L2xu();
        }
        boolean EXtogiMhuM = t10Var.EXtogiMhuM(q31Var2) | ((((i & 112) ^ 48) > 32 && t10Var.EXtogiMhuM(l41Var2)) || (i & 48) == 32) | t10Var.EXtogiMhuM(t31Var) | t10Var.xiZrDbcSW0(l) | t10Var.EXtogiMhuM(obj3) | t10Var.EXtogiMhuM(objArr2);
        java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
        if (EXtogiMhuM || mAr5m2L7gYDP2 == obj2) {
            final java.lang.Object[] objArr3 = objArr2;
            obj = obj3;
            final defpackage.l41 l41Var3 = l41Var2;
            java.lang.Object obj4 = new defpackage.vz() { // from class: x01
                @Override // defpackage.vz
                public final java.lang.Object IHQe1A4L2xu() {
                    boolean z;
                    defpackage.q31 q31Var3 = defpackage.q31.this;
                    defpackage.t31 t31Var2 = q31Var3.xiZrDbcSW0;
                    defpackage.t31 t31Var3 = t31Var;
                    boolean z2 = true;
                    if (t31Var2 != t31Var3) {
                        q31Var3.xiZrDbcSW0 = t31Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    java.lang.String str = q31Var3.AARZUJiTa;
                    java.lang.String str2 = l;
                    if (defpackage.x70.QoRHpC4k(str, str2)) {
                        z2 = z;
                    } else {
                        q31Var3.AARZUJiTa = str2;
                    }
                    q31Var3.adDC3e2L = l41Var3;
                    q31Var3.EXtogiMhuM = obj;
                    q31Var3.riuEU0zW4 = objArr3;
                    defpackage.v5 v5Var = q31Var3.SH1y5HwkJhh;
                    if (v5Var != null && z2) {
                        v5Var.fnWB2E7cs();
                        q31Var3.SH1y5HwkJhh = null;
                        q31Var3.oh6vYeIP();
                    }
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
            t10Var.OtkytngK3Mr(obj4);
            mAr5m2L7gYDP2 = obj4;
        } else {
            obj = obj3;
        }
        defpackage.s21.DFo87pBq1E5((defpackage.vz) mAr5m2L7gYDP2, t10Var);
        return obj;
    }

    public static void SH1y5HwkJhh(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final float SyNS6RMn(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final java.lang.Object UsuH8pd5P(defpackage.e51 e51Var, defpackage.e51 e51Var2, defpackage.k00 k00Var) {
        java.lang.Object bfVar;
        java.lang.Object AsxAYCCkb3Hi;
        try {
            defpackage.mj1.kNAkVymC(2, k00Var);
            bfVar = k00Var.adDC3e2L(e51Var2, e51Var);
        } catch (java.lang.Throwable th) {
            bfVar = new defpackage.bf(th, false);
        }
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (bfVar == vjVar || (AsxAYCCkb3Hi = e51Var.AsxAYCCkb3Hi(bfVar)) == defpackage.gq1.xiZrDbcSW0) {
            return vjVar;
        }
        if (AsxAYCCkb3Hi instanceof defpackage.bf) {
            throw ((defpackage.bf) AsxAYCCkb3Hi).IHQe1A4L2xu;
        }
        return defpackage.gq1.SiPhmbmu(AsxAYCCkb3Hi);
    }

    public static final long V7bD7b8KA(long j, float f) {
        long floatToRawIntBits = j | (java.lang.Float.floatToRawIntBits(f) & 4294967295L);
        defpackage.gg1[] gg1VarArr = defpackage.fg1.oh6vYeIP;
        return floatToRawIntBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        r0 = defpackage.s70.ez2rX8ReCYw(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        defpackage.gq1.JlrlGoKF(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.se1 abhbClRa(defpackage.i31 i31Var, java.lang.String str) {
        long j;
        java.util.Map oh6vYeIP2;
        defpackage.c81 c81Var;
        i31Var.getClass();
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (nBH8hAHy.NHJTzaLwkd()) {
                int AARZUJiTa = defpackage.f70.AARZUJiTa(nBH8hAHy, "name");
                int AARZUJiTa2 = defpackage.f70.AARZUJiTa(nBH8hAHy, "type");
                int AARZUJiTa3 = defpackage.f70.AARZUJiTa(nBH8hAHy, "notnull");
                int AARZUJiTa4 = defpackage.f70.AARZUJiTa(nBH8hAHy, "pk");
                int AARZUJiTa5 = defpackage.f70.AARZUJiTa(nBH8hAHy, "dflt_value");
                defpackage.rg0 rg0Var = new defpackage.rg0();
                while (true) {
                    java.lang.String xiZrDbcSW0 = nBH8hAHy.xiZrDbcSW0(AARZUJiTa);
                    j = j2;
                    rg0Var.put(xiZrDbcSW0, new defpackage.pe1((int) nBH8hAHy.getLong(AARZUJiTa4), 2, xiZrDbcSW0, nBH8hAHy.xiZrDbcSW0(AARZUJiTa2), nBH8hAHy.isNull(AARZUJiTa5) ? null : nBH8hAHy.xiZrDbcSW0(AARZUJiTa5), nBH8hAHy.getLong(AARZUJiTa3) != j2));
                    if (!nBH8hAHy.NHJTzaLwkd()) {
                        break;
                    }
                    j2 = j;
                }
                oh6vYeIP2 = rg0Var.oh6vYeIP();
                defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            } else {
                oh6vYeIP2 = defpackage.ot.adDC3e2L;
                defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                j = 0;
            }
            nBH8hAHy = i31Var.nBH8hAHy("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int AARZUJiTa6 = defpackage.f70.AARZUJiTa(nBH8hAHy, "id");
                int AARZUJiTa7 = defpackage.f70.AARZUJiTa(nBH8hAHy, "seq");
                int AARZUJiTa8 = defpackage.f70.AARZUJiTa(nBH8hAHy, "table");
                int AARZUJiTa9 = defpackage.f70.AARZUJiTa(nBH8hAHy, "on_delete");
                int AARZUJiTa10 = defpackage.f70.AARZUJiTa(nBH8hAHy, "on_update");
                java.util.List abhbClRa = defpackage.a70.abhbClRa(nBH8hAHy);
                nBH8hAHy.reset();
                defpackage.c81 c81Var2 = new defpackage.c81();
                while (nBH8hAHy.NHJTzaLwkd()) {
                    if (nBH8hAHy.getLong(AARZUJiTa7) == j) {
                        int i = (int) nBH8hAHy.getLong(AARZUJiTa6);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i2 = AARZUJiTa6;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj : abhbClRa) {
                            int i3 = AARZUJiTa7;
                            java.util.List list = abhbClRa;
                            if (((defpackage.jz) obj).adDC3e2L == i) {
                                arrayList3.add(obj);
                            }
                            AARZUJiTa7 = i3;
                            abhbClRa = list;
                        }
                        int i4 = AARZUJiTa7;
                        java.util.List list2 = abhbClRa;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            java.lang.Object obj2 = arrayList3.get(i5);
                            i5++;
                            defpackage.jz jzVar = (defpackage.jz) obj2;
                            arrayList.add(jzVar.AARZUJiTa);
                            arrayList2.add(jzVar.EXtogiMhuM);
                            arrayList3 = arrayList3;
                        }
                        c81Var2.add(new defpackage.qe1(nBH8hAHy.xiZrDbcSW0(AARZUJiTa8), nBH8hAHy.xiZrDbcSW0(AARZUJiTa9), nBH8hAHy.xiZrDbcSW0(AARZUJiTa10), arrayList, arrayList2));
                        AARZUJiTa6 = i2;
                        AARZUJiTa7 = i4;
                        abhbClRa = list2;
                    }
                }
                defpackage.c81 ez2rX8ReCYw = defpackage.s70.ez2rX8ReCYw(c81Var2);
                defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                nBH8hAHy = i31Var.nBH8hAHy("PRAGMA index_list(`" + str + "`)");
                try {
                    int AARZUJiTa11 = defpackage.f70.AARZUJiTa(nBH8hAHy, "name");
                    int AARZUJiTa12 = defpackage.f70.AARZUJiTa(nBH8hAHy, "origin");
                    int AARZUJiTa13 = defpackage.f70.AARZUJiTa(nBH8hAHy, "unique");
                    if (AARZUJiTa11 == -1 || AARZUJiTa12 == -1 || AARZUJiTa13 == -1) {
                        defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                        c81Var = null;
                    } else {
                        defpackage.c81 c81Var3 = new defpackage.c81();
                        while (true) {
                            if (!nBH8hAHy.NHJTzaLwkd()) {
                                break;
                            }
                            if ("c".equals(nBH8hAHy.xiZrDbcSW0(AARZUJiTa12))) {
                                defpackage.re1 NHJTzaLwkd = defpackage.a70.NHJTzaLwkd(i31Var, nBH8hAHy.xiZrDbcSW0(AARZUJiTa11), nBH8hAHy.getLong(AARZUJiTa13) == 1);
                                if (NHJTzaLwkd == null) {
                                    defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                                    c81Var = null;
                                    break;
                                }
                                c81Var3.add(NHJTzaLwkd);
                            }
                        }
                    }
                    return new defpackage.se1(str, oh6vYeIP2, ez2rX8ReCYw, c81Var);
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final int adDC3e2L(defpackage.zf0 zf0Var, defpackage.o oVar) {
        defpackage.zf0 JX5fKip1C6 = zf0Var.JX5fKip1C6();
        if (JX5fKip1C6 == null) {
            defpackage.x50.oh6vYeIP("Child of " + zf0Var + " cannot be null when calculating alignment line");
        }
        if (zf0Var.seT5W8IHOge().IHQe1A4L2xu().containsKey(oVar)) {
            java.lang.Integer num = (java.lang.Integer) zf0Var.seT5W8IHOge().IHQe1A4L2xu().get(oVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int k3hcgHS3MP = JX5fKip1C6.k3hcgHS3MP(oVar);
            if (k3hcgHS3MP != Integer.MIN_VALUE) {
                JX5fKip1C6.SyNS6RMn = true;
                zf0Var.cnag84Bm = true;
                zf0Var.pm90rNzI5F();
                JX5fKip1C6.SyNS6RMn = false;
                zf0Var.cnag84Bm = false;
                return k3hcgHS3MP + ((int) (oVar instanceof defpackage.g40 ? JX5fKip1C6.FisHbM7NmV() & 4294967295L : JX5fKip1C6.FisHbM7NmV() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final java.lang.String cnag84Bm(java.lang.Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final void ez2rX8ReCYw(int i, int i2) {
        if (i < 0 || i > i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        }
    }

    public static final long fnWB2E7cs(double d) {
        return V7bD7b8KA(4294967296L, (float) d);
    }

    public static final long kNAkVymC(int i) {
        return V7bD7b8KA(4294967296L, i);
    }

    public static java.lang.String kd6TUFXn(java.lang.Class cls) {
        java.util.LinkedHashMap linkedHashMap = defpackage.po0.oh6vYeIP;
        java.lang.String str = (java.lang.String) linkedHashMap.get(cls);
        if (str == null) {
            defpackage.no0 no0Var = (defpackage.no0) cls.getAnnotation(defpackage.no0.class);
            str = no0Var != null ? no0Var.value() : null;
            if (str == null || str.length() <= 0) {
                defpackage.db.adDC3e2L("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final defpackage.ub1 nBH8hAHy(defpackage.ak0 ak0Var, defpackage.t10 t10Var) {
        defpackage.zj0 zj0Var = (defpackage.zj0) t10Var.SH1y5HwkJhh(defpackage.bi0.IHQe1A4L2xu);
        int ordinal = ak0Var.ordinal();
        if (ordinal == 0) {
            zj0Var.getClass();
            defpackage.ub1 ub1Var = defpackage.zj0.oh6vYeIP;
            ub1Var.getClass();
            return ub1Var;
        }
        if (ordinal == 1) {
            zj0Var.getClass();
            defpackage.ub1 ub1Var2 = defpackage.zj0.r1MBDhnF;
            ub1Var2.getClass();
            return ub1Var2;
        }
        if (ordinal == 2) {
            zj0Var.getClass();
            defpackage.ub1 ub1Var3 = defpackage.zj0.F7NU4MC0GW;
            ub1Var3.getClass();
            return ub1Var3;
        }
        if (ordinal == 3) {
            zj0Var.getClass();
            defpackage.ub1 ub1Var4 = defpackage.zj0.adDC3e2L;
            ub1Var4.getClass();
            return ub1Var4;
        }
        if (ordinal == 4) {
            zj0Var.getClass();
            defpackage.ub1 ub1Var5 = defpackage.zj0.xiZrDbcSW0;
            ub1Var5.getClass();
            return ub1Var5;
        }
        if (ordinal != 5) {
            defpackage.db.F7NU4MC0GW();
            return null;
        }
        zj0Var.getClass();
        defpackage.ub1 ub1Var6 = defpackage.zj0.AARZUJiTa;
        ub1Var6.getClass();
        return ub1Var6;
    }

    public static final void oh6vYeIP(defpackage.qn0 qn0Var, defpackage.wi0 wi0Var, defpackage.t10 t10Var, int i) {
        defpackage.wi0 wi0Var2;
        qn0Var.getClass();
        t10Var.QUKZkWRtw6(1373934095);
        int i2 = 2;
        int i3 = (t10Var.EXtogiMhuM(qn0Var) ? 4 : 2) | i | 16;
        if (t10Var.lpprD5VAS(i3 & 1, (i3 & 19) != 18)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                t10Var.RmCzwkUxICV(1890788296);
                defpackage.cn1 IHQe1A4L2xu2 = defpackage.df0.IHQe1A4L2xu(t10Var);
                if (IHQe1A4L2xu2 == null) {
                    defpackage.db.AARZUJiTa("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                defpackage.w30 G3OKOH3wZRC = defpackage.w70.G3OKOH3wZRC(IHQe1A4L2xu2, t10Var);
                t10Var.RmCzwkUxICV(1729797275);
                defpackage.vm1 v5iciZok = defpackage.l80.v5iciZok(defpackage.wi0.class, IHQe1A4L2xu2, G3OKOH3wZRC, IHQe1A4L2xu2 instanceof defpackage.h30 ? ((defpackage.h30) IHQe1A4L2xu2).xiZrDbcSW0() : defpackage.dk.oh6vYeIP, t10Var);
                t10Var.QoRHpC4k(false);
                t10Var.QoRHpC4k(false);
                wi0Var2 = (defpackage.wi0) v5iciZok;
            } else {
                t10Var.WLpAkxCo();
                wi0Var2 = wi0Var;
            }
            t10Var.G3OKOH3wZRC();
            defpackage.sl0 PAEGRtP0bX = defpackage.mj1.PAEGRtP0bX(wi0Var2.F7NU4MC0GW, t10Var);
            defpackage.tb tbVar = wi0Var2.xiZrDbcSW0;
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(qn0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            if (EXtogiMhuM || mAr5m2L7gYDP == ad1Var) {
                mAr5m2L7gYDP = new defpackage.o30(qn0Var, null, i2);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.x80.IHQe1A4L2xu(tbVar, (defpackage.k00) mAr5m2L7gYDP, t10Var, 0);
            defpackage.vi0 vi0Var = (defpackage.vi0) PAEGRtP0bX.getValue();
            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(wi0Var2);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM2 || mAr5m2L7gYDP2 == ad1Var) {
                defpackage.xiZrDbcSW0 xizrdbcsw0 = new defpackage.xiZrDbcSW0(1, wi0Var2, defpackage.wi0.class, "onEvent", "onEvent(Lcom/corsair/ledger/presentation/menu/MenuEvent;)V", 0, 0, 8);
                t10Var.OtkytngK3Mr(xizrdbcsw0);
                mAr5m2L7gYDP2 = xizrdbcsw0;
            }
            r1MBDhnF(vi0Var, (defpackage.g00) ((defpackage.v00) mAr5m2L7gYDP2), t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
            wi0Var2 = wi0Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 13, qn0Var, wi0Var2);
        }
    }

    public static final void r1MBDhnF(defpackage.vi0 vi0Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        boolean z;
        defpackage.t10 t10Var2 = t10Var;
        vi0Var.getClass();
        g00Var.getClass();
        t10Var2.QUKZkWRtw6(2050898463);
        int i2 = i | (t10Var2.xiZrDbcSW0(vi0Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= t10Var2.EXtogiMhuM(g00Var) ? 32 : 16;
        }
        int i3 = 0;
        if (t10Var2.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            defpackage.mj1.riuEU0zW4(null, defpackage.h1.XZx205DYe(646644843, new defpackage.lp(r8, g00Var, vi0Var), t10Var2), t10Var2, 48);
            if (vi0Var.oh6vYeIP) {
                t10Var2.AsxAYCCkb3Hi(-1886906684);
                long j = ((defpackage.fe) t10Var2.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu)).QoRHpC4k;
                r8 = (i2 & 112) != 32 ? 0 : 1;
                java.lang.Object mAr5m2L7gYDP = t10Var2.mAr5m2L7gYDP();
                if (r8 != 0 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                    mAr5m2L7gYDP = new defpackage.bDeDBuv6ooq(g00Var, 12);
                    t10Var2.OtkytngK3Mr(mAr5m2L7gYDP);
                }
                z = false;
                defpackage.fm.r1MBDhnF((defpackage.vz) mAr5m2L7gYDP, defpackage.h1.XZx205DYe(-1237710030, new defpackage.oKqPTyA2(14, g00Var, vi0Var), t10Var2), null, defpackage.h1.XZx205DYe(-562549904, new defpackage.ui0(g00Var, i3), t10Var2), defpackage.h1.F7NU4MC0GW, defpackage.h1.adDC3e2L, null, j, 0L, 0L, 0L, null, t10Var, 1772592);
                t10Var2 = t10Var;
            } else {
                z = false;
                t10Var2.AsxAYCCkb3Hi(-1890539357);
            }
            t10Var2.QoRHpC4k(z);
        } else {
            t10Var2.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var2.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.KaQkzhFJpl(i, 6, vi0Var, g00Var);
        }
    }

    public static final void riuEU0zW4(int i, int i2) {
        if (i < 0 || i >= i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        }
    }

    public static final float xiZrDbcSW0(defpackage.av0 av0Var, boolean z, defpackage.i40[] i40VarArr, float f) {
        float f2 = Float.NaN;
        for (defpackage.i40 i40Var : i40VarArr) {
            float F7NU4MC0GW = av0Var.F7NU4MC0GW(i40Var);
            if (!java.lang.Float.isNaN(f2)) {
                int i = z != (F7NU4MC0GW > f2) ? i + 1 : 0;
            }
            f2 = F7NU4MC0GW;
        }
        return java.lang.Float.isNaN(f2) ? f : f2;
    }

    public abstract defpackage.kz0 QoRHpC4k();
}
