package com.squareup.cash.cdf.sponsoredaccount;

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
public final class SponsoredAccountManageToggleDependentControl implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DependentControlType dependent_control_type;
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;
    public final ToggleValue toggle_value;

    public SponsoredAccountManageToggleDependentControl(DependentControlType dependentControlType, ToggleValue toggleValue, String str) {
        this.dependent_control_type = dependentControlType;
        this.toggle_value = toggleValue;
        this.dependent_customer_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "SponsoredAccount", "cdf_action", "Manage");
        Countries.putSafe(m, "dependent_control_type", dependentControlType);
        Countries.putSafe(m, "toggle_value", toggleValue);
        Countries.putSafe(m, "dependent_customer_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountManageToggleDependentControl)) {
            return false;
        }
        SponsoredAccountManageToggleDependentControl sponsoredAccountManageToggleDependentControl = (SponsoredAccountManageToggleDependentControl) obj;
        return this.dependent_control_type == sponsoredAccountManageToggleDependentControl.dependent_control_type && this.toggle_value == sponsoredAccountManageToggleDependentControl.toggle_value && Intrinsics.areEqual(this.dependent_customer_token, sponsoredAccountManageToggleDependentControl.dependent_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount Manage ToggleDependentControl";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.toggle_value.hashCode() + (this.dependent_control_type.hashCode() * 31)) * 31;
        String str = this.dependent_customer_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SponsoredAccountManageToggleDependentControl(dependent_control_type=");
        sb.append(this.dependent_control_type);
        sb.append(", toggle_value=");
        sb.append(this.toggle_value);
        sb.append(", dependent_customer_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.dependent_customer_token, ")");
    }
}
