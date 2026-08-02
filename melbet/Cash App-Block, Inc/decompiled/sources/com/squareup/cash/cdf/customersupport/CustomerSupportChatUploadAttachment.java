package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportChatUploadAttachment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer duration_ms;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Status status;

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

    public CustomerSupportChatUploadAttachment(Integer num, Status status, String str) {
        this.duration_ms = num;
        this.status = status;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "duration_ms", num);
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatUploadAttachment)) {
            return false;
        }
        CustomerSupportChatUploadAttachment customerSupportChatUploadAttachment = (CustomerSupportChatUploadAttachment) obj;
        return this.duration_ms.equals(customerSupportChatUploadAttachment.duration_ms) && this.status == customerSupportChatUploadAttachment.status && Intrinsics.areEqual(this.flow_token, customerSupportChatUploadAttachment.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat UploadAttachment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + (this.duration_ms.hashCode() * 31)) * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportChatUploadAttachment(duration_ms=");
        sb.append(this.duration_ms);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
