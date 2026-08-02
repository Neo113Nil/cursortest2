package com.squareup.cash.cdf.asset;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AssetRequestViewInputNoteScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetRequestViewInputNoteScreen(String str, String str2) {
        this.external_id = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Request");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRequestViewInputNoteScreen)) {
            return false;
        }
        AssetRequestViewInputNoteScreen assetRequestViewInputNoteScreen = (AssetRequestViewInputNoteScreen) obj;
        return this.external_id.equals(assetRequestViewInputNoteScreen.external_id) && Intrinsics.areEqual(this.flow_token, assetRequestViewInputNoteScreen.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Request ViewInputNoteScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.external_id.hashCode() * 961;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AssetRequestViewInputNoteScreen(external_id=", this.external_id, ", progress_indicator_shown=null, flow_token=", this.flow_token, ")");
    }
}
