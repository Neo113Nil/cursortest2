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
public final class CustomerSupportAccessActionPhoneVerificationAttempt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final ErrorType hasError;
    public final LinkedHashMap parameters;
    public final Status status;
    public final String verification_id;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Action {
        public static final /* synthetic */ Action[] $VALUES;
        public static final Action REJECT;

        /* JADX INFO: Fake field, exist only in values array */
        Action EF0;

        static {
            Action action = new Action("VERIFY", 0);
            Action action2 = new Action("REJECT", 1);
            REJECT = action2;
            $VALUES = new Action[]{action, action2};
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
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
    /* loaded from: classes4.dex */
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

    public CustomerSupportAccessActionPhoneVerificationAttempt(String str, String str2, Status status, ErrorType errorType) {
        Action action = Action.REJECT;
        this.flow_token = str;
        this.verification_id = str2;
        this.status = status;
        this.hasError = errorType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "action", action);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "verification_id", str2);
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "hasError", errorType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessActionPhoneVerificationAttempt)) {
            return false;
        }
        CustomerSupportAccessActionPhoneVerificationAttempt customerSupportAccessActionPhoneVerificationAttempt = (CustomerSupportAccessActionPhoneVerificationAttempt) obj;
        Action action = Action.REJECT;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessActionPhoneVerificationAttempt.flow_token) && Intrinsics.areEqual(this.verification_id, customerSupportAccessActionPhoneVerificationAttempt.verification_id) && this.status == customerSupportAccessActionPhoneVerificationAttempt.status && this.hasError == customerSupportAccessActionPhoneVerificationAttempt.hasError;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ActionPhoneVerificationAttempt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = Action.REJECT.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.verification_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Status status = this.status;
        int hashCode4 = (hashCode3 + (status == null ? 0 : status.hashCode())) * 31;
        ErrorType errorType = this.hasError;
        return hashCode4 + (errorType != null ? errorType.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerSupportAccessActionPhoneVerificationAttempt(action=" + Action.REJECT + ", flow_token=" + this.flow_token + ", verification_id=" + this.verification_id + ", status=" + this.status + ", hasError=" + this.hasError + ")";
    }
}
