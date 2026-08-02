package com.squareup.cash.cdf.minthype;

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
public final class MintHypeOptInComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE, EventDestination.KAFKA});
    public final String customer_token;
    public final LinkedHashMap parameters;
    public final String symbol;

    public MintHypeOptInComplete(String str, String str2) {
        this.symbol = str;
        this.customer_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "MintHype", "cdf_action", "OptIn");
        Countries.putSafe(m, "symbol", str);
        Countries.putSafe(m, "customer_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintHypeOptInComplete)) {
            return false;
        }
        MintHypeOptInComplete mintHypeOptInComplete = (MintHypeOptInComplete) obj;
        return Intrinsics.areEqual(this.symbol, mintHypeOptInComplete.symbol) && Intrinsics.areEqual(this.customer_token, mintHypeOptInComplete.customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintHype OptIn Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.symbol;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customer_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MintHypeOptInComplete(symbol=", this.symbol, ", customer_token=", this.customer_token, ")");
    }
}
