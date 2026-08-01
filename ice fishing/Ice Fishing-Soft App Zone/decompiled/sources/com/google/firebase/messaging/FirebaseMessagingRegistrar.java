package com.google.firebase.messaging;

import com.google.android.datatransport.WinterFlowAlgorithmMiddleware;
import com.google.android.datatransport.WinterFlowDataSourceVersion;
import com.google.android.datatransport.WinterFlowDatabaseSchemaBandwidth;
import com.google.android.datatransport.WinterFlowEventEmitterOrchestration;
import com.google.android.datatransport.WinterFlowExceptionProcessor;
import com.google.android.datatransport.WinterFlowInvokerComponent;
import com.google.android.datatransport.WinterFlowJSONUnitTest;
import com.google.android.datatransport.WinterFlowListenerSystem;
import com.google.android.datatransport.WinterFlowMiddlewareView;
import com.google.android.datatransport.WinterFlowOrchestrationConcurrency;
import com.google.android.datatransport.WinterFlowProxySubsystem;
import com.google.android.datatransport.WinterFlowQueryMechanism;
import com.google.android.datatransport.WinterFlowQueueManager;
import com.google.android.datatransport.WinterFlowStrategyConcurrency;
import com.google.android.datatransport.WinterFlowValidatorProcess;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(WinterFlowValidatorProcess winterFlowValidatorProcess, WinterFlowDataSourceVersion winterFlowDataSourceVersion) {
        com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) winterFlowDataSourceVersion.WinterFlowRouterStructure(com.google.firebase.WinterFlowSyntaxEvent.class);
        if (winterFlowDataSourceVersion.WinterFlowRouterStructure(WinterFlowQueryMechanism.class) == null) {
            return new FirebaseMessaging(winterFlowSyntaxEvent, winterFlowDataSourceVersion.WinterFlowArrayNetwork(WinterFlowListenerSystem.class), winterFlowDataSourceVersion.WinterFlowArrayNetwork(WinterFlowJSONUnitTest.class), (WinterFlowDatabaseSchemaBandwidth) winterFlowDataSourceVersion.WinterFlowRouterStructure(WinterFlowDatabaseSchemaBandwidth.class), winterFlowDataSourceVersion.WinterFlowTransactionManagerStrategy(winterFlowValidatorProcess), (WinterFlowExceptionProcessor) winterFlowDataSourceVersion.WinterFlowRouterStructure(WinterFlowExceptionProcessor.class));
        }
        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<WinterFlowQueueManager> getComponents() {
        WinterFlowValidatorProcess winterFlowValidatorProcess = new WinterFlowValidatorProcess(WinterFlowAlgorithmMiddleware.class, WinterFlowMiddlewareView.class);
        WinterFlowProxySubsystem winterFlowProxySubsystem = new WinterFlowProxySubsystem(FirebaseMessaging.class, new Class[0]);
        winterFlowProxySubsystem.WinterFlowRouterStructure = LIBRARY_NAME;
        winterFlowProxySubsystem.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(com.google.firebase.WinterFlowSyntaxEvent.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(0, 0, WinterFlowQueryMechanism.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(0, 1, WinterFlowListenerSystem.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(0, 1, WinterFlowJSONUnitTest.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(WinterFlowDatabaseSchemaBandwidth.class));
        winterFlowProxySubsystem.WinterFlowRouterStructure(new WinterFlowOrchestrationConcurrency(winterFlowValidatorProcess, 0, 1));
        winterFlowProxySubsystem.WinterFlowRouterStructure(WinterFlowOrchestrationConcurrency.WinterFlowRouterStructure(WinterFlowExceptionProcessor.class));
        winterFlowProxySubsystem.WinterFlowTransactionManagerStrategy = new WinterFlowStrategyConcurrency(winterFlowValidatorProcess, 1);
        if (winterFlowProxySubsystem.WinterFlowArrayNetwork == 0) {
            winterFlowProxySubsystem.WinterFlowArrayNetwork = 1;
            return Arrays.asList(winterFlowProxySubsystem.WinterFlowHookDataSource(), WinterFlowInvokerComponent.WinterFlowSingletonPlatform(LIBRARY_NAME, "25.1.1"));
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Instantiation type has already been set.");
        return null;
    }
}
