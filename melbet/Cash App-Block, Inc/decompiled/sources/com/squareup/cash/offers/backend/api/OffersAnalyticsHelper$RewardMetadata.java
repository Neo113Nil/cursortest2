package com.squareup.cash.offers.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersAnalyticsHelper$RewardMetadata {
    public final String merchantName;
    public final String merchantToken;
    public final String offerName;
    public final String offerToken;
    public final String token;

    public OffersAnalyticsHelper$RewardMetadata(String str, String str2, String str3, String str4, String str5) {
        this.token = str;
        this.offerName = str2;
        this.offerToken = str3;
        this.merchantToken = str4;
        this.merchantName = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersAnalyticsHelper$RewardMetadata)) {
            return false;
        }
        OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata = (OffersAnalyticsHelper$RewardMetadata) obj;
        return this.token.equals(offersAnalyticsHelper$RewardMetadata.token) && Intrinsics.areEqual(this.offerName, offersAnalyticsHelper$RewardMetadata.offerName) && Intrinsics.areEqual(this.offerToken, offersAnalyticsHelper$RewardMetadata.offerToken) && Intrinsics.areEqual(this.merchantToken, offersAnalyticsHelper$RewardMetadata.merchantToken) && Intrinsics.areEqual(this.merchantName, offersAnalyticsHelper$RewardMetadata.merchantName);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.offerName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantToken;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.merchantName;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RewardMetadata(token=", this.token, ", offerName=", this.offerName, ", offerToken=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.offerToken, ", merchantToken=", this.merchantToken, ", merchantName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.merchantName, ")");
    }
}
