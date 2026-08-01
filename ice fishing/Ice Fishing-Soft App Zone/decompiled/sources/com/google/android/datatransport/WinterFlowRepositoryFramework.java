package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryFramework {
    public Object WinterFlowArrayNetwork;
    public Object WinterFlowCacheManagerAgent;
    public Object WinterFlowHookDataSource;
    public boolean WinterFlowRouterStructure;
    public Object WinterFlowVariableVersionControl;

    public void WinterFlowHookDataSource(int i, int i2) {
        if (i < 0.0f) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("Index should be non-negative (" + i + ')');
        }
        ((WinterFlowVersionControlModule) this.WinterFlowHookDataSource).WinterFlowSyntax(i);
        WinterFlowRendererRuntime winterFlowRendererRuntime = (WinterFlowRendererRuntime) this.WinterFlowVariableVersionControl;
        if (i != winterFlowRendererRuntime.WinterFlowTransactionManagerStrategy) {
            winterFlowRendererRuntime.WinterFlowTransactionManagerStrategy = i;
            int i3 = (i / 30) * 30;
            winterFlowRendererRuntime.WinterFlowVariableVersionControl.setValue(WinterFlowDecoratorUI.WinterFlowArrayHelper(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((WinterFlowVersionControlModule) this.WinterFlowCacheManagerAgent).WinterFlowSyntax(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int WinterFlowRouterStructure(WinterFlowAlgorithmArray winterFlowAlgorithmArray, WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        WinterFlowParserVersionControl winterFlowParserVersionControl = (WinterFlowParserVersionControl) this.WinterFlowCacheManagerAgent;
        WinterFlowProxyService winterFlowProxyService = (WinterFlowProxyService) this.WinterFlowVariableVersionControl;
        if (this.WinterFlowRouterStructure) {
            return 0;
        }
        try {
            this.WinterFlowRouterStructure = true;
            WinterFlowCacheModule WinterFlowOrchestrationSubsystem = ((WinterFlowJSONDecorator) this.WinterFlowArrayNetwork).WinterFlowOrchestrationSubsystem(winterFlowAlgorithmArray, winterFlowSyntaxTransactionManager);
            WinterFlowDatabaseRenderer winterFlowDatabaseRenderer = (WinterFlowDatabaseRenderer) WinterFlowOrchestrationSubsystem.WinterFlowHookDataSource;
            int WinterFlowTransactionManagerStrategy = winterFlowDatabaseRenderer.WinterFlowTransactionManagerStrategy();
            for (int i3 = 0; i3 < WinterFlowTransactionManagerStrategy; i3++) {
                WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) winterFlowDatabaseRenderer.WinterFlowUnitTestResponse(i3);
                if (!winterFlowObjectSystem.WinterFlowArrayNetwork && !winterFlowObjectSystem.WinterFlowRouterRouter) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int WinterFlowTransactionManagerStrategy2 = winterFlowDatabaseRenderer.WinterFlowTransactionManagerStrategy();
            for (int i4 = 0; i4 < WinterFlowTransactionManagerStrategy2; i4++) {
                WinterFlowObjectSystem winterFlowObjectSystem2 = (WinterFlowObjectSystem) winterFlowDatabaseRenderer.WinterFlowUnitTestResponse(i4);
                if (objArr != false || WinterFlowCacheRuntime.WinterFlowRouterRouter(winterFlowObjectSystem2)) {
                    ((WinterFlowSchedulerStructure) this.WinterFlowHookDataSource).WinterFlowConsumerUserManager(winterFlowObjectSystem2.WinterFlowCacheManagerAgent, winterFlowProxyService, winterFlowObjectSystem2.WinterFlowSyntax, true);
                    if (!winterFlowProxyService.WinterFlowVariableVersionControl.WinterFlowRouterRouter()) {
                        winterFlowParserVersionControl.WinterFlowRouterStructure(winterFlowObjectSystem2.WinterFlowRouterStructure, winterFlowProxyService, WinterFlowCacheRuntime.WinterFlowRouterRouter(winterFlowObjectSystem2));
                        winterFlowProxyService.clear();
                    }
                }
            }
            boolean WinterFlowHookDataSource = winterFlowParserVersionControl.WinterFlowHookDataSource(WinterFlowOrchestrationSubsystem, z);
            if (!WinterFlowOrchestrationSubsystem.WinterFlowRouterStructure) {
                int WinterFlowTransactionManagerStrategy3 = winterFlowDatabaseRenderer.WinterFlowTransactionManagerStrategy();
                for (int i5 = 0; i5 < WinterFlowTransactionManagerStrategy3; i5++) {
                    WinterFlowObjectSystem winterFlowObjectSystem3 = (WinterFlowObjectSystem) winterFlowDatabaseRenderer.WinterFlowUnitTestResponse(i5);
                    if (!WinterFlowHandlerResolver.WinterFlowHookDataSource(WinterFlowCacheRuntime.WinterFlowCloudMicroservice(winterFlowObjectSystem3, true), 0L) && winterFlowObjectSystem3.WinterFlowHookDataSource()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int WinterFlowTransactionManagerStrategy4 = winterFlowDatabaseRenderer.WinterFlowTransactionManagerStrategy();
            int i6 = 0;
            while (true) {
                if (i6 >= WinterFlowTransactionManagerStrategy4) {
                    i2 = 0;
                    break;
                }
                if (((WinterFlowObjectSystem) winterFlowDatabaseRenderer.WinterFlowUnitTestResponse(i6)).WinterFlowHookDataSource()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (WinterFlowHookDataSource ? 1 : 0) | (i << 1) | (i2 << 2);
            this.WinterFlowRouterStructure = false;
            return i7;
        } catch (Throwable th) {
            this.WinterFlowRouterStructure = false;
            throw th;
        }
    }
}
