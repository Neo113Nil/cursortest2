package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ArcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839 implements DragonRouteDelegateJITXnTHRIslKPbKfxEaJY54603611270972 {
    public final float BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final float LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final float TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final float UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final float YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ArcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839(float f, float f2, float f3, float f4) {
        int i;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = f;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = f2;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = f3;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            ObsidianEngineImmutableCallbackXWS7BzxlNPNBMmMQJD75621800621051.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            i = d2 == d3 ? 0 : BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987((float) ((-(d6 + d7)) / d5), fArr, 0);
            int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul3716916576309872 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987((float) ((d6 - d7) / d5), fArr, JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987) + JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987;
            if (JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul3716916576309872 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    i = JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul3716916576309872 - 1;
                }
            }
            i = JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul3716916576309872;
        }
        float f10 = (f6 - f5) * 2.0f;
        int JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul3716916576309873 = BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul3716916576309873; i2++) {
            float f11 = fArr[i2];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            min = Math.min(min, f12);
            max = Math.max(max, f12);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // androidx.versionedparcelable.DragonRouteDelegateJITXnTHRIslKPbKfxEaJY54603611270972
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(float f) {
        float f2;
        boolean isNaN;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float max = Math.max(f, 1.1920929E-7f);
        float f3 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        float f4 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        float f5 = f4 - max;
        double d = 0.0f - max;
        float f6 = 0.0f;
        double d2 = ((d - ((f3 - max) * 2.0d)) + f5) * 3.0d;
        double d3 = (r7 - r5) * 3.0d;
        double d4 = ((r7 - f5) * 3.0d) + (-r5) + (1.0f - max);
        float f7 = Float.NaN;
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
                double KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216 = DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) - d12);
                float f8 = cos < 0.0f ? 0.0f : cos;
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
                if (Math.abs(f8 - cos) > 1.05E-6f) {
                    f8 = Float.NaN;
                }
                if (Float.isNaN(f8)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) - d12);
                    f8 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    if (Math.abs(f8 - cos2) > 1.05E-6f) {
                        f8 = Float.NaN;
                    }
                    if (Float.isNaN(f8)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216) - d12);
                        if (cos3 >= 0.0f) {
                            f6 = cos3;
                        }
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                }
                f7 = f8;
                isNaN = Float.isNaN(f7);
                float f9 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                float f10 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (isNaN) {
                }
            } else if (d11 == 0.0d) {
                float f11 = -DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((float) d9);
                float f12 = (float) d12;
                float f13 = (f11 * 2.0f) - f12;
                float f14 = f13 < 0.0f ? 0.0f : f13;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float f15 = (-f11) - f12;
                    if (f15 >= 0.0f) {
                        f6 = f15;
                    }
                    f2 = f6 > 1.0f ? 1.0f : f6;
                } else {
                    f7 = f14;
                }
                isNaN = Float.isNaN(f7);
                float f92 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                float f102 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d11);
                float KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 = (float) ((DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((float) ((-d9) + sqrt2)) - DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((float) (d9 + sqrt2))) - d12);
                if (KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162 >= 0.0f) {
                    f6 = KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI127618575572162;
                }
                f2 = f6 > 1.0f ? 1.0f : f6;
            }
        } else {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
                    float f16 = (float) ((-d) / d3);
                    if (f16 >= 0.0f) {
                        f6 = f16;
                    }
                    f2 = f6 > 1.0f ? 1.0f : f6;
                }
                isNaN = Float.isNaN(f7);
                float f922 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                float f1022 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (isNaN) {
                    float f17 = ((((((f1022 - f922) + 0.33333334f) * f7) + (f922 - (2.0f * f1022))) * f7) + f1022) * 3.0f * f7;
                    float f18 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                    if (f17 < f18) {
                        f17 = f18;
                    }
                    float f19 = this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                    return f17 > f19 ? f19 : f17;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f3 + ", " + f1022 + ", " + f4 + ", " + f922 + ") has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f20 = (float) ((sqrt3 - d3) / d14);
            float f21 = f20 < 0.0f ? 0.0f : f20;
            if (f21 > 1.0f) {
                f21 = 1.0f;
            }
            if (Math.abs(f21 - f20) > 1.05E-6f) {
                f21 = Float.NaN;
            }
            if (Float.isNaN(f21)) {
                float f22 = (float) (((-d3) - sqrt3) / d14);
                if (f22 >= 0.0f) {
                    f6 = f22;
                }
                f2 = f6 > 1.0f ? 1.0f : f6;
            } else {
                f7 = f21;
            }
            isNaN = Float.isNaN(f7);
            float f9222 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
            float f10222 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ArcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839)) {
            return false;
        }
        ArcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839 arcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839 = (ArcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839) obj;
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == arcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 && this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == arcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 && this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == arcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 && this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 == arcticByteCallbackBootstrapIIMDrQC3jYIbSjrDC181759432584839.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    }

    public final int hashCode() {
        return Float.hashCode(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) + MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, Float.hashCode(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        sb.append(", b=");
        sb.append(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        sb.append(", c=");
        sb.append(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
        sb.append(", d=");
        return MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(sb, this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, ')');
    }
}
