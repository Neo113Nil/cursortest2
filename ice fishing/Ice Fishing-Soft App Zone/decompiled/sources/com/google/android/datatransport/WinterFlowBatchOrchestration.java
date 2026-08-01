package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchOrchestration extends WinterFlowResponseAgent {
    public final WinterFlowRouterTesting WinterFlowTransactionManagerStrategy;
    public final ArrayList WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowBatchOrchestration(WinterFlowRouterTesting winterFlowRouterTesting) {
        super(winterFlowRouterTesting.WinterFlowHookDataSource(WinterFlowSoftwareException.WinterFlowPackageIDE(WinterFlowParserAlgorithm.class)), null);
        winterFlowRouterTesting.getClass();
        this.WinterFlowUnitTestResponse = new ArrayList();
        this.WinterFlowTransactionManagerStrategy = winterFlowRouterTesting;
    }

    public final WinterFlowSerializerMicroservice WinterFlowCacheManagerAgent() {
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice = (WinterFlowSerializerMicroservice) super.WinterFlowRouterStructure();
        WinterFlowMicroserviceProtocol winterFlowMicroserviceProtocol = winterFlowSerializerMicroservice.WinterFlowResponseEngine;
        winterFlowMicroserviceProtocol.getClass();
        ArrayList arrayList = this.WinterFlowUnitTestResponse;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) obj;
            if (winterFlowServerLayer != null) {
                WinterFlowRequestListener winterFlowRequestListener = winterFlowMicroserviceProtocol.WinterFlowHookDataSource;
                WinterFlowSerializerMicroservice winterFlowSerializerMicroservice2 = winterFlowMicroserviceProtocol.WinterFlowRouterStructure;
                WinterFlowListenerPlatform winterFlowListenerPlatform = winterFlowSerializerMicroservice2.WinterFlowTransactionManagerStrategy;
                WinterFlowListenerPlatform winterFlowListenerPlatform2 = winterFlowServerLayer.WinterFlowTransactionManagerStrategy;
                int i2 = winterFlowListenerPlatform2.WinterFlowRouterStructure;
                String str = (String) winterFlowListenerPlatform2.WinterFlowVariableVersionControl;
                if (i2 == 0 && str == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) winterFlowListenerPlatform.WinterFlowVariableVersionControl;
                if (str2 != null && WinterFlowManagerRequest.WinterFlowThreadListener(str, str2)) {
                    WinterFlowEventEmitterOrchestration.WinterFlowResponseEngine("Destination ", winterFlowServerLayer, " cannot have the same route as graph ", winterFlowSerializerMicroservice2);
                    return null;
                }
                if (i2 == winterFlowListenerPlatform.WinterFlowRouterStructure) {
                    WinterFlowEventEmitterOrchestration.WinterFlowResponseEngine("Destination ", winterFlowServerLayer, " cannot have the same id as graph ", winterFlowSerializerMicroservice2);
                    return null;
                }
                WinterFlowServerLayer winterFlowServerLayer2 = (WinterFlowServerLayer) WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener, i2);
                if (winterFlowServerLayer2 == winterFlowServerLayer) {
                    continue;
                } else {
                    if (winterFlowServerLayer.WinterFlowUnitTestResponse != null) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (winterFlowServerLayer2 != null) {
                        winterFlowServerLayer2.WinterFlowUnitTestResponse = null;
                    }
                    winterFlowServerLayer.WinterFlowUnitTestResponse = winterFlowSerializerMicroservice2;
                    winterFlowRequestListener.WinterFlowCacheManagerAgent(winterFlowListenerPlatform2.WinterFlowRouterStructure, winterFlowServerLayer);
                }
            }
        }
        WinterFlowSerializerMicroservice winterFlowSerializerMicroservice3 = winterFlowMicroserviceProtocol.WinterFlowRouterStructure;
        if ("MAIN".equals((String) winterFlowSerializerMicroservice3.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl)) {
            WinterFlowEventEmitterOrchestration.WinterFlowResponseEngine("Start destination ", "MAIN", " cannot use the same route as the graph ", winterFlowSerializerMicroservice3);
        } else if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper("MAIN")) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot have an empty start destination route");
        } else {
            int i3 = WinterFlowServerLayer.WinterFlowSyntax;
            winterFlowMicroserviceProtocol.WinterFlowCacheManagerAgent = "android-app://androidx.navigation/".concat("MAIN").hashCode();
            winterFlowMicroserviceProtocol.WinterFlowVariableVersionControl = "MAIN";
        }
        return winterFlowSerializerMicroservice;
    }
}
