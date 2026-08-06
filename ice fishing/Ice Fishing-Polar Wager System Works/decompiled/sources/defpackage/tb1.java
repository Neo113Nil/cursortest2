package defpackage;

/* loaded from: classes.dex */
public final class tb1 {
    public float IHQe1A4L2xu;
    public double oh6vYeIP;
    public float r1MBDhnF;

    public final long IHQe1A4L2xu(float f, float f2, long j) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f3 = f - this.IHQe1A4L2xu;
        double d = j / 1000.0d;
        float f4 = this.r1MBDhnF;
        double d2 = f4 * f4;
        double d3 = this.oh6vYeIP;
        double d4 = (-f4) * d3;
        if (f4 > 1.0f) {
            double sqrt = java.lang.Math.sqrt(d2 - 1.0d) * d3;
            double d5 = d4 + sqrt;
            double d6 = d4 - sqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - f2) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            sin = (java.lang.Math.exp(d11) * d8) + (java.lang.Math.exp(d10) * d9);
            exp = java.lang.Math.exp(d10) * d9 * d6;
            exp2 = java.lang.Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double sqrt2 = java.lang.Math.sqrt(1.0d - d2) * d3;
                double d12 = f3;
                double d13 = (((-d4) * d12) + f2) * (1.0d / sqrt2);
                double d14 = sqrt2 * d;
                double d15 = d * d4;
                sin = ((java.lang.Math.sin(d14) * d13) + (java.lang.Math.cos(d14) * d12)) * java.lang.Math.exp(d15);
                cos = (((java.lang.Math.cos(d14) * sqrt2 * d13) + (java.lang.Math.sin(d14) * (-sqrt2) * d12)) * java.lang.Math.exp(d15)) + (d4 * sin);
                return (java.lang.Float.floatToRawIntBits((float) cos) & 4294967295L) | (java.lang.Float.floatToRawIntBits((float) (sin + this.IHQe1A4L2xu)) << 32);
            }
            double d16 = f3;
            double d17 = (d3 * d16) + f2;
            double d18 = (-d3) * d;
            double d19 = (d * d17) + d16;
            sin = java.lang.Math.exp(d18) * d19;
            exp = java.lang.Math.exp(d18) * d19 * (-this.oh6vYeIP);
            exp2 = java.lang.Math.exp(d18) * d17;
        }
        cos = exp2 + exp;
        return (java.lang.Float.floatToRawIntBits((float) cos) & 4294967295L) | (java.lang.Float.floatToRawIntBits((float) (sin + this.IHQe1A4L2xu)) << 32);
    }
}
