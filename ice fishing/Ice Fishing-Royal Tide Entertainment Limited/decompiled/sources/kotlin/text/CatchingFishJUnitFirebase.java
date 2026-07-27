package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishJUnitFirebase implements CatchingFishAndroidXOkHttp {
    public final float CatchingFishDaggerWebsocket;
    public final float CatchingFishReduxKtor;
    public final float CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;

    public CatchingFishJUnitFirebase(float f, float f2) {
        int CatchingFishGradleLiveData;
        this.CatchingFishReduxKtor = f;
        this.CatchingFishDaggerWebsocket = f2;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            CatchingFishAsyncTaskKtor.CatchingFishParcelableFAB("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, " + f2 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d = 0.0f;
        double d2 = 3.0f;
        double d3 = 0.0f;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            CatchingFishGradleLiveData = d2 == d3 ? 0 : CatchingFishLayoutRoomFAB.CatchingFishGradleLiveData((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int CatchingFishGradleLiveData2 = CatchingFishLayoutRoomFAB.CatchingFishGradleLiveData((float) ((-(d6 + d7)) / d5), fArr, 0);
            CatchingFishGradleLiveData = CatchingFishLayoutRoomFAB.CatchingFishGradleLiveData((float) ((d6 - d7) / d5), fArr, CatchingFishGradleLiveData2) + CatchingFishGradleLiveData2;
            if (CatchingFishGradleLiveData > 1) {
                float f3 = fArr[0];
                float f4 = fArr[1];
                if (f3 > f4) {
                    fArr[0] = f4;
                    fArr[1] = f3;
                } else if (f3 == f4) {
                    CatchingFishGradleLiveData--;
                }
            }
        }
        int CatchingFishGradleLiveData3 = CatchingFishLayoutRoomFAB.CatchingFishGradleLiveData(0.5f, fArr, CatchingFishGradleLiveData) + CatchingFishGradleLiveData;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < CatchingFishGradleLiveData3; i++) {
            float f5 = fArr[i];
            float f6 = ((((((-2.0f) * f5) + 3.0f) * f5) + 0.0f) * f5) + 0.0f;
            min = Math.min(min, f6);
            max = Math.max(max, f6);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.CatchingFishWorkManager = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.CatchingFishViewModelScope = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f7, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0225, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01af, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0249  */
    @Override // kotlin.text.CatchingFishAndroidXOkHttp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float CatchingFishParcelableFAB(float f) {
        float f2;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f3 = this.CatchingFishReduxKtor;
        float f4 = this.CatchingFishDaggerWebsocket;
        float f5 = f4 - f;
        double d = 0.0f - f;
        double d2 = ((d - ((f3 - f) * 2.0d)) + f5) * 3.0d;
        double d3 = (r6 - r4) * 3.0d;
        double d4 = ((r6 - f5) * 3.0d) + (-r4) + (1.0f - f);
        float f6 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double sqrt = Math.sqrt(-d10);
                double d13 = (-d9) / sqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double acos = Math.acos(d13);
                double CatchingFishCoroutineFlow = CatchingFishToastHiltBundle.CatchingFishCoroutineFlow((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * CatchingFishCoroutineFlow) - d12);
                float f7 = cos < 0.0f ? 0.0f : cos;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                if (Math.abs(f7 - cos) > 1.05E-6f) {
                    f7 = Float.NaN;
                }
                if (Float.isNaN(f7)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * CatchingFishCoroutineFlow) - d12);
                    f7 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f7 > 1.0f) {
                        f7 = 1.0f;
                    }
                    if (Math.abs(f7 - cos2) > 1.05E-6f) {
                        f7 = Float.NaN;
                    }
                    if (Float.isNaN(f7)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * CatchingFishCoroutineFlow) - d12);
                        f2 = cos3 < 0.0f ? 0.0f : cos3;
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                    }
                }
                f6 = f7;
                if (Float.isNaN(f6)) {
                }
            } else if (d11 == 0.0d) {
                float f8 = -CatchingFishToastHiltBundle.CatchingFishCoroutineFlow((float) d9);
                float f9 = (float) d12;
                float f10 = (2.0f * f8) - f9;
                float f11 = f10 < 0.0f ? 0.0f : f10;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - f10) > 1.05E-6f) {
                    f11 = Float.NaN;
                }
                if (Float.isNaN(f11)) {
                    float f12 = (-f8) - f9;
                    f2 = f12 < 0.0f ? 0.0f : f12;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                } else {
                    f6 = f11;
                }
                if (Float.isNaN(f6)) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float CatchingFishCoroutineFlow2 = (float) ((CatchingFishToastHiltBundle.CatchingFishCoroutineFlow((float) ((-d9) + sqrt2)) - CatchingFishToastHiltBundle.CatchingFishCoroutineFlow((float) (d9 + sqrt2))) - d12);
                f2 = CatchingFishCoroutineFlow2 < 0.0f ? 0.0f : CatchingFishCoroutineFlow2;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f13 = (float) ((-d) / d3);
                    f2 = f13 < 0.0f ? 0.0f : f13;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                }
                if (Float.isNaN(f6)) {
                    float f14 = (((((-0.6666666f) * f6) + 1.0f) * f6) + 0.0f) * 3.0f * f6;
                    float f15 = this.CatchingFishWorkManager;
                    if (f14 < f15) {
                        f14 = f15;
                    }
                    float f16 = this.CatchingFishViewModelScope;
                    return f14 > f16 ? f16 : f14;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f3 + ", 0.0, " + f4 + ", 1.0) has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f17 = (float) ((sqrt3 - d3) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > 1.05E-6f) {
                f18 = Float.NaN;
            }
            if (Float.isNaN(f18)) {
                float f19 = (float) (((-d3) - sqrt3) / d14);
                f2 = f19 < 0.0f ? 0.0f : f19;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
            } else {
                f6 = f18;
            }
            if (Float.isNaN(f6)) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishJUnitFirebase)) {
            return false;
        }
        CatchingFishJUnitFirebase catchingFishJUnitFirebase = (CatchingFishJUnitFirebase) obj;
        return this.CatchingFishReduxKtor == catchingFishJUnitFirebase.CatchingFishReduxKtor && this.CatchingFishDaggerWebsocket == catchingFishJUnitFirebase.CatchingFishDaggerWebsocket;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + CatchingFishMVPLiveData.CatchingFishWorkManager(this.CatchingFishDaggerWebsocket, CatchingFishMVPLiveData.CatchingFishWorkManager(0.0f, Float.hashCode(this.CatchingFishReduxKtor) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.CatchingFishReduxKtor + ", b=0.0, c=" + this.CatchingFishDaggerWebsocket + ", d=1.0)";
    }
}
