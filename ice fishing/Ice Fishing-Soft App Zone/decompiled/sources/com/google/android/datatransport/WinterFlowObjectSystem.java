package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectSystem {
    public final boolean WinterFlowArrayNetwork;
    public boolean WinterFlowBandwidthObject;
    public final long WinterFlowCacheManagerAgent;
    public WinterFlowObjectSystem WinterFlowConcurrencyThread;
    public final long WinterFlowHookDataSource;
    public boolean WinterFlowOrchestrationSubsystem;
    public final long WinterFlowResponseEngine;
    public final boolean WinterFlowRouterRouter;
    public final long WinterFlowRouterStructure;
    public final long WinterFlowServerProtocol;
    public final long WinterFlowServiceUtility;
    public final int WinterFlowSyntax;
    public final ArrayList WinterFlowThreadListener;
    public final float WinterFlowTransactionAgent;
    public final long WinterFlowTransactionManagerStrategy;
    public final long WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;

    public WinterFlowObjectSystem(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = j3;
        this.WinterFlowArrayNetwork = z;
        this.WinterFlowVariableVersionControl = f;
        this.WinterFlowTransactionManagerStrategy = j4;
        this.WinterFlowUnitTestResponse = j5;
        this.WinterFlowRouterRouter = z2;
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = j6;
        this.WinterFlowTransactionAgent = f2;
        this.WinterFlowServerProtocol = j7;
        this.WinterFlowServiceUtility = 0L;
        this.WinterFlowBandwidthObject = z3;
        this.WinterFlowOrchestrationSubsystem = z3;
    }

    public final boolean WinterFlowHookDataSource() {
        WinterFlowObjectSystem winterFlowObjectSystem = this.WinterFlowConcurrencyThread;
        return winterFlowObjectSystem != null ? winterFlowObjectSystem.WinterFlowHookDataSource() : this.WinterFlowBandwidthObject || this.WinterFlowOrchestrationSubsystem;
    }

    public final void WinterFlowRouterStructure() {
        WinterFlowObjectSystem winterFlowObjectSystem = this.WinterFlowConcurrencyThread;
        if (winterFlowObjectSystem == null) {
            this.WinterFlowBandwidthObject = true;
            this.WinterFlowOrchestrationSubsystem = true;
        } else if (winterFlowObjectSystem != null) {
            winterFlowObjectSystem.WinterFlowRouterStructure();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) WinterFlowServerManager.WinterFlowSoftwareEngine(this.WinterFlowRouterStructure));
        sb.append(", uptimeMillis=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", position=");
        sb.append((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowCacheManagerAgent));
        sb.append(", pressed=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", pressure=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", previousUptimeMillis=");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append(", previousPosition=");
        sb.append((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowUnitTestResponse));
        sb.append(", previousPressed=");
        sb.append(this.WinterFlowRouterRouter);
        sb.append(", isConsumed=");
        sb.append(WinterFlowHookDataSource());
        sb.append(", type=");
        sb.append((Object) WinterFlowDeploymentValidator.WinterFlowRouterStructure(this.WinterFlowSyntax));
        sb.append(", historical=");
        Object obj = this.WinterFlowThreadListener;
        if (obj == null) {
            obj = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowResponseEngine));
        sb.append(", scaleFactor=");
        sb.append(this.WinterFlowTransactionAgent);
        sb.append(", panOffset=");
        sb.append((Object) WinterFlowHandlerResolver.WinterFlowUnitTestResponse(this.WinterFlowServerProtocol));
        sb.append(')');
        return sb.toString();
    }

    public WinterFlowObjectSystem(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.WinterFlowThreadListener = arrayList;
        this.WinterFlowServiceUtility = j8;
    }
}
