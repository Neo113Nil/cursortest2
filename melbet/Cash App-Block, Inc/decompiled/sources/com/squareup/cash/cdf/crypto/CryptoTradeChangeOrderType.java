package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.CryptoTradeSide;
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
public final class CryptoTradeChangeOrderType implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final CryptoTradeSide side;
    public final String source_asset;
    public final String target_asset;

    public CryptoTradeChangeOrderType(CryptoTradeSide cryptoTradeSide, String str, String str2) {
        this.side = cryptoTradeSide;
        this.target_asset = str;
        this.source_asset = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Crypto", "cdf_action", "Trade");
        Countries.putSafe(m, "side", cryptoTradeSide);
        Countries.putSafe(m, "target_asset", str);
        Countries.putSafe(m, "source_asset", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoTradeChangeOrderType)) {
            return false;
        }
        CryptoTradeChangeOrderType cryptoTradeChangeOrderType = (CryptoTradeChangeOrderType) obj;
        return this.side == cryptoTradeChangeOrderType.side && Intrinsics.areEqual(this.target_asset, cryptoTradeChangeOrderType.target_asset) && Intrinsics.areEqual(this.source_asset, cryptoTradeChangeOrderType.source_asset);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Trade ChangeOrderType";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.side.hashCode() * 31;
        String str = this.target_asset;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source_asset;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CryptoTradeChangeOrderType(side=");
        sb.append(this.side);
        sb.append(", target_asset=");
        sb.append(this.target_asset);
        sb.append(", source_asset=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.source_asset, ")");
    }
}
