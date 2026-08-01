package com.google.android.datatransport;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowUserManagerMapper {
    public final long WinterFlowArrayNetwork;
    public final Interpolator WinterFlowCacheManagerAgent;
    public float WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowUserManagerMapper(int i, Interpolator interpolator, long j) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowCacheManagerAgent = interpolator;
        this.WinterFlowArrayNetwork = j;
    }

    public int WinterFlowArrayNetwork() {
        return this.WinterFlowRouterStructure;
    }

    public float WinterFlowCacheManagerAgent() {
        float f = this.WinterFlowHookDataSource;
        Interpolator interpolator = this.WinterFlowCacheManagerAgent;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public long WinterFlowHookDataSource() {
        return this.WinterFlowArrayNetwork;
    }

    public float WinterFlowRouterStructure() {
        return 1.0f;
    }

    public void WinterFlowVariableVersionControl(float f) {
        this.WinterFlowHookDataSource = f;
    }
}
