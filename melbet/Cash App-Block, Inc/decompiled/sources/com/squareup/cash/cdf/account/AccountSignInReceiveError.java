package com.squareup.cash.cdf.account;

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

/* loaded from: classes6.dex */
public final class AccountSignInReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final ErrorType error_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
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

    public AccountSignInReceiveError(AliasType aliasType, ErrorType errorType, String str) {
        this.alias_type = aliasType;
        this.error_type = errorType;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "SignIn");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSignInReceiveError)) {
            return false;
        }
        AccountSignInReceiveError accountSignInReceiveError = (AccountSignInReceiveError) obj;
        return this.alias_type == accountSignInReceiveError.alias_type && this.error_type == accountSignInReceiveError.error_type && Intrinsics.areEqual(this.flow_token, accountSignInReceiveError.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SignIn ReceiveError";
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
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSignInReceiveError(alias_type=");
        sb.append(this.alias_type);
        sb.append(", error_type=");
        sb.append(this.error_type);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
