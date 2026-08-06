package defpackage;

/* loaded from: classes.dex */
public final class d21 extends defpackage.ie {
    public static final defpackage.db kd6TUFXn = new defpackage.db(23);
    public final defpackage.bi1 AARZUJiTa;
    public final defpackage.z11 DFo87pBq1E5;
    public final float[] EXtogiMhuM;
    public final defpackage.kn1 F7NU4MC0GW;
    public final boolean G3OKOH3wZRC;
    public final defpackage.c21 JlrlGoKF;
    public final defpackage.z11 QoRHpC4k;
    public final float[] SH1y5HwkJhh;
    public final defpackage.sq SyNS6RMn;
    public final float adDC3e2L;
    public final defpackage.c21 cnag84Bm;
    public final defpackage.sq ez2rX8ReCYw;
    public final float[] riuEU0zW4;
    public final float xiZrDbcSW0;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e0, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d21(java.lang.String str, float[] fArr, defpackage.kn1 kn1Var, float[] fArr2, defpackage.sq sqVar, defpackage.sq sqVar2, float f, float f2, defpackage.bi1 bi1Var, int i) {
        super(str, 12884901888L, i);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        this.F7NU4MC0GW = kn1Var;
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = f2;
        this.AARZUJiTa = bi1Var;
        this.ez2rX8ReCYw = sqVar;
        int i2 = 1;
        this.JlrlGoKF = new defpackage.c21(this, i2);
        int i3 = 0;
        this.DFo87pBq1E5 = new defpackage.z11(this, i3);
        this.SyNS6RMn = sqVar2;
        this.cnag84Bm = new defpackage.c21(this, i3);
        this.QoRHpC4k = new defpackage.z11(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            defpackage.db.fnWB2E7cs("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new java.lang.IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            java.lang.System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.EXtogiMhuM = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = kn1Var.IHQe1A4L2xu;
            r44 = 1;
            float f21 = kn1Var.oh6vYeIP;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.riuEU0zW4 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new java.lang.IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.riuEU0zW4 = fArr2;
        }
        this.SH1y5HwkJhh = defpackage.ci0.yIx6ChFVk(this.riuEU0zW4);
        float EXtogiMhuM = defpackage.j70.EXtogiMhuM(fArr3);
        float[] fArr4 = defpackage.le.IHQe1A4L2xu;
        if (EXtogiMhuM / defpackage.j70.EXtogiMhuM(defpackage.le.oh6vYeIP) > 0.9f) {
            float[] fArr5 = defpackage.le.IHQe1A4L2xu;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[r44];
            float f41 = fArr5[r44];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[0] = f38 - f39;
            fArr6[r44] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[0];
            float f51 = fArr6[r44];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                    }
                }
            }
        } else {
            f4 = 0.0f;
        }
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = defpackage.le.IHQe1A4L2xu;
            if (fArr3 != fArr7) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (java.lang.Float.compare(fArr3[i5], fArr7[i5]) != 0 && java.lang.Math.abs(fArr3[i5] - fArr7[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (defpackage.ci0.G3OKOH3wZRC(kn1Var, defpackage.mj1.ez2rX8ReCYw) && f == f4 && f2 == f3) {
                float[] fArr8 = defpackage.le.IHQe1A4L2xu;
                defpackage.d21 d21Var = defpackage.le.adDC3e2L;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (java.lang.Math.abs(sqVar.r1MBDhnF(d) - d21Var.ez2rX8ReCYw.r1MBDhnF(d)) <= 0.001d && java.lang.Math.abs(sqVar2.r1MBDhnF(d) - d21Var.SyNS6RMn.r1MBDhnF(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.G3OKOH3wZRC = z;
        }
        z = r44;
        this.G3OKOH3wZRC = z;
    }

    @Override // defpackage.ie
    public final long F7NU4MC0GW(float f, float f2, float f3) {
        double d = f;
        defpackage.z11 z11Var = this.QoRHpC4k;
        float r1MBDhnF = (float) z11Var.r1MBDhnF(d);
        float r1MBDhnF2 = (float) z11Var.r1MBDhnF(f2);
        float r1MBDhnF3 = (float) z11Var.r1MBDhnF(f3);
        float[] fArr = this.riuEU0zW4;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * r1MBDhnF3) + (fArr[3] * r1MBDhnF2) + (fArr[0] * r1MBDhnF);
        float f5 = (fArr[7] * r1MBDhnF3) + (fArr[4] * r1MBDhnF2) + (fArr[1] * r1MBDhnF);
        return (java.lang.Float.floatToRawIntBits(f4) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.ie
    public final float IHQe1A4L2xu(int i) {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.ie
    public final float adDC3e2L(float f, float f2, float f3) {
        double d = f;
        defpackage.z11 z11Var = this.QoRHpC4k;
        float r1MBDhnF = (float) z11Var.r1MBDhnF(d);
        float r1MBDhnF2 = (float) z11Var.r1MBDhnF(f2);
        float r1MBDhnF3 = (float) z11Var.r1MBDhnF(f3);
        float[] fArr = this.riuEU0zW4;
        return (fArr[8] * r1MBDhnF3) + (fArr[5] * r1MBDhnF2) + (fArr[2] * r1MBDhnF);
    }

    @Override // defpackage.ie
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.d21.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        defpackage.d21 d21Var = (defpackage.d21) obj;
        if (java.lang.Float.compare(d21Var.adDC3e2L, this.adDC3e2L) != 0 || java.lang.Float.compare(d21Var.xiZrDbcSW0, this.xiZrDbcSW0) != 0 || !defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, d21Var.F7NU4MC0GW) || !java.util.Arrays.equals(this.EXtogiMhuM, d21Var.EXtogiMhuM)) {
            return false;
        }
        defpackage.bi1 bi1Var = d21Var.AARZUJiTa;
        defpackage.bi1 bi1Var2 = this.AARZUJiTa;
        if (bi1Var2 != null) {
            return defpackage.x70.QoRHpC4k(bi1Var2, bi1Var);
        }
        if (bi1Var == null) {
            return true;
        }
        if (defpackage.x70.QoRHpC4k(this.ez2rX8ReCYw, d21Var.ez2rX8ReCYw)) {
            return defpackage.x70.QoRHpC4k(this.SyNS6RMn, d21Var.SyNS6RMn);
        }
        return false;
    }

    @Override // defpackage.ie
    public final int hashCode() {
        int hashCode = (java.util.Arrays.hashCode(this.EXtogiMhuM) + ((this.F7NU4MC0GW.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.adDC3e2L;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : java.lang.Float.floatToIntBits(f))) * 31;
        float f2 = this.xiZrDbcSW0;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f2))) * 31;
        defpackage.bi1 bi1Var = this.AARZUJiTa;
        int hashCode2 = floatToIntBits2 + (bi1Var != null ? bi1Var.hashCode() : 0);
        if (bi1Var != null) {
            return hashCode2;
        }
        return this.SyNS6RMn.hashCode() + ((this.ez2rX8ReCYw.hashCode() + (hashCode2 * 31)) * 31);
    }

    @Override // defpackage.ie
    public final float oh6vYeIP(int i) {
        return this.adDC3e2L;
    }

    @Override // defpackage.ie
    public final boolean r1MBDhnF() {
        return this.G3OKOH3wZRC;
    }

    @Override // defpackage.ie
    public final long xiZrDbcSW0(float f, float f2, float f3, float f4, defpackage.ie ieVar) {
        float[] fArr = this.SH1y5HwkJhh;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        defpackage.z11 z11Var = this.DFo87pBq1E5;
        return defpackage.w70.r1MBDhnF((float) z11Var.r1MBDhnF(f5), (float) z11Var.r1MBDhnF(f6), (float) z11Var.r1MBDhnF(f7), f4, ieVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d21(java.lang.String str, float[] fArr, defpackage.kn1 kn1Var, final defpackage.bi1 bi1Var, int i) {
        this(str, fArr, kn1Var, null, r4, r0, 0.0f, 1.0f, bi1Var, i);
        double d;
        defpackage.sq sqVar;
        defpackage.sq sqVar2;
        double d2 = bi1Var.IHQe1A4L2xu;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = bi1Var.AARZUJiTa;
        double d4 = bi1Var.xiZrDbcSW0;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            sqVar = new defpackage.sq() { // from class: b21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d5) {
                    int i5 = i4;
                    defpackage.bi1 bi1Var2 = bi1Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.r1MBDhnF(bi1Var2, d5);
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = bi1Var2.oh6vYeIP;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = bi1Var2.oh6vYeIP;
                            double d8 = bi1Var2.r1MBDhnF;
                            double d9 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.oh6vYeIP(bi1Var2, d5);
                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = bi1Var2.oh6vYeIP;
                            double d11 = bi1Var2.r1MBDhnF;
                            double d12 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = bi1Var2.oh6vYeIP;
                            double d14 = bi1Var2.r1MBDhnF;
                            double d15 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                sqVar = new defpackage.sq() { // from class: b21
                    @Override // defpackage.sq
                    public final double r1MBDhnF(double d5) {
                        int i52 = i5;
                        defpackage.bi1 bi1Var2 = bi1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                            case 1:
                                float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.r1MBDhnF(bi1Var2, d5);
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = bi1Var2.oh6vYeIP;
                                return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = bi1Var2.oh6vYeIP;
                                double d8 = bi1Var2.r1MBDhnF;
                                double d9 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.oh6vYeIP(bi1Var2, d5);
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = bi1Var2.oh6vYeIP;
                                double d11 = bi1Var2.r1MBDhnF;
                                double d12 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = bi1Var2.oh6vYeIP;
                                double d14 = bi1Var2.r1MBDhnF;
                                double d15 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                sqVar = new defpackage.sq() { // from class: b21
                    @Override // defpackage.sq
                    public final double r1MBDhnF(double d5) {
                        int i52 = i6;
                        defpackage.bi1 bi1Var2 = bi1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                            case 1:
                                float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.r1MBDhnF(bi1Var2, d5);
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = bi1Var2.oh6vYeIP;
                                return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = bi1Var2.oh6vYeIP;
                                double d8 = bi1Var2.r1MBDhnF;
                                double d9 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.oh6vYeIP(bi1Var2, d5);
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = bi1Var2.oh6vYeIP;
                                double d11 = bi1Var2.r1MBDhnF;
                                double d12 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = bi1Var2.oh6vYeIP;
                                double d14 = bi1Var2.r1MBDhnF;
                                double d15 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                sqVar = new defpackage.sq() { // from class: b21
                    @Override // defpackage.sq
                    public final double r1MBDhnF(double d5) {
                        int i52 = i7;
                        defpackage.bi1 bi1Var2 = bi1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                            case 1:
                                float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.r1MBDhnF(bi1Var2, d5);
                            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                                double d6 = bi1Var2.oh6vYeIP;
                                return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = bi1Var2.oh6vYeIP;
                                double d8 = bi1Var2.r1MBDhnF;
                                double d9 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                                float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.oh6vYeIP(bi1Var2, d5);
                            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                                return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = bi1Var2.oh6vYeIP;
                                double d11 = bi1Var2.r1MBDhnF;
                                double d12 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = bi1Var2.oh6vYeIP;
                                double d14 = bi1Var2.r1MBDhnF;
                                double d15 = bi1Var2.F7NU4MC0GW;
                                return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            sqVar2 = new defpackage.sq() { // from class: b21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d5) {
                    int i52 = i2;
                    defpackage.bi1 bi1Var2 = bi1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.r1MBDhnF(bi1Var2, d5);
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = bi1Var2.oh6vYeIP;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = bi1Var2.oh6vYeIP;
                            double d8 = bi1Var2.r1MBDhnF;
                            double d9 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.oh6vYeIP(bi1Var2, d5);
                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = bi1Var2.oh6vYeIP;
                            double d11 = bi1Var2.r1MBDhnF;
                            double d12 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = bi1Var2.oh6vYeIP;
                            double d14 = bi1Var2.r1MBDhnF;
                            double d15 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            sqVar2 = new defpackage.sq() { // from class: b21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d5) {
                    int i52 = i3;
                    defpackage.bi1 bi1Var2 = bi1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.r1MBDhnF(bi1Var2, d5);
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = bi1Var2.oh6vYeIP;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = bi1Var2.oh6vYeIP;
                            double d8 = bi1Var2.r1MBDhnF;
                            double d9 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.oh6vYeIP(bi1Var2, d5);
                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = bi1Var2.oh6vYeIP;
                            double d11 = bi1Var2.r1MBDhnF;
                            double d12 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = bi1Var2.oh6vYeIP;
                            double d14 = bi1Var2.r1MBDhnF;
                            double d15 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            sqVar2 = new defpackage.sq() { // from class: b21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d5) {
                    int i52 = i8;
                    defpackage.bi1 bi1Var2 = bi1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.r1MBDhnF(bi1Var2, d5);
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = bi1Var2.oh6vYeIP;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = bi1Var2.oh6vYeIP;
                            double d8 = bi1Var2.r1MBDhnF;
                            double d9 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.oh6vYeIP(bi1Var2, d5);
                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = bi1Var2.oh6vYeIP;
                            double d11 = bi1Var2.r1MBDhnF;
                            double d12 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = bi1Var2.oh6vYeIP;
                            double d14 = bi1Var2.r1MBDhnF;
                            double d15 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            sqVar2 = new defpackage.sq() { // from class: b21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d5) {
                    int i52 = i9;
                    defpackage.bi1 bi1Var2 = bi1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.IHQe1A4L2xu(bi1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.r1MBDhnF(bi1Var2, d5);
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            double d6 = bi1Var2.oh6vYeIP;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d6 * d5) + bi1Var2.r1MBDhnF, bi1Var2.IHQe1A4L2xu) : bi1Var2.F7NU4MC0GW * d5;
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = bi1Var2.oh6vYeIP;
                            double d8 = bi1Var2.r1MBDhnF;
                            double d9 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L ? java.lang.Math.pow((d7 * d5) + d8, bi1Var2.IHQe1A4L2xu) + bi1Var2.xiZrDbcSW0 : (d9 * d5) + bi1Var2.AARZUJiTa;
                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.oh6vYeIP(bi1Var2, d5);
                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = defpackage.le.IHQe1A4L2xu;
                            return defpackage.le.F7NU4MC0GW(bi1Var2, d5);
                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = bi1Var2.oh6vYeIP;
                            double d11 = bi1Var2.r1MBDhnF;
                            double d12 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d12 ? (java.lang.Math.pow(d5, 1.0d / bi1Var2.IHQe1A4L2xu) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = bi1Var2.oh6vYeIP;
                            double d14 = bi1Var2.r1MBDhnF;
                            double d15 = bi1Var2.F7NU4MC0GW;
                            return d5 >= bi1Var2.adDC3e2L * d15 ? (java.lang.Math.pow(d5 - bi1Var2.xiZrDbcSW0, 1.0d / bi1Var2.IHQe1A4L2xu) - d14) / d13 : (d5 - bi1Var2.AARZUJiTa) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d21(java.lang.String str, float[] fArr, defpackage.kn1 kn1Var, final double d, float f, float f2, int i) {
        this(str, fArr, kn1Var, null, r11, r3, f, f2, new defpackage.bi1(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        defpackage.sq sqVar;
        defpackage.sq sqVar2 = kd6TUFXn;
        if (d == 1.0d) {
            sqVar = sqVar2;
        } else {
            final int i2 = 0;
            sqVar = new defpackage.sq() { // from class: a21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return java.lang.Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return java.lang.Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            sqVar2 = new defpackage.sq() { // from class: a21
                @Override // defpackage.sq
                public final double r1MBDhnF(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return java.lang.Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return java.lang.Math.pow(d2, d);
                    }
                }
            };
        }
    }
}
