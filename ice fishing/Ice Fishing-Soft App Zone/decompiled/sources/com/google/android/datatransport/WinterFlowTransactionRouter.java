package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionRouter extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public final /* synthetic */ WinterFlowObjectSession WinterFlowBandwidthObject;
    public int WinterFlowResponseEngine;
    public final /* synthetic */ boolean WinterFlowServerProtocol;
    public final /* synthetic */ WinterFlowCloudFramework WinterFlowServiceUtility;
    public WinterFlowAdapter WinterFlowSyntax;
    public final /* synthetic */ boolean WinterFlowThreadListener;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowTransactionRouter(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, WinterFlowObjectSession winterFlowObjectSession, WinterFlowCloudFramework winterFlowCloudFramework, boolean z, boolean z2) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowServerProtocol = z;
        this.WinterFlowThreadListener = z2;
        this.WinterFlowServiceUtility = winterFlowCloudFramework;
        this.WinterFlowBandwidthObject = winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        WinterFlowTransactionRouter winterFlowTransactionRouter = new WinterFlowTransactionRouter(winterFlowTransactionManagerLayer, this.WinterFlowBandwidthObject, this.WinterFlowServiceUtility, this.WinterFlowServerProtocol, this.WinterFlowThreadListener);
        winterFlowTransactionRouter.WinterFlowTransactionAgent = obj;
        return winterFlowTransactionRouter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowAdapter winterFlowAdapter;
        WinterFlowRequestProvider winterFlowRequestProvider;
        WinterFlowAdapter winterFlowAdapter2;
        WinterFlowRequestProvider winterFlowRequestProvider2;
        Object obj2;
        int i = this.WinterFlowResponseEngine;
        WinterFlowObjectSession winterFlowObjectSession = this.WinterFlowBandwidthObject;
        WinterFlowCloudFramework winterFlowCloudFramework = this.WinterFlowServiceUtility;
        boolean z = this.WinterFlowThreadListener;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i == 0) {
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            WinterFlowRequestProvider winterFlowRequestProvider3 = (WinterFlowRequestProvider) this.WinterFlowTransactionAgent;
            if (!this.WinterFlowServerProtocol) {
                winterFlowRequestProvider3.getClass();
                return winterFlowObjectSession.WinterFlowUnitTestResponse(((WinterFlowVariableRefactoring) winterFlowRequestProvider3).WinterFlowHookDataSource());
            }
            winterFlowAdapter = z ? WinterFlowAdapter.WinterFlowVariableVersionControl : WinterFlowAdapter.WinterFlowTransactionManagerStrategy;
            if (!z) {
                this.WinterFlowTransactionAgent = winterFlowRequestProvider3;
                this.WinterFlowSyntax = winterFlowAdapter;
                this.WinterFlowResponseEngine = 1;
                Boolean WinterFlowArrayNetwork = winterFlowRequestProvider3.WinterFlowArrayNetwork(this);
                if (WinterFlowArrayNetwork != winterFlowListenerJava) {
                    winterFlowRequestProvider2 = winterFlowRequestProvider3;
                    obj = WinterFlowArrayNetwork;
                }
                return winterFlowListenerJava;
            }
            WinterFlowAdapter winterFlowAdapter3 = winterFlowAdapter;
            winterFlowRequestProvider = winterFlowRequestProvider3;
            winterFlowAdapter2 = winterFlowAdapter3;
            WinterFlowEncryptionHelper winterFlowEncryptionHelper = new WinterFlowEncryptionHelper((WinterFlowTransactionManagerLayer) null, winterFlowObjectSession);
            this.WinterFlowTransactionAgent = winterFlowRequestProvider;
            this.WinterFlowSyntax = null;
            this.WinterFlowResponseEngine = 3;
            obj = winterFlowRequestProvider.WinterFlowCacheManagerAgent(winterFlowAdapter2, winterFlowEncryptionHelper, this);
        } else if (i == 1) {
            winterFlowAdapter = this.WinterFlowSyntax;
            winterFlowRequestProvider2 = (WinterFlowRequestProvider) this.WinterFlowTransactionAgent;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    winterFlowRequestProvider = (WinterFlowRequestProvider) this.WinterFlowTransactionAgent;
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (z) {
                        return obj;
                    }
                    this.WinterFlowTransactionAgent = obj;
                    this.WinterFlowResponseEngine = 4;
                    Boolean WinterFlowArrayNetwork2 = winterFlowRequestProvider.WinterFlowArrayNetwork(this);
                    if (WinterFlowArrayNetwork2 != winterFlowListenerJava) {
                        Object obj3 = obj;
                        obj = WinterFlowArrayNetwork2;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    }
                    return winterFlowListenerJava;
                }
                if (i != 4) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.WinterFlowTransactionAgent;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                if (!((Boolean) obj).booleanValue()) {
                    WinterFlowResponseConfiguration WinterFlowArrayNetwork3 = winterFlowCloudFramework.WinterFlowArrayNetwork();
                    WinterFlowGatewaySession winterFlowGatewaySession = WinterFlowArrayNetwork3.WinterFlowHookDataSource;
                    WinterFlowDeploymentEngine winterFlowDeploymentEngine = WinterFlowArrayNetwork3.WinterFlowVariableVersionControl;
                    WinterFlowDeploymentEngine winterFlowDeploymentEngine2 = WinterFlowArrayNetwork3.WinterFlowTransactionManagerStrategy;
                    winterFlowGatewaySession.getClass();
                    winterFlowDeploymentEngine.getClass();
                    winterFlowDeploymentEngine2.getClass();
                    int i2 = 0;
                    if (winterFlowGatewaySession.WinterFlowResponseEngine.compareAndSet(false, true)) {
                        WinterFlowEventEmitterFramework winterFlowEventEmitterFramework = winterFlowGatewaySession.WinterFlowRouterStructure.WinterFlowRouterStructure;
                        if (winterFlowEventEmitterFramework != null) {
                            WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowEventEmitterFramework, new WinterFlowVariable(WinterFlowVariable.WinterFlowTransactionManagerStrategy), new WinterFlowNetworkOrchestration(winterFlowGatewaySession, winterFlowDeploymentEngine2, winterFlowTransactionManagerLayer, i2), 2);
                            return obj2;
                        }
                        WinterFlowManagerRequest.WinterFlowCloudMicroservice("coroutineScope");
                        throw null;
                    }
                }
                return obj2;
            }
            winterFlowAdapter = this.WinterFlowSyntax;
            winterFlowRequestProvider2 = (WinterFlowRequestProvider) this.WinterFlowTransactionAgent;
            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
            winterFlowAdapter2 = winterFlowAdapter;
            winterFlowRequestProvider = winterFlowRequestProvider2;
            WinterFlowEncryptionHelper winterFlowEncryptionHelper2 = new WinterFlowEncryptionHelper((WinterFlowTransactionManagerLayer) null, winterFlowObjectSession);
            this.WinterFlowTransactionAgent = winterFlowRequestProvider;
            this.WinterFlowSyntax = null;
            this.WinterFlowResponseEngine = 3;
            obj = winterFlowRequestProvider.WinterFlowCacheManagerAgent(winterFlowAdapter2, winterFlowEncryptionHelper2, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            WinterFlowResponseConfiguration WinterFlowArrayNetwork4 = winterFlowCloudFramework.WinterFlowArrayNetwork();
            this.WinterFlowTransactionAgent = winterFlowRequestProvider2;
            this.WinterFlowSyntax = winterFlowAdapter;
            this.WinterFlowResponseEngine = 2;
            Object WinterFlowVariableVersionControl = WinterFlowArrayNetwork4.WinterFlowHookDataSource.WinterFlowVariableVersionControl(this);
            if (WinterFlowVariableVersionControl != winterFlowListenerJava) {
                WinterFlowVariableVersionControl = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        }
        winterFlowAdapter2 = winterFlowAdapter;
        winterFlowRequestProvider = winterFlowRequestProvider2;
        WinterFlowEncryptionHelper winterFlowEncryptionHelper22 = new WinterFlowEncryptionHelper((WinterFlowTransactionManagerLayer) null, winterFlowObjectSession);
        this.WinterFlowTransactionAgent = winterFlowRequestProvider;
        this.WinterFlowSyntax = null;
        this.WinterFlowResponseEngine = 3;
        obj = winterFlowRequestProvider.WinterFlowCacheManagerAgent(winterFlowAdapter2, winterFlowEncryptionHelper22, this);
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        return ((WinterFlowTransactionRouter) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRequestProvider) obj)).WinterFlowServiceUtility(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
    }
}
