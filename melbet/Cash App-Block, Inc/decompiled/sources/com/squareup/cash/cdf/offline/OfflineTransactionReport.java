package com.squareup.cash.cdf.offline;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
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

/* loaded from: classes6.dex */
public final class OfflineTransactionReport implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer count;
    public final String external_ids;
    public final Long most_recent_transaction_timestamp;
    public final Long oldest_transaction_timestamp;
    public final LinkedHashMap parameters;
    public final String retry_intervals;

    /* renamed from: type, reason: collision with root package name */
    public final TransactionType f1098type;

    public OfflineTransactionReport(TransactionType transactionType, Integer num, String str, Long l, Long l2, String str2) {
        this.f1098type = transactionType;
        this.count = num;
        this.external_ids = str;
        this.oldest_transaction_timestamp = l;
        this.most_recent_transaction_timestamp = l2;
        this.retry_intervals = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Offline", "cdf_action", "Transaction");
        Countries.putSafe(m, "type", transactionType);
        Countries.putSafe(m, "count", num);
        Countries.putSafe(m, "external_ids", str);
        Countries.putSafe(m, "oldest_transaction_timestamp", l);
        Countries.putSafe(m, "most_recent_transaction_timestamp", l2);
        Countries.putSafe(m, "retry_intervals", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTransactionReport)) {
            return false;
        }
        OfflineTransactionReport offlineTransactionReport = (OfflineTransactionReport) obj;
        return this.f1098type == offlineTransactionReport.f1098type && this.count.equals(offlineTransactionReport.count) && this.external_ids.equals(offlineTransactionReport.external_ids) && this.oldest_transaction_timestamp.equals(offlineTransactionReport.oldest_transaction_timestamp) && this.most_recent_transaction_timestamp.equals(offlineTransactionReport.most_recent_transaction_timestamp) && this.retry_intervals.equals(offlineTransactionReport.retry_intervals);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offline Transaction Report";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.retry_intervals.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.most_recent_transaction_timestamp, ViewEvent$State$EnumUnboxingLocalUtility.m(this.oldest_transaction_timestamp, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.f1098type.hashCode() * 31, 31, this.count), 31, this.external_ids), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTransactionReport(type=");
        sb.append(this.f1098type);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", external_ids=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.oldest_transaction_timestamp, this.external_ids, ", oldest_transaction_timestamp=", ", most_recent_transaction_timestamp=", sb);
        sb.append(this.most_recent_transaction_timestamp);
        sb.append(", retry_intervals=");
        sb.append(this.retry_intervals);
        sb.append(")");
        return sb.toString();
    }
}
