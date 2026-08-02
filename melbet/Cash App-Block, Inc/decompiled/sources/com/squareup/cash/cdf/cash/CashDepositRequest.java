package com.squareup.cash.cdf.cash;

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
public final class CashDepositRequest implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final Boolean is_retry;
    public final LinkedHashMap parameters;

    public CashDepositRequest(Boolean bool, String str, String str2) {
        this.is_retry = bool;
        this.external_id = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Cash", "cdf_action", "Deposit");
        Countries.putSafe(m, "is_retry", bool);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashDepositRequest)) {
            return false;
        }
        CashDepositRequest cashDepositRequest = (CashDepositRequest) obj;
        return this.is_retry.equals(cashDepositRequest.is_retry) && Intrinsics.areEqual(this.external_id, cashDepositRequest.external_id) && Intrinsics.areEqual(this.flow_token, cashDepositRequest.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Deposit Request";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.is_retry.hashCode() * 31;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashDepositRequest(is_retry=");
        sb.append(this.is_retry);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
