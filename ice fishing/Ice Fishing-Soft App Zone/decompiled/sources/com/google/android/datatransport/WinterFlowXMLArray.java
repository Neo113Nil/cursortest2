package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowXMLArray implements WinterFlowControllerScript {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowFrontendNode winterFlowFrontendNode = WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowRefactoringManager winterFlowRefactoringManager = (WinterFlowRefactoringManager) obj;
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj2;
                int intValue = ((Integer) obj3).intValue();
                winterFlowRefactoringManager.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowRefactoringManager) ? 4 : 2;
                }
                if (winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 19) != 18)) {
                    WinterFlowManagerRequest.WinterFlowResponseEngine(WinterFlowCacheRuntime.WinterFlowUserManagerUserManager(WinterFlowCacheRuntime.WinterFlowThreadListener, winterFlowRefactoringManager), winterFlowResolverLibrary, 0);
                } else {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowNodeException winterFlowNodeException = (WinterFlowNodeException) obj;
                int WinterFlowUserManagerUserManager = winterFlowNodeException.WinterFlowUserManagerUserManager(10.0f);
                long j = ((WinterFlowHandlerConsumer) obj3).WinterFlowRouterStructure;
                int i2 = WinterFlowUserManagerUserManager * 2;
                WinterFlowViewTesting WinterFlowVariableVersionControl = ((WinterFlowRuntimeVersion) obj2).WinterFlowVariableVersionControl(WinterFlowServiceOrchestration.WinterFlowRouterRouter(i2, 0, j));
                return winterFlowNodeException.WinterFlowThreadListener(WinterFlowVariableVersionControl.WinterFlowVariableVersionControl - i2, WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy, winterFlowFrontendNode, new WinterFlowProcessorEngine(WinterFlowVariableVersionControl, WinterFlowUserManagerUserManager, 1));
            case 2:
                WinterFlowNodeException winterFlowNodeException2 = (WinterFlowNodeException) obj;
                int WinterFlowUserManagerUserManager2 = winterFlowNodeException2.WinterFlowUserManagerUserManager(10.0f);
                long j2 = ((WinterFlowHandlerConsumer) obj3).WinterFlowRouterStructure;
                int i3 = WinterFlowUserManagerUserManager2 * 2;
                WinterFlowViewTesting WinterFlowVariableVersionControl2 = ((WinterFlowRuntimeVersion) obj2).WinterFlowVariableVersionControl(WinterFlowServiceOrchestration.WinterFlowRouterRouter(0, i3, j2));
                return winterFlowNodeException2.WinterFlowThreadListener(WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl, WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy - i3, winterFlowFrontendNode, new WinterFlowProcessorEngine(WinterFlowVariableVersionControl2, WinterFlowUserManagerUserManager2, 0));
            default:
                long j3 = ((WinterFlowObjectSystem) obj2).WinterFlowCacheManagerAgent;
                return winterFlowAlgorithmSession;
        }
    }

    public /* synthetic */ WinterFlowXMLArray(int i) {
        this.WinterFlowVariableVersionControl = i;
    }
}
