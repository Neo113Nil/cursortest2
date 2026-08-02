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
public final class AliasVerifyStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AliasVerifyStart(AliasType aliasType, String str) {
        this.alias_type = aliasType;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Alias", "cdf_action", "Verify");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasVerifyStart)) {
            return false;
        }
        AliasVerifyStart aliasVerifyStart = (AliasVerifyStart) obj;
        return this.alias_type == aliasVerifyStart.alias_type && Intrinsics.areEqual(this.flow_token, aliasVerifyStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Verify Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.alias_type.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AliasVerifyStart(alias_type=" + this.alias_type + ", flow_token=" + this.flow_token + ")";
    }
}
