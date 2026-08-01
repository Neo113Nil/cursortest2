package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInheritanceLayer extends WinterFlowWorkerCompiler {
    public int WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public int WinterFlowSyntax;
    public int WinterFlowThreadListener = Integer.MAX_VALUE;
    public final int WinterFlowTransactionAgent;
    public final byte[] WinterFlowUnitTestResponse;

    public WinterFlowInheritanceLayer(byte[] bArr, int i, int i2, boolean z) {
        this.WinterFlowUnitTestResponse = bArr;
        this.WinterFlowRouterRouter = i2 + i;
        this.WinterFlowResponseEngine = i;
        this.WinterFlowTransactionAgent = i;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowArrayHelper() {
        return WinterFlowSoftwareProtocol();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final boolean WinterFlowArrayNetwork() {
        return this.WinterFlowResponseEngine == this.WinterFlowRouterRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowBackendCacheManager() {
        if (WinterFlowArrayNetwork()) {
            this.WinterFlowServerProtocol = 0;
            return 0;
        }
        int WinterFlowPackageIDE = WinterFlowPackageIDE();
        this.WinterFlowServerProtocol = WinterFlowPackageIDE;
        if ((WinterFlowPackageIDE >>> 3) != 0) {
            return WinterFlowPackageIDE;
        }
        throw new WinterFlowRouterAgent("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowBandwidthObject() {
        return WinterFlowStrategyTool();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowBatchUI() {
        return WinterFlowStrategyTool();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowCacheManagerAgent() {
        return this.WinterFlowResponseEngine - this.WinterFlowTransactionAgent;
    }

    public final long WinterFlowCacheManagerListener() {
        int i = this.WinterFlowResponseEngine;
        if (this.WinterFlowRouterRouter - i < 8) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        this.WinterFlowResponseEngine = i + 8;
        byte[] bArr = this.WinterFlowUnitTestResponse;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final boolean WinterFlowCompilerVariable(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                WinterFlowSyntaxSubsystem(8);
                return true;
            }
            if (i2 == 2) {
                WinterFlowSyntaxSubsystem(WinterFlowPackageIDE());
                return true;
            }
            if (i2 == 3) {
                WinterFlowConfigurationSubsystem();
                WinterFlowHookDataSource(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw WinterFlowRouterAgent.WinterFlowHookDataSource();
            }
            WinterFlowSyntaxSubsystem(4);
            return true;
        }
        int i4 = this.WinterFlowRouterRouter - this.WinterFlowResponseEngine;
        byte[] bArr = this.WinterFlowUnitTestResponse;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.WinterFlowResponseEngine;
                this.WinterFlowResponseEngine = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw WinterFlowRouterAgent.WinterFlowCacheManagerAgent();
        }
        while (i3 < 10) {
            int i6 = this.WinterFlowResponseEngine;
            if (i6 == this.WinterFlowRouterRouter) {
                throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
            }
            this.WinterFlowResponseEngine = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw WinterFlowRouterAgent.WinterFlowCacheManagerAgent();
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final float WinterFlowConcurrencyThread() {
        return Float.intBitsToFloat(WinterFlowStrategyTool());
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final String WinterFlowConsumerUserManager() {
        int WinterFlowPackageIDE = WinterFlowPackageIDE();
        if (WinterFlowPackageIDE > 0) {
            int i = this.WinterFlowRouterRouter;
            int i2 = this.WinterFlowResponseEngine;
            if (WinterFlowPackageIDE <= i - i2) {
                String WinterFlowUnitTestResponse = WinterFlowConsumerXML.WinterFlowRouterStructure.WinterFlowUnitTestResponse(this.WinterFlowUnitTestResponse, i2, WinterFlowPackageIDE);
                this.WinterFlowResponseEngine += WinterFlowPackageIDE;
                return WinterFlowUnitTestResponse;
            }
        }
        if (WinterFlowPackageIDE == 0) {
            return "";
        }
        if (WinterFlowPackageIDE <= 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowEventEmitterController() {
        return WinterFlowPackageIDE();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final void WinterFlowHookDataSource(int i) {
        if (this.WinterFlowServerProtocol != i) {
            throw new WinterFlowRouterAgent("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowMapperProtocol() {
        long WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol();
        return (-(WinterFlowSoftwareProtocol & 1)) ^ (WinterFlowSoftwareProtocol >>> 1);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowOrchestrationSubsystem() {
        return WinterFlowCacheManagerListener();
    }

    public final int WinterFlowPackageIDE() {
        int i;
        int i2 = this.WinterFlowResponseEngine;
        int i3 = this.WinterFlowRouterRouter;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.WinterFlowUnitTestResponse;
            byte b = bArr[i2];
            if (b >= 0) {
                this.WinterFlowResponseEngine = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.WinterFlowResponseEngine = i5;
                return i;
            }
        }
        return (int) WinterFlowUserManagerUserManager();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final String WinterFlowResolverController() {
        int WinterFlowPackageIDE = WinterFlowPackageIDE();
        if (WinterFlowPackageIDE > 0) {
            int i = this.WinterFlowRouterRouter;
            int i2 = this.WinterFlowResponseEngine;
            if (WinterFlowPackageIDE <= i - i2) {
                String str = new String(this.WinterFlowUnitTestResponse, i2, WinterFlowPackageIDE, WinterFlowMapperConcurrency.WinterFlowRouterStructure);
                this.WinterFlowResponseEngine += WinterFlowPackageIDE;
                return str;
            }
        }
        if (WinterFlowPackageIDE == 0) {
            return "";
        }
        if (WinterFlowPackageIDE < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowResponseEngine(int i) {
        if (i < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent() + i;
        if (WinterFlowCacheManagerAgent < 0) {
            throw new WinterFlowRouterAgent("Failed to parse the message.");
        }
        int i2 = this.WinterFlowThreadListener;
        if (WinterFlowCacheManagerAgent > i2) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        this.WinterFlowThreadListener = WinterFlowCacheManagerAgent;
        WinterFlowSoftwareEngine();
        return i2;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowRouterAdapter() {
        return WinterFlowCacheManagerListener();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowSerializerStructure() {
        int WinterFlowPackageIDE = WinterFlowPackageIDE();
        return (-(WinterFlowPackageIDE & 1)) ^ (WinterFlowPackageIDE >>> 1);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final WinterFlowMicroserviceCloud WinterFlowServerProtocol() {
        byte[] bArr;
        int WinterFlowPackageIDE = WinterFlowPackageIDE();
        byte[] bArr2 = this.WinterFlowUnitTestResponse;
        if (WinterFlowPackageIDE > 0) {
            int i = this.WinterFlowRouterRouter;
            int i2 = this.WinterFlowResponseEngine;
            if (WinterFlowPackageIDE <= i - i2) {
                WinterFlowMicroserviceCloud WinterFlowArrayNetwork = WinterFlowMicroserviceCloud.WinterFlowArrayNetwork(bArr2, i2, WinterFlowPackageIDE);
                this.WinterFlowResponseEngine += WinterFlowPackageIDE;
                return WinterFlowArrayNetwork;
            }
        }
        if (WinterFlowPackageIDE == 0) {
            return WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
        }
        if (WinterFlowPackageIDE > 0) {
            int i3 = this.WinterFlowRouterRouter;
            int i4 = this.WinterFlowResponseEngine;
            if (WinterFlowPackageIDE <= i3 - i4) {
                int i5 = WinterFlowPackageIDE + i4;
                this.WinterFlowResponseEngine = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                WinterFlowMicroserviceCloud winterFlowMicroserviceCloud = WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
                return new WinterFlowMicroserviceCloud(bArr);
            }
        }
        if (WinterFlowPackageIDE > 0) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        if (WinterFlowPackageIDE != 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        bArr = WinterFlowMapperConcurrency.WinterFlowHookDataSource;
        WinterFlowMicroserviceCloud winterFlowMicroserviceCloud2 = WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
        return new WinterFlowMicroserviceCloud(bArr);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowServiceUtility() {
        return WinterFlowPackageIDE();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowSingletonPlatform() {
        return WinterFlowPackageIDE();
    }

    public final void WinterFlowSoftwareEngine() {
        int i = this.WinterFlowRouterRouter + this.WinterFlowSyntax;
        this.WinterFlowRouterRouter = i;
        int i2 = i - this.WinterFlowTransactionAgent;
        int i3 = this.WinterFlowThreadListener;
        if (i2 <= i3) {
            this.WinterFlowSyntax = 0;
            return;
        }
        int i4 = i2 - i3;
        this.WinterFlowSyntax = i4;
        this.WinterFlowRouterRouter = i - i4;
    }

    public final long WinterFlowSoftwareProtocol() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.WinterFlowResponseEngine;
        int i2 = this.WinterFlowRouterRouter;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.WinterFlowUnitTestResponse;
            byte b = bArr[i];
            if (b >= 0) {
                this.WinterFlowResponseEngine = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.WinterFlowResponseEngine = i4;
                return j;
            }
        }
        return WinterFlowUserManagerUserManager();
    }

    public final int WinterFlowStrategyTool() {
        int i = this.WinterFlowResponseEngine;
        if (this.WinterFlowRouterRouter - i < 4) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        this.WinterFlowResponseEngine = i + 4;
        byte[] bArr = this.WinterFlowUnitTestResponse;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final void WinterFlowSyntax(int i) {
        this.WinterFlowThreadListener = i;
        WinterFlowSoftwareEngine();
    }

    public final void WinterFlowSyntaxSubsystem(int i) {
        if (i >= 0) {
            int i2 = this.WinterFlowRouterRouter;
            int i3 = this.WinterFlowResponseEngine;
            if (i <= i2 - i3) {
                this.WinterFlowResponseEngine = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final double WinterFlowThreadListener() {
        return Double.longBitsToDouble(WinterFlowCacheManagerListener());
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final boolean WinterFlowTransactionAgent() {
        return WinterFlowSoftwareProtocol() != 0;
    }

    public final long WinterFlowUserManagerUserManager() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.WinterFlowResponseEngine;
            if (i2 == this.WinterFlowRouterRouter) {
                throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
            }
            this.WinterFlowResponseEngine = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.WinterFlowUnitTestResponse[i2] & 128) == 0) {
                return j;
            }
        }
        throw WinterFlowRouterAgent.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowVariableBandwidth() {
        return WinterFlowSoftwareProtocol();
    }
}
