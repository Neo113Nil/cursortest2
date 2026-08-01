package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerVariable extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowDebugVersion WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowDataSourceConsumer WinterFlowThreadListener;
    public final /* synthetic */ WinterFlowJSONDecorator WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowCompilerVariable(WinterFlowJSONDecorator winterFlowJSONDecorator, WinterFlowDebugVersion winterFlowDebugVersion, WinterFlowDataSourceConsumer winterFlowDataSourceConsumer, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowJSONDecorator;
        this.WinterFlowServerProtocol = winterFlowDebugVersion;
        this.WinterFlowThreadListener = winterFlowDataSourceConsumer;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        switch (this.WinterFlowSyntax) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowCompilerVariable(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowTransactionManagerLayer, 0);
            default:
                return new WinterFlowCompilerVariable(this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, winterFlowTransactionManagerLayer, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.WinterFlowArrayNetwork(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowSerializerStructure(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.WinterFlowArrayNetwork(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (com.google.android.datatransport.WinterFlowManagerRequest.WinterFlowSerializerStructure(r4, r10) == r6) goto L31;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = this.WinterFlowThreadListener;
        WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowDebugVersion winterFlowDebugVersion = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    long j = WinterFlowResolverProxy.WinterFlowRouterStructure;
                    this.WinterFlowResponseEngine = 1;
                    break;
                } else if (i2 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                } else if (i2 != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowDataSourceConsumer.WinterFlowPackageIDE = winterFlowDebugVersion;
                    break;
                }
                this.WinterFlowResponseEngine = 2;
                break;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    long j2 = WinterFlowResolverProxy.WinterFlowRouterStructure;
                    this.WinterFlowResponseEngine = 1;
                    break;
                } else if (i3 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                } else if (i3 != 2) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    winterFlowDataSourceConsumer.WinterFlowCompilerVariable = winterFlowDebugVersion;
                    break;
                }
                this.WinterFlowResponseEngine = 2;
                break;
        }
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowCompilerVariable) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowAdapterResponse)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
