package com.squareup.cash.cdf.offline;

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
public final class OfflineTransactionRemoved implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String error_reason;
    public final String external_id;
    public final LinkedHashMap parameters;
    public final Reason reason;
    public final Integer retry_count;

    /* renamed from: type, reason: collision with root package name */
    public final TransactionType f1097type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Reason {
        public static final /* synthetic */ Reason[] $VALUES;
        public static final Reason CANCELLED;
        public static final Reason NON_RETRIABLE_ERROR;
        public static final Reason REMOTE_CLEAR_APP_DATA;
        public static final Reason RETRY_SUCCESSFUL;
        public static final Reason SIGN_OUT;

        static {
            Reason reason = new Reason("RETRY_SUCCESSFUL", 0);
            RETRY_SUCCESSFUL = reason;
            Reason reason2 = new Reason("CANCELLED", 1);
            CANCELLED = reason2;
            Reason reason3 = new Reason("SIGN_OUT", 2);
            SIGN_OUT = reason3;
            Reason reason4 = new Reason("NON_RETRIABLE_ERROR", 3);
            NON_RETRIABLE_ERROR = reason4;
            Reason reason5 = new Reason("REMOTE_CLEAR_APP_DATA", 4);
            REMOTE_CLEAR_APP_DATA = reason5;
            $VALUES = new Reason[]{reason, reason2, reason3, reason4, reason5};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public OfflineTransactionRemoved(TransactionType transactionType, String str, Integer num, Reason reason, String str2) {
        this.f1097type = transactionType;
        this.external_id = str;
        this.retry_count = num;
        this.reason = reason;
        this.error_reason = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Offline", "cdf_action", "Transaction");
        Countries.putSafe(m, "type", transactionType);
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "retry_count", num);
        Countries.putSafe(m, "reason", reason);
        Countries.putSafe(m, "error_reason", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineTransactionRemoved)) {
            return false;
        }
        OfflineTransactionRemoved offlineTransactionRemoved = (OfflineTransactionRemoved) obj;
        return this.f1097type == offlineTransactionRemoved.f1097type && Intrinsics.areEqual(this.external_id, offlineTransactionRemoved.external_id) && Intrinsics.areEqual(this.retry_count, offlineTransactionRemoved.retry_count) && this.reason == offlineTransactionRemoved.reason && Intrinsics.areEqual(this.error_reason, offlineTransactionRemoved.error_reason);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offline Transaction Removed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        TransactionType transactionType = this.f1097type;
        int hashCode = (transactionType == null ? 0 : transactionType.hashCode()) * 31;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.retry_count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Reason reason = this.reason;
        int hashCode4 = (hashCode3 + (reason == null ? 0 : reason.hashCode())) * 31;
        String str2 = this.error_reason;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTransactionRemoved(type=");
        sb.append(this.f1097type);
        sb.append(", external_id=");
        sb.append(this.external_id);
        sb.append(", retry_count=");
        sb.append(this.retry_count);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", error_reason=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.error_reason, ")");
    }
}
