package com.squareup.cash.cdf.asset;

import com.google.mlkit.common.internal.zzb;
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
public final class AssetRequestDismissSheet implements Event {
    public static final zzb Companion = new zzb(15);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final Boolean has_share_link;
    public final LinkedHashMap parameters;
    public final ScreenName screen_name;

    public AssetRequestDismissSheet(ScreenName screenName, Boolean bool, String str, String str2) {
        this.external_id = str;
        this.screen_name = screenName;
        this.flow_token = str2;
        this.has_share_link = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "screen_name", screenName);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "has_share_link", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestDismissSheet)) {
            return false;
        }
        AssetRequestDismissSheet assetRequestDismissSheet = (AssetRequestDismissSheet) obj;
        return this.external_id.equals(assetRequestDismissSheet.external_id) && this.screen_name == assetRequestDismissSheet.screen_name && Intrinsics.areEqual(this.flow_token, assetRequestDismissSheet.flow_token) && this.has_share_link.equals(assetRequestDismissSheet.has_share_link);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request DismissSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.screen_name.hashCode() + (this.external_id.hashCode() * 31)) * 31;
        String str = this.flow_token;
        return this.has_share_link.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "AssetRequestDismissSheet(external_id=" + this.external_id + ", screen_name=" + this.screen_name + ", flow_token=" + this.flow_token + ", has_share_link=" + this.has_share_link + ")";
    }
}
