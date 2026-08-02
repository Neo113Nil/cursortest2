package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class AssetSendTapContinueOnInputNoteScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final Boolean is_continue_enabled;
    public final LinkedHashMap parameters;

    public AssetSendTapContinueOnInputNoteScreen(Boolean bool, String str, String str2) {
        this.external_id = str;
        this.is_continue_enabled = bool;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "is_continue_enabled", bool);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendTapContinueOnInputNoteScreen)) {
            return false;
        }
        AssetSendTapContinueOnInputNoteScreen assetSendTapContinueOnInputNoteScreen = (AssetSendTapContinueOnInputNoteScreen) obj;
        return this.external_id.equals(assetSendTapContinueOnInputNoteScreen.external_id) && this.is_continue_enabled.equals(assetSendTapContinueOnInputNoteScreen.is_continue_enabled) && Intrinsics.areEqual(this.flow_token, assetSendTapContinueOnInputNoteScreen.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send TapContinueOnInputNoteScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_continue_enabled, this.external_id.hashCode() * 31, 31);
        String str = this.flow_token;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Thread$State$EnumUnboxingLocalUtility.m(this.is_continue_enabled, "AssetSendTapContinueOnInputNoteScreen(external_id=", this.external_id, ", is_continue_enabled=", ", flow_token="), this.flow_token, ")");
    }
}
