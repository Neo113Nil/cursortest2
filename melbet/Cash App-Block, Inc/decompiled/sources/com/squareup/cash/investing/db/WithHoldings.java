package com.squareup.cash.investing.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WithHoldings {
    public final Money average_cost;
    public final CurrencyCode currency;
    public final SyncInvestmentHolding.DailyGainParams daily_gain_params;
    public final boolean delisted;
    public final String display_name;
    public final Color entity_color;
    public final Long invested_amount;
    public final SyncInvestmentHolding.InvestmentHoldingState state;
    public final String symbol;
    public final String token;
    public final String units;

    public WithHoldings(String str, String str2, Long l, CurrencyCode currencyCode, SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, SyncInvestmentHolding.DailyGainParams dailyGainParams, Money money, String str3, String str4, boolean z, Color color) {
        str3.getClass();
        str4.getClass();
        this.token = str;
        this.units = str2;
        this.invested_amount = l;
        this.currency = currencyCode;
        this.state = investmentHoldingState;
        this.daily_gain_params = dailyGainParams;
        this.average_cost = money;
        this.display_name = str3;
        this.symbol = str4;
        this.delisted = z;
        this.entity_color = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithHoldings)) {
            return false;
        }
        WithHoldings withHoldings = (WithHoldings) obj;
        return Intrinsics.areEqual(this.token, withHoldings.token) && Intrinsics.areEqual(this.units, withHoldings.units) && Intrinsics.areEqual(this.invested_amount, withHoldings.invested_amount) && this.currency == withHoldings.currency && this.state == withHoldings.state && Intrinsics.areEqual(this.daily_gain_params, withHoldings.daily_gain_params) && Intrinsics.areEqual(this.average_cost, withHoldings.average_cost) && Intrinsics.areEqual(this.display_name, withHoldings.display_name) && Intrinsics.areEqual(this.symbol, withHoldings.symbol) && this.delisted == withHoldings.delisted && Intrinsics.areEqual(this.entity_color, withHoldings.entity_color);
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.units;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.invested_amount;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        CurrencyCode currencyCode = this.currency;
        int hashCode4 = (hashCode3 + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31;
        SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = this.state;
        int hashCode5 = (hashCode4 + (investmentHoldingState == null ? 0 : investmentHoldingState.hashCode())) * 31;
        SyncInvestmentHolding.DailyGainParams dailyGainParams = this.daily_gain_params;
        int hashCode6 = (hashCode5 + (dailyGainParams == null ? 0 : dailyGainParams.hashCode())) * 31;
        Money money = this.average_cost;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (money == null ? 0 : money.hashCode())) * 31, 31, this.display_name), 31, this.symbol), 31, this.delisted);
        Color color = this.entity_color;
        return m + (color != null ? color.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithHoldings(token=", this.token, ", units=", this.units, ", invested_amount=");
        m.append(this.invested_amount);
        m.append(", currency=");
        m.append(this.currency);
        m.append(", state=");
        m.append(this.state);
        m.append(", daily_gain_params=");
        m.append(this.daily_gain_params);
        m.append(", average_cost=");
        m.append(this.average_cost);
        m.append(", display_name=");
        m.append(this.display_name);
        m.append(", symbol=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.symbol, ", delisted=", this.delisted, ", entity_color=");
        m.append(this.entity_color);
        m.append(")");
        return m.toString();
    }
}
