package defpackage;

/* loaded from: classes.dex */
public abstract class m {
    public static final defpackage.qh F7NU4MC0GW;
    public static final defpackage.ct0 IHQe1A4L2xu = new defpackage.ct0(24.0f, 24.0f, 24.0f, 24.0f);
    public static final defpackage.ct0 oh6vYeIP;
    public static final defpackage.ct0 r1MBDhnF;

    static {
        defpackage.s21.ez2rX8ReCYw(16.0f);
        oh6vYeIP = defpackage.s21.ez2rX8ReCYw(16.0f);
        r1MBDhnF = defpackage.s21.ez2rX8ReCYw(24.0f);
        F7NU4MC0GW = new defpackage.qh(new defpackage.g(0));
    }

    public static final void F7NU4MC0GW(defpackage.vz vzVar, defpackage.mj0 mj0Var, defpackage.oo ooVar, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(24925658);
        if ((i & 6) == 0) {
            i2 = (t10Var.EXtogiMhuM(vzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.xiZrDbcSW0(mj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.xiZrDbcSW0(ooVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar) ? 2048 : 1024;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 1171) != 1170)) {
            defpackage.im imVar = (defpackage.im) t10Var.SH1y5HwkJhh(F7NU4MC0GW);
            defpackage.y yVar = new defpackage.y();
            yVar.adDC3e2L = vzVar;
            yVar.xiZrDbcSW0 = mj0Var;
            yVar.AARZUJiTa = ooVar;
            yVar.EXtogiMhuM = sfVar;
            imVar.IHQe1A4L2xu(yVar, t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.d(vzVar, mj0Var, ooVar, sfVar, i, 0);
        }
    }

    public static final void IHQe1A4L2xu(final defpackage.sf sfVar, defpackage.mj0 mj0Var, final defpackage.k00 k00Var, final defpackage.k00 k00Var2, final defpackage.e91 e91Var, final long j, final long j2, final long j3, final long j4, final long j5, defpackage.t10 t10Var, final int i) {
        final defpackage.mj0 mj0Var2;
        t10Var.QUKZkWRtw6(1378716401);
        int i2 = i | 48 | (t10Var.EXtogiMhuM(null) ? 256 : 128) | (t10Var.EXtogiMhuM(k00Var) ? 2048 : 1024) | (t10Var.EXtogiMhuM(k00Var2) ? 16384 : 8192) | (t10Var.xiZrDbcSW0(e91Var) ? 131072 : 65536) | (t10Var.adDC3e2L(j) ? 1048576 : 524288) | (t10Var.r1MBDhnF(0.0f) ? 8388608 : 4194304) | (t10Var.adDC3e2L(j2) ? 67108864 : 33554432) | (t10Var.adDC3e2L(j3) ? 536870912 : 268435456);
        if (t10Var.lpprD5VAS(i2 & 1, ((306783379 & i2) == 306783378 && (((t10Var.adDC3e2L(j4) ? (char) 4 : (char) 2) | (t10Var.adDC3e2L(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            defpackage.sf XZx205DYe = defpackage.h1.XZx205DYe(-652798794, new defpackage.i(k00Var, k00Var2, j3, j4, j5, j2, sfVar), t10Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            defpackage.jj0 jj0Var = defpackage.jj0.IHQe1A4L2xu;
            defpackage.xd1.IHQe1A4L2xu(jj0Var, e91Var, j, 0L, 0.0f, XZx205DYe, t10Var, i4, 104);
            mj0Var2 = jj0Var;
        } else {
            t10Var.WLpAkxCo();
            mj0Var2 = mj0Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(mj0Var2, k00Var, k00Var2, e91Var, j, j2, j3, j4, j5, i) { // from class: c
                public final /* synthetic */ defpackage.k00 AARZUJiTa;
                public final /* synthetic */ long DFo87pBq1E5;
                public final /* synthetic */ defpackage.k00 EXtogiMhuM;
                public final /* synthetic */ long JlrlGoKF;
                public final /* synthetic */ long SH1y5HwkJhh;
                public final /* synthetic */ long SyNS6RMn;
                public final /* synthetic */ long ez2rX8ReCYw;
                public final /* synthetic */ defpackage.e91 riuEU0zW4;
                public final /* synthetic */ defpackage.mj0 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(7);
                    defpackage.m.IHQe1A4L2xu(defpackage.sf.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, (defpackage.t10) obj, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void oh6vYeIP(defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(-917637668);
        int i2 = 0;
        if (t10Var.lpprD5VAS(i & 1, (i & 147) != 146)) {
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.w1(4);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.ii0 ii0Var = (defpackage.ii0) mAr5m2L7gYDP;
            int QQUzIjv3iOC5 = defpackage.fm.QQUzIjv3iOC5(t10Var);
            defpackage.gu0 JlrlGoKF = t10Var.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = defpackage.s21.yIx6ChFVk(t10Var, defpackage.jj0.IHQe1A4L2xu);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.oh ohVar = defpackage.ug.oh6vYeIP;
            t10Var.AQHddgaEX();
            if (t10Var.QPwENk36pDC) {
                t10Var.ez2rX8ReCYw(ohVar);
            } else {
                t10Var.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var, ii0Var);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var, JlrlGoKF);
            defpackage.g4 g4Var = defpackage.ug.AARZUJiTa;
            if (t10Var.QPwENk36pDC || !defpackage.x70.QoRHpC4k(t10Var.mAr5m2L7gYDP(), java.lang.Integer.valueOf(QQUzIjv3iOC5))) {
                defpackage.fx0.SyNS6RMn(QQUzIjv3iOC5, t10Var, QQUzIjv3iOC5, g4Var);
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var, yIx6ChFVk);
            sfVar.adDC3e2L(t10Var, 6);
            t10Var.QoRHpC4k(true);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.e(sfVar, i, i2);
        }
    }

    public static final void r1MBDhnF(final defpackage.vz vzVar, final defpackage.sf sfVar, final defpackage.mj0 mj0Var, final defpackage.k00 k00Var, final defpackage.k00 k00Var2, final defpackage.k00 k00Var3, final defpackage.e91 e91Var, final long j, final long j2, final long j3, final long j4, final defpackage.oo ooVar, defpackage.t10 t10Var, final int i, final int i2) {
        int i3;
        defpackage.sf sfVar2;
        defpackage.k00 k00Var4;
        int i4;
        t10Var.QUKZkWRtw6(-867616355);
        if ((i & 6) == 0) {
            i3 = (t10Var.EXtogiMhuM(vzVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            sfVar2 = sfVar;
            i3 |= t10Var.EXtogiMhuM(sfVar2) ? 32 : 16;
        } else {
            sfVar2 = sfVar;
        }
        if ((i & 384) == 0) {
            i3 |= t10Var.xiZrDbcSW0(mj0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            k00Var4 = k00Var;
            i3 |= t10Var.EXtogiMhuM(k00Var4) ? 2048 : 1024;
        } else {
            k00Var4 = k00Var;
        }
        if ((i & 24576) == 0) {
            i3 |= t10Var.EXtogiMhuM(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= t10Var.EXtogiMhuM(k00Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= t10Var.EXtogiMhuM(k00Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= t10Var.xiZrDbcSW0(e91Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= t10Var.adDC3e2L(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= t10Var.adDC3e2L(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (t10Var.adDC3e2L(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= t10Var.adDC3e2L(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= t10Var.r1MBDhnF(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= t10Var.xiZrDbcSW0(ooVar) ? 2048 : 1024;
        }
        int i5 = i4;
        if (t10Var.lpprD5VAS(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            F7NU4MC0GW(vzVar, mj0Var, ooVar, defpackage.h1.XZx205DYe(527420759, new defpackage.l(k00Var2, k00Var3, e91Var, j, j2, j3, j4, k00Var4, sfVar2), t10Var), t10Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00() { // from class: f
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(i | 1);
                    int hyxIchWRW2 = defpackage.a70.hyxIchWRW(i2);
                    defpackage.m.r1MBDhnF(defpackage.vz.this, sfVar, mj0Var, k00Var, k00Var2, k00Var3, e91Var, j, j2, j3, j4, ooVar, (defpackage.t10) obj, hyxIchWRW, hyxIchWRW2);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }
}
