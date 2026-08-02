package com.squareup.cash.multiplatform.investing;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DailyGainParams {
    public final long day_cash_value_change;
    public final String units_at_market_open;
    public final long valid_until_seconds;

    public DailyGainParams(long j, long j2, String str) {
        str.getClass();
        this.valid_until_seconds = j;
        this.units_at_market_open = str;
        this.day_cash_value_change = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyGainParams)) {
            return false;
        }
        DailyGainParams dailyGainParams = (DailyGainParams) obj;
        return this.valid_until_seconds == dailyGainParams.valid_until_seconds && Intrinsics.areEqual(this.units_at_market_open, dailyGainParams.units_at_market_open) && this.day_cash_value_change == dailyGainParams.day_cash_value_change;
    }

    public final int hashCode() {
        return Long.hashCode(this.day_cash_value_change) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.valid_until_seconds) * 31, 31, this.units_at_market_open);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.day_cash_value_change, ", day_cash_value_change=", ")", re$$ExternalSyntheticOutline0.m("DailyGainParams(valid_until_seconds=", this.valid_until_seconds, ", units_at_market_open=", this.units_at_market_open));
    }
}
