package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterThreadPool extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ WinterFlowStrategyResolver WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowRouterThreadPool(WinterFlowStrategyResolver winterFlowStrategyResolver, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = winterFlowStrategyResolver;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowRouterThreadPool(winterFlowStrategyResolver, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowRouterThreadPool(winterFlowStrategyResolver, winterFlowTransactionManagerLayer, 1);
            default:
                return new WinterFlowRouterThreadPool(winterFlowStrategyResolver, winterFlowTransactionManagerLayer, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r7.WinterFlowUnitTestResponse(r9) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r6) goto L41;
     */
    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowStrategyResolver winterFlowStrategyResolver = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    return winterFlowStrategyResolver.WinterFlowTransactionManagerStrategy(this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowAlgorithmSession;
                }
                if (i2 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return winterFlowAlgorithmSession;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowStackProvider winterFlowStackProvider = winterFlowStrategyResolver.WinterFlowThreadListener;
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowVersionControlModule = ((WinterFlowXMLPlatform) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).WinterFlowVersionControlModule(this);
                    if (WinterFlowVersionControlModule != winterFlowListenerJava) {
                        WinterFlowVersionControlModule = winterFlowAlgorithmSession;
                        break;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                            return winterFlowAlgorithmSession;
                        }
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                WinterFlowEventProvider WinterFlowRouterRouter = WinterFlowEncryptionSubsystem.WinterFlowRouterRouter(winterFlowStrategyResolver.WinterFlowHookDataSource().WinterFlowCacheManagerAgent, -1);
                WinterFlowCloudComponent winterFlowCloudComponent = new WinterFlowCloudComponent(1, winterFlowStrategyResolver);
                this.WinterFlowResponseEngine = 2;
                if (WinterFlowRouterRouter.WinterFlowRouterStructure(winterFlowCloudComponent, this) != winterFlowListenerJava) {
                    return winterFlowAlgorithmSession;
                }
                return winterFlowListenerJava;
            default:
                WinterFlowHandlerStructure winterFlowHandlerStructure = winterFlowStrategyResolver.WinterFlowServerProtocol;
                int i4 = this.WinterFlowResponseEngine;
                try {
                    if (i4 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        if (!(winterFlowHandlerStructure.WinterFlowHookDataSource() instanceof WinterFlowArrayTool)) {
                            this.WinterFlowResponseEngine = 1;
                            break;
                        } else {
                            return winterFlowHandlerStructure.WinterFlowHookDataSource();
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                return (WinterFlowValidatorBandwidth) obj;
                            }
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    this.WinterFlowResponseEngine = 2;
                    obj = winterFlowStrategyResolver.WinterFlowRouterRouter(false, this);
                    break;
                } catch (Throwable th) {
                    return new WinterFlowDecoratorServiceProvider(th, -1);
                }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRouterThreadPool) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowCacheInterface) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 1:
                return ((WinterFlowRouterThreadPool) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowRouterThreadPool) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
