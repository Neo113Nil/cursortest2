package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererNode implements WinterFlowCloudCache, Serializable {
    public volatile Object WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public WinterFlowObjectUI WinterFlowVariableVersionControl;

    public WinterFlowRendererNode(WinterFlowObjectUI winterFlowObjectUI) {
        winterFlowObjectUI.getClass();
        this.WinterFlowVariableVersionControl = winterFlowObjectUI;
        this.WinterFlowTransactionManagerStrategy = WinterFlowCacheUtility.WinterFlowCompilerHandler;
        this.WinterFlowUnitTestResponse = this;
    }

    @Override // com.google.android.datatransport.WinterFlowCloudCache
    public final Object getValue() {
        Object obj;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowCompilerHandler;
        if (obj2 != winterFlowCacheUtility) {
            return obj2;
        }
        synchronized (this.WinterFlowUnitTestResponse) {
            obj = this.WinterFlowTransactionManagerStrategy;
            if (obj == winterFlowCacheUtility) {
                WinterFlowObjectUI winterFlowObjectUI = this.WinterFlowVariableVersionControl;
                winterFlowObjectUI.getClass();
                obj = winterFlowObjectUI.WinterFlowRouterStructure();
                this.WinterFlowTransactionManagerStrategy = obj;
                this.WinterFlowVariableVersionControl = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.WinterFlowTransactionManagerStrategy != WinterFlowCacheUtility.WinterFlowCompilerHandler ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
