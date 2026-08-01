package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleManager extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowResponseVersionControl WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax = 1;
    public final /* synthetic */ WinterFlowCacheInterface WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowModuleManager(WinterFlowResponseVersionControl winterFlowResponseVersionControl, WinterFlowCacheInterface winterFlowCacheInterface, Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowResponseVersionControl;
        this.WinterFlowThreadListener = winterFlowCacheInterface;
        this.WinterFlowTransactionAgent = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowCacheInterface winterFlowCacheInterface = this.WinterFlowThreadListener;
        WinterFlowResponseVersionControl winterFlowResponseVersionControl = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowModuleManager(winterFlowResponseVersionControl, winterFlowCacheInterface, this.WinterFlowTransactionAgent, winterFlowTransactionManagerLayer);
            default:
                WinterFlowModuleManager winterFlowModuleManager = new WinterFlowModuleManager(winterFlowResponseVersionControl, winterFlowCacheInterface, winterFlowTransactionManagerLayer);
                winterFlowModuleManager.WinterFlowTransactionAgent = obj;
                return winterFlowModuleManager;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowControllerScript winterFlowControllerScript = this.WinterFlowServerProtocol.WinterFlowSyntax;
                    Object obj2 = this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowControllerScript.WinterFlowArrayNetwork(this.WinterFlowThreadListener, obj2, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i2 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionAgent;
                    WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
                    WinterFlowResponseVersionControl winterFlowResponseVersionControl = this.WinterFlowServerProtocol;
                    WinterFlowEventProvider winterFlowEventProvider = winterFlowResponseVersionControl.WinterFlowRouterRouter;
                    WinterFlowValidatorParser winterFlowValidatorParser = new WinterFlowValidatorParser(winterFlowBandwidthCache, winterFlowAdapterResponse, winterFlowResponseVersionControl, this.WinterFlowThreadListener, 0);
                    this.WinterFlowResponseEngine = 1;
                    if (winterFlowEventProvider.WinterFlowRouterStructure(winterFlowValidatorParser, this) == winterFlowListenerJava) {
                        break;
                    }
                } else if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                break;
        }
        return winterFlowListenerJava;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowModuleManager) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowModuleManager(WinterFlowResponseVersionControl winterFlowResponseVersionControl, WinterFlowCacheInterface winterFlowCacheInterface, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = winterFlowResponseVersionControl;
        this.WinterFlowThreadListener = winterFlowCacheInterface;
    }
}
