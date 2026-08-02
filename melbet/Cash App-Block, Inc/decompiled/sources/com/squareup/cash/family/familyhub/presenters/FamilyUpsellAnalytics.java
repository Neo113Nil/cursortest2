package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.util.clock.AndroidClock;

/* loaded from: classes6.dex */
public final class FamilyUpsellAnalytics {
    public final Analytics analytics;
    public final AndroidClock clock;

    public FamilyUpsellAnalytics(Analytics analytics, AndroidClock androidClock) {
        this.analytics = analytics;
        this.clock = androidClock;
    }
}
