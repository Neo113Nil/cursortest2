package com.squareup.cash.cdf.account;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class AccountSwitchAccountAccountSwitched implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long duration_ms;
    public final String flow_token;
    public final Long jvmHeapBytes;
    public final String logged_in_account_token;
    public final String logged_out_account_token;
    public final Long nativeHeapBytes;
    public final LinkedHashMap parameters;
    public final AccountSwitchSource source;

    public AccountSwitchAccountAccountSwitched(String str, String str2, String str3, Long l, AccountSwitchSource accountSwitchSource, Long l2, Long l3) {
        this.flow_token = str;
        this.logged_out_account_token = str2;
        this.logged_in_account_token = str3;
        this.duration_ms = l;
        this.source = accountSwitchSource;
        this.jvmHeapBytes = l2;
        this.nativeHeapBytes = l3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "logged_out_account_token", str2);
        Countries.putSafe(m, "logged_in_account_token", str3);
        Countries.putSafe(m, "duration_ms", l);
        Countries.putSafe(m, "source", accountSwitchSource);
        Countries.putSafe(m, "jvmHeapBytes", l2);
        Countries.putSafe(m, "nativeHeapBytes", l3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountAccountSwitched)) {
            return false;
        }
        AccountSwitchAccountAccountSwitched accountSwitchAccountAccountSwitched = (AccountSwitchAccountAccountSwitched) obj;
        return Intrinsics.areEqual(this.flow_token, accountSwitchAccountAccountSwitched.flow_token) && Intrinsics.areEqual(this.logged_out_account_token, accountSwitchAccountAccountSwitched.logged_out_account_token) && Intrinsics.areEqual(this.logged_in_account_token, accountSwitchAccountAccountSwitched.logged_in_account_token) && this.duration_ms.equals(accountSwitchAccountAccountSwitched.duration_ms) && this.source == accountSwitchAccountAccountSwitched.source && this.jvmHeapBytes.equals(accountSwitchAccountAccountSwitched.jvmHeapBytes) && this.nativeHeapBytes.equals(accountSwitchAccountAccountSwitched.nativeHeapBytes);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount AccountSwitched";
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
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.duration_ms, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        AccountSwitchSource accountSwitchSource = this.source;
        return this.nativeHeapBytes.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.jvmHeapBytes, (m + (accountSwitchSource != null ? accountSwitchSource.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSwitchAccountAccountSwitched(flow_token=", this.flow_token, ", logged_out_account_token=", this.logged_out_account_token, ", logged_in_account_token=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.duration_ms, this.logged_in_account_token, ", duration_ms=", ", source=", m);
        m.append(this.source);
        m.append(", jvmHeapBytes=");
        m.append(this.jvmHeapBytes);
        m.append(", nativeHeapBytes=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.nativeHeapBytes, ")");
    }
}
