package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.CryptoTradeSide;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoTradeShowBankRecommendationSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    public CryptoTradeShowBankRecommendationSheet() {
        CryptoTradeSide cryptoTradeSide = CryptoTradeSide.BUY;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Trade");
        Countries.putSafe(m, "side", cryptoTradeSide);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoTradeShowBankRecommendationSheet)) {
            return false;
        }
        CryptoTradeSide cryptoTradeSide = CryptoTradeSide.BUY;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Trade ShowBankRecommendationSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return CryptoTradeSide.BUY.hashCode();
    }

    public final String toString() {
        return "CryptoTradeShowBankRecommendationSheet(side=" + CryptoTradeSide.BUY + ")";
    }
}
