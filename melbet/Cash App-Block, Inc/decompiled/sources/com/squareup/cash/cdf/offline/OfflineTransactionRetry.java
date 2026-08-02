package com.squareup.cash.cdf.offline;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class OfflineTransactionRetry implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final LinkedHashMap parameters;
    public final Integer retry_count;

    /* renamed from: type, reason: collision with root package name */
    public final TransactionType f1100type;

    public OfflineTransactionRetry(TransactionType transactionType, String str, Integer num) {
        this.f1100type = transactionType;
        this.external_id = str;
        this.retry_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Offline", "cdf_action", "Transaction");
        Countries.putSafe(m, "type", transactionType);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "retry_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTransactionRetry)) {
            return false;
        }
        OfflineTransactionRetry offlineTransactionRetry = (OfflineTransactionRetry) obj;
        return this.f1100type == offlineTransactionRetry.f1100type && Intrinsics.areEqual(this.external_id, offlineTransactionRetry.external_id) && Intrinsics.areEqual(this.retry_count, offlineTransactionRetry.retry_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offline Transaction Retry";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.f1100type.hashCode() * 31;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.retry_count;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTransactionRetry(type=");
        sb.append(this.f1100type);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", retry_count=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.retry_count, ")");
    }
}
