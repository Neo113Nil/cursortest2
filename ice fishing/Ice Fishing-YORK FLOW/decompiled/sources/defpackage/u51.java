package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u51 extends defpackage.xf {
    public static final defpackage.h7 s0TASMVLSWD5 = new defpackage.h7(28);
    public final float[] GE9mJIPrb8gP;
    public final defpackage.av1 JhCgjQRTAOCT;
    public final defpackage.kr Ns0WNyEWdPsk;
    public final float[] P05cfTpS5W5L;
    public final defpackage.yo1 QiMR8OkAhezm;
    public final defpackage.t51 T1fB7bDYiVJQ;
    public final float WDYagTQQm9ns;
    public final boolean WmetiUbpKU9I;
    public final defpackage.q51 XntWc4eZSQ8j;
    public final float[] e6mdH7fiFuta;
    public final defpackage.t51 fNwYGHIYeJcR;
    public final defpackage.kr gUjdnLbkVAaA;
    public final defpackage.q51 h3m55N1URyyK;
    public final float oh71FJcDz6S2;

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
    public u51(java.lang.String str, float[] fArr, defpackage.av1 av1Var, float[] fArr2, defpackage.kr krVar, defpackage.kr krVar2, float f, float f2, defpackage.yo1 yo1Var, int i) {
        super(str, 12884901888L, i);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        this.JhCgjQRTAOCT = av1Var;
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = f2;
        this.QiMR8OkAhezm = yo1Var;
        this.Ns0WNyEWdPsk = krVar;
        int i2 = 1;
        this.fNwYGHIYeJcR = new defpackage.t51(this, i2);
        int i3 = 0;
        this.h3m55N1URyyK = new defpackage.q51(this, i3);
        this.gUjdnLbkVAaA = krVar2;
        this.T1fB7bDYiVJQ = new defpackage.t51(this, i3);
        this.XntWc4eZSQ8j = new defpackage.q51(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            defpackage.h7.w7APNrr0aGRc("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
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
        this.P05cfTpS5W5L = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = av1Var.ZpBGe2uQfcn8;
            r44 = 1;
            float f21 = av1Var.giKS3J6vZuNy;
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
            this.e6mdH7fiFuta = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new java.lang.IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.e6mdH7fiFuta = fArr2;
        }
        this.GE9mJIPrb8gP = defpackage.i61.IJ0hOnjhPOri(this.e6mdH7fiFuta);
        float QiMR8OkAhezm = defpackage.j80.QiMR8OkAhezm(fArr3);
        float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
        if (QiMR8OkAhezm / defpackage.j80.QiMR8OkAhezm(defpackage.ag.giKS3J6vZuNy) > 0.9f) {
            float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
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
            float[] fArr7 = defpackage.ag.ZpBGe2uQfcn8;
            if (fArr3 != fArr7) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (java.lang.Float.compare(fArr3[i5], fArr7[i5]) != 0 && java.lang.Math.abs(fArr3[i5] - fArr7[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (defpackage.i61.h3m55N1URyyK(av1Var, defpackage.h0.GE9mJIPrb8gP) && f == f4 && f2 == f3) {
                float[] fArr8 = defpackage.ag.ZpBGe2uQfcn8;
                defpackage.u51 u51Var = defpackage.ag.WDYagTQQm9ns;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (java.lang.Math.abs(krVar.fWTAfUmVKrZq(d) - u51Var.Ns0WNyEWdPsk.fWTAfUmVKrZq(d)) <= 0.001d && java.lang.Math.abs(krVar2.fWTAfUmVKrZq(d) - u51Var.gUjdnLbkVAaA.fWTAfUmVKrZq(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.WmetiUbpKU9I = z;
        }
        z = r44;
        this.WmetiUbpKU9I = z;
    }

    @Override // defpackage.xf
    public final long JhCgjQRTAOCT(float f, float f2, float f3) {
        double d = f;
        defpackage.q51 q51Var = this.XntWc4eZSQ8j;
        float fWTAfUmVKrZq = (float) q51Var.fWTAfUmVKrZq(d);
        float fWTAfUmVKrZq2 = (float) q51Var.fWTAfUmVKrZq(f2);
        float fWTAfUmVKrZq3 = (float) q51Var.fWTAfUmVKrZq(f3);
        float[] fArr = this.e6mdH7fiFuta;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fWTAfUmVKrZq3) + (fArr[3] * fWTAfUmVKrZq2) + (fArr[0] * fWTAfUmVKrZq);
        float f5 = (fArr[7] * fWTAfUmVKrZq3) + (fArr[4] * fWTAfUmVKrZq2) + (fArr[1] * fWTAfUmVKrZq);
        return (java.lang.Float.floatToRawIntBits(f4) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.xf
    public final float WDYagTQQm9ns(float f, float f2, float f3) {
        double d = f;
        defpackage.q51 q51Var = this.XntWc4eZSQ8j;
        float fWTAfUmVKrZq = (float) q51Var.fWTAfUmVKrZq(d);
        float fWTAfUmVKrZq2 = (float) q51Var.fWTAfUmVKrZq(f2);
        float fWTAfUmVKrZq3 = (float) q51Var.fWTAfUmVKrZq(f3);
        float[] fArr = this.e6mdH7fiFuta;
        return (fArr[8] * fWTAfUmVKrZq3) + (fArr[5] * fWTAfUmVKrZq2) + (fArr[2] * fWTAfUmVKrZq);
    }

    @Override // defpackage.xf
    public final float ZpBGe2uQfcn8(int i) {
        return this.oh71FJcDz6S2;
    }

    @Override // defpackage.xf
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.u51.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        defpackage.u51 u51Var = (defpackage.u51) obj;
        if (java.lang.Float.compare(u51Var.WDYagTQQm9ns, this.WDYagTQQm9ns) != 0 || java.lang.Float.compare(u51Var.oh71FJcDz6S2, this.oh71FJcDz6S2) != 0 || !defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, u51Var.JhCgjQRTAOCT) || !java.util.Arrays.equals(this.P05cfTpS5W5L, u51Var.P05cfTpS5W5L)) {
            return false;
        }
        defpackage.yo1 yo1Var = u51Var.QiMR8OkAhezm;
        defpackage.yo1 yo1Var2 = this.QiMR8OkAhezm;
        if (yo1Var2 != null) {
            return defpackage.ma0.QiMR8OkAhezm(yo1Var2, yo1Var);
        }
        if (yo1Var == null) {
            return true;
        }
        if (defpackage.ma0.QiMR8OkAhezm(this.Ns0WNyEWdPsk, u51Var.Ns0WNyEWdPsk)) {
            return defpackage.ma0.QiMR8OkAhezm(this.gUjdnLbkVAaA, u51Var.gUjdnLbkVAaA);
        }
        return false;
    }

    @Override // defpackage.xf
    public final boolean fWTAfUmVKrZq() {
        return this.WmetiUbpKU9I;
    }

    @Override // defpackage.xf
    public final float giKS3J6vZuNy(int i) {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.xf
    public final int hashCode() {
        int hashCode = (java.util.Arrays.hashCode(this.P05cfTpS5W5L) + ((this.JhCgjQRTAOCT.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.WDYagTQQm9ns;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : java.lang.Float.floatToIntBits(f))) * 31;
        float f2 = this.oh71FJcDz6S2;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f2))) * 31;
        defpackage.yo1 yo1Var = this.QiMR8OkAhezm;
        int hashCode2 = floatToIntBits2 + (yo1Var != null ? yo1Var.hashCode() : 0);
        if (yo1Var != null) {
            return hashCode2;
        }
        return this.gUjdnLbkVAaA.hashCode() + ((this.Ns0WNyEWdPsk.hashCode() + (hashCode2 * 31)) * 31);
    }

    @Override // defpackage.xf
    public final long oh71FJcDz6S2(float f, float f2, float f3, float f4, defpackage.xf xfVar) {
        float[] fArr = this.GE9mJIPrb8gP;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        defpackage.q51 q51Var = this.h3m55N1URyyK;
        return defpackage.ok0.fWTAfUmVKrZq((float) q51Var.fWTAfUmVKrZq(f5), (float) q51Var.fWTAfUmVKrZq(f6), (float) q51Var.fWTAfUmVKrZq(f7), f4, xfVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u51(java.lang.String str, float[] fArr, defpackage.av1 av1Var, final defpackage.yo1 yo1Var, int i) {
        this(str, fArr, av1Var, null, r4, r0, 0.0f, 1.0f, yo1Var, i);
        double d;
        defpackage.kr krVar;
        defpackage.kr krVar2;
        double d2 = yo1Var.ZpBGe2uQfcn8;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = yo1Var.QiMR8OkAhezm;
        double d4 = yo1Var.oh71FJcDz6S2;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            krVar = new defpackage.kr() { // from class: s51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d5) {
                    int i5 = i4;
                    defpackage.yo1 yo1Var2 = yo1Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                        case 2:
                            double d6 = yo1Var2.giKS3J6vZuNy;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                        case 3:
                            double d7 = yo1Var2.giKS3J6vZuNy;
                            double d8 = yo1Var2.fWTAfUmVKrZq;
                            double d9 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                        case 4:
                            float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                        case 5:
                            float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                        case 6:
                            double d10 = yo1Var2.giKS3J6vZuNy;
                            double d11 = yo1Var2.fWTAfUmVKrZq;
                            double d12 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yo1Var2.giKS3J6vZuNy;
                            double d14 = yo1Var2.fWTAfUmVKrZq;
                            double d15 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                krVar = new defpackage.kr() { // from class: s51
                    @Override // defpackage.kr
                    public final double fWTAfUmVKrZq(double d5) {
                        int i52 = i5;
                        defpackage.yo1 yo1Var2 = yo1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                            case 1:
                                float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                            case 2:
                                double d6 = yo1Var2.giKS3J6vZuNy;
                                return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                            case 3:
                                double d7 = yo1Var2.giKS3J6vZuNy;
                                double d8 = yo1Var2.fWTAfUmVKrZq;
                                double d9 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                            case 4:
                                float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                            case 5:
                                float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                            case 6:
                                double d10 = yo1Var2.giKS3J6vZuNy;
                                double d11 = yo1Var2.fWTAfUmVKrZq;
                                double d12 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = yo1Var2.giKS3J6vZuNy;
                                double d14 = yo1Var2.fWTAfUmVKrZq;
                                double d15 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                krVar = new defpackage.kr() { // from class: s51
                    @Override // defpackage.kr
                    public final double fWTAfUmVKrZq(double d5) {
                        int i52 = i6;
                        defpackage.yo1 yo1Var2 = yo1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                            case 1:
                                float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                            case 2:
                                double d6 = yo1Var2.giKS3J6vZuNy;
                                return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                            case 3:
                                double d7 = yo1Var2.giKS3J6vZuNy;
                                double d8 = yo1Var2.fWTAfUmVKrZq;
                                double d9 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                            case 4:
                                float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                            case 5:
                                float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                            case 6:
                                double d10 = yo1Var2.giKS3J6vZuNy;
                                double d11 = yo1Var2.fWTAfUmVKrZq;
                                double d12 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = yo1Var2.giKS3J6vZuNy;
                                double d14 = yo1Var2.fWTAfUmVKrZq;
                                double d15 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                krVar = new defpackage.kr() { // from class: s51
                    @Override // defpackage.kr
                    public final double fWTAfUmVKrZq(double d5) {
                        int i52 = i7;
                        defpackage.yo1 yo1Var2 = yo1Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                            case 1:
                                float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                            case 2:
                                double d6 = yo1Var2.giKS3J6vZuNy;
                                return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                            case 3:
                                double d7 = yo1Var2.giKS3J6vZuNy;
                                double d8 = yo1Var2.fWTAfUmVKrZq;
                                double d9 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                            case 4:
                                float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                            case 5:
                                float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                                return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                            case 6:
                                double d10 = yo1Var2.giKS3J6vZuNy;
                                double d11 = yo1Var2.fWTAfUmVKrZq;
                                double d12 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = yo1Var2.giKS3J6vZuNy;
                                double d14 = yo1Var2.fWTAfUmVKrZq;
                                double d15 = yo1Var2.JhCgjQRTAOCT;
                                return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            krVar2 = new defpackage.kr() { // from class: s51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d5) {
                    int i52 = i2;
                    defpackage.yo1 yo1Var2 = yo1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                        case 2:
                            double d6 = yo1Var2.giKS3J6vZuNy;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                        case 3:
                            double d7 = yo1Var2.giKS3J6vZuNy;
                            double d8 = yo1Var2.fWTAfUmVKrZq;
                            double d9 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                        case 4:
                            float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                        case 5:
                            float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                        case 6:
                            double d10 = yo1Var2.giKS3J6vZuNy;
                            double d11 = yo1Var2.fWTAfUmVKrZq;
                            double d12 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yo1Var2.giKS3J6vZuNy;
                            double d14 = yo1Var2.fWTAfUmVKrZq;
                            double d15 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            krVar2 = new defpackage.kr() { // from class: s51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d5) {
                    int i52 = i3;
                    defpackage.yo1 yo1Var2 = yo1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                        case 2:
                            double d6 = yo1Var2.giKS3J6vZuNy;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                        case 3:
                            double d7 = yo1Var2.giKS3J6vZuNy;
                            double d8 = yo1Var2.fWTAfUmVKrZq;
                            double d9 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                        case 4:
                            float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                        case 5:
                            float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                        case 6:
                            double d10 = yo1Var2.giKS3J6vZuNy;
                            double d11 = yo1Var2.fWTAfUmVKrZq;
                            double d12 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yo1Var2.giKS3J6vZuNy;
                            double d14 = yo1Var2.fWTAfUmVKrZq;
                            double d15 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            krVar2 = new defpackage.kr() { // from class: s51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d5) {
                    int i52 = i8;
                    defpackage.yo1 yo1Var2 = yo1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                        case 2:
                            double d6 = yo1Var2.giKS3J6vZuNy;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                        case 3:
                            double d7 = yo1Var2.giKS3J6vZuNy;
                            double d8 = yo1Var2.fWTAfUmVKrZq;
                            double d9 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                        case 4:
                            float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                        case 5:
                            float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                        case 6:
                            double d10 = yo1Var2.giKS3J6vZuNy;
                            double d11 = yo1Var2.fWTAfUmVKrZq;
                            double d12 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yo1Var2.giKS3J6vZuNy;
                            double d14 = yo1Var2.fWTAfUmVKrZq;
                            double d15 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            krVar2 = new defpackage.kr() { // from class: s51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d5) {
                    int i52 = i9;
                    defpackage.yo1 yo1Var2 = yo1Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.ZpBGe2uQfcn8(yo1Var2, d5);
                        case 1:
                            float[] fArr3 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.fWTAfUmVKrZq(yo1Var2, d5);
                        case 2:
                            double d6 = yo1Var2.giKS3J6vZuNy;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d6 * d5) + yo1Var2.fWTAfUmVKrZq, yo1Var2.ZpBGe2uQfcn8) : yo1Var2.JhCgjQRTAOCT * d5;
                        case 3:
                            double d7 = yo1Var2.giKS3J6vZuNy;
                            double d8 = yo1Var2.fWTAfUmVKrZq;
                            double d9 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns ? java.lang.Math.pow((d7 * d5) + d8, yo1Var2.ZpBGe2uQfcn8) + yo1Var2.oh71FJcDz6S2 : (d9 * d5) + yo1Var2.QiMR8OkAhezm;
                        case 4:
                            float[] fArr4 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.giKS3J6vZuNy(yo1Var2, d5);
                        case 5:
                            float[] fArr5 = defpackage.ag.ZpBGe2uQfcn8;
                            return defpackage.ag.JhCgjQRTAOCT(yo1Var2, d5);
                        case 6:
                            double d10 = yo1Var2.giKS3J6vZuNy;
                            double d11 = yo1Var2.fWTAfUmVKrZq;
                            double d12 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d12 ? (java.lang.Math.pow(d5, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yo1Var2.giKS3J6vZuNy;
                            double d14 = yo1Var2.fWTAfUmVKrZq;
                            double d15 = yo1Var2.JhCgjQRTAOCT;
                            return d5 >= yo1Var2.WDYagTQQm9ns * d15 ? (java.lang.Math.pow(d5 - yo1Var2.oh71FJcDz6S2, 1.0d / yo1Var2.ZpBGe2uQfcn8) - d14) / d13 : (d5 - yo1Var2.QiMR8OkAhezm) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u51(java.lang.String str, float[] fArr, defpackage.av1 av1Var, final double d, float f, float f2, int i) {
        this(str, fArr, av1Var, null, r11, r3, f, f2, new defpackage.yo1(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        defpackage.kr krVar;
        defpackage.kr krVar2 = s0TASMVLSWD5;
        if (d == 1.0d) {
            krVar = krVar2;
        } else {
            final int i2 = 0;
            krVar = new defpackage.kr() { // from class: r51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d2) {
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
            krVar2 = new defpackage.kr() { // from class: r51
                @Override // defpackage.kr
                public final double fWTAfUmVKrZq(double d2) {
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
