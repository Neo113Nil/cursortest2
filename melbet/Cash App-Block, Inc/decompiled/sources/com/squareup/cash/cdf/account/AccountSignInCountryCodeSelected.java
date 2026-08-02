package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AccountSignInCountryCodeSelected implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String current_selected_country_code;
    public final String flow_token;
    public final String new_selected_country_code;
    public final LinkedHashMap parameters;

    public AccountSignInCountryCodeSelected(String str, String str2, String str3) {
        this.current_selected_country_code = str;
        this.new_selected_country_code = str2;
        this.flow_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "SignIn");
        Countries.putSafe(m, "current_selected_country_code", str);
        Countries.putSafe(m, "new_selected_country_code", str2);
        Countries.putSafe(m, "flow_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSignInCountryCodeSelected)) {
            return false;
        }
        AccountSignInCountryCodeSelected accountSignInCountryCodeSelected = (AccountSignInCountryCodeSelected) obj;
        return Intrinsics.areEqual(this.current_selected_country_code, accountSignInCountryCodeSelected.current_selected_country_code) && Intrinsics.areEqual(this.new_selected_country_code, accountSignInCountryCodeSelected.new_selected_country_code) && Intrinsics.areEqual(this.flow_token, accountSignInCountryCodeSelected.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SignIn CountryCodeSelected";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.current_selected_country_code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.new_selected_country_code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSignInCountryCodeSelected(current_selected_country_code=", this.current_selected_country_code, ", new_selected_country_code=", this.new_selected_country_code, ", flow_token="), this.flow_token, ")");
    }
}
