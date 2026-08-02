package com.squareup.cash.cdf.passkey;

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
public final class PasskeyCreateResultFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer code;
    public final String error_message;
    public final CreateErrorType error_type;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CreateErrorType {
        public static final /* synthetic */ CreateErrorType[] $VALUES;
        public static final CreateErrorType AUTH_FINISH_FAILED;
        public static final CreateErrorType AUTH_START_FAILED;
        public static final CreateErrorType AUTH_START_INVALID;
        public static final CreateErrorType DEVICE_CREDENTIAL_DUPLICATE;
        public static final CreateErrorType DEVICE_CREDENTIAL_FAILED;
        public static final CreateErrorType OTHER;

        static {
            CreateErrorType createErrorType = new CreateErrorType("AUTH_START_FAILED", 0);
            AUTH_START_FAILED = createErrorType;
            CreateErrorType createErrorType2 = new CreateErrorType("AUTH_START_INVALID", 1);
            AUTH_START_INVALID = createErrorType2;
            CreateErrorType createErrorType3 = new CreateErrorType("DEVICE_CREDENTIAL_CANCELED", 2);
            CreateErrorType createErrorType4 = new CreateErrorType("DEVICE_CREDENTIAL_DUPLICATE", 3);
            DEVICE_CREDENTIAL_DUPLICATE = createErrorType4;
            CreateErrorType createErrorType5 = new CreateErrorType("DEVICE_CREDENTIAL_FAILED", 4);
            DEVICE_CREDENTIAL_FAILED = createErrorType5;
            CreateErrorType createErrorType6 = new CreateErrorType("AUTH_FINISH_FAILED", 5);
            AUTH_FINISH_FAILED = createErrorType6;
            CreateErrorType createErrorType7 = new CreateErrorType("OTHER", 6);
            OTHER = createErrorType7;
            $VALUES = new CreateErrorType[]{createErrorType, createErrorType2, createErrorType3, createErrorType4, createErrorType5, createErrorType6, createErrorType7};
        }

        public static CreateErrorType valueOf(String str) {
            return (CreateErrorType) Enum.valueOf(CreateErrorType.class, str);
        }

        public static CreateErrorType[] values() {
            return (CreateErrorType[]) $VALUES.clone();
        }
    }

    public PasskeyCreateResultFailed(CreateErrorType createErrorType, Integer num, String str) {
        this.error_type = createErrorType;
        this.code = num;
        this.error_message = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Passkey", "cdf_action", "Create");
        Countries.putSafe(m, "error_type", createErrorType);
        Countries.putSafe(m, "code", num);
        Countries.putSafe(m, "error_message", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyCreateResultFailed)) {
            return false;
        }
        PasskeyCreateResultFailed passkeyCreateResultFailed = (PasskeyCreateResultFailed) obj;
        return this.error_type == passkeyCreateResultFailed.error_type && Intrinsics.areEqual(this.code, passkeyCreateResultFailed.code) && Intrinsics.areEqual(this.error_message, passkeyCreateResultFailed.error_message);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Passkey Create ResultFailed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        CreateErrorType createErrorType = this.error_type;
        int hashCode = (createErrorType == null ? 0 : createErrorType.hashCode()) * 31;
        Integer num = this.code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error_message;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasskeyCreateResultFailed(error_type=");
        sb.append(this.error_type);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", error_message=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.error_message, ")");
    }
}
