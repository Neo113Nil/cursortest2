package com.squareup.cash.offers.backend.real;

import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OfferType;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.cdf.offers.OffersDetailsOpenUpdateOffer;
import com.squareup.cash.cdf.offers.OffersDetailsOpenViewOfferDetails;
import com.squareup.cash.cdf.offers.OffersLockedOfferUpsellOpen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$RewardMetadata;
import com.squareup.cash.treehouse.analytics.GenericEvent;

/* loaded from: classes6.dex */
public final class RealOffersAnalyticsV2 implements Analytics {
    public final Analytics analytics;
    public final RealOffersAnalyticsHelper offersAnalyticsHelper;

    public RealOffersAnalyticsV2(Analytics analytics, RealOffersAnalyticsHelper realOffersAnalyticsHelper) {
        this.analytics = analytics;
        this.offersAnalyticsHelper = realOffersAnalyticsHelper;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        this.analytics.close();
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        this.analytics.track(event, l);
    }

    public final void trackOffersDetailsOpenUpdateOffer(String str, String str2, OfferUpdateType offerUpdateType) {
        str2.getClass();
        OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata = (OffersAnalyticsHelper$RewardMetadata) this.offersAnalyticsHelper.getRewardMetadataDict().get(str);
        String str3 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantToken : null;
        String str4 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantName : null;
        String str5 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerToken : null;
        String str6 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerName : null;
        OfferType offerType = OfferType.BOOST_CLO;
        AppLocation appLocation = AppLocation.Browser;
        this.analytics.track(new OffersDetailsOpenUpdateOffer(str3, str4, str5, str6, str2, offerUpdateType), null);
    }

    public final void trackOffersDetailsOpenViewOfferDetails(String str) {
        str.getClass();
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.offersAnalyticsHelper;
        OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata = (OffersAnalyticsHelper$RewardMetadata) realOffersAnalyticsHelper.getRewardMetadataDict().get(str);
        String str2 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantToken : null;
        String str3 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantName : null;
        String str4 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerToken : null;
        String str5 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerName : null;
        OfferType offerType = OfferType.BOOST_CLO;
        String referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
        AppLocation appLocation = AppLocation.Browser;
        this.analytics.track(new OffersDetailsOpenViewOfferDetails(str2, str3, str4, str5, referrerFlowToken), null);
    }

    public final void trackOffersLockedOfferUpsellOpen(String str) {
        str.getClass();
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.offersAnalyticsHelper;
        OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata = (OffersAnalyticsHelper$RewardMetadata) realOffersAnalyticsHelper.getRewardMetadataDict().get(str);
        String str2 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantToken : null;
        String str3 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantName : null;
        String str4 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerToken : null;
        String str5 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerName : null;
        String referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
        AppLocation appLocation = AppLocation.Browser;
        this.analytics.track(new OffersLockedOfferUpsellOpen(str2, str3, str4, str5, referrerFlowToken), null);
    }

    @Override // com.squareup.cash.integration.analytics.Analytics, com.squareup.cash.treehouse.analytics.RawAnalyticsService
    public final void track(GenericEvent genericEvent) {
        this.analytics.track(genericEvent);
    }
}
