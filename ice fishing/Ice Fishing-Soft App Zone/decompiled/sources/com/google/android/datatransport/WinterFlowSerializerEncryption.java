package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerEncryption {
    public float WinterFlowHookDataSource;
    public long WinterFlowRouterStructure;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowSerializerEncryption)) {
            return false;
        }
        WinterFlowSerializerEncryption winterFlowSerializerEncryption = (WinterFlowSerializerEncryption) obj;
        return this.WinterFlowRouterStructure == winterFlowSerializerEncryption.WinterFlowRouterStructure && Float.compare(this.WinterFlowHookDataSource, winterFlowSerializerEncryption.WinterFlowHookDataSource) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (Long.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", dataPoint=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowHookDataSource, ')');
    }
}
