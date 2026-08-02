package com.squareup.cash.cdf.cash;

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
public final class CashWithdrawDepositPreferenceSelected implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String deposit_preference;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CashWithdrawDepositPreferenceSelected(String str, String str2) {
        this.deposit_preference = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "deposit_preference", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawDepositPreferenceSelected)) {
            return false;
        }
        CashWithdrawDepositPreferenceSelected cashWithdrawDepositPreferenceSelected = (CashWithdrawDepositPreferenceSelected) obj;
        return Intrinsics.areEqual(this.deposit_preference, cashWithdrawDepositPreferenceSelected.deposit_preference) && Intrinsics.areEqual(this.flow_token, cashWithdrawDepositPreferenceSelected.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw DepositPreferenceSelected";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.deposit_preference;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CashWithdrawDepositPreferenceSelected(deposit_preference=", this.deposit_preference, ", flow_token=", this.flow_token, ")");
    }
}
