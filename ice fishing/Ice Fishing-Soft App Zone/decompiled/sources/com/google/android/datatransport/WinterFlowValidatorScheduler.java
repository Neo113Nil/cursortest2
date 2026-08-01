package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorScheduler extends WinterFlowAlgorithmAPI {
    public static final WinterFlowValidatorScheduler WinterFlowHookDataSource = new WinterFlowValidatorScheduler(0);
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowValidatorScheduler(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = list.size();
                WinterFlowFrontendNode winterFlowFrontendNode = WinterFlowFrontendNode.WinterFlowVariableVersionControl;
                if (size == 0) {
                    return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowSyntax(j), winterFlowFrontendNode, WinterFlowRouterValidator.WinterFlowTransactionAgent);
                }
                if (size == 1) {
                    WinterFlowViewTesting WinterFlowVariableVersionControl = ((WinterFlowRuntimeVersion) list.get(0)).WinterFlowVariableVersionControl(j);
                    return winterFlowNodeException.WinterFlowThreadListener(WinterFlowServiceOrchestration.WinterFlowTransactionManagerStrategy(WinterFlowVariableVersionControl.WinterFlowVariableVersionControl, j), WinterFlowServiceOrchestration.WinterFlowVariableVersionControl(WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy, j), winterFlowFrontendNode, new WinterFlowServiceProviderUserManager(WinterFlowVariableVersionControl, 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    WinterFlowViewTesting WinterFlowVariableVersionControl2 = ((WinterFlowRuntimeVersion) list.get(i3)).WinterFlowVariableVersionControl(j);
                    i = Math.max(WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl, i);
                    i2 = Math.max(WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy, i2);
                    arrayList.add(WinterFlowVariableVersionControl2);
                }
                return winterFlowNodeException.WinterFlowThreadListener(WinterFlowServiceOrchestration.WinterFlowTransactionManagerStrategy(i, j), WinterFlowServiceOrchestration.WinterFlowVariableVersionControl(i2, j), winterFlowFrontendNode, new WinterFlowConfigurationTool(2, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
