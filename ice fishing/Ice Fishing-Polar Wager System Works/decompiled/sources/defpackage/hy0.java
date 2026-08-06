package defpackage;

/* loaded from: classes.dex */
public abstract class hy0 {
    static {
        int i = defpackage.bk0.IHQe1A4L2xu;
    }

    public static final void IHQe1A4L2xu(final defpackage.vz vzVar, defpackage.mj0 mj0Var, final long j, final long j2, int i, final float f, final defpackage.g00 g00Var, defpackage.t10 t10Var, final int i2) {
        defpackage.mj0 mj0Var2;
        final int i3;
        int i4;
        java.lang.Object obj;
        final int i5;
        t10Var.QUKZkWRtw6(-339970038);
        int i6 = i2 | (t10Var.EXtogiMhuM(vzVar) ? 4 : 2) | (t10Var.adDC3e2L(j) ? 256 : 128) | (t10Var.adDC3e2L(j2) ? 2048 : 1024) | 24576;
        boolean z = true;
        if (t10Var.lpprD5VAS(i6 & 1, (599187 & i6) != 599186)) {
            t10Var.Ye0N2xE9Hc();
            if ((i2 & 1) == 0 || t10Var.NHJTzaLwkd()) {
                i4 = 1;
            } else {
                t10Var.WLpAkxCo();
                i4 = i;
            }
            t10Var.G3OKOH3wZRC();
            boolean z2 = (i6 & 14) == 4;
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj2 = defpackage.bh.IHQe1A4L2xu;
            if (z2 || mAr5m2L7gYDP == obj2) {
                mAr5m2L7gYDP = new defpackage.e3(12, vzVar);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            final defpackage.vz vzVar2 = (defpackage.vz) mAr5m2L7gYDP;
            mj0Var2 = mj0Var;
            defpackage.mj0 r1MBDhnF = mj0Var2.r1MBDhnF(defpackage.juTJww2r.IHQe1A4L2xu);
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(vzVar2);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW0 || mAr5m2L7gYDP2 == obj2) {
                mAr5m2L7gYDP2 = new defpackage.DFo87pBq1E5(19, vzVar2);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            defpackage.mj0 F7NU4MC0GW = defpackage.ba1.F7NU4MC0GW(r1MBDhnF.r1MBDhnF(new defpackage.y5((defpackage.g00) mAr5m2L7gYDP2, true)));
            boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(vzVar2) | ((((i6 & 7168) ^ 3072) > 2048 && t10Var.adDC3e2L(j2)) || (i6 & 3072) == 2048);
            if ((((i6 & 896) ^ 384) <= 256 || !t10Var.adDC3e2L(j)) && (i6 & 384) != 256) {
                z = false;
            }
            boolean z3 = xiZrDbcSW02 | z;
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (z3 || mAr5m2L7gYDP3 == obj2) {
                i5 = i4;
                obj = new defpackage.g00() { // from class: fy0
                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj3) {
                        defpackage.xr xrVar = (defpackage.xr) obj3;
                        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() & 4294967295L));
                        int i7 = i5;
                        float f2 = f;
                        if (i7 != 0 && java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> 32))) {
                            f2 += xrVar.qvFH3dnF(intBitsToFloat);
                        }
                        float qvFH3dnF = f2 / xrVar.qvFH3dnF(java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> 32)));
                        float floatValue = ((java.lang.Number) vzVar2.IHQe1A4L2xu()).floatValue();
                        float min = java.lang.Math.min(floatValue, qvFH3dnF) + floatValue;
                        if (min <= 1.0f) {
                            defpackage.hy0.oh6vYeIP(xrVar, min, 1.0f, j2, intBitsToFloat, i7);
                        }
                        defpackage.hy0.oh6vYeIP(xrVar, 0.0f, floatValue, j, intBitsToFloat, i7);
                        g00Var.AARZUJiTa(xrVar);
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                };
                t10Var.OtkytngK3Mr(obj);
            } else {
                obj = mAr5m2L7gYDP3;
                i5 = i4;
            }
            defpackage.s21.IHQe1A4L2xu(F7NU4MC0GW, (defpackage.g00) obj, t10Var, 0);
            i3 = i5;
        } else {
            mj0Var2 = mj0Var;
            t10Var.WLpAkxCo();
            i3 = i;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            final defpackage.mj0 mj0Var3 = mj0Var2;
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(mj0Var3, j, j2, i3, f, g00Var, i2) { // from class: gy0
                public final /* synthetic */ long AARZUJiTa;
                public final /* synthetic */ long EXtogiMhuM;
                public final /* synthetic */ float SH1y5HwkJhh;
                public final /* synthetic */ defpackage.g00 ez2rX8ReCYw;
                public final /* synthetic */ int riuEU0zW4;
                public final /* synthetic */ defpackage.mj0 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj3, java.lang.Object obj4) {
                    ((java.lang.Integer) obj4).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(1769521);
                    defpackage.hy0.IHQe1A4L2xu(defpackage.vz.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, (defpackage.t10) obj3, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void oh6vYeIP(defpackage.xr xrVar, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (xrVar.r1MBDhnF() & 4294967295L));
        float f4 = intBitsToFloat2 / 2.0f;
        boolean z = xrVar.getLayoutDirection() == defpackage.w90.adDC3e2L;
        float f5 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            xrVar.hyxIchWRW(j, (java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L), (java.lang.Float.floatToRawIntBits(f6) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L), f3, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = intBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (java.lang.Math.abs(f2 - f) > 0.0f) {
            xrVar.hyxIchWRW(j, (java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L), (java.lang.Float.floatToRawIntBits(f8) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L), f3, (r19 & 16) != 0 ? 0 : i);
        }
    }
}
