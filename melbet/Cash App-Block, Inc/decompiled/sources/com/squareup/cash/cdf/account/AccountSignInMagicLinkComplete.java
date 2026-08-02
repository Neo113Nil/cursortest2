package com.squareup.cash.cdf.account;

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
public final class AccountSignInMagicLinkComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Result result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Result {
        public static final /* synthetic */ Result[] $VALUES;
        public static final Result EXPIRED_VERIFICATION_TOKEN;
        public static final Result INVALID;
        public static final Result INVALID_APP_TOKEN;
        public static final Result INVALID_FLOW;
        public static final Result INVALID_VERIFICATION_TOKEN;
        public static final Result NOT_ELIGIBLE;
        public static final Result SUCCESS;
        public static final Result TOO_MANY_FAILED_ATTEMPTS;

        static {
            Result result = new Result("INVALID", 0);
            INVALID = result;
            Result result2 = new Result("SUCCESS", 1);
            SUCCESS = result2;
            Result result3 = new Result("INVALID_APP_TOKEN", 2);
            INVALID_APP_TOKEN = result3;
            Result result4 = new Result("INVALID_VERIFICATION_TOKEN", 3);
            INVALID_VERIFICATION_TOKEN = result4;
            Result result5 = new Result("EXPIRED_VERIFICATION_TOKEN", 4);
            EXPIRED_VERIFICATION_TOKEN = result5;
            Result result6 = new Result("TOO_MANY_FAILED_ATTEMPTS", 5);
            TOO_MANY_FAILED_ATTEMPTS = result6;
            Result result7 = new Result("NOT_ELIGIBLE", 6);
            NOT_ELIGIBLE = result7;
            Result result8 = new Result("GENERIC_FAILURE", 7);
            Result result9 = new Result("INVALID_FLOW", 8);
            INVALID_FLOW = result9;
            $VALUES = new Result[]{result, result2, result3, result4, result5, result6, result7, result8, result9, new Result("DUPLICATE_ATTEMPT", 9)};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    public AccountSignInMagicLinkComplete(String str, Result result) {
        this.flow_token = str;
        this.result = result;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "SignIn");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "result", result);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSignInMagicLinkComplete)) {
            return false;
        }
        AccountSignInMagicLinkComplete accountSignInMagicLinkComplete = (AccountSignInMagicLinkComplete) obj;
        return Intrinsics.areEqual(this.flow_token, accountSignInMagicLinkComplete.flow_token) && this.result == accountSignInMagicLinkComplete.result;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SignIn MagicLinkComplete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.result.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AccountSignInMagicLinkComplete(flow_token=" + this.flow_token + ", result=" + this.result + ")";
    }
}
