package com.google.android.datatransport;

import android.content.Context;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonStack {
    public final WinterFlowExceptionXML WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final WinterFlowConcurrencyParser WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;

    public WinterFlowSingletonStack(Context context, WinterFlowConcurrencyParser winterFlowConcurrencyParser, long j, WinterFlowExceptionXML winterFlowExceptionXML) {
        this.WinterFlowRouterStructure = context;
        this.WinterFlowHookDataSource = winterFlowConcurrencyParser;
        this.WinterFlowCacheManagerAgent = j;
        this.WinterFlowArrayNetwork = winterFlowExceptionXML;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WinterFlowSingletonStack.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        WinterFlowSingletonStack winterFlowSingletonStack = (WinterFlowSingletonStack) obj;
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowSingletonStack.WinterFlowRouterStructure) || !WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowSingletonStack.WinterFlowHookDataSource)) {
            return false;
        }
        long j = winterFlowSingletonStack.WinterFlowCacheManagerAgent;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowCacheManagerAgent, j) && this.WinterFlowArrayNetwork.equals(winterFlowSingletonStack.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        int hashCode = (this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return this.WinterFlowArrayNetwork.hashCode() + WinterFlowResolverBackend.WinterFlowVariableVersionControl(hashCode, 31, this.WinterFlowCacheManagerAgent);
    }
}
