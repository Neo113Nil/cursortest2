package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPipelineSession implements WinterFlowCloudCache, Serializable {
    public Object WinterFlowTransactionManagerStrategy;
    public WinterFlowObjectUI WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowCloudCache
    public final Object getValue() {
        Object obj = this.WinterFlowTransactionManagerStrategy;
        if (obj != WinterFlowCacheUtility.WinterFlowCompilerHandler) {
            return obj;
        }
        WinterFlowObjectUI winterFlowObjectUI = this.WinterFlowVariableVersionControl;
        winterFlowObjectUI.getClass();
        Object WinterFlowRouterStructure = winterFlowObjectUI.WinterFlowRouterStructure();
        this.WinterFlowTransactionManagerStrategy = WinterFlowRouterStructure;
        this.WinterFlowVariableVersionControl = null;
        return WinterFlowRouterStructure;
    }

    public final String toString() {
        return this.WinterFlowTransactionManagerStrategy != WinterFlowCacheUtility.WinterFlowCompilerHandler ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
