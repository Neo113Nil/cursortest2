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
public final class MintHypeOptOutComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String customer_token;
    public final LinkedHashMap parameters;
    public final String symbol;

    public MintHypeOptOutComplete(String str, String str2) {
        this.symbol = str;
        this.customer_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "MintHype", "cdf_action", "OptOut");
        Countries.putSafe(m, "symbol", str);
        Countries.putSafe(m, "customer_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintHypeOptOutComplete)) {
            return false;
        }
        MintHypeOptOutComplete mintHypeOptOutComplete = (MintHypeOptOutComplete) obj;
        return Intrinsics.areEqual(this.symbol, mintHypeOptOutComplete.symbol) && Intrinsics.areEqual(this.customer_token, mintHypeOptOutComplete.customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintHype OptOut Complete";
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
        return Boxes$$ExternalSyntheticOutline1.m("MintHypeOptOutComplete(symbol=", this.symbol, ", customer_token=", this.customer_token, ")");
    }
}
