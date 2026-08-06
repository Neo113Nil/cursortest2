package defpackage;

/* loaded from: classes.dex */
public abstract class jp0 {
    public static final defpackage.fl0 IHQe1A4L2xu;

    static {
        defpackage.fl0 fl0Var = defpackage.up0.IHQe1A4L2xu;
        IHQe1A4L2xu = new defpackage.fl0();
    }

    public static final boolean AARZUJiTa(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int F7NU4MC0GW(defpackage.kj0 kj0Var) {
        int i = kj0Var instanceof defpackage.vr ? 5 : 1;
        if (kj0Var instanceof defpackage.y5) {
            i |= 8;
        }
        if (kj0Var instanceof defpackage.k4) {
            i |= 64;
        }
        return kj0Var instanceof defpackage.e9 ? 524288 | i : i;
    }

    public static final void IHQe1A4L2xu(defpackage.lj0 lj0Var, int i, int i2) {
        if (!(lj0Var instanceof defpackage.ln)) {
            oh6vYeIP(lj0Var, i & lj0Var.AARZUJiTa, i2);
            return;
        }
        defpackage.ln lnVar = (defpackage.ln) lj0Var;
        int i3 = lnVar.EgCjBq0SZwJ;
        oh6vYeIP(lj0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (defpackage.lj0 lj0Var2 = lnVar.fnWB2E7cs; lj0Var2 != null; lj0Var2 = lj0Var2.SH1y5HwkJhh) {
            IHQe1A4L2xu(lj0Var2, i4, i2);
        }
    }

    public static final int adDC3e2L(defpackage.lj0 lj0Var) {
        int i = lj0Var.AARZUJiTa;
        if (i != 0) {
            return i;
        }
        java.lang.Class<?> cls = lj0Var.getClass();
        defpackage.fl0 fl0Var = IHQe1A4L2xu;
        int F7NU4MC0GW = fl0Var.F7NU4MC0GW(cls);
        if (F7NU4MC0GW >= 0) {
            return fl0Var.r1MBDhnF[F7NU4MC0GW];
        }
        int i2 = lj0Var instanceof defpackage.da0 ? 3 : 1;
        if (lj0Var instanceof defpackage.wr) {
            i2 |= 4;
        }
        if (lj0Var instanceof defpackage.d71) {
            i2 |= 8;
        }
        if (lj0Var instanceof defpackage.vv0) {
            i2 |= 16;
        }
        if (lj0Var instanceof defpackage.oj0) {
            i2 |= 32;
        }
        if (lj0Var instanceof defpackage.rt0) {
            i2 |= 64;
        }
        boolean z = lj0Var instanceof defpackage.t90;
        if (z) {
            i2 |= 4194432;
        } else if (z) {
            i2 |= 128;
        }
        if (lj0Var instanceof defpackage.h20) {
            i2 |= 256;
        }
        if (lj0Var instanceof defpackage.gy) {
            i2 |= 1024;
        }
        boolean z2 = lj0Var instanceof defpackage.u7;
        if (z2) {
            i2 |= 2048;
        }
        if (z2) {
            i2 |= 4096;
        }
        if (lj0Var instanceof defpackage.n90) {
            i2 |= 8192;
        }
        if (lj0Var instanceof defpackage.k0) {
            i2 |= 16384;
        }
        if (lj0Var instanceof defpackage.lh) {
            i2 |= 32768;
        }
        if (lj0Var instanceof defpackage.ui1) {
            i2 |= 262144;
        }
        if (lj0Var instanceof defpackage.e9) {
            i2 |= 524288;
        }
        if (lj0Var instanceof defpackage.q50) {
            i2 |= 2097152;
        }
        if (lj0Var instanceof defpackage.mb0) {
            i2 |= 8388608;
        }
        fl0Var.AARZUJiTa(i2, cls);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void oh6vYeIP(defpackage.lj0 lj0Var, int i, int i2) {
        if (i2 != 0 || lj0Var.ZNF7fheNE()) {
            if ((i & 2) != 0 && (lj0Var instanceof defpackage.da0)) {
                defpackage.a70.EgCjBq0SZwJ((defpackage.da0) lj0Var);
                if (i2 == 2) {
                    defpackage.w70.nBH8hAHy(lj0Var, 2).eSIfjzq9c3LO();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                defpackage.w70.D2vUnMij(lj0Var).D2vUnMij();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                defpackage.w70.D2vUnMij(lj0Var).EoOhNTTfIN7K(false);
            }
            if ((i & 256) != 0 && (lj0Var instanceof defpackage.h20)) {
                if (i2 == 1) {
                    defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(lj0Var);
                    D2vUnMij.AQHddgaEX(D2vUnMij.TFRaUu83X3E + 1);
                } else if (i2 == 2) {
                    defpackage.w70.D2vUnMij(lj0Var).AQHddgaEX(r0.TFRaUu83X3E - 1);
                }
                if (i2 != 2) {
                    defpackage.ma0 D2vUnMij2 = defpackage.w70.D2vUnMij(lj0Var);
                    if (D2vUnMij2.TFRaUu83X3E != 0 && !D2vUnMij2.QoRHpC4k() && !D2vUnMij2.G3OKOH3wZRC() && !D2vUnMij2.hkbnNdmy) {
                        defpackage.v0 v0Var = (defpackage.v0) defpackage.pa0.IHQe1A4L2xu(D2vUnMij2);
                        defpackage.F7NU4MC0GW f7nu4mc0gw = v0Var.nVhUznk1t.adDC3e2L;
                        f7nu4mc0gw.getClass();
                        if (D2vUnMij2.TFRaUu83X3E > 0) {
                            ((defpackage.xl0) f7nu4mc0gw.xiZrDbcSW0).oh6vYeIP(D2vUnMij2);
                            D2vUnMij2.hkbnNdmy = true;
                        }
                        v0Var.D2vUnMij(null);
                    }
                }
            }
            if ((i & 4) != 0 && (lj0Var instanceof defpackage.wr)) {
                defpackage.fm.D2vUnMij((defpackage.wr) lj0Var);
            }
            if ((i & 8) != 0 && (lj0Var instanceof defpackage.d71)) {
                defpackage.w70.D2vUnMij(lj0Var).kNAkVymC = true;
            }
            if ((i & 64) != 0 && (lj0Var instanceof defpackage.rt0)) {
                defpackage.qa0 qa0Var = defpackage.w70.D2vUnMij((defpackage.rt0) lj0Var).wll2JLbTBC2;
                qa0Var.QoRHpC4k.fnWB2E7cs = true;
                defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
                if (fg0Var != null) {
                    fg0Var.QQUzIjv3iOC5 = true;
                }
            }
            if ((i & 2048) != 0 && (lj0Var instanceof defpackage.u7)) {
                defpackage.kj0 kj0Var = ((defpackage.u7) lj0Var).EgCjBq0SZwJ;
                defpackage.x50.oh6vYeIP("applyFocusProperties called on wrong node");
                kj0Var.getClass();
                defpackage.db.kd6TUFXn();
                return;
            }
            if ((i & 4096) != 0 && (lj0Var instanceof defpackage.u7)) {
                defpackage.u7 u7Var = (defpackage.u7) lj0Var;
                defpackage.wx wxVar = ((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(u7Var)).getFocusOwner()).F7NU4MC0GW;
                if (wxVar.F7NU4MC0GW.IHQe1A4L2xu(u7Var)) {
                    wxVar.IHQe1A4L2xu();
                }
            }
            if ((i & 2097152) != 0 && (lj0Var instanceof defpackage.q50) && i2 == 2) {
                ((defpackage.q50) lj0Var).kNAkVymC();
            }
        }
    }

    public static final void r1MBDhnF(defpackage.lj0 lj0Var) {
        if (!lj0Var.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("autoInvalidateUpdatedNode called on unattached node");
        }
        IHQe1A4L2xu(lj0Var, -1, 0);
    }

    public static final int xiZrDbcSW0(defpackage.lj0 lj0Var) {
        if (!(lj0Var instanceof defpackage.ln)) {
            return adDC3e2L(lj0Var);
        }
        defpackage.ln lnVar = (defpackage.ln) lj0Var;
        int i = lnVar.EgCjBq0SZwJ;
        for (defpackage.lj0 lj0Var2 = lnVar.fnWB2E7cs; lj0Var2 != null; lj0Var2 = lj0Var2.SH1y5HwkJhh) {
            i |= xiZrDbcSW0(lj0Var2);
        }
        return i;
    }
}
