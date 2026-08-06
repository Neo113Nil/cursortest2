package defpackage;

/* loaded from: classes.dex */
public final class gy extends defpackage.lj0 implements defpackage.lh, defpackage.t90, defpackage.dq0, defpackage.oj0, defpackage.kn {
    public final defpackage.k00 EgCjBq0SZwJ;
    public final int V7bD7b8KA;
    public boolean fnWB2E7cs;
    public boolean kNAkVymC;

    public gy(int i, defpackage.k00 k00Var, int i2) {
        this.EgCjBq0SZwJ = (i2 & 4) != 0 ? null : k00Var;
        this.V7bD7b8KA = i;
    }

    public final void H6IrRhrpWoH(defpackage.fy fyVar, defpackage.fy fyVar2) {
        defpackage.ep0 ep0Var;
        defpackage.k00 k00Var;
        defpackage.cy cyVar = (defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner();
        defpackage.gy xiZrDbcSW0 = cyVar.xiZrDbcSW0();
        if (!fyVar.equals(fyVar2) && (k00Var = this.EgCjBq0SZwJ) != null) {
            k00Var.adDC3e2L(fyVar, fyVar2);
        }
        defpackage.lj0 lj0Var = this.adDC3e2L;
        if (!lj0Var.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
        }
        defpackage.lj0 lj0Var2 = this.adDC3e2L;
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
        while (D2vUnMij != null) {
            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 5120) != 0) {
                while (lj0Var2 != null) {
                    int i = lj0Var2.AARZUJiTa;
                    if ((i & 5120) != 0) {
                        if (lj0Var2 != lj0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            defpackage.lj0 lj0Var3 = lj0Var2;
                            defpackage.xl0 xl0Var = null;
                            while (lj0Var3 != null) {
                                if (lj0Var3 instanceof defpackage.u7) {
                                    defpackage.u7 u7Var = (defpackage.u7) lj0Var3;
                                    if (xiZrDbcSW0 == cyVar.xiZrDbcSW0()) {
                                        u7Var.H6IrRhrpWoH();
                                        throw null;
                                    }
                                } else if ((lj0Var3.AARZUJiTa & 4096) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                    int i2 = 0;
                                    for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                        if ((lj0Var4.AARZUJiTa & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                lj0Var3 = lj0Var4;
                                            } else {
                                                if (xl0Var == null) {
                                                    xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var3 != null) {
                                                    xl0Var.oh6vYeIP(lj0Var3);
                                                    lj0Var3 = null;
                                                }
                                                xl0Var.oh6vYeIP(lj0Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    lj0Var2 = lj0Var2.riuEU0zW4;
                }
            }
            D2vUnMij = D2vUnMij.V7bD7b8KA();
            lj0Var2 = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [lj0] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [lj0] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [xl0] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v27 */
    public final boolean UVjEelCZ() {
        defpackage.xl0 xl0Var;
        defpackage.ep0 ep0Var;
        defpackage.cy cyVar;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        defpackage.ep0 ep0Var2;
        int ordinal = defpackage.s21.WLpAkxCo(this).ordinal();
        if (ordinal == 0) {
            defpackage.cy cyVar2 = (defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner();
            defpackage.gy xiZrDbcSW0 = cyVar2.xiZrDbcSW0();
            defpackage.fy fzubgBFo = fzubgBFo();
            if (xiZrDbcSW0 == this) {
                H6IrRhrpWoH(fzubgBFo, fzubgBFo);
                return true;
            }
            if (xiZrDbcSW0 != null || ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner()).IHQe1A4L2xu.v5iciZok()) {
                if (xiZrDbcSW0 != null) {
                    xl0Var = new defpackage.xl0(new defpackage.gy[16]);
                    if (!xiZrDbcSW0.adDC3e2L.kd6TUFXn) {
                        defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                    }
                    defpackage.lj0 lj0Var = xiZrDbcSW0.adDC3e2L.riuEU0zW4;
                    defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(xiZrDbcSW0);
                    while (D2vUnMij != null) {
                        if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 1024) != 0) {
                            while (lj0Var != null) {
                                if ((lj0Var.AARZUJiTa & 1024) != 0) {
                                    defpackage.lj0 lj0Var2 = lj0Var;
                                    defpackage.xl0 xl0Var2 = null;
                                    while (lj0Var2 != null) {
                                        if (lj0Var2 instanceof defpackage.gy) {
                                            xl0Var.oh6vYeIP((defpackage.gy) lj0Var2);
                                        } else if ((lj0Var2.AARZUJiTa & 1024) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                            int i4 = 0;
                                            for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                                if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        lj0Var2 = lj0Var3;
                                                    } else {
                                                        if (xl0Var2 == null) {
                                                            xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
                                                        }
                                                        if (lj0Var2 != null) {
                                                            xl0Var2.oh6vYeIP(lj0Var2);
                                                            lj0Var2 = null;
                                                        }
                                                        xl0Var2.oh6vYeIP(lj0Var3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        lj0Var2 = defpackage.w70.riuEU0zW4(xl0Var2);
                                    }
                                }
                                lj0Var = lj0Var.riuEU0zW4;
                            }
                        }
                        D2vUnMij = D2vUnMij.V7bD7b8KA();
                        lj0Var = (D2vUnMij == null || (ep0Var2 = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var2.adDC3e2L;
                    }
                } else {
                    xl0Var = null;
                }
                defpackage.gy[] gyVarArr = new defpackage.gy[16];
                defpackage.gy[] gyVarArr2 = new defpackage.gy[16];
                if (!this.adDC3e2L.kd6TUFXn) {
                    defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                }
                defpackage.lj0 lj0Var4 = this.adDC3e2L.riuEU0zW4;
                defpackage.ma0 D2vUnMij2 = defpackage.w70.D2vUnMij(this);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = true;
                while (D2vUnMij2 != null) {
                    if ((D2vUnMij2.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 1024) != 0) {
                        while (lj0Var4 != null) {
                            if ((lj0Var4.AARZUJiTa & 1024) != 0) {
                                defpackage.gy gyVar = lj0Var4;
                                defpackage.xl0 xl0Var3 = null;
                                while (gyVar != 0) {
                                    if (gyVar instanceof defpackage.gy) {
                                        defpackage.gy gyVar2 = gyVar;
                                        if (defpackage.x70.QoRHpC4k(xl0Var != null ? java.lang.Boolean.valueOf(xl0Var.SH1y5HwkJhh(gyVar2)) : null, java.lang.Boolean.TRUE)) {
                                            int i7 = i5 + 1;
                                            if (gyVarArr.length < i7) {
                                                int length = gyVarArr.length;
                                                cyVar = cyVar2;
                                                ?? r1 = new java.lang.Object[java.lang.Math.max(i7, length * 2)];
                                                i3 = i7;
                                                java.lang.System.arraycopy(gyVarArr, 0, r1, 0, length);
                                                gyVarArr = r1;
                                            } else {
                                                cyVar = cyVar2;
                                                i3 = i7;
                                            }
                                            gyVarArr[i5] = gyVar2;
                                            i5 = i3;
                                        } else {
                                            cyVar = cyVar2;
                                            int i8 = i6 + 1;
                                            if (gyVarArr2.length < i8) {
                                                int length2 = gyVarArr2.length;
                                                ?? r52 = new java.lang.Object[java.lang.Math.max(i8, length2 * 2)];
                                                i2 = i8;
                                                java.lang.System.arraycopy(gyVarArr2, 0, r52, 0, length2);
                                                gyVarArr2 = r52;
                                            } else {
                                                i2 = i8;
                                            }
                                            gyVarArr2[i6] = gyVar2;
                                            i6 = i2;
                                        }
                                        if (gyVar2 == xiZrDbcSW0) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        cyVar = cyVar2;
                                        z = true;
                                    }
                                    if (z && (gyVar.AARZUJiTa & 1024) != 0 && (gyVar instanceof defpackage.ln)) {
                                        defpackage.lj0 lj0Var5 = gyVar.fnWB2E7cs;
                                        int i9 = 0;
                                        gyVar = gyVar;
                                        while (lj0Var5 != null) {
                                            if ((lj0Var5.AARZUJiTa & 1024) != 0) {
                                                int i10 = i9 + 1;
                                                if (i10 == 1) {
                                                    gyVar = lj0Var5;
                                                    i = i10;
                                                } else {
                                                    if (xl0Var3 == null) {
                                                        i = i10;
                                                        r5 = new defpackage.xl0(new defpackage.lj0[16]);
                                                    } else {
                                                        i = i10;
                                                        r5 = xl0Var3;
                                                    }
                                                    if (gyVar != 0) {
                                                        r5.oh6vYeIP(gyVar);
                                                        gyVar = 0;
                                                    }
                                                    r5.oh6vYeIP(lj0Var5);
                                                    xl0Var3 = r5;
                                                    gyVar = gyVar;
                                                }
                                                i9 = i;
                                            }
                                            lj0Var5 = lj0Var5.SH1y5HwkJhh;
                                            gyVar = gyVar;
                                        }
                                        if (i9 == 1) {
                                            cyVar2 = cyVar;
                                        }
                                    }
                                    gyVar = defpackage.w70.riuEU0zW4(xl0Var3);
                                    cyVar2 = cyVar;
                                }
                            }
                            lj0Var4 = lj0Var4.riuEU0zW4;
                            cyVar2 = cyVar2;
                        }
                    }
                    defpackage.cy cyVar3 = cyVar2;
                    D2vUnMij2 = D2vUnMij2.V7bD7b8KA();
                    lj0Var4 = (D2vUnMij2 == null || (ep0Var = D2vUnMij2.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                    cyVar2 = cyVar3;
                }
                defpackage.cy cyVar4 = cyVar2;
                if (!z2 || xiZrDbcSW0 == null || defpackage.s21.PAEGRtP0bX(xiZrDbcSW0, false)) {
                    defpackage.f70.V7bD7b8KA(this, new defpackage.s4(3, this));
                    int ordinal2 = fzubgBFo().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    defpackage.db.F7NU4MC0GW();
                                    return false;
                                }
                            }
                        }
                        ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner()).EXtogiMhuM(this);
                    }
                    defpackage.fy fyVar = defpackage.fy.AARZUJiTa;
                    defpackage.fy fyVar2 = defpackage.fy.adDC3e2L;
                    if (z2 && xiZrDbcSW0 != null) {
                        xiZrDbcSW0.H6IrRhrpWoH(fyVar2, fyVar);
                    }
                    defpackage.fy fyVar3 = defpackage.fy.xiZrDbcSW0;
                    if (xl0Var != null) {
                        int i11 = xl0Var.AARZUJiTa - 1;
                        java.lang.Object[] objArr = xl0Var.adDC3e2L;
                        if (i11 < objArr.length) {
                            while (i11 >= 0) {
                                defpackage.gy gyVar3 = (defpackage.gy) objArr[i11];
                                if (cyVar4.xiZrDbcSW0() != this) {
                                    break;
                                }
                                gyVar3.H6IrRhrpWoH(fyVar3, fyVar);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
                    if (i12 < gyVarArr2.length) {
                        while (i12 >= 0) {
                            defpackage.gy gyVar4 = gyVarArr2[i12];
                            if (cyVar4.xiZrDbcSW0() != this) {
                                break;
                            }
                            gyVar4.H6IrRhrpWoH(gyVar4 == xiZrDbcSW0 ? fyVar2 : fyVar, fyVar3);
                            i12--;
                        }
                    }
                    if (cyVar4.xiZrDbcSW0() == this) {
                        H6IrRhrpWoH(fzubgBFo, fyVar2);
                        if (cyVar4.xiZrDbcSW0() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                defpackage.db.F7NU4MC0GW();
                return false;
            }
        }
        return false;
    }

    public final defpackage.kz0 WnQbjbWuMR(defpackage.v90 v90Var) {
        defpackage.kz0 kz0Var = pm90rNzI5F().JlrlGoKF;
        return kz0Var != defpackage.n.XZx205DYe ? v90Var == null ? kz0Var : kz0Var.adDC3e2L(v90Var.D2vUnMij(defpackage.w70.v5iciZok(this), 0L)) : v90Var != null ? v90Var.wll2JLbTBC2(defpackage.w70.v5iciZok(this), false) : defpackage.j70.r1MBDhnF(0L, defpackage.j70.frpfPPIgqM9O(defpackage.w70.v5iciZok(this).AARZUJiTa));
    }

    public final boolean XkvoyZRg(int i) {
        android.os.Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return pm90rNzI5F().IHQe1A4L2xu ? UVjEelCZ() : defpackage.s70.fnWB2E7cs(this, i, new defpackage.vs0(i));
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // defpackage.lj0
    public final boolean ZNF7fheNE() {
        return false;
    }

    public final defpackage.fy fzubgBFo() {
        defpackage.ep0 ep0Var;
        boolean z = this.kd6TUFXn;
        defpackage.fy fyVar = defpackage.fy.AARZUJiTa;
        if (!z) {
            return fyVar;
        }
        defpackage.gy xiZrDbcSW0 = ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner()).xiZrDbcSW0();
        if (xiZrDbcSW0 == null) {
            return fyVar;
        }
        if (this == xiZrDbcSW0) {
            return defpackage.fy.adDC3e2L;
        }
        if (xiZrDbcSW0.kd6TUFXn) {
            if (!xiZrDbcSW0.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var = xiZrDbcSW0.adDC3e2L.riuEU0zW4;
            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(xiZrDbcSW0);
            while (D2vUnMij != null) {
                if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 1024) != 0) {
                    while (lj0Var != null) {
                        if ((lj0Var.AARZUJiTa & 1024) != 0) {
                            defpackage.lj0 lj0Var2 = lj0Var;
                            defpackage.xl0 xl0Var = null;
                            while (lj0Var2 != null) {
                                if (lj0Var2 instanceof defpackage.gy) {
                                    if (this == ((defpackage.gy) lj0Var2)) {
                                        return defpackage.fy.xiZrDbcSW0;
                                    }
                                } else if ((lj0Var2.AARZUJiTa & 1024) != 0 && (lj0Var2 instanceof defpackage.ln)) {
                                    int i = 0;
                                    for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var2).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                        if ((lj0Var3.AARZUJiTa & 1024) != 0) {
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
                        lj0Var = lj0Var.riuEU0zW4;
                    }
                }
                D2vUnMij = D2vUnMij.V7bD7b8KA();
                lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
            }
        }
        return fyVar;
    }

    @Override // defpackage.lj0
    public final void juTJww2r() {
        if (fzubgBFo().IHQe1A4L2xu()) {
            ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner()).oh6vYeIP(8, true, true);
        }
    }

    @Override // defpackage.dq0
    public final void nBH8hAHy() {
        xp7x2U2iUl();
    }

    public final defpackage.dy pm90rNzI5F() {
        boolean z;
        defpackage.ep0 ep0Var;
        defpackage.dy dyVar = new defpackage.dy();
        dyVar.IHQe1A4L2xu = true;
        defpackage.ey eyVar = defpackage.ey.oh6vYeIP;
        dyVar.oh6vYeIP = eyVar;
        dyVar.r1MBDhnF = eyVar;
        dyVar.F7NU4MC0GW = eyVar;
        dyVar.adDC3e2L = eyVar;
        dyVar.xiZrDbcSW0 = eyVar;
        dyVar.AARZUJiTa = eyVar;
        dyVar.EXtogiMhuM = eyVar;
        dyVar.riuEU0zW4 = eyVar;
        dyVar.SH1y5HwkJhh = defpackage.q0.V7bD7b8KA;
        dyVar.ez2rX8ReCYw = defpackage.q0.PAEGRtP0bX;
        dyVar.JlrlGoKF = defpackage.n.XZx205DYe;
        int i = this.V7bD7b8KA;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((defpackage.f60) ((defpackage.h60) ((defpackage.g60) defpackage.mj1.abhbClRa(this, defpackage.ph.DFo87pBq1E5))).IHQe1A4L2xu.getValue()).IHQe1A4L2xu == 1);
        } else {
            if (i != 2) {
                defpackage.db.AARZUJiTa("Unknown Focusability");
                return null;
            }
            z = false;
        }
        dyVar.IHQe1A4L2xu = z;
        defpackage.lj0 lj0Var = this.adDC3e2L;
        if (!lj0Var.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
        }
        defpackage.lj0 lj0Var2 = this.adDC3e2L;
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
        loop0: while (D2vUnMij != null) {
            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 3072) != 0) {
                while (lj0Var2 != null) {
                    int i2 = lj0Var2.AARZUJiTa;
                    if ((i2 & 3072) != 0) {
                        if (lj0Var2 != lj0Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            defpackage.xl0 xl0Var = null;
                            defpackage.lj0 lj0Var3 = lj0Var2;
                            while (lj0Var3 != null) {
                                if (lj0Var3 instanceof defpackage.u7) {
                                    defpackage.kj0 kj0Var = ((defpackage.u7) lj0Var3).EgCjBq0SZwJ;
                                    defpackage.x50.oh6vYeIP("applyFocusProperties called on wrong node");
                                    kj0Var.getClass();
                                    defpackage.db.kd6TUFXn();
                                    return null;
                                }
                                if ((lj0Var3.AARZUJiTa & 2048) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                    int i3 = 0;
                                    for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                        if ((lj0Var4.AARZUJiTa & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                lj0Var3 = lj0Var4;
                                            } else {
                                                if (xl0Var == null) {
                                                    xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var3 != null) {
                                                    xl0Var.oh6vYeIP(lj0Var3);
                                                    lj0Var3 = null;
                                                }
                                                xl0Var.oh6vYeIP(lj0Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    lj0Var2 = lj0Var2.riuEU0zW4;
                }
            }
            D2vUnMij = D2vUnMij.V7bD7b8KA();
            lj0Var2 = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
        }
        return dyVar;
    }

    public final defpackage.mb0 uLnPvzwk() {
        defpackage.ep0 ep0Var;
        java.lang.Object obj;
        if (!this.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
        }
        defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this);
        while (true) {
            if (D2vUnMij == null) {
                break;
            }
            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 8388640) != 0) {
                while (lj0Var != null) {
                    int i = lj0Var.AARZUJiTa;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(lj0Var instanceof defpackage.mb0)) {
                                if (lj0Var instanceof defpackage.ln) {
                                    lj0Var = null;
                                    for (defpackage.lj0 lj0Var2 = ((defpackage.ln) lj0Var).fnWB2E7cs; lj0Var2 != null; lj0Var2 = lj0Var2.SH1y5HwkJhh) {
                                        if (lj0Var2 instanceof defpackage.mb0) {
                                            lj0Var = lj0Var2;
                                        }
                                    }
                                } else {
                                    lj0Var = null;
                                }
                            }
                            defpackage.mb0 mb0Var = (defpackage.mb0) lj0Var;
                            if (mb0Var != null) {
                                return mb0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (lj0Var instanceof defpackage.oj0) {
                                obj = lj0Var;
                            } else if (lj0Var instanceof defpackage.ln) {
                                obj = null;
                                for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                    if (lj0Var3 instanceof defpackage.oj0) {
                                        obj = lj0Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            defpackage.oj0 oj0Var = (defpackage.oj0) obj;
                            if (oj0Var != null) {
                                oj0Var.AARZUJiTa();
                            }
                        }
                    }
                    lj0Var = lj0Var.riuEU0zW4;
                }
            }
            D2vUnMij = D2vUnMij.V7bD7b8KA();
            lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
        }
        return null;
    }

    public final void xp7x2U2iUl() {
        int ordinal = fzubgBFo().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                defpackage.db.F7NU4MC0GW();
                return;
            }
        }
        defpackage.rz0 rz0Var = new defpackage.rz0();
        defpackage.f70.V7bD7b8KA(this, new defpackage.o0(4, rz0Var, this));
        java.lang.Object obj = rz0Var.adDC3e2L;
        if (obj == null) {
            defpackage.x70.Ye0N2xE9Hc("focusProperties");
            throw null;
        }
        if (((defpackage.dy) obj).IHQe1A4L2xu) {
            return;
        }
        ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner()).oh6vYeIP(8, true, true);
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        int ordinal = fzubgBFo().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner();
                defpackage.mj1.C0U8sNJm(this);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                defpackage.db.F7NU4MC0GW();
                return;
            }
        }
        defpackage.cy cyVar = (defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getFocusOwner();
        cyVar.oh6vYeIP(8, true, false);
        cyVar.F7NU4MC0GW.IHQe1A4L2xu();
    }

    @Override // defpackage.t90
    public final void ez2rX8ReCYw(defpackage.v90 v90Var) {
    }
}
