package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class tr0 {
    public static final defpackage.on0 ZpBGe2uQfcn8;

    static {
        defpackage.on0 on0Var = defpackage.ms0.ZpBGe2uQfcn8;
        ZpBGe2uQfcn8 = new defpackage.on0();
    }

    public static final int JhCgjQRTAOCT(defpackage.tl0 tl0Var) {
        int i = tl0Var instanceof defpackage.yc0 ? 3 : 1;
        if (tl0Var instanceof defpackage.at) {
            i |= 4;
        }
        if (tl0Var instanceof defpackage.d7) {
            i |= 8;
        }
        if (tl0Var instanceof defpackage.l5) {
            i |= 64;
        }
        return tl0Var instanceof defpackage.fb ? 524288 | i : i;
    }

    public static final boolean QiMR8OkAhezm(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int WDYagTQQm9ns(defpackage.ul0 ul0Var) {
        int i = ul0Var.QiMR8OkAhezm;
        if (i != 0) {
            return i;
        }
        java.lang.Class<?> cls = ul0Var.getClass();
        defpackage.on0 on0Var = ZpBGe2uQfcn8;
        int JhCgjQRTAOCT = on0Var.JhCgjQRTAOCT(cls);
        if (JhCgjQRTAOCT >= 0) {
            return on0Var.fWTAfUmVKrZq[JhCgjQRTAOCT];
        }
        int i2 = ul0Var instanceof defpackage.ad0 ? 3 : 1;
        if (ul0Var instanceof defpackage.bt) {
            i2 |= 4;
        }
        if (ul0Var instanceof defpackage.hb1) {
            i2 |= 8;
        }
        if (ul0Var instanceof defpackage.f01) {
            i2 |= 16;
        }
        if (ul0Var instanceof defpackage.xl0) {
            i2 |= 32;
        }
        if (ul0Var instanceof defpackage.qw0) {
            i2 |= 64;
        }
        if (ul0Var instanceof defpackage.pc0) {
            i2 |= 4194432;
        } else if (ul0Var instanceof defpackage.yk0) {
            i2 |= 128;
        }
        if (ul0Var instanceof defpackage.q30) {
            i2 |= 256;
        }
        if (ul0Var instanceof defpackage.nz) {
            i2 |= 1024;
        }
        if (ul0Var instanceof defpackage.l9) {
            i2 |= 2048;
        }
        if (ul0Var instanceof defpackage.xy) {
            i2 |= 4096;
        }
        if (ul0Var instanceof defpackage.zb0) {
            i2 |= 8192;
        }
        if (ul0Var instanceof defpackage.h) {
            i2 |= 16384;
        }
        if (ul0Var instanceof defpackage.mj) {
            i2 |= 32768;
        }
        if (ul0Var instanceof defpackage.rp1) {
            i2 |= 262144;
        }
        if (ul0Var instanceof defpackage.fb) {
            i2 |= 524288;
        }
        if (ul0Var instanceof defpackage.r70) {
            i2 |= 2097152;
        }
        if (ul0Var instanceof defpackage.ie0) {
            i2 |= 8388608;
        }
        on0Var.QiMR8OkAhezm(i2, cls);
        return i2;
    }

    public static final void ZpBGe2uQfcn8(defpackage.ul0 ul0Var, int i, int i2) {
        if (!(ul0Var instanceof defpackage.xo)) {
            giKS3J6vZuNy(ul0Var, i & ul0Var.QiMR8OkAhezm, i2);
            return;
        }
        defpackage.xo xoVar = (defpackage.xo) ul0Var;
        int i3 = xoVar.BHfvd2J71qpO;
        giKS3J6vZuNy(ul0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (defpackage.ul0 ul0Var2 = xoVar.ZVVdXbWmyCSK; ul0Var2 != null; ul0Var2 = ul0Var2.GE9mJIPrb8gP) {
            ZpBGe2uQfcn8(ul0Var2, i4, i2);
        }
    }

    public static final void fWTAfUmVKrZq(defpackage.ul0 ul0Var) {
        if (!ul0Var.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("autoInvalidateUpdatedNode called on unattached node");
        }
        ZpBGe2uQfcn8(ul0Var, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void giKS3J6vZuNy(defpackage.ul0 ul0Var, int i, int i2) {
        if (i2 != 0 || ul0Var.RIHPIrzkudeW()) {
            if ((i & 2) != 0 && (ul0Var instanceof defpackage.ad0)) {
                defpackage.n70.maCixPsq4ml2((defpackage.ad0) ul0Var);
                if (i2 == 2) {
                    defpackage.la0.OcTWLQzke1i2(ul0Var, 2).b();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                defpackage.la0.UmgHb6n58gfG(ul0Var).jjTN4uUnoyEn();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                defpackage.la0.UmgHb6n58gfG(ul0Var).EPEWHACkMcF1(false);
            }
            if ((i & 256) != 0 && (ul0Var instanceof defpackage.q30)) {
                if (i2 == 1) {
                    defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(ul0Var);
                    UmgHb6n58gfG.FhgBoOud6zyW(UmgHb6n58gfG.OVwOqzUGHcCU + 1);
                } else if (i2 == 2) {
                    defpackage.la0.UmgHb6n58gfG(ul0Var).FhgBoOud6zyW(r0.OVwOqzUGHcCU - 1);
                }
                if (i2 != 2) {
                    defpackage.jd0 UmgHb6n58gfG2 = defpackage.la0.UmgHb6n58gfG(ul0Var);
                    if (UmgHb6n58gfG2.OVwOqzUGHcCU != 0 && !UmgHb6n58gfG2.XntWc4eZSQ8j() && !UmgHb6n58gfG2.WmetiUbpKU9I() && !UmgHb6n58gfG2.Wc0TdmRSwbbi) {
                        defpackage.u uVar = (defpackage.u) defpackage.md0.ZpBGe2uQfcn8(UmgHb6n58gfG2);
                        defpackage.n80 n80Var = uVar.fhbmYuu9J3cT.WDYagTQQm9ns;
                        n80Var.getClass();
                        if (UmgHb6n58gfG2.OVwOqzUGHcCU > 0) {
                            ((defpackage.ho0) n80Var.oh71FJcDz6S2).giKS3J6vZuNy(UmgHb6n58gfG2);
                            UmgHb6n58gfG2.Wc0TdmRSwbbi = true;
                        }
                        uVar.Mearx7yMn90V(null);
                    }
                }
            }
            if ((i & 4) != 0 && (ul0Var instanceof defpackage.bt)) {
                defpackage.nq1.KrtOTfE6jiS2((defpackage.bt) ul0Var);
            }
            if ((i & 8) != 0 && (ul0Var instanceof defpackage.hb1)) {
                defpackage.la0.UmgHb6n58gfG(ul0Var).w7APNrr0aGRc = true;
            }
            if ((i & 64) != 0 && (ul0Var instanceof defpackage.qw0)) {
                defpackage.nd0 nd0Var = defpackage.la0.UmgHb6n58gfG((defpackage.qw0) ul0Var).BXaznwstz2U0;
                nd0Var.XntWc4eZSQ8j.ZVVdXbWmyCSK = true;
                defpackage.qj0 qj0Var = nd0Var.WmetiUbpKU9I;
                if (qj0Var != null) {
                    qj0Var.dG7RjM6DqYVL = true;
                }
            }
            if ((i & 2048) != 0 && (ul0Var instanceof defpackage.l9)) {
                defpackage.tl0 tl0Var = ((defpackage.l9) ul0Var).BHfvd2J71qpO;
                defpackage.e80.giKS3J6vZuNy("applyFocusProperties called on wrong node");
                tl0Var.getClass();
                defpackage.p81.ZpBGe2uQfcn8();
                return;
            }
            if ((i & 4096) != 0 && (ul0Var instanceof defpackage.xy)) {
                defpackage.xy xyVar = (defpackage.xy) ul0Var;
                defpackage.bz bzVar = ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(xyVar)).getFocusOwner()).JhCgjQRTAOCT;
                if (bzVar.JhCgjQRTAOCT.ZpBGe2uQfcn8(xyVar)) {
                    bzVar.ZpBGe2uQfcn8();
                }
            }
            if ((i & 2097152) != 0 && (ul0Var instanceof defpackage.r70) && i2 == 2) {
                ((defpackage.r70) ul0Var).blKFvluuDQOf();
            }
        }
    }

    public static final int oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        if (!(ul0Var instanceof defpackage.xo)) {
            return WDYagTQQm9ns(ul0Var);
        }
        defpackage.xo xoVar = (defpackage.xo) ul0Var;
        int i = xoVar.BHfvd2J71qpO;
        for (defpackage.ul0 ul0Var2 = xoVar.ZVVdXbWmyCSK; ul0Var2 != null; ul0Var2 = ul0Var2.GE9mJIPrb8gP) {
            i |= oh71FJcDz6S2(ul0Var2);
        }
        return i;
    }
}
