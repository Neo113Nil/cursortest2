package com.squareup.cash.cdf.disputeshistory;

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
public final class DisputesHistoryViewLoad implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Boolean has_more;
    public final LinkedHashMap parameters;
    public final Status status;
    public final String transaction_tokens;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status FAILURE;
        public static final Status SUCCESS;

        static {
            Status status = new Status("SUCCESS", 0);
            SUCCESS = status;
            Status status2 = new Status("FAILURE", 1);
            FAILURE = status2;
            $VALUES = new Status[]{status, status2};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public DisputesHistoryViewLoad(Status status, String str, String str2, Boolean bool) {
        this.status = status;
        this.transaction_tokens = str;
        this.flow_token = str2;
        this.has_more = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "DisputesHistory", "cdf_action", "View");
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "transaction_tokens", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "has_more", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisputesHistoryViewLoad)) {
            return false;
        }
        DisputesHistoryViewLoad disputesHistoryViewLoad = (DisputesHistoryViewLoad) obj;
        return this.status == disputesHistoryViewLoad.status && Intrinsics.areEqual(this.transaction_tokens, disputesHistoryViewLoad.transaction_tokens) && Intrinsics.areEqual(this.flow_token, disputesHistoryViewLoad.flow_token) && Intrinsics.areEqual(this.has_more, disputesHistoryViewLoad.has_more);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DisputesHistory View Load";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.transaction_tokens;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.has_more;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "DisputesHistoryViewLoad(status=" + this.status + ", transaction_tokens=" + this.transaction_tokens + ", flow_token=" + this.flow_token + ", has_more=" + this.has_more + ")";
    }
}
