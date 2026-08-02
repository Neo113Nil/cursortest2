package com.squareup.cash.cdf.asset;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AssetSendSelectInstrument implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String auto_selected_instrument;
    public final String current_selected_instrument;
    public final Long end_timestamp;
    public final ExperienceType experience_type;
    public final String external_id;
    public final String flow_token;
    public final String instrument_type;
    public final LinkedHashMap parameters;
    public final Long start_timestamp;

    public AssetSendSelectInstrument(String str, String str2, String str3, String str4, Long l, Long l2, ExperienceType experienceType, String str5) {
        this.external_id = str;
        this.instrument_type = str2;
        this.auto_selected_instrument = str3;
        this.current_selected_instrument = str4;
        this.start_timestamp = l;
        this.end_timestamp = l2;
        this.experience_type = experienceType;
        this.flow_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "instrument_type", str2);
        Countries.putSafe(m, "auto_selected_instrument", str3);
        Countries.putSafe(m, "current_selected_instrument", str4);
        Countries.putSafe(m, "start_timestamp", l);
        Countries.putSafe(m, "end_timestamp", l2);
        Countries.putSafe(m, "experience_type", experienceType);
        Countries.putSafe(m, "flow_token", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendSelectInstrument)) {
            return false;
        }
        AssetSendSelectInstrument assetSendSelectInstrument = (AssetSendSelectInstrument) obj;
        return Intrinsics.areEqual(this.external_id, assetSendSelectInstrument.external_id) && Intrinsics.areEqual(this.instrument_type, assetSendSelectInstrument.instrument_type) && Intrinsics.areEqual(this.auto_selected_instrument, assetSendSelectInstrument.auto_selected_instrument) && Intrinsics.areEqual(this.current_selected_instrument, assetSendSelectInstrument.current_selected_instrument) && Intrinsics.areEqual(this.start_timestamp, assetSendSelectInstrument.start_timestamp) && Intrinsics.areEqual(this.end_timestamp, assetSendSelectInstrument.end_timestamp) && this.experience_type == assetSendSelectInstrument.experience_type && Intrinsics.areEqual(this.flow_token, assetSendSelectInstrument.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send SelectInstrument";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.instrument_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.auto_selected_instrument;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.current_selected_instrument;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.start_timestamp;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.end_timestamp;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ExperienceType experienceType = this.experience_type;
        int hashCode7 = (hashCode6 + (experienceType == null ? 0 : experienceType.hashCode())) * 31;
        String str5 = this.flow_token;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendSelectInstrument(external_id=", this.external_id, ", instrument_type=", this.instrument_type, ", auto_selected_instrument=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.auto_selected_instrument, ", current_selected_instrument=", this.current_selected_instrument, ", start_timestamp=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.start_timestamp, ", end_timestamp=", this.end_timestamp, ", experience_type=");
        m.append(this.experience_type);
        m.append(", flow_token=");
        m.append(this.flow_token);
        m.append(")");
        return m.toString();
    }
}
