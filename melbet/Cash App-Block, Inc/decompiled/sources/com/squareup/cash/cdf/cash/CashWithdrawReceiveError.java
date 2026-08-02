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
public final class CashWithdrawReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String error_message;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CashWithdrawReceiveError(String str, String str2) {
        this.error_message = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "error_message", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawReceiveError)) {
            return false;
        }
        CashWithdrawReceiveError cashWithdrawReceiveError = (CashWithdrawReceiveError) obj;
        return Intrinsics.areEqual(this.error_message, cashWithdrawReceiveError.error_message) && Intrinsics.areEqual(this.flow_token, cashWithdrawReceiveError.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.error_message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CashWithdrawReceiveError(error_message=", this.error_message, ", flow_token=", this.flow_token, ")");
    }
}
