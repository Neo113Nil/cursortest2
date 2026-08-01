package com.google.android.datatransport;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeploymentProcessor implements WinterFlowCloudCache, Serializable {
    public static final AtomicReferenceFieldUpdater WinterFlowUnitTestResponse = AtomicReferenceFieldUpdater.newUpdater(WinterFlowDeploymentProcessor.class, Object.class, "WinterFlowTransactionManagerStrategy");
    public volatile Object WinterFlowTransactionManagerStrategy;
    public volatile WinterFlowObjectUI WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowCloudCache
    public final Object getValue() {
        Object obj = this.WinterFlowTransactionManagerStrategy;
        WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowCompilerHandler;
        if (obj != winterFlowCacheUtility) {
            return obj;
        }
        WinterFlowObjectUI winterFlowObjectUI = this.WinterFlowVariableVersionControl;
        if (winterFlowObjectUI != null) {
            Object WinterFlowRouterStructure = winterFlowObjectUI.WinterFlowRouterStructure();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WinterFlowUnitTestResponse;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, winterFlowCacheUtility, WinterFlowRouterStructure)) {
                if (atomicReferenceFieldUpdater.get(this) != winterFlowCacheUtility) {
                }
            }
            this.WinterFlowVariableVersionControl = null;
            return WinterFlowRouterStructure;
        }
        return this.WinterFlowTransactionManagerStrategy;
    }

    public final String toString() {
        return this.WinterFlowTransactionManagerStrategy != WinterFlowCacheUtility.WinterFlowCompilerHandler ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
