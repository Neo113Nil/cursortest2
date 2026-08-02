package com.squareup.cash.discover.promotiondetails.backend.real;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.treehouse.analytics.GenericEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class RealPromotionDetailsAnalyticsService implements Analytics {
    public final /* synthetic */ Analytics $$delegate_0;
    public final PromotionDetails args;
    public final String flowToken;
    public final AtomicBoolean viewedContent;

    public RealPromotionDetailsAnalyticsService(PromotionDetails promotionDetails, RealUuidGenerator realUuidGenerator, Analytics analytics) {
        promotionDetails.getClass();
        this.$$delegate_0 = analytics;
        this.args = promotionDetails;
        this.flowToken = re$$ExternalSyntheticOutline0.m();
        this.viewedContent = new AtomicBoolean(false);
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        this.$$delegate_0.close();
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        this.$$delegate_0.track(event, l);
    }

    @Override // com.squareup.cash.integration.analytics.Analytics, com.squareup.cash.treehouse.analytics.RawAnalyticsService
    public final void track(GenericEvent genericEvent) {
        this.$$delegate_0.track(genericEvent);
    }
}
