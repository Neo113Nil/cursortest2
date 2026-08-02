package com.squareup.cash.cdf.alias;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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

/* loaded from: classes6.dex */
public final class AliasVerifyComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final Boolean auto_verified;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AliasVerifyComplete(AliasType aliasType, Boolean bool, String str) {
        this.alias_type = aliasType;
        this.flow_token = str;
        this.auto_verified = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Alias", "cdf_action", "Verify");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "auto_verified", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasVerifyComplete)) {
            return false;
        }
        AliasVerifyComplete aliasVerifyComplete = (AliasVerifyComplete) obj;
        return this.alias_type == aliasVerifyComplete.alias_type && Intrinsics.areEqual(this.flow_token, aliasVerifyComplete.flow_token) && this.auto_verified.equals(aliasVerifyComplete.auto_verified);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Verify Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.alias_type.hashCode() * 31;
        String str = this.flow_token;
        return ViewEvent$State$EnumUnboxingLocalUtility.m(this.auto_verified, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AliasVerifyComplete(alias_type=");
        sb.append(this.alias_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", auto_verified=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.auto_verified, ", dual_sim_country_iso=null)");
    }
}
