package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AssetRequestNavigateBack implements Event {
    public static final zzc Companion = new zzc(15);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean dismissed_sheet;
    public final String external_id;
    public final String flow_token;
    public final Boolean has_share_link;
    public final LinkedHashMap parameters;
    public final ScreenName screen_name;

    public AssetRequestNavigateBack(String str, ScreenName screenName, Boolean bool, String str2, Boolean bool2) {
        this.external_id = str;
        this.screen_name = screenName;
        this.dismissed_sheet = bool;
        this.flow_token = str2;
        this.has_share_link = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "screen_name", screenName);
        Countries.putSafe(m, "dismissed_sheet", bool);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "has_share_link", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestNavigateBack)) {
            return false;
        }
        AssetRequestNavigateBack assetRequestNavigateBack = (AssetRequestNavigateBack) obj;
        return this.external_id.equals(assetRequestNavigateBack.external_id) && this.screen_name == assetRequestNavigateBack.screen_name && this.dismissed_sheet.equals(assetRequestNavigateBack.dismissed_sheet) && Intrinsics.areEqual(this.flow_token, assetRequestNavigateBack.flow_token) && this.has_share_link.equals(assetRequestNavigateBack.has_share_link);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request NavigateBack";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.dismissed_sheet, (this.screen_name.hashCode() + (this.external_id.hashCode() * 31)) * 31, 31);
        String str = this.flow_token;
        return this.has_share_link.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetRequestNavigateBack(external_id=");
        sb.append(this.external_id);
        sb.append(", screen_name=");
        sb.append(this.screen_name);
        sb.append(", dismissed_sheet=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.dismissed_sheet, ", flow_token=", this.flow_token, ", has_share_link=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.has_share_link, ")");
    }
}
