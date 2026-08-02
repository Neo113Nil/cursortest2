package com.squareup.cash.cdf.account;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSignInStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final Boolean country_code_selector_enabled;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountSignInStart(AliasType aliasType, Boolean bool, String str) {
        Boolean bool2 = Boolean.FALSE;
        this.alias_type = aliasType;
        this.country_code_selector_enabled = bool;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Account", "cdf_action", "SignIn");
        Countries.putSafe(m, "alias_prefilled", bool2);
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "country_code_selector_enabled", bool);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSignInStart)) {
            return false;
        }
        AccountSignInStart accountSignInStart = (AccountSignInStart) obj;
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && this.alias_type == accountSignInStart.alias_type && this.country_code_selector_enabled.equals(accountSignInStart.country_code_selector_enabled) && Intrinsics.areEqual(this.flow_token, accountSignInStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SignIn Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = Boolean.FALSE.hashCode() * 31;
        AliasType aliasType = this.alias_type;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.country_code_selector_enabled, (hashCode + (aliasType == null ? 0 : aliasType.hashCode())) * 31, 31);
        String str = this.flow_token;
        return m + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AccountSignInStart(alias_prefilled=" + Boolean.FALSE + ", alias_type=" + this.alias_type + ", country_code_selector_enabled=" + this.country_code_selector_enabled + ", flow_token=" + this.flow_token + ")";
    }
}
