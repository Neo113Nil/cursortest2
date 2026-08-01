package com.google.android.datatransport;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleTransaction implements WinterFlowInvokerStructure {
    public final /* synthetic */ WinterFlowSessionUI WinterFlowRouterRouter;
    public float WinterFlowTransactionManagerStrategy;
    public float WinterFlowUnitTestResponse;
    public WinterFlowCacheManagerConfiguration WinterFlowVariableVersionControl = WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy;

    public WinterFlowModuleTransaction(WinterFlowSessionUI winterFlowSessionUI) {
        this.WinterFlowRouterRouter = winterFlowSessionUI;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeException
    public final WinterFlowTransactionPlatform WinterFlowCompilerDataSource(int i, int i2, Map map, WinterFlowObjectSession winterFlowObjectSession, WinterFlowObjectSession winterFlowObjectSession2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new WinterFlowPipelineScheduler(i, i2, map, winterFlowObjectSession, this, this.WinterFlowRouterRouter, winterFlowObjectSession2);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowRouterRouter() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowNodeException
    public final boolean WinterFlowServiceUtility() {
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool = this.WinterFlowRouterRouter.WinterFlowVariableVersionControl.WinterFlowSoftwareEngine.WinterFlowArrayNetwork;
        return winterFlowTransactionManagerThreadPool == WinterFlowTransactionManagerThreadPool.WinterFlowRouterRouter || winterFlowTransactionManagerThreadPool == WinterFlowTransactionManagerThreadPool.WinterFlowTransactionManagerStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // com.google.android.datatransport.WinterFlowInvokerStructure
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List WinterFlowUnitTestResponse(WinterFlowEventEvent winterFlowEventEvent, Object obj) {
        Object obj2;
        WinterFlowSessionUI winterFlowSessionUI = this.WinterFlowRouterRouter;
        winterFlowSessionUI.WinterFlowRouterRouter();
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowSessionUI.WinterFlowVariableVersionControl;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool = winterFlowSchedulerStructure.WinterFlowSoftwareEngine.WinterFlowArrayNetwork;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool2 = WinterFlowTransactionManagerThreadPool.WinterFlowUnitTestResponse;
        WinterFlowTransactionManagerThreadPool winterFlowTransactionManagerThreadPool3 = WinterFlowTransactionManagerThreadPool.WinterFlowVariableVersionControl;
        if (winterFlowTransactionManagerThreadPool != winterFlowTransactionManagerThreadPool3 && winterFlowTransactionManagerThreadPool != winterFlowTransactionManagerThreadPool2 && winterFlowTransactionManagerThreadPool != WinterFlowTransactionManagerThreadPool.WinterFlowTransactionManagerStrategy && winterFlowTransactionManagerThreadPool != WinterFlowTransactionManagerThreadPool.WinterFlowRouterRouter) {
            WinterFlowViewUtility.WinterFlowHookDataSource("subcompose can only be used inside the measure or layout blocks");
        }
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowSessionUI.WinterFlowTransactionAgent;
        Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(obj);
        if (WinterFlowUnitTestResponse == null) {
            WinterFlowUnitTestResponse = (WinterFlowSchedulerStructure) winterFlowSessionUI.WinterFlowServiceUtility.WinterFlowTransactionAgent(obj);
            if (WinterFlowUnitTestResponse != null) {
                if (winterFlowSessionUI.WinterFlowVariableBandwidth <= 0) {
                    WinterFlowViewUtility.WinterFlowHookDataSource("Check failed.");
                }
                winterFlowSessionUI.WinterFlowVariableBandwidth--;
            } else {
                WinterFlowUnitTestResponse = winterFlowSessionUI.WinterFlowServiceUtility(obj);
                if (WinterFlowUnitTestResponse == null) {
                    int i = winterFlowSessionUI.WinterFlowRouterRouter;
                    WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = new WinterFlowSchedulerStructure(2);
                    winterFlowSchedulerStructure.WinterFlowRouterAdapter = true;
                    winterFlowSchedulerStructure.WinterFlowBackendCacheManager(i, winterFlowSchedulerStructure2);
                    winterFlowSchedulerStructure.WinterFlowRouterAdapter = false;
                    WinterFlowUnitTestResponse = winterFlowSchedulerStructure2;
                }
            }
            winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(obj, WinterFlowUnitTestResponse);
        }
        WinterFlowSchedulerStructure winterFlowSchedulerStructure3 = (WinterFlowSchedulerStructure) WinterFlowUnitTestResponse;
        List WinterFlowServiceUtility = winterFlowSchedulerStructure.WinterFlowServiceUtility();
        int i2 = winterFlowSessionUI.WinterFlowRouterRouter;
        if (i2 >= 0) {
            WinterFlowDecoratorLayer winterFlowDecoratorLayer = (WinterFlowDecoratorLayer) WinterFlowServiceUtility;
            if (i2 < winterFlowDecoratorLayer.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse) {
                obj2 = winterFlowDecoratorLayer.get(i2);
                if (obj2 != winterFlowSchedulerStructure3) {
                    int WinterFlowSyntax = ((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowServiceUtility()).WinterFlowVariableVersionControl.WinterFlowSyntax(winterFlowSchedulerStructure3);
                    if (WinterFlowSyntax < winterFlowSessionUI.WinterFlowRouterRouter) {
                        WinterFlowViewUtility.WinterFlowRouterStructure("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i3 = winterFlowSessionUI.WinterFlowRouterRouter;
                    if (i3 != WinterFlowSyntax) {
                        winterFlowSessionUI.WinterFlowResponseEngine(WinterFlowSyntax, i3);
                    }
                }
                winterFlowSessionUI.WinterFlowRouterRouter++;
                winterFlowSessionUI.WinterFlowThreadListener(winterFlowSchedulerStructure3, obj, false, winterFlowEventEvent);
                return (winterFlowTransactionManagerThreadPool != winterFlowTransactionManagerThreadPool3 || winterFlowTransactionManagerThreadPool == winterFlowTransactionManagerThreadPool2) ? winterFlowSchedulerStructure3.WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowAPIFrontend() : winterFlowSchedulerStructure3.WinterFlowServerProtocol();
            }
        }
        obj2 = null;
        if (obj2 != winterFlowSchedulerStructure3) {
        }
        winterFlowSessionUI.WinterFlowRouterRouter++;
        winterFlowSessionUI.WinterFlowThreadListener(winterFlowSchedulerStructure3, obj, false, winterFlowEventEvent);
        if (winterFlowTransactionManagerThreadPool != winterFlowTransactionManagerThreadPool3) {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowNodeException
    public final WinterFlowCacheManagerConfiguration getLayoutDirection() {
        return this.WinterFlowVariableVersionControl;
    }
}
