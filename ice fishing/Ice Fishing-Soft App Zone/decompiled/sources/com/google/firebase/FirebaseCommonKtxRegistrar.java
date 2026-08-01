package com.google.firebase;

import com.google.android.datatransport.WinterFlowCacheUtility;
import com.google.android.datatransport.WinterFlowConsumerException;
import com.google.android.datatransport.WinterFlowEncryptionObject;
import com.google.android.datatransport.WinterFlowNetworkEvent;
import com.google.android.datatransport.WinterFlowOrchestrationConcurrency;
import com.google.android.datatransport.WinterFlowProxySubsystem;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowSessionManagerProcess;
import com.google.android.datatransport.WinterFlowTransactionManagerConfiguration;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowUnitTestRouter;
import com.google.android.datatransport.WinterFlowValidatorProcess;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<WinterFlowQueueManager> getComponents() {
        WinterFlowProxySubsystem WinterFlowRouterStructure = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, WinterFlowUnitTestRouter.class));
        WinterFlowRouterStructure.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, Executor.class), 1, 0));
        WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy = WinterFlowSessionManagerProcess.WinterFlowBandwidthObject;
        WinterFlowQueueManager WinterFlowHookDataSource = WinterFlowRouterStructure.WinterFlowHookDataSource();
        WinterFlowProxySubsystem WinterFlowRouterStructure2 = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowNetworkEvent.class, WinterFlowUnitTestRouter.class));
        WinterFlowRouterStructure2.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(new WinterFlowValidatorProcess(WinterFlowNetworkEvent.class, Executor.class), 1, 0));
        WinterFlowRouterStructure2.WinterFlowTransactionManagerStrategy = WinterFlowCacheUtility.WinterFlowConfigurationSubsystem;
        WinterFlowQueueManager WinterFlowHookDataSource2 = WinterFlowRouterStructure2.WinterFlowHookDataSource();
        WinterFlowProxySubsystem WinterFlowRouterStructure3 = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, WinterFlowUnitTestRouter.class));
        WinterFlowRouterStructure3.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, Executor.class), 1, 0));
        WinterFlowRouterStructure3.WinterFlowTransactionManagerStrategy = WinterFlowSessionManagerProcess.WinterFlowOrchestrationSubsystem;
        WinterFlowQueueManager WinterFlowHookDataSource3 = WinterFlowRouterStructure3.WinterFlowHookDataSource();
        WinterFlowProxySubsystem WinterFlowRouterStructure4 = WinterFlowQueueManager.WinterFlowRouterStructure(new WinterFlowValidatorProcess(WinterFlowConsumerException.class, WinterFlowUnitTestRouter.class));
        WinterFlowRouterStructure4.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(new WinterFlowValidatorProcess(WinterFlowConsumerException.class, Executor.class), 1, 0));
        WinterFlowRouterStructure4.WinterFlowTransactionManagerStrategy = WinterFlowCacheUtility.WinterFlowStrategyTool;
        return WinterFlowUnitTestLibrary.WinterFlowPackageIDE(WinterFlowHookDataSource, WinterFlowHookDataSource2, WinterFlowHookDataSource3, WinterFlowRouterStructure4.WinterFlowHookDataSource());
    }
}
