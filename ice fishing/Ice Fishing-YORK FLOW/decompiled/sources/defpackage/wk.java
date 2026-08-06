package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wk extends defpackage.ul0 implements defpackage.mj, defpackage.yk0 {
    public defpackage.fv0 BHfvd2J71qpO;
    public boolean VFeft99leXEK;
    public final defpackage.y91 ZVVdXbWmyCSK;
    public boolean dG7RjM6DqYVL;
    public final defpackage.l91 maCixPsq4ml2;
    public boolean w7APNrr0aGRc;
    public final defpackage.gb IJ0hOnjhPOri = new defpackage.gb(0);
    public long oCu53ZX2v4Ju = -1;

    public wk(defpackage.fv0 fv0Var, defpackage.y91 y91Var, boolean z, defpackage.l91 l91Var) {
        this.BHfvd2J71qpO = fv0Var;
        this.ZVVdXbWmyCSK = y91Var;
        this.w7APNrr0aGRc = z;
        this.maCixPsq4ml2 = l91Var;
    }

    public static boolean I9id0xDxCgYV(defpackage.wk wkVar, defpackage.s31 s31Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = wkVar.xbkEJUK1coRZ();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long KN4muQto0Nd5 = wkVar.KN4muQto0Nd5(s31Var, j3, j2);
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (KN4muQto0Nd5 >> 32))) <= 0.5f && java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (KN4muQto0Nd5 & 4294967295L))) <= 0.5f;
    }

    public static final float YZh1E3mnTFwf(defpackage.wk wkVar, defpackage.qb qbVar, long j) {
        float f;
        defpackage.s31 s31Var;
        int compare;
        long j2 = wkVar.oCu53ZX2v4Ju;
        defpackage.ho0 ho0Var = wkVar.IJ0hOnjhPOri.ZpBGe2uQfcn8;
        int i = ho0Var.QiMR8OkAhezm - 1;
        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
        if (i < objArr.length) {
            s31Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                defpackage.s31 s31Var2 = (defpackage.s31) ((defpackage.tk) objArr[i]).ZpBGe2uQfcn8.ZpBGe2uQfcn8();
                if (s31Var2 != null) {
                    long fWTAfUmVKrZq = s31Var2.fWTAfUmVKrZq();
                    long EPEWHACkMcF1 = defpackage.w60.EPEWHACkMcF1(wkVar.xbkEJUK1coRZ());
                    f = 0.0f;
                    int ordinal = wkVar.BHfvd2J71qpO.ordinal();
                    if (ordinal == 0) {
                        compare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq & 4294967295L)), java.lang.Float.intBitsToFloat((int) (EPEWHACkMcF1 & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            defpackage.h7.T1fB7bDYiVJQ();
                            return 0.0f;
                        }
                        compare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq >> 32)), java.lang.Float.intBitsToFloat((int) (EPEWHACkMcF1 >> 32)));
                    }
                    if (compare <= 0) {
                        s31Var = s31Var2;
                    } else if (s31Var == null) {
                        s31Var = s31Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            s31Var = null;
        }
        if (s31Var == null) {
            defpackage.s31 s31Var3 = wkVar.VFeft99leXEK ? (defpackage.s31) wkVar.maCixPsq4ml2.ZpBGe2uQfcn8() : null;
            if (s31Var3 == null) {
                return f;
            }
            s31Var = s31Var3;
        }
        long EPEWHACkMcF12 = defpackage.w60.EPEWHACkMcF1(j2);
        int ordinal2 = wkVar.BHfvd2J71qpO.ordinal();
        if (ordinal2 == 0) {
            float f2 = s31Var.giKS3J6vZuNy;
            return qbVar.ZpBGe2uQfcn8(f2 - ((int) (j & 4294967295L)), s31Var.JhCgjQRTAOCT - f2, java.lang.Float.intBitsToFloat((int) (EPEWHACkMcF12 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = s31Var.ZpBGe2uQfcn8;
            return qbVar.ZpBGe2uQfcn8(f3 - ((int) (j >> 32)), s31Var.fWTAfUmVKrZq - f3, java.lang.Float.intBitsToFloat((int) (EPEWHACkMcF12 >> 32)));
        }
        defpackage.h7.T1fB7bDYiVJQ();
        return f;
    }

    public final long KN4muQto0Nd5(defpackage.s31 s31Var, long j, long j2) {
        long EPEWHACkMcF1 = defpackage.w60.EPEWHACkMcF1(j);
        int ordinal = this.BHfvd2J71qpO.ordinal();
        if (ordinal == 0) {
            defpackage.qb qbVar = (defpackage.qb) defpackage.nq1.blKFvluuDQOf(this, defpackage.sb.ZpBGe2uQfcn8);
            float f = s31Var.giKS3J6vZuNy;
            float ZpBGe2uQfcn8 = qbVar.ZpBGe2uQfcn8(f - ((int) (j2 & 4294967295L)), s31Var.JhCgjQRTAOCT - f, java.lang.Float.intBitsToFloat((int) (EPEWHACkMcF1 & 4294967295L)));
            return (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn8) & 4294967295L);
        }
        if (ordinal != 1) {
            defpackage.h7.T1fB7bDYiVJQ();
            return 0L;
        }
        defpackage.qb qbVar2 = (defpackage.qb) defpackage.nq1.blKFvluuDQOf(this, defpackage.sb.ZpBGe2uQfcn8);
        float f2 = s31Var.ZpBGe2uQfcn8;
        return (java.lang.Float.floatToRawIntBits(qbVar2.ZpBGe2uQfcn8(f2 - ((int) (j2 >> 32)), s31Var.fWTAfUmVKrZq - f2, java.lang.Float.intBitsToFloat((int) (EPEWHACkMcF1 >> 32)))) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.ul0
    public final boolean RIHPIrzkudeW() {
        return false;
    }

    @Override // defpackage.yk0
    public final void fWTAfUmVKrZq(long j) {
        int fNwYGHIYeJcR;
        long xbkEJUK1coRZ = xbkEJUK1coRZ();
        this.oCu53ZX2v4Ju = j;
        int ordinal = this.BHfvd2J71qpO.ordinal();
        if (ordinal == 0) {
            fNwYGHIYeJcR = defpackage.ma0.fNwYGHIYeJcR((int) (j & 4294967295L), (int) (xbkEJUK1coRZ & 4294967295L));
        } else {
            if (ordinal != 1) {
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
            fNwYGHIYeJcR = defpackage.ma0.fNwYGHIYeJcR((int) (j >> 32), (int) (xbkEJUK1coRZ >> 32));
        }
        if (fNwYGHIYeJcR >= 0) {
            return;
        }
        long j2 = !this.w7APNrr0aGRc ? this.BHfvd2J71qpO == defpackage.fv0.WDYagTQQm9ns ? (((int) (xbkEJUK1coRZ & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (xbkEJUK1coRZ >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        defpackage.s31 s31Var = (defpackage.s31) this.maCixPsq4ml2.ZpBGe2uQfcn8();
        if (s31Var == null || this.dG7RjM6DqYVL || this.VFeft99leXEK || !I9id0xDxCgYV(this, s31Var, xbkEJUK1coRZ, 0L, 2) || I9id0xDxCgYV(this, s31Var, 0L, j2, 1)) {
            return;
        }
        this.VFeft99leXEK = true;
        jVUAPb5NnIYW(j2);
    }

    public final void jVUAPb5NnIYW(long j) {
        defpackage.sj sjVar = defpackage.sb.ZpBGe2uQfcn8;
        defpackage.qb qbVar = (defpackage.qb) defpackage.nq1.blKFvluuDQOf(this, sjVar);
        if (this.dG7RjM6DqYVL) {
            defpackage.h80.fWTAfUmVKrZq("launchAnimation called when previous animation was running");
        }
        ((defpackage.qb) defpackage.nq1.blKFvluuDQOf(this, sjVar)).getClass();
        defpackage.qb.ZpBGe2uQfcn8.getClass();
        defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.vk(this, new defpackage.qs1(defpackage.pb.giKS3J6vZuNy), qbVar, j, null), 1);
    }

    public final long xbkEJUK1coRZ() {
        long j = this.oCu53ZX2v4Ju;
        if (defpackage.u90.ZpBGe2uQfcn8(j, -1L)) {
            return 0L;
        }
        return j;
    }
}
