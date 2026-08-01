package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayPlatform {
    public final float WinterFlowHookDataSource;
    public final float WinterFlowRouterStructure;

    public WinterFlowGatewayPlatform(float f, float f2) {
        this.WinterFlowRouterStructure = f;
        this.WinterFlowHookDataSource = f2;
    }

    public final float[] WinterFlowRouterStructure() {
        float f = this.WinterFlowRouterStructure;
        float f2 = this.WinterFlowHookDataSource;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowGatewayPlatform)) {
            return false;
        }
        WinterFlowGatewayPlatform winterFlowGatewayPlatform = (WinterFlowGatewayPlatform) obj;
        return Float.compare(this.WinterFlowRouterStructure, winterFlowGatewayPlatform.WinterFlowRouterStructure) == 0 && Float.compare(this.WinterFlowHookDataSource, winterFlowGatewayPlatform.WinterFlowHookDataSource) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (Float.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", y=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowHookDataSource, ')');
    }
}
