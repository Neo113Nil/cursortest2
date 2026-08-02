package com.squareup.cash.cdf.stock;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockTradeCancelOrderResult implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String flow_token;
    public final String order_token;
    public final LinkedHashMap parameters;
    public final Boolean succeeded;

    public StockTradeCancelOrderResult(String str, String str2, Boolean bool) {
        this.flow_token = str;
        this.order_token = str2;
        this.succeeded = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "order_token", str2);
        Countries.putSafe(m, "succeeded", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeCancelOrderResult)) {
            return false;
        }
        StockTradeCancelOrderResult stockTradeCancelOrderResult = (StockTradeCancelOrderResult) obj;
        return Intrinsics.areEqual(this.flow_token, stockTradeCancelOrderResult.flow_token) && Intrinsics.areEqual(this.order_token, stockTradeCancelOrderResult.order_token) && this.succeeded.equals(stockTradeCancelOrderResult.succeeded);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade CancelOrderResult";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.order_token;
        return this.succeeded.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StockTradeCancelOrderResult(flow_token=", this.flow_token, ", order_token=", this.order_token, ", ticker=null, succeeded="), this.succeeded, ")");
    }
}
