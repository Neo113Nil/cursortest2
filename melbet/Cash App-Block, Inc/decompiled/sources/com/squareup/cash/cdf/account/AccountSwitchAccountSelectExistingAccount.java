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
public final class AccountSwitchAccountSelectExistingAccount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String account_token;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountSwitchAccountSelectExistingAccount(String str, String str2) {
        this.flow_token = str;
        this.account_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "account_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountSelectExistingAccount)) {
            return false;
        }
        AccountSwitchAccountSelectExistingAccount accountSwitchAccountSelectExistingAccount = (AccountSwitchAccountSelectExistingAccount) obj;
        return Intrinsics.areEqual(this.flow_token, accountSwitchAccountSelectExistingAccount.flow_token) && Intrinsics.areEqual(this.account_token, accountSwitchAccountSelectExistingAccount.account_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount SelectExistingAccount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.account_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AccountSwitchAccountSelectExistingAccount(flow_token=", this.flow_token, ", account_token=", this.account_token, ")");
    }
}
