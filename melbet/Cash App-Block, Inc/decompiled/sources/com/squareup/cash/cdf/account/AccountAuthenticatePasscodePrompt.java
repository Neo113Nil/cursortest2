package com.squareup.cash.cdf.account;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class AccountAuthenticatePasscodePrompt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountAuthenticatePasscodePrompt(String str, String str2) {
        this.client_scenario = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "Authenticate");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthenticatePasscodePrompt)) {
            return false;
        }
        AccountAuthenticatePasscodePrompt accountAuthenticatePasscodePrompt = (AccountAuthenticatePasscodePrompt) obj;
        return Intrinsics.areEqual(this.client_scenario, accountAuthenticatePasscodePrompt.client_scenario) && Intrinsics.areEqual(this.flow_token, accountAuthenticatePasscodePrompt.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Authenticate PasscodePrompt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AccountAuthenticatePasscodePrompt(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ")");
    }
}
