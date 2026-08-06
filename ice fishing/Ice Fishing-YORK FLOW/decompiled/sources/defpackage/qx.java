package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qx implements defpackage.mx {
    public final float ZpBGe2uQfcn8;
    public final defpackage.uf1 giKS3J6vZuNy;

    public qx(float f, float f2, float f3) {
        this.ZpBGe2uQfcn8 = f3;
        defpackage.uf1 uf1Var = new defpackage.uf1();
        uf1Var.ZpBGe2uQfcn8 = 1.0f;
        uf1Var.giKS3J6vZuNy = java.lang.Math.sqrt(50.0d);
        uf1Var.fWTAfUmVKrZq = 1.0f;
        if (f < 0.0f) {
            defpackage.i11.ZpBGe2uQfcn8("Damping ratio must be non-negative");
        }
        uf1Var.fWTAfUmVKrZq = f;
        double d = uf1Var.giKS3J6vZuNy;
        if (((float) (d * d)) <= 0.0f) {
            defpackage.i11.ZpBGe2uQfcn8("Spring stiffness constant must be positive.");
        }
        uf1Var.giKS3J6vZuNy = java.lang.Math.sqrt(f2);
        this.giKS3J6vZuNy = uf1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    @Override // defpackage.mx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long JhCgjQRTAOCT(float f, float f2, float f3) {
        double d;
        long j;
        double d2;
        defpackage.uf1 uf1Var = this.giKS3J6vZuNy;
        double d3 = uf1Var.giKS3J6vZuNy;
        float f4 = (float) (d3 * d3);
        float f5 = uf1Var.fWTAfUmVKrZq;
        float f6 = this.ZpBGe2uQfcn8;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d4 = f4;
            double d5 = f5;
            double d6 = f8;
            double d7 = f7;
            double sqrt = java.lang.Math.sqrt(d4) * d5 * 2.0d;
            double d8 = (sqrt * sqrt) - (d4 * 4.0d);
            double sqrt2 = d8 < 0.0d ? 0.0d : java.lang.Math.sqrt(d8);
            double d9 = -sqrt;
            double d10 = (d9 + sqrt2) * 0.5d;
            double sqrt3 = (d8 < 0.0d ? java.lang.Math.sqrt(java.lang.Math.abs(d8)) : 0.0d) * 0.5d;
            double d11 = (d9 - sqrt2) * 0.5d;
            if (d7 == 0.0d && d6 == 0.0d) {
                j = 0;
            } else {
                if (d7 < 0.0d) {
                    d6 = -d6;
                }
                double abs = java.lang.Math.abs(d7);
                double d12 = 1.0d;
                double d13 = -1.0d;
                double d14 = Double.MAX_VALUE;
                if (d5 > 1.0d) {
                    double d15 = (d10 * abs) - d6;
                    double d16 = d10 - d11;
                    double d17 = d15 / d16;
                    double d18 = abs - d17;
                    d = java.lang.Math.log(java.lang.Math.abs(1.0d / d18)) / d10;
                    double log = java.lang.Math.log(java.lang.Math.abs(1.0d / d17)) / d11;
                    if ((java.lang.Double.doubleToRawLongBits(d) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d = log;
                    } else if ((java.lang.Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d = java.lang.Math.max(d, log);
                    }
                    double d19 = d18 * d10;
                    double log2 = java.lang.Math.log(d19 / ((-d17) * d11)) / (d11 - d10);
                    if (!java.lang.Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((java.lang.Math.exp(log2 * d11) * d17) + (java.lang.Math.exp(d10 * log2) * d18))) < 1.0d) {
                                d = (d17 <= 0.0d || d18 >= 0.0d) ? d : 0.0d;
                            }
                        }
                        d = java.lang.Math.log((-((d17 * d11) * d11)) / (d19 * d10)) / d16;
                        d2 = d17 * d11;
                        if (java.lang.Math.abs((java.lang.Math.exp(d11 * d) * d2) + (java.lang.Math.exp(d10 * d) * d19)) >= 1.0E-4d) {
                            int i = 0;
                            while (d14 > 0.001d && i < 100) {
                                i++;
                                double d20 = d10 * d;
                                double d21 = d11 * d;
                                double exp = d - ((((java.lang.Math.exp(d21) * d17) + (java.lang.Math.exp(d20) * d18)) + d12) / ((java.lang.Math.exp(d21) * d2) + (java.lang.Math.exp(d20) * d19)));
                                d14 = java.lang.Math.abs(d - exp);
                                d = exp;
                            }
                        }
                    }
                    d12 = -1.0d;
                    d2 = d17 * d11;
                    if (java.lang.Math.abs((java.lang.Math.exp(d11 * d) * d2) + (java.lang.Math.exp(d10 * d) * d19)) >= 1.0E-4d) {
                    }
                } else if (d5 < 1.0d) {
                    double d22 = (d6 - (d10 * abs)) / sqrt3;
                    d = java.lang.Math.log(1.0d / java.lang.Math.sqrt((d22 * d22) + (abs * abs))) / d10;
                } else {
                    double d23 = d10 * abs;
                    double d24 = d6 - d23;
                    double log3 = java.lang.Math.log(java.lang.Math.abs(1.0d / abs)) / d10;
                    double log4 = java.lang.Math.log(java.lang.Math.abs(1.0d / d24));
                    double d25 = log4;
                    for (int i2 = 0; i2 < 6; i2++) {
                        d25 = log4 - java.lang.Math.log(java.lang.Math.abs(d25 / d10));
                    }
                    double d26 = d25 / d10;
                    if ((java.lang.Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d26;
                    } else if ((java.lang.Double.doubleToRawLongBits(d26) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = java.lang.Math.max(log3, d26);
                    }
                    double d27 = (-(d23 + d24)) / (d10 * d24);
                    double d28 = d10 * d27;
                    double exp2 = (java.lang.Math.exp(d28) * d24 * d27) + (java.lang.Math.exp(d28) * abs);
                    if (!java.lang.Double.isNaN(d27) && d27 > 0.0d) {
                        if (d27 <= 0.0d || (-exp2) >= 1.0d) {
                            log3 = (-(2.0d / d10)) - (abs / d24);
                            d13 = 1.0d;
                        } else {
                            log3 = (d24 >= 0.0d || abs <= 0.0d) ? log3 : 0.0d;
                        }
                    }
                    d = log3;
                    int i3 = 0;
                    while (d14 > 0.001d && i3 < 100) {
                        i3++;
                        double d29 = d10 * d;
                        double exp3 = d - (((java.lang.Math.exp(d29) * ((d24 * d) + abs)) + d13) / (java.lang.Math.exp(d29) * (((d29 + 1.0d) * d24) + d23)));
                        d14 = java.lang.Math.abs(d - exp3);
                        d = exp3;
                    }
                }
                j = (long) (d * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // defpackage.mx
    public final float WDYagTQQm9ns(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.mx
    public final float fWTAfUmVKrZq(long j, float f, float f2, float f3) {
        defpackage.uf1 uf1Var = this.giKS3J6vZuNy;
        uf1Var.ZpBGe2uQfcn8 = f2;
        return java.lang.Float.intBitsToFloat((int) (uf1Var.ZpBGe2uQfcn8(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.mx
    public final float giKS3J6vZuNy(long j, float f, float f2, float f3) {
        defpackage.uf1 uf1Var = this.giKS3J6vZuNy;
        uf1Var.ZpBGe2uQfcn8 = f2;
        return java.lang.Float.intBitsToFloat((int) (uf1Var.ZpBGe2uQfcn8(f, f3, j / 1000000) >> 32));
    }
}
