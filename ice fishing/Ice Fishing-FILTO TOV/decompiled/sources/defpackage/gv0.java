package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gv0 extends gc {
    public static final o4 Mjvvu5DE = new o4(25);
    public final fa1 AvO7iQsrTN;
    public final fv0 E7jCp8Ls;
    public final float EljAMC1QTz;
    public final float[] JFJ3QoxA;
    public final float OOA6hdeuvCS;
    public final cv0 WIEu4Ya2g8;
    public final cv0 XnEVoBF0td1l;
    public final boolean YmKjaVtbfp5Z;
    public final float[] encWxUiV2;
    public final fv0 iwATDS1i01k;
    public final float[] mOu10nynGul;
    public final an rQPn8YBR;
    public final an uFEq9NpZ;
    public final nf1 xqGvceK5x;

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
    public gv0(String str, float[] fArr, nf1 nf1Var, float[] fArr2, an anVar, an anVar2, float f, float f2, fa1 fa1Var, int i) {
        super(str, 12884901888L, i);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        this.xqGvceK5x = nf1Var;
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = f2;
        this.AvO7iQsrTN = fa1Var;
        this.rQPn8YBR = anVar;
        int i2 = 1;
        this.E7jCp8Ls = new fv0(this, i2);
        int i3 = 0;
        this.XnEVoBF0td1l = new cv0(this, i3);
        this.uFEq9NpZ = anVar2;
        this.iwATDS1i01k = new fv0(this, i3);
        this.WIEu4Ya2g8 = new cv0(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            o4.mE4lRynR("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
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
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.encWxUiV2 = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = nf1Var.GWasM1elztuh;
            r44 = 1;
            float f21 = nf1Var.Yi7zF1RB1;
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
            this.mOu10nynGul = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.mOu10nynGul = fArr2;
        }
        this.JFJ3QoxA = qj.ozMwhSAI(this.mOu10nynGul);
        float xqGvceK5x = z50.xqGvceK5x(fArr3);
        float[] fArr4 = jc.GWasM1elztuh;
        if (xqGvceK5x / z50.xqGvceK5x(jc.Yi7zF1RB1) > 0.9f) {
            float[] fArr5 = jc.GWasM1elztuh;
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
            float[] fArr7 = jc.GWasM1elztuh;
            if (fArr3 != fArr7) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (Float.compare(fArr3[i5], fArr7[i5]) != 0 && Math.abs(fArr3[i5] - fArr7[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (qj.uFEq9NpZ(nf1Var, ki1.AvO7iQsrTN) && f == f4 && f2 == f3) {
                float[] fArr8 = jc.GWasM1elztuh;
                gv0 gv0Var = jc.OOA6hdeuvCS;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(anVar.X1lG3V04pd(d) - gv0Var.rQPn8YBR.X1lG3V04pd(d)) <= 0.001d && Math.abs(anVar2.X1lG3V04pd(d) - gv0Var.uFEq9NpZ.X1lG3V04pd(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.YmKjaVtbfp5Z = z;
        }
        z = r44;
        this.YmKjaVtbfp5Z = z;
    }

    @Override // defpackage.gc
    public final long EljAMC1QTz(float f, float f2, float f3, float f4, gc gcVar) {
        float[] fArr = this.JFJ3QoxA;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        cv0 cv0Var = this.XnEVoBF0td1l;
        return ki1.Yi7zF1RB1((float) cv0Var.X1lG3V04pd(f5), (float) cv0Var.X1lG3V04pd(f6), (float) cv0Var.X1lG3V04pd(f7), f4, gcVar);
    }

    @Override // defpackage.gc
    public final float GWasM1elztuh(int i) {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.gc
    public final float OOA6hdeuvCS(float f, float f2, float f3) {
        double d = f;
        cv0 cv0Var = this.WIEu4Ya2g8;
        float X1lG3V04pd = (float) cv0Var.X1lG3V04pd(d);
        float X1lG3V04pd2 = (float) cv0Var.X1lG3V04pd(f2);
        float X1lG3V04pd3 = (float) cv0Var.X1lG3V04pd(f3);
        float[] fArr = this.mOu10nynGul;
        return (fArr[8] * X1lG3V04pd3) + (fArr[5] * X1lG3V04pd2) + (fArr[2] * X1lG3V04pd);
    }

    @Override // defpackage.gc
    public final boolean X1lG3V04pd() {
        return this.YmKjaVtbfp5Z;
    }

    @Override // defpackage.gc
    public final float Yi7zF1RB1(int i) {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.gc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gv0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        gv0 gv0Var = (gv0) obj;
        if (Float.compare(gv0Var.OOA6hdeuvCS, this.OOA6hdeuvCS) != 0 || Float.compare(gv0Var.EljAMC1QTz, this.EljAMC1QTz) != 0 || !o30.rQPn8YBR(this.xqGvceK5x, gv0Var.xqGvceK5x) || !Arrays.equals(this.encWxUiV2, gv0Var.encWxUiV2)) {
            return false;
        }
        fa1 fa1Var = gv0Var.AvO7iQsrTN;
        fa1 fa1Var2 = this.AvO7iQsrTN;
        if (fa1Var2 != null) {
            return o30.rQPn8YBR(fa1Var2, fa1Var);
        }
        if (fa1Var == null) {
            return true;
        }
        if (o30.rQPn8YBR(this.rQPn8YBR, gv0Var.rQPn8YBR)) {
            return o30.rQPn8YBR(this.uFEq9NpZ, gv0Var.uFEq9NpZ);
        }
        return false;
    }

    @Override // defpackage.gc
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.encWxUiV2) + ((this.xqGvceK5x.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.OOA6hdeuvCS;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.EljAMC1QTz;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        fa1 fa1Var = this.AvO7iQsrTN;
        int hashCode2 = floatToIntBits2 + (fa1Var != null ? fa1Var.hashCode() : 0);
        if (fa1Var != null) {
            return hashCode2;
        }
        return this.uFEq9NpZ.hashCode() + ((this.rQPn8YBR.hashCode() + (hashCode2 * 31)) * 31);
    }

    @Override // defpackage.gc
    public final long xqGvceK5x(float f, float f2, float f3) {
        double d = f;
        cv0 cv0Var = this.WIEu4Ya2g8;
        float X1lG3V04pd = (float) cv0Var.X1lG3V04pd(d);
        float X1lG3V04pd2 = (float) cv0Var.X1lG3V04pd(f2);
        float X1lG3V04pd3 = (float) cv0Var.X1lG3V04pd(f3);
        float[] fArr = this.mOu10nynGul;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * X1lG3V04pd3) + (fArr[3] * X1lG3V04pd2) + (fArr[0] * X1lG3V04pd);
        float f5 = (fArr[7] * X1lG3V04pd3) + (fArr[4] * X1lG3V04pd2) + (fArr[1] * X1lG3V04pd);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gv0(String str, float[] fArr, nf1 nf1Var, final fa1 fa1Var, int i) {
        this(str, fArr, nf1Var, null, r4, r0, 0.0f, 1.0f, fa1Var, i);
        double d;
        an anVar;
        an anVar2;
        double d2 = fa1Var.GWasM1elztuh;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = fa1Var.AvO7iQsrTN;
        double d4 = fa1Var.EljAMC1QTz;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            anVar = new an() { // from class: ev0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d5) {
                    int i5 = i4;
                    fa1 fa1Var2 = fa1Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = jc.GWasM1elztuh;
                            return jc.GWasM1elztuh(fa1Var2, d5);
                        case 1:
                            float[] fArr3 = jc.GWasM1elztuh;
                            return jc.X1lG3V04pd(fa1Var2, d5);
                        case 2:
                            double d6 = fa1Var2.Yi7zF1RB1;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = fa1Var2.Yi7zF1RB1;
                            double d8 = fa1Var2.X1lG3V04pd;
                            double d9 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                        case 4:
                            float[] fArr4 = jc.GWasM1elztuh;
                            return jc.Yi7zF1RB1(fa1Var2, d5);
                        case 5:
                            float[] fArr5 = jc.GWasM1elztuh;
                            return jc.xqGvceK5x(fa1Var2, d5);
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = fa1Var2.Yi7zF1RB1;
                            double d11 = fa1Var2.X1lG3V04pd;
                            double d12 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = fa1Var2.Yi7zF1RB1;
                            double d14 = fa1Var2.X1lG3V04pd;
                            double d15 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                anVar = new an() { // from class: ev0
                    @Override // defpackage.an
                    public final double X1lG3V04pd(double d5) {
                        int i52 = i5;
                        fa1 fa1Var2 = fa1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = jc.GWasM1elztuh;
                                return jc.GWasM1elztuh(fa1Var2, d5);
                            case 1:
                                float[] fArr3 = jc.GWasM1elztuh;
                                return jc.X1lG3V04pd(fa1Var2, d5);
                            case 2:
                                double d6 = fa1Var2.Yi7zF1RB1;
                                return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = fa1Var2.Yi7zF1RB1;
                                double d8 = fa1Var2.X1lG3V04pd;
                                double d9 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                            case 4:
                                float[] fArr4 = jc.GWasM1elztuh;
                                return jc.Yi7zF1RB1(fa1Var2, d5);
                            case 5:
                                float[] fArr5 = jc.GWasM1elztuh;
                                return jc.xqGvceK5x(fa1Var2, d5);
                            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = fa1Var2.Yi7zF1RB1;
                                double d11 = fa1Var2.X1lG3V04pd;
                                double d12 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = fa1Var2.Yi7zF1RB1;
                                double d14 = fa1Var2.X1lG3V04pd;
                                double d15 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                anVar = new an() { // from class: ev0
                    @Override // defpackage.an
                    public final double X1lG3V04pd(double d5) {
                        int i52 = i6;
                        fa1 fa1Var2 = fa1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = jc.GWasM1elztuh;
                                return jc.GWasM1elztuh(fa1Var2, d5);
                            case 1:
                                float[] fArr3 = jc.GWasM1elztuh;
                                return jc.X1lG3V04pd(fa1Var2, d5);
                            case 2:
                                double d6 = fa1Var2.Yi7zF1RB1;
                                return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = fa1Var2.Yi7zF1RB1;
                                double d8 = fa1Var2.X1lG3V04pd;
                                double d9 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                            case 4:
                                float[] fArr4 = jc.GWasM1elztuh;
                                return jc.Yi7zF1RB1(fa1Var2, d5);
                            case 5:
                                float[] fArr5 = jc.GWasM1elztuh;
                                return jc.xqGvceK5x(fa1Var2, d5);
                            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = fa1Var2.Yi7zF1RB1;
                                double d11 = fa1Var2.X1lG3V04pd;
                                double d12 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = fa1Var2.Yi7zF1RB1;
                                double d14 = fa1Var2.X1lG3V04pd;
                                double d15 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                anVar = new an() { // from class: ev0
                    @Override // defpackage.an
                    public final double X1lG3V04pd(double d5) {
                        int i52 = i7;
                        fa1 fa1Var2 = fa1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = jc.GWasM1elztuh;
                                return jc.GWasM1elztuh(fa1Var2, d5);
                            case 1:
                                float[] fArr3 = jc.GWasM1elztuh;
                                return jc.X1lG3V04pd(fa1Var2, d5);
                            case 2:
                                double d6 = fa1Var2.Yi7zF1RB1;
                                return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                                double d7 = fa1Var2.Yi7zF1RB1;
                                double d8 = fa1Var2.X1lG3V04pd;
                                double d9 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                            case 4:
                                float[] fArr4 = jc.GWasM1elztuh;
                                return jc.Yi7zF1RB1(fa1Var2, d5);
                            case 5:
                                float[] fArr5 = jc.GWasM1elztuh;
                                return jc.xqGvceK5x(fa1Var2, d5);
                            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = fa1Var2.Yi7zF1RB1;
                                double d11 = fa1Var2.X1lG3V04pd;
                                double d12 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = fa1Var2.Yi7zF1RB1;
                                double d14 = fa1Var2.X1lG3V04pd;
                                double d15 = fa1Var2.xqGvceK5x;
                                return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            anVar2 = new an() { // from class: ev0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d5) {
                    int i52 = i2;
                    fa1 fa1Var2 = fa1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = jc.GWasM1elztuh;
                            return jc.GWasM1elztuh(fa1Var2, d5);
                        case 1:
                            float[] fArr3 = jc.GWasM1elztuh;
                            return jc.X1lG3V04pd(fa1Var2, d5);
                        case 2:
                            double d6 = fa1Var2.Yi7zF1RB1;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = fa1Var2.Yi7zF1RB1;
                            double d8 = fa1Var2.X1lG3V04pd;
                            double d9 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                        case 4:
                            float[] fArr4 = jc.GWasM1elztuh;
                            return jc.Yi7zF1RB1(fa1Var2, d5);
                        case 5:
                            float[] fArr5 = jc.GWasM1elztuh;
                            return jc.xqGvceK5x(fa1Var2, d5);
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = fa1Var2.Yi7zF1RB1;
                            double d11 = fa1Var2.X1lG3V04pd;
                            double d12 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = fa1Var2.Yi7zF1RB1;
                            double d14 = fa1Var2.X1lG3V04pd;
                            double d15 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            anVar2 = new an() { // from class: ev0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d5) {
                    int i52 = i3;
                    fa1 fa1Var2 = fa1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = jc.GWasM1elztuh;
                            return jc.GWasM1elztuh(fa1Var2, d5);
                        case 1:
                            float[] fArr3 = jc.GWasM1elztuh;
                            return jc.X1lG3V04pd(fa1Var2, d5);
                        case 2:
                            double d6 = fa1Var2.Yi7zF1RB1;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = fa1Var2.Yi7zF1RB1;
                            double d8 = fa1Var2.X1lG3V04pd;
                            double d9 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                        case 4:
                            float[] fArr4 = jc.GWasM1elztuh;
                            return jc.Yi7zF1RB1(fa1Var2, d5);
                        case 5:
                            float[] fArr5 = jc.GWasM1elztuh;
                            return jc.xqGvceK5x(fa1Var2, d5);
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = fa1Var2.Yi7zF1RB1;
                            double d11 = fa1Var2.X1lG3V04pd;
                            double d12 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = fa1Var2.Yi7zF1RB1;
                            double d14 = fa1Var2.X1lG3V04pd;
                            double d15 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            anVar2 = new an() { // from class: ev0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d5) {
                    int i52 = i8;
                    fa1 fa1Var2 = fa1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = jc.GWasM1elztuh;
                            return jc.GWasM1elztuh(fa1Var2, d5);
                        case 1:
                            float[] fArr3 = jc.GWasM1elztuh;
                            return jc.X1lG3V04pd(fa1Var2, d5);
                        case 2:
                            double d6 = fa1Var2.Yi7zF1RB1;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = fa1Var2.Yi7zF1RB1;
                            double d8 = fa1Var2.X1lG3V04pd;
                            double d9 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                        case 4:
                            float[] fArr4 = jc.GWasM1elztuh;
                            return jc.Yi7zF1RB1(fa1Var2, d5);
                        case 5:
                            float[] fArr5 = jc.GWasM1elztuh;
                            return jc.xqGvceK5x(fa1Var2, d5);
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = fa1Var2.Yi7zF1RB1;
                            double d11 = fa1Var2.X1lG3V04pd;
                            double d12 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = fa1Var2.Yi7zF1RB1;
                            double d14 = fa1Var2.X1lG3V04pd;
                            double d15 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            anVar2 = new an() { // from class: ev0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d5) {
                    int i52 = i9;
                    fa1 fa1Var2 = fa1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = jc.GWasM1elztuh;
                            return jc.GWasM1elztuh(fa1Var2, d5);
                        case 1:
                            float[] fArr3 = jc.GWasM1elztuh;
                            return jc.X1lG3V04pd(fa1Var2, d5);
                        case 2:
                            double d6 = fa1Var2.Yi7zF1RB1;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d6 * d5) + fa1Var2.X1lG3V04pd, fa1Var2.GWasM1elztuh) : fa1Var2.xqGvceK5x * d5;
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            double d7 = fa1Var2.Yi7zF1RB1;
                            double d8 = fa1Var2.X1lG3V04pd;
                            double d9 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS ? Math.pow((d7 * d5) + d8, fa1Var2.GWasM1elztuh) + fa1Var2.EljAMC1QTz : (d9 * d5) + fa1Var2.AvO7iQsrTN;
                        case 4:
                            float[] fArr4 = jc.GWasM1elztuh;
                            return jc.Yi7zF1RB1(fa1Var2, d5);
                        case 5:
                            float[] fArr5 = jc.GWasM1elztuh;
                            return jc.xqGvceK5x(fa1Var2, d5);
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = fa1Var2.Yi7zF1RB1;
                            double d11 = fa1Var2.X1lG3V04pd;
                            double d12 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d12 ? (Math.pow(d5, 1.0d / fa1Var2.GWasM1elztuh) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = fa1Var2.Yi7zF1RB1;
                            double d14 = fa1Var2.X1lG3V04pd;
                            double d15 = fa1Var2.xqGvceK5x;
                            return d5 >= fa1Var2.OOA6hdeuvCS * d15 ? (Math.pow(d5 - fa1Var2.EljAMC1QTz, 1.0d / fa1Var2.GWasM1elztuh) - d14) / d13 : (d5 - fa1Var2.AvO7iQsrTN) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gv0(String str, float[] fArr, nf1 nf1Var, final double d, float f, float f2, int i) {
        this(str, fArr, nf1Var, null, r11, r3, f, f2, new fa1(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        an anVar;
        an anVar2 = Mjvvu5DE;
        if (d == 1.0d) {
            anVar = anVar2;
        } else {
            final int i2 = 0;
            anVar = new an() { // from class: dv0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            anVar2 = new an() { // from class: dv0
                @Override // defpackage.an
                public final double X1lG3V04pd(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
    }
}
