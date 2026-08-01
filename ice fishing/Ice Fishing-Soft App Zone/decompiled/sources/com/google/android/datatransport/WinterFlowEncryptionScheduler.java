package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEncryptionScheduler implements WinterFlowVersionControlView {
    public final WinterFlowEventCloud WinterFlowRouterRouter;
    public final long WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final WinterFlowCacheManagerNode WinterFlowVariableVersionControl;

    public WinterFlowEncryptionScheduler(WinterFlowCacheManagerNode winterFlowCacheManagerNode, long j, Object obj, WinterFlowEventCloud winterFlowEventCloud) {
        this.WinterFlowVariableVersionControl = winterFlowCacheManagerNode;
        this.WinterFlowTransactionManagerStrategy = j;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = winterFlowEventCloud;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlView
    public final void WinterFlowRouterStructure() {
        WinterFlowCacheManagerNode winterFlowCacheManagerNode = this.WinterFlowVariableVersionControl;
        synchronized (winterFlowCacheManagerNode) {
            if (this.WinterFlowTransactionManagerStrategy < winterFlowCacheManagerNode.WinterFlowBandwidthObject()) {
                return;
            }
            Object[] objArr = winterFlowCacheManagerNode.WinterFlowServerProtocol;
            objArr.getClass();
            long j = this.WinterFlowTransactionManagerStrategy;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            WinterFlowHandlerWebsocket.WinterFlowSyntaxSubsystem(objArr, j, WinterFlowHandlerWebsocket.WinterFlowSingletonPlatform);
            winterFlowCacheManagerNode.WinterFlowResponseEngine();
        }
    }
}
