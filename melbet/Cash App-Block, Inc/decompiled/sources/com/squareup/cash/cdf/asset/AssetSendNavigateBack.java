package com.squareup.cash.cdf.asset;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zza;
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
public final class AssetSendNavigateBack implements Event {
    public static final zza Companion = new zza(16);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean dismissed_sheet;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final ScreenName screen_name;

    public AssetSendNavigateBack(ScreenName screenName, Boolean bool, String str, String str2) {
        this.external_id = str;
        this.screen_name = screenName;
        this.dismissed_sheet = bool;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "screen_name", screenName);
        Countries.putSafe(m, "dismissed_sheet", bool);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendNavigateBack)) {
            return false;
        }
        AssetSendNavigateBack assetSendNavigateBack = (AssetSendNavigateBack) obj;
        return this.external_id.equals(assetSendNavigateBack.external_id) && this.screen_name == assetSendNavigateBack.screen_name && this.dismissed_sheet.equals(assetSendNavigateBack.dismissed_sheet) && Intrinsics.areEqual(this.flow_token, assetSendNavigateBack.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send NavigateBack";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.dismissed_sheet, (this.screen_name.hashCode() + (this.external_id.hashCode() * 31)) * 31, 31);
        String str = this.flow_token;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AssetSendNavigateBack(external_id=" + this.external_id + ", screen_name=" + this.screen_name + ", dismissed_sheet=" + this.dismissed_sheet + ", flow_token=" + this.flow_token + ")";
    }
}
