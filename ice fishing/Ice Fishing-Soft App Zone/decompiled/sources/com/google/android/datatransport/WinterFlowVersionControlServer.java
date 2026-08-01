package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowVersionControlServer extends WinterFlowBandwidthFunction implements WinterFlowEventConfiguration {
    public final WinterFlowTransactionManagerLayer WinterFlowRouterRouter;

    public WinterFlowVersionControlServer(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        super(winterFlowEncryptionMicroservice, true);
        this.WinterFlowRouterRouter = winterFlowTransactionManagerLayer;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public void WinterFlowMapperProtocol(Object obj) {
        this.WinterFlowRouterRouter.WinterFlowSyntax(WinterFlowServerManager.WinterFlowStrategyTool(obj));
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public final boolean WinterFlowQueueService() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerTransaction
    public void WinterFlowServerProtocol(Object obj) {
        WinterFlowCloudStack.WinterFlowCompilerHandler(WinterFlowCloudStack.WinterFlowCompilerVariable(this.WinterFlowRouterRouter), WinterFlowServerManager.WinterFlowStrategyTool(obj));
    }

    @Override // com.google.android.datatransport.WinterFlowEventConfiguration
    public final WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowRouterRouter;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) {
            return (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
        }
        return null;
    }
}
