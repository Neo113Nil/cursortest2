package com.google.android.datatransport;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBackendOrchestration extends CharacterStyle {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowBackendOrchestration(int i, float f, float f2, float f3) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = f;
        this.WinterFlowCacheManagerAgent = f2;
        this.WinterFlowArrayNetwork = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.WinterFlowArrayNetwork, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent, this.WinterFlowRouterStructure);
    }
}
