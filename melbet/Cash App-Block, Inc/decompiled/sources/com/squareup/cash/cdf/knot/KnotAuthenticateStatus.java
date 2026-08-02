package com.squareup.cash.cdf.knot;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class KnotAuthenticateStatus implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String merchant_id;
    public final String merchant_name;
    public final LinkedHashMap parameters;
    public final RequirementType requirement_type;
    public final AuthenticationStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AuthenticationStatus {
        public static final /* synthetic */ AuthenticationStatus[] $VALUES;
        public static final AuthenticationStatus REQUIREMENT_NEEDED;
        public static final AuthenticationStatus STARTED;
        public static final AuthenticationStatus SUCCESS;

        static {
            AuthenticationStatus authenticationStatus = new AuthenticationStatus("STARTED", 0);
            STARTED = authenticationStatus;
            AuthenticationStatus authenticationStatus2 = new AuthenticationStatus("SUCCESS", 1);
            SUCCESS = authenticationStatus2;
            AuthenticationStatus authenticationStatus3 = new AuthenticationStatus("REQUIREMENT_NEEDED", 2);
            REQUIREMENT_NEEDED = authenticationStatus3;
            $VALUES = new AuthenticationStatus[]{authenticationStatus, authenticationStatus2, authenticationStatus3};
        }

        public static AuthenticationStatus valueOf(String str) {
            return (AuthenticationStatus) Enum.valueOf(AuthenticationStatus.class, str);
        }

        public static AuthenticationStatus[] values() {
            return (AuthenticationStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class RequirementType {
        public static final /* synthetic */ RequirementType[] $VALUES;
        public static final RequirementType APPROVAL_REQUIRED;
        public static final RequirementType LICENSE_REQUIRED;
        public static final RequirementType OTP_REQUIRED;
        public static final RequirementType SECURITY_QUESTIONS_REQUIRED;
        public static final RequirementType ZIPCODE_REQUIRED;

        static {
            RequirementType requirementType = new RequirementType("OTP_REQUIRED", 0);
            OTP_REQUIRED = requirementType;
            RequirementType requirementType2 = new RequirementType("SECURITY_QUESTIONS_REQUIRED", 1);
            SECURITY_QUESTIONS_REQUIRED = requirementType2;
            RequirementType requirementType3 = new RequirementType("APPROVAL_REQUIRED", 2);
            APPROVAL_REQUIRED = requirementType3;
            RequirementType requirementType4 = new RequirementType("ZIPCODE_REQUIRED", 3);
            ZIPCODE_REQUIRED = requirementType4;
            RequirementType requirementType5 = new RequirementType("LICENSE_REQUIRED", 4);
            LICENSE_REQUIRED = requirementType5;
            $VALUES = new RequirementType[]{requirementType, requirementType2, requirementType3, requirementType4, requirementType5};
        }

        public static RequirementType valueOf(String str) {
            return (RequirementType) Enum.valueOf(RequirementType.class, str);
        }

        public static RequirementType[] values() {
            return (RequirementType[]) $VALUES.clone();
        }
    }

    public KnotAuthenticateStatus(String str, String str2, AuthenticationStatus authenticationStatus, RequirementType requirementType) {
        this.merchant_id = str;
        this.merchant_name = str2;
        this.status = authenticationStatus;
        this.requirement_type = requirementType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Knot", "cdf_action", "Authenticate");
        Countries.putSafe(m, "merchant_id", str);
        Countries.putSafe(m, "merchant_name", str2);
        Countries.putSafe(m, "status", authenticationStatus);
        Countries.putSafe(m, "requirement_type", requirementType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnotAuthenticateStatus)) {
            return false;
        }
        KnotAuthenticateStatus knotAuthenticateStatus = (KnotAuthenticateStatus) obj;
        return Intrinsics.areEqual(this.merchant_id, knotAuthenticateStatus.merchant_id) && Intrinsics.areEqual(this.merchant_name, knotAuthenticateStatus.merchant_name) && this.status == knotAuthenticateStatus.status && this.requirement_type == knotAuthenticateStatus.requirement_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Knot Authenticate Status";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.merchant_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchant_name;
        int hashCode2 = (this.status.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        RequirementType requirementType = this.requirement_type;
        return hashCode2 + (requirementType != null ? requirementType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KnotAuthenticateStatus(merchant_id=", this.merchant_id, ", merchant_name=", this.merchant_name, ", status=");
        m.append(this.status);
        m.append(", requirement_type=");
        m.append(this.requirement_type);
        m.append(")");
        return m.toString();
    }
}
