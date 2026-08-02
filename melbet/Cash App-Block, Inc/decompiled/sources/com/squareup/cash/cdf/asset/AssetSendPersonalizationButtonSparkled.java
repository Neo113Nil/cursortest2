package com.squareup.cash.cdf.asset;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class AssetSendPersonalizationButtonSparkled implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean amount_selected;
    public final EntryPoint entry_point;
    public final String external_id;
    public final String flow_token;
    public final Integer initial_impression_count;
    public final LinkedHashMap parameters;
    public final Boolean recipient_selected;
    public final PersonalizationSparkleReason sparkle_reason;

    public AssetSendPersonalizationButtonSparkled(String str, Boolean bool, Boolean bool2, String str2, Integer num, PersonalizationSparkleReason personalizationSparkleReason, EntryPoint entryPoint) {
        this.external_id = str;
        this.recipient_selected = bool;
        this.amount_selected = bool2;
        this.flow_token = str2;
        this.initial_impression_count = num;
        this.sparkle_reason = personalizationSparkleReason;
        this.entry_point = entryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "recipient_selected", bool);
        Countries.putSafe(m, "amount_selected", bool2);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "initial_impression_count", num);
        Countries.putSafe(m, "sparkle_reason", personalizationSparkleReason);
        Countries.putSafe(m, "entry_point", entryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendPersonalizationButtonSparkled)) {
            return false;
        }
        AssetSendPersonalizationButtonSparkled assetSendPersonalizationButtonSparkled = (AssetSendPersonalizationButtonSparkled) obj;
        return Intrinsics.areEqual(this.external_id, assetSendPersonalizationButtonSparkled.external_id) && this.recipient_selected.equals(assetSendPersonalizationButtonSparkled.recipient_selected) && this.amount_selected.equals(assetSendPersonalizationButtonSparkled.amount_selected) && Intrinsics.areEqual(this.flow_token, assetSendPersonalizationButtonSparkled.flow_token) && this.initial_impression_count.equals(assetSendPersonalizationButtonSparkled.initial_impression_count) && this.sparkle_reason == assetSendPersonalizationButtonSparkled.sparkle_reason && this.entry_point == assetSendPersonalizationButtonSparkled.entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send PersonalizationButtonSparkled";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.amount_selected, ViewEvent$State$EnumUnboxingLocalUtility.m(this.recipient_selected, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.flow_token;
        return this.entry_point.hashCode() + ((this.sparkle_reason.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.initial_impression_count)) * 31);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.recipient_selected, "AssetSendPersonalizationButtonSparkled(external_id=", this.external_id, ", recipient_selected=", ", amount_selected=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.amount_selected, ", flow_token=", this.flow_token, ", initial_impression_count=");
        m.append(this.initial_impression_count);
        m.append(", sparkle_reason=");
        m.append(this.sparkle_reason);
        m.append(", entry_point=");
        m.append(this.entry_point);
        m.append(")");
        return m.toString();
    }
}
