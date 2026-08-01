package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowStackEngine {
    public WinterFlowEventEvent WinterFlowArrayNetwork;
    public WinterFlowDatabaseSchemaHandler WinterFlowCacheManagerAgent;
    public int WinterFlowHookDataSource;
    public WinterFlowTransactionBackend WinterFlowRouterStructure;
    public WinterFlowLibraryCache WinterFlowTransactionManagerStrategy;
    public WinterFlowDatabaseSchemaStructure WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public WinterFlowStackEngine(WinterFlowTransactionBackend winterFlowTransactionBackend) {
        this.WinterFlowRouterStructure = winterFlowTransactionBackend;
    }

    public final void WinterFlowArrayNetwork(boolean z) {
        int i = this.WinterFlowHookDataSource;
        this.WinterFlowHookDataSource = z ? i | 32 : i & (-33);
    }

    public final void WinterFlowCacheManagerAgent() {
        WinterFlowTransactionBackend winterFlowTransactionBackend = this.WinterFlowRouterStructure;
        if (winterFlowTransactionBackend != null) {
            winterFlowTransactionBackend.WinterFlowVariableBandwidth = true;
            winterFlowTransactionBackend.WinterFlowResolverController.WinterFlowRouterRouter();
        }
        this.WinterFlowRouterStructure = null;
        this.WinterFlowTransactionManagerStrategy = null;
        this.WinterFlowUnitTestResponse = null;
        this.WinterFlowArrayNetwork = null;
    }

    public final WinterFlowRouterHandler WinterFlowHookDataSource(Object obj) {
        WinterFlowRouterHandler WinterFlowVariableBandwidth;
        WinterFlowTransactionBackend winterFlowTransactionBackend = this.WinterFlowRouterStructure;
        return (winterFlowTransactionBackend == null || (WinterFlowVariableBandwidth = winterFlowTransactionBackend.WinterFlowVariableBandwidth(this, obj)) == null) ? WinterFlowRouterHandler.WinterFlowVariableVersionControl : WinterFlowVariableBandwidth;
    }

    public final boolean WinterFlowRouterStructure() {
        if (this.WinterFlowRouterStructure != null) {
            WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = this.WinterFlowCacheManagerAgent;
            if (winterFlowDatabaseSchemaHandler != null ? winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure() : false) {
                return true;
            }
        }
        return false;
    }
}
