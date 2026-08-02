package com.squareup.cash.offers.db;

import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersHome {
    public final long id;
    public final OffersTabHomeResponse offers_home_response;
    public final Long ttl_in_millis;

    public OffersHome(long j, Long l, OffersTabHomeResponse offersTabHomeResponse) {
        offersTabHomeResponse.getClass();
        this.id = j;
        this.ttl_in_millis = l;
        this.offers_home_response = offersTabHomeResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersHome)) {
            return false;
        }
        OffersHome offersHome = (OffersHome) obj;
        return this.id == offersHome.id && Intrinsics.areEqual(this.ttl_in_millis, offersHome.ttl_in_millis) && Intrinsics.areEqual(this.offers_home_response, offersHome.offers_home_response);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Long l = this.ttl_in_millis;
        return this.offers_home_response.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "OffersHome(id=" + this.id + ", ttl_in_millis=" + this.ttl_in_millis + ", offers_home_response=" + this.offers_home_response + ")";
    }
}
