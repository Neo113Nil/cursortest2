package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ve extends defpackage.xo implements defpackage.f01, defpackage.zb0, defpackage.hb1, defpackage.rp1, defpackage.mj, defpackage.ts0, defpackage.r70, defpackage.n30 {
    public static final defpackage.pa1 Wc0TdmRSwbbi = new defpackage.pa1(11);
    public defpackage.in0 BXaznwstz2U0;
    public defpackage.yf1 GcLuU6pT9wO9;
    public defpackage.u11 IBvW5fLsPuHy;
    public boolean IJ0hOnjhPOri;
    public long KrtOTfE6jiS2;
    public defpackage.t50 Mearx7yMn90V;
    public final defpackage.rz OcTWLQzke1i2;
    public defpackage.o30 UmgHb6n58gfG;
    public java.lang.String VFeft99leXEK;
    public defpackage.c70 blKFvluuDQOf;
    public defpackage.n10 dG7RjM6DqYVL;
    public final defpackage.kn0 frSwwKIlbUhK;
    public boolean hH0RRJrNssvh;
    public defpackage.u11 jjTN4uUnoyEn;
    public defpackage.c70 maCixPsq4ml2;
    public boolean oCu53ZX2v4Ju;
    public defpackage.wo qjMheFZ0l9kA;
    public defpackage.c01 w6IV1lieBIux;
    public defpackage.in0 w7APNrr0aGRc;
    public final defpackage.pa1 xahdJg25P1Bv;
    public defpackage.h70 zJPqDeoF0Os1;

    public ve(defpackage.in0 in0Var, defpackage.c70 c70Var, boolean z, boolean z2, java.lang.String str, defpackage.n10 n10Var) {
        this.w7APNrr0aGRc = in0Var;
        this.maCixPsq4ml2 = c70Var;
        this.IJ0hOnjhPOri = z;
        this.VFeft99leXEK = str;
        this.oCu53ZX2v4Ju = z2;
        this.dG7RjM6DqYVL = n10Var;
        this.OcTWLQzke1i2 = new defpackage.rz(in0Var, 0, new defpackage.WDYagTQQm9ns(1, this, defpackage.ve.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = defpackage.xi0.ZpBGe2uQfcn8;
        this.frSwwKIlbUhK = new defpackage.kn0(6);
        this.KrtOTfE6jiS2 = 0L;
        defpackage.in0 in0Var2 = this.w7APNrr0aGRc;
        this.BXaznwstz2U0 = in0Var2;
        this.hH0RRJrNssvh = in0Var2 == null;
        this.xahdJg25P1Bv = Wc0TdmRSwbbi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CZa7MwI9IzLd(android.view.KeyEvent keyEvent) {
        boolean z;
        int i;
        java.lang.Object obj;
        VpXebusPOq9I();
        long qjMheFZ0l9kA = defpackage.w60.qjMheFZ0l9kA(keyEvent);
        boolean z2 = this.oCu53ZX2v4Ju;
        defpackage.kn0 kn0Var = this.frSwwKIlbUhK;
        int i2 = 1;
        if (z2 && defpackage.w60.jjTN4uUnoyEn(keyEvent) == 2 && defpackage.jr0.jjTN4uUnoyEn(keyEvent)) {
            if (!kn0Var.giKS3J6vZuNy(qjMheFZ0l9kA)) {
                defpackage.u11 u11Var = new defpackage.u11(this.KrtOTfE6jiS2);
                kn0Var.oh71FJcDz6S2(qjMheFZ0l9kA, u11Var);
                if (this.w7APNrr0aGRc == null) {
                    return true;
                }
                defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.GE9mJIPrb8gP(this, u11Var, null, 2), 3);
                return true;
            }
        } else if (this.oCu53ZX2v4Ju && defpackage.w60.jjTN4uUnoyEn(keyEvent) == 1 && defpackage.jr0.jjTN4uUnoyEn(keyEvent)) {
            kn0Var.getClass();
            int hashCode = java.lang.Long.hashCode(qjMheFZ0l9kA) * (-862048943);
            int i3 = hashCode ^ (hashCode << 16);
            int i4 = i3 & 127;
            int i5 = kn0Var.JhCgjQRTAOCT;
            int i6 = (i3 >>> 7) & i5;
            int i7 = 0;
            loop0: while (true) {
                long[] jArr = kn0Var.ZpBGe2uQfcn8;
                int i8 = i6 >> 3;
                int i9 = (i6 & 7) << 3;
                z = i2;
                long j = (((-i9) >> 63) & (jArr[i8 + i2] << (64 - i9))) | (jArr[i8] >>> i9);
                long j2 = (i4 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = (i6 + (java.lang.Long.numberOfTrailingZeros(j4) >> 3)) & i5;
                    long j5 = j3;
                    if (kn0Var.giKS3J6vZuNy[i] == qjMheFZ0l9kA) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i7 += 8;
                i6 = (i6 + i7) & i5;
                i2 = z ? 1 : 0;
            }
            if (i >= 0) {
                kn0Var.WDYagTQQm9ns--;
                long[] jArr2 = kn0Var.ZpBGe2uQfcn8;
                int i10 = kn0Var.JhCgjQRTAOCT;
                int i11 = i >> 3;
                int i12 = (i & 7) << 3;
                long j6 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
                jArr2[i11] = j6;
                jArr2[(((i - 7) & i10) + (i10 & 7)) >> 3] = j6;
                java.lang.Object[] objArr = kn0Var.fWTAfUmVKrZq;
                obj = objArr[i];
                objArr[i] = null;
            } else {
                obj = null;
            }
            defpackage.u11 u11Var2 = (defpackage.u11) obj;
            if (u11Var2 != null) {
                if (this.w7APNrr0aGRc != null) {
                    defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.GE9mJIPrb8gP(this, u11Var2, null, 3), 3);
                }
                this.dG7RjM6DqYVL.ZpBGe2uQfcn8();
            }
            if (u11Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.f01
    public final void IBvW5fLsPuHy(defpackage.vz0 vz0Var, defpackage.wz0 wz0Var, long j) {
        defpackage.in0 in0Var;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.KrtOTfE6jiS2 = (java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        VpXebusPOq9I();
        boolean z = this.oCu53ZX2v4Ju;
        defpackage.wz0 wz0Var2 = defpackage.wz0.oh71FJcDz6S2;
        defpackage.kl klVar = null;
        int i = 1;
        int i2 = 0;
        if (z) {
            if (this.UmgHb6n58gfG == null) {
                defpackage.o30 o30Var = new defpackage.o30(this);
                YZh1E3mnTFwf(o30Var);
                this.UmgHb6n58gfG = o30Var;
            }
            if (wz0Var == wz0Var2) {
                int i3 = vz0Var.oh71FJcDz6S2;
                if (i3 == 4) {
                    defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.Ns0WNyEWdPsk(this, klVar, i2), 3);
                } else if (i3 == 5) {
                    defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.Ns0WNyEWdPsk(this, klVar, i), 3);
                }
            }
        }
        if (wz0Var != wz0Var2) {
            if (wz0Var != defpackage.wz0.QiMR8OkAhezm || this.w6IV1lieBIux == null) {
                return;
            }
            java.util.List list = vz0Var.ZpBGe2uQfcn8;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                defpackage.c01 c01Var = (defpackage.c01) list.get(i4);
                if (c01Var.giKS3J6vZuNy() && c01Var != this.w6IV1lieBIux) {
                    jVUAPb5NnIYW(false);
                    return;
                }
            }
            return;
        }
        if (this.w6IV1lieBIux == null) {
            if (defpackage.oj1.JhCgjQRTAOCT(vz0Var, true)) {
                defpackage.c01 c01Var2 = (defpackage.c01) vz0Var.ZpBGe2uQfcn8.get(0);
                c01Var2.ZpBGe2uQfcn8();
                this.w6IV1lieBIux = c01Var2;
                if (!this.oCu53ZX2v4Ju || (in0Var = this.w7APNrr0aGRc) == null) {
                    return;
                }
                defpackage.u11 u11Var = new defpackage.u11(c01Var2.fWTAfUmVKrZq);
                defpackage.v31 v31Var = new defpackage.v31();
                defpackage.t80.Jkfc0NcwyPL8(this, defpackage.o30.ZVVdXbWmyCSK, new defpackage.p30(new defpackage.fWTAfUmVKrZq(8, c01Var2, v31Var), 0));
                if (!v31Var.WDYagTQQm9ns) {
                    int i5 = defpackage.we.giKS3J6vZuNy;
                    android.view.ViewParent parent = defpackage.ma0.qjMheFZ0l9kA(this).getParent();
                    while (parent != null && (parent instanceof android.view.ViewGroup)) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                        if (!viewGroup.shouldDelayChildPressedState()) {
                            parent = viewGroup.getParent();
                        }
                    }
                    this.jjTN4uUnoyEn = u11Var;
                    defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.P05cfTpS5W5L(in0Var, u11Var, null, 2), 3);
                    return;
                }
                this.GcLuU6pT9wO9 = defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.e6mdH7fiFuta(in0Var, u11Var, this, klVar, 1), 3);
                return;
            }
            return;
        }
        java.util.List list2 = vz0Var.ZpBGe2uQfcn8;
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            if (!defpackage.j80.Ns0WNyEWdPsk((defpackage.c01) list2.get(i6))) {
                float max = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf.fhbmYuu9J3cT(((defpackage.cu1) defpackage.nq1.blKFvluuDQOf(this, defpackage.rj.ZVVdXbWmyCSK)).QiMR8OkAhezm()) >> 32)) - ((int) (j >> 32))) / 2.0f;
                long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (r1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(max) << 32);
                int size3 = list2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    defpackage.c01 c01Var3 = (defpackage.c01) list2.get(i7);
                    if (c01Var3.giKS3J6vZuNy() || defpackage.j80.blKFvluuDQOf(c01Var3, j, floatToRawIntBits)) {
                        jVUAPb5NnIYW(false);
                        return;
                    }
                }
                return;
            }
        }
        ((defpackage.c01) list2.get(0)).ZpBGe2uQfcn8();
        if (this.oCu53ZX2v4Ju) {
            defpackage.c01 c01Var4 = this.w6IV1lieBIux;
            c01Var4.getClass();
            iYH9ueRbBBFm(c01Var4.fWTAfUmVKrZq, false);
            this.dG7RjM6DqYVL.ZpBGe2uQfcn8();
        }
        this.w6IV1lieBIux = null;
    }

    public final void KN4muQto0Nd5() {
        defpackage.in0 in0Var = this.w7APNrr0aGRc;
        defpackage.kn0 kn0Var = this.frSwwKIlbUhK;
        if (in0Var != null) {
            defpackage.u11 u11Var = this.jjTN4uUnoyEn;
            if (u11Var != null) {
                in0Var.giKS3J6vZuNy(new defpackage.t11(u11Var));
            }
            defpackage.u11 u11Var2 = this.IBvW5fLsPuHy;
            if (u11Var2 != null) {
                in0Var.giKS3J6vZuNy(new defpackage.t11(u11Var2));
            }
            defpackage.t50 t50Var = this.Mearx7yMn90V;
            if (t50Var != null) {
                in0Var.giKS3J6vZuNy(new defpackage.u50(t50Var));
            }
            java.lang.Object[] objArr = kn0Var.fWTAfUmVKrZq;
            long[] jArr = kn0Var.ZpBGe2uQfcn8;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                in0Var.giKS3J6vZuNy(new defpackage.t11((defpackage.u11) objArr[(i << 3) + i3]));
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
        }
        this.jjTN4uUnoyEn = null;
        this.IBvW5fLsPuHy = null;
        this.Mearx7yMn90V = null;
        kn0Var.ZpBGe2uQfcn8();
    }

    @Override // defpackage.f01
    public final void LCK4GGEwbWAr() {
        defpackage.t50 t50Var;
        defpackage.in0 in0Var = this.w7APNrr0aGRc;
        if (in0Var != null && (t50Var = this.Mearx7yMn90V) != null) {
            in0Var.giKS3J6vZuNy(new defpackage.u50(t50Var));
        }
        this.Mearx7yMn90V = null;
        jVUAPb5NnIYW(false);
    }

    @Override // defpackage.ul0
    public final boolean RIHPIrzkudeW() {
        return false;
    }

    public final void VpXebusPOq9I() {
        if (this.qjMheFZ0l9kA != null) {
            return;
        }
        defpackage.c70 c70Var = this.IJ0hOnjhPOri ? this.blKFvluuDQOf : this.maCixPsq4ml2;
        if (c70Var != null) {
            if (this.w7APNrr0aGRc == null) {
                this.w7APNrr0aGRc = new defpackage.in0();
            }
            this.OcTWLQzke1i2.KN4muQto0Nd5(this.w7APNrr0aGRc);
            defpackage.in0 in0Var = this.w7APNrr0aGRc;
            in0Var.getClass();
            defpackage.wo ZpBGe2uQfcn8 = c70Var.ZpBGe2uQfcn8(in0Var);
            YZh1E3mnTFwf(ZpBGe2uQfcn8);
            this.qjMheFZ0l9kA = ZpBGe2uQfcn8;
        }
    }

    @Override // defpackage.rp1
    public final java.lang.Object WmetiUbpKU9I() {
        return this.xahdJg25P1Bv;
    }

    @Override // defpackage.ul0
    public final void ZEXjjCYihNTt() {
        hH0RRJrNssvh();
        if (!this.hH0RRJrNssvh) {
            VpXebusPOq9I();
        }
        if (this.oCu53ZX2v4Ju) {
            YZh1E3mnTFwf(this.OcTWLQzke1i2);
        }
    }

    @Override // defpackage.ul0
    public final void awuGf4qH8HFd() {
        KN4muQto0Nd5();
        if (this.BXaznwstz2U0 == null) {
            this.w7APNrr0aGRc = null;
        }
        defpackage.wo woVar = this.qjMheFZ0l9kA;
        if (woVar != null) {
            xbkEJUK1coRZ(woVar);
        }
        this.qjMheFZ0l9kA = null;
        defpackage.o30 o30Var = this.UmgHb6n58gfG;
        if (o30Var != null) {
            xbkEJUK1coRZ(o30Var);
        }
        this.UmgHb6n58gfG = null;
    }

    @Override // defpackage.r70
    public final void blKFvluuDQOf() {
        jVUAPb5NnIYW(true);
    }

    @Override // defpackage.zb0
    public final boolean fNwYGHIYeJcR(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ts0
    public final void hH0RRJrNssvh() {
        if (this.IJ0hOnjhPOri) {
            defpackage.wc1.CZa7MwI9IzLd(this, new defpackage.giKS3J6vZuNy(this, 0));
        }
    }

    public final void iYH9ueRbBBFm(long j, boolean z) {
        defpackage.in0 in0Var = this.w7APNrr0aGRc;
        if (in0Var != null) {
            defpackage.yf1 yf1Var = this.GcLuU6pT9wO9;
            if (yf1Var == null || !yf1Var.giKS3J6vZuNy()) {
                defpackage.u11 u11Var = z ? this.IBvW5fLsPuHy : this.jjTN4uUnoyEn;
                if (u11Var != null) {
                    defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.P05cfTpS5W5L(u11Var, in0Var, null), 3);
                }
            } else {
                yf1Var.JhCgjQRTAOCT(null);
                defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.QiMR8OkAhezm(yf1Var, j, in0Var, (defpackage.kl) null, 0), 3);
            }
            if (z) {
                this.IBvW5fLsPuHy = null;
            } else {
                this.jjTN4uUnoyEn = null;
            }
        }
    }

    public final void jVUAPb5NnIYW(boolean z) {
        defpackage.kl klVar = null;
        if (z) {
            this.zJPqDeoF0Os1 = null;
        } else {
            this.w6IV1lieBIux = null;
        }
        defpackage.in0 in0Var = this.w7APNrr0aGRc;
        if (in0Var != null) {
            defpackage.yf1 yf1Var = this.GcLuU6pT9wO9;
            if (yf1Var == null || !yf1Var.giKS3J6vZuNy()) {
                defpackage.u11 u11Var = z ? this.IBvW5fLsPuHy : this.jjTN4uUnoyEn;
                if (u11Var != null) {
                    defpackage.t11 t11Var = new defpackage.t11(u11Var);
                    defpackage.cb0 cb0Var = (defpackage.cb0) ((defpackage.jl) XuMcJunjB8iA()).WDYagTQQm9ns.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
                    defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.oh71FJcDz6S2(in0Var, t11Var, cb0Var != null ? cb0Var.ZVVdXbWmyCSK(new defpackage.fWTAfUmVKrZq(0, in0Var, t11Var)) : null, klVar, 0), 3);
                }
            } else {
                defpackage.yf1 yf1Var2 = this.GcLuU6pT9wO9;
                if (yf1Var2 != null) {
                    yf1Var2.JhCgjQRTAOCT(null);
                }
            }
            if (z) {
                this.IBvW5fLsPuHy = null;
            } else {
                this.jjTN4uUnoyEn = null;
            }
        }
    }

    @Override // defpackage.r70
    public final void jjTN4uUnoyEn(defpackage.x1 x1Var, defpackage.wz0 wz0Var) {
        defpackage.in0 in0Var;
        java.util.ArrayList arrayList = (java.util.ArrayList) x1Var.giKS3J6vZuNy;
        VpXebusPOq9I();
        if (this.oCu53ZX2v4Ju && this.UmgHb6n58gfG == null) {
            defpackage.o30 o30Var = new defpackage.o30(this);
            YZh1E3mnTFwf(o30Var);
            this.UmgHb6n58gfG = o30Var;
        }
        if (wz0Var != defpackage.wz0.oh71FJcDz6S2) {
            if (wz0Var != defpackage.wz0.QiMR8OkAhezm || this.zJPqDeoF0Os1 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                defpackage.h70 h70Var = (defpackage.h70) arrayList.get(i);
                if (h70Var.e6mdH7fiFuta && h70Var != this.zJPqDeoF0Os1) {
                    jVUAPb5NnIYW(true);
                    return;
                }
            }
            return;
        }
        defpackage.kl klVar = null;
        if (this.zJPqDeoF0Os1 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (defpackage.q70.Ns0WNyEWdPsk((defpackage.h70) arrayList.get(i2))) {
                    defpackage.h70 h70Var2 = (defpackage.h70) arrayList.get(0);
                    h70Var2.e6mdH7fiFuta = true;
                    this.zJPqDeoF0Os1 = h70Var2;
                    if (!this.oCu53ZX2v4Ju || (in0Var = this.w7APNrr0aGRc) == null) {
                        return;
                    }
                    defpackage.u11 u11Var = new defpackage.u11(h70Var2.fWTAfUmVKrZq);
                    defpackage.v31 v31Var = new defpackage.v31();
                    defpackage.t80.Jkfc0NcwyPL8(this, defpackage.o30.ZVVdXbWmyCSK, new defpackage.p30(new defpackage.fWTAfUmVKrZq(7, h70Var2, v31Var), 0));
                    if (!v31Var.WDYagTQQm9ns) {
                        int i3 = defpackage.we.giKS3J6vZuNy;
                        android.view.ViewParent parent = defpackage.ma0.qjMheFZ0l9kA(this).getParent();
                        while (parent != null && (parent instanceof android.view.ViewGroup)) {
                            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                            if (!viewGroup.shouldDelayChildPressedState()) {
                                parent = viewGroup.getParent();
                            }
                        }
                        this.IBvW5fLsPuHy = u11Var;
                        defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.P05cfTpS5W5L(in0Var, u11Var, null, 1), 3);
                        return;
                    }
                    this.GcLuU6pT9wO9 = defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.e6mdH7fiFuta(in0Var, u11Var, this, klVar, 0), 3);
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            defpackage.h70 h70Var3 = (defpackage.h70) arrayList.get(i4);
            if (h70Var3.e6mdH7fiFuta || !h70Var3.P05cfTpS5W5L || h70Var3.JhCgjQRTAOCT) {
                float JhCgjQRTAOCT = ((defpackage.cu1) defpackage.nq1.blKFvluuDQOf(this, defpackage.rj.ZVVdXbWmyCSK)).JhCgjQRTAOCT();
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    defpackage.h70 h70Var4 = (defpackage.h70) arrayList.get(i5);
                    long j = h70Var4.fWTAfUmVKrZq;
                    defpackage.h70 h70Var5 = this.zJPqDeoF0Os1;
                    h70Var5.getClass();
                    boolean z = java.lang.Math.abs(defpackage.ws0.fWTAfUmVKrZq(defpackage.ws0.JhCgjQRTAOCT(j, h70Var5.fWTAfUmVKrZq))) > JhCgjQRTAOCT;
                    if (h70Var4.e6mdH7fiFuta || z) {
                        jVUAPb5NnIYW(true);
                        return;
                    }
                }
                return;
            }
        }
        ((defpackage.h70) arrayList.get(0)).e6mdH7fiFuta = true;
        if (this.oCu53ZX2v4Ju) {
            defpackage.h70 h70Var6 = this.zJPqDeoF0Os1;
            h70Var6.getClass();
            iYH9ueRbBBFm(h70Var6.fWTAfUmVKrZq, true);
            this.dG7RjM6DqYVL.ZpBGe2uQfcn8();
        }
        this.zJPqDeoF0Os1 = null;
    }

    @Override // defpackage.hb1
    public final boolean lXYSMswtzmix() {
        return true;
    }

    @Override // defpackage.hb1
    public final void m6iZQUu7XjoL(defpackage.rb1 rb1Var) {
        java.lang.String str = this.VFeft99leXEK;
        defpackage.giKS3J6vZuNy giks3j6vzuny = new defpackage.giKS3J6vZuNy(this, 1);
        defpackage.qb0[] qb0VarArr = defpackage.pb1.ZpBGe2uQfcn8;
        rb1Var.ZpBGe2uQfcn8(defpackage.eb1.giKS3J6vZuNy, new defpackage.xahdJg25P1Bv(str, giks3j6vzuny));
        if (this.oCu53ZX2v4Ju) {
            this.OcTWLQzke1i2.m6iZQUu7XjoL(rb1Var);
        } else {
            rb1Var.ZpBGe2uQfcn8(defpackage.nb1.GE9mJIPrb8gP, defpackage.gs1.ZpBGe2uQfcn8);
        }
    }
}
