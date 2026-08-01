package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowInterfaceWorker extends WinterFlowServiceProviderTool {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;
    public final float WinterFlowTransactionManagerStrategy;
    public final float WinterFlowVariableVersionControl;

    public WinterFlowInterfaceWorker(float f, float f2, float f3, float f4) {
        super(2);
        this.WinterFlowCacheManagerAgent = f;
        this.WinterFlowArrayNetwork = f2;
        this.WinterFlowVariableVersionControl = f3;
        this.WinterFlowTransactionManagerStrategy = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowInterfaceWorker)) {
            return false;
        }
        WinterFlowInterfaceWorker winterFlowInterfaceWorker = (WinterFlowInterfaceWorker) obj;
        return Float.compare(this.WinterFlowCacheManagerAgent, winterFlowInterfaceWorker.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowInterfaceWorker.WinterFlowArrayNetwork) == 0 && Float.compare(this.WinterFlowVariableVersionControl, winterFlowInterfaceWorker.WinterFlowVariableVersionControl) == 0 && Float.compare(this.WinterFlowTransactionManagerStrategy, winterFlowInterfaceWorker.WinterFlowTransactionManagerStrategy) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowTransactionManagerStrategy) + WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl, WinterFlowResolverBackend.WinterFlowCacheManagerAgent(this.WinterFlowArrayNetwork, Float.hashCode(this.WinterFlowCacheManagerAgent) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", dy1=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", dx2=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", dy2=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowTransactionManagerStrategy, ')');
    }
}
