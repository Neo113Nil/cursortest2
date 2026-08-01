package com.google.android.datatransport;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestCompiler {
    public static final WinterFlowRequestCompiler WinterFlowCacheManagerAgent = new WinterFlowRequestCompiler();
    public final ConcurrentHashMap WinterFlowHookDataSource = new ConcurrentHashMap();
    public final WinterFlowJSONDecorator WinterFlowRouterStructure = new WinterFlowJSONDecorator(2);

    public final WinterFlowServerSyntax WinterFlowRouterStructure(Class cls) {
        WinterFlowStrategySystem winterFlowStrategySystem;
        WinterFlowServerSyntax WinterFlowMapperProtocol;
        Class cls2;
        WinterFlowMapperConcurrency.WinterFlowRouterStructure(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.WinterFlowHookDataSource;
        WinterFlowServerSyntax winterFlowServerSyntax = (WinterFlowServerSyntax) concurrentHashMap.get(cls);
        if (winterFlowServerSyntax != null) {
            return winterFlowServerSyntax;
        }
        Class cls3 = WinterFlowVariableObject.WinterFlowRouterStructure;
        if (!WinterFlowDecoratorResponse.class.isAssignableFrom(cls) && (cls2 = WinterFlowVariableObject.WinterFlowRouterStructure) != null && !cls2.isAssignableFrom(cls)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        WinterFlowAdapterManager WinterFlowRouterStructure = ((WinterFlowSerializerSingleton) this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(cls);
        if ((WinterFlowRouterStructure.WinterFlowArrayNetwork & 2) == 2) {
            if (WinterFlowDecoratorResponse.class.isAssignableFrom(cls)) {
                WinterFlowMapperProtocol = new WinterFlowSoftwareEvent(WinterFlowVariableObject.WinterFlowCacheManagerAgent, WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure, WinterFlowRouterStructure.WinterFlowRouterStructure);
            } else {
                WinterFlowServerDeserialization winterFlowServerDeserialization = WinterFlowVariableObject.WinterFlowHookDataSource;
                WinterFlowStrategySystem winterFlowStrategySystem2 = WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource;
                if (winterFlowStrategySystem2 == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                WinterFlowMapperProtocol = new WinterFlowSoftwareEvent(winterFlowServerDeserialization, winterFlowStrategySystem2, WinterFlowRouterStructure.WinterFlowRouterStructure);
            }
        } else if (WinterFlowDecoratorResponse.class.isAssignableFrom(cls)) {
            WinterFlowMapperProtocol = WinterFlowSessionGateway.WinterFlowMapperProtocol(WinterFlowRouterStructure, WinterFlowInvokerMapper.WinterFlowHookDataSource, WinterFlowRuntimeRuntime.WinterFlowHookDataSource, WinterFlowVariableObject.WinterFlowCacheManagerAgent, WinterFlowResolverBackend.WinterFlowRouterAdapter(WinterFlowRouterStructure.WinterFlowRouterStructure()) != 1 ? WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure : null, WinterFlowUnitTestSession.WinterFlowHookDataSource);
        } else {
            WinterFlowAdapterQueue winterFlowAdapterQueue = WinterFlowInvokerMapper.WinterFlowRouterStructure;
            WinterFlowSerializerUI winterFlowSerializerUI = WinterFlowRuntimeRuntime.WinterFlowRouterStructure;
            WinterFlowServerDeserialization winterFlowServerDeserialization2 = WinterFlowVariableObject.WinterFlowHookDataSource;
            if (WinterFlowResolverBackend.WinterFlowRouterAdapter(WinterFlowRouterStructure.WinterFlowRouterStructure()) != 1) {
                WinterFlowStrategySystem winterFlowStrategySystem3 = WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource;
                if (winterFlowStrategySystem3 == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                winterFlowStrategySystem = winterFlowStrategySystem3;
            } else {
                winterFlowStrategySystem = null;
            }
            WinterFlowMapperProtocol = WinterFlowSessionGateway.WinterFlowMapperProtocol(WinterFlowRouterStructure, winterFlowAdapterQueue, winterFlowSerializerUI, winterFlowServerDeserialization2, winterFlowStrategySystem, WinterFlowUnitTestSession.WinterFlowRouterStructure);
        }
        WinterFlowServerSyntax winterFlowServerSyntax2 = (WinterFlowServerSyntax) concurrentHashMap.putIfAbsent(cls, WinterFlowMapperProtocol);
        return winterFlowServerSyntax2 != null ? winterFlowServerSyntax2 : WinterFlowMapperProtocol;
    }
}
