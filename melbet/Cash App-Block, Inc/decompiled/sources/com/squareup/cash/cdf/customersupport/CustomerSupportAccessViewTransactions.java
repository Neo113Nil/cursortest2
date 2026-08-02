package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportAccessViewTransactions implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_ids;
    public final String flow_token;
    public final Boolean has_more;
    public final LinkedHashMap parameters;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
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

    public CustomerSupportAccessViewTransactions(String str, String str2, Boolean bool, Status status) {
        this.flow_token = str;
        this.entity_ids = str2;
        this.has_more = bool;
        this.status = status;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "entity_ids", str2);
        Countries.putSafe(m, "has_more", bool);
        Countries.putSafe(m, "status", status);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessViewTransactions)) {
            return false;
        }
        CustomerSupportAccessViewTransactions customerSupportAccessViewTransactions = (CustomerSupportAccessViewTransactions) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessViewTransactions.flow_token) && Intrinsics.areEqual(this.entity_ids, customerSupportAccessViewTransactions.entity_ids) && this.has_more.equals(customerSupportAccessViewTransactions.has_more) && this.status == customerSupportAccessViewTransactions.status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ViewTransactions";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entity_ids;
        return this.status.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_more, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessViewTransactions(flow_token=", this.flow_token, ", entity_ids=", this.entity_ids, ", has_more=");
        m.append(this.has_more);
        m.append(", status=");
        m.append(this.status);
        m.append(")");
        return m.toString();
    }
}
