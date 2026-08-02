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
public final class AliasRegisterComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BULLETIN, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final Boolean is_re_registering;
    public final LinkedHashMap parameters;

    public AliasRegisterComplete(AliasType aliasType, Boolean bool, String str) {
        this.alias_type = aliasType;
        this.flow_token = str;
        this.is_re_registering = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Alias", "cdf_action", "Register");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "is_re_registering", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasRegisterComplete)) {
            return false;
        }
        AliasRegisterComplete aliasRegisterComplete = (AliasRegisterComplete) obj;
        return this.alias_type == aliasRegisterComplete.alias_type && Intrinsics.areEqual(this.flow_token, aliasRegisterComplete.flow_token) && this.is_re_registering.equals(aliasRegisterComplete.is_re_registering);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Alias Register Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AliasType aliasType = this.alias_type;
        int hashCode = (aliasType == null ? 0 : aliasType.hashCode()) * 31;
        String str = this.flow_token;
        return ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_re_registering, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AliasRegisterComplete(alias_type=");
        sb.append(this.alias_type);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", is_re_registering=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_re_registering, ", use_suggested_alias=null)");
    }
}
