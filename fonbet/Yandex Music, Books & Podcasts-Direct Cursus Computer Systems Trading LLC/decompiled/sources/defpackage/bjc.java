package defpackage;

/* loaded from: classes.dex */
public final class bjc implements qic {
    public final float a;
    public final a9r b;

    public bjc(float f, float f2, float f3) {
        this.a = f3;
        a9r a9rVar = new a9r();
        a9rVar.a = 1.0f;
        a9rVar.b = Math.sqrt(50.0d);
        a9rVar.c = 1.0f;
        if (f < 0.0f) {
            mlm.a("Damping ratio must be non-negative");
        }
        a9rVar.c = f;
        double d = a9rVar.b;
        if (((float) (d * d)) <= 0.0f) {
            mlm.a("Spring stiffness constant must be positive.");
        }
        a9rVar.b = Math.sqrt(f2);
        this.b = a9rVar;
    }

    @Override // defpackage.qic
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.qic
    public final float c(long j, float f, float f2, float f3) {
        a9r a9rVar = this.b;
        a9rVar.a = f2;
        return Float.intBitsToFloat((int) (a9rVar.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.qic
    public final float d(long j, float f, float f2, float f3) {
        a9r a9rVar = this.b;
        a9rVar.a = f2;
        return Float.intBitsToFloat((int) (a9rVar.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.qic
    public final long e(float f, float f2, float f3) {
        double d;
        int i;
        long j;
        a9r a9rVar = this.b;
        double d2 = a9rVar.b;
        float f4 = (float) (d2 * d2);
        float f5 = a9rVar.c;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d3 = f4;
            double d4 = f5;
            double d5 = f8;
            double d6 = f7;
            double d7 = 1.0f;
            double sqrt = d4 * 2.0d * Math.sqrt(d3);
            double d8 = (sqrt * sqrt) - (d3 * 4.0d);
            double sqrt2 = d8 < 0.0d ? 0.0d : Math.sqrt(d8);
            double d9 = -sqrt;
            double d10 = (d9 + sqrt2) * 0.5d;
            double sqrt3 = (d8 < 0.0d ? Math.sqrt(Math.abs(d8)) : 0.0d) * 0.5d;
            double d11 = (d9 - sqrt2) * 0.5d;
            if (d6 == 0.0d && d5 == 0.0d) {
                j = 0;
            } else {
                if (d6 < 0.0d) {
                    d5 = -d5;
                }
                double abs = Math.abs(d6);
                double d12 = Double.MAX_VALUE;
                if (d4 > 1.0d) {
                    double d13 = (d10 * abs) - d5;
                    double d14 = d10 - d11;
                    double d15 = d13 / d14;
                    double d16 = abs - d15;
                    d = Math.log(Math.abs(d7 / d16)) / d10;
                    double log = Math.log(Math.abs(d7 / d15)) / d11;
                    if ((Double.doubleToRawLongBits(d) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d = log;
                    } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d = Math.max(d, log);
                    }
                    double d17 = d16 * d10;
                    double log2 = Math.log(d17 / ((-d15) * d11)) / (d11 - d10);
                    if (Double.isNaN(log2) || log2 <= 0.0d) {
                        d7 = -d7;
                    } else {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d11) * d15) + (Math.exp(d10 * log2) * d16))) < d7) {
                                d7 = -d7;
                                d = (d15 <= 0.0d || d16 >= 0.0d) ? d : 0.0d;
                            }
                        }
                        d = Math.log((-((d15 * d11) * d11)) / (d17 * d10)) / d14;
                    }
                    double d18 = d15 * d11;
                    if (Math.abs((Math.exp(d11 * d) * d18) + (Math.exp(d10 * d) * d17)) >= 1.0E-4d) {
                        int i2 = 0;
                        while (d12 > 0.001d && i2 < 100) {
                            i2++;
                            double d19 = d10 * d;
                            double d20 = d11 * d;
                            double exp = d - ((((Math.exp(d20) * d15) + (Math.exp(d19) * d16)) + d7) / ((Math.exp(d20) * d18) + (Math.exp(d19) * d17)));
                            d12 = Math.abs(d - exp);
                            d = exp;
                        }
                    }
                } else if (d4 < 1.0d) {
                    double d21 = (d5 - (d10 * abs)) / sqrt3;
                    d = Math.log(d7 / Math.sqrt((d21 * d21) + (abs * abs))) / d10;
                } else {
                    double d22 = d10 * abs;
                    double d23 = d5 - d22;
                    double log3 = Math.log(Math.abs(d7 / abs)) / d10;
                    double log4 = Math.log(Math.abs(d7 / d23));
                    double d24 = log4;
                    for (int i3 = 0; i3 < 6; i3++) {
                        d24 = log4 - Math.log(Math.abs(d24 / d10));
                    }
                    double d25 = d24 / d10;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d25;
                    } else if ((Double.doubleToRawLongBits(d25) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = Math.max(log3, d25);
                    }
                    double d26 = (-(d22 + d23)) / (d10 * d23);
                    double d27 = d10 * d26;
                    double exp2 = (Math.exp(d27) * d23 * d26) + (Math.exp(d27) * abs);
                    if (!Double.isNaN(d26) && d26 > 0.0d) {
                        if (d26 <= 0.0d || (-exp2) >= d7) {
                            log3 = (-(2.0d / d10)) - (abs / d23);
                            d = log3;
                            i = 0;
                            while (d12 > 0.001d && i < 100) {
                                i++;
                                double d28 = d10 * d;
                                double exp3 = d - (((Math.exp(d28) * ((d23 * d) + abs)) + d7) / (Math.exp(d28) * (((1 + d28) * d23) + d22)));
                                d12 = Math.abs(d - exp3);
                                d = exp3;
                            }
                        } else if (d23 < 0.0d && abs > 0.0d) {
                            log3 = 0.0d;
                        }
                    }
                    d7 = -d7;
                    d = log3;
                    i = 0;
                    while (d12 > 0.001d) {
                        i++;
                        double d282 = d10 * d;
                        double exp32 = d - (((Math.exp(d282) * ((d23 * d) + abs)) + d7) / (Math.exp(d282) * (((1 + d282) * d23) + d22)));
                        d12 = Math.abs(d - exp32);
                        d = exp32;
                    }
                }
                j = (long) (d * 1000.0d);
            }
        }
        return j * 1000000;
    }
}
