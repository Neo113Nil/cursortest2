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
public final class MintStatusRowViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_id;
    public final LinkedHashMap parameters;
    public final String status_subtitle;
    public final String status_title;
    public final String theme_token;

    public MintStatusRowViewed(String str, String str2, String str3, String str4) {
        this.theme_token = str;
        this.device_id = str2;
        this.status_title = str3;
        this.status_subtitle = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "MintStatus", "cdf_action", "Row");
        Countries.putSafe(m, "theme_token", str);
        Countries.putSafe(m, "device_id", str2);
        Countries.putSafe(m, "status_title", str3);
        Countries.putSafe(m, "status_subtitle", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintStatusRowViewed)) {
            return false;
        }
        MintStatusRowViewed mintStatusRowViewed = (MintStatusRowViewed) obj;
        return Intrinsics.areEqual(this.theme_token, mintStatusRowViewed.theme_token) && Intrinsics.areEqual(this.device_id, mintStatusRowViewed.device_id) && Intrinsics.areEqual(this.status_title, mintStatusRowViewed.status_title) && Intrinsics.areEqual(this.status_subtitle, mintStatusRowViewed.status_subtitle);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintStatus Row Viewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.theme_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.device_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status_title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status_subtitle;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MintStatusRowViewed(device_type=null, theme_token=", this.theme_token, ", device_id=", this.device_id, ", status_title="), this.status_title, ", status_subtitle=", this.status_subtitle, ")");
    }
}
