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
public final class CustomerSupportAccessViewPhoneVerificationAttempt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final ErrorType hasError;
    public final LinkedHashMap parameters;
    public final Status status;
    public final Trigger trigger;
    public final String verification_id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType NETWORK;
        public static final ErrorType SERVER;

        static {
            ErrorType errorType = new ErrorType("NETWORK", 0);
            NETWORK = errorType;
            ErrorType errorType2 = new ErrorType("SERVER", 1);
            SERVER = errorType2;
            $VALUES = new ErrorType[]{errorType, errorType2};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status EXPIRED;
        public static final Status FAILED_PIN;
        public static final Status INVALID;
        public static final Status PENDING;
        public static final Status REJECTED;
        public static final Status VERIFIED;

        static {
            Status status = new Status("PENDING", 0);
            PENDING = status;
            Status status2 = new Status("VERIFIED", 1);
            VERIFIED = status2;
            Status status3 = new Status("REJECTED", 2);
            REJECTED = status3;
            Status status4 = new Status("INVALID", 3);
            INVALID = status4;
            Status status5 = new Status("EXPIRED", 4);
            EXPIRED = status5;
            Status status6 = new Status("FAILED_PIN", 5);
            FAILED_PIN = status6;
            $VALUES = new Status[]{status, status2, status3, status4, status5, status6};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger NOTIFICATION;
        public static final Trigger RETRY;
        public static final Trigger SYNC_VALUE;

        static {
            Trigger trigger = new Trigger("NOTIFICATION", 0);
            NOTIFICATION = trigger;
            Trigger trigger2 = new Trigger("SYNC_VALUE", 1);
            SYNC_VALUE = trigger2;
            Trigger trigger3 = new Trigger("SYNC_VALUE_RELOAD", 2);
            Trigger trigger4 = new Trigger("RETRY", 3);
            RETRY = trigger4;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3, trigger4};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportAccessViewPhoneVerificationAttempt(String str, String str2, Status status, ErrorType errorType, Trigger trigger) {
        this.flow_token = str;
        this.verification_id = str2;
        this.status = status;
        this.hasError = errorType;
        this.trigger = trigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "verification_id", str2);
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "hasError", errorType);
        Countries.putSafe(m, "trigger", trigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessViewPhoneVerificationAttempt)) {
            return false;
        }
        CustomerSupportAccessViewPhoneVerificationAttempt customerSupportAccessViewPhoneVerificationAttempt = (CustomerSupportAccessViewPhoneVerificationAttempt) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessViewPhoneVerificationAttempt.flow_token) && Intrinsics.areEqual(this.verification_id, customerSupportAccessViewPhoneVerificationAttempt.verification_id) && this.status == customerSupportAccessViewPhoneVerificationAttempt.status && this.hasError == customerSupportAccessViewPhoneVerificationAttempt.hasError && this.trigger == customerSupportAccessViewPhoneVerificationAttempt.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ViewPhoneVerificationAttempt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.verification_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status == null ? 0 : status.hashCode())) * 31;
        ErrorType errorType = this.hasError;
        int hashCode4 = (hashCode3 + (errorType == null ? 0 : errorType.hashCode())) * 31;
        Trigger trigger = this.trigger;
        return hashCode4 + (trigger != null ? trigger.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessViewPhoneVerificationAttempt(flow_token=", this.flow_token, ", verification_id=", this.verification_id, ", status=");
        m.append(this.status);
        m.append(", hasError=");
        m.append(this.hasError);
        m.append(", trigger=");
        m.append(this.trigger);
        m.append(")");
        return m.toString();
    }
}
