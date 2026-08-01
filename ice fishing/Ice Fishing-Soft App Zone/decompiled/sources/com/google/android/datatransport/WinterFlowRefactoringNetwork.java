package com.google.android.datatransport;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRefactoringNetwork extends WinterFlowWorkerCompiler {
    public int WinterFlowResponseEngine;
    public final byte[] WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public int WinterFlowServiceUtility = Integer.MAX_VALUE;
    public int WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public final FileInputStream WinterFlowUnitTestResponse;

    public WinterFlowRefactoringNetwork(FileInputStream fileInputStream) {
        Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
        this.WinterFlowUnitTestResponse = fileInputStream;
        this.WinterFlowRouterRouter = new byte[4096];
        this.WinterFlowSyntax = 0;
        this.WinterFlowTransactionAgent = 0;
        this.WinterFlowThreadListener = 0;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowArrayHelper() {
        return WinterFlowSyntaxSubsystem();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final boolean WinterFlowArrayNetwork() {
        return this.WinterFlowTransactionAgent == this.WinterFlowSyntax && !WinterFlowUIMiddleware(1);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowBackendCacheManager() {
        if (WinterFlowArrayNetwork()) {
            this.WinterFlowServerProtocol = 0;
            return 0;
        }
        int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine();
        this.WinterFlowServerProtocol = WinterFlowSoftwareEngine;
        if ((WinterFlowSoftwareEngine >>> 3) != 0) {
            return WinterFlowSoftwareEngine;
        }
        throw new WinterFlowRouterAgent("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowBandwidthObject() {
        return WinterFlowSoftwareProtocol();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowBatchUI() {
        return WinterFlowSoftwareProtocol();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowCacheManagerAgent() {
        return this.WinterFlowThreadListener + this.WinterFlowTransactionAgent;
    }

    public final byte[] WinterFlowCacheManagerListener(int i) {
        if (i == 0) {
            return WinterFlowMapperConcurrency.WinterFlowHookDataSource;
        }
        if (i < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        int i2 = this.WinterFlowThreadListener;
        int i3 = this.WinterFlowTransactionAgent;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new WinterFlowRouterAgent("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.WinterFlowServiceUtility;
        if (i4 > i5) {
            WinterFlowCloudMicroservice((i5 - i2) - i3);
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        int i6 = this.WinterFlowSyntax - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.WinterFlowUnitTestResponse;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (WinterFlowRouterAgent e) {
                e.WinterFlowVariableVersionControl = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.WinterFlowRouterRouter, this.WinterFlowTransactionAgent, bArr, 0, i6);
        this.WinterFlowThreadListener += this.WinterFlowSyntax;
        this.WinterFlowTransactionAgent = 0;
        this.WinterFlowSyntax = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
                }
                this.WinterFlowThreadListener += read;
                i6 += read;
            } catch (WinterFlowRouterAgent e2) {
                e2.WinterFlowVariableVersionControl = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final void WinterFlowCloudMicroservice(int i) {
        int i2 = this.WinterFlowSyntax;
        int i3 = this.WinterFlowTransactionAgent;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.WinterFlowTransactionAgent = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.WinterFlowUnitTestResponse;
        if (i < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        int i5 = this.WinterFlowThreadListener;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.WinterFlowServiceUtility;
        if (i7 > i8) {
            WinterFlowCloudMicroservice((i8 - i5) - i3);
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        this.WinterFlowThreadListener = i6;
        this.WinterFlowSyntax = 0;
        this.WinterFlowTransactionAgent = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (WinterFlowRouterAgent e) {
                    e.WinterFlowVariableVersionControl = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.WinterFlowThreadListener += i4;
                WinterFlowCompilerHandler();
                throw th;
            }
        }
        this.WinterFlowThreadListener += i4;
        WinterFlowCompilerHandler();
        if (i4 >= i) {
            return;
        }
        int i9 = this.WinterFlowSyntax;
        int i10 = i9 - this.WinterFlowTransactionAgent;
        this.WinterFlowTransactionAgent = i9;
        WinterFlowFrontendBackend(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.WinterFlowSyntax;
            if (i11 <= i12) {
                this.WinterFlowTransactionAgent = i11;
                return;
            } else {
                i10 += i12;
                this.WinterFlowTransactionAgent = i12;
                WinterFlowFrontendBackend(1);
            }
        }
    }

    public final void WinterFlowCompilerHandler() {
        int i = this.WinterFlowSyntax + this.WinterFlowResponseEngine;
        this.WinterFlowSyntax = i;
        int i2 = this.WinterFlowThreadListener + i;
        int i3 = this.WinterFlowServiceUtility;
        if (i2 <= i3) {
            this.WinterFlowResponseEngine = 0;
            return;
        }
        int i4 = i2 - i3;
        this.WinterFlowResponseEngine = i4;
        this.WinterFlowSyntax = i - i4;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final boolean WinterFlowCompilerVariable(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                WinterFlowCloudMicroservice(8);
                return true;
            }
            if (i2 == 2) {
                WinterFlowCloudMicroservice(WinterFlowSoftwareEngine());
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
            WinterFlowCloudMicroservice(4);
            return true;
        }
        int i4 = this.WinterFlowSyntax - this.WinterFlowTransactionAgent;
        byte[] bArr = this.WinterFlowRouterRouter;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.WinterFlowTransactionAgent;
                this.WinterFlowTransactionAgent = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw WinterFlowRouterAgent.WinterFlowCacheManagerAgent();
        }
        while (i3 < 10) {
            if (this.WinterFlowTransactionAgent == this.WinterFlowSyntax) {
                WinterFlowFrontendBackend(1);
            }
            int i6 = this.WinterFlowTransactionAgent;
            this.WinterFlowTransactionAgent = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw WinterFlowRouterAgent.WinterFlowCacheManagerAgent();
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final float WinterFlowConcurrencyThread() {
        return Float.intBitsToFloat(WinterFlowSoftwareProtocol());
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final String WinterFlowConsumerUserManager() {
        int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine();
        int i = this.WinterFlowTransactionAgent;
        int i2 = this.WinterFlowSyntax;
        int i3 = i2 - i;
        byte[] bArr = this.WinterFlowRouterRouter;
        if (WinterFlowSoftwareEngine <= i3 && WinterFlowSoftwareEngine > 0) {
            this.WinterFlowTransactionAgent = i + WinterFlowSoftwareEngine;
        } else {
            if (WinterFlowSoftwareEngine == 0) {
                return "";
            }
            if (WinterFlowSoftwareEngine < 0) {
                throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
            }
            i = 0;
            if (WinterFlowSoftwareEngine <= i2) {
                WinterFlowFrontendBackend(WinterFlowSoftwareEngine);
                this.WinterFlowTransactionAgent = WinterFlowSoftwareEngine;
            } else {
                bArr = WinterFlowStrategyTool(WinterFlowSoftwareEngine);
            }
        }
        return WinterFlowConsumerXML.WinterFlowRouterStructure.WinterFlowUnitTestResponse(bArr, i, WinterFlowSoftwareEngine);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowEventEmitterController() {
        return WinterFlowSoftwareEngine();
    }

    public final void WinterFlowFrontendBackend(int i) {
        if (WinterFlowUIMiddleware(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.WinterFlowThreadListener) - this.WinterFlowTransactionAgent) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        throw new WinterFlowRouterAgent("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final void WinterFlowHookDataSource(int i) {
        if (this.WinterFlowServerProtocol != i) {
            throw new WinterFlowRouterAgent("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowMapperProtocol() {
        long WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem();
        return (-(WinterFlowSyntaxSubsystem & 1)) ^ (WinterFlowSyntaxSubsystem >>> 1);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowOrchestrationSubsystem() {
        return WinterFlowUserManagerUserManager();
    }

    public final ArrayList WinterFlowPackageIDE(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.WinterFlowUnitTestResponse.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
                }
                this.WinterFlowThreadListener += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final String WinterFlowResolverController() {
        int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine();
        byte[] bArr = this.WinterFlowRouterRouter;
        if (WinterFlowSoftwareEngine > 0) {
            int i = this.WinterFlowSyntax;
            int i2 = this.WinterFlowTransactionAgent;
            if (WinterFlowSoftwareEngine <= i - i2) {
                String str = new String(bArr, i2, WinterFlowSoftwareEngine, WinterFlowMapperConcurrency.WinterFlowRouterStructure);
                this.WinterFlowTransactionAgent += WinterFlowSoftwareEngine;
                return str;
            }
        }
        if (WinterFlowSoftwareEngine == 0) {
            return "";
        }
        if (WinterFlowSoftwareEngine < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        if (WinterFlowSoftwareEngine > this.WinterFlowSyntax) {
            return new String(WinterFlowStrategyTool(WinterFlowSoftwareEngine), WinterFlowMapperConcurrency.WinterFlowRouterStructure);
        }
        WinterFlowFrontendBackend(WinterFlowSoftwareEngine);
        String str2 = new String(bArr, this.WinterFlowTransactionAgent, WinterFlowSoftwareEngine, WinterFlowMapperConcurrency.WinterFlowRouterStructure);
        this.WinterFlowTransactionAgent += WinterFlowSoftwareEngine;
        return str2;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowResponseEngine(int i) {
        if (i < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        int i2 = this.WinterFlowThreadListener + this.WinterFlowTransactionAgent + i;
        if (i2 < 0) {
            throw new WinterFlowRouterAgent("Failed to parse the message.");
        }
        int i3 = this.WinterFlowServiceUtility;
        if (i2 > i3) {
            throw WinterFlowRouterAgent.WinterFlowVariableVersionControl();
        }
        this.WinterFlowServiceUtility = i2;
        WinterFlowCompilerHandler();
        return i3;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowRouterAdapter() {
        return WinterFlowUserManagerUserManager();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowSerializerStructure() {
        int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine();
        return (-(WinterFlowSoftwareEngine & 1)) ^ (WinterFlowSoftwareEngine >>> 1);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final WinterFlowMicroserviceCloud WinterFlowServerProtocol() {
        int WinterFlowSoftwareEngine = WinterFlowSoftwareEngine();
        int i = this.WinterFlowSyntax;
        int i2 = this.WinterFlowTransactionAgent;
        int i3 = i - i2;
        byte[] bArr = this.WinterFlowRouterRouter;
        if (WinterFlowSoftwareEngine <= i3 && WinterFlowSoftwareEngine > 0) {
            WinterFlowMicroserviceCloud WinterFlowArrayNetwork = WinterFlowMicroserviceCloud.WinterFlowArrayNetwork(bArr, i2, WinterFlowSoftwareEngine);
            this.WinterFlowTransactionAgent += WinterFlowSoftwareEngine;
            return WinterFlowArrayNetwork;
        }
        if (WinterFlowSoftwareEngine == 0) {
            return WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
        }
        if (WinterFlowSoftwareEngine < 0) {
            throw WinterFlowRouterAgent.WinterFlowArrayNetwork();
        }
        byte[] WinterFlowCacheManagerListener = WinterFlowCacheManagerListener(WinterFlowSoftwareEngine);
        if (WinterFlowCacheManagerListener != null) {
            return WinterFlowMicroserviceCloud.WinterFlowArrayNetwork(WinterFlowCacheManagerListener, 0, WinterFlowCacheManagerListener.length);
        }
        int i4 = this.WinterFlowTransactionAgent;
        int i5 = this.WinterFlowSyntax;
        int i6 = i5 - i4;
        this.WinterFlowThreadListener += i5;
        this.WinterFlowTransactionAgent = 0;
        this.WinterFlowSyntax = 0;
        ArrayList WinterFlowPackageIDE = WinterFlowPackageIDE(WinterFlowSoftwareEngine - i6);
        byte[] bArr2 = new byte[WinterFlowSoftwareEngine];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = WinterFlowPackageIDE.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = WinterFlowPackageIDE.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        WinterFlowMicroserviceCloud winterFlowMicroserviceCloud = WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse;
        return new WinterFlowMicroserviceCloud(bArr2);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowServiceUtility() {
        return WinterFlowSoftwareEngine();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final int WinterFlowSingletonPlatform() {
        return WinterFlowSoftwareEngine();
    }

    public final int WinterFlowSoftwareEngine() {
        int i;
        int i2 = this.WinterFlowTransactionAgent;
        int i3 = this.WinterFlowSyntax;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.WinterFlowRouterRouter;
            byte b = bArr[i2];
            if (b >= 0) {
                this.WinterFlowTransactionAgent = i4;
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
                this.WinterFlowTransactionAgent = i5;
                return i;
            }
        }
        return (int) WinterFlowTestingNode();
    }

    public final int WinterFlowSoftwareProtocol() {
        int i = this.WinterFlowTransactionAgent;
        if (this.WinterFlowSyntax - i < 4) {
            WinterFlowFrontendBackend(4);
            i = this.WinterFlowTransactionAgent;
        }
        this.WinterFlowTransactionAgent = i + 4;
        byte[] bArr = this.WinterFlowRouterRouter;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final byte[] WinterFlowStrategyTool(int i) {
        byte[] WinterFlowCacheManagerListener = WinterFlowCacheManagerListener(i);
        if (WinterFlowCacheManagerListener != null) {
            return WinterFlowCacheManagerListener;
        }
        int i2 = this.WinterFlowTransactionAgent;
        int i3 = this.WinterFlowSyntax;
        int i4 = i3 - i2;
        this.WinterFlowThreadListener += i3;
        this.WinterFlowTransactionAgent = 0;
        this.WinterFlowSyntax = 0;
        ArrayList WinterFlowPackageIDE = WinterFlowPackageIDE(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.WinterFlowRouterRouter, i2, bArr, 0, i4);
        int size = WinterFlowPackageIDE.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = WinterFlowPackageIDE.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final void WinterFlowSyntax(int i) {
        this.WinterFlowServiceUtility = i;
        WinterFlowCompilerHandler();
    }

    public final long WinterFlowSyntaxSubsystem() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.WinterFlowTransactionAgent;
        int i2 = this.WinterFlowSyntax;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.WinterFlowRouterRouter;
            byte b = bArr[i];
            if (b >= 0) {
                this.WinterFlowTransactionAgent = i3;
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
                this.WinterFlowTransactionAgent = i4;
                return j;
            }
        }
        return WinterFlowTestingNode();
    }

    public final long WinterFlowTestingNode() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.WinterFlowTransactionAgent == this.WinterFlowSyntax) {
                WinterFlowFrontendBackend(1);
            }
            int i2 = this.WinterFlowTransactionAgent;
            this.WinterFlowTransactionAgent = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.WinterFlowRouterRouter[i2] & 128) == 0) {
                return j;
            }
        }
        throw WinterFlowRouterAgent.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final double WinterFlowThreadListener() {
        return Double.longBitsToDouble(WinterFlowUserManagerUserManager());
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final boolean WinterFlowTransactionAgent() {
        return WinterFlowSyntaxSubsystem() != 0;
    }

    public final boolean WinterFlowUIMiddleware(int i) {
        FileInputStream fileInputStream = this.WinterFlowUnitTestResponse;
        int i2 = this.WinterFlowTransactionAgent;
        int i3 = i2 + i;
        int i4 = this.WinterFlowSyntax;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.WinterFlowThreadListener;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.WinterFlowServiceUtility) {
            byte[] bArr = this.WinterFlowRouterRouter;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.WinterFlowThreadListener + i2;
                this.WinterFlowThreadListener = i5;
                i4 = this.WinterFlowSyntax - i2;
                this.WinterFlowSyntax = i4;
                this.WinterFlowTransactionAgent = 0;
            }
            try {
                int read = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.WinterFlowSyntax += read;
                    WinterFlowCompilerHandler();
                    if (this.WinterFlowSyntax >= i) {
                        return true;
                    }
                    return WinterFlowUIMiddleware(i);
                }
            } catch (WinterFlowRouterAgent e) {
                e.WinterFlowVariableVersionControl = true;
                throw e;
            }
        }
        return false;
    }

    public final long WinterFlowUserManagerUserManager() {
        int i = this.WinterFlowTransactionAgent;
        if (this.WinterFlowSyntax - i < 8) {
            WinterFlowFrontendBackend(8);
            i = this.WinterFlowTransactionAgent;
        }
        this.WinterFlowTransactionAgent = i + 8;
        byte[] bArr = this.WinterFlowRouterRouter;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerCompiler
    public final long WinterFlowVariableBandwidth() {
        return WinterFlowSyntaxSubsystem();
    }
}
