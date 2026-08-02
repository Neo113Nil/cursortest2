package com.squareup.cash.cdf.stock;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockSelectSubmitCancel implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Boolean intent_to_disable;
    public final LinkedHashMap parameters;

    public StockSelectSubmitCancel(String str, Boolean bool) {
        this.flow_token = str;
        this.intent_to_disable = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "intent_to_disable", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSubmitCancel)) {
            return false;
        }
        StockSelectSubmitCancel stockSelectSubmitCancel = (StockSelectSubmitCancel) obj;
        return Intrinsics.areEqual(this.flow_token, stockSelectSubmitCancel.flow_token) && this.intent_to_disable.equals(stockSelectSubmitCancel.intent_to_disable);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SubmitCancel";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return ViewEvent$State$EnumUnboxingLocalUtility.m(this.intent_to_disable, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "StockSelectSubmitCancel(flow_token=" + this.flow_token + ", intent_to_disable=" + this.intent_to_disable + ", cta_title=null)";
    }
}
