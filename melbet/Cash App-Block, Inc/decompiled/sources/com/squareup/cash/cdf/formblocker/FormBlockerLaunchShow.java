package com.squareup.cash.cdf.formblocker;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
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

/* loaded from: classes.dex */
public final class FormBlockerLaunchShow implements Event {
    public static final zzd Companion = new zzd(21);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE});
    public final String blockerId;
    public final String client_scenario;
    public final Integer element_count;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String unique_element_names;

    public FormBlockerLaunchShow(Integer num, String str, String str2, String str3, String str4) {
        this.blockerId = str;
        this.client_scenario = str2;
        this.flow_token = str3;
        this.unique_element_names = str4;
        this.element_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "FormBlocker", "cdf_action", "Launch");
        Countries.putSafe(m, "blockerId", str);
        Countries.putSafe(m, "client_scenario", str2);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "unique_element_names", str4);
        Countries.putSafe(m, "element_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormBlockerLaunchShow)) {
            return false;
        }
        FormBlockerLaunchShow formBlockerLaunchShow = (FormBlockerLaunchShow) obj;
        return Intrinsics.areEqual(this.blockerId, formBlockerLaunchShow.blockerId) && Intrinsics.areEqual(this.client_scenario, formBlockerLaunchShow.client_scenario) && Intrinsics.areEqual(this.flow_token, formBlockerLaunchShow.flow_token) && this.unique_element_names.equals(formBlockerLaunchShow.unique_element_names) && this.element_count.equals(formBlockerLaunchShow.element_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FormBlocker Launch Show";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blockerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.client_scenario;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        return this.element_count.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.unique_element_names);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormBlockerLaunchShow(blockerId=", this.blockerId, ", client_scenario=", this.client_scenario, ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", unique_element_names=", this.unique_element_names, ", element_count=");
        return NavAction$$ExternalSyntheticOutline0.m(m, this.element_count, ")");
    }
}
