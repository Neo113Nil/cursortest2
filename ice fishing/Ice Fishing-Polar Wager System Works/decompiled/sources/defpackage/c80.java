package defpackage;

/* loaded from: classes.dex */
public abstract class c80 implements defpackage.om1 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;
    public static final /* synthetic */ int oh6vYeIP = 0;

    public c80() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public static final void AARZUJiTa(defpackage.qn0 qn0Var, defpackage.u01 u01Var, defpackage.t10 t10Var, int i) {
        defpackage.u01 u01Var2;
        qn0Var.getClass();
        t10Var.QUKZkWRtw6(1899831803);
        int i2 = (t10Var.EXtogiMhuM(qn0Var) ? 4 : 2) | i | 16;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
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
                defpackage.vm1 v5iciZok = defpackage.l80.v5iciZok(defpackage.u01.class, IHQe1A4L2xu2, G3OKOH3wZRC, IHQe1A4L2xu2 instanceof defpackage.h30 ? ((defpackage.h30) IHQe1A4L2xu2).xiZrDbcSW0() : defpackage.dk.oh6vYeIP, t10Var);
                t10Var.QoRHpC4k(false);
                t10Var.QoRHpC4k(false);
                u01Var2 = (defpackage.u01) v5iciZok;
            } else {
                t10Var.WLpAkxCo();
                u01Var2 = u01Var;
            }
            t10Var.G3OKOH3wZRC();
            defpackage.sl0 PAEGRtP0bX = defpackage.mj1.PAEGRtP0bX(u01Var2.AARZUJiTa, t10Var);
            defpackage.g00 v5iciZok2 = v5iciZok(t10Var);
            defpackage.b10 b10Var = (defpackage.b10) t10Var.SH1y5HwkJhh(defpackage.cv.IHQe1A4L2xu);
            defpackage.tb tbVar = u01Var2.riuEU0zW4;
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(v5iciZok2) | t10Var.EXtogiMhuM(b10Var) | t10Var.EXtogiMhuM(qn0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj = defpackage.bh.IHQe1A4L2xu;
            if (xiZrDbcSW0 || mAr5m2L7gYDP == obj) {
                java.lang.Object gfItCtPdVQt9 = new defpackage.GfItCtPdVQt9(v5iciZok2, b10Var, qn0Var, null, 2);
                t10Var.OtkytngK3Mr(gfItCtPdVQt9);
                mAr5m2L7gYDP = gfItCtPdVQt9;
            }
            defpackage.x80.IHQe1A4L2xu(tbVar, (defpackage.k00) mAr5m2L7gYDP, t10Var, 0);
            defpackage.q01 q01Var = (defpackage.q01) PAEGRtP0bX.getValue();
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(u01Var2);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP2 == obj) {
                java.lang.Object xizrdbcsw0 = new defpackage.xiZrDbcSW0(1, u01Var2, defpackage.u01.class, "onEvent", "onEvent(Lcom/corsair/ledger/presentation/relic/RelicEvent;)V", 0, 0, 9);
                t10Var.OtkytngK3Mr(xizrdbcsw0);
                mAr5m2L7gYDP2 = xizrdbcsw0;
            }
            EXtogiMhuM(q01Var, (defpackage.g00) ((defpackage.v00) mAr5m2L7gYDP2), t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
            u01Var2 = u01Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 17, qn0Var, u01Var2);
        }
    }

    public static final long C0U8sNJm(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((java.lang.Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return (java.lang.Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (java.lang.Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static final defpackage.sl0 D2vUnMij(java.lang.Object obj, defpackage.t10 t10Var) {
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = nBH8hAHy(obj);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.sl0 sl0Var = (defpackage.sl0) mAr5m2L7gYDP;
        sl0Var.setValue(obj);
        return sl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.ej DFo87pBq1E5(defpackage.ej ejVar, defpackage.ej ejVar2, defpackage.k00 k00Var) {
        k00Var.getClass();
        if (k00Var instanceof defpackage.v7) {
            return ((defpackage.v7) k00Var).ez2rX8ReCYw(ejVar2, ejVar);
        }
        defpackage.lj xiZrDbcSW0 = ejVar2.xiZrDbcSW0();
        return xiZrDbcSW0 == defpackage.lt.adDC3e2L ? new defpackage.y70(ejVar2, ejVar, k00Var) : new defpackage.z70(ejVar2, xiZrDbcSW0, k00Var, ejVar);
    }

    public static final void EXtogiMhuM(defpackage.q01 q01Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        q01Var.getClass();
        g00Var.getClass();
        t10Var.QUKZkWRtw6(-899744049);
        int i2 = (t10Var.xiZrDbcSW0(q01Var) ? 4 : 2) | i | (t10Var.EXtogiMhuM(g00Var) ? 32 : 16);
        int i3 = 18;
        int i4 = 1;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            defpackage.mj1.riuEU0zW4(null, defpackage.h1.XZx205DYe(-1822047461, new defpackage.n01(q01Var, g00Var, i4), t10Var), t10Var, 48);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, i3, q01Var, g00Var);
        }
    }

    public static defpackage.gz EgCjBq0SZwJ(defpackage.gz[] gzVarArr) {
        defpackage.gz gzVar = null;
        int i = Integer.MAX_VALUE;
        for (defpackage.gz gzVar2 : gzVarArr) {
            int abs = (java.lang.Math.abs(gzVar2.r1MBDhnF - 400) * 2) + (gzVar2.F7NU4MC0GW ? 1 : 0);
            if (gzVar == null || i > abs) {
                gzVar = gzVar2;
                i = abs;
            }
        }
        return gzVar;
    }

    public static final void F7NU4MC0GW(defpackage.ud0 ud0Var, defpackage.be0 be0Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(228371534);
        if ((i & 6) == 0) {
            i2 = (t10Var.EXtogiMhuM(ud0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.EXtogiMhuM(be0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.EXtogiMhuM(g00Var) ? 256 : 128;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 147) != 146)) {
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(be0Var) | ((i2 & 896) == 256) | t10Var.EXtogiMhuM(ud0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.vi(ud0Var, be0Var, g00Var, 3);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.s21.r1MBDhnF(ud0Var, be0Var, (defpackage.g00) mAr5m2L7gYDP, t10Var);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.qf(ud0Var, be0Var, g00Var, i, 3);
        }
    }

    public static final boolean G3OKOH3wZRC(long j, long j2) {
        return j == j2;
    }

    public static final void IHQe1A4L2xu(java.lang.String str, java.lang.String str2, defpackage.t10 t10Var, int i) {
        int i2;
        java.lang.String str3;
        defpackage.t10 t10Var2 = t10Var;
        t10Var2.QUKZkWRtw6(-1494550054);
        if ((i & 6) == 0) {
            i2 = i | (t10Var2.xiZrDbcSW0(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (t10Var2.xiZrDbcSW0(str2) ? 32 : 16);
        if (t10Var2.lpprD5VAS(i3 & 1, (i3 & 19) != 18)) {
            defpackage.pe IHQe1A4L2xu2 = defpackage.ne.IHQe1A4L2xu(defpackage.mj1.oh6vYeIP, defpackage.n.G3OKOH3wZRC, t10Var2, 0);
            int hashCode = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF = t10Var2.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = defpackage.s21.yIx6ChFVk(t10Var2, defpackage.jj0.IHQe1A4L2xu);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.oh ohVar = defpackage.ug.oh6vYeIP;
            t10Var2.AQHddgaEX();
            if (t10Var2.QPwENk36pDC) {
                t10Var2.ez2rX8ReCYw(ohVar);
            } else {
                t10Var2.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var2, IHQe1A4L2xu2);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var2, JlrlGoKF);
            defpackage.f70.kd6TUFXn(t10Var2, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            defpackage.f70.PAEGRtP0bX(t10Var2, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var2, yIx6ChFVk);
            defpackage.nc1 nc1Var = defpackage.dk1.IHQe1A4L2xu;
            defpackage.dg1 dg1Var = ((defpackage.bk1) t10Var2.SH1y5HwkJhh(nc1Var)).SyNS6RMn;
            defpackage.nc1 nc1Var2 = defpackage.he.IHQe1A4L2xu;
            defpackage.of1.oh6vYeIP(str, null, ((defpackage.fe) t10Var2.SH1y5HwkJhh(nc1Var2)).EgCjBq0SZwJ, 0L, 0L, null, 0L, 0, false, 0, 0, dg1Var, t10Var, i3 & 14, 0, 131066);
            str3 = str2;
            defpackage.of1.oh6vYeIP(str3, null, ((defpackage.fe) t10Var.SH1y5HwkJhh(nc1Var2)).G3OKOH3wZRC, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var.SH1y5HwkJhh(nc1Var)).AARZUJiTa, t10Var, (i3 >> 3) & 14, 0, 131066);
            t10Var2 = t10Var;
            t10Var2.QoRHpC4k(true);
        } else {
            str3 = str2;
            t10Var2.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var2.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.KaQkzhFJpl(i, 7, str, str3);
        }
    }

    public static float[] JlrlGoKF() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static defpackage.eb0 NHJTzaLwkd(defpackage.ed0 ed0Var, defpackage.vz vzVar) {
        defpackage.ad1 ad1Var = defpackage.ad1.riuEU0zW4;
        int ordinal = ed0Var.ordinal();
        if (ordinal == 0) {
            return new defpackage.le1(vzVar);
        }
        if (ordinal == 1) {
            defpackage.p31 p31Var = new defpackage.p31();
            p31Var.adDC3e2L = vzVar;
            p31Var.xiZrDbcSW0 = ad1Var;
            return p31Var;
        }
        if (ordinal != 2) {
            defpackage.db.F7NU4MC0GW();
            return null;
        }
        defpackage.vk1 vk1Var = new defpackage.vk1();
        vk1Var.adDC3e2L = vzVar;
        vk1Var.xiZrDbcSW0 = ad1Var;
        return vk1Var;
    }

    public static final boolean PAEGRtP0bX(defpackage.x21 x21Var) {
        long j = x21Var.adDC3e2L;
        return (j >>> 32) == (4294967295L & j) && j == x21Var.xiZrDbcSW0 && j == x21Var.AARZUJiTa && j == x21Var.EXtogiMhuM;
    }

    public static defpackage.le1 QQUzIjv3iOC5(defpackage.vz vzVar) {
        vzVar.getClass();
        return new defpackage.le1(vzVar);
    }

    public static final defpackage.yn QoRHpC4k(defpackage.vz vzVar) {
        defpackage.v5 v5Var = defpackage.db1.IHQe1A4L2xu;
        return new defpackage.yn(vzVar, null);
    }

    public static defpackage.ld1 SH1y5HwkJhh() {
        return new defpackage.ld1(null);
    }

    public static final void SiPhmbmu(defpackage.is0 is0Var, int i, java.lang.Object obj) {
        is0Var.SH1y5HwkJhh[(is0Var.ez2rX8ReCYw - is0Var.xiZrDbcSW0[is0Var.AARZUJiTa - 1].oh6vYeIP) + i] = obj;
    }

    public static final void UsuH8pd5P(float[] fArr, defpackage.ml0 ml0Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = ml0Var.IHQe1A4L2xu;
        float f11 = ml0Var.oh6vYeIP;
        float f12 = ml0Var.r1MBDhnF;
        float f13 = ml0Var.F7NU4MC0GW;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((java.lang.Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((java.lang.Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((java.lang.Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (java.lang.Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        ml0Var.IHQe1A4L2xu = java.lang.Math.min(f19, java.lang.Math.min(f26, java.lang.Math.min(f32, f37)));
        ml0Var.oh6vYeIP = java.lang.Math.min(f22, java.lang.Math.min(f28, java.lang.Math.min(f34, f38)));
        ml0Var.r1MBDhnF = java.lang.Math.max(f19, java.lang.Math.max(f26, java.lang.Math.max(f32, f37)));
        ml0Var.F7NU4MC0GW = java.lang.Math.max(f22, java.lang.Math.max(f28, java.lang.Math.max(f34, f38)));
    }

    public static defpackage.ej V7bD7b8KA(defpackage.ej ejVar) {
        ejVar.getClass();
        defpackage.fj fjVar = ejVar instanceof defpackage.fj ? (defpackage.fj) ejVar : null;
        if (fjVar == null || (ejVar = fjVar.AARZUJiTa) != null) {
            return ejVar;
        }
        defpackage.nj njVar = (defpackage.nj) fjVar.xiZrDbcSW0().cnag84Bm(defpackage.n.QQUzIjv3iOC5);
        defpackage.ej wpVar = njVar != null ? new defpackage.wp(njVar, fjVar) : fjVar;
        fjVar.AARZUJiTa = wpVar;
        return wpVar;
    }

    public static final void abhbClRa(java.lang.String str) {
        str.getClass();
        throw new java.lang.IllegalArgumentException(defpackage.fx0.ez2rX8ReCYw("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final void adDC3e2L(final boolean z, final defpackage.k00 k00Var, defpackage.t10 t10Var, final int i) {
        t10Var.QUKZkWRtw6(1818896922);
        int i2 = (t10Var.AARZUJiTa(z) ? 4 : 2) | i | (t10Var.EXtogiMhuM(k00Var) ? 32 : 16);
        if ((i2 & 19) == 18 && t10Var.C0U8sNJm()) {
            t10Var.WLpAkxCo();
        } else {
            defpackage.f70.F7NU4MC0GW(z, k00Var, t10Var, i2 & 126);
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(z, k00Var, i) { // from class: sm0
                public final /* synthetic */ boolean adDC3e2L;
                public final /* synthetic */ defpackage.k00 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(1);
                    defpackage.c80.adDC3e2L(this.adDC3e2L, this.xiZrDbcSW0, (defpackage.t10) obj, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final defpackage.xl0 cnag84Bm() {
        defpackage.v5 v5Var = defpackage.db1.oh6vYeIP;
        defpackage.xl0 xl0Var = (defpackage.xl0) v5Var.adDC3e2L();
        if (xl0Var != null) {
            return xl0Var;
        }
        defpackage.xl0 xl0Var2 = new defpackage.xl0(new defpackage.s10[0]);
        v5Var.cnag84Bm(xl0Var2);
        return xl0Var2;
    }

    public static final defpackage.sl0 ez2rX8ReCYw(defpackage.fc1 fc1Var, defpackage.t10 t10Var) {
        java.lang.Object value = fc1Var.getValue();
        java.lang.Object obj = defpackage.lt.adDC3e2L;
        boolean EXtogiMhuM = t10Var.EXtogiMhuM(obj) | t10Var.EXtogiMhuM(fc1Var);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        defpackage.ej ejVar = null;
        java.lang.Object obj2 = defpackage.bh.IHQe1A4L2xu;
        if (EXtogiMhuM || mAr5m2L7gYDP == obj2) {
            mAr5m2L7gYDP = new defpackage.AARZUJiTa(obj, fc1Var, ejVar, 17);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.k00 k00Var = (defpackage.k00) mAr5m2L7gYDP;
        java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
        if (mAr5m2L7gYDP2 == obj2) {
            mAr5m2L7gYDP2 = nBH8hAHy(value);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
        }
        defpackage.sl0 sl0Var = (defpackage.sl0) mAr5m2L7gYDP2;
        boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(k00Var);
        java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
        if (EXtogiMhuM2 || mAr5m2L7gYDP3 == obj2) {
            mAr5m2L7gYDP3 = new defpackage.eb1(k00Var, sl0Var, ejVar, 1);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
        }
        defpackage.s21.EXtogiMhuM(fc1Var, obj, (defpackage.k00) mAr5m2L7gYDP3, t10Var);
        return sl0Var;
    }

    public static int fnWB2E7cs(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final void frpfPPIgqM9O(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final int kNAkVymC(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static java.lang.String kd6TUFXn(defpackage.ra raVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(raVar.size());
        for (int i = 0; i < raVar.size(); i++) {
            byte IHQe1A4L2xu2 = raVar.IHQe1A4L2xu(i);
            if (IHQe1A4L2xu2 == 34) {
                sb.append("\\\"");
            } else if (IHQe1A4L2xu2 == 39) {
                sb.append("\\'");
            } else if (IHQe1A4L2xu2 != 92) {
                switch (IHQe1A4L2xu2) {
                    case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (IHQe1A4L2xu2 < 32 || IHQe1A4L2xu2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((IHQe1A4L2xu2 >>> 6) & 3) + 48));
                            sb.append((char) (((IHQe1A4L2xu2 >>> 3) & 7) + 48));
                            sb.append((char) ((IHQe1A4L2xu2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) IHQe1A4L2xu2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static defpackage.qt0 nBH8hAHy(java.lang.Object obj) {
        return new defpackage.qt0(obj, defpackage.ad1.xiZrDbcSW0);
    }

    public static final long oh6vYeIP(int i) {
        long j = i << 32;
        int i2 = defpackage.l90.QoRHpC4k;
        return j;
    }

    public static final void p4kuH6PDtgom(defpackage.is0 is0Var, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        int i3 = is0Var.ez2rX8ReCYw - is0Var.xiZrDbcSW0[is0Var.AARZUJiTa - 1].oh6vYeIP;
        java.lang.Object[] objArr = is0Var.SH1y5HwkJhh;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void r1MBDhnF(java.lang.Boolean bool, java.lang.Object obj, defpackage.ud0 ud0Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(696924721);
        if ((i & 6) == 0) {
            i2 = (t10Var.EXtogiMhuM(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.EXtogiMhuM(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= t10Var.EXtogiMhuM(g00Var) ? 2048 : 1024;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 1171) != 1170)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                ud0Var = (defpackage.ud0) t10Var.SH1y5HwkJhh(defpackage.ye0.IHQe1A4L2xu);
            } else {
                t10Var.WLpAkxCo();
            }
            int i3 = i2 & (-897);
            t10Var.G3OKOH3wZRC();
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(bool) | t10Var.xiZrDbcSW0(obj) | t10Var.xiZrDbcSW0(ud0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW0 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.be0(ud0Var.EXtogiMhuM());
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            F7NU4MC0GW(ud0Var, (defpackage.be0) mAr5m2L7gYDP, g00Var, t10Var, (i3 >> 3) & 896);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.ud0 ud0Var2 = ud0Var;
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.d(bool, obj, ud0Var2, g00Var, i, 1);
        }
    }

    public static final defpackage.x21 riuEU0zW4(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(intBitsToFloat2));
        return new defpackage.x21(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final defpackage.g00 v5iciZok(defpackage.t10 t10Var) {
        android.content.Context context = (android.content.Context) t10Var.SH1y5HwkJhh(defpackage.j1.oh6vYeIP);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
        if (mAr5m2L7gYDP == ad1Var) {
            mAr5m2L7gYDP = new defpackage.bh1();
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.bh1 bh1Var = (defpackage.bh1) mAr5m2L7gYDP;
        boolean EXtogiMhuM = t10Var.EXtogiMhuM(bh1Var);
        java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
        if (EXtogiMhuM || mAr5m2L7gYDP2 == ad1Var) {
            mAr5m2L7gYDP2 = new defpackage.dh1(1, bh1Var);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
        }
        defpackage.s21.oh6vYeIP(bh1Var, (defpackage.g00) mAr5m2L7gYDP2, t10Var);
        boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(context) | t10Var.xiZrDbcSW0(bh1Var);
        java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
        if (xiZrDbcSW0 || mAr5m2L7gYDP3 == ad1Var) {
            mAr5m2L7gYDP3 = new defpackage.r1MBDhnF(25, bh1Var, context);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
        }
        return (defpackage.g00) mAr5m2L7gYDP3;
    }

    public static java.lang.Object wll2JLbTBC2(defpackage.k00 k00Var, java.lang.Object obj, defpackage.ej ejVar) {
        k00Var.getClass();
        defpackage.lj xiZrDbcSW0 = ejVar.xiZrDbcSW0();
        java.lang.Object a80Var = xiZrDbcSW0 == defpackage.lt.adDC3e2L ? new defpackage.a80(ejVar) : new defpackage.b80(ejVar, xiZrDbcSW0);
        defpackage.mj1.kNAkVymC(2, k00Var);
        return k00Var.adDC3e2L(obj, a80Var);
    }

    public static final void xiZrDbcSW0(final long j, final defpackage.dg1 dg1Var, final defpackage.sf sfVar, defpackage.t10 t10Var, final int i) {
        t10Var.QUKZkWRtw6(-684938728);
        int i2 = (t10Var.adDC3e2L(j) ? 4 : 2) | i | (t10Var.xiZrDbcSW0(dg1Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar) ? 256 : 128;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 147) != 146)) {
            defpackage.qh qhVar = defpackage.of1.IHQe1A4L2xu;
            defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.ti.IHQe1A4L2xu.IHQe1A4L2xu(new defpackage.ae(j)), qhVar.IHQe1A4L2xu(((defpackage.dg1) t10Var.SH1y5HwkJhh(qhVar)).r1MBDhnF(dg1Var))}, sfVar, t10Var, ((i2 >> 3) & 112) | 8);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00() { // from class: my0
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    defpackage.c80.xiZrDbcSW0(j, dg1Var, sfVar, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(i | 1));
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static java.lang.String yIx6ChFVk(long j) {
        return "PointerId(value=" + j + ')';
    }

    public abstract android.graphics.Typeface SyNS6RMn(android.content.Context context, defpackage.gz[] gzVarArr);
}
