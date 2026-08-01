package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestTool extends WinterFlowModuleSubsystem implements Iterable, WinterFlowLoaderProcess {
    public final float WinterFlowResponseEngine;
    public final float WinterFlowRouterRouter;
    public final float WinterFlowServerProtocol;
    public final ArrayList WinterFlowServiceUtility;
    public final float WinterFlowSyntax;
    public final List WinterFlowThreadListener;
    public final float WinterFlowTransactionAgent;
    public final float WinterFlowTransactionManagerStrategy;
    public final float WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowRequestTool(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = f;
        this.WinterFlowUnitTestResponse = f2;
        this.WinterFlowRouterRouter = f3;
        this.WinterFlowSyntax = f4;
        this.WinterFlowResponseEngine = f5;
        this.WinterFlowTransactionAgent = f6;
        this.WinterFlowServerProtocol = f7;
        this.WinterFlowThreadListener = list;
        this.WinterFlowServiceUtility = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WinterFlowRequestTool)) {
            return false;
        }
        WinterFlowRequestTool winterFlowRequestTool = (WinterFlowRequestTool) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowRequestTool.WinterFlowVariableVersionControl) && this.WinterFlowTransactionManagerStrategy == winterFlowRequestTool.WinterFlowTransactionManagerStrategy && this.WinterFlowUnitTestResponse == winterFlowRequestTool.WinterFlowUnitTestResponse && this.WinterFlowRouterRouter == winterFlowRequestTool.WinterFlowRouterRouter && this.WinterFlowSyntax == winterFlowRequestTool.WinterFlowSyntax && this.WinterFlowResponseEngine == winterFlowRequestTool.WinterFlowResponseEngine && this.WinterFlowTransactionAgent == winterFlowRequestTool.WinterFlowTransactionAgent && this.WinterFlowServerProtocol == winterFlowRequestTool.WinterFlowServerProtocol && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowThreadListener, winterFlowRequestTool.WinterFlowThreadListener) && this.WinterFlowServiceUtility.equals(winterFlowRequestTool.WinterFlowServiceUtility);
    }

    public final int hashCode() {
        return this.WinterFlowServiceUtility.hashCode() + ((this.WinterFlowThreadListener.hashCode() + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowServerProtocol, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowTransactionAgent, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowResponseEngine, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowSyntax, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowRouterRouter, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowUnitTestResponse, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowTransactionManagerStrategy, this.WinterFlowVariableVersionControl.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowResolverPlatform(this);
    }
}
