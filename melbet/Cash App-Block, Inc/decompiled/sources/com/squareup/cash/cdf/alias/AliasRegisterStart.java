package com.squareup.cash.cdf.alias;

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

/* loaded from: classes6.dex */
public final class AliasRegisterStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final Boolean is_re_registering;
    public final LinkedHashMap parameters;
    public final Boolean prefilled_alias;

    public AliasRegisterStart(AliasType aliasType, String str, Boolean bool, Boolean bool2) {
        this.alias_type = aliasType;
        this.flow_token = str;
        this.is_re_registering = bool;
        this.prefilled_alias = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Alias", "cdf_action", "Register");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "is_re_registering", bool);
        Countries.putSafe(m, "prefilled_alias", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasRegisterStart)) {
            return false;
        }
        AliasRegisterStart aliasRegisterStart = (AliasRegisterStart) obj;
        return this.alias_type == aliasRegisterStart.alias_type && Intrinsics.areEqual(this.flow_token, aliasRegisterStart.flow_token) && Intrinsics.areEqual(this.is_re_registering, aliasRegisterStart.is_re_registering) && Intrinsics.areEqual(this.prefilled_alias, aliasRegisterStart.prefilled_alias);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Register Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AliasType aliasType = this.alias_type;
        int hashCode = (aliasType == null ? 0 : aliasType.hashCode()) * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.is_re_registering;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.prefilled_alias;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "AliasRegisterStart(alias_type=" + this.alias_type + ", flow_token=" + this.flow_token + ", is_re_registering=" + this.is_re_registering + ", prefilled_alias=" + this.prefilled_alias + ")";
    }

    public /* synthetic */ AliasRegisterStart(AliasType aliasType, Boolean bool, String str) {
        this(aliasType, str, bool, null);
    }
}
