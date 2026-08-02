package com.squareup.cash.offers.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersSearch {
    public final Long expire_at_ms;
    public final long id;
    public final long last_updated;
    public final OffersTabSearchResponse offers_search_response;

    public OffersSearch(long j, OffersTabSearchResponse offersTabSearchResponse, Long l, long j2) {
        offersTabSearchResponse.getClass();
        this.id = j;
        this.offers_search_response = offersTabSearchResponse;
        this.expire_at_ms = l;
        this.last_updated = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSearch)) {
            return false;
        }
        OffersSearch offersSearch = (OffersSearch) obj;
        return this.id == offersSearch.id && Intrinsics.areEqual(this.offers_search_response, offersSearch.offers_search_response) && Intrinsics.areEqual(this.expire_at_ms, offersSearch.expire_at_ms) && this.last_updated == offersSearch.last_updated;
    }

    public final Long getExpire_at_ms() {
        return this.expire_at_ms;
    }

    public final OffersTabSearchResponse getOffers_search_response() {
        return this.offers_search_response;
    }

    public final int hashCode() {
        int hashCode = (this.offers_search_response.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Long l = this.expire_at_ms;
        return Long.hashCode(this.last_updated) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersSearch(id=");
        sb.append(this.id);
        sb.append(", offers_search_response=");
        sb.append(this.offers_search_response);
        sb.append(", expire_at_ms=");
        sb.append(this.expire_at_ms);
        sb.append(", last_updated=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.last_updated, ")", sb);
    }
}
