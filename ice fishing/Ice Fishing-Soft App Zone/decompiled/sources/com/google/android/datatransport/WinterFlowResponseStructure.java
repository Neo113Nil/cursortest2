package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponseStructure {
    public static final WinterFlowResponseStructure WinterFlowArrayNetwork = new WinterFlowResponseStructure(WinterFlowSerializerAPI.WinterFlowCacheManagerAgent, 17, 0);
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowResponseStructure(float f, int i, int i2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowResponseStructure)) {
            return false;
        }
        WinterFlowResponseStructure winterFlowResponseStructure = (WinterFlowResponseStructure) obj;
        float f = winterFlowResponseStructure.WinterFlowRouterStructure;
        float f2 = WinterFlowSerializerAPI.WinterFlowHookDataSource;
        return Float.compare(this.WinterFlowRouterStructure, f) == 0 && this.WinterFlowHookDataSource == winterFlowResponseStructure.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowResponseStructure.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        float f = WinterFlowSerializerAPI.WinterFlowHookDataSource;
        return Integer.hashCode(this.WinterFlowCacheManagerAgent) + WinterFlowResolverBackend.WinterFlowArrayNetwork(this.WinterFlowHookDataSource, Float.hashCode(this.WinterFlowRouterStructure) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) WinterFlowSerializerAPI.WinterFlowHookDataSource(this.WinterFlowRouterStructure));
        sb.append(", trim=");
        String str = "Invalid";
        int i = this.WinterFlowHookDataSource;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i2 = this.WinterFlowCacheManagerAgent;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
