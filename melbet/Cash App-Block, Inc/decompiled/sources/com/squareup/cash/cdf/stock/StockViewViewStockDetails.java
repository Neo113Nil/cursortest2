package com.squareup.cash.cdf.stock;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class StockViewViewStockDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean auto_invest_setting;
    public final EquityType equity_type;
    public final String first_button_label;
    public final Double num_shares_owned;
    public final InvestingScreenOrigin origin;
    public final LinkedHashMap parameters;
    public final String second_button_label;
    public final String ticker;
    public final Long value_shares_owned_bps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InvestingScreenOrigin {
        public static final /* synthetic */ InvestingScreenOrigin[] $VALUES;
        public static final InvestingScreenOrigin CATEGORY;
        public static final InvestingScreenOrigin CLIENT_ROUTE;
        public static final InvestingScreenOrigin HOME;
        public static final InvestingScreenOrigin INVEST_SEARCH;
        public static final InvestingScreenOrigin ROUND_UP;
        public static final InvestingScreenOrigin SEARCH;
        public static final InvestingScreenOrigin STOCK_PICKER;
        public static final InvestingScreenOrigin WELCOME_TILES;

        static {
            InvestingScreenOrigin investingScreenOrigin = new InvestingScreenOrigin("HOME", 0);
            HOME = investingScreenOrigin;
            InvestingScreenOrigin investingScreenOrigin2 = new InvestingScreenOrigin("SEARCH", 1);
            SEARCH = investingScreenOrigin2;
            InvestingScreenOrigin investingScreenOrigin3 = new InvestingScreenOrigin("CATEGORY", 2);
            CATEGORY = investingScreenOrigin3;
            InvestingScreenOrigin investingScreenOrigin4 = new InvestingScreenOrigin("STOCK_PICKER", 3);
            STOCK_PICKER = investingScreenOrigin4;
            InvestingScreenOrigin investingScreenOrigin5 = new InvestingScreenOrigin("PUSH_NOTIFICATION", 4);
            InvestingScreenOrigin investingScreenOrigin6 = new InvestingScreenOrigin("CLIENT_ROUTE", 5);
            CLIENT_ROUTE = investingScreenOrigin6;
            InvestingScreenOrigin investingScreenOrigin7 = new InvestingScreenOrigin("WELCOME_TILES", 6);
            WELCOME_TILES = investingScreenOrigin7;
            InvestingScreenOrigin investingScreenOrigin8 = new InvestingScreenOrigin("ROUND_UP", 7);
            ROUND_UP = investingScreenOrigin8;
            InvestingScreenOrigin investingScreenOrigin9 = new InvestingScreenOrigin("INVEST_SEARCH", 8);
            INVEST_SEARCH = investingScreenOrigin9;
            $VALUES = new InvestingScreenOrigin[]{investingScreenOrigin, investingScreenOrigin2, investingScreenOrigin3, investingScreenOrigin4, investingScreenOrigin5, investingScreenOrigin6, investingScreenOrigin7, investingScreenOrigin8, investingScreenOrigin9, new InvestingScreenOrigin("MONEYBOT", 9)};
        }

        public static InvestingScreenOrigin valueOf(String str) {
            return (InvestingScreenOrigin) Enum.valueOf(InvestingScreenOrigin.class, str);
        }

        public static InvestingScreenOrigin[] values() {
            return (InvestingScreenOrigin[]) $VALUES.clone();
        }
    }

    public StockViewViewStockDetails(String str, InvestingScreenOrigin investingScreenOrigin, Double d, Long l, Boolean bool, String str2, String str3, EquityType equityType) {
        this.ticker = str;
        this.origin = investingScreenOrigin;
        this.num_shares_owned = d;
        this.value_shares_owned_bps = l;
        this.auto_invest_setting = bool;
        this.first_button_label = str2;
        this.second_button_label = str3;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "Stock", "cdf_action", "View");
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "origin", investingScreenOrigin);
        Countries.putSafe(m, "num_shares_owned", d);
        Countries.putSafe(m, "value_shares_owned_bps", l);
        Countries.putSafe(m, "auto_invest_setting", bool);
        Countries.putSafe(m, "first_button_label", str2);
        Countries.putSafe(m, "second_button_label", str3);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockViewViewStockDetails)) {
            return false;
        }
        StockViewViewStockDetails stockViewViewStockDetails = (StockViewViewStockDetails) obj;
        return Intrinsics.areEqual(this.ticker, stockViewViewStockDetails.ticker) && this.origin == stockViewViewStockDetails.origin && this.num_shares_owned.equals(stockViewViewStockDetails.num_shares_owned) && this.value_shares_owned_bps.equals(stockViewViewStockDetails.value_shares_owned_bps) && this.auto_invest_setting.equals(stockViewViewStockDetails.auto_invest_setting) && Intrinsics.areEqual(this.first_button_label, stockViewViewStockDetails.first_button_label) && Intrinsics.areEqual(this.second_button_label, stockViewViewStockDetails.second_button_label) && this.equity_type == stockViewViewStockDetails.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock View ViewStockDetails";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.ticker;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InvestingScreenOrigin investingScreenOrigin = this.origin;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.auto_invest_setting, ViewEvent$State$EnumUnboxingLocalUtility.m(this.value_shares_owned_bps, (this.num_shares_owned.hashCode() + ((hashCode + (investingScreenOrigin == null ? 0 : investingScreenOrigin.hashCode())) * 31)) * 31, 31), 31);
        String str2 = this.first_button_label;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.second_button_label;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        EquityType equityType = this.equity_type;
        return hashCode3 + (equityType != null ? equityType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StockViewViewStockDetails(ticker=");
        sb.append(this.ticker);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", num_shares_owned=");
        sb.append(this.num_shares_owned);
        sb.append(", value_shares_owned_bps=");
        sb.append(this.value_shares_owned_bps);
        sb.append(", auto_invest_setting=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.auto_invest_setting, ", first_button_label=", this.first_button_label, ", second_button_label=");
        sb.append(this.second_button_label);
        sb.append(", third_button_label=null, equity_type=");
        sb.append(this.equity_type);
        sb.append(")");
        return sb.toString();
    }
}
