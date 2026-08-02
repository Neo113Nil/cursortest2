package com.squareup.cash.cdf.cash;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashWithdrawSelectInstrument implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final InstrumentType instrument_type;
    public final LinkedHashMap parameters;

    public CashWithdrawSelectInstrument(String str, InstrumentType instrumentType) {
        this.flow_token = str;
        this.instrument_type = instrumentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "instrument_type", instrumentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawSelectInstrument)) {
            return false;
        }
        CashWithdrawSelectInstrument cashWithdrawSelectInstrument = (CashWithdrawSelectInstrument) obj;
        return Intrinsics.areEqual(this.flow_token, cashWithdrawSelectInstrument.flow_token) && this.instrument_type == cashWithdrawSelectInstrument.instrument_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw SelectInstrument";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.instrument_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CashWithdrawSelectInstrument(flow_token=" + this.flow_token + ", instrument_type=" + this.instrument_type + ")";
    }
}
