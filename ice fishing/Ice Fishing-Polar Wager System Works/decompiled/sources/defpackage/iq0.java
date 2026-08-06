package defpackage;

/* loaded from: classes.dex */
public final class iq0 extends defpackage.ie {
    public static final float[] AARZUJiTa;
    public static final float[] F7NU4MC0GW;
    public static final float[] adDC3e2L;
    public static final float[] xiZrDbcSW0;

    static {
        float[] mAr5m2L7gYDP = defpackage.ci0.mAr5m2L7gYDP(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, defpackage.ci0.QoRHpC4k((float[]) defpackage.c1NqjJifC7.AARZUJiTa.xiZrDbcSW0, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        F7NU4MC0GW = mAr5m2L7gYDP;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        adDC3e2L = fArr;
        xiZrDbcSW0 = defpackage.ci0.yIx6ChFVk(mAr5m2L7gYDP);
        AARZUJiTa = defpackage.ci0.yIx6ChFVk(fArr);
    }

    @Override // defpackage.ie
    public final long F7NU4MC0GW(float f, float f2, float f3) {
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
        float[] fArr = AARZUJiTa;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = xiZrDbcSW0;
        return (java.lang.Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
    }

    @Override // defpackage.ie
    public final float IHQe1A4L2xu(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.ie
    public final float adDC3e2L(float f, float f2, float f3) {
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
        float[] fArr = AARZUJiTa;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = xiZrDbcSW0;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // defpackage.ie
    public final float oh6vYeIP(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.ie
    public final long xiZrDbcSW0(float f, float f2, float f3, float f4, defpackage.ie ieVar) {
        float[] fArr = F7NU4MC0GW;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float kd6TUFXn = defpackage.s70.kd6TUFXn(f5);
        float kd6TUFXn2 = defpackage.s70.kd6TUFXn(f6);
        float kd6TUFXn3 = defpackage.s70.kd6TUFXn(f7);
        float[] fArr2 = adDC3e2L;
        return defpackage.w70.r1MBDhnF((fArr2[6] * kd6TUFXn3) + (fArr2[3] * kd6TUFXn2) + (fArr2[0] * kd6TUFXn), (fArr2[7] * kd6TUFXn3) + (fArr2[4] * kd6TUFXn2) + (fArr2[1] * kd6TUFXn), (fArr2[8] * kd6TUFXn3) + (fArr2[5] * kd6TUFXn2) + (fArr2[2] * kd6TUFXn), f4, ieVar);
    }
}
