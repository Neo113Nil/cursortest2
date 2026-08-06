package defpackage;

/* loaded from: classes.dex */
public final class o90 extends defpackage.ie {
    public final /* synthetic */ int F7NU4MC0GW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o90(int i, int i2, long j, java.lang.String str) {
        super(str, j, i);
        this.F7NU4MC0GW = i2;
    }

    @Override // defpackage.ie
    public final long F7NU4MC0GW(float f, float f2, float f3) {
        long floatToRawIntBits;
        long j;
        switch (this.F7NU4MC0GW) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f4 = (f + 16.0f) / 116.0f;
                float f5 = (f2 * 0.002f) + f4;
                float f6 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
                float f7 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
                float[] fArr = defpackage.mj1.JlrlGoKF;
                float f8 = f6 * fArr[0];
                float f9 = f7 * fArr[1];
                long floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f8);
                floatToRawIntBits = java.lang.Float.floatToRawIntBits(f9);
                j = floatToRawIntBits2 << 32;
                break;
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                float f10 = f2 <= 2.0f ? f2 : 2.0f;
                long floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f);
                floatToRawIntBits = java.lang.Float.floatToRawIntBits(f10);
                j = floatToRawIntBits3 << 32;
                break;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }

    @Override // defpackage.ie
    public final float IHQe1A4L2xu(int i) {
        switch (this.F7NU4MC0GW) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // defpackage.ie
    public final float adDC3e2L(float f, float f2, float f3) {
        switch (this.F7NU4MC0GW) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f4 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * defpackage.mj1.JlrlGoKF[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // defpackage.ie
    public final float oh6vYeIP(int i) {
        switch (this.F7NU4MC0GW) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // defpackage.ie
    public final long xiZrDbcSW0(float f, float f2, float f3, float f4, defpackage.ie ieVar) {
        switch (this.F7NU4MC0GW) {
            case 0:
                float[] fArr = defpackage.mj1.JlrlGoKF;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float cbrt = f5 > 0.008856452f ? (float) java.lang.Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float cbrt2 = f6 > 0.008856452f ? (float) java.lang.Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float cbrt3 = f7 > 0.008856452f ? (float) java.lang.Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
                float f8 = (116.0f * cbrt2) - 16.0f;
                float f9 = (cbrt - cbrt2) * 500.0f;
                float f10 = (cbrt2 - cbrt3) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                return defpackage.w70.r1MBDhnF(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, ieVar);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                return defpackage.w70.r1MBDhnF(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, ieVar);
        }
    }
}
