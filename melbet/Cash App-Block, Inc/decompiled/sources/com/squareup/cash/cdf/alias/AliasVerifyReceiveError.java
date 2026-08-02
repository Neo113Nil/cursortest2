package com.squareup.cash.cdf.alias;

import com.google.mlkit.common.internal.zze;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AliasVerifyReceiveError implements Event {
    public static final zze Companion = new zze(14);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final ErrorType error_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType EXPIRED_CODE;
        public static final ErrorType FAILURE;
        public static final ErrorType INVALID_ALIAS;
        public static final ErrorType INVALID_VERIFICATION_CODE;
        public static final ErrorType NOT_ELIGIBLE;
        public static final ErrorType TOO_MANY_FAILED_ATTEMPTS;

        static {
            ErrorType errorType = new ErrorType("FAILURE", 0);
            FAILURE = errorType;
            ErrorType errorType2 = new ErrorType("NOT_ELIGIBLE", 1);
            NOT_ELIGIBLE = errorType2;
            ErrorType errorType3 = new ErrorType("TOO_MANY_FAILED_ATTEMPTS", 2);
            TOO_MANY_FAILED_ATTEMPTS = errorType3;
            ErrorType errorType4 = new ErrorType("EXPIRED_CODE", 3);
            EXPIRED_CODE = errorType4;
            ErrorType errorType5 = new ErrorType("INVALID_VERIFICATION_CODE", 4);
            INVALID_VERIFICATION_CODE = errorType5;
            ErrorType errorType6 = new ErrorType("INVALID_ALIAS", 5);
            INVALID_ALIAS = errorType6;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5, errorType6};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public AliasVerifyReceiveError(AliasType aliasType, ErrorType errorType, String str) {
        this.alias_type = aliasType;
        this.error_type = errorType;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Alias", "cdf_action", "Verify");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasVerifyReceiveError)) {
            return false;
        }
        AliasVerifyReceiveError aliasVerifyReceiveError = (AliasVerifyReceiveError) obj;
        return this.alias_type == aliasVerifyReceiveError.alias_type && this.error_type == aliasVerifyReceiveError.error_type && Intrinsics.areEqual(this.flow_token, aliasVerifyReceiveError.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Verify ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.error_type.hashCode() + (this.alias_type.hashCode() * 31)) * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AliasVerifyReceiveError(alias_type=");
        sb.append(this.alias_type);
        sb.append(", error_type=");
        sb.append(this.error_type);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
