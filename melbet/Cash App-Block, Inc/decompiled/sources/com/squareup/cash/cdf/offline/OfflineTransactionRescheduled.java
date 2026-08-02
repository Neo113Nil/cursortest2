package com.squareup.cash.cdf.offline;

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
public final class OfflineTransactionRescheduled implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final CommonNetworkError common_network_error;
    public final String error_description;
    public final String external_id;
    public final Long http_status_code;
    public final Long next_retry_at;
    public final LinkedHashMap parameters;
    public final Long previous_retry_at;

    /* renamed from: type, reason: collision with root package name */
    public final TransactionType f1099type;

    public OfflineTransactionRescheduled(TransactionType transactionType, String str, Long l, Long l2, Long l3, String str2, CommonNetworkError commonNetworkError) {
        this.f1099type = transactionType;
        this.external_id = str;
        this.previous_retry_at = l;
        this.next_retry_at = l2;
        this.http_status_code = l3;
        this.error_description = str2;
        this.common_network_error = commonNetworkError;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "Offline", "cdf_action", "Transaction");
        Countries.putSafe(m, "type", transactionType);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "previous_retry_at", l);
        Countries.putSafe(m, "next_retry_at", l2);
        Countries.putSafe(m, "http_status_code", l3);
        Countries.putSafe(m, "error_description", str2);
        Countries.putSafe(m, "common_network_error", commonNetworkError);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTransactionRescheduled)) {
            return false;
        }
        OfflineTransactionRescheduled offlineTransactionRescheduled = (OfflineTransactionRescheduled) obj;
        return this.f1099type == offlineTransactionRescheduled.f1099type && Intrinsics.areEqual(this.external_id, offlineTransactionRescheduled.external_id) && this.previous_retry_at.equals(offlineTransactionRescheduled.previous_retry_at) && this.next_retry_at.equals(offlineTransactionRescheduled.next_retry_at) && Intrinsics.areEqual(this.http_status_code, offlineTransactionRescheduled.http_status_code) && Intrinsics.areEqual(this.error_description, offlineTransactionRescheduled.error_description) && this.common_network_error == offlineTransactionRescheduled.common_network_error;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offline Transaction Rescheduled";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        TransactionType transactionType = this.f1099type;
        int hashCode = (transactionType == null ? 0 : transactionType.hashCode()) * 31;
        String str = this.external_id;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.next_retry_at, ViewEvent$State$EnumUnboxingLocalUtility.m(this.previous_retry_at, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 29791);
        Long l = this.http_status_code;
        int hashCode2 = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.error_description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonNetworkError commonNetworkError = this.common_network_error;
        return hashCode3 + (commonNetworkError != null ? commonNetworkError.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTransactionRescheduled(type=");
        sb.append(this.f1099type);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", previous_retry_at=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.previous_retry_at, ", next_retry_at=", this.next_retry_at, ", retry_count=null, reason=null, http_status_code=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.http_status_code, ", error_description=", this.error_description, ", common_network_error=", sb);
        sb.append(this.common_network_error);
        sb.append(")");
        return sb.toString();
    }
}
