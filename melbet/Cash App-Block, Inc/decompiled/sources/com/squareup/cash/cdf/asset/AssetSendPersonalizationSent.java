package com.squareup.cash.cdf.asset;

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
public final class AssetSendPersonalizationSent implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final Boolean is_basic_payment;
    public final LinkedHashMap parameters;

    public AssetSendPersonalizationSent(String str, String str2, Boolean bool) {
        this.external_id = str;
        this.flow_token = str2;
        this.is_basic_payment = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "is_basic_payment", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendPersonalizationSent)) {
            return false;
        }
        AssetSendPersonalizationSent assetSendPersonalizationSent = (AssetSendPersonalizationSent) obj;
        return Intrinsics.areEqual(this.external_id, assetSendPersonalizationSent.external_id) && Intrinsics.areEqual(this.flow_token, assetSendPersonalizationSent.flow_token) && this.is_basic_payment.equals(assetSendPersonalizationSent.is_basic_payment);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send PersonalizationSent";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.is_basic_payment.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 29791);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendPersonalizationSent(external_id=", this.external_id, ", flow_token=", this.flow_token, ", time_started=null, time_ended=null, is_basic_payment="), this.is_basic_payment, ")");
    }
}
