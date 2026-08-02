package com.squareup.cash.investing.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investment_holding {
    public final Money average_cost;
    public final CurrencyCode currency;
    public final SyncInvestmentHolding.DailyGainParams daily_gain_params;
    public final long invested_amount;
    public final SyncInvestmentHolding.InvestmentHoldingState state;
    public final String token;
    public final String units;

    public Investment_holding(String str, String str2, long j, CurrencyCode currencyCode, SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, SyncInvestmentHolding.DailyGainParams dailyGainParams, Money money) {
        str.getClass();
        str2.getClass();
        investmentHoldingState.getClass();
        this.token = str;
        this.units = str2;
        this.invested_amount = j;
        this.currency = currencyCode;
        this.state = investmentHoldingState;
        this.daily_gain_params = dailyGainParams;
        this.average_cost = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investment_holding)) {
            return false;
        }
        Investment_holding investment_holding = (Investment_holding) obj;
        return Intrinsics.areEqual(this.token, investment_holding.token) && Intrinsics.areEqual(this.units, investment_holding.units) && this.invested_amount == investment_holding.invested_amount && this.currency == investment_holding.currency && this.state == investment_holding.state && Intrinsics.areEqual(this.daily_gain_params, investment_holding.daily_gain_params) && Intrinsics.areEqual(this.average_cost, investment_holding.average_cost);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.units), 31, this.invested_amount);
        CurrencyCode currencyCode = this.currency;
        int hashCode = (this.state.hashCode() + ((m + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31)) * 31;
        SyncInvestmentHolding.DailyGainParams dailyGainParams = this.daily_gain_params;
        int hashCode2 = (hashCode + (dailyGainParams == null ? 0 : dailyGainParams.hashCode())) * 31;
        Money money = this.average_cost;
        return hashCode2 + (money != null ? money.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Investment_holding(token=", this.token, ", units=", this.units, ", invested_amount=");
        m.append(this.invested_amount);
        m.append(", currency=");
        m.append(this.currency);
        m.append(", state=");
        m.append(this.state);
        m.append(", daily_gain_params=");
        m.append(this.daily_gain_params);
        m.append(", average_cost=");
        m.append(this.average_cost);
        m.append(")");
        return m.toString();
    }
}
