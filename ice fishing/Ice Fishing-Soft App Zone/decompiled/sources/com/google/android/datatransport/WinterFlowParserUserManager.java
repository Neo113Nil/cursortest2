package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public interface WinterFlowParserUserManager extends WinterFlowConcurrencyParser {
    static void WinterFlowFrameworkTransaction(WinterFlowParserUserManager winterFlowParserUserManager, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        winterFlowParserUserManager.WinterFlowPipelineSoftware(j, j4, (i & 4) != 0 ? WinterFlowRepositoryBackend(winterFlowParserUserManager.WinterFlowArrayNetwork(), j4) : j3, WinterFlowNodeMicroservice.WinterFlowResolverController, (i & 64) != 0 ? 3 : 0);
    }

    static void WinterFlowFrontendBackend(WinterFlowProtocolStrategy winterFlowProtocolStrategy, WinterFlowHandlerWebsocket winterFlowHandlerWebsocket, long j, long j2, float f, WinterFlowInvokerComponent winterFlowInvokerComponent, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = WinterFlowRepositoryBackend(winterFlowProtocolStrategy.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(), j3);
        }
        winterFlowProtocolStrategy.WinterFlowTransactionManagerStrategy(winterFlowHandlerWebsocket, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? WinterFlowNodeMicroservice.WinterFlowResolverController : winterFlowInvokerComponent);
    }

    static long WinterFlowRepositoryBackend(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void WinterFlowRouterAdapter(WinterFlowParserUserManager winterFlowParserUserManager, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = winterFlowParserUserManager.WinterFlowCompilerHandler();
        }
        winterFlowParserUserManager.WinterFlowServerProtocol(f, j, j2);
    }

    static void WinterFlowSoftwareProtocol(WinterFlowParserUserManager winterFlowParserUserManager, long j, long j2, long j3, float f, int i, int i2) {
        winterFlowParserUserManager.WinterFlowSyntaxSubsystem(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i);
    }

    static void WinterFlowStrategyTool(WinterFlowParserUserManager winterFlowParserUserManager, WinterFlowManagerCloud winterFlowManagerCloud, WinterFlowHandlerWebsocket winterFlowHandlerWebsocket, float f, WinterFlowQueryManager winterFlowQueryManager, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        WinterFlowInvokerComponent winterFlowInvokerComponent = winterFlowQueryManager;
        if ((i & 8) != 0) {
            winterFlowInvokerComponent = WinterFlowNodeMicroservice.WinterFlowResolverController;
        }
        winterFlowParserUserManager.WinterFlowMapperProtocol(winterFlowManagerCloud, winterFlowHandlerWebsocket, f2, winterFlowInvokerComponent, (i & 32) != 0 ? 3 : 0);
    }

    static void WinterFlowThreadPoolEventEmitter(WinterFlowParserUserManager winterFlowParserUserManager, WinterFlowSoftwareUserManager winterFlowSoftwareUserManager, long j, long j2, float f, WinterFlowProxyValidator winterFlowProxyValidator, int i, int i2) {
        winterFlowParserUserManager.WinterFlowUIMiddleware(winterFlowSoftwareUserManager, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, winterFlowProxyValidator, (i2 & 512) != 0 ? 1 : i);
    }

    static void WinterFlowTransactionAgent(WinterFlowProtocolStrategy winterFlowProtocolStrategy, WinterFlowHandlerWebsocket winterFlowHandlerWebsocket, long j, long j2, long j3, WinterFlowInvokerComponent winterFlowInvokerComponent, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        winterFlowProtocolStrategy.WinterFlowSyntax(winterFlowHandlerWebsocket, j4, (i & 4) != 0 ? WinterFlowRepositoryBackend(winterFlowProtocolStrategy.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? WinterFlowNodeMicroservice.WinterFlowResolverController : winterFlowInvokerComponent);
    }

    default long WinterFlowArrayNetwork() {
        return WinterFlowSerializerStructure().WinterFlowThreadListener();
    }

    default long WinterFlowCompilerHandler() {
        return WinterFlowHookProcessor.WinterFlowServerProtocol(WinterFlowSerializerStructure().WinterFlowThreadListener());
    }

    void WinterFlowMapperProtocol(WinterFlowManagerCloud winterFlowManagerCloud, WinterFlowHandlerWebsocket winterFlowHandlerWebsocket, float f, WinterFlowInvokerComponent winterFlowInvokerComponent, int i);

    void WinterFlowPipelineSoftware(long j, long j2, long j3, WinterFlowInvokerComponent winterFlowInvokerComponent, int i);

    WinterFlowObjectPackage WinterFlowSerializerStructure();

    void WinterFlowServerProtocol(float f, long j, long j2);

    void WinterFlowSyntaxSubsystem(long j, long j2, long j3, float f, int i);

    void WinterFlowUIMiddleware(WinterFlowSoftwareUserManager winterFlowSoftwareUserManager, long j, long j2, long j3, float f, WinterFlowProxyValidator winterFlowProxyValidator, int i);

    WinterFlowCacheManagerConfiguration getLayoutDirection();
}
