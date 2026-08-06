package defpackage;

/* loaded from: classes.dex */
public abstract class x80 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;
    public static final /* synthetic */ int oh6vYeIP = 0;
    public static final /* synthetic */ int r1MBDhnF = 0;

    public static final defpackage.kz0 AARZUJiTa(defpackage.v90 v90Var) {
        defpackage.v90 JlrlGoKF = v90Var.JlrlGoKF();
        return JlrlGoKF != null ? JlrlGoKF.wll2JLbTBC2(v90Var, true) : new defpackage.kz0(0.0f, 0.0f, (int) (v90Var.mAr5m2L7gYDP() >> 32), (int) (v90Var.mAr5m2L7gYDP() & 4294967295L));
    }

    public static final void C0U8sNJm(defpackage.d71 d71Var) {
        defpackage.w70.D2vUnMij(d71Var).frpfPPIgqM9O();
    }

    public static final boolean D2vUnMij(defpackage.y2 y2Var, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        defpackage.y2 IHQe1A4L2xu2 = defpackage.z2.IHQe1A4L2xu();
        android.graphics.Path path = IHQe1A4L2xu2.IHQe1A4L2xu;
        if (java.lang.Float.isNaN(f3) || java.lang.Float.isNaN(f4) || java.lang.Float.isNaN(f5) || java.lang.Float.isNaN(f6)) {
            defpackage.z2.oh6vYeIP("Invalid rectangle, make sure no value is NaN");
        }
        if (IHQe1A4L2xu2.oh6vYeIP == null) {
            IHQe1A4L2xu2.oh6vYeIP = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = IHQe1A4L2xu2.oh6vYeIP;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        android.graphics.RectF rectF2 = IHQe1A4L2xu2.oh6vYeIP;
        rectF2.getClass();
        path.addRect(rectF2, android.graphics.Path.Direction.CCW);
        defpackage.y2 IHQe1A4L2xu3 = defpackage.z2.IHQe1A4L2xu();
        android.graphics.Path path2 = IHQe1A4L2xu3.IHQe1A4L2xu;
        IHQe1A4L2xu3.F7NU4MC0GW(y2Var, IHQe1A4L2xu2, 1);
        boolean isEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !isEmpty;
    }

    public static long DFo87pBq1E5(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final defpackage.kz0 EXtogiMhuM(defpackage.v90 v90Var, boolean z) {
        defpackage.v90 EgCjBq0SZwJ = EgCjBq0SZwJ(v90Var);
        float mAr5m2L7gYDP = (int) (EgCjBq0SZwJ.mAr5m2L7gYDP() >> 32);
        float mAr5m2L7gYDP2 = (int) (EgCjBq0SZwJ.mAr5m2L7gYDP() & 4294967295L);
        defpackage.kz0 wll2JLbTBC2 = EgCjBq0SZwJ.wll2JLbTBC2(v90Var, z);
        float f = wll2JLbTBC2.IHQe1A4L2xu;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > mAr5m2L7gYDP) {
                f = mAr5m2L7gYDP;
            }
        }
        float f2 = wll2JLbTBC2.oh6vYeIP;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > mAr5m2L7gYDP2) {
                f2 = mAr5m2L7gYDP2;
            }
        }
        float f3 = wll2JLbTBC2.r1MBDhnF;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= mAr5m2L7gYDP) {
                mAr5m2L7gYDP = f3;
            }
            f3 = mAr5m2L7gYDP;
        }
        float f4 = wll2JLbTBC2.F7NU4MC0GW;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= mAr5m2L7gYDP2) {
                mAr5m2L7gYDP2 = f5;
            }
            f4 = mAr5m2L7gYDP2;
        }
        if (f == f3 || f2 == f4) {
            return defpackage.kz0.adDC3e2L;
        }
        long SH1y5HwkJhh = EgCjBq0SZwJ.SH1y5HwkJhh((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        long SH1y5HwkJhh2 = EgCjBq0SZwJ.SH1y5HwkJhh((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
        long SH1y5HwkJhh3 = EgCjBq0SZwJ.SH1y5HwkJhh((java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L));
        long SH1y5HwkJhh4 = EgCjBq0SZwJ.SH1y5HwkJhh((java.lang.Float.floatToRawIntBits(f4) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh4 >> 32));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh3 >> 32));
        float min = java.lang.Math.min(intBitsToFloat, java.lang.Math.min(intBitsToFloat2, java.lang.Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = java.lang.Math.max(intBitsToFloat, java.lang.Math.max(intBitsToFloat2, java.lang.Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh & 4294967295L));
        float intBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh2 & 4294967295L));
        float intBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh4 & 4294967295L));
        float intBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (SH1y5HwkJhh3 & 4294967295L));
        return new defpackage.kz0(min, java.lang.Math.min(intBitsToFloat5, java.lang.Math.min(intBitsToFloat6, java.lang.Math.min(intBitsToFloat7, intBitsToFloat8))), max, java.lang.Math.max(intBitsToFloat5, java.lang.Math.max(intBitsToFloat6, java.lang.Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final defpackage.v90 EgCjBq0SZwJ(defpackage.v90 v90Var) {
        defpackage.v90 v90Var2;
        defpackage.v90 JlrlGoKF = v90Var.JlrlGoKF();
        while (true) {
            defpackage.v90 v90Var3 = JlrlGoKF;
            v90Var2 = v90Var;
            v90Var = v90Var3;
            if (v90Var == null) {
                break;
            }
            JlrlGoKF = v90Var.JlrlGoKF();
        }
        defpackage.ip0 ip0Var = v90Var2 instanceof defpackage.ip0 ? (defpackage.ip0) v90Var2 : null;
        if (ip0Var == null) {
            return v90Var2;
        }
        defpackage.ip0 ip0Var2 = ip0Var.kNAkVymC;
        while (true) {
            defpackage.ip0 ip0Var3 = ip0Var2;
            defpackage.ip0 ip0Var4 = ip0Var;
            ip0Var = ip0Var3;
            if (ip0Var == null) {
                return ip0Var4;
            }
            ip0Var2 = ip0Var.kNAkVymC;
        }
    }

    public static final void F7NU4MC0GW(final int i, final defpackage.k00 k00Var, final defpackage.sf sfVar, final defpackage.k00 k00Var2, final defpackage.k00 k00Var3, final defpackage.nn1 nn1Var, final defpackage.k00 k00Var4, defpackage.t10 t10Var, final int i2) {
        int i3;
        int i4;
        t10Var.QUKZkWRtw6(-280287501);
        int i5 = i2 | (t10Var.F7NU4MC0GW(i) ? 4 : 2) | (t10Var.EXtogiMhuM(k00Var) ? 32 : 16) | (t10Var.EXtogiMhuM(sfVar) ? 256 : 128) | (t10Var.EXtogiMhuM(k00Var2) ? 2048 : 1024) | (t10Var.EXtogiMhuM(k00Var3) ? 16384 : 8192) | (t10Var.xiZrDbcSW0(nn1Var) ? 131072 : 65536) | (t10Var.EXtogiMhuM(k00Var4) ? 1048576 : 524288);
        if (t10Var.lpprD5VAS(i5 & 1, (599187 & i5) != 599186)) {
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj = defpackage.bh.IHQe1A4L2xu;
            if (mAr5m2L7gYDP == obj) {
                mAr5m2L7gYDP = new defpackage.x41();
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            final defpackage.x41 x41Var = (defpackage.x41) mAr5m2L7gYDP;
            boolean z = (i5 & 112) == 32;
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (z || mAr5m2L7gYDP2 == obj) {
                mAr5m2L7gYDP2 = new defpackage.sf(605195056, new defpackage.h(5, k00Var), true);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            final defpackage.k00 k00Var5 = (defpackage.k00) mAr5m2L7gYDP2;
            boolean z2 = (i5 & 7168) == 2048;
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (z2 || mAr5m2L7gYDP3 == obj) {
                mAr5m2L7gYDP3 = new defpackage.sf(418899191, new defpackage.h(4, k00Var2), true);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
            }
            final defpackage.k00 k00Var6 = (defpackage.k00) mAr5m2L7gYDP3;
            boolean z3 = (57344 & i5) == 16384;
            java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
            if (z3 || mAr5m2L7gYDP4 == obj) {
                mAr5m2L7gYDP4 = new defpackage.sf(338600263, new defpackage.h(3, k00Var3), true);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP4);
            }
            final defpackage.k00 k00Var7 = (defpackage.k00) mAr5m2L7gYDP4;
            boolean z4 = (i5 & 896) == 256;
            java.lang.Object mAr5m2L7gYDP5 = t10Var.mAr5m2L7gYDP();
            if (z4 || mAr5m2L7gYDP5 == obj) {
                i3 = i5;
                mAr5m2L7gYDP5 = new defpackage.sf(-1776388365, new defpackage.ma(sfVar, x41Var), true);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP5);
            } else {
                i3 = i5;
            }
            final defpackage.k00 k00Var8 = (defpackage.k00) mAr5m2L7gYDP5;
            boolean z5 = (i3 & 3670016) == 1048576;
            java.lang.Object mAr5m2L7gYDP6 = t10Var.mAr5m2L7gYDP();
            if (z5 || mAr5m2L7gYDP6 == obj) {
                mAr5m2L7gYDP6 = new defpackage.sf(-1731662488, new defpackage.h(2, k00Var4), true);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP6);
            }
            final defpackage.k00 k00Var9 = (defpackage.k00) mAr5m2L7gYDP6;
            boolean xiZrDbcSW0 = ((i3 & 458752) == 131072) | t10Var.xiZrDbcSW0(k00Var5) | t10Var.xiZrDbcSW0(k00Var6) | t10Var.xiZrDbcSW0(k00Var7) | ((i3 & 14) == 4) | t10Var.xiZrDbcSW0(k00Var9) | t10Var.xiZrDbcSW0(k00Var8);
            java.lang.Object mAr5m2L7gYDP7 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW0 || mAr5m2L7gYDP7 == obj) {
                i4 = 0;
                java.lang.Object obj2 = new defpackage.k00() { // from class: s41
                    @Override // defpackage.k00
                    public final java.lang.Object adDC3e2L(java.lang.Object obj3, java.lang.Object obj4) {
                        int i6;
                        int yIx6ChFVk;
                        int yIx6ChFVk2;
                        int i7;
                        defpackage.xu xuVar;
                        int i8;
                        java.lang.Integer num;
                        int i9;
                        int intValue;
                        int yIx6ChFVk3;
                        int IHQe1A4L2xu2;
                        final defpackage.gd1 gd1Var = (defpackage.gd1) obj3;
                        defpackage.ki kiVar = (defpackage.ki) obj4;
                        int EXtogiMhuM = defpackage.ki.EXtogiMhuM(kiVar.IHQe1A4L2xu);
                        long j = kiVar.IHQe1A4L2xu;
                        final int AARZUJiTa = defpackage.ki.AARZUJiTa(j);
                        long IHQe1A4L2xu3 = defpackage.ki.IHQe1A4L2xu(j, 0, 0, 10);
                        defpackage.w90 layoutDirection = gd1Var.getLayoutDirection();
                        final defpackage.nn1 nn1Var2 = defpackage.nn1.this;
                        int F7NU4MC0GW = nn1Var2.F7NU4MC0GW(gd1Var, layoutDirection);
                        int r1MBDhnF2 = nn1Var2.r1MBDhnF(gd1Var, gd1Var.getLayoutDirection());
                        int IHQe1A4L2xu4 = nn1Var2.IHQe1A4L2xu(gd1Var);
                        final defpackage.bv0 xiZrDbcSW02 = ((defpackage.di0) defpackage.td.JcqDrWrgMf(gd1Var.NHJTzaLwkd(k00Var5, defpackage.y41.adDC3e2L))).xiZrDbcSW0(IHQe1A4L2xu3);
                        int i10 = (-F7NU4MC0GW) - r1MBDhnF2;
                        int i11 = -IHQe1A4L2xu4;
                        final defpackage.bv0 xiZrDbcSW03 = ((defpackage.di0) defpackage.td.JcqDrWrgMf(gd1Var.NHJTzaLwkd(k00Var6, defpackage.y41.AARZUJiTa))).xiZrDbcSW0(defpackage.li.EXtogiMhuM(i10, i11, IHQe1A4L2xu3));
                        final defpackage.bv0 xiZrDbcSW04 = ((defpackage.di0) defpackage.td.JcqDrWrgMf(gd1Var.NHJTzaLwkd(k00Var7, defpackage.y41.EXtogiMhuM))).xiZrDbcSW0(defpackage.li.EXtogiMhuM(i10, i11, IHQe1A4L2xu3));
                        int i12 = xiZrDbcSW04.adDC3e2L;
                        defpackage.w90 w90Var = defpackage.w90.adDC3e2L;
                        int i13 = i;
                        if (i12 == 0 && xiZrDbcSW04.xiZrDbcSW0 == 0) {
                            xuVar = null;
                        } else {
                            int i14 = xiZrDbcSW04.xiZrDbcSW0;
                            if (i13 == 0) {
                                i6 = F7NU4MC0GW;
                                if (gd1Var.getLayoutDirection() == w90Var) {
                                    yIx6ChFVk = gd1Var.yIx6ChFVk(16.0f);
                                    i7 = yIx6ChFVk + i6;
                                } else {
                                    yIx6ChFVk2 = gd1Var.yIx6ChFVk(16.0f);
                                    i7 = ((EXtogiMhuM - yIx6ChFVk2) - i12) - r1MBDhnF2;
                                }
                            } else {
                                i6 = F7NU4MC0GW;
                                if (i13 != 2 && i13 != 3) {
                                    i7 = (((EXtogiMhuM - i12) + i6) - r1MBDhnF2) / 2;
                                } else if (gd1Var.getLayoutDirection() == w90Var) {
                                    yIx6ChFVk2 = gd1Var.yIx6ChFVk(16.0f);
                                    i7 = ((EXtogiMhuM - yIx6ChFVk2) - i12) - r1MBDhnF2;
                                } else {
                                    yIx6ChFVk = gd1Var.yIx6ChFVk(16.0f);
                                    i7 = yIx6ChFVk + i6;
                                }
                            }
                            xuVar = new defpackage.xu(i7, i14);
                        }
                        final defpackage.bv0 xiZrDbcSW05 = ((defpackage.di0) defpackage.td.JcqDrWrgMf(gd1Var.NHJTzaLwkd(k00Var9, defpackage.y41.riuEU0zW4))).xiZrDbcSW0(IHQe1A4L2xu3);
                        boolean z6 = xiZrDbcSW05.adDC3e2L == 0 && xiZrDbcSW05.xiZrDbcSW0 == 0;
                        if (xuVar != null) {
                            int i15 = xuVar.oh6vYeIP;
                            i8 = EXtogiMhuM;
                            if (z6 || i13 == 3) {
                                yIx6ChFVk3 = gd1Var.yIx6ChFVk(16.0f) + i15;
                                IHQe1A4L2xu2 = nn1Var2.IHQe1A4L2xu(gd1Var);
                            } else {
                                yIx6ChFVk3 = xiZrDbcSW05.xiZrDbcSW0 + i15;
                                IHQe1A4L2xu2 = gd1Var.yIx6ChFVk(16.0f);
                            }
                            num = java.lang.Integer.valueOf(IHQe1A4L2xu2 + yIx6ChFVk3);
                        } else {
                            i8 = EXtogiMhuM;
                            num = null;
                        }
                        int i16 = xiZrDbcSW03.xiZrDbcSW0;
                        if (i16 != 0) {
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(xiZrDbcSW05.xiZrDbcSW0);
                                if (z6) {
                                    valueOf = null;
                                }
                                intValue = valueOf != null ? valueOf.intValue() : nn1Var2.IHQe1A4L2xu(gd1Var);
                            }
                            i9 = i16 + intValue;
                        } else {
                            i9 = 0;
                        }
                        float d6FAb9xVJ8GU = (xiZrDbcSW02.adDC3e2L == 0 && xiZrDbcSW02.xiZrDbcSW0 == 0) ? gd1Var.d6FAb9xVJ8GU(nn1Var2.oh6vYeIP(gd1Var)) : gd1Var.d6FAb9xVJ8GU(xiZrDbcSW02.xiZrDbcSW0);
                        float d6FAb9xVJ8GU2 = z6 ? gd1Var.d6FAb9xVJ8GU(nn1Var2.IHQe1A4L2xu(gd1Var)) : gd1Var.d6FAb9xVJ8GU(xiZrDbcSW05.xiZrDbcSW0);
                        defpackage.w90 layoutDirection2 = gd1Var.getLayoutDirection();
                        float d6FAb9xVJ8GU3 = layoutDirection2 == w90Var ? gd1Var.d6FAb9xVJ8GU(nn1Var2.F7NU4MC0GW(gd1Var, layoutDirection2)) : gd1Var.d6FAb9xVJ8GU(nn1Var2.r1MBDhnF(gd1Var, layoutDirection2));
                        final java.lang.Integer num2 = num;
                        defpackage.w90 layoutDirection3 = gd1Var.getLayoutDirection();
                        x41Var.IHQe1A4L2xu.setValue(new defpackage.ct0(d6FAb9xVJ8GU3, d6FAb9xVJ8GU, layoutDirection3 == w90Var ? gd1Var.d6FAb9xVJ8GU(nn1Var2.r1MBDhnF(gd1Var, layoutDirection3)) : gd1Var.d6FAb9xVJ8GU(nn1Var2.F7NU4MC0GW(gd1Var, layoutDirection3)), d6FAb9xVJ8GU2));
                        final defpackage.bv0 xiZrDbcSW06 = ((defpackage.di0) defpackage.td.JcqDrWrgMf(gd1Var.NHJTzaLwkd(k00Var8, defpackage.y41.xiZrDbcSW0))).xiZrDbcSW0(IHQe1A4L2xu3);
                        final defpackage.xu xuVar2 = xuVar;
                        final int i17 = i8;
                        final int i18 = i9;
                        return gd1Var.EoOhNTTfIN7K(i17, AARZUJiTa, defpackage.ot.adDC3e2L, new defpackage.g00() { // from class: u41
                            @Override // defpackage.g00
                            public final java.lang.Object AARZUJiTa(java.lang.Object obj5) {
                                defpackage.av0 av0Var = (defpackage.av0) obj5;
                                defpackage.av0.SH1y5HwkJhh(av0Var, defpackage.bv0.this, 0, 0);
                                defpackage.av0.SH1y5HwkJhh(av0Var, xiZrDbcSW02, 0, 0);
                                defpackage.bv0 bv0Var = xiZrDbcSW03;
                                int i19 = i17 - bv0Var.adDC3e2L;
                                defpackage.gd1 gd1Var2 = gd1Var;
                                defpackage.w90 layoutDirection4 = gd1Var2.getLayoutDirection();
                                defpackage.nn1 nn1Var3 = nn1Var2;
                                int F7NU4MC0GW2 = ((nn1Var3.F7NU4MC0GW(gd1Var2, layoutDirection4) + i19) - nn1Var3.r1MBDhnF(gd1Var2, gd1Var2.getLayoutDirection())) / 2;
                                int i20 = AARZUJiTa;
                                defpackage.av0.SH1y5HwkJhh(av0Var, bv0Var, F7NU4MC0GW2, i20 - i18);
                                defpackage.bv0 bv0Var2 = xiZrDbcSW05;
                                defpackage.av0.SH1y5HwkJhh(av0Var, bv0Var2, 0, i20 - bv0Var2.xiZrDbcSW0);
                                defpackage.xu xuVar3 = xuVar2;
                                if (xuVar3 != null) {
                                    int i21 = xuVar3.IHQe1A4L2xu;
                                    java.lang.Integer num3 = num2;
                                    num3.getClass();
                                    defpackage.av0.SH1y5HwkJhh(av0Var, xiZrDbcSW04, i21, i20 - num3.intValue());
                                }
                                return defpackage.ok1.IHQe1A4L2xu;
                            }
                        });
                    }
                };
                t10Var.OtkytngK3Mr(obj2);
                mAr5m2L7gYDP7 = obj2;
            } else {
                i4 = 0;
            }
            defpackage.h1.SH1y5HwkJhh(null, (defpackage.k00) mAr5m2L7gYDP7, t10Var, i4);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(i, k00Var, sfVar, k00Var2, k00Var3, nn1Var, k00Var4, i2) { // from class: t41
                public final /* synthetic */ defpackage.sf AARZUJiTa;
                public final /* synthetic */ defpackage.k00 EXtogiMhuM;
                public final /* synthetic */ defpackage.nn1 SH1y5HwkJhh;
                public final /* synthetic */ int adDC3e2L;
                public final /* synthetic */ defpackage.k00 ez2rX8ReCYw;
                public final /* synthetic */ defpackage.k00 riuEU0zW4;
                public final /* synthetic */ defpackage.k00 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj3, java.lang.Object obj4) {
                    ((java.lang.Integer) obj4).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(1);
                    defpackage.x80.F7NU4MC0GW(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, (defpackage.t10) obj3, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void G3OKOH3wZRC(defpackage.lj ljVar) {
        defpackage.u80 u80Var = (defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS);
        if (u80Var != null && !u80Var.oh6vYeIP()) {
            throw u80Var.kd6TUFXn();
        }
    }

    public static final void IHQe1A4L2xu(defpackage.hw hwVar, defpackage.k00 k00Var, defpackage.t10 t10Var, int i) {
        defpackage.hw hwVar2;
        defpackage.k00 k00Var2;
        hwVar.getClass();
        k00Var.getClass();
        t10Var.QUKZkWRtw6(-412879652);
        int i2 = (t10Var.EXtogiMhuM(hwVar) ? 4 : 2) | i | (t10Var.EXtogiMhuM(k00Var) ? 32 : 16);
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            defpackage.ud0 ud0Var = (defpackage.ud0) t10Var.SH1y5HwkJhh(defpackage.ye0.IHQe1A4L2xu);
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(ud0Var) | t10Var.EXtogiMhuM(hwVar) | t10Var.EXtogiMhuM(k00Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                hwVar2 = hwVar;
                k00Var2 = k00Var;
                mAr5m2L7gYDP = new defpackage.AARZUJiTa(ud0Var, hwVar2, k00Var2, null, 20);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            } else {
                hwVar2 = hwVar;
                k00Var2 = k00Var;
            }
            defpackage.s21.EXtogiMhuM(hwVar2, ud0Var, (defpackage.k00) mAr5m2L7gYDP, t10Var);
        } else {
            hwVar2 = hwVar;
            k00Var2 = k00Var;
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 24, hwVar2, k00Var2);
        }
    }

    public static int JlrlGoKF(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final defpackage.o3 NHJTzaLwkd(defpackage.lj ljVar) {
        defpackage.o3 o3Var = (defpackage.o3) ljVar.cnag84Bm(defpackage.n.hkbnNdmy);
        if (o3Var != null) {
            return o3Var;
        }
        defpackage.db.AARZUJiTa("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static defpackage.y71 PAEGRtP0bX(defpackage.gn0 gn0Var) {
        gn0Var.getClass();
        return defpackage.a81.yIx6ChFVk(gn0Var, new defpackage.uc0(14));
    }

    public static defpackage.d70 QPwENk36pDC(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new defpackage.d70(i, i2 - 1, 1);
        }
        defpackage.d70 d70Var = defpackage.d70.EXtogiMhuM;
        return defpackage.d70.EXtogiMhuM;
    }

    public static final defpackage.fk QQUzIjv3iOC5(defpackage.cn1 cn1Var) {
        return cn1Var instanceof defpackage.h30 ? ((defpackage.h30) cn1Var).xiZrDbcSW0() : defpackage.dk.oh6vYeIP;
    }

    public static final defpackage.kz0 QoRHpC4k(defpackage.lj0 lj0Var, boolean z, boolean z2) {
        if (!lj0Var.adDC3e2L.kd6TUFXn) {
            return defpackage.kz0.adDC3e2L;
        }
        if (z) {
            return defpackage.w70.nBH8hAHy(lj0Var, 8).xoYSDoyLRkY();
        }
        defpackage.ip0 nBH8hAHy = defpackage.w70.nBH8hAHy(lj0Var, 8);
        return EgCjBq0SZwJ(nBH8hAHy).wll2JLbTBC2(nBH8hAHy, z2);
    }

    public static double SH1y5HwkJhh(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final defpackage.ji0 SiPhmbmu(defpackage.b31 b31Var, int i, int i2, int i3, int i4, int i5, defpackage.ki0 ki0Var, java.util.List list, defpackage.bv0[] bv0VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        java.util.List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            defpackage.di0 di0Var = (defpackage.di0) list2.get(i14);
            float EgCjBq0SZwJ = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var));
            if (EgCjBq0SZwJ > 0.0f) {
                f2 += EgCjBq0SZwJ;
                i16++;
                j = j2;
                i10 = i14;
            } else {
                int i19 = i3 - i17;
                defpackage.bv0 bv0Var = bv0VarArr[i14];
                j = j2;
                if (bv0Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i16;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i16;
                        i12 = i19 < 0 ? 0 : i19;
                    }
                    bv0Var = di0Var.xiZrDbcSW0(b31Var.F7NU4MC0GW(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i16;
                }
                defpackage.bv0 bv0Var2 = bv0Var;
                int EXtogiMhuM = b31Var.EXtogiMhuM(bv0Var2);
                int adDC3e2L = b31Var.adDC3e2L(bv0Var2);
                iArr2[i10 - i6] = EXtogiMhuM;
                int i20 = i19 - EXtogiMhuM;
                if (i20 < 0) {
                    i20 = 0;
                }
                i18 = java.lang.Math.min(i5, i20);
                i17 += EXtogiMhuM + i18;
                i15 = java.lang.Math.max(i15, adDC3e2L);
                bv0VarArr[i10] = bv0Var2;
                i16 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i16 == 0) {
            i17 -= i18;
            i9 = 0;
        } else {
            long j4 = (r22 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                j5 -= java.lang.Math.round(defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC((defpackage.di0) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = i15;
            int i24 = 0;
            while (i22 < i7) {
                if (bv0VarArr[i22] == null) {
                    defpackage.di0 di0Var2 = (defpackage.di0) list2.get(i22);
                    f = f3;
                    defpackage.c31 G3OKOH3wZRC = defpackage.l80.G3OKOH3wZRC(di0Var2);
                    float EgCjBq0SZwJ2 = defpackage.l80.EgCjBq0SZwJ(G3OKOH3wZRC);
                    if (EgCjBq0SZwJ2 <= 0.0f) {
                        defpackage.v50.oh6vYeIP("All weights <= 0 should have placeables");
                    }
                    int signum = java.lang.Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = java.lang.Math.max(0, java.lang.Math.round(EgCjBq0SZwJ2 * f) + signum);
                    defpackage.bv0 xiZrDbcSW0 = di0Var2.xiZrDbcSW0(b31Var.F7NU4MC0GW((!(G3OKOH3wZRC != null ? G3OKOH3wZRC.oh6vYeIP : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i4, true));
                    int EXtogiMhuM2 = b31Var.EXtogiMhuM(xiZrDbcSW0);
                    int adDC3e2L2 = b31Var.adDC3e2L(xiZrDbcSW0);
                    iArr2[i22 - i6] = EXtogiMhuM2;
                    i24 += EXtogiMhuM2;
                    int max2 = java.lang.Math.max(i23, adDC3e2L2);
                    bv0VarArr[i22] = xiZrDbcSW0;
                    i23 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (i24 + j4);
            int i25 = i3 - i17;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
            i15 = i23;
        }
        int i26 = i9 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int max3 = java.lang.Math.max(i26, i);
        int max4 = java.lang.Math.max(i15, java.lang.Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        b31Var.oh6vYeIP(max3, ki0Var, iArr2, iArr3);
        return b31Var.SH1y5HwkJhh(bv0VarArr, ki0Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static long SyNS6RMn(long j, defpackage.bb0 bb0Var) {
        defpackage.bb0 bb0Var2 = defpackage.bb0.adDC3e2L;
        return defpackage.li.IHQe1A4L2xu(bb0Var == bb0Var2 ? defpackage.ki.SH1y5HwkJhh(j) : defpackage.ki.riuEU0zW4(j), bb0Var == bb0Var2 ? defpackage.ki.EXtogiMhuM(j) : defpackage.ki.AARZUJiTa(j), bb0Var == bb0Var2 ? defpackage.ki.riuEU0zW4(j) : defpackage.ki.SH1y5HwkJhh(j), bb0Var == bb0Var2 ? defpackage.ki.AARZUJiTa(j) : defpackage.ki.EXtogiMhuM(j));
    }

    public static final long TFRaUu83X3E(long j) {
        return defpackage.li.IHQe1A4L2xu(defpackage.ki.SH1y5HwkJhh(j), defpackage.ki.EXtogiMhuM(j), defpackage.ki.riuEU0zW4(j), defpackage.ki.AARZUJiTa(j));
    }

    public static final defpackage.kq UsuH8pd5P(defpackage.u80 u80Var, boolean z, defpackage.y80 y80Var) {
        if (u80Var instanceof defpackage.c90) {
            return ((defpackage.c90) u80Var).Ye0N2xE9Hc(z, y80Var);
        }
        return u80Var.UsuH8pd5P(y80Var.kd6TUFXn(), z, new defpackage.xiZrDbcSW0(1, y80Var, defpackage.y80.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 5));
    }

    public static defpackage.b70 Uv8CGu3G(defpackage.d70 d70Var) {
        d70Var.getClass();
        return new defpackage.b70(d70Var.adDC3e2L, d70Var.xiZrDbcSW0, d70Var.AARZUJiTa > 0 ? 2 : -2);
    }

    public static java.lang.String V7bD7b8KA(defpackage.a6 a6Var, int i) {
        a6Var.getClass();
        if (i <= 16777215) {
            return java.lang.String.valueOf(i);
        }
        try {
            android.content.Context context = a6Var.IHQe1A4L2xu;
            context.getClass();
            java.lang.String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.valueOf(i);
        }
    }

    public static final defpackage.q60 WLpAkxCo(defpackage.i60 i60Var) {
        return new defpackage.q60(i60Var.IHQe1A4L2xu, i60Var.oh6vYeIP, i60Var.r1MBDhnF, i60Var.F7NU4MC0GW);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void XZx205DYe(android.view.ViewStructure viewStructure, defpackage.ma0 ma0Var, android.view.autofill.AutofillId autofillId, java.lang.String str, defpackage.mz0 mz0Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        defpackage.fh1 fh1Var;
        defpackage.l5 l5Var;
        defpackage.h2 h2Var;
        defpackage.l21 l21Var;
        defpackage.p1 p1Var;
        boolean z2;
        defpackage.bj bjVar;
        java.lang.Boolean bool;
        boolean z3;
        java.lang.Integer num;
        int i2;
        java.util.List list;
        java.lang.Integer valueOf;
        boolean z4;
        java.lang.String[] NHJTzaLwkd;
        java.lang.String yIx6ChFVk;
        java.lang.String[] NHJTzaLwkd2;
        java.lang.String[] NHJTzaLwkd3;
        android.view.autofill.AutofillValue forText;
        defpackage.nl0 nl0Var;
        long[] jArr;
        java.lang.Object[] objArr;
        int i3;
        long[] jArr2;
        java.lang.Object[] objArr2;
        defpackage.nl0 nl0Var2;
        defpackage.fh1 fh1Var2;
        defpackage.l5 l5Var2;
        defpackage.h2 h2Var2;
        defpackage.l21 l21Var2;
        defpackage.m71 m71Var = defpackage.j71.IHQe1A4L2xu;
        defpackage.m71 m71Var2 = defpackage.a71.IHQe1A4L2xu;
        defpackage.b71 abhbClRa = ma0Var.abhbClRa();
        int i4 = 8;
        if (abhbClRa == null || (nl0Var2 = abhbClRa.adDC3e2L) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            fh1Var = null;
            l5Var = null;
            h2Var = null;
            l21Var = null;
            p1Var = null;
            z2 = false;
            bjVar = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            java.lang.Object[] objArr3 = nl0Var2.oh6vYeIP;
            j = 128;
            java.lang.Object[] objArr4 = nl0Var2.r1MBDhnF;
            long[] jArr3 = nl0Var2.IHQe1A4L2xu;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                p1Var = null;
                j2 = 255;
                z2 = false;
                fh1Var2 = null;
                l5Var2 = null;
                h2Var2 = null;
                bjVar = null;
                bool = null;
                l21Var2 = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                java.lang.Object obj = objArr3[i8];
                                java.lang.Object obj2 = objArr4[i8];
                                defpackage.m71 m71Var3 = (defpackage.m71) obj;
                                if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.EgCjBq0SZwJ)) {
                                    obj2.getClass();
                                    p1Var = (defpackage.p1) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.IHQe1A4L2xu)) {
                                    obj2.getClass();
                                    java.lang.CharSequence charSequence = (java.lang.String) defpackage.td.gG5uWf3dqScO((java.util.List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.kd6TUFXn)) {
                                    obj2.getClass();
                                    bjVar = (defpackage.bj) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.fnWB2E7cs)) {
                                    obj2.getClass();
                                    h2Var2 = (defpackage.h2) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.frpfPPIgqM9O)) {
                                    obj2.getClass();
                                    l5Var2 = (defpackage.l5) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.JlrlGoKF)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((java.lang.Boolean) obj2).booleanValue());
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.Uv8CGu3G)) {
                                    obj2.getClass();
                                    num = (java.lang.Integer) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.wll2JLbTBC2)) {
                                    z3 = true;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.cnag84Bm)) {
                                    obj2.getClass();
                                    z = ((java.lang.Boolean) obj2).booleanValue();
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.NHJTzaLwkd)) {
                                    obj2.getClass();
                                    l21Var2 = (defpackage.l21) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.p4kuH6PDtgom)) {
                                    obj2.getClass();
                                    bool = (java.lang.Boolean) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.j71.yIx6ChFVk)) {
                                    obj2.getClass();
                                    fh1Var2 = (defpackage.fh1) obj2;
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.a71.oh6vYeIP)) {
                                    viewStructure.setClickable(true);
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.a71.r1MBDhnF)) {
                                    viewStructure.setLongClickable(true);
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.a71.V7bD7b8KA)) {
                                    viewStructure.setFocusable(true);
                                } else if (defpackage.x70.QoRHpC4k(m71Var3, defpackage.a71.ez2rX8ReCYw)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                p1Var = null;
                z2 = false;
                fh1Var2 = null;
                l5Var2 = null;
                h2Var2 = null;
                bjVar = null;
                bool = null;
                l21Var2 = null;
                z3 = false;
                num = null;
            }
            fh1Var = fh1Var2;
            l5Var = l5Var2;
            h2Var = h2Var2;
            l21Var = l21Var2;
        }
        defpackage.b71 abhbClRa2 = ma0Var.abhbClRa();
        if (abhbClRa2 != null && abhbClRa2.AARZUJiTa && !abhbClRa2.EXtogiMhuM) {
            abhbClRa2 = abhbClRa2.oh6vYeIP();
            defpackage.gl0 gl0Var = new defpackage.gl0(((defpackage.ul0) ma0Var.SyNS6RMn()).adDC3e2L.AARZUJiTa);
            gl0Var.r1MBDhnF(ma0Var.SyNS6RMn());
            while (gl0Var.riuEU0zW4()) {
                defpackage.ma0 ma0Var2 = (defpackage.ma0) gl0Var.ez2rX8ReCYw(gl0Var.oh6vYeIP - 1);
                defpackage.b71 abhbClRa3 = ma0Var2.abhbClRa();
                if (abhbClRa3 != null && !abhbClRa3.AARZUJiTa) {
                    abhbClRa2.adDC3e2L(abhbClRa3);
                    if (!abhbClRa3.EXtogiMhuM) {
                        gl0Var.r1MBDhnF(ma0Var2.SyNS6RMn());
                    }
                }
            }
        }
        if (abhbClRa2 == null || (nl0Var = abhbClRa2.adDC3e2L) == null) {
            i2 = 1;
        } else {
            java.lang.Object[] objArr5 = nl0Var.oh6vYeIP;
            java.lang.Object[] objArr6 = nl0Var.r1MBDhnF;
            long[] jArr4 = nl0Var.IHQe1A4L2xu;
            int length2 = jArr4.length - 2;
            i2 = 1;
            if (length2 >= 0) {
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                java.lang.Object obj3 = objArr5[i14];
                                java.lang.Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                defpackage.m71 m71Var4 = (defpackage.m71) obj3;
                                objArr2 = objArr5;
                                if (defpackage.x70.QoRHpC4k(m71Var4, defpackage.j71.SH1y5HwkJhh)) {
                                    viewStructure.setEnabled(false);
                                } else if (defpackage.x70.QoRHpC4k(m71Var4, defpackage.j71.UsuH8pd5P)) {
                                    obj4.getClass();
                                    list = (java.util.List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ma0Var.xiZrDbcSW0);
                if (ma0Var.V7bD7b8KA() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = p1Var == null ? java.lang.Integer.valueOf(p1Var.IHQe1A4L2xu) : z2 ? java.lang.Integer.valueOf(i2) : fh1Var != null ? java.lang.Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (l5Var != null) {
                    java.lang.String str2 = l5Var.xiZrDbcSW0;
                    if (str2.length() >= 5000) {
                        str2 = (java.lang.Character.isHighSurrogate(str2.charAt(4999)) && java.lang.Character.isLowSurrogate(str2.charAt(5000))) ? defpackage.rc1.JcqDrWrgMf(str2, 4999) : defpackage.rc1.JcqDrWrgMf(str2, 5000);
                    }
                    forText = android.view.autofill.AutofillValue.forText(str2);
                    viewStructure.setAutofillValue(forText);
                }
                if (h2Var != null) {
                    viewStructure.setAutofillValue(h2Var.IHQe1A4L2xu);
                }
                if (bjVar != null && (NHJTzaLwkd3 = defpackage.w70.NHJTzaLwkd(bjVar)) != null) {
                    viewStructure.setAutofillHints(NHJTzaLwkd3);
                }
                mz0Var.oh6vYeIP.EXtogiMhuM(ma0Var.xiZrDbcSW0, new defpackage.lw0(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (fh1Var == null) {
                    viewStructure.setCheckable(i2);
                    viewStructure.setChecked(fh1Var == defpackage.fh1.adDC3e2L);
                } else if (bool != null && (l21Var == null || l21Var.IHQe1A4L2xu != 4)) {
                    z4 = true;
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                    defpackage.bj.IHQe1A4L2xu.getClass();
                    NHJTzaLwkd = defpackage.w70.NHJTzaLwkd(defpackage.aj.oh6vYeIP);
                    NHJTzaLwkd.getClass();
                    if (NHJTzaLwkd.length == 0) {
                        throw new java.util.NoSuchElementException("Array is empty.");
                    }
                    boolean z5 = (z3 || ((bjVar == null || (NHJTzaLwkd2 = defpackage.w70.NHJTzaLwkd(bjVar)) == null || defpackage.t6.JcqDrWrgMf(NHJTzaLwkd2, NHJTzaLwkd[0]) < 0) ? false : z4)) ? z4 : false;
                    viewStructure.setDataIsSensitive((z5 || z) ? z4 : false);
                    viewStructure.setVisibility(ma0Var.yIx6ChFVk.F7NU4MC0GW.a2fq0JBhi5() ? 4 : 0);
                    if (list != null) {
                        int size = list.size();
                        java.lang.String str3 = "";
                        for (int i15 = 0; i15 < size; i15++) {
                            str3 = str3 + ((defpackage.l5) list.get(i15)).xiZrDbcSW0 + '\n';
                        }
                        viewStructure.setText(str3);
                        viewStructure.setClassName("android.widget.TextView");
                    }
                    if (((defpackage.ul0) ma0Var.SyNS6RMn()).isEmpty() && l21Var != null && (yIx6ChFVk = defpackage.a70.yIx6ChFVk(l21Var.IHQe1A4L2xu)) != null) {
                        viewStructure.setClassName(yIx6ChFVk);
                    }
                    if (z2) {
                        viewStructure.setClassName("android.widget.EditText");
                        if (android.os.Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (z5) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z4 = true;
                defpackage.bj.IHQe1A4L2xu.getClass();
                NHJTzaLwkd = defpackage.w70.NHJTzaLwkd(defpackage.aj.oh6vYeIP);
                NHJTzaLwkd.getClass();
                if (NHJTzaLwkd.length == 0) {
                }
            }
        }
        list = null;
        java.lang.Integer valueOf22 = java.lang.Integer.valueOf(ma0Var.xiZrDbcSW0);
        if (ma0Var.V7bD7b8KA() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (p1Var == null) {
        }
        if (valueOf != null) {
        }
        if (l5Var != null) {
        }
        if (h2Var != null) {
        }
        if (bjVar != null) {
            viewStructure.setAutofillHints(NHJTzaLwkd3);
        }
        mz0Var.oh6vYeIP.EXtogiMhuM(ma0Var.xiZrDbcSW0, new defpackage.lw0(viewStructure));
        if (bool != null) {
        }
        if (fh1Var == null) {
        }
        z4 = true;
        defpackage.bj.IHQe1A4L2xu.getClass();
        NHJTzaLwkd = defpackage.w70.NHJTzaLwkd(defpackage.aj.oh6vYeIP);
        NHJTzaLwkd.getClass();
        if (NHJTzaLwkd.length == 0) {
        }
    }

    public static final defpackage.u80 abhbClRa(defpackage.lj ljVar) {
        defpackage.u80 u80Var = (defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS);
        if (u80Var != null) {
            return u80Var;
        }
        defpackage.db.xiZrDbcSW0(ljVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final long adDC3e2L(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static long cnag84Bm(int i, long j) {
        return defpackage.li.IHQe1A4L2xu(0, defpackage.ki.EXtogiMhuM(j), (i & 4) != 0 ? defpackage.ki.riuEU0zW4(j) : 0, defpackage.ki.AARZUJiTa(j));
    }

    public static float ez2rX8ReCYw(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final java.lang.String fnWB2E7cs(long j) {
        java.lang.CharSequence charSequence;
        long j2 = j / 1000;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 > 0) {
            return j3 + "h " + j4 + "m";
        }
        java.lang.String valueOf = java.lang.String.valueOf(j5);
        valueOf.getClass();
        if (2 <= valueOf.length()) {
            charSequence = valueOf.subSequence(0, valueOf.length());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(2);
            int length = 2 - valueOf.length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((java.lang.CharSequence) valueOf);
            charSequence = sb;
        }
        return j4 + ":" + charSequence.toString();
    }

    public static final boolean frpfPPIgqM9O(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static int hkbnNdmy(int i, int i2, java.lang.String str) {
        return (int) lpprD5VAS(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.dg1 hyxIchWRW(defpackage.dg1 dg1Var, defpackage.w90 w90Var) {
        long j;
        defpackage.kf1 kf1Var;
        int i;
        int i2;
        defpackage.vf1 vf1Var;
        defpackage.ob1 ob1Var = dg1Var.IHQe1A4L2xu;
        defpackage.if1 if1Var = defpackage.pb1.F7NU4MC0GW;
        defpackage.if1 if1Var2 = ob1Var.IHQe1A4L2xu;
        if (if1Var2.equals(defpackage.ad1.EXtogiMhuM)) {
            if1Var2 = defpackage.pb1.F7NU4MC0GW;
        }
        defpackage.if1 if1Var3 = if1Var2;
        long j2 = ob1Var.oh6vYeIP;
        defpackage.gg1[] gg1VarArr = defpackage.fg1.oh6vYeIP;
        if ((j2 & 1095216660480L) == 0) {
            j2 = defpackage.pb1.IHQe1A4L2xu;
        }
        long j3 = j2;
        defpackage.dz dzVar = ob1Var.r1MBDhnF;
        if (dzVar == null) {
            dzVar = defpackage.dz.AARZUJiTa;
        }
        defpackage.dz dzVar2 = dzVar;
        defpackage.bz bzVar = ob1Var.F7NU4MC0GW;
        defpackage.bz bzVar2 = new defpackage.bz(bzVar != null ? bzVar.IHQe1A4L2xu : 0);
        defpackage.cz czVar = ob1Var.adDC3e2L;
        defpackage.cz czVar2 = new defpackage.cz(czVar != null ? czVar.IHQe1A4L2xu : 65535);
        defpackage.ne1 ne1Var = ob1Var.xiZrDbcSW0;
        if (ne1Var == null) {
            ne1Var = defpackage.ne1.IHQe1A4L2xu;
        }
        defpackage.ne1 ne1Var2 = ne1Var;
        java.lang.String str = ob1Var.AARZUJiTa;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long j4 = ob1Var.EXtogiMhuM;
        if ((j4 & 1095216660480L) == 0) {
            j4 = defpackage.pb1.oh6vYeIP;
        }
        long j5 = j4;
        defpackage.w7 w7Var = ob1Var.riuEU0zW4;
        float f = w7Var != null ? w7Var.IHQe1A4L2xu : 0.0f;
        defpackage.w7 w7Var2 = new defpackage.w7(java.lang.Float.isNaN(f) ? 0.0f : f);
        defpackage.jf1 jf1Var = ob1Var.SH1y5HwkJhh;
        if (jf1Var == null) {
            jf1Var = defpackage.jf1.r1MBDhnF;
        }
        defpackage.jf1 jf1Var2 = jf1Var;
        defpackage.ff0 ff0Var = ob1Var.ez2rX8ReCYw;
        if (ff0Var == null) {
            defpackage.ff0 ff0Var2 = defpackage.ff0.AARZUJiTa;
            ff0Var = defpackage.a70.cnag84Bm();
        }
        defpackage.ff0 ff0Var3 = ff0Var;
        long j6 = ob1Var.JlrlGoKF;
        if (j6 == 16) {
            j6 = defpackage.pb1.r1MBDhnF;
        }
        long j7 = j6;
        defpackage.ff1 ff1Var = ob1Var.DFo87pBq1E5;
        if (ff1Var == null) {
            ff1Var = defpackage.ff1.oh6vYeIP;
        }
        defpackage.ff1 ff1Var2 = ff1Var;
        defpackage.c91 c91Var = ob1Var.SyNS6RMn;
        if (c91Var == null) {
            c91Var = defpackage.c91.F7NU4MC0GW;
        }
        defpackage.c91 c91Var2 = c91Var;
        defpackage.w70 w70Var = ob1Var.cnag84Bm;
        if (w70Var == null) {
            w70Var = defpackage.nv.WLpAkxCo;
        }
        defpackage.ob1 ob1Var2 = new defpackage.ob1(if1Var3, j3, dzVar2, bzVar2, czVar2, ne1Var2, str2, j5, w7Var2, jf1Var2, ff0Var3, j7, ff1Var2, c91Var2, w70Var);
        defpackage.kt0 kt0Var = dg1Var.oh6vYeIP;
        int i3 = defpackage.lt0.oh6vYeIP;
        int i4 = kt0Var.IHQe1A4L2xu;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = kt0Var.oh6vYeIP;
        if (i6 != 3) {
            if (i6 == 0) {
                int ordinal = w90Var.ordinal();
                if (ordinal == 0) {
                    i6 = 1;
                } else {
                    if (ordinal != 1) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = kt0Var.r1MBDhnF;
            if ((j & 1095216660480L) == 0) {
                j = defpackage.lt0.IHQe1A4L2xu;
            }
            kf1Var = kt0Var.F7NU4MC0GW;
            if (kf1Var == null) {
                kf1Var = defpackage.kf1.r1MBDhnF;
            }
            defpackage.iv0 iv0Var = kt0Var.adDC3e2L;
            defpackage.je0 je0Var = kt0Var.xiZrDbcSW0;
            i = kt0Var.AARZUJiTa;
            if (i == 0) {
                i = defpackage.ee0.oh6vYeIP;
            }
            i2 = kt0Var.EXtogiMhuM;
            if (i2 == 0) {
                i2 = 1;
            }
            vf1Var = kt0Var.riuEU0zW4;
            if (vf1Var == null) {
                vf1Var = defpackage.vf1.r1MBDhnF;
            }
            return new defpackage.dg1(ob1Var2, new defpackage.kt0(i4, i6, j, kf1Var, iv0Var, je0Var, i, i2, vf1Var), dg1Var.r1MBDhnF);
        }
        int ordinal2 = w90Var.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            defpackage.db.F7NU4MC0GW();
            return null;
        }
        i6 = i5;
        j = kt0Var.r1MBDhnF;
        if ((j & 1095216660480L) == 0) {
        }
        kf1Var = kt0Var.F7NU4MC0GW;
        if (kf1Var == null) {
        }
        defpackage.iv0 iv0Var2 = kt0Var.adDC3e2L;
        defpackage.je0 je0Var2 = kt0Var.xiZrDbcSW0;
        i = kt0Var.AARZUJiTa;
        if (i == 0) {
        }
        i2 = kt0Var.EXtogiMhuM;
        if (i2 == 0) {
        }
        vf1Var = kt0Var.riuEU0zW4;
        if (vf1Var == null) {
        }
        return new defpackage.dg1(ob1Var2, new defpackage.kt0(i4, i6, j, kf1Var, iv0Var2, je0Var2, i, i2, vf1Var), dg1Var.r1MBDhnF);
    }

    public static final java.util.ArrayList kNAkVymC(defpackage.t70 t70Var) {
        t70Var.getClass();
        defpackage.ma0 boH8X4DXyc4 = ((defpackage.zf0) t70Var).boH8X4DXyc4();
        boolean v5iciZok = v5iciZok(boH8X4DXyc4);
        defpackage.ul0 ul0Var = (defpackage.ul0) boH8X4DXyc4.cnag84Bm();
        defpackage.xl0 xl0Var = ul0Var.adDC3e2L;
        java.util.ArrayList arrayList = new java.util.ArrayList(xl0Var.AARZUJiTa);
        int i = xl0Var.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.ma0 ma0Var = (defpackage.ma0) ul0Var.get(i2);
            arrayList.add(v5iciZok ? ma0Var.JlrlGoKF() : ma0Var.DFo87pBq1E5());
        }
        return arrayList;
    }

    public static final int kd6TUFXn(int i, defpackage.oc0 oc0Var, java.lang.Object obj) {
        int r1MBDhnF2;
        return (obj == null || oc0Var.r1MBDhnF() == 0 || (i < oc0Var.r1MBDhnF() && obj.equals(oc0Var.F7NU4MC0GW(i))) || (r1MBDhnF2 = oc0Var.F7NU4MC0GW.r1MBDhnF(obj)) == -1) ? i : r1MBDhnF2;
    }

    public static final long lpprD5VAS(java.lang.String str, long j, long j2, long j3) {
        java.lang.String str2;
        boolean z;
        int i = defpackage.oe1.IHQe1A4L2xu;
        java.lang.Long l = null;
        try {
            str2 = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        int i2 = 10;
        defpackage.x70.G3OKOH3wZRC(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (defpackage.x70.kNAkVymC(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i3 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (true) {
                if (i3 < length) {
                    int digit = java.lang.Character.digit((int) str2.charAt(i3), i2);
                    if (digit < 0) {
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                        }
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    int i4 = length;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        break;
                    }
                    j5 = j7 - j8;
                    i3++;
                    length = i4;
                    i2 = 10;
                } else {
                    l = z ? java.lang.Long.valueOf(j5) : java.lang.Long.valueOf(-j5);
                }
            }
        }
        if (l == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final void mAr5m2L7gYDP(java.lang.Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final boolean nBH8hAHy(defpackage.lj ljVar) {
        defpackage.u80 u80Var = (defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS);
        if (u80Var != null) {
            return u80Var.oh6vYeIP();
        }
        return true;
    }

    public static final defpackage.fo0 oh6vYeIP(android.window.BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new defpackage.fo0(swipeEdge, progress, touchX, touchY, android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void p4kuH6PDtgom(defpackage.qn0 qn0Var, java.lang.String str) {
        defpackage.xd0 xd0Var;
        defpackage.nd0 nd0Var;
        qn0Var.getClass();
        defpackage.ym0 ym0Var = qn0Var.oh6vYeIP;
        defpackage.nm0 AARZUJiTa = ym0Var.AARZUJiTa();
        if (AARZUJiTa == null || (xd0Var = AARZUJiTa.JlrlGoKF.SH1y5HwkJhh) == null || (nd0Var = xd0Var.EXtogiMhuM) == null || nd0Var.compareTo(defpackage.nd0.riuEU0zW4) < 0) {
            return;
        }
        ym0Var.DFo87pBq1E5(str, null);
    }

    public static final void r1MBDhnF(defpackage.mj0 mj0Var, defpackage.k00 k00Var, defpackage.k00 k00Var2, defpackage.k00 k00Var3, defpackage.k00 k00Var4, int i, final long j, long j2, final defpackage.nn1 nn1Var, final defpackage.sf sfVar, defpackage.t10 t10Var, final int i2) {
        final defpackage.mj0 mj0Var2;
        final defpackage.k00 k00Var5;
        final defpackage.k00 k00Var6;
        final defpackage.k00 k00Var7;
        final defpackage.k00 k00Var8;
        final int i3;
        final long j3;
        long j4;
        int i4;
        defpackage.k00 k00Var9;
        boolean z;
        defpackage.k00 k00Var10;
        defpackage.k00 k00Var11;
        defpackage.k00 k00Var12;
        int i5;
        defpackage.mj0 mj0Var3;
        boolean z2;
        long j5;
        t10Var.QUKZkWRtw6(-1211482744);
        int i6 = i2 | 4418998 | (t10Var.xiZrDbcSW0(nn1Var) ? 67108864 : 33554432);
        if (t10Var.lpprD5VAS(i6 & 1, (306783379 & i6) != 306783378)) {
            t10Var.Ye0N2xE9Hc();
            if ((i2 & 1) == 0 || t10Var.NHJTzaLwkd()) {
                defpackage.sf sfVar2 = defpackage.zf.IHQe1A4L2xu;
                defpackage.sf sfVar3 = defpackage.zf.oh6vYeIP;
                defpackage.sf sfVar4 = defpackage.zf.r1MBDhnF;
                defpackage.sf sfVar5 = defpackage.zf.F7NU4MC0GW;
                j4 = j;
                long oh6vYeIP2 = defpackage.he.oh6vYeIP(j4, t10Var);
                i4 = i6 & (-29360129);
                k00Var9 = sfVar2;
                z = false;
                k00Var10 = sfVar3;
                k00Var11 = sfVar4;
                k00Var12 = sfVar5;
                i5 = 2;
                mj0Var3 = defpackage.jj0.IHQe1A4L2xu;
                z2 = true;
                j5 = oh6vYeIP2;
            } else {
                t10Var.WLpAkxCo();
                i4 = i6 & (-29360129);
                mj0Var3 = mj0Var;
                k00Var9 = k00Var;
                k00Var10 = k00Var2;
                k00Var11 = k00Var3;
                k00Var12 = k00Var4;
                i5 = i;
                j4 = j;
                z = false;
                z2 = true;
                j5 = j2;
            }
            t10Var.G3OKOH3wZRC();
            int i7 = (234881024 & i4) ^ 100663296;
            boolean z3 = ((i7 <= 67108864 || !t10Var.xiZrDbcSW0(nn1Var)) && (i4 & 100663296) != 67108864) ? z : z2;
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj = defpackage.bh.IHQe1A4L2xu;
            if (z3 || mAr5m2L7gYDP == obj) {
                mAr5m2L7gYDP = new defpackage.zl0(nn1Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.zl0 zl0Var = (defpackage.zl0) mAr5m2L7gYDP;
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(zl0Var);
            if ((i7 <= 67108864 || !t10Var.xiZrDbcSW0(nn1Var)) && (i4 & 100663296) != 67108864) {
                z2 = z;
            }
            boolean z4 = xiZrDbcSW0 | z2;
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (z4 || mAr5m2L7gYDP2 == obj) {
                mAr5m2L7gYDP2 = new defpackage.r1MBDhnF(23, zl0Var, nn1Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            defpackage.xd1.IHQe1A4L2xu(defpackage.x70.hyxIchWRW(mj0Var3, (defpackage.g00) mAr5m2L7gYDP2), null, j4, j5, 0.0f, defpackage.h1.XZx205DYe(848889571, new defpackage.w41(i5, k00Var9, sfVar, k00Var11, k00Var12, zl0Var, k00Var10), t10Var), t10Var, 12583296, 114);
            j3 = j5;
            mj0Var2 = mj0Var3;
            i3 = i5;
            k00Var5 = k00Var9;
            k00Var7 = k00Var11;
            k00Var8 = k00Var12;
            k00Var6 = k00Var10;
        } else {
            t10Var.WLpAkxCo();
            mj0Var2 = mj0Var;
            k00Var5 = k00Var;
            k00Var6 = k00Var2;
            k00Var7 = k00Var3;
            k00Var8 = k00Var4;
            i3 = i;
            j3 = j2;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(k00Var5, k00Var6, k00Var7, k00Var8, i3, j, j3, nn1Var, sfVar, i2) { // from class: v41
                public final /* synthetic */ defpackage.k00 AARZUJiTa;
                public final /* synthetic */ defpackage.nn1 DFo87pBq1E5;
                public final /* synthetic */ defpackage.k00 EXtogiMhuM;
                public final /* synthetic */ long JlrlGoKF;
                public final /* synthetic */ int SH1y5HwkJhh;
                public final /* synthetic */ defpackage.sf SyNS6RMn;
                public final /* synthetic */ long ez2rX8ReCYw;
                public final /* synthetic */ defpackage.k00 riuEU0zW4;
                public final /* synthetic */ defpackage.k00 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(806879233);
                    defpackage.x80.r1MBDhnF(defpackage.mj0.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, (defpackage.t10) obj2, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void riuEU0zW4(defpackage.lj ljVar, java.util.concurrent.CancellationException cancellationException) {
        defpackage.u80 u80Var = (defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS);
        if (u80Var != null) {
            u80Var.F7NU4MC0GW(cancellationException);
        }
    }

    public static final boolean v5iciZok(defpackage.ma0 ma0Var) {
        int ordinal = ma0Var.wll2JLbTBC2.F7NU4MC0GW.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            defpackage.db.F7NU4MC0GW();
                            return false;
                        }
                        defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
                        if (V7bD7b8KA != null) {
                            return v5iciZok(V7bD7b8KA);
                        }
                        defpackage.db.fnWB2E7cs("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void wll2JLbTBC2(defpackage.qn0 qn0Var) {
        defpackage.xd0 xd0Var;
        defpackage.nd0 nd0Var;
        qn0Var.getClass();
        defpackage.nm0 AARZUJiTa = qn0Var.oh6vYeIP.AARZUJiTa();
        if (AARZUJiTa == null || (xd0Var = AARZUJiTa.JlrlGoKF.SH1y5HwkJhh) == null || (nd0Var = xd0Var.EXtogiMhuM) == null || nd0Var.compareTo(defpackage.nd0.riuEU0zW4) < 0) {
            return;
        }
        qn0Var.IHQe1A4L2xu();
    }

    public static final java.lang.String xiZrDbcSW0(java.lang.Object[] objArr, int i, int i2, defpackage.UsuH8pd5P usuH8pd5P) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = objArr[i + i3];
            if (obj == usuH8pd5P) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void yIx6ChFVk(defpackage.qn0 qn0Var, java.lang.String str, defpackage.g00 g00Var) {
        defpackage.xd0 xd0Var;
        defpackage.nd0 nd0Var;
        qn0Var.getClass();
        defpackage.ym0 ym0Var = qn0Var.oh6vYeIP;
        defpackage.nm0 AARZUJiTa = ym0Var.AARZUJiTa();
        if (AARZUJiTa == null || (xd0Var = AARZUJiTa.JlrlGoKF.SH1y5HwkJhh) == null || (nd0Var = xd0Var.EXtogiMhuM) == null || nd0Var.compareTo(defpackage.nd0.riuEU0zW4) < 0) {
            return;
        }
        ym0Var.DFo87pBq1E5(str, defpackage.j70.NHJTzaLwkd(g00Var));
    }
}
