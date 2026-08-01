package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRouterSystem {
    public final WinterFlowLoaderHandler WinterFlowArrayNetwork;
    public final WinterFlowLoaderHandler WinterFlowCacheManagerAgent;
    public final WinterFlowLoaderHandler WinterFlowHookDataSource;
    public final WinterFlowLoaderHandler WinterFlowRouterRouter;
    public final WinterFlowLoaderHandler WinterFlowRouterStructure;
    public final WinterFlowLoaderHandler WinterFlowTransactionManagerStrategy;
    public final WinterFlowLoaderHandler WinterFlowUnitTestResponse;
    public final WinterFlowLoaderHandler WinterFlowVariableVersionControl;

    public WinterFlowRouterSystem() {
        WinterFlowLoaderHandler winterFlowLoaderHandler = WinterFlowDatabaseListener.WinterFlowRouterStructure;
        WinterFlowLoaderHandler winterFlowLoaderHandler2 = WinterFlowDatabaseListener.WinterFlowHookDataSource;
        WinterFlowLoaderHandler winterFlowLoaderHandler3 = WinterFlowDatabaseListener.WinterFlowCacheManagerAgent;
        WinterFlowLoaderHandler winterFlowLoaderHandler4 = WinterFlowDatabaseListener.WinterFlowArrayNetwork;
        WinterFlowLoaderHandler winterFlowLoaderHandler5 = WinterFlowDatabaseListener.WinterFlowTransactionManagerStrategy;
        WinterFlowLoaderHandler winterFlowLoaderHandler6 = WinterFlowDatabaseListener.WinterFlowVariableVersionControl;
        WinterFlowLoaderHandler winterFlowLoaderHandler7 = WinterFlowDatabaseListener.WinterFlowUnitTestResponse;
        WinterFlowLoaderHandler winterFlowLoaderHandler8 = WinterFlowDatabaseListener.WinterFlowRouterRouter;
        this.WinterFlowRouterStructure = winterFlowLoaderHandler;
        this.WinterFlowHookDataSource = winterFlowLoaderHandler2;
        this.WinterFlowCacheManagerAgent = winterFlowLoaderHandler3;
        this.WinterFlowArrayNetwork = winterFlowLoaderHandler4;
        this.WinterFlowVariableVersionControl = winterFlowLoaderHandler5;
        this.WinterFlowTransactionManagerStrategy = winterFlowLoaderHandler6;
        this.WinterFlowUnitTestResponse = winterFlowLoaderHandler7;
        this.WinterFlowRouterRouter = winterFlowLoaderHandler8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRouterSystem)) {
            return false;
        }
        WinterFlowRouterSystem winterFlowRouterSystem = (WinterFlowRouterSystem) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowRouterSystem.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowRouterSystem.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowRouterSystem.WinterFlowCacheManagerAgent) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowRouterSystem.WinterFlowArrayNetwork) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowRouterSystem.WinterFlowVariableVersionControl) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowRouterSystem.WinterFlowTransactionManagerStrategy) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowUnitTestResponse, winterFlowRouterSystem.WinterFlowUnitTestResponse) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterRouter, winterFlowRouterSystem.WinterFlowRouterRouter);
    }

    public final int hashCode() {
        return this.WinterFlowRouterRouter.hashCode() + ((this.WinterFlowUnitTestResponse.hashCode() + ((this.WinterFlowTransactionManagerStrategy.hashCode() + ((this.WinterFlowVariableVersionControl.hashCode() + ((this.WinterFlowArrayNetwork.hashCode() + ((this.WinterFlowCacheManagerAgent.hashCode() + ((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.WinterFlowRouterStructure + ", small=" + this.WinterFlowHookDataSource + ", medium=" + this.WinterFlowCacheManagerAgent + ", large=" + this.WinterFlowArrayNetwork + ", largeIncreased=" + this.WinterFlowTransactionManagerStrategy + ", extraLarge=" + this.WinterFlowVariableVersionControl + ", extralargeIncreased=" + this.WinterFlowUnitTestResponse + ", extraExtraLarge=" + this.WinterFlowRouterRouter + ')';
    }
}
