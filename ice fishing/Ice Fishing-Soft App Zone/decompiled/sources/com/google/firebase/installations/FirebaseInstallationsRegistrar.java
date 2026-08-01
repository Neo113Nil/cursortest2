package com.google.firebase.installations;

import com.google.android.datatransport.WinterFlowBackendComponent;
import com.google.android.datatransport.WinterFlowCompilerMechanism;
import com.google.android.datatransport.WinterFlowDataSourceVersion;
import com.google.android.datatransport.WinterFlowDatabaseSchemaBandwidth;
import com.google.android.datatransport.WinterFlowEncryptionObject;
import com.google.android.datatransport.WinterFlowFrameworkTool;
import com.google.android.datatransport.WinterFlowInvokerComponent;
import com.google.android.datatransport.WinterFlowOrchestrationConcurrency;
import com.google.android.datatransport.WinterFlowProxySubsystem;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowSessionManagerProcess;
import com.google.android.datatransport.WinterFlowTransactionManagerConfiguration;
import com.google.android.datatransport.WinterFlowValidatorProcess;
import com.google.android.datatransport.WinterFlowValidatorVersion;
import com.google.android.datatransport.WinterFlowWorkerTool;
import com.google.firebase.WinterFlowSyntaxEvent;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static WinterFlowDatabaseSchemaBandwidth lambda$getComponents$0(WinterFlowDataSourceVersion winterFlowDataSourceVersion) {
        return new WinterFlowBackendComponent((WinterFlowSyntaxEvent) winterFlowDataSourceVersion.WinterFlowRouterStructure(WinterFlowSyntaxEvent.class), winterFlowDataSourceVersion.WinterFlowArrayNetwork(WinterFlowFrameworkTool.class), (ExecutorService) winterFlowDataSourceVersion.WinterFlowVariableVersionControl(new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, ExecutorService.class)), new WinterFlowValidatorVersion((Executor) winterFlowDataSourceVersion.WinterFlowVariableVersionControl(new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<WinterFlowQueueManager> getComponents() {
        int i = 0;
        WinterFlowProxySubsystem winterFlowProxySubsystem = new WinterFlowProxySubsystem(WinterFlowDatabaseSchemaBandwidth.class, new Class[0]);
        winterFlowProxySubsystem.WinterFlowRouterStructure = LIBRARY_NAME;
        winterFlowProxySubsystem.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(WinterFlowSyntaxEvent.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(0, 1, WinterFlowFrameworkTool.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, ExecutorService.class), 1, 0));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, Executor.class), 1, 0));
        winterFlowProxySubsystem.WinterFlowTransactionManagerStrategy = new WinterFlowCompilerMechanism(25);
        WinterFlowQueueManager WinterFlowHookDataSource = winterFlowProxySubsystem.WinterFlowHookDataSource();
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = new WinterFlowSessionManagerProcess(i);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowSessionManagerProcess.class));
        return Arrays.asList(WinterFlowHookDataSource, new WinterFlowQueueManager(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new WinterFlowWorkerTool(i, winterFlowSessionManagerProcess), hashSet3), WinterFlowInvokerComponent.WinterFlowSingletonPlatform(LIBRARY_NAME, "19.1.1"));
    }
}
