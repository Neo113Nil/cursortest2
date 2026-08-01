package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererEntity extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public Object WinterFlowServerProtocol;
    public final /* synthetic */ Object WinterFlowServiceUtility;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowThreadListener;
    public final /* synthetic */ long WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRendererEntity(Object obj, long j, Object obj2, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowThreadListener = obj;
        this.WinterFlowTransactionAgent = j;
        this.WinterFlowServiceUtility = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowServiceUtility;
        Object obj3 = this.WinterFlowThreadListener;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowRendererEntity((WinterFlowConsumerBandwidth) obj3, this.WinterFlowTransactionAgent, (WinterFlowJSONDecorator) obj2, winterFlowTransactionManagerLayer, 0);
            default:
                WinterFlowRendererEntity winterFlowRendererEntity = new WinterFlowRendererEntity((WinterFlowTransactionManagerService) obj3, this.WinterFlowTransactionAgent, (WinterFlowAdapterInheritance) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowRendererEntity.WinterFlowServerProtocol = obj;
                return winterFlowRendererEntity;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (((com.google.android.datatransport.WinterFlowConsumerBandwidth) r9).WinterFlowCompilerVariable(r13) == r7) goto L31;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowHookServiceProvider winterFlowHookServiceProvider;
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowServiceUtility;
        long j = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        Object obj3 = this.WinterFlowThreadListener;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowJSONDecorator winterFlowJSONDecorator = (WinterFlowJSONDecorator) obj2;
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    break;
                } else if (i2 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                } else if (i2 == 2) {
                    winterFlowHookServiceProvider = (WinterFlowHookServiceProvider) this.WinterFlowServerProtocol;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowServerProtocol = null;
                    this.WinterFlowResponseEngine = 3;
                    if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowHookServiceProvider, this) != winterFlowListenerJava) {
                    }
                    break;
                } else if (i2 != 3) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    break;
                }
                WinterFlowDebugVersion winterFlowDebugVersion = new WinterFlowDebugVersion(j);
                WinterFlowHookServiceProvider winterFlowHookServiceProvider2 = new WinterFlowHookServiceProvider(winterFlowDebugVersion);
                this.WinterFlowServerProtocol = winterFlowHookServiceProvider2;
                this.WinterFlowResponseEngine = 2;
                if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowDebugVersion, this) != winterFlowListenerJava) {
                    winterFlowHookServiceProvider = winterFlowHookServiceProvider2;
                    this.WinterFlowServerProtocol = null;
                    this.WinterFlowResponseEngine = 3;
                    if (winterFlowJSONDecorator.WinterFlowArrayNetwork(winterFlowHookServiceProvider, this) != winterFlowListenerJava) {
                    }
                }
                break;
            default:
                WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) obj3;
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowRendererClass winterFlowRendererClass = (WinterFlowRendererClass) this.WinterFlowServerProtocol;
                    float WinterFlowUnitTestResponse = winterFlowTransactionManagerService.WinterFlowUnitTestResponse(j);
                    WinterFlowConsumerVersionControl winterFlowConsumerVersionControl = new WinterFlowConsumerVersionControl((WinterFlowAdapterInheritance) obj2, winterFlowTransactionManagerService, winterFlowRendererClass, 7);
                    this.WinterFlowResponseEngine = 1;
                    if (WinterFlowDecoratorUI.WinterFlowArrayNetwork(0.0f, WinterFlowUnitTestResponse, null, winterFlowConsumerVersionControl, this, 12) == winterFlowListenerJava) {
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
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRendererEntity) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowRendererEntity) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRendererClass) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
