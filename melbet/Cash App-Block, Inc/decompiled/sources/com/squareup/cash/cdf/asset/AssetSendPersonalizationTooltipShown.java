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
public final class AssetSendPersonalizationTooltipShown implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EntryPoint entry_point;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetSendPersonalizationTooltipShown(String str, EntryPoint entryPoint, String str2) {
        this.external_id = str;
        this.entry_point = entryPoint;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "entry_point", entryPoint);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendPersonalizationTooltipShown)) {
            return false;
        }
        AssetSendPersonalizationTooltipShown assetSendPersonalizationTooltipShown = (AssetSendPersonalizationTooltipShown) obj;
        return Intrinsics.areEqual(this.external_id, assetSendPersonalizationTooltipShown.external_id) && this.entry_point == assetSendPersonalizationTooltipShown.entry_point && Intrinsics.areEqual(this.flow_token, assetSendPersonalizationTooltipShown.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send PersonalizationTooltipShown";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (this.entry_point.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendPersonalizationTooltipShown(external_id=");
        sb.append(this.external_id);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
