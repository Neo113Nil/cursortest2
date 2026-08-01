package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHookHelper extends WinterFlowPackageConsumer {
    public final WinterFlowCacheManagerTransactionManager WinterFlowArrayNetwork;
    public final ArrayList WinterFlowCacheManagerAgent;
    public final WinterFlowDatabaseSchemaStructure WinterFlowHookDataSource;
    public final WinterFlowExceptionBandwidth WinterFlowTransactionManagerStrategy;
    public final WinterFlowDatabaseSchemaStructure WinterFlowVariableVersionControl;

    public WinterFlowHookHelper() {
        super(3);
        this.WinterFlowHookDataSource = WinterFlowHookProcessor.WinterFlowRouterRouter();
        this.WinterFlowCacheManagerAgent = new ArrayList();
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        this.WinterFlowArrayNetwork = new WinterFlowCacheManagerTransactionManager();
        this.WinterFlowVariableVersionControl = new WinterFlowDatabaseSchemaStructure();
        WinterFlowSessionManagerSystem winterFlowSessionManagerSystem = new WinterFlowSessionManagerSystem(5, this);
        WinterFlowVersionProtocol.WinterFlowHookDataSource(WinterFlowVersionProtocol.WinterFlowRouterStructure);
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            WinterFlowVersionProtocol.WinterFlowRouterRouter = WinterFlowSerializerUtility.WinterFlowFunctionPipeline(WinterFlowVersionProtocol.WinterFlowRouterRouter, winterFlowSessionManagerSystem);
        }
        this.WinterFlowTransactionManagerStrategy = new WinterFlowExceptionBandwidth(6, winterFlowSessionManagerSystem);
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowArrayNetwork(WinterFlowInvokerPlatform winterFlowInvokerPlatform) {
        this.WinterFlowCacheManagerAgent.add(new WinterFlowQueryResolver(winterFlowInvokerPlatform));
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowBatchUI(WinterFlowFrameworkAgent winterFlowFrameworkAgent) {
        this.WinterFlowVariableVersionControl.WinterFlowTransactionAgent(winterFlowFrameworkAgent);
        WinterFlowArrayNetwork(winterFlowFrameworkAgent);
        WinterFlowVariableVersionControl();
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowTransactionManagerStrategy() {
        this.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl();
        this.WinterFlowCacheManagerAgent.clear();
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure();
        synchronized (this.WinterFlowRouterStructure) {
            this.WinterFlowHookDataSource.WinterFlowRouterStructure();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final WinterFlowObjectSession WinterFlowVariableBandwidth(WinterFlowInvokerPlatform winterFlowInvokerPlatform) {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowVariableVersionControl;
        WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowInvokerPlatform);
        if (winterFlowObjectSession == null) {
            winterFlowObjectSession = new WinterFlowRouterCompiler(17, this, winterFlowInvokerPlatform);
            int WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaStructure.WinterFlowTransactionManagerStrategy(winterFlowInvokerPlatform);
            if (WinterFlowTransactionManagerStrategy < 0) {
                WinterFlowTransactionManagerStrategy = ~WinterFlowTransactionManagerStrategy;
            }
            Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
            Object obj = objArr[WinterFlowTransactionManagerStrategy];
            winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[WinterFlowTransactionManagerStrategy] = winterFlowInvokerPlatform;
            objArr[WinterFlowTransactionManagerStrategy] = winterFlowObjectSession;
        }
        return winterFlowObjectSession;
    }

    @Override // com.google.android.datatransport.WinterFlowPackageConsumer
    public final void WinterFlowVariableVersionControl() {
        synchronized (this.WinterFlowRouterStructure) {
            try {
                ArrayList arrayList = this.WinterFlowCacheManagerAgent;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    WinterFlowLibraryHelper winterFlowLibraryHelper = (WinterFlowLibraryHelper) arrayList.get(i);
                    if (winterFlowLibraryHelper instanceof WinterFlowServerStack) {
                        WinterFlowHookProcessor.WinterFlowCacheManagerAgent(this.WinterFlowHookDataSource, ((WinterFlowServerStack) winterFlowLibraryHelper).WinterFlowRouterStructure, ((WinterFlowServerStack) winterFlowLibraryHelper).WinterFlowHookDataSource);
                    } else {
                        if (!(winterFlowLibraryHelper instanceof WinterFlowQueryResolver)) {
                            throw new WinterFlowServerSystem();
                        }
                        WinterFlowHookProcessor.WinterFlowOrchestrationSubsystem(this.WinterFlowHookDataSource, ((WinterFlowQueryResolver) winterFlowLibraryHelper).WinterFlowRouterStructure);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.WinterFlowCacheManagerAgent.clear();
    }
}
