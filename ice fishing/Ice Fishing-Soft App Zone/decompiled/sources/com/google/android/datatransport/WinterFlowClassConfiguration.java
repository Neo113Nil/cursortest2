package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassConfiguration extends WinterFlowServiceProviderTool {
    public final float WinterFlowCacheManagerAgent;

    public WinterFlowClassConfiguration(float f) {
        super(3);
        this.WinterFlowCacheManagerAgent = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowClassConfiguration) && Float.compare(this.WinterFlowCacheManagerAgent, ((WinterFlowClassConfiguration) obj).WinterFlowCacheManagerAgent) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowCacheManagerAgent);
    }

    public final String toString() {
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(new StringBuilder("HorizontalTo(x="), this.WinterFlowCacheManagerAgent, ')');
    }
}
