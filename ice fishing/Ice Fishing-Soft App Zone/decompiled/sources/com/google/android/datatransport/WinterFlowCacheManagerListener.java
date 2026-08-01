package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerListener extends WinterFlowWidgetFramework {
    public static final WinterFlowCacheManagerListener WinterFlowRouterRouter = new WinterFlowCacheManagerListener(1, 0, 1);

    @Override // com.google.android.datatransport.WinterFlowWidgetFramework
    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowCacheManagerListener)) {
            return false;
        }
        if (isEmpty() && ((WinterFlowCacheManagerListener) obj).isEmpty()) {
            return true;
        }
        WinterFlowCacheManagerListener winterFlowCacheManagerListener = (WinterFlowCacheManagerListener) obj;
        return this.WinterFlowVariableVersionControl == winterFlowCacheManagerListener.WinterFlowVariableVersionControl && this.WinterFlowTransactionManagerStrategy == winterFlowCacheManagerListener.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetFramework
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.WinterFlowVariableVersionControl * 31) + this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetFramework
    public final boolean isEmpty() {
        return this.WinterFlowVariableVersionControl > this.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetFramework
    public final String toString() {
        return this.WinterFlowVariableVersionControl + ".." + this.WinterFlowTransactionManagerStrategy;
    }
}
