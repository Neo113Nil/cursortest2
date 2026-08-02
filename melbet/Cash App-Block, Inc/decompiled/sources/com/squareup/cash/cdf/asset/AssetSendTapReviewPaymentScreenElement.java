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
public final class AssetSendTapReviewPaymentScreenElement implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ReviewPaymentElementType element_type;
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetSendTapReviewPaymentScreenElement(String str, ReviewPaymentElementType reviewPaymentElementType, String str2) {
        this.external_id = str;
        this.element_type = reviewPaymentElementType;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "element_type", reviewPaymentElementType);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendTapReviewPaymentScreenElement)) {
            return false;
        }
        AssetSendTapReviewPaymentScreenElement assetSendTapReviewPaymentScreenElement = (AssetSendTapReviewPaymentScreenElement) obj;
        return Intrinsics.areEqual(this.external_id, assetSendTapReviewPaymentScreenElement.external_id) && this.element_type == assetSendTapReviewPaymentScreenElement.element_type && Intrinsics.areEqual(this.flow_token, assetSendTapReviewPaymentScreenElement.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send TapReviewPaymentScreenElement";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (this.element_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendTapReviewPaymentScreenElement(external_id=");
        sb.append(this.external_id);
        sb.append(", element_type=");
        sb.append(this.element_type);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
