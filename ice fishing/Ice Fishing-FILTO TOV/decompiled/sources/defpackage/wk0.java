package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wk0 extends gc {
    public static final float[] AvO7iQsrTN;
    public static final float[] EljAMC1QTz;
    public static final float[] OOA6hdeuvCS;
    public static final float[] xqGvceK5x;

    static {
        float[] A1EKNP6CxJ = qj.A1EKNP6CxJ(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, qj.E7jCp8Ls((float[]) j6IIN2O8eOU.AvO7iQsrTN.EljAMC1QTz, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        xqGvceK5x = A1EKNP6CxJ;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        OOA6hdeuvCS = fArr;
        EljAMC1QTz = qj.ozMwhSAI(A1EKNP6CxJ);
        AvO7iQsrTN = qj.ozMwhSAI(fArr);
    }

    @Override // defpackage.gc
    public final long EljAMC1QTz(float f, float f2, float f3, float f4, gc gcVar) {
        float[] fArr = xqGvceK5x;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float XnEVoBF0td1l = o50.XnEVoBF0td1l(f5);
        float XnEVoBF0td1l2 = o50.XnEVoBF0td1l(f6);
        float XnEVoBF0td1l3 = o50.XnEVoBF0td1l(f7);
        float[] fArr2 = OOA6hdeuvCS;
        return ki1.Yi7zF1RB1((fArr2[6] * XnEVoBF0td1l3) + (fArr2[3] * XnEVoBF0td1l2) + (fArr2[0] * XnEVoBF0td1l), (fArr2[7] * XnEVoBF0td1l3) + (fArr2[4] * XnEVoBF0td1l2) + (fArr2[1] * XnEVoBF0td1l), (fArr2[8] * XnEVoBF0td1l3) + (fArr2[5] * XnEVoBF0td1l2) + (fArr2[2] * XnEVoBF0td1l), f4, gcVar);
    }

    @Override // defpackage.gc
    public final float GWasM1elztuh(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.gc
    public final float OOA6hdeuvCS(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = AvO7iQsrTN;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = EljAMC1QTz;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // defpackage.gc
    public final float Yi7zF1RB1(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.gc
    public final long xqGvceK5x(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = AvO7iQsrTN;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = EljAMC1QTz;
        return (Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
    }
}
