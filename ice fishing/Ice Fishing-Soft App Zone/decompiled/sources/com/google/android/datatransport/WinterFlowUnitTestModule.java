package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestModule extends WinterFlowServiceProviderTool {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;

    public WinterFlowUnitTestModule(float f, float f2) {
        super(3);
        this.WinterFlowCacheManagerAgent = f;
        this.WinterFlowArrayNetwork = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowUnitTestModule)) {
            return false;
        }
        WinterFlowUnitTestModule winterFlowUnitTestModule = (WinterFlowUnitTestModule) obj;
        return Float.compare(this.WinterFlowCacheManagerAgent, winterFlowUnitTestModule.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowUnitTestModule.WinterFlowArrayNetwork) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowArrayNetwork) + (Float.hashCode(this.WinterFlowCacheManagerAgent) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", y=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowArrayNetwork, ')');
    }
}
