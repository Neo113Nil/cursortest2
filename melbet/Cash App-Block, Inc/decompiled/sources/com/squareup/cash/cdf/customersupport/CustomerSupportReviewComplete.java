package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportReviewComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Status submit_status;
    public final String survey_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
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

    public CustomerSupportReviewComplete(Status status, String str) {
        this.submit_status = status;
        this.survey_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Review");
        Countries.putSafe(m, "submit_status", status);
        Countries.putSafe(m, "survey_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportReviewComplete)) {
            return false;
        }
        CustomerSupportReviewComplete customerSupportReviewComplete = (CustomerSupportReviewComplete) obj;
        return this.submit_status == customerSupportReviewComplete.submit_status && Intrinsics.areEqual(this.survey_token, customerSupportReviewComplete.survey_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Review Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.submit_status.hashCode() * 31;
        String str = this.survey_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CustomerSupportReviewComplete(submit_status=" + this.submit_status + ", survey_token=" + this.survey_token + ")";
    }
}
