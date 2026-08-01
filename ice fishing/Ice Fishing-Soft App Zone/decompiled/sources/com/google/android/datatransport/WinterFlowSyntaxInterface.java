package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxInterface extends WinterFlowServiceProviderTool {
    public final float WinterFlowArrayNetwork;
    public final float WinterFlowCacheManagerAgent;

    public WinterFlowSyntaxInterface(float f, float f2) {
        super(1);
        this.WinterFlowCacheManagerAgent = f;
        this.WinterFlowArrayNetwork = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowSyntaxInterface)) {
            return false;
        }
        WinterFlowSyntaxInterface winterFlowSyntaxInterface = (WinterFlowSyntaxInterface) obj;
        return Float.compare(this.WinterFlowCacheManagerAgent, winterFlowSyntaxInterface.WinterFlowCacheManagerAgent) == 0 && Float.compare(this.WinterFlowArrayNetwork, winterFlowSyntaxInterface.WinterFlowArrayNetwork) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowArrayNetwork) + (Float.hashCode(this.WinterFlowCacheManagerAgent) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", y=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowArrayNetwork, ')');
    }
}
