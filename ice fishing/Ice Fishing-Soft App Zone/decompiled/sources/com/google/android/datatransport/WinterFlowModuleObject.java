package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleObject {
    public final int WinterFlowArrayNetwork;
    public final List WinterFlowCacheManagerAgent;
    public final WinterFlowEncryptionServer WinterFlowHookDataSource;
    public final long WinterFlowResponseEngine;
    public final WinterFlowCacheManagerConfiguration WinterFlowRouterRouter;
    public final WinterFlowCompilerStructure WinterFlowRouterStructure;
    public final WinterFlowDatabaseGateway WinterFlowSyntax;
    public final int WinterFlowTransactionManagerStrategy;
    public final WinterFlowConcurrencyParser WinterFlowUnitTestResponse;
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowModuleObject(WinterFlowCompilerStructure winterFlowCompilerStructure, WinterFlowEncryptionServer winterFlowEncryptionServer, List list, int i, boolean z, int i2, WinterFlowConcurrencyParser winterFlowConcurrencyParser, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowDatabaseGateway winterFlowDatabaseGateway, long j) {
        this.WinterFlowRouterStructure = winterFlowCompilerStructure;
        this.WinterFlowHookDataSource = winterFlowEncryptionServer;
        this.WinterFlowCacheManagerAgent = list;
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = z;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = winterFlowConcurrencyParser;
        this.WinterFlowRouterRouter = winterFlowCacheManagerConfiguration;
        this.WinterFlowSyntax = winterFlowDatabaseGateway;
        this.WinterFlowResponseEngine = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowModuleObject)) {
            return false;
        }
        WinterFlowModuleObject winterFlowModuleObject = (WinterFlowModuleObject) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowModuleObject.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowModuleObject.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent.equals(winterFlowModuleObject.WinterFlowCacheManagerAgent) && this.WinterFlowArrayNetwork == winterFlowModuleObject.WinterFlowArrayNetwork && this.WinterFlowVariableVersionControl == winterFlowModuleObject.WinterFlowVariableVersionControl && this.WinterFlowTransactionManagerStrategy == winterFlowModuleObject.WinterFlowTransactionManagerStrategy && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowUnitTestResponse, winterFlowModuleObject.WinterFlowUnitTestResponse) && this.WinterFlowRouterRouter == winterFlowModuleObject.WinterFlowRouterRouter && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowSyntax, winterFlowModuleObject.WinterFlowSyntax) && WinterFlowHandlerConsumer.WinterFlowHookDataSource(this.WinterFlowResponseEngine, winterFlowModuleObject.WinterFlowResponseEngine);
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowResponseEngine) + ((this.WinterFlowSyntax.hashCode() + ((this.WinterFlowRouterRouter.hashCode() + ((this.WinterFlowUnitTestResponse.hashCode() + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowTransactionManagerStrategy, WinterFlowSingletonMapper.WinterFlowRouterStructure((((this.WinterFlowCacheManagerAgent.hashCode() + WinterFlowResolverBackend.WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, this.WinterFlowRouterStructure.hashCode() * 31, 31)) * 31) + this.WinterFlowArrayNetwork) * 31, 31, this.WinterFlowVariableVersionControl), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.WinterFlowRouterStructure);
        sb.append(", style=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", placeholders=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", maxLines=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", softWrap=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", overflow=");
        int i = this.WinterFlowTransactionManagerStrategy;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append(", layoutDirection=");
        sb.append(this.WinterFlowRouterRouter);
        sb.append(", fontFamilyResolver=");
        sb.append(this.WinterFlowSyntax);
        sb.append(", constraints=");
        sb.append((Object) WinterFlowHandlerConsumer.WinterFlowTransactionAgent(this.WinterFlowResponseEngine));
        sb.append(')');
        return sb.toString();
    }
}
