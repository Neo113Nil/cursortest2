package com.squareup.cash.cdf.asset;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AssetSendSelectStablecoinNetwork implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final PaymentAssetType asset;
    public final String chain;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetSendSelectStablecoinNetwork(String str, PaymentAssetType paymentAssetType, String str2) {
        this.chain = str;
        this.asset = paymentAssetType;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "chain", str);
        Countries.putSafe(m, "asset", paymentAssetType);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendSelectStablecoinNetwork)) {
            return false;
        }
        AssetSendSelectStablecoinNetwork assetSendSelectStablecoinNetwork = (AssetSendSelectStablecoinNetwork) obj;
        return Intrinsics.areEqual(this.chain, assetSendSelectStablecoinNetwork.chain) && this.asset == assetSendSelectStablecoinNetwork.asset && Intrinsics.areEqual(this.flow_token, assetSendSelectStablecoinNetwork.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send SelectStablecoinNetwork";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.chain;
        int hashCode = (this.asset.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSendSelectStablecoinNetwork(chain=");
        sb.append(this.chain);
        sb.append(", asset=");
        sb.append(this.asset);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
