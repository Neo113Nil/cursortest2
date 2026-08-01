package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLStack extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ float WinterFlowResponseEngine;
    public int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowXMLDebug WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowXMLStack(WinterFlowXMLDebug winterFlowXMLDebug, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowTransactionAgent = winterFlowXMLDebug;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowXMLStack winterFlowXMLStack = new WinterFlowXMLStack(this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer);
        winterFlowXMLStack.WinterFlowResponseEngine = ((Number) obj).floatValue();
        return winterFlowXMLStack;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            float f = this.WinterFlowResponseEngine;
            WinterFlowXMLDebug winterFlowXMLDebug = this.WinterFlowTransactionAgent;
            Object WinterFlowUnitTestResponse = winterFlowXMLDebug.WinterFlowRouterStructure.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowVariableVersionControl);
            WinterFlowEventEvent winterFlowEventEvent = (WinterFlowEventEvent) (WinterFlowUnitTestResponse != null ? WinterFlowUnitTestResponse : null);
            if (winterFlowEventEvent == null) {
                throw WinterFlowResolverBackend.WinterFlowUnitTestResponse("Required value was null.");
            }
            WinterFlowHandlerResolver winterFlowHandlerResolver = new WinterFlowHandlerResolver((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.WinterFlowSyntax = 1;
            obj = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowHandlerResolver, this);
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (obj == winterFlowListenerJava) {
                return winterFlowListenerJava;
            }
        } else {
            if (i != 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((WinterFlowHandlerResolver) obj).WinterFlowRouterStructure & 4294967295L)));
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowXMLStack) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, Float.valueOf(((Number) obj).floatValue()))).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
