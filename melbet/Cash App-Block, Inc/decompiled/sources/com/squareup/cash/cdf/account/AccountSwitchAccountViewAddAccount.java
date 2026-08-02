package com.squareup.cash.cdf.account;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class AccountSwitchAccountViewAddAccount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean can_add_business_account;
    public final Boolean can_add_personal_account;
    public final Boolean can_link_accounts;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountSwitchAccountViewAddAccount(String str, Boolean bool, Boolean bool2, Boolean bool3) {
        this.flow_token = str;
        this.can_add_personal_account = bool;
        this.can_add_business_account = bool2;
        this.can_link_accounts = bool3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "can_add_personal_account", bool);
        Countries.putSafe(m, "can_add_business_account", bool2);
        Countries.putSafe(m, "can_link_accounts", bool3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountViewAddAccount)) {
            return false;
        }
        AccountSwitchAccountViewAddAccount accountSwitchAccountViewAddAccount = (AccountSwitchAccountViewAddAccount) obj;
        return Intrinsics.areEqual(this.flow_token, accountSwitchAccountViewAddAccount.flow_token) && this.can_add_personal_account.equals(accountSwitchAccountViewAddAccount.can_add_personal_account) && this.can_add_business_account.equals(accountSwitchAccountViewAddAccount.can_add_business_account) && this.can_link_accounts.equals(accountSwitchAccountViewAddAccount.can_link_accounts);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount ViewAddAccount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.can_link_accounts.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.can_add_business_account, ViewEvent$State$EnumUnboxingLocalUtility.m(this.can_add_personal_account, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.can_add_personal_account, "AccountSwitchAccountViewAddAccount(flow_token=", this.flow_token, ", can_add_personal_account=", ", can_add_business_account=");
        m.append(this.can_add_business_account);
        m.append(", can_link_accounts=");
        m.append(this.can_link_accounts);
        m.append(")");
        return m.toString();
    }
}
