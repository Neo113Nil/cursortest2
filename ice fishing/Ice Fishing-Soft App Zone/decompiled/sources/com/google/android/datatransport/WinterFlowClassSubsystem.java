package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassSubsystem {
    public final long WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowResponseEngine;
    public final boolean WinterFlowRouterRouter;
    public final long WinterFlowRouterStructure;
    public final long WinterFlowServerProtocol;
    public final ArrayList WinterFlowSyntax;
    public final long WinterFlowThreadListener;
    public final float WinterFlowTransactionAgent;
    public final float WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowClassSubsystem(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = j3;
        this.WinterFlowArrayNetwork = j4;
        this.WinterFlowVariableVersionControl = z;
        this.WinterFlowTransactionManagerStrategy = f;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = z2;
        this.WinterFlowSyntax = arrayList;
        this.WinterFlowResponseEngine = j5;
        this.WinterFlowTransactionAgent = f2;
        this.WinterFlowServerProtocol = j6;
        this.WinterFlowThreadListener = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowClassSubsystem)) {
            return false;
        }
        WinterFlowClassSubsystem winterFlowClassSubsystem = (WinterFlowClassSubsystem) obj;
        return WinterFlowServerManager.WinterFlowConcurrencyThread(this.WinterFlowRouterStructure, winterFlowClassSubsystem.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowClassSubsystem.WinterFlowHookDataSource && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowCacheManagerAgent, winterFlowClassSubsystem.WinterFlowCacheManagerAgent) && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowArrayNetwork, winterFlowClassSubsystem.WinterFlowArrayNetwork) && this.WinterFlowVariableVersionControl == winterFlowClassSubsystem.WinterFlowVariableVersionControl && Float.compare(this.WinterFlowTransactionManagerStrategy, winterFlowClassSubsystem.WinterFlowTransactionManagerStrategy) == 0 && this.WinterFlowUnitTestResponse == winterFlowClassSubsystem.WinterFlowUnitTestResponse && this.WinterFlowRouterRouter == winterFlowClassSubsystem.WinterFlowRouterRouter && this.WinterFlowSyntax.equals(winterFlowClassSubsystem.WinterFlowSyntax) && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowResponseEngine, winterFlowClassSubsystem.WinterFlowResponseEngine) && Float.compare(this.WinterFlowTransactionAgent, winterFlowClassSubsystem.WinterFlowTransactionAgent) == 0 && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowServerProtocol, winterFlowClassSubsystem.WinterFlowServerProtocol) && WinterFlowHandlerResolver.WinterFlowHookDataSource(this.WinterFlowThreadListener, winterFlowClassSubsystem.WinterFlowThreadListener);
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowThreadListener) + WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowTransactionAgent, WinterFlowResolverBackend.WinterFlowVariableVersionControl((this.WinterFlowSyntax.hashCode() + WinterFlowSingletonMapper.WinterFlowRouterStructure(WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowUnitTestResponse, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowTransactionManagerStrategy, WinterFlowSingletonMapper.WinterFlowRouterStructure(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(Long.hashCode(this.WinterFlowRouterStructure) * 31, 31, this.WinterFlowHookDataSource), 31, this.WinterFlowCacheManagerAgent), 31, this.WinterFlowArrayNetwork), 31, this.WinterFlowVariableVersionControl), 31), 31), 31, this.WinterFlowRouterRouter)) * 31, 31, this.WinterFlowResponseEngine), 31), 31, this.WinterFlowServerProtocol);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) WinterFlowServerManager.WinterFlowSoftwareEngine(this.WinterFlowRouterStructure)) + ", uptime=" + this.WinterFlowHookDataSource + ", positionOnScreen=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent)) + ", position=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowArrayNetwork)) + ", down=" + this.WinterFlowVariableVersionControl + ", pressure=" + this.WinterFlowTransactionManagerStrategy + ", type=" + ((Object) WinterFlowDeploymentValidator.WinterFlowRouterStructure(this.WinterFlowUnitTestResponse)) + ", activeHover=" + this.WinterFlowRouterRouter + ", historical=" + this.WinterFlowSyntax + ", scrollDelta=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowResponseEngine)) + ", scaleGestureFactor=" + this.WinterFlowTransactionAgent + ", panGestureOffset=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowServerProtocol)) + ", originalEventPosition=" + ((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowThreadListener)) + ')';
    }
}
