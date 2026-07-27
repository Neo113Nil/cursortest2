package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelVariableNormalizationPvIMCi2NZbFKi4sFZ445503006259248 extends YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 {
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlueKernelVariableNormalizationPvIMCi2NZbFKi4sFZ445503006259248(int i, int i2, long j, String str) {
        super(i, j, str);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i2;
    }

    @Override // androidx.versionedparcelable.YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935
    public final float AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int i) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // androidx.versionedparcelable.YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935
    public final float LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(float f, float f2, float f3) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050[2];
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

    @Override // androidx.versionedparcelable.YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935
    public final float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // androidx.versionedparcelable.YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935
    public final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(float f, float f2, float f3) {
        long floatToRawIntBits;
        long j;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
                float[] fArr = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                float f8 = f6 * fArr[0];
                float f9 = f7 * fArr[1];
                long floatToRawIntBits2 = Float.floatToRawIntBits(f8);
                floatToRawIntBits = Float.floatToRawIntBits(f9);
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
                long floatToRawIntBits3 = Float.floatToRawIntBits(f);
                floatToRawIntBits = Float.floatToRawIntBits(f10);
                j = floatToRawIntBits3 << 32;
                break;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }

    @Override // androidx.versionedparcelable.YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935
    public final long YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(float f, float f2, float f3, float f4, YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935) {
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float[] fArr = RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                float f5 = f / fArr[0];
                float f6 = f2 / fArr[1];
                float f7 = f3 / fArr[2];
                float cbrt = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
                float cbrt2 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
                float cbrt3 = f7 > 0.008856452f ? (float) Math.cbrt(f7) : (f7 * 7.787037f) + 0.13793103f;
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
                return FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935);
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
                return FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935);
        }
    }
}
