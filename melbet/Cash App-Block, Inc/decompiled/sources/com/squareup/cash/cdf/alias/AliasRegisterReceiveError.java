package com.squareup.cash.cdf.alias;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AliasRegisterReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final ErrorType error_type;
    public final String flow_token;
    public final Boolean is_re_registering;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType DUPLICATE_ALIAS;
        public static final ErrorType FAILURE;
        public static final ErrorType INVALID_ALIAS;
        public static final ErrorType TOO_MANY_REQUESTS;

        static {
            ErrorType errorType = new ErrorType("FAILURE", 0);
            FAILURE = errorType;
            ErrorType errorType2 = new ErrorType("NOT_ELIGIBLE", 1);
            ErrorType errorType3 = new ErrorType("TOO_MANY_REQUESTS", 2);
            TOO_MANY_REQUESTS = errorType3;
            ErrorType errorType4 = new ErrorType("DUPLICATE_ALIAS", 3);
            DUPLICATE_ALIAS = errorType4;
            ErrorType errorType5 = new ErrorType("INVALID_ALIAS", 4);
            INVALID_ALIAS = errorType5;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public AliasRegisterReceiveError(AliasType aliasType, ErrorType errorType, String str, Boolean bool) {
        this.alias_type = aliasType;
        this.error_type = errorType;
        this.flow_token = str;
        this.is_re_registering = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Alias", "cdf_action", "Register");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "is_re_registering", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasRegisterReceiveError)) {
            return false;
        }
        AliasRegisterReceiveError aliasRegisterReceiveError = (AliasRegisterReceiveError) obj;
        return this.alias_type == aliasRegisterReceiveError.alias_type && this.error_type == aliasRegisterReceiveError.error_type && Intrinsics.areEqual(this.flow_token, aliasRegisterReceiveError.flow_token) && Intrinsics.areEqual(this.is_re_registering, aliasRegisterReceiveError.is_re_registering);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Register ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AliasType aliasType = this.alias_type;
        int hashCode = (aliasType == null ? 0 : aliasType.hashCode()) * 31;
        ErrorType errorType = this.error_type;
        int hashCode2 = (hashCode + (errorType == null ? 0 : errorType.hashCode())) * 31;
        String str = this.flow_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.is_re_registering;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AliasRegisterReceiveError(alias_type=" + this.alias_type + ", error_type=" + this.error_type + ", flow_token=" + this.flow_token + ", is_re_registering=" + this.is_re_registering + ")";
    }

    public /* synthetic */ AliasRegisterReceiveError(AliasType aliasType, ErrorType errorType, String str) {
        this(aliasType, errorType, str, null);
    }
}
