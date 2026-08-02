package com.squareup.cash.cdf.asset;

import com.google.mlkit.common.internal.zze;
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
public final class AssetSendDismissSheet implements Event {
    public static final zze Companion = new zze(15);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final ScreenName screen_name;

    public AssetSendDismissSheet(String str, ScreenName screenName, String str2) {
        this.external_id = str;
        this.screen_name = screenName;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "screen_name", screenName);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendDismissSheet)) {
            return false;
        }
        AssetSendDismissSheet assetSendDismissSheet = (AssetSendDismissSheet) obj;
        return this.external_id.equals(assetSendDismissSheet.external_id) && this.screen_name == assetSendDismissSheet.screen_name && Intrinsics.areEqual(this.flow_token, assetSendDismissSheet.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send DismissSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.screen_name.hashCode() + (this.external_id.hashCode() * 31)) * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendDismissSheet(external_id=");
        sb.append(this.external_id);
        sb.append(", screen_name=");
        sb.append(this.screen_name);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
