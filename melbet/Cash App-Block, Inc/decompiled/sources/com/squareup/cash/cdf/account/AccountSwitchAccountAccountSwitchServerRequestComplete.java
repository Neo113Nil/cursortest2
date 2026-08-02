package com.squareup.cash.cdf.account;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.BreadcrumbHelper;
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
public final class AccountSwitchAccountAccountSwitchServerRequestComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long duration_ms;
    public final String error;
    public final String flow_token;
    public final String logged_in_account_token;
    public final String logged_out_account_token;
    public final LinkedHashMap parameters;
    public final AccountSwitchResult result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AccountSwitchResult {
        public static final /* synthetic */ AccountSwitchResult[] $VALUES;
        public static final AccountSwitchResult FAILURE;
        public static final AccountSwitchResult SUCCESS;

        static {
            AccountSwitchResult accountSwitchResult = new AccountSwitchResult("SUCCESS", 0);
            SUCCESS = accountSwitchResult;
            AccountSwitchResult accountSwitchResult2 = new AccountSwitchResult("FAILURE", 1);
            FAILURE = accountSwitchResult2;
            $VALUES = new AccountSwitchResult[]{accountSwitchResult, accountSwitchResult2};
        }

        public static AccountSwitchResult valueOf(String str) {
            return (AccountSwitchResult) Enum.valueOf(AccountSwitchResult.class, str);
        }

        public static AccountSwitchResult[] values() {
            return (AccountSwitchResult[]) $VALUES.clone();
        }
    }

    public AccountSwitchAccountAccountSwitchServerRequestComplete(String str, String str2, String str3, Long l, AccountSwitchResult accountSwitchResult, String str4) {
        this.flow_token = str;
        this.logged_out_account_token = str2;
        this.logged_in_account_token = str3;
        this.duration_ms = l;
        this.result = accountSwitchResult;
        this.error = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "logged_out_account_token", str2);
        Countries.putSafe(m, "logged_in_account_token", str3);
        Countries.putSafe(m, "duration_ms", l);
        Countries.putSafe(m, "result", accountSwitchResult);
        Countries.putSafe(m, BreadcrumbHelper.Category.ERROR, str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountAccountSwitchServerRequestComplete)) {
            return false;
        }
        AccountSwitchAccountAccountSwitchServerRequestComplete accountSwitchAccountAccountSwitchServerRequestComplete = (AccountSwitchAccountAccountSwitchServerRequestComplete) obj;
        return Intrinsics.areEqual(this.flow_token, accountSwitchAccountAccountSwitchServerRequestComplete.flow_token) && Intrinsics.areEqual(this.logged_out_account_token, accountSwitchAccountAccountSwitchServerRequestComplete.logged_out_account_token) && Intrinsics.areEqual(this.logged_in_account_token, accountSwitchAccountAccountSwitchServerRequestComplete.logged_in_account_token) && this.duration_ms.equals(accountSwitchAccountAccountSwitchServerRequestComplete.duration_ms) && this.result == accountSwitchAccountAccountSwitchServerRequestComplete.result && Intrinsics.areEqual(this.error, accountSwitchAccountAccountSwitchServerRequestComplete.error);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount AccountSwitchServerRequestComplete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logged_out_account_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logged_in_account_token;
        int hashCode3 = (this.result.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.duration_ms, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 961)) * 31;
        String str4 = this.error;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSwitchAccountAccountSwitchServerRequestComplete(flow_token=", this.flow_token, ", logged_out_account_token=", this.logged_out_account_token, ", logged_in_account_token=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.duration_ms, this.logged_in_account_token, ", duration_ms=", ", source=null, result=", m);
        m.append(this.result);
        m.append(", error=");
        m.append(this.error);
        m.append(")");
        return m.toString();
    }
}
