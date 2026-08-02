package com.squareup.cash.cdf.crypto;

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
public final class CryptoTradeSelectAutoInvest implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String source_asset;
    public final String target_asset;

    public CryptoTradeSelectAutoInvest(String str, String str2) {
        this.target_asset = str;
        this.source_asset = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "Trade");
        Countries.putSafe(m, "target_asset", str);
        Countries.putSafe(m, "source_asset", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoTradeSelectAutoInvest)) {
            return false;
        }
        CryptoTradeSelectAutoInvest cryptoTradeSelectAutoInvest = (CryptoTradeSelectAutoInvest) obj;
        return Intrinsics.areEqual(this.target_asset, cryptoTradeSelectAutoInvest.target_asset) && Intrinsics.areEqual(this.source_asset, cryptoTradeSelectAutoInvest.source_asset);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Trade SelectAutoInvest";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.target_asset;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source_asset;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CryptoTradeSelectAutoInvest(target_asset=", this.target_asset, ", source_asset=", this.source_asset, ")");
    }
}
