package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRefactoringSubsystem implements WinterFlowWorkerModule {
    public final /* synthetic */ int WinterFlowRouterStructure;
    public static final WinterFlowRefactoringSubsystem WinterFlowHookDataSource = new WinterFlowRefactoringSubsystem(0);
    public static final WinterFlowRefactoringSubsystem WinterFlowCacheManagerAgent = new WinterFlowRefactoringSubsystem(1);
    public static final WinterFlowRefactoringSubsystem WinterFlowArrayNetwork = new WinterFlowRefactoringSubsystem(2);
    public static final WinterFlowInterfaceSoftware WinterFlowVariableVersionControl = new WinterFlowInterfaceSoftware(11);
    public static final WinterFlowRefactoringSubsystem WinterFlowTransactionManagerStrategy = new WinterFlowRefactoringSubsystem(3);
    public static final WinterFlowRefactoringSubsystem WinterFlowUnitTestResponse = new WinterFlowRefactoringSubsystem(4);

    public /* synthetic */ WinterFlowRefactoringSubsystem(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        int i = this.WinterFlowRouterStructure;
        WinterFlowFrontendNode winterFlowFrontendNode = WinterFlowFrontendNode.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    WinterFlowViewTesting WinterFlowVariableVersionControl2 = ((WinterFlowRuntimeVersion) list.get(i4)).WinterFlowVariableVersionControl(j);
                    i2 = Math.max(i2, WinterFlowVariableVersionControl2.WinterFlowVariableVersionControl);
                    i3 = Math.max(i3, WinterFlowVariableVersionControl2.WinterFlowTransactionManagerStrategy);
                    arrayList.add(WinterFlowVariableVersionControl2);
                }
                if (list.isEmpty()) {
                    i2 = WinterFlowHandlerConsumer.WinterFlowResponseEngine(j);
                    i3 = WinterFlowHandlerConsumer.WinterFlowSyntax(j);
                }
                return winterFlowNodeException.WinterFlowThreadListener(i2, i3, winterFlowFrontendNode, new WinterFlowConfigurationTool(0, arrayList));
            case 1:
                return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowSyntax(j), winterFlowFrontendNode, new WinterFlowInterfaceSoftware(5));
            case 2:
                return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowRouterRouter(j), WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j), winterFlowFrontendNode, WinterFlowVariableVersionControl);
            case 3:
                return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowResponseEngine(j), WinterFlowHandlerConsumer.WinterFlowSyntax(j), winterFlowFrontendNode, new WinterFlowInterfaceSoftware(14));
            default:
                return winterFlowNodeException.WinterFlowThreadListener(WinterFlowHandlerConsumer.WinterFlowTransactionManagerStrategy(j) ? WinterFlowHandlerConsumer.WinterFlowRouterRouter(j) : 0, WinterFlowHandlerConsumer.WinterFlowVariableVersionControl(j) ? WinterFlowHandlerConsumer.WinterFlowUnitTestResponse(j) : 0, winterFlowFrontendNode, new WinterFlowSessionManagerAgent(21));
        }
    }
}
