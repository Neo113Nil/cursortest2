package com.google.android.datatransport;

import android.graphics.Point;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResponse {
    public final Point WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowResponse(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowResponse)) {
            return false;
        }
        WinterFlowResponse winterFlowResponse = (WinterFlowResponse) obj;
        return this.WinterFlowRouterStructure == winterFlowResponse.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowResponse.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent.equals(winterFlowResponse.WinterFlowCacheManagerAgent);
    }

    public final int hashCode() {
        return this.WinterFlowCacheManagerAgent.hashCode() + (((this.WinterFlowRouterStructure * 31) + this.WinterFlowHookDataSource) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.WinterFlowRouterStructure;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", center=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append('}');
        return sb.toString();
    }
}
