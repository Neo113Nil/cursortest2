package com.squareup.cash.cdf.mintstatus;

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
public final class MintStatusRowActionTapped implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String action_label;
    public final String action_url;
    public final String device_id;
    public final LinkedHashMap parameters;
    public final String theme_token;

    public MintStatusRowActionTapped(String str, String str2, String str3, String str4) {
        this.theme_token = str;
        this.device_id = str2;
        this.action_label = str3;
        this.action_url = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "MintStatus", "cdf_action", "Row");
        Countries.putSafe(m, "theme_token", str);
        Countries.putSafe(m, "device_id", str2);
        Countries.putSafe(m, "action_label", str3);
        Countries.putSafe(m, "action_url", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintStatusRowActionTapped)) {
            return false;
        }
        MintStatusRowActionTapped mintStatusRowActionTapped = (MintStatusRowActionTapped) obj;
        return Intrinsics.areEqual(this.theme_token, mintStatusRowActionTapped.theme_token) && Intrinsics.areEqual(this.device_id, mintStatusRowActionTapped.device_id) && this.action_label.equals(mintStatusRowActionTapped.action_label) && Intrinsics.areEqual(this.action_url, mintStatusRowActionTapped.action_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintStatus Row ActionTapped";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.theme_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.device_id;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.action_label);
        String str3 = this.action_url;
        return m + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MintStatusRowActionTapped(device_type=null, theme_token=", this.theme_token, ", device_id=", this.device_id, ", action_label="), this.action_label, ", action_url=", this.action_url, ")");
    }
}
