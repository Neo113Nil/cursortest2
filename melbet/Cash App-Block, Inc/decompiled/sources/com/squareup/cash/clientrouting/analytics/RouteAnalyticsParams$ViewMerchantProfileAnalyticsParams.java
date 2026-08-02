package com.squareup.cash.clientrouting.analytics;

import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams {
    public final GetProfileDetailsContext currentFlow;
    public final String queryToken;

    public RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams(GetProfileDetailsContext getProfileDetailsContext, String str) {
        getProfileDetailsContext.getClass();
        this.currentFlow = getProfileDetailsContext;
        this.queryToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams)) {
            return false;
        }
        RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams routeAnalyticsParams$ViewMerchantProfileAnalyticsParams = (RouteAnalyticsParams$ViewMerchantProfileAnalyticsParams) obj;
        return this.currentFlow == routeAnalyticsParams$ViewMerchantProfileAnalyticsParams.currentFlow && Intrinsics.areEqual(this.queryToken, routeAnalyticsParams$ViewMerchantProfileAnalyticsParams.queryToken);
    }

    public final int hashCode() {
        int hashCode = this.currentFlow.hashCode() * 961;
        String str = this.queryToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ViewMerchantProfileAnalyticsParams(currentFlow=" + this.currentFlow + ", genericCDFEventParameters=null, queryToken=" + this.queryToken + ")";
    }
}
