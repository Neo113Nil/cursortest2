package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nz extends defpackage.ul0 implements defpackage.mj, defpackage.pc0, defpackage.ts0, defpackage.xl0, defpackage.wo {
    public final defpackage.c20 BHfvd2J71qpO;
    public boolean ZVVdXbWmyCSK;
    public final int maCixPsq4ml2;
    public boolean w7APNrr0aGRc;

    public nz(int i, defpackage.c20 c20Var, int i2) {
        this.BHfvd2J71qpO = (i2 & 4) != 0 ? null : c20Var;
        this.maCixPsq4ml2 = i;
    }

    public final defpackage.hz I9id0xDxCgYV() {
        boolean z;
        defpackage.or0 or0Var;
        defpackage.hz hzVar = new defpackage.hz();
        hzVar.ZpBGe2uQfcn8 = true;
        defpackage.iz izVar = defpackage.iz.giKS3J6vZuNy;
        hzVar.giKS3J6vZuNy = izVar;
        hzVar.fWTAfUmVKrZq = izVar;
        hzVar.JhCgjQRTAOCT = izVar;
        hzVar.WDYagTQQm9ns = izVar;
        hzVar.oh71FJcDz6S2 = izVar;
        hzVar.QiMR8OkAhezm = izVar;
        hzVar.P05cfTpS5W5L = izVar;
        hzVar.e6mdH7fiFuta = izVar;
        hzVar.GE9mJIPrb8gP = defpackage.n.dG7RjM6DqYVL;
        hzVar.Ns0WNyEWdPsk = defpackage.n.OcTWLQzke1i2;
        hzVar.fNwYGHIYeJcR = defpackage.jVUAPb5NnIYW.GcLuU6pT9wO9;
        int i = this.maCixPsq4ml2;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((defpackage.p80) ((defpackage.r80) ((defpackage.q80) defpackage.nq1.blKFvluuDQOf(this, defpackage.rj.h3m55N1URyyK))).ZpBGe2uQfcn8.getValue()).ZpBGe2uQfcn8 == 1);
        } else {
            if (i != 2) {
                defpackage.h7.P05cfTpS5W5L("Unknown Focusability");
                return null;
            }
            z = false;
        }
        hzVar.ZpBGe2uQfcn8 = z;
        defpackage.ul0 ul0Var = this.WDYagTQQm9ns;
        if (!ul0Var.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
        }
        defpackage.ul0 ul0Var2 = this.WDYagTQQm9ns;
        defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(this);
        loop0: while (UmgHb6n58gfG != null) {
            if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 3072) != 0) {
                while (ul0Var2 != null) {
                    int i2 = ul0Var2.QiMR8OkAhezm;
                    if ((i2 & 3072) != 0) {
                        if (ul0Var2 != ul0Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            defpackage.ho0 ho0Var = null;
                            defpackage.ul0 ul0Var3 = ul0Var2;
                            while (ul0Var3 != null) {
                                if (ul0Var3 instanceof defpackage.l9) {
                                    defpackage.tl0 tl0Var = ((defpackage.l9) ul0Var3).BHfvd2J71qpO;
                                    defpackage.e80.giKS3J6vZuNy("applyFocusProperties called on wrong node");
                                    tl0Var.getClass();
                                    defpackage.p81.ZpBGe2uQfcn8();
                                    return null;
                                }
                                if ((ul0Var3.QiMR8OkAhezm & 2048) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                    int i3 = 0;
                                    for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                        if ((ul0Var4.QiMR8OkAhezm & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                ul0Var3 = ul0Var4;
                                            } else {
                                                if (ho0Var == null) {
                                                    ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
                                                }
                                                if (ul0Var3 != null) {
                                                    ho0Var.giKS3J6vZuNy(ul0Var3);
                                                    ul0Var3 = null;
                                                }
                                                ho0Var.giKS3J6vZuNy(ul0Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ul0Var3 = defpackage.la0.P05cfTpS5W5L(ho0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    ul0Var2 = ul0Var2.e6mdH7fiFuta;
                }
            }
            UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
            ul0Var2 = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
        }
        return hzVar;
    }

    public final boolean JtSMNguZxnYf(int i) {
        android.os.Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return I9id0xDxCgYV().ZpBGe2uQfcn8 ? YZh1E3mnTFwf() : defpackage.wc1.IJ0hOnjhPOri(this, i, new defpackage.qv0(i));
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final defpackage.ie0 KN4muQto0Nd5() {
        defpackage.or0 or0Var;
        java.lang.Object obj;
        if (!this.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
        }
        defpackage.ul0 ul0Var = this.WDYagTQQm9ns.e6mdH7fiFuta;
        defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(this);
        while (true) {
            if (UmgHb6n58gfG == null) {
                break;
            }
            if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 8388640) != 0) {
                while (ul0Var != null) {
                    int i = ul0Var.QiMR8OkAhezm;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(ul0Var instanceof defpackage.ie0)) {
                                if (ul0Var instanceof defpackage.xo) {
                                    ul0Var = null;
                                    for (defpackage.ul0 ul0Var2 = ((defpackage.xo) ul0Var).ZVVdXbWmyCSK; ul0Var2 != null; ul0Var2 = ul0Var2.GE9mJIPrb8gP) {
                                        if (ul0Var2 instanceof defpackage.ie0) {
                                            ul0Var = ul0Var2;
                                        }
                                    }
                                } else {
                                    ul0Var = null;
                                }
                            }
                            defpackage.ie0 ie0Var = (defpackage.ie0) ul0Var;
                            if (ie0Var != null) {
                                return ie0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (ul0Var instanceof defpackage.xl0) {
                                obj = ul0Var;
                            } else if (ul0Var instanceof defpackage.xo) {
                                obj = null;
                                for (defpackage.ul0 ul0Var3 = ((defpackage.xo) ul0Var).ZVVdXbWmyCSK; ul0Var3 != null; ul0Var3 = ul0Var3.GE9mJIPrb8gP) {
                                    if (ul0Var3 instanceof defpackage.xl0) {
                                        obj = ul0Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            defpackage.xl0 xl0Var = (defpackage.xl0) obj;
                            if (xl0Var != null) {
                                xl0Var.Ns0WNyEWdPsk();
                            }
                        }
                    }
                    ul0Var = ul0Var.e6mdH7fiFuta;
                }
            }
            UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
            ul0Var = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
        }
        return null;
    }

    @Override // defpackage.ul0
    public final boolean RIHPIrzkudeW() {
        return false;
    }

    public final void VpXebusPOq9I() {
        int ordinal = iYH9ueRbBBFm().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
        }
        defpackage.z31 z31Var = new defpackage.z31();
        defpackage.wc1.CZa7MwI9IzLd(this, new defpackage.l(4, z31Var, this));
        java.lang.Object obj = z31Var.WDYagTQQm9ns;
        if (obj == null) {
            defpackage.ma0.hH0RRJrNssvh("focusProperties");
            throw null;
        }
        if (((defpackage.hz) obj).ZpBGe2uQfcn8) {
            return;
        }
        ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner()).giKS3J6vZuNy(8, true, true);
    }

    @Override // defpackage.ul0
    public final void Wx2ec0FCRg9J() {
        if (iYH9ueRbBBFm().ZpBGe2uQfcn8()) {
            ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner()).giKS3J6vZuNy(8, true, true);
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
    /* JADX WARN: Type inference failed for: r15v7, types: [ul0] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [ul0] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [ho0] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v27 */
    public final boolean YZh1E3mnTFwf() {
        defpackage.ho0 ho0Var;
        defpackage.or0 or0Var;
        defpackage.gz gzVar;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        defpackage.or0 or0Var2;
        int ordinal = defpackage.vx1.qjMheFZ0l9kA(this).ordinal();
        if (ordinal == 0) {
            defpackage.gz gzVar2 = (defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner();
            defpackage.nz oh71FJcDz6S2 = gzVar2.oh71FJcDz6S2();
            defpackage.mz iYH9ueRbBBFm = iYH9ueRbBBFm();
            if (oh71FJcDz6S2 == this) {
                xbkEJUK1coRZ(iYH9ueRbBBFm, iYH9ueRbBBFm);
                return true;
            }
            if (oh71FJcDz6S2 != null || ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner()).ZpBGe2uQfcn8.jjTN4uUnoyEn()) {
                if (oh71FJcDz6S2 != null) {
                    ho0Var = new defpackage.ho0(new defpackage.nz[16]);
                    if (!oh71FJcDz6S2.WDYagTQQm9ns.s0TASMVLSWD5) {
                        defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
                    }
                    defpackage.ul0 ul0Var = oh71FJcDz6S2.WDYagTQQm9ns.e6mdH7fiFuta;
                    defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(oh71FJcDz6S2);
                    while (UmgHb6n58gfG != null) {
                        if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 1024) != 0) {
                            while (ul0Var != null) {
                                if ((ul0Var.QiMR8OkAhezm & 1024) != 0) {
                                    defpackage.ul0 ul0Var2 = ul0Var;
                                    defpackage.ho0 ho0Var2 = null;
                                    while (ul0Var2 != null) {
                                        if (ul0Var2 instanceof defpackage.nz) {
                                            ho0Var.giKS3J6vZuNy((defpackage.nz) ul0Var2);
                                        } else if ((ul0Var2.QiMR8OkAhezm & 1024) != 0 && (ul0Var2 instanceof defpackage.xo)) {
                                            int i4 = 0;
                                            for (defpackage.ul0 ul0Var3 = ((defpackage.xo) ul0Var2).ZVVdXbWmyCSK; ul0Var3 != null; ul0Var3 = ul0Var3.GE9mJIPrb8gP) {
                                                if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        ul0Var2 = ul0Var3;
                                                    } else {
                                                        if (ho0Var2 == null) {
                                                            ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
                                                        }
                                                        if (ul0Var2 != null) {
                                                            ho0Var2.giKS3J6vZuNy(ul0Var2);
                                                            ul0Var2 = null;
                                                        }
                                                        ho0Var2.giKS3J6vZuNy(ul0Var3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        ul0Var2 = defpackage.la0.P05cfTpS5W5L(ho0Var2);
                                    }
                                }
                                ul0Var = ul0Var.e6mdH7fiFuta;
                            }
                        }
                        UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
                        ul0Var = (UmgHb6n58gfG == null || (or0Var2 = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var2.WDYagTQQm9ns;
                    }
                } else {
                    ho0Var = null;
                }
                defpackage.nz[] nzVarArr = new defpackage.nz[16];
                defpackage.nz[] nzVarArr2 = new defpackage.nz[16];
                if (!this.WDYagTQQm9ns.s0TASMVLSWD5) {
                    defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
                }
                defpackage.ul0 ul0Var4 = this.WDYagTQQm9ns.e6mdH7fiFuta;
                defpackage.jd0 UmgHb6n58gfG2 = defpackage.la0.UmgHb6n58gfG(this);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = true;
                while (UmgHb6n58gfG2 != null) {
                    if ((UmgHb6n58gfG2.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 1024) != 0) {
                        while (ul0Var4 != null) {
                            if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                defpackage.nz nzVar = ul0Var4;
                                defpackage.ho0 ho0Var3 = null;
                                while (nzVar != 0) {
                                    if (nzVar instanceof defpackage.nz) {
                                        defpackage.nz nzVar2 = nzVar;
                                        if (defpackage.ma0.QiMR8OkAhezm(ho0Var != null ? java.lang.Boolean.valueOf(ho0Var.GE9mJIPrb8gP(nzVar2)) : null, java.lang.Boolean.TRUE)) {
                                            int i7 = i5 + 1;
                                            if (nzVarArr.length < i7) {
                                                int length = nzVarArr.length;
                                                gzVar = gzVar2;
                                                ?? r1 = new java.lang.Object[java.lang.Math.max(i7, length * 2)];
                                                i3 = i7;
                                                java.lang.System.arraycopy(nzVarArr, 0, r1, 0, length);
                                                nzVarArr = r1;
                                            } else {
                                                gzVar = gzVar2;
                                                i3 = i7;
                                            }
                                            nzVarArr[i5] = nzVar2;
                                            i5 = i3;
                                        } else {
                                            gzVar = gzVar2;
                                            int i8 = i6 + 1;
                                            if (nzVarArr2.length < i8) {
                                                int length2 = nzVarArr2.length;
                                                ?? r52 = new java.lang.Object[java.lang.Math.max(i8, length2 * 2)];
                                                i2 = i8;
                                                java.lang.System.arraycopy(nzVarArr2, 0, r52, 0, length2);
                                                nzVarArr2 = r52;
                                            } else {
                                                i2 = i8;
                                            }
                                            nzVarArr2[i6] = nzVar2;
                                            i6 = i2;
                                        }
                                        if (nzVar2 == oh71FJcDz6S2) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        gzVar = gzVar2;
                                        z = true;
                                    }
                                    if (z && (nzVar.QiMR8OkAhezm & 1024) != 0 && (nzVar instanceof defpackage.xo)) {
                                        defpackage.ul0 ul0Var5 = nzVar.ZVVdXbWmyCSK;
                                        int i9 = 0;
                                        nzVar = nzVar;
                                        while (ul0Var5 != null) {
                                            if ((ul0Var5.QiMR8OkAhezm & 1024) != 0) {
                                                int i10 = i9 + 1;
                                                if (i10 == 1) {
                                                    nzVar = ul0Var5;
                                                    i = i10;
                                                } else {
                                                    if (ho0Var3 == null) {
                                                        i = i10;
                                                        r5 = new defpackage.ho0(new defpackage.ul0[16]);
                                                    } else {
                                                        i = i10;
                                                        r5 = ho0Var3;
                                                    }
                                                    if (nzVar != 0) {
                                                        r5.giKS3J6vZuNy(nzVar);
                                                        nzVar = 0;
                                                    }
                                                    r5.giKS3J6vZuNy(ul0Var5);
                                                    ho0Var3 = r5;
                                                    nzVar = nzVar;
                                                }
                                                i9 = i;
                                            }
                                            ul0Var5 = ul0Var5.GE9mJIPrb8gP;
                                            nzVar = nzVar;
                                        }
                                        if (i9 == 1) {
                                            gzVar2 = gzVar;
                                        }
                                    }
                                    nzVar = defpackage.la0.P05cfTpS5W5L(ho0Var3);
                                    gzVar2 = gzVar;
                                }
                            }
                            ul0Var4 = ul0Var4.e6mdH7fiFuta;
                            gzVar2 = gzVar2;
                        }
                    }
                    defpackage.gz gzVar3 = gzVar2;
                    UmgHb6n58gfG2 = UmgHb6n58gfG2.w7APNrr0aGRc();
                    ul0Var4 = (UmgHb6n58gfG2 == null || (or0Var = UmgHb6n58gfG2.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
                    gzVar2 = gzVar3;
                }
                defpackage.gz gzVar4 = gzVar2;
                if (!z2 || oh71FJcDz6S2 == null || defpackage.vx1.gUjdnLbkVAaA(oh71FJcDz6S2, false)) {
                    defpackage.wc1.CZa7MwI9IzLd(this, new defpackage.w2(4, this));
                    int ordinal2 = iYH9ueRbBBFm().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    defpackage.h7.T1fB7bDYiVJQ();
                                    return false;
                                }
                            }
                        }
                        ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner()).e6mdH7fiFuta(this);
                    }
                    defpackage.mz mzVar = defpackage.mz.QiMR8OkAhezm;
                    defpackage.mz mzVar2 = defpackage.mz.WDYagTQQm9ns;
                    if (z2 && oh71FJcDz6S2 != null) {
                        oh71FJcDz6S2.xbkEJUK1coRZ(mzVar2, mzVar);
                    }
                    defpackage.mz mzVar3 = defpackage.mz.oh71FJcDz6S2;
                    if (ho0Var != null) {
                        int i11 = ho0Var.QiMR8OkAhezm - 1;
                        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
                        if (i11 < objArr.length) {
                            while (i11 >= 0) {
                                defpackage.nz nzVar3 = (defpackage.nz) objArr[i11];
                                if (gzVar4.oh71FJcDz6S2() != this) {
                                    break;
                                }
                                nzVar3.xbkEJUK1coRZ(mzVar3, mzVar);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
                    if (i12 < nzVarArr2.length) {
                        while (i12 >= 0) {
                            defpackage.nz nzVar4 = nzVarArr2[i12];
                            if (gzVar4.oh71FJcDz6S2() != this) {
                                break;
                            }
                            nzVar4.xbkEJUK1coRZ(nzVar4 == oh71FJcDz6S2 ? mzVar2 : mzVar, mzVar3);
                            i12--;
                        }
                    }
                    if (gzVar4.oh71FJcDz6S2() == this) {
                        xbkEJUK1coRZ(iYH9ueRbBBFm, mzVar2);
                        if (gzVar4.oh71FJcDz6S2() != this) {
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
                defpackage.h7.T1fB7bDYiVJQ();
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.ul0
    public final void awuGf4qH8HFd() {
        int ordinal = iYH9ueRbBBFm().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner();
                defpackage.h0.IJ0hOnjhPOri(this);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
        }
        defpackage.gz gzVar = (defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner();
        gzVar.giKS3J6vZuNy(8, true, false);
        gzVar.JhCgjQRTAOCT.ZpBGe2uQfcn8();
    }

    @Override // defpackage.ts0
    public final void hH0RRJrNssvh() {
        VpXebusPOq9I();
    }

    public final defpackage.mz iYH9ueRbBBFm() {
        defpackage.or0 or0Var;
        boolean z = this.s0TASMVLSWD5;
        defpackage.mz mzVar = defpackage.mz.QiMR8OkAhezm;
        if (!z) {
            return mzVar;
        }
        defpackage.nz oh71FJcDz6S2 = ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner()).oh71FJcDz6S2();
        if (oh71FJcDz6S2 == null) {
            return mzVar;
        }
        if (this == oh71FJcDz6S2) {
            return defpackage.mz.WDYagTQQm9ns;
        }
        if (oh71FJcDz6S2.s0TASMVLSWD5) {
            if (!oh71FJcDz6S2.WDYagTQQm9ns.s0TASMVLSWD5) {
                defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
            }
            defpackage.ul0 ul0Var = oh71FJcDz6S2.WDYagTQQm9ns.e6mdH7fiFuta;
            defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(oh71FJcDz6S2);
            while (UmgHb6n58gfG != null) {
                if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 1024) != 0) {
                    while (ul0Var != null) {
                        if ((ul0Var.QiMR8OkAhezm & 1024) != 0) {
                            defpackage.ul0 ul0Var2 = ul0Var;
                            defpackage.ho0 ho0Var = null;
                            while (ul0Var2 != null) {
                                if (ul0Var2 instanceof defpackage.nz) {
                                    if (this == ((defpackage.nz) ul0Var2)) {
                                        return defpackage.mz.oh71FJcDz6S2;
                                    }
                                } else if ((ul0Var2.QiMR8OkAhezm & 1024) != 0 && (ul0Var2 instanceof defpackage.xo)) {
                                    int i = 0;
                                    for (defpackage.ul0 ul0Var3 = ((defpackage.xo) ul0Var2).ZVVdXbWmyCSK; ul0Var3 != null; ul0Var3 = ul0Var3.GE9mJIPrb8gP) {
                                        if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                ul0Var2 = ul0Var3;
                                            } else {
                                                if (ho0Var == null) {
                                                    ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
                                                }
                                                if (ul0Var2 != null) {
                                                    ho0Var.giKS3J6vZuNy(ul0Var2);
                                                    ul0Var2 = null;
                                                }
                                                ho0Var.giKS3J6vZuNy(ul0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                ul0Var2 = defpackage.la0.P05cfTpS5W5L(ho0Var);
                            }
                        }
                        ul0Var = ul0Var.e6mdH7fiFuta;
                    }
                }
                UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
                ul0Var = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
            }
        }
        return mzVar;
    }

    public final defpackage.s31 jVUAPb5NnIYW(defpackage.rc0 rc0Var) {
        defpackage.s31 s31Var = I9id0xDxCgYV().fNwYGHIYeJcR;
        return s31Var != defpackage.jVUAPb5NnIYW.GcLuU6pT9wO9 ? rc0Var == null ? s31Var : s31Var.e6mdH7fiFuta(rc0Var.jjTN4uUnoyEn(defpackage.la0.blKFvluuDQOf(this), 0L)) : rc0Var != null ? rc0Var.hH0RRJrNssvh(defpackage.la0.blKFvluuDQOf(this), false) : defpackage.n70.oh71FJcDz6S2(0L, defpackage.w60.EPEWHACkMcF1(defpackage.la0.blKFvluuDQOf(this).QiMR8OkAhezm));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [ul0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ul0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ho0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ho0] */
    public final void xbkEJUK1coRZ(defpackage.mz mzVar, defpackage.mz mzVar2) {
        defpackage.or0 or0Var;
        defpackage.c20 c20Var;
        defpackage.gz gzVar = (defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getFocusOwner();
        defpackage.nz oh71FJcDz6S2 = gzVar.oh71FJcDz6S2();
        if (!mzVar.equals(mzVar2) && (c20Var = this.BHfvd2J71qpO) != null) {
            c20Var.QiMR8OkAhezm(mzVar, mzVar2);
        }
        defpackage.ul0 ul0Var = this.WDYagTQQm9ns;
        if (!ul0Var.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
        }
        defpackage.ul0 ul0Var2 = this.WDYagTQQm9ns;
        defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(this);
        while (UmgHb6n58gfG != null) {
            if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 5120) != 0) {
                while (ul0Var2 != null) {
                    int i = ul0Var2.QiMR8OkAhezm;
                    if ((i & 5120) != 0) {
                        if (ul0Var2 != ul0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            defpackage.xo xoVar = ul0Var2;
                            ?? r5 = 0;
                            while (xoVar != 0) {
                                if (xoVar instanceof defpackage.xy) {
                                    defpackage.xy xyVar = (defpackage.xy) xoVar;
                                    if (oh71FJcDz6S2 == gzVar.oh71FJcDz6S2()) {
                                        xyVar.z16KqenTjq8o(mzVar2);
                                    }
                                } else if ((xoVar.QiMR8OkAhezm & 4096) != 0 && (xoVar instanceof defpackage.xo)) {
                                    defpackage.ul0 ul0Var3 = xoVar.ZVVdXbWmyCSK;
                                    int i2 = 0;
                                    xoVar = xoVar;
                                    r5 = r5;
                                    while (ul0Var3 != null) {
                                        if ((ul0Var3.QiMR8OkAhezm & 4096) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                xoVar = ul0Var3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new defpackage.ho0(new defpackage.ul0[16]);
                                                }
                                                if (xoVar != 0) {
                                                    r5.giKS3J6vZuNy(xoVar);
                                                    xoVar = 0;
                                                }
                                                r5.giKS3J6vZuNy(ul0Var3);
                                            }
                                        }
                                        ul0Var3 = ul0Var3.GE9mJIPrb8gP;
                                        xoVar = xoVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                xoVar = defpackage.la0.P05cfTpS5W5L(r5);
                            }
                        }
                    }
                    ul0Var2 = ul0Var2.e6mdH7fiFuta;
                }
            }
            UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
            ul0Var2 = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
        }
    }

    @Override // defpackage.pc0
    public final void XntWc4eZSQ8j(defpackage.rc0 rc0Var) {
    }
}
