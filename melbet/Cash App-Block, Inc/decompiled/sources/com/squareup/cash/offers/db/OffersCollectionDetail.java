package com.squareup.cash.offers.db;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersCollectionDetail {
    public final OffersTabCollectionResponse offers_collection_response;
    public final String token;
    public final Long ttl_in_millis;

    public OffersCollectionDetail(String str, Long l, OffersTabCollectionResponse offersTabCollectionResponse) {
        str.getClass();
        offersTabCollectionResponse.getClass();
        this.token = str;
        this.ttl_in_millis = l;
        this.offers_collection_response = offersTabCollectionResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersCollectionDetail)) {
            return false;
        }
        OffersCollectionDetail offersCollectionDetail = (OffersCollectionDetail) obj;
        return Intrinsics.areEqual(this.token, offersCollectionDetail.token) && Intrinsics.areEqual(this.ttl_in_millis, offersCollectionDetail.ttl_in_millis) && Intrinsics.areEqual(this.offers_collection_response, offersCollectionDetail.offers_collection_response);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Long l = this.ttl_in_millis;
        return this.offers_collection_response.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.ttl_in_millis, "OffersCollectionDetail(token=", this.token, ", ttl_in_millis=", ", offers_collection_response=");
        m.append(this.offers_collection_response);
        m.append(")");
        return m.toString();
    }
}
