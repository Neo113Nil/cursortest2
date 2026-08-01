package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchBatch extends WinterFlowTransactionManagerBackend {
    public static final WinterFlowEventEmitterOrchestration WinterFlowSingletonPlatform = new WinterFlowEventEmitterOrchestration(16);
    public final WinterFlowGatewayPlatform WinterFlowArrayNetwork;
    public final WinterFlowResponseComponent WinterFlowBandwidthObject;
    public final boolean WinterFlowConcurrencyThread;
    public final WinterFlowRequestConfiguration WinterFlowOrchestrationSubsystem;
    public final float[] WinterFlowResponseEngine;
    public final float[] WinterFlowRouterRouter;
    public final WinterFlowResponseComponent WinterFlowServerProtocol;
    public final WinterFlowAlgorithmSystem WinterFlowServiceUtility;
    public final float[] WinterFlowSyntax;
    public final WinterFlowRequestConfiguration WinterFlowThreadListener;
    public final WinterFlowAlgorithmSystem WinterFlowTransactionAgent;
    public final float WinterFlowTransactionManagerStrategy;
    public final WinterFlowProviderMechanism WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01df, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowBatchBatch(String str, float[] fArr, WinterFlowGatewayPlatform winterFlowGatewayPlatform, float[] fArr2, WinterFlowAlgorithmSystem winterFlowAlgorithmSystem, WinterFlowAlgorithmSystem winterFlowAlgorithmSystem2, float f, float f2, WinterFlowProviderMechanism winterFlowProviderMechanism, int i) {
        super(str, 12884901888L, i);
        ?? r44;
        float f3;
        float[] fArr3;
        float f4;
        boolean z;
        this.WinterFlowArrayNetwork = winterFlowGatewayPlatform;
        this.WinterFlowVariableVersionControl = f;
        this.WinterFlowTransactionManagerStrategy = f2;
        this.WinterFlowUnitTestResponse = winterFlowProviderMechanism;
        this.WinterFlowTransactionAgent = winterFlowAlgorithmSystem;
        int i2 = 1;
        this.WinterFlowServerProtocol = new WinterFlowResponseComponent(this, i2);
        int i3 = 0;
        this.WinterFlowThreadListener = new WinterFlowRequestConfiguration(this, i3);
        this.WinterFlowServiceUtility = winterFlowAlgorithmSystem2;
        this.WinterFlowBandwidthObject = new WinterFlowResponseComponent(this, i3);
        this.WinterFlowOrchestrationSubsystem = new WinterFlowRequestConfiguration(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.WinterFlowRouterRouter = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = winterFlowGatewayPlatform.WinterFlowRouterStructure;
            r44 = 1;
            float f21 = winterFlowGatewayPlatform.WinterFlowHookDataSource;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.WinterFlowSyntax = fArr3;
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.WinterFlowSyntax = fArr2;
            fArr3 = fArr2;
        }
        this.WinterFlowResponseEngine = WinterFlowHandlerWebsocket.WinterFlowEventEmitterController(fArr3);
        float WinterFlowCacheManagerAgent = WinterFlowProviderRouter.WinterFlowCacheManagerAgent(fArr4);
        float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
        if (WinterFlowCacheManagerAgent / WinterFlowProviderRouter.WinterFlowCacheManagerAgent(WinterFlowIDEStructure.WinterFlowHookDataSource) > 0.9f) {
            float[] fArr6 = WinterFlowIDEStructure.WinterFlowRouterStructure;
            float f38 = fArr4[0];
            float f39 = fArr6[0];
            float f40 = fArr4[r44];
            float f41 = fArr6[r44];
            float f42 = fArr4[2];
            float f43 = fArr6[2];
            float f44 = fArr4[3];
            float f45 = fArr6[3];
            float f46 = fArr4[4];
            float f47 = fArr6[4];
            float f48 = fArr4[5];
            float f49 = fArr6[5];
            f4 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[0] = f38 - f39;
            fArr7[r44] = f40 - f41;
            fArr7[2] = f42 - f43;
            fArr7[3] = f44 - f45;
            fArr7[4] = f46 - f47;
            fArr7[5] = f48 - f49;
            float f50 = fArr7[0];
            float f51 = fArr7[r44];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr7[2];
                float f53 = fArr7[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr7[4];
                    float f55 = fArr7[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                    }
                }
            }
        } else {
            f4 = 0.0f;
        }
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr8 = WinterFlowIDEStructure.WinterFlowRouterStructure;
            if (fArr4 != fArr8) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (Float.compare(fArr4[i5], fArr8[i5]) != 0 && Math.abs(fArr4[i5] - fArr8[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (WinterFlowHandlerWebsocket.WinterFlowServiceUtility(winterFlowGatewayPlatform, WinterFlowEncryptionSubsystem.WinterFlowResponseEngine) && f == f4 && f2 == f3) {
                float[] fArr9 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                WinterFlowBatchBatch winterFlowBatchBatch = WinterFlowIDEStructure.WinterFlowVariableVersionControl;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(winterFlowAlgorithmSystem.WinterFlowHookDataSource(d) - winterFlowBatchBatch.WinterFlowTransactionAgent.WinterFlowHookDataSource(d)) <= 0.001d && Math.abs(winterFlowAlgorithmSystem2.WinterFlowHookDataSource(d) - winterFlowBatchBatch.WinterFlowServiceUtility.WinterFlowHookDataSource(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.WinterFlowConcurrencyThread = z;
        }
        z = r44;
        this.WinterFlowConcurrencyThread = z;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final long WinterFlowArrayNetwork(float f, float f2, float f3) {
        double d = f;
        WinterFlowRequestConfiguration winterFlowRequestConfiguration = this.WinterFlowOrchestrationSubsystem;
        float WinterFlowHookDataSource = (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(d);
        float WinterFlowHookDataSource2 = (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f2);
        float WinterFlowHookDataSource3 = (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f3);
        float[] fArr = this.WinterFlowSyntax;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * WinterFlowHookDataSource3) + (fArr[3] * WinterFlowHookDataSource2) + (fArr[0] * WinterFlowHookDataSource);
        float f5 = (fArr[7] * WinterFlowHookDataSource3) + (fArr[4] * WinterFlowHookDataSource2) + (fArr[1] * WinterFlowHookDataSource);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final boolean WinterFlowCacheManagerAgent() {
        return this.WinterFlowConcurrencyThread;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final float WinterFlowHookDataSource(int i) {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final float WinterFlowRouterStructure(int i) {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final long WinterFlowTransactionManagerStrategy(float f, float f2, float f3, float f4, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend) {
        float[] fArr = this.WinterFlowResponseEngine;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        WinterFlowRequestConfiguration winterFlowRequestConfiguration = this.WinterFlowThreadListener;
        return WinterFlowInvokerComponent.WinterFlowCacheManagerAgent((float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f5), (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f6), (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f7), f4, winterFlowTransactionManagerBackend);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final float WinterFlowVariableVersionControl(float f, float f2, float f3) {
        double d = f;
        WinterFlowRequestConfiguration winterFlowRequestConfiguration = this.WinterFlowOrchestrationSubsystem;
        float WinterFlowHookDataSource = (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(d);
        float WinterFlowHookDataSource2 = (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f2);
        float WinterFlowHookDataSource3 = (float) winterFlowRequestConfiguration.WinterFlowHookDataSource(f3);
        float[] fArr = this.WinterFlowSyntax;
        return (fArr[8] * WinterFlowHookDataSource3) + (fArr[5] * WinterFlowHookDataSource2) + (fArr[2] * WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowBatchBatch.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        WinterFlowBatchBatch winterFlowBatchBatch = (WinterFlowBatchBatch) obj;
        if (Float.compare(winterFlowBatchBatch.WinterFlowVariableVersionControl, this.WinterFlowVariableVersionControl) != 0 || Float.compare(winterFlowBatchBatch.WinterFlowTransactionManagerStrategy, this.WinterFlowTransactionManagerStrategy) != 0 || !WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowBatchBatch.WinterFlowArrayNetwork) || !Arrays.equals(this.WinterFlowRouterRouter, winterFlowBatchBatch.WinterFlowRouterRouter)) {
            return false;
        }
        WinterFlowProviderMechanism winterFlowProviderMechanism = winterFlowBatchBatch.WinterFlowUnitTestResponse;
        WinterFlowProviderMechanism winterFlowProviderMechanism2 = this.WinterFlowUnitTestResponse;
        if (winterFlowProviderMechanism2 != null) {
            return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowProviderMechanism2, winterFlowProviderMechanism);
        }
        if (winterFlowProviderMechanism == null) {
            return true;
        }
        if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionAgent, winterFlowBatchBatch.WinterFlowTransactionAgent)) {
            return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowServiceUtility, winterFlowBatchBatch.WinterFlowServiceUtility);
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerBackend
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.WinterFlowRouterRouter) + ((this.WinterFlowArrayNetwork.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.WinterFlowVariableVersionControl;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.WinterFlowTransactionManagerStrategy;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        WinterFlowProviderMechanism winterFlowProviderMechanism = this.WinterFlowUnitTestResponse;
        int hashCode2 = floatToIntBits2 + (winterFlowProviderMechanism != null ? winterFlowProviderMechanism.hashCode() : 0);
        if (winterFlowProviderMechanism != null) {
            return hashCode2;
        }
        return this.WinterFlowServiceUtility.hashCode() + ((this.WinterFlowTransactionAgent.hashCode() + (hashCode2 * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowBatchBatch(String str, float[] fArr, WinterFlowGatewayPlatform winterFlowGatewayPlatform, final WinterFlowProviderMechanism winterFlowProviderMechanism, int i) {
        this(str, fArr, winterFlowGatewayPlatform, null, r4, r0, 0.0f, 1.0f, winterFlowProviderMechanism, i);
        double d;
        WinterFlowAlgorithmSystem winterFlowAlgorithmSystem;
        WinterFlowAlgorithmSystem winterFlowAlgorithmSystem2;
        double d2 = winterFlowProviderMechanism.WinterFlowRouterStructure;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = winterFlowProviderMechanism.WinterFlowUnitTestResponse;
        double d4 = winterFlowProviderMechanism.WinterFlowTransactionManagerStrategy;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            winterFlowAlgorithmSystem = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d5) {
                    int i5 = i4;
                    WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                    switch (i5) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                        case 1:
                            float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                        case 2:
                            double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                        case 3:
                            double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                        case 4:
                            float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                winterFlowAlgorithmSystem = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                    @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                    public final double WinterFlowHookDataSource(double d5) {
                        int i52 = i5;
                        WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                        switch (i52) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                            case 1:
                                float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                            case 2:
                                double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                            case 3:
                                double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                            case 4:
                                float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                winterFlowAlgorithmSystem = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                    @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                    public final double WinterFlowHookDataSource(double d5) {
                        int i52 = i6;
                        WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                        switch (i52) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                            case 1:
                                float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                            case 2:
                                double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                            case 3:
                                double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                            case 4:
                                float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                winterFlowAlgorithmSystem = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                    @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                    public final double WinterFlowHookDataSource(double d5) {
                        int i52 = i7;
                        WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                        switch (i52) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                            case 1:
                                float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                            case 2:
                                double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                            case 3:
                                double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                            case 4:
                                float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                                return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                                double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                                double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                                return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            winterFlowAlgorithmSystem2 = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d5) {
                    int i52 = i2;
                    WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                        case 1:
                            float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                        case 2:
                            double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                        case 3:
                            double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                        case 4:
                            float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            winterFlowAlgorithmSystem2 = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d5) {
                    int i52 = i3;
                    WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                        case 1:
                            float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                        case 2:
                            double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                        case 3:
                            double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                        case 4:
                            float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            winterFlowAlgorithmSystem2 = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d5) {
                    int i52 = i8;
                    WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                        case 1:
                            float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                        case 2:
                            double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                        case 3:
                            double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                        case 4:
                            float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            winterFlowAlgorithmSystem2 = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowQueryEntity
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d5) {
                    int i52 = i9;
                    WinterFlowProviderMechanism winterFlowProviderMechanism2 = winterFlowProviderMechanism;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowRouterStructure(winterFlowProviderMechanism2, d5);
                        case 1:
                            float[] fArr3 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowCacheManagerAgent(winterFlowProviderMechanism2, d5);
                        case 2:
                            double d6 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d6 * d5) + winterFlowProviderMechanism2.WinterFlowCacheManagerAgent, winterFlowProviderMechanism2.WinterFlowRouterStructure) : winterFlowProviderMechanism2.WinterFlowArrayNetwork * d5;
                        case 3:
                            double d7 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d8 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d9 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl ? Math.pow((d7 * d5) + d8, winterFlowProviderMechanism2.WinterFlowRouterStructure) + winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy : (d9 * d5) + winterFlowProviderMechanism2.WinterFlowUnitTestResponse;
                        case 4:
                            float[] fArr4 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowHookDataSource(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = WinterFlowIDEStructure.WinterFlowRouterStructure;
                            return WinterFlowIDEStructure.WinterFlowArrayNetwork(winterFlowProviderMechanism2, d5);
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d11 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d12 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d12 ? (Math.pow(d5, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = winterFlowProviderMechanism2.WinterFlowHookDataSource;
                            double d14 = winterFlowProviderMechanism2.WinterFlowCacheManagerAgent;
                            double d15 = winterFlowProviderMechanism2.WinterFlowArrayNetwork;
                            return d5 >= winterFlowProviderMechanism2.WinterFlowVariableVersionControl * d15 ? (Math.pow(d5 - winterFlowProviderMechanism2.WinterFlowTransactionManagerStrategy, 1.0d / winterFlowProviderMechanism2.WinterFlowRouterStructure) - d14) / d13 : (d5 - winterFlowProviderMechanism2.WinterFlowUnitTestResponse) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowBatchBatch(String str, float[] fArr, WinterFlowGatewayPlatform winterFlowGatewayPlatform, final double d, float f, float f2, int i) {
        this(str, fArr, winterFlowGatewayPlatform, null, r11, r12, f, f2, new WinterFlowProviderMechanism(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        WinterFlowAlgorithmSystem winterFlowAlgorithmSystem;
        WinterFlowAlgorithmSystem winterFlowAlgorithmSystem2 = WinterFlowSingletonPlatform;
        if (d == 1.0d) {
            winterFlowAlgorithmSystem = winterFlowAlgorithmSystem2;
        } else {
            final int i2 = 0;
            winterFlowAlgorithmSystem = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowManagerSyntax
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d2) {
                    switch (i2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            winterFlowAlgorithmSystem2 = new WinterFlowAlgorithmSystem() { // from class: com.google.android.datatransport.WinterFlowManagerSyntax
                @Override // com.google.android.datatransport.WinterFlowAlgorithmSystem
                public final double WinterFlowHookDataSource(double d2) {
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        WinterFlowAlgorithmSystem winterFlowAlgorithmSystem3 = winterFlowAlgorithmSystem2;
    }
}
