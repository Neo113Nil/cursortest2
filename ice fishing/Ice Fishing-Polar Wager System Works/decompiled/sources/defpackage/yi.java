package defpackage;

/* loaded from: classes.dex */
public final class yi extends defpackage.lj0 implements defpackage.lh, defpackage.t90 {
    public defpackage.ks0 EgCjBq0SZwJ;
    public boolean QQUzIjv3iOC5;
    public final defpackage.w51 V7bD7b8KA;
    public boolean abhbClRa;
    public final defpackage.i61 fnWB2E7cs;
    public boolean kNAkVymC;
    public final defpackage.f9 PAEGRtP0bX = new defpackage.f9(0);
    public long NHJTzaLwkd = 0;

    public yi(defpackage.ks0 ks0Var, defpackage.i61 i61Var, boolean z, defpackage.w51 w51Var) {
        this.EgCjBq0SZwJ = ks0Var;
        this.fnWB2E7cs = i61Var;
        this.kNAkVymC = z;
        this.V7bD7b8KA = w51Var;
    }

    public static boolean H6IrRhrpWoH(defpackage.yi yiVar, defpackage.kz0 kz0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = yiVar.NHJTzaLwkd;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long WnQbjbWuMR = yiVar.WnQbjbWuMR(kz0Var, j3, j2);
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (WnQbjbWuMR >> 32))) <= 0.5f && java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (WnQbjbWuMR & 4294967295L))) <= 0.5f;
    }

    public static final float UVjEelCZ(defpackage.yi yiVar, defpackage.l9 l9Var, long j) {
        float f;
        defpackage.kz0 kz0Var;
        int compare;
        if (defpackage.i70.IHQe1A4L2xu(yiVar.NHJTzaLwkd, 0L)) {
            return 0.0f;
        }
        defpackage.xl0 xl0Var = yiVar.PAEGRtP0bX.IHQe1A4L2xu;
        int i = xl0Var.AARZUJiTa - 1;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        if (i < objArr.length) {
            kz0Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                defpackage.kz0 kz0Var2 = (defpackage.kz0) ((defpackage.ui) objArr[i]).IHQe1A4L2xu.IHQe1A4L2xu();
                if (kz0Var2 != null) {
                    long oh6vYeIP = kz0Var2.oh6vYeIP();
                    long frpfPPIgqM9O = defpackage.j70.frpfPPIgqM9O(yiVar.NHJTzaLwkd);
                    f = 0.0f;
                    int ordinal = yiVar.EgCjBq0SZwJ.ordinal();
                    if (ordinal == 0) {
                        compare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (oh6vYeIP & 4294967295L)), java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            defpackage.db.F7NU4MC0GW();
                            return 0.0f;
                        }
                        compare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (oh6vYeIP >> 32)), java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O >> 32)));
                    }
                    if (compare <= 0) {
                        kz0Var = kz0Var2;
                    } else if (kz0Var == null) {
                        kz0Var = kz0Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            kz0Var = null;
        }
        if (kz0Var == null) {
            defpackage.kz0 kz0Var3 = yiVar.abhbClRa ? (defpackage.kz0) yiVar.V7bD7b8KA.IHQe1A4L2xu() : null;
            if (kz0Var3 == null) {
                return f;
            }
            kz0Var = kz0Var3;
        }
        long frpfPPIgqM9O2 = defpackage.j70.frpfPPIgqM9O(yiVar.NHJTzaLwkd);
        int ordinal2 = yiVar.EgCjBq0SZwJ.ordinal();
        if (ordinal2 == 0) {
            float f2 = kz0Var.oh6vYeIP;
            return l9Var.IHQe1A4L2xu(f2 - ((int) (j & 4294967295L)), kz0Var.F7NU4MC0GW - f2, java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = kz0Var.IHQe1A4L2xu;
            return l9Var.IHQe1A4L2xu(f3 - ((int) (j >> 32)), kz0Var.r1MBDhnF - f3, java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O2 >> 32)));
        }
        defpackage.db.F7NU4MC0GW();
        return f;
    }

    @Override // defpackage.t90
    public final void DFo87pBq1E5(long j) {
        int kNAkVymC;
        long j2 = this.NHJTzaLwkd;
        this.NHJTzaLwkd = j;
        int ordinal = this.EgCjBq0SZwJ.ordinal();
        if (ordinal == 0) {
            kNAkVymC = defpackage.x70.kNAkVymC((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        } else {
            if (ordinal != 1) {
                defpackage.db.F7NU4MC0GW();
                return;
            }
            kNAkVymC = defpackage.x70.kNAkVymC((int) (j >> 32), (int) (j2 >> 32));
        }
        if (kNAkVymC >= 0) {
            return;
        }
        long j3 = !this.kNAkVymC ? this.EgCjBq0SZwJ == defpackage.ks0.adDC3e2L ? (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (j2 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        defpackage.kz0 kz0Var = (defpackage.kz0) this.V7bD7b8KA.IHQe1A4L2xu();
        if (kz0Var == null || this.QQUzIjv3iOC5 || this.abhbClRa || !H6IrRhrpWoH(this, kz0Var, j2, 0L, 2) || H6IrRhrpWoH(this, kz0Var, 0L, j3, 1)) {
            return;
        }
        this.abhbClRa = true;
        pm90rNzI5F(j3);
    }

    public final long WnQbjbWuMR(defpackage.kz0 kz0Var, long j, long j2) {
        long frpfPPIgqM9O = defpackage.j70.frpfPPIgqM9O(j);
        int ordinal = this.EgCjBq0SZwJ.ordinal();
        if (ordinal == 0) {
            defpackage.l9 l9Var = (defpackage.l9) defpackage.mj1.abhbClRa(this, defpackage.n9.IHQe1A4L2xu);
            float f = kz0Var.oh6vYeIP;
            float IHQe1A4L2xu = l9Var.IHQe1A4L2xu(f - ((int) (j2 & 4294967295L)), kz0Var.F7NU4MC0GW - f, java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O & 4294967295L)));
            return (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(IHQe1A4L2xu) & 4294967295L);
        }
        if (ordinal != 1) {
            defpackage.db.F7NU4MC0GW();
            return 0L;
        }
        defpackage.l9 l9Var2 = (defpackage.l9) defpackage.mj1.abhbClRa(this, defpackage.n9.IHQe1A4L2xu);
        float f2 = kz0Var.IHQe1A4L2xu;
        return (java.lang.Float.floatToRawIntBits(l9Var2.IHQe1A4L2xu(f2 - ((int) (j2 >> 32)), kz0Var.r1MBDhnF - f2, java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O >> 32)))) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.lj0
    public final boolean ZNF7fheNE() {
        return false;
    }

    public final void pm90rNzI5F(long j) {
        defpackage.qh qhVar = defpackage.n9.IHQe1A4L2xu;
        defpackage.l9 l9Var = (defpackage.l9) defpackage.mj1.abhbClRa(this, qhVar);
        if (this.QQUzIjv3iOC5) {
            defpackage.a60.r1MBDhnF("launchAnimation called when previous animation was running");
        }
        ((defpackage.l9) defpackage.mj1.abhbClRa(this, qhVar)).getClass();
        defpackage.l9.IHQe1A4L2xu.getClass();
        defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.xi(this, new defpackage.el1(defpackage.k9.oh6vYeIP), l9Var, j, null), 1);
    }
}
