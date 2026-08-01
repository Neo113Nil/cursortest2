package com.google.android.datatransport;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerSingleton {
    public static final Logger WinterFlowTransactionManagerStrategy = Logger.getLogger(WinterFlowSessionManagerSingleton.class.getName());
    public static final boolean WinterFlowUnitTestResponse = WinterFlowRouterModule.WinterFlowVariableVersionControl;
    public int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final byte[] WinterFlowHookDataSource;
    public WinterFlowJSONDecorator WinterFlowRouterStructure;
    public final WinterFlowWorkerEngine WinterFlowVariableVersionControl;

    public WinterFlowSessionManagerSingleton(WinterFlowWorkerEngine winterFlowWorkerEngine, int i) {
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.WinterFlowHookDataSource = new byte[max];
        this.WinterFlowCacheManagerAgent = max;
        this.WinterFlowVariableVersionControl = winterFlowWorkerEngine;
    }

    public static int WinterFlowResponseEngine(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int WinterFlowRouterRouter(int i) {
        return WinterFlowSyntax(i << 3);
    }

    public static int WinterFlowSyntax(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int WinterFlowTransactionManagerStrategy(int i, WinterFlowMicroserviceCloud winterFlowMicroserviceCloud) {
        int WinterFlowRouterRouter = WinterFlowRouterRouter(i);
        int size = winterFlowMicroserviceCloud.size();
        return WinterFlowSyntax(size) + size + WinterFlowRouterRouter;
    }

    public static int WinterFlowUnitTestResponse(String str) {
        int length;
        try {
            length = WinterFlowConsumerXML.WinterFlowRouterStructure(str);
        } catch (WinterFlowDataSourceTesting unused) {
            length = str.getBytes(WinterFlowMapperConcurrency.WinterFlowRouterStructure).length;
        }
        return WinterFlowSyntax(length) + length;
    }

    public final void WinterFlowArrayHelper(int i, int i2) {
        WinterFlowConfigurationSubsystem((i << 3) | i2);
    }

    public final void WinterFlowArrayNetwork(int i) {
        boolean z = WinterFlowUnitTestResponse;
        byte[] bArr = this.WinterFlowHookDataSource;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.WinterFlowArrayNetwork;
                if (i2 == 0) {
                    this.WinterFlowArrayNetwork = i3 + 1;
                    WinterFlowRouterModule.WinterFlowResponseEngine(bArr, i3, (byte) i);
                    return;
                } else {
                    this.WinterFlowArrayNetwork = i3 + 1;
                    WinterFlowRouterModule.WinterFlowResponseEngine(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.WinterFlowArrayNetwork;
                if (i4 == 0) {
                    this.WinterFlowArrayNetwork = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.WinterFlowArrayNetwork = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void WinterFlowBackendCacheManager(String str, int i) {
        WinterFlowArrayHelper(i, 2);
        WinterFlowEventEmitterController(str);
    }

    public final void WinterFlowBandwidthObject(int i, boolean z) {
        WinterFlowServerProtocol(11);
        WinterFlowCacheManagerAgent(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.WinterFlowArrayNetwork;
        this.WinterFlowArrayNetwork = i2 + 1;
        this.WinterFlowHookDataSource[i2] = b;
    }

    public final void WinterFlowBatchUI(int i, long j) {
        WinterFlowServerProtocol(18);
        WinterFlowCacheManagerAgent(i, 1);
        WinterFlowHookDataSource(j);
    }

    public final void WinterFlowCacheManagerAgent(int i, int i2) {
        WinterFlowArrayNetwork((i << 3) | i2);
    }

    public final void WinterFlowCacheManagerListener(long j) {
        WinterFlowServerProtocol(10);
        WinterFlowVariableVersionControl(j);
    }

    public final void WinterFlowCompilerVariable(int i, int i2) {
        WinterFlowServerProtocol(20);
        WinterFlowCacheManagerAgent(i, 0);
        WinterFlowArrayNetwork(i2);
    }

    public final void WinterFlowConcurrencyThread(WinterFlowMicroserviceCloud winterFlowMicroserviceCloud) {
        WinterFlowConfigurationSubsystem(winterFlowMicroserviceCloud.size());
        WinterFlowResolverController(winterFlowMicroserviceCloud.WinterFlowTransactionManagerStrategy, winterFlowMicroserviceCloud.WinterFlowTransactionManagerStrategy(), winterFlowMicroserviceCloud.size());
    }

    public final void WinterFlowConfigurationSubsystem(int i) {
        WinterFlowServerProtocol(5);
        WinterFlowArrayNetwork(i);
    }

    public final void WinterFlowConsumerUserManager(int i, WinterFlowHookBackend winterFlowHookBackend, WinterFlowServerSyntax winterFlowServerSyntax) {
        WinterFlowArrayHelper(i, 2);
        WinterFlowConfigurationSubsystem(winterFlowHookBackend.WinterFlowRouterStructure(winterFlowServerSyntax));
        winterFlowServerSyntax.WinterFlowHookDataSource(winterFlowHookBackend, this.WinterFlowRouterStructure);
    }

    public final void WinterFlowEventEmitterController(String str) {
        try {
            int length = str.length() * 3;
            int WinterFlowSyntax = WinterFlowSyntax(length);
            int i = WinterFlowSyntax + length;
            int i2 = this.WinterFlowCacheManagerAgent;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int WinterFlowRouterRouter = WinterFlowConsumerXML.WinterFlowRouterStructure.WinterFlowRouterRouter(str, bArr, 0, length);
                WinterFlowConfigurationSubsystem(WinterFlowRouterRouter);
                WinterFlowServiceUtility(bArr, 0, WinterFlowRouterRouter);
                return;
            }
            if (i > i2 - this.WinterFlowArrayNetwork) {
                WinterFlowTransactionAgent();
            }
            int WinterFlowSyntax2 = WinterFlowSyntax(str.length());
            int i3 = this.WinterFlowArrayNetwork;
            byte[] bArr2 = this.WinterFlowHookDataSource;
            try {
                if (WinterFlowSyntax2 == WinterFlowSyntax) {
                    int i4 = i3 + WinterFlowSyntax2;
                    this.WinterFlowArrayNetwork = i4;
                    int WinterFlowRouterRouter2 = WinterFlowConsumerXML.WinterFlowRouterStructure.WinterFlowRouterRouter(str, bArr2, i4, i2 - i4);
                    this.WinterFlowArrayNetwork = i3;
                    WinterFlowArrayNetwork((WinterFlowRouterRouter2 - i3) - WinterFlowSyntax2);
                    this.WinterFlowArrayNetwork = WinterFlowRouterRouter2;
                } else {
                    int WinterFlowRouterStructure = WinterFlowConsumerXML.WinterFlowRouterStructure(str);
                    WinterFlowArrayNetwork(WinterFlowRouterStructure);
                    this.WinterFlowArrayNetwork = WinterFlowConsumerXML.WinterFlowRouterStructure.WinterFlowRouterRouter(str, bArr2, this.WinterFlowArrayNetwork, WinterFlowRouterStructure);
                }
            } catch (WinterFlowDataSourceTesting e) {
                this.WinterFlowArrayNetwork = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new WinterFlowAdapterListener(e2);
            }
        } catch (WinterFlowDataSourceTesting e3) {
            WinterFlowTransactionManagerStrategy.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(WinterFlowMapperConcurrency.WinterFlowRouterStructure);
            try {
                WinterFlowConfigurationSubsystem(bytes.length);
                WinterFlowResolverController(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new WinterFlowAdapterListener(e4);
            }
        }
    }

    public final void WinterFlowHookDataSource(long j) {
        int i = this.WinterFlowArrayNetwork;
        int i2 = i + 1;
        this.WinterFlowArrayNetwork = i2;
        byte[] bArr = this.WinterFlowHookDataSource;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.WinterFlowArrayNetwork = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.WinterFlowArrayNetwork = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.WinterFlowArrayNetwork = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.WinterFlowArrayNetwork = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.WinterFlowArrayNetwork = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.WinterFlowArrayNetwork = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.WinterFlowArrayNetwork = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void WinterFlowMapperProtocol(int i) {
        if (i >= 0) {
            WinterFlowConfigurationSubsystem(i);
        } else {
            WinterFlowCacheManagerListener(i);
        }
    }

    public final void WinterFlowOrchestrationSubsystem(int i, WinterFlowMicroserviceCloud winterFlowMicroserviceCloud) {
        WinterFlowArrayHelper(i, 2);
        WinterFlowConcurrencyThread(winterFlowMicroserviceCloud);
    }

    public final void WinterFlowResolverController(byte[] bArr, int i, int i2) {
        WinterFlowServiceUtility(bArr, i, i2);
    }

    public final void WinterFlowRouterAdapter(long j) {
        WinterFlowServerProtocol(8);
        WinterFlowHookDataSource(j);
    }

    public final void WinterFlowRouterStructure(int i) {
        int i2 = this.WinterFlowArrayNetwork;
        int i3 = i2 + 1;
        this.WinterFlowArrayNetwork = i3;
        byte[] bArr = this.WinterFlowHookDataSource;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.WinterFlowArrayNetwork = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.WinterFlowArrayNetwork = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.WinterFlowArrayNetwork = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void WinterFlowSerializerStructure(int i, int i2) {
        WinterFlowServerProtocol(20);
        WinterFlowCacheManagerAgent(i, 0);
        if (i2 >= 0) {
            WinterFlowArrayNetwork(i2);
        } else {
            WinterFlowVariableVersionControl(i2);
        }
    }

    public final void WinterFlowServerProtocol(int i) {
        if (this.WinterFlowCacheManagerAgent - this.WinterFlowArrayNetwork < i) {
            WinterFlowTransactionAgent();
        }
    }

    public final void WinterFlowServiceUtility(byte[] bArr, int i, int i2) {
        int i3 = this.WinterFlowArrayNetwork;
        int i4 = this.WinterFlowCacheManagerAgent;
        int i5 = i4 - i3;
        byte[] bArr2 = this.WinterFlowHookDataSource;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.WinterFlowArrayNetwork += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.WinterFlowArrayNetwork = i4;
        WinterFlowTransactionAgent();
        if (i7 > i4) {
            this.WinterFlowVariableVersionControl.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.WinterFlowArrayNetwork = i7;
        }
    }

    public final void WinterFlowSingletonPlatform(int i, int i2) {
        WinterFlowServerProtocol(14);
        WinterFlowCacheManagerAgent(i, 5);
        WinterFlowRouterStructure(i2);
    }

    public final void WinterFlowStrategyTool(int i, long j) {
        WinterFlowServerProtocol(20);
        WinterFlowCacheManagerAgent(i, 0);
        WinterFlowVariableVersionControl(j);
    }

    public final void WinterFlowThreadListener(byte b) {
        if (this.WinterFlowArrayNetwork == this.WinterFlowCacheManagerAgent) {
            WinterFlowTransactionAgent();
        }
        int i = this.WinterFlowArrayNetwork;
        this.WinterFlowArrayNetwork = i + 1;
        this.WinterFlowHookDataSource[i] = b;
    }

    public final void WinterFlowTransactionAgent() {
        this.WinterFlowVariableVersionControl.write(this.WinterFlowHookDataSource, 0, this.WinterFlowArrayNetwork);
        this.WinterFlowArrayNetwork = 0;
    }

    public final void WinterFlowVariableBandwidth(int i) {
        WinterFlowServerProtocol(4);
        WinterFlowRouterStructure(i);
    }

    public final void WinterFlowVariableVersionControl(long j) {
        boolean z = WinterFlowUnitTestResponse;
        byte[] bArr = this.WinterFlowHookDataSource;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.WinterFlowArrayNetwork;
                if (j2 == 0) {
                    this.WinterFlowArrayNetwork = i + 1;
                    WinterFlowRouterModule.WinterFlowResponseEngine(bArr, i, (byte) j);
                    return;
                } else {
                    this.WinterFlowArrayNetwork = i + 1;
                    WinterFlowRouterModule.WinterFlowResponseEngine(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.WinterFlowArrayNetwork;
                if (j3 == 0) {
                    this.WinterFlowArrayNetwork = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.WinterFlowArrayNetwork = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }
}
