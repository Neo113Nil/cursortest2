package com.squareup.cash.cdf.account;

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
public final class AccountAuthenticateComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer attempt_count;
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final AuthenticationResult result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class AuthenticationResult {
        public static final /* synthetic */ AuthenticationResult[] $VALUES;
        public static final AuthenticationResult CANCELED;
        public static final AuthenticationResult FAILURE;
        public static final AuthenticationResult SUCCESS;

        static {
            AuthenticationResult authenticationResult = new AuthenticationResult("SUCCESS", 0);
            SUCCESS = authenticationResult;
            AuthenticationResult authenticationResult2 = new AuthenticationResult("FAILURE", 1);
            FAILURE = authenticationResult2;
            AuthenticationResult authenticationResult3 = new AuthenticationResult("CANCELED", 2);
            CANCELED = authenticationResult3;
            $VALUES = new AuthenticationResult[]{authenticationResult, authenticationResult2, authenticationResult3};
        }

        public static AuthenticationResult valueOf(String str) {
            return (AuthenticationResult) Enum.valueOf(AuthenticationResult.class, str);
        }

        public static AuthenticationResult[] values() {
            return (AuthenticationResult[]) $VALUES.clone();
        }
    }

    public AccountAuthenticateComplete(String str, String str2, AuthenticationResult authenticationResult, Integer num) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.result = authenticationResult;
        this.attempt_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "result", authenticationResult);
        Countries.putSafe(m, "attempt_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticateComplete)) {
            return false;
        }
        AccountAuthenticateComplete accountAuthenticateComplete = (AccountAuthenticateComplete) obj;
        return Intrinsics.areEqual(this.client_scenario, accountAuthenticateComplete.client_scenario) && Intrinsics.areEqual(this.flow_token, accountAuthenticateComplete.flow_token) && this.result == accountAuthenticateComplete.result && this.attempt_count.equals(accountAuthenticateComplete.attempt_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.attempt_count.hashCode() + ((this.result.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountAuthenticateComplete(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", result=");
        m.append(this.result);
        m.append(", attempt_count=");
        m.append(this.attempt_count);
        m.append(")");
        return m.toString();
    }
}
