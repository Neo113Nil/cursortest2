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
public final class OfflineTransactionCancel implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final LinkedHashMap parameters;
    public final Integer retry_count;

    public OfflineTransactionCancel(Integer num, String str) {
        TransactionType transactionType = TransactionType.FIAT_PAYMENT;
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
        if (!(obj instanceof OfflineTransactionCancel)) {
            return false;
        }
        OfflineTransactionCancel offlineTransactionCancel = (OfflineTransactionCancel) obj;
        TransactionType transactionType = TransactionType.FIAT_PAYMENT;
        return Intrinsics.areEqual(this.external_id, offlineTransactionCancel.external_id) && this.retry_count.equals(offlineTransactionCancel.retry_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offline Transaction Cancel";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = TransactionType.FIAT_PAYMENT.hashCode() * 31;
        String str = this.external_id;
        return this.retry_count.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        TransactionType transactionType = TransactionType.FIAT_PAYMENT;
        StringBuilder sb = new StringBuilder("OfflineTransactionCancel(type=");
        sb.append(transactionType);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", retry_count=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.retry_count, ")");
    }
}
