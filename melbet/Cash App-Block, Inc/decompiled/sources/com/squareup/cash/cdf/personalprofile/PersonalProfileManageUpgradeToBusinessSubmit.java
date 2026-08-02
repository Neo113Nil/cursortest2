package com.squareup.cash.cdf.personalprofile;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalProfileManageUpgradeToBusinessSubmit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_upgrade_flow_token;
    public final LinkedHashMap parameters;

    public PersonalProfileManageUpgradeToBusinessSubmit(String str) {
        this.business_upgrade_flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PersonalProfile", "cdf_action", "Manage");
        Countries.putSafe(m, "business_upgrade_flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalProfileManageUpgradeToBusinessSubmit) && Intrinsics.areEqual(this.business_upgrade_flow_token, ((PersonalProfileManageUpgradeToBusinessSubmit) obj).business_upgrade_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile Manage UpgradeToBusinessSubmit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.business_upgrade_flow_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PersonalProfileManageUpgradeToBusinessSubmit(business_upgrade_flow_token=", this.business_upgrade_flow_token, ")");
    }
}
