package com.google.android.datatransport;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositorySerializer extends WinterFlowUserManagerMapper {
    public final WindowInsetsAnimation WinterFlowVariableVersionControl;

    public WinterFlowRepositorySerializer(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.WinterFlowVariableVersionControl = windowInsetsAnimation;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerMapper
    public final int WinterFlowArrayNetwork() {
        int typeMask;
        typeMask = this.WinterFlowVariableVersionControl.getTypeMask();
        return typeMask;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerMapper
    public final float WinterFlowCacheManagerAgent() {
        float interpolatedFraction;
        interpolatedFraction = this.WinterFlowVariableVersionControl.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerMapper
    public final long WinterFlowHookDataSource() {
        long durationMillis;
        durationMillis = this.WinterFlowVariableVersionControl.getDurationMillis();
        return durationMillis;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerMapper
    public final float WinterFlowRouterStructure() {
        float alpha;
        alpha = this.WinterFlowVariableVersionControl.getAlpha();
        return alpha;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerMapper
    public final void WinterFlowVariableVersionControl(float f) {
        this.WinterFlowVariableVersionControl.setFraction(f);
    }
}
