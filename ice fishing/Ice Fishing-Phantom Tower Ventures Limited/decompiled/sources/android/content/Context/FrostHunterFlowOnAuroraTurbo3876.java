package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFlowOnAuroraTurbo3876 extends FrostHunterJavaPhoenixNebula9385 {
    public final /* synthetic */ int FrostHunterServiceEliteCelestialThunder1757;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterFlowOnAuroraTurbo3876(int i, int i2, long j, String str) {
        super(i, j, str);
        this.FrostHunterServiceEliteCelestialThunder1757 = i2;
    }

    @Override // android.content.Context.FrostHunterJavaPhoenixNebula9385
    public final float FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        switch (this.FrostHunterServiceEliteCelestialThunder1757) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // android.content.Context.FrostHunterJavaPhoenixNebula9385
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        switch (this.FrostHunterServiceEliteCelestialThunder1757) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // android.content.Context.FrostHunterJavaPhoenixNebula9385
    public final long FrostHunterLevelListDrawableFusionDragonHero2232(float f, float f2, float f3, float f4, FrostHunterJavaPhoenixNebula9385 frostHunterJavaPhoenixNebula9385) {
        switch (this.FrostHunterServiceEliteCelestialThunder1757) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float[] fArr = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLightSensorForceFusion4241;
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
                return FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterAlphaAnimationNeoCosmos5761(f8, f9, f10 <= 128.0f ? f10 : 128.0f, f4, frostHunterJavaPhoenixNebula9385);
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
                return FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterAlphaAnimationNeoCosmos5761(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, frostHunterJavaPhoenixNebula9385);
        }
    }

    @Override // android.content.Context.FrostHunterJavaPhoenixNebula9385
    public final float FrostHunterLifecycleBlazeGammaElite2889(float f, float f2, float f3) {
        switch (this.FrostHunterServiceEliteCelestialThunder1757) {
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
                return (f4 > 0.20689656f ? f4 * f4 * f4 : 0.12841855f * (f4 - 0.13793103f)) * FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLightSensorForceFusion4241[2];
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

    @Override // android.content.Context.FrostHunterJavaPhoenixNebula9385
    public final long FrostHunterServiceEliteCelestialThunder1757(float f, float f2, float f3) {
        long floatToRawIntBits;
        long j;
        switch (this.FrostHunterServiceEliteCelestialThunder1757) {
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
                float[] fArr = FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterLightSensorForceFusion4241;
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
}
