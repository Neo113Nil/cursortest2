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
public final class CustomerSupportCaptureReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ErrorType error_type;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String request_id;
    public final CaptureTrigger trigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes9.dex */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType FILE_UPLOAD_FAILURE;
        public static final ErrorType SUBMIT_REQUEST_FAILURE;

        /* JADX INFO: Fake field, exist only in values array */
        ErrorType EF0;

        static {
            ErrorType errorType = new ErrorType("FILE_SYSTEM_ERROR", 0);
            ErrorType errorType2 = new ErrorType("FILE_UPLOAD_FAILURE", 1);
            FILE_UPLOAD_FAILURE = errorType2;
            ErrorType errorType3 = new ErrorType("SUBMIT_REQUEST_FAILURE", 2);
            SUBMIT_REQUEST_FAILURE = errorType3;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public CustomerSupportCaptureReceiveError(ErrorType errorType, String str, String str2, CaptureTrigger captureTrigger) {
        this.error_type = errorType;
        this.flow_token = str;
        this.request_id = str2;
        this.trigger = captureTrigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Capture");
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "request_id", str2);
        Countries.putSafe(m, "trigger", captureTrigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportCaptureReceiveError)) {
            return false;
        }
        CustomerSupportCaptureReceiveError customerSupportCaptureReceiveError = (CustomerSupportCaptureReceiveError) obj;
        return this.error_type == customerSupportCaptureReceiveError.error_type && Intrinsics.areEqual(this.flow_token, customerSupportCaptureReceiveError.flow_token) && Intrinsics.areEqual(this.request_id, customerSupportCaptureReceiveError.request_id) && this.trigger == customerSupportCaptureReceiveError.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Capture ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.error_type.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.request_id;
        return this.trigger.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CustomerSupportCaptureReceiveError(error_type=" + this.error_type + ", flow_token=" + this.flow_token + ", request_id=" + this.request_id + ", trigger=" + this.trigger + ")";
    }
}
