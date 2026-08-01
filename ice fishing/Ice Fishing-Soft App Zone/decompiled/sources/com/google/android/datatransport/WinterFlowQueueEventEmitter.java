package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueEventEmitter extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public WinterFlowFunctionSubsystem WinterFlowResponseEngine;
    public final /* synthetic */ float WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowInterface WinterFlowServiceUtility;
    public WinterFlowAdapterInheritance WinterFlowSyntax;
    public final /* synthetic */ WinterFlowNetworkWidget WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueueEventEmitter(float f, WinterFlowNetworkWidget winterFlowNetworkWidget, WinterFlowInterface winterFlowInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = f;
        this.WinterFlowThreadListener = winterFlowNetworkWidget;
        this.WinterFlowServiceUtility = winterFlowInterface;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        return new WinterFlowQueueEventEmitter(this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, winterFlowTransactionManagerLayer);
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        float f;
        WinterFlowAdapterInheritance winterFlowAdapterInheritance;
        WinterFlowFunctionSubsystem winterFlowFunctionSubsystem;
        int i = this.WinterFlowTransactionAgent;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            f = this.WinterFlowServerProtocol;
            if (Math.abs(f) > 1.0f) {
                WinterFlowAdapterInheritance winterFlowAdapterInheritance2 = new WinterFlowAdapterInheritance();
                winterFlowAdapterInheritance2.WinterFlowVariableVersionControl = f;
                WinterFlowAdapterInheritance winterFlowAdapterInheritance3 = new WinterFlowAdapterInheritance();
                WinterFlowFunctionSubsystem WinterFlowRouterStructure = WinterFlowInvokerComponent.WinterFlowRouterStructure(f, 28);
                try {
                    WinterFlowNetworkWidget winterFlowNetworkWidget = this.WinterFlowThreadListener;
                    WinterFlowAPIThread winterFlowAPIThread = winterFlowNetworkWidget.WinterFlowRouterStructure;
                    WinterFlowRequestPipeline winterFlowRequestPipeline = new WinterFlowRequestPipeline(winterFlowAdapterInheritance3, this.WinterFlowServiceUtility, winterFlowAdapterInheritance2, winterFlowNetworkWidget);
                    this.WinterFlowSyntax = winterFlowAdapterInheritance2;
                    this.WinterFlowResponseEngine = WinterFlowRouterStructure;
                    this.WinterFlowTransactionAgent = 1;
                    Object WinterFlowCacheManagerAgent = WinterFlowDecoratorUI.WinterFlowCacheManagerAgent(WinterFlowRouterStructure, new WinterFlowInvokerCloud(winterFlowAPIThread, WinterFlowEncryptionSubsystem.WinterFlowRouterAdapter, WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy.getValue(), WinterFlowRouterStructure.WinterFlowUnitTestResponse), Long.MIN_VALUE, winterFlowRequestPipeline, this);
                    Object obj2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                    if (WinterFlowCacheManagerAgent != obj2) {
                        WinterFlowCacheManagerAgent = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                    }
                    if (WinterFlowCacheManagerAgent == obj2) {
                        return obj2;
                    }
                    winterFlowAdapterInheritance = winterFlowAdapterInheritance2;
                } catch (CancellationException unused) {
                    winterFlowAdapterInheritance = winterFlowAdapterInheritance2;
                    winterFlowFunctionSubsystem = WinterFlowRouterStructure;
                    winterFlowAdapterInheritance.WinterFlowVariableVersionControl = ((Number) ((WinterFlowObjectSession) winterFlowFunctionSubsystem.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowFunctionSubsystem.WinterFlowUnitTestResponse)).floatValue();
                    f = winterFlowAdapterInheritance.WinterFlowVariableVersionControl;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        if (i != 1) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        winterFlowFunctionSubsystem = this.WinterFlowResponseEngine;
        winterFlowAdapterInheritance = this.WinterFlowSyntax;
        try {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        } catch (CancellationException unused2) {
            winterFlowAdapterInheritance.WinterFlowVariableVersionControl = ((Number) ((WinterFlowObjectSession) winterFlowFunctionSubsystem.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse).WinterFlowUnitTestResponse(winterFlowFunctionSubsystem.WinterFlowUnitTestResponse)).floatValue();
            f = winterFlowAdapterInheritance.WinterFlowVariableVersionControl;
            return new Float(f);
        }
        f = winterFlowAdapterInheritance.WinterFlowVariableVersionControl;
        return new Float(f);
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowQueueEventEmitter) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
