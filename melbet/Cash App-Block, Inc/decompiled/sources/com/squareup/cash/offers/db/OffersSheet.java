package com.squareup.cash.offers.db;

import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersSheet {
    public final OfferType offer_type;
    public final OffersSheetResponse offers_sheet_response;
    public final OfferSheetKey sheet_key;
    public final Long ttl_in_millis;

    public OffersSheet(OfferSheetKey offerSheetKey, Long l, OffersSheetResponse offersSheetResponse, OfferType offerType) {
        offerSheetKey.getClass();
        offersSheetResponse.getClass();
        this.sheet_key = offerSheetKey;
        this.ttl_in_millis = l;
        this.offers_sheet_response = offersSheetResponse;
        this.offer_type = offerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSheet)) {
            return false;
        }
        OffersSheet offersSheet = (OffersSheet) obj;
        return Intrinsics.areEqual(this.sheet_key, offersSheet.sheet_key) && Intrinsics.areEqual(this.ttl_in_millis, offersSheet.ttl_in_millis) && Intrinsics.areEqual(this.offers_sheet_response, offersSheet.offers_sheet_response) && this.offer_type == offersSheet.offer_type;
    }

    public final int hashCode() {
        int hashCode = this.sheet_key.hashCode() * 31;
        Long l = this.ttl_in_millis;
        int hashCode2 = (this.offers_sheet_response.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        OfferType offerType = this.offer_type;
        return hashCode2 + (offerType != null ? offerType.hashCode() : 0);
    }

    public final String toString() {
        return "OffersSheet(sheet_key=" + this.sheet_key + ", ttl_in_millis=" + this.ttl_in_millis + ", offers_sheet_response=" + this.offers_sheet_response + ", offer_type=" + this.offer_type + ")";
    }

    /* loaded from: classes.dex */
    public final class Adapter {
        public final EnumColumnAdapter offer_typeAdapter;
        public final WireAdapter offers_sheet_responseAdapter;
        public final WireAdapter sheet_keyAdapter;

        public Adapter(WireAdapter wireAdapter, WireAdapter wireAdapter2, EnumColumnAdapter enumColumnAdapter) {
            this.sheet_keyAdapter = wireAdapter;
            this.offers_sheet_responseAdapter = wireAdapter2;
            this.offer_typeAdapter = enumColumnAdapter;
        }

        public Adapter(WireAdapter wireAdapter, EnumColumnAdapter enumColumnAdapter, WireAdapter wireAdapter2) {
            this.sheet_keyAdapter = wireAdapter;
            this.offer_typeAdapter = enumColumnAdapter;
            this.offers_sheet_responseAdapter = wireAdapter2;
        }
    }
}
