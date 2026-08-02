package com.squareup.cash.cdf.moneybot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class MoneybotActionCardTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.KAFKA});
    public final String goose_session_id;
    public final LinkedHashMap parameters;
    public final String route_id;

    public MoneybotActionCardTap(String str, String str2) {
        this.goose_session_id = str;
        this.route_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Moneybot", "cdf_action", "ActionCard");
        Countries.putSafe(m, "goose_session_id", str);
        Countries.putSafe(m, "route_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotActionCardTap)) {
            return false;
        }
        MoneybotActionCardTap moneybotActionCardTap = (MoneybotActionCardTap) obj;
        return Intrinsics.areEqual(this.goose_session_id, moneybotActionCardTap.goose_session_id) && Intrinsics.areEqual(this.route_id, moneybotActionCardTap.route_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Moneybot ActionCard Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goose_session_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.route_id;
        return (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MoneybotActionCardTap(goose_session_id=", this.goose_session_id, ", route_id=", this.route_id, ", tool_name=null)");
    }
}
