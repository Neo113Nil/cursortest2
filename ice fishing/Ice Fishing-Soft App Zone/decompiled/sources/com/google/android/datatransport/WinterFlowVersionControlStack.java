package com.google.android.datatransport;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlStack {
    public EdgeEffect WinterFlowArrayNetwork;
    public long WinterFlowCacheManagerAgent = 0;
    public final int WinterFlowHookDataSource;
    public EdgeEffect WinterFlowResponseEngine;
    public EdgeEffect WinterFlowRouterRouter;
    public final Context WinterFlowRouterStructure;
    public EdgeEffect WinterFlowSyntax;
    public EdgeEffect WinterFlowTransactionAgent;
    public EdgeEffect WinterFlowTransactionManagerStrategy;
    public EdgeEffect WinterFlowUnitTestResponse;
    public EdgeEffect WinterFlowVariableVersionControl;

    public WinterFlowVersionControlStack(Context context, int i) {
        this.WinterFlowRouterStructure = context;
        this.WinterFlowHookDataSource = i;
    }

    public static boolean WinterFlowTransactionManagerStrategy(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean WinterFlowUnitTestResponse(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? WinterFlowProtocolDecorator.WinterFlowArrayNetwork(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect WinterFlowArrayNetwork() {
        EdgeEffect edgeEffect = this.WinterFlowUnitTestResponse;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect WinterFlowRouterStructure = WinterFlowRouterStructure(WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy);
        this.WinterFlowUnitTestResponse = WinterFlowRouterStructure;
        return WinterFlowRouterStructure;
    }

    public final EdgeEffect WinterFlowCacheManagerAgent() {
        EdgeEffect edgeEffect = this.WinterFlowTransactionManagerStrategy;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect WinterFlowRouterStructure = WinterFlowRouterStructure(WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy);
        this.WinterFlowTransactionManagerStrategy = WinterFlowRouterStructure;
        return WinterFlowRouterStructure;
    }

    public final EdgeEffect WinterFlowHookDataSource() {
        EdgeEffect edgeEffect = this.WinterFlowVariableVersionControl;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect WinterFlowRouterStructure = WinterFlowRouterStructure(WinterFlowBackendBatch.WinterFlowVariableVersionControl);
        this.WinterFlowVariableVersionControl = WinterFlowRouterStructure;
        return WinterFlowRouterStructure;
    }

    public final EdgeEffect WinterFlowRouterStructure(WinterFlowBackendBatch winterFlowBackendBatch) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.WinterFlowRouterStructure;
        EdgeEffect WinterFlowRouterStructure = i >= 31 ? WinterFlowProtocolDecorator.WinterFlowRouterStructure(context) : new WinterFlowRendererHandler(context);
        WinterFlowRouterStructure.setColor(this.WinterFlowHookDataSource);
        if (!WinterFlowJavaEntity.WinterFlowRouterStructure(this.WinterFlowCacheManagerAgent, 0L)) {
            long j = this.WinterFlowCacheManagerAgent;
            if (winterFlowBackendBatch == WinterFlowBackendBatch.WinterFlowVariableVersionControl) {
                WinterFlowRouterStructure.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return WinterFlowRouterStructure;
            }
            WinterFlowRouterStructure.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return WinterFlowRouterStructure;
    }

    public final EdgeEffect WinterFlowVariableVersionControl() {
        EdgeEffect edgeEffect = this.WinterFlowArrayNetwork;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect WinterFlowRouterStructure = WinterFlowRouterStructure(WinterFlowBackendBatch.WinterFlowVariableVersionControl);
        this.WinterFlowArrayNetwork = WinterFlowRouterStructure;
        return WinterFlowRouterStructure;
    }
}
