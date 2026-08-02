package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportFullTransactionPickerView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_ids;
    public final String flow_token;
    public final FullTransactionPickerOrigin origin;
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

    public CustomerSupportFullTransactionPickerView(Status status, String str, String str2, FullTransactionPickerOrigin fullTransactionPickerOrigin) {
        Boolean bool = Boolean.FALSE;
        this.status = status;
        this.entity_ids = str;
        this.flow_token = str2;
        this.origin = fullTransactionPickerOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CustomerSupport", "cdf_action", "FullTransactionPicker");
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "entity_ids", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "has_more", bool);
        Countries.putSafe(m, "origin", fullTransactionPickerOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportFullTransactionPickerView)) {
            return false;
        }
        CustomerSupportFullTransactionPickerView customerSupportFullTransactionPickerView = (CustomerSupportFullTransactionPickerView) obj;
        if (this.status != customerSupportFullTransactionPickerView.status || !Intrinsics.areEqual(this.entity_ids, customerSupportFullTransactionPickerView.entity_ids) || !Intrinsics.areEqual(this.flow_token, customerSupportFullTransactionPickerView.flow_token)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && this.origin == customerSupportFullTransactionPickerView.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport FullTransactionPicker View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.entity_ids;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.FALSE, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        FullTransactionPickerOrigin fullTransactionPickerOrigin = this.origin;
        return m + (fullTransactionPickerOrigin != null ? fullTransactionPickerOrigin.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("CustomerSupportFullTransactionPickerView(status=");
        sb.append(this.status);
        sb.append(", entity_ids=");
        sb.append(this.entity_ids);
        sb.append(", flow_token=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.flow_token, ", has_more=", bool, ", origin=");
        sb.append(this.origin);
        sb.append(")");
        return sb.toString();
    }
}
