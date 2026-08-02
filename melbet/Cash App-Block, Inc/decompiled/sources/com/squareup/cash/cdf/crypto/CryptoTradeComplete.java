package com.squareup.cash.cdf.crypto;

import com.google.mlkit.common.internal.zza;
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

/* loaded from: classes.dex */
public final class CryptoTradeComplete implements Event {
    public static final zza Companion = new zza(21);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final CryptoTradeCompleteOrderType order_type;
    public final LinkedHashMap parameters;
    public final CryptoTradeSide side;
    public final String source_asset;
    public final String target_asset;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class CryptoTradeCompleteOrderType {
        public static final /* synthetic */ CryptoTradeCompleteOrderType[] $VALUES;
        public static final CryptoTradeCompleteOrderType AUTO_INVEST;
        public static final CryptoTradeCompleteOrderType LIMIT;
        public static final CryptoTradeCompleteOrderType STANDARD;

        static {
            CryptoTradeCompleteOrderType cryptoTradeCompleteOrderType = new CryptoTradeCompleteOrderType("STANDARD", 0);
            STANDARD = cryptoTradeCompleteOrderType;
            CryptoTradeCompleteOrderType cryptoTradeCompleteOrderType2 = new CryptoTradeCompleteOrderType("AUTO_INVEST", 1);
            AUTO_INVEST = cryptoTradeCompleteOrderType2;
            CryptoTradeCompleteOrderType cryptoTradeCompleteOrderType3 = new CryptoTradeCompleteOrderType("LIMIT", 2);
            LIMIT = cryptoTradeCompleteOrderType3;
            $VALUES = new CryptoTradeCompleteOrderType[]{cryptoTradeCompleteOrderType, cryptoTradeCompleteOrderType2, cryptoTradeCompleteOrderType3};
        }

        public static CryptoTradeCompleteOrderType valueOf(String str) {
            return (CryptoTradeCompleteOrderType) Enum.valueOf(CryptoTradeCompleteOrderType.class, str);
        }

        public static CryptoTradeCompleteOrderType[] values() {
            return (CryptoTradeCompleteOrderType[]) $VALUES.clone();
        }
    }

    public CryptoTradeComplete(CryptoTradeCompleteOrderType cryptoTradeCompleteOrderType, CryptoTradeSide cryptoTradeSide, String str, String str2) {
        this.order_type = cryptoTradeCompleteOrderType;
        this.side = cryptoTradeSide;
        this.target_asset = str;
        this.source_asset = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Crypto", "cdf_action", "Trade");
        Countries.putSafe(m, "order_type", cryptoTradeCompleteOrderType);
        Countries.putSafe(m, "side", cryptoTradeSide);
        Countries.putSafe(m, "target_asset", str);
        Countries.putSafe(m, "source_asset", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoTradeComplete)) {
            return false;
        }
        CryptoTradeComplete cryptoTradeComplete = (CryptoTradeComplete) obj;
        return this.order_type == cryptoTradeComplete.order_type && this.side == cryptoTradeComplete.side && Intrinsics.areEqual(this.target_asset, cryptoTradeComplete.target_asset) && Intrinsics.areEqual(this.source_asset, cryptoTradeComplete.source_asset);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Trade Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.side.hashCode() + (this.order_type.hashCode() * 31)) * 31;
        String str = this.target_asset;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source_asset;
        return (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CryptoTradeComplete(order_type=");
        sb.append(this.order_type);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", target_asset=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.target_asset, ", source_asset=", this.source_asset, ", fiat_amount_range=null)");
    }
}
