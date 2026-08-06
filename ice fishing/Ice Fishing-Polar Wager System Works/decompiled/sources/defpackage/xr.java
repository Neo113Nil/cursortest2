package defpackage;

/* loaded from: classes.dex */
public interface xr extends defpackage.qn {
    static /* synthetic */ void FyULxpbU8bu(defpackage.xr xrVar, defpackage.y2 y2Var, long j, defpackage.zc1 zc1Var, int i) {
        defpackage.w70 w70Var = zc1Var;
        if ((i & 8) != 0) {
            w70Var = defpackage.nv.WLpAkxCo;
        }
        xrVar.gG5uWf3dqScO(y2Var, j, w70Var);
    }

    static long NWDBeGGF(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void XZx205DYe(defpackage.oa0 oa0Var, defpackage.h1 h1Var, long j, long j2, long j3, defpackage.w70 w70Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long NWDBeGGF = (i & 4) != 0 ? NWDBeGGF(oa0Var.adDC3e2L.r1MBDhnF(), j4) : j2;
        defpackage.w70 w70Var2 = (i & 32) != 0 ? defpackage.nv.WLpAkxCo : w70Var;
        defpackage.jb jbVar = oa0Var.adDC3e2L;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        jbVar.adDC3e2L.r1MBDhnF.EXtogiMhuM(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat((int) (NWDBeGGF >> 32)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat((int) (NWDBeGGF & 4294967295L)) + java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), jbVar.F7NU4MC0GW(h1Var, w70Var2, 1.0f, null, 3));
    }

    static /* synthetic */ void Ye0N2xE9Hc(defpackage.xr xrVar, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        xrVar.frpfPPIgqM9O(j, j4, (i & 4) != 0 ? NWDBeGGF(xrVar.r1MBDhnF(), j4) : j3, defpackage.nv.WLpAkxCo, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void adDC3e2L(defpackage.xr xrVar, defpackage.h1 h1Var, long j, long j2, float f, defpackage.w70 w70Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = NWDBeGGF(xrVar.r1MBDhnF(), j3);
        }
        xrVar.SyNS6RMn(h1Var, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? defpackage.nv.WLpAkxCo : w70Var);
    }

    static /* synthetic */ void cSNyPqwud(defpackage.xr xrVar, defpackage.y2 y2Var, defpackage.h1 h1Var, defpackage.zc1 zc1Var, int i) {
        defpackage.w70 w70Var = zc1Var;
        if ((i & 8) != 0) {
            w70Var = defpackage.nv.WLpAkxCo;
        }
        xrVar.WLpAkxCo(y2Var, h1Var, 1.0f, w70Var, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void v5iciZok(defpackage.xr xrVar, long j, float f, long j2, defpackage.zc1 zc1Var, int i) {
        if ((i & 4) != 0) {
            j2 = xrVar.Uv8CGu3G();
        }
        long j3 = j2;
        defpackage.w70 w70Var = zc1Var;
        if ((i & 16) != 0) {
            w70Var = defpackage.nv.WLpAkxCo;
        }
        xrVar.riuEU0zW4(j, f, j3, w70Var);
    }

    defpackage.v5 PAEGRtP0bX();

    void QQUzIjv3iOC5(defpackage.py0 py0Var, float f, long j, defpackage.w70 w70Var);

    void SyNS6RMn(defpackage.h1 h1Var, long j, long j2, float f, defpackage.w70 w70Var);

    default long Uv8CGu3G() {
        return defpackage.e90.G3OKOH3wZRC(PAEGRtP0bX().riuEU0zW4());
    }

    void WLpAkxCo(defpackage.y2 y2Var, defpackage.h1 h1Var, float f, defpackage.w70 w70Var, int i);

    void frpfPPIgqM9O(long j, long j2, long j3, defpackage.w70 w70Var, int i);

    void gG5uWf3dqScO(defpackage.y2 y2Var, long j, defpackage.w70 w70Var);

    defpackage.w90 getLayoutDirection();

    void hyxIchWRW(long j, long j2, long j3, float f, int i);

    default long r1MBDhnF() {
        return PAEGRtP0bX().riuEU0zW4();
    }

    void riuEU0zW4(long j, float f, long j2, defpackage.w70 w70Var);
}
