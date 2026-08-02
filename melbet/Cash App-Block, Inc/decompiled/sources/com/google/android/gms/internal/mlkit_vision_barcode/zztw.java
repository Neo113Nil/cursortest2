package com.google.android.gms.internal.mlkit_vision_barcode;

import app.cash.local.primitives.MarketingMessageOfferDetails;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.Offer;
import java.time.DateTimeException;
import java.time.Instant;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public abstract class zztw {
    public static MarketingMessageOfferDetails create(Offer offer) {
        String str;
        String str2;
        String str3;
        String str4;
        Instant instant = null;
        if (offer == null || (str = offer.display_title) == null || (str2 = offer.validity_text) == null || (str3 = offer.coupon_code) == null || (str4 = offer.offer_token) == null) {
            return null;
        }
        Long l = offer.expires_at;
        if (l != null) {
            try {
                instant = Instant.ofEpochMilli(l.longValue());
            } catch (DateTimeException unused) {
            }
        }
        LocalImage localImage = offer.image;
        String str5 = offer.terms_text;
        return new MarketingMessageOfferDetails(localImage, str, str2, str4, str3, str5, offer.redemption_instructions, instant, str5, offer.offer_lines, offer.terms_url, offer.discount_description, offer.eligible_items, offer.status);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDependentSavingsHome.deepLinkSpecs;
    }
}
