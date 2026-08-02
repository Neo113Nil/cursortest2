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
public final class AccountSwitchAccountFetchAccountsError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String error_code;
    public final String error_message;
    public final LinkedHashMap parameters;

    public AccountSwitchAccountFetchAccountsError(String str, String str2) {
        this.error_message = str;
        this.error_code = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "error_message", str);
        Countries.putSafe(m, "error_code", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountFetchAccountsError)) {
            return false;
        }
        AccountSwitchAccountFetchAccountsError accountSwitchAccountFetchAccountsError = (AccountSwitchAccountFetchAccountsError) obj;
        return this.error_message.equals(accountSwitchAccountFetchAccountsError.error_message) && Intrinsics.areEqual(this.error_code, accountSwitchAccountFetchAccountsError.error_code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount FetchAccountsError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.error_message.hashCode() * 31;
        String str = this.error_code;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AccountSwitchAccountFetchAccountsError(error_message=", this.error_message, ", error_code=", this.error_code, ")");
    }
}
