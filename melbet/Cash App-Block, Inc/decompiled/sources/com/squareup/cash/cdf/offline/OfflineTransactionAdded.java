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
public final class OfflineTransactionAdded implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final CommonNetworkError common_network_error;
    public final String error_description;
    public final String external_id;
    public final Long http_status_code;
    public final Long next_retry_at;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final TransactionType f1096type;

    public OfflineTransactionAdded(TransactionType transactionType, String str, Long l, Long l2, String str2, CommonNetworkError commonNetworkError) {
        this.f1096type = transactionType;
        this.external_id = str;
        this.next_retry_at = l;
        this.http_status_code = l2;
        this.error_description = str2;
        this.common_network_error = commonNetworkError;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Offline", "cdf_action", "Transaction");
        Countries.putSafe(m, "type", transactionType);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "next_retry_at", l);
        Countries.putSafe(m, "http_status_code", l2);
        Countries.putSafe(m, "error_description", str2);
        Countries.putSafe(m, "common_network_error", commonNetworkError);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTransactionAdded)) {
            return false;
        }
        OfflineTransactionAdded offlineTransactionAdded = (OfflineTransactionAdded) obj;
        return this.f1096type == offlineTransactionAdded.f1096type && Intrinsics.areEqual(this.external_id, offlineTransactionAdded.external_id) && this.next_retry_at.equals(offlineTransactionAdded.next_retry_at) && Intrinsics.areEqual(this.http_status_code, offlineTransactionAdded.http_status_code) && Intrinsics.areEqual(this.error_description, offlineTransactionAdded.error_description) && this.common_network_error == offlineTransactionAdded.common_network_error;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offline Transaction Added";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.f1096type.hashCode() * 31;
        String str = this.external_id;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.next_retry_at, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 961);
        Long l = this.http_status_code;
        int hashCode2 = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.error_description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonNetworkError commonNetworkError = this.common_network_error;
        return hashCode3 + (commonNetworkError != null ? commonNetworkError.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTransactionAdded(type=");
        sb.append(this.f1096type);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", next_retry_at=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.next_retry_at, ", reason=null, http_status_code=", this.http_status_code, ", error_description=");
        sb.append(this.error_description);
        sb.append(", common_network_error=");
        sb.append(this.common_network_error);
        sb.append(")");
        return sb.toString();
    }
}
