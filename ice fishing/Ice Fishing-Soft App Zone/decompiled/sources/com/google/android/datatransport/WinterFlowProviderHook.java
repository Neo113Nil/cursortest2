package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderHook extends WinterFlowTestingCloud {
    public final long WinterFlowServiceUtility;
    public final Object WinterFlowThreadListener;

    public WinterFlowProviderHook(long j, Object obj) {
        this.WinterFlowThreadListener = obj;
        this.WinterFlowServiceUtility = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowProviderHook)) {
            return false;
        }
        WinterFlowProviderHook winterFlowProviderHook = (WinterFlowProviderHook) obj;
        return this.WinterFlowThreadListener.equals(winterFlowProviderHook.WinterFlowThreadListener) && this.WinterFlowServiceUtility == winterFlowProviderHook.WinterFlowServiceUtility;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowServiceUtility) + (this.WinterFlowThreadListener.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.WinterFlowThreadListener + ", compositeKey=" + this.WinterFlowServiceUtility + ')';
    }
}
