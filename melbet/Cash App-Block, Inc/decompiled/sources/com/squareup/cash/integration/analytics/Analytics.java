package com.squareup.cash.integration.analytics;

import com.squareup.cash.cdf.Event;
import com.squareup.cash.treehouse.analytics.GenericEvent;
import com.squareup.cash.treehouse.analytics.RawAnalyticsService;

/* loaded from: classes.dex */
public interface Analytics extends RawAnalyticsService {
    void track(Event event, Long l);

    @Override // com.squareup.cash.treehouse.analytics.RawAnalyticsService
    default void track(GenericEvent genericEvent) {
        track(genericEvent, null);
    }
}
