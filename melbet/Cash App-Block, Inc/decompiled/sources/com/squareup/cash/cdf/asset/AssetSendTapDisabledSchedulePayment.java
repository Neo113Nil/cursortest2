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
public final class AssetSendTapDisabledSchedulePayment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final InstrumentType instrument_type;
    public final LinkedHashMap parameters;

    public AssetSendTapDisabledSchedulePayment(String str, String str2, InstrumentType instrumentType) {
        this.external_id = str;
        this.flow_token = str2;
        this.instrument_type = instrumentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "instrument_type", instrumentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendTapDisabledSchedulePayment)) {
            return false;
        }
        AssetSendTapDisabledSchedulePayment assetSendTapDisabledSchedulePayment = (AssetSendTapDisabledSchedulePayment) obj;
        return this.external_id.equals(assetSendTapDisabledSchedulePayment.external_id) && Intrinsics.areEqual(this.flow_token, assetSendTapDisabledSchedulePayment.flow_token) && this.instrument_type == assetSendTapDisabledSchedulePayment.instrument_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send TapDisabledSchedulePayment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.external_id.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        InstrumentType instrumentType = this.instrument_type;
        return hashCode2 + (instrumentType != null ? instrumentType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendTapDisabledSchedulePayment(external_id=", this.external_id, ", flow_token=", this.flow_token, ", instrument_type=");
        m.append(this.instrument_type);
        m.append(")");
        return m.toString();
    }
}
