package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r implements v {

    /* renamed from: g, reason: collision with root package name */
    public final float f6948g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6949h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6950i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6951j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6952k;

    public r(float f10, float f11, float f12) {
        int y10;
        this.f6948g = f10;
        this.f6949h = f11;
        this.f6950i = f12;
        if (Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(1.0f)) {
            m0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f13 = (f11 - 0.0f) * 3.0f;
        float f14 = (1.0f - f11) * 3.0f;
        double d10 = f13;
        double d11 = f14;
        double d12 = 0.0f;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            y10 = d11 == d12 ? 0 : f1.d0.y((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int y11 = f1.d0.y((float) ((-(d15 + d16)) / d14), fArr, 0);
            y10 = f1.d0.y((float) ((d15 - d16) / d14), fArr, y11) + y11;
            if (y10 > 1) {
                float f15 = fArr[0];
                float f16 = fArr[1];
                if (f15 > f16) {
                    fArr[0] = f16;
                    fArr[1] = f15;
                } else if (f15 == f16) {
                    y10--;
                }
            }
        }
        float f17 = (f14 - f13) * 2.0f;
        int y12 = f1.d0.y((-f17) / (((0.0f - f14) * 2.0f) - f17), fArr, y10) + y10;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < y12; i10++) {
            float f18 = fArr[i10];
            float f19 = (((((((((f11 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f18) + (((1.0f - (f11 * 2.0f)) + 0.0f) * 3.0f)) * f18) + f13) * f18) + 0.0f;
            min = Math.min(min, f19);
            max = Math.max(max, f19);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f6951j = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f6952k = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f5, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0222, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024c  */
    @Override // v.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f10) {
        boolean isNaN;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float f11 = this.f6948g;
        float f12 = this.f6950i;
        float f13 = f12 - f10;
        double d10 = 0.0f - f10;
        float f14 = 0.0f;
        double d11 = ((d10 - ((f11 - f10) * 2.0d)) + f13) * 3.0d;
        double d12 = (r6 - r4) * 3.0d;
        double d13 = ((r6 - f13) * 3.0d) + (-r4) + (1.0f - f10);
        float f15 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double sqrt = Math.sqrt(-d19);
                double d22 = (-d18) / sqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double acos = Math.acos(d22);
                double k3 = u2.b.k((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * k3) - d21);
                float f16 = cos < 0.0f ? 0.0f : cos;
                if (f16 > 1.0f) {
                    f16 = 1.0f;
                }
                if (Math.abs(f16 - cos) > 1.05E-6f) {
                    f16 = Float.NaN;
                }
                if (Float.isNaN(f16)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * k3) - d21);
                    f16 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f16 > 1.0f) {
                        f16 = 1.0f;
                    }
                    if (Math.abs(f16 - cos2) > 1.05E-6f) {
                        f16 = Float.NaN;
                    }
                    if (Float.isNaN(f16)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * k3) - d21);
                        if (cos3 >= 0.0f) {
                            f14 = cos3;
                        }
                        if (f14 > 1.0f) {
                            f14 = 1.0f;
                        }
                    }
                }
                f15 = f16;
                isNaN = Float.isNaN(f15);
                float f17 = this.f6949h;
                if (isNaN) {
                }
            } else if (d20 == 0.0d) {
                float f18 = -u2.b.k((float) d18);
                float f19 = (float) d21;
                float f20 = (f18 * 2.0f) - f19;
                float f21 = f20 < 0.0f ? 0.0f : f20;
                if (f21 > 1.0f) {
                    f21 = 1.0f;
                }
                if (Math.abs(f21 - f20) > 1.05E-6f) {
                    f21 = Float.NaN;
                }
                if (Float.isNaN(f21)) {
                    float f22 = (-f18) - f19;
                    if (f22 >= 0.0f) {
                        f14 = f22;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                } else {
                    f15 = f21;
                }
                isNaN = Float.isNaN(f15);
                float f172 = this.f6949h;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d20);
                float k10 = (float) ((u2.b.k((float) ((-d18) + sqrt2)) - u2.b.k((float) (d18 + sqrt2))) - d21);
                if (k10 >= 0.0f) {
                    f14 = k10;
                }
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d11 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
                    float f23 = (float) ((-d10) / d12);
                    if (f23 >= 0.0f) {
                        f14 = f23;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                }
                isNaN = Float.isNaN(f15);
                float f1722 = this.f6949h;
                if (isNaN) {
                    float f24 = ((((((f1722 - 1.0f) + 0.33333334f) * f15) + (1.0f - (2.0f * f1722))) * f15) + f1722) * 3.0f * f15;
                    float f25 = this.f6951j;
                    if (f24 < f25) {
                        f24 = f25;
                    }
                    float f26 = this.f6952k;
                    return f24 > f26 ? f26 : f24;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f11 + ", " + f1722 + ", " + f12 + ", 1.0) has no solution at " + f10);
            }
            double sqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            float f27 = (float) ((sqrt3 - d12) / d23);
            float f28 = f27 < 0.0f ? 0.0f : f27;
            if (f28 > 1.0f) {
                f28 = 1.0f;
            }
            if (Math.abs(f28 - f27) > 1.05E-6f) {
                f28 = Float.NaN;
            }
            if (Float.isNaN(f28)) {
                float f29 = (float) (((-d12) - sqrt3) / d23);
                if (f29 >= 0.0f) {
                    f14 = f29;
                }
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
            } else {
                f15 = f28;
            }
            isNaN = Float.isNaN(f15);
            float f17222 = this.f6949h;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6948g == rVar.f6948g && this.f6949h == rVar.f6949h && this.f6950i == rVar.f6950i;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + a4.d.b(this.f6950i, a4.d.b(this.f6949h, Float.hashCode(this.f6948g) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f6948g + ", b=" + this.f6949h + ", c=" + this.f6950i + ", d=1.0)";
    }
}
