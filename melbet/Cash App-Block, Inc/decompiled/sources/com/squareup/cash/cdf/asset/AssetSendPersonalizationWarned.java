package com.squareup.cash.cdf.asset;

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
public final class AssetSendPersonalizationWarned implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String displayed_error;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetSendPersonalizationWarned(String str, String str2, String str3) {
        this.external_id = str;
        this.flow_token = str2;
        this.displayed_error = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "displayed_error", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendPersonalizationWarned)) {
            return false;
        }
        AssetSendPersonalizationWarned assetSendPersonalizationWarned = (AssetSendPersonalizationWarned) obj;
        return Intrinsics.areEqual(this.external_id, assetSendPersonalizationWarned.external_id) && Intrinsics.areEqual(this.flow_token, assetSendPersonalizationWarned.flow_token) && Intrinsics.areEqual(this.displayed_error, assetSendPersonalizationWarned.displayed_error);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send PersonalizationWarned";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 29791;
        String str3 = this.displayed_error;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendPersonalizationWarned(external_id=", this.external_id, ", flow_token=", this.flow_token, ", time_started=null, time_ended=null, displayed_error="), this.displayed_error, ")");
    }
}
