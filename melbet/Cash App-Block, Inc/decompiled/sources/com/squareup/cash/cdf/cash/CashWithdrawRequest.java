package com.squareup.cash.cdf.cash;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class CashWithdrawRequest implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String deposit_preference;
    public final String external_id;
    public final String flow_token;
    public final Boolean is_retry;
    public final LinkedHashMap parameters;

    public CashWithdrawRequest(Boolean bool, String str, String str2, String str3) {
        Boolean bool2 = Boolean.FALSE;
        this.is_retry = bool;
        this.external_id = str;
        this.flow_token = str2;
        this.deposit_preference = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "is_retry", bool);
        Countries.putSafe(m, "is_legacy_endpoint", bool2);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "deposit_preference", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawRequest)) {
            return false;
        }
        CashWithdrawRequest cashWithdrawRequest = (CashWithdrawRequest) obj;
        if (!this.is_retry.equals(cashWithdrawRequest.is_retry)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.external_id, cashWithdrawRequest.external_id) && Intrinsics.areEqual(this.flow_token, cashWithdrawRequest.flow_token) && Intrinsics.areEqual(this.deposit_preference, cashWithdrawRequest.deposit_preference);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw Request";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.FALSE, this.is_retry.hashCode() * 31, 31);
        String str = this.external_id;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deposit_preference;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("CashWithdrawRequest(is_retry=");
        sb.append(this.is_retry);
        sb.append(", is_legacy_endpoint=");
        sb.append(bool);
        sb.append(", external_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.external_id, ", flow_token=", this.flow_token, ", deposit_preference=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.deposit_preference, ")");
    }
}
