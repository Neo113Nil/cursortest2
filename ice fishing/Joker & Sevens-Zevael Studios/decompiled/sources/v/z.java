package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final float f7020a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f7021b;

    public z(float f10, float f11, float f12) {
        this.f7020a = f12;
        n0 n0Var = new n0();
        n0Var.f6897a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        n0Var.f6898b = sqrt;
        n0Var.f6903g = 1.0f;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        n0Var.f6903g = f10;
        n0Var.f6899c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        n0Var.f6898b = Math.sqrt(f11);
        n0Var.f6899c = false;
        this.f7021b = n0Var;
    }

    @Override // v.y
    public final float b(long j3, float f10, float f11, float f12) {
        n0 n0Var = this.f7021b;
        n0Var.f6897a = f11;
        return Float.intBitsToFloat((int) (n0Var.a(f10, f12, j3 / 1000000) >> 32));
    }

    @Override // v.y
    public final float c(long j3, float f10, float f11, float f12) {
        n0 n0Var = this.f7021b;
        n0Var.f6897a = f11;
        return Float.intBitsToFloat((int) (n0Var.a(f10, f12, j3 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    @Override // v.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f10, float f11, float f12) {
        double d10;
        double d11;
        q qVar;
        double d12;
        long j3;
        double d13;
        n0 n0Var = this.f7021b;
        double d14 = n0Var.f6898b;
        float f13 = (float) (d14 * d14);
        float f14 = n0Var.f6903g;
        float f15 = this.f7020a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == 0.0f) {
            j3 = 9223372036854L;
        } else {
            double d15 = f13;
            double d16 = f14;
            double d17 = f17;
            double d18 = f16;
            double d19 = 1.0f;
            double sqrt = d16 * 2.0d * Math.sqrt(d15);
            double d20 = (sqrt * sqrt) - (d15 * 4.0d);
            double d21 = -sqrt;
            if (d20 < 0.0d) {
                d11 = 2.0d;
                d10 = d16;
                qVar = new q(0.0d, Math.sqrt(Math.abs(d20)));
            } else {
                d10 = d16;
                d11 = 2.0d;
                qVar = new q(Math.sqrt(d20), 0.0d);
            }
            qVar.f6944a = (qVar.f6944a + d21) * 0.5d;
            qVar.f6945b *= 0.5d;
            q qVar2 = d20 < 0.0d ? new q(0.0d, Math.sqrt(Math.abs(d20))) : new q(Math.sqrt(d20), 0.0d);
            double d22 = -1;
            double d23 = qVar2.f6944a * d22;
            double d24 = qVar2.f6945b * d22;
            qVar2.f6944a = (d23 + d21) * 0.5d;
            qVar2.f6945b = d24 * 0.5d;
            if (d18 == 0.0d && d17 == 0.0d) {
                j3 = 0;
            } else {
                if (d18 < 0.0d) {
                    d17 = -d17;
                }
                double abs = Math.abs(d18);
                double d25 = Double.MAX_VALUE;
                if (d10 > 1.0d) {
                    double d26 = qVar.f6944a;
                    double d27 = qVar2.f6944a;
                    double d28 = (d26 * abs) - d17;
                    double d29 = d26 - d27;
                    double d30 = d28 / d29;
                    double d31 = abs - d30;
                    d12 = Math.log(Math.abs(d19 / d31)) / d26;
                    double log = Math.log(Math.abs(d19 / d30)) / d27;
                    if (Double.isInfinite(d12) || Double.isNaN(d12)) {
                        d12 = log;
                    } else if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                        d12 = Math.max(d12, log);
                    }
                    double d32 = d31 * d26;
                    double log2 = Math.log(d32 / ((-d30) * d27)) / (d27 - d26);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d27) * d30) + (Math.exp(d26 * log2) * d31))) < d19) {
                                if (d30 > 0.0d && d31 < 0.0d) {
                                    d12 = 0.0d;
                                }
                            }
                        }
                        d12 = Math.log((-((d30 * d27) * d27)) / (d32 * d26)) / d29;
                        d13 = d30 * d27;
                        if (Math.abs((Math.exp(d27 * d12) * d13) + (Math.exp(d26 * d12) * d32)) >= 1.0E-4d) {
                            int i10 = 0;
                            while (d25 > 0.001d && i10 < 100) {
                                i10++;
                                double d33 = d26 * d12;
                                double d34 = d27 * d12;
                                double exp = d12 - ((((Math.exp(d34) * d30) + (Math.exp(d33) * d31)) + d19) / ((Math.exp(d34) * d13) + (Math.exp(d33) * d32)));
                                d25 = Math.abs(d12 - exp);
                                d12 = exp;
                            }
                        }
                    }
                    d19 = -d19;
                    d13 = d30 * d27;
                    if (Math.abs((Math.exp(d27 * d12) * d13) + (Math.exp(d26 * d12) * d32)) >= 1.0E-4d) {
                    }
                } else if (d10 < 1.0d) {
                    double d35 = qVar.f6944a;
                    double d36 = (d17 - (d35 * abs)) / qVar.f6945b;
                    d12 = Math.log(d19 / Math.sqrt((d36 * d36) + (abs * abs))) / d35;
                } else {
                    double d37 = qVar.f6944a;
                    double d38 = d37 * abs;
                    double d39 = d17 - d38;
                    double log3 = Math.log(Math.abs(d19 / abs)) / d37;
                    double log4 = Math.log(Math.abs(d19 / d39));
                    double d40 = log4;
                    for (int i11 = 0; i11 < 6; i11++) {
                        d40 = log4 - Math.log(Math.abs(d40 / d37));
                    }
                    double d41 = d40 / d37;
                    if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                        log3 = d41;
                    } else if (!Double.isInfinite(d41) && !Double.isNaN(d41)) {
                        log3 = Math.max(log3, d41);
                    }
                    double d42 = (-(d38 + d39)) / (d37 * d39);
                    double d43 = d37 * d42;
                    double exp2 = (Math.exp(d43) * d39 * d42) + (Math.exp(d43) * abs);
                    if (Double.isNaN(d42) || d42 <= 0.0d) {
                        d19 = -d19;
                    } else if (d42 <= 0.0d || (-exp2) >= d19) {
                        log3 = (-(d11 / d37)) - (abs / d39);
                    } else {
                        d19 = -d19;
                        log3 = (d39 >= 0.0d || abs <= 0.0d) ? log3 : 0.0d;
                    }
                    int i12 = 0;
                    while (d25 > 0.001d && i12 < 100) {
                        i12++;
                        double d44 = d37 * log3;
                        double exp3 = log3 - (((Math.exp(d44) * ((d39 * log3) + abs)) + d19) / (Math.exp(d44) * (((1 + d44) * d39) + d38)));
                        d25 = Math.abs(log3 - exp3);
                        log3 = exp3;
                    }
                    d12 = log3;
                }
                j3 = (long) (d12 * 1000.0d);
            }
        }
        return j3 * 1000000;
    }

    @Override // v.y
    public final float e(float f10, float f11, float f12) {
        return 0.0f;
    }
}
