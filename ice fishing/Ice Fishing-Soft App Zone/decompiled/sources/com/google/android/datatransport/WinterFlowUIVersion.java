package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUIVersion extends WinterFlowDebugFramework implements WinterFlowEventEvent {
    public static final WinterFlowUIVersion WinterFlowResponseEngine;
    public static final WinterFlowUIVersion WinterFlowRouterRouter;
    public static final WinterFlowUIVersion WinterFlowServerProtocol;
    public static final WinterFlowUIVersion WinterFlowSyntax;
    public static final WinterFlowUIVersion WinterFlowTransactionAgent;
    public static final WinterFlowUIVersion WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;

    static {
        int i = 2;
        WinterFlowUnitTestResponse = new WinterFlowUIVersion(i, 0);
        WinterFlowRouterRouter = new WinterFlowUIVersion(i, 1);
        WinterFlowSyntax = new WinterFlowUIVersion(i, 2);
        WinterFlowResponseEngine = new WinterFlowUIVersion(i, 3);
        WinterFlowTransactionAgent = new WinterFlowUIVersion(i, 4);
        WinterFlowServerProtocol = new WinterFlowUIVersion(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowUIVersion(int i, int i2) {
        super(i);
        this.WinterFlowTransactionManagerStrategy = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        String str;
        WinterFlowOrchestrationIDE winterFlowOrchestrationIDE;
        switch (this.WinterFlowTransactionManagerStrategy) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 1:
                return (String) obj;
            case 2:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 3:
                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) obj;
                WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) obj2;
                if (winterFlowDecoratorStrategy == null || (str = winterFlowDecoratorStrategy.WinterFlowRouterStructure) == null) {
                    str = winterFlowDecoratorStrategy2.WinterFlowRouterStructure;
                }
                if (winterFlowDecoratorStrategy == null || (winterFlowOrchestrationIDE = winterFlowDecoratorStrategy.WinterFlowHookDataSource) == null) {
                    winterFlowOrchestrationIDE = winterFlowDecoratorStrategy2.WinterFlowHookDataSource;
                }
                return new WinterFlowDecoratorStrategy(str, winterFlowOrchestrationIDE);
            case 4:
                return obj == null ? obj2 : obj;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowProcessorSystem winterFlowProcessorSystem = (WinterFlowProcessorSystem) obj2;
                Object valueOf = Float.valueOf(0.0f);
                WinterFlowDecoratorBackend winterFlowDecoratorBackend = ((WinterFlowProcessorSystem) obj).WinterFlowArrayNetwork;
                WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowRouterAdapter;
                Object WinterFlowUnitTestResponse2 = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                if (WinterFlowUnitTestResponse2 == null) {
                    WinterFlowUnitTestResponse2 = valueOf;
                }
                float floatValue = ((Number) WinterFlowUnitTestResponse2).floatValue();
                Object WinterFlowUnitTestResponse3 = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                if (WinterFlowUnitTestResponse3 != null) {
                    valueOf = WinterFlowUnitTestResponse3;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
            default:
                return ((WinterFlowMapperManager) obj).WinterFlowCacheManagerAgent((WinterFlowDeserializationModule) obj2);
        }
    }
}
