package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseServer {
    public int WinterFlowArrayNetwork;
    public final WinterFlowServiceFrontend WinterFlowHookDataSource;
    public final Object WinterFlowRouterStructure;
    public boolean WinterFlowTransactionManagerStrategy;
    public WinterFlowDatabaseServer WinterFlowVariableVersionControl;
    public int WinterFlowCacheManagerAgent = -1;
    public final WinterFlowResolverSubsystem WinterFlowUnitTestResponse = WinterFlowDecoratorUI.WinterFlowSerializerStructure(null);

    public WinterFlowDatabaseServer(Object obj, WinterFlowServiceFrontend winterFlowServiceFrontend) {
        this.WinterFlowRouterStructure = obj;
        this.WinterFlowHookDataSource = winterFlowServiceFrontend;
    }

    public final void WinterFlowHookDataSource() {
        if (this.WinterFlowTransactionManagerStrategy) {
            return;
        }
        if (this.WinterFlowArrayNetwork <= 0) {
            WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("Release should only be called once");
        }
        int i = this.WinterFlowArrayNetwork - 1;
        this.WinterFlowArrayNetwork = i;
        if (i == 0) {
            this.WinterFlowHookDataSource.WinterFlowVariableVersionControl.remove(this);
            WinterFlowDatabaseServer winterFlowDatabaseServer = this.WinterFlowVariableVersionControl;
            if (winterFlowDatabaseServer != null) {
                winterFlowDatabaseServer.WinterFlowHookDataSource();
            }
            this.WinterFlowVariableVersionControl = null;
        }
    }

    public final WinterFlowDatabaseServer WinterFlowRouterStructure() {
        if (this.WinterFlowTransactionManagerStrategy) {
            WinterFlowValidatorConsumer.WinterFlowCacheManagerAgent("Pin should not be called on an already disposed item ");
        }
        if (this.WinterFlowArrayNetwork == 0) {
            this.WinterFlowHookDataSource.WinterFlowVariableVersionControl.add(this);
            WinterFlowDatabaseServer winterFlowDatabaseServer = (WinterFlowDatabaseServer) this.WinterFlowUnitTestResponse.getValue();
            if (winterFlowDatabaseServer != null) {
                winterFlowDatabaseServer.WinterFlowRouterStructure();
            } else {
                winterFlowDatabaseServer = null;
            }
            this.WinterFlowVariableVersionControl = winterFlowDatabaseServer;
        }
        this.WinterFlowArrayNetwork++;
        return this;
    }
}
